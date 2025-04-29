package com.cloudframe.app.repository.impl;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.repository.Varchar1Repository;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.dao.Db2Base;
import java.sql.Types;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.dao.SqlBase;
import java.sql.ResultSet;
import com.cloudframe.app.dao.CfSqlca;
import java.sql.SQLException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cloudframe.app.varchar1.dto.*;

@Repository
@Qualifier("varchar1Repository")
public class Varchar1RepositoryImpl implements Varchar1Repository {
    Logger logger = LoggerFactory.getLogger(Varchar1RepositoryImpl.class);

// declare:start
    static final short NOT_NULL = (short)0;
ResultSet resultSet = null;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:selectVchar1
    
/**
******     SELECT ID                                               
******     , LAST_NAME                                             
******     , NICK_NAME                                             
******     INTO                                                    
******     :VCHAR1-ID                                              
******     , :VCHAR1-LAST-NAME                                     
******     , :VCHAR1-NICK-NAME                                     
******     FROM VCHAR1                                             
******     WHERE FIRST_NAME = :VCHAR1-FIRST-NAME                   
******     FETCH FIRST 1 ROW ONLY                                  
**/
    public void selectVchar1(Sqlca sqlca, Vchar1Table vchar1Table) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(0/* SQL Sequence*/, CONSTANTS.LITERAL_VARCHAR1)
.withSql(SQLS.SQL_773874897)
				.withInputs(vchar1Table.getVchar1FirstName())
				.withDataTypes(Types.VARCHAR)
	.queryForList();
	// check sqlca.getSqlcode() or errors
	sqlca.setSqlcode(Db2Base.fillSQLCode(resultSet));
	if (sqlca.getSqlcode() != 100) {
	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = resultSet.getObject(1);
 if (resultObj != null) {
   vchar1Table.setVchar1Id((short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(2);
 if (resultObj != null) {
   vchar1Table.setVchar1LastName( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(3);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   vchar1Table.setVchar1NickName( value,0, value.length,2,value.length);
   vchar1Table.getVchar1NickName().setVchar1NickNameLen((short) value.length);
} else {sqlca.setSqlcode(-305); }
		if (resultSet.next()) sqlca.setSqlcode(-811);
	}else{
	sqlca.setSqlerrp("DSNXRFF".toCharArray());
int[] arr = {-110, 0, 0, -1, 0, 0};
for (int i = 0; i < arr.length; i++) {
sqlca.setSqlerrd(i, arr[i]);
}
sqlca.getSqlext().setSqlstate("02000".toCharArray());
	}
}
catch (SQLException e) {
			fillSqlcaObject(sqlca, e);
}
catch(Exception e) {
	throw e;
}
    }
// methodEnd:selectVchar1
// methodStart:selectVchar11
    
/**
******     SELECT ID                                               
******     INTO                                                    
******     :VCHAR1-ID                                              
******     FROM VCHAR1                                             
******     WHERE FIRST_NAME = :VCHAR1-FIRST-NAME                   
******     AND LAST_NAME = :VCHAR1-LAST-NAME                       
******     AND NICK_NAME = :VCHAR1-NICK-NAME                       
******     FETCH FIRST 1 ROW ONLY                                  
**/
    public void selectVchar11(Sqlca sqlca, Vchar1Table vchar1Table) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(1/* SQL Sequence*/, CONSTANTS.LITERAL_VARCHAR1)
.withSql(SQLS.SQL_289593277)
				.withInputs(vchar1Table.getVchar1FirstName(),vchar1Table.getVchar1LastName(),vchar1Table.getVchar1NickName())
				.withDataTypes(Types.VARCHAR,Types.CHAR,Types.VARCHAR)
	.queryForList();
	// check sqlca.getSqlcode() or errors
	sqlca.setSqlcode(Db2Base.fillSQLCode(resultSet));
	if (sqlca.getSqlcode() != 100) {
	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = resultSet.getObject(1);
 if (resultObj != null) {
   vchar1Table.setVchar1Id((short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
		if (resultSet.next()) sqlca.setSqlcode(-811);
	}else{
	sqlca.setSqlerrp("DSNXRFF".toCharArray());
int[] arr = {-110, 0, 0, -1, 0, 0};
for (int i = 0; i < arr.length; i++) {
sqlca.setSqlerrd(i, arr[i]);
}
sqlca.getSqlext().setSqlstate("02000".toCharArray());
	}
}
catch (SQLException e) {
			fillSqlcaObject(sqlca, e);
}
catch(Exception e) {
	throw e;
}
    }
// methodEnd:selectVchar11
// methodStart:selectVchar12
    
/**
******     SELECT ID                                               
******     , FIRST_NAME                                            
******     , NICK_NAME                                             
******     INTO                                                    
******     :VCHAR1-ID                                              
******     , :VCHAR1-FIRST-NAME                                    
******     , :VCHAR1-NICK-NAME                                     
******     FROM VCHAR1                                             
******     WHERE LAST_NAME = :VCHAR1-LAST-NAME                     
******     FETCH FIRST 1 ROW ONLY                                  
**/
    public void selectVchar12(Sqlca sqlca, Vchar1Table vchar1Table) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(2/* SQL Sequence*/, CONSTANTS.LITERAL_VARCHAR1)
.withSql(SQLS.SQL_1987938977)
				.withInputs(vchar1Table.getVchar1LastName())
				.withDataTypes(Types.CHAR)
	.queryForList();
	// check sqlca.getSqlcode() or errors
	sqlca.setSqlcode(Db2Base.fillSQLCode(resultSet));
	if (sqlca.getSqlcode() != 100) {
	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = resultSet.getObject(1);
 if (resultObj != null) {
   vchar1Table.setVchar1Id((short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(2);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   vchar1Table.setVchar1FirstName( value,0, value.length,2,value.length);
   vchar1Table.getVchar1FirstName().setVchar1FirstNameLen((short) value.length);
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(3);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   vchar1Table.setVchar1NickName( value,0, value.length,2,value.length);
   vchar1Table.getVchar1NickName().setVchar1NickNameLen((short) value.length);
} else {sqlca.setSqlcode(-305); }
		if (resultSet.next()) sqlca.setSqlcode(-811);
	}else{
	sqlca.setSqlerrp("DSNXRFF".toCharArray());
int[] arr = {-110, 0, 0, -1, 0, 0};
for (int i = 0; i < arr.length; i++) {
sqlca.setSqlerrd(i, arr[i]);
}
sqlca.getSqlext().setSqlstate("02000".toCharArray());
	}
}
catch (SQLException e) {
			fillSqlcaObject(sqlca, e);
}
catch(Exception e) {
	throw e;
}
    }
// methodEnd:selectVchar12
// methodStart:fillSqlcaObject
    public void fillSqlcaObject(Sqlca sqlca, SQLException e) {
            CfSqlca db2Sqlca = Db2Base.getCfSqlca(e);
            if (db2Sqlca != null) {
                sqlca.setSqlcaid("SQLCA  ".toCharArray());
                sqlca.setSqlcabc(136);
                sqlca.setSqlcode(db2Sqlca.getSqlCode());
                sqlca.setSqlerrp(db2Sqlca.getSqlErrp().toCharArray());
                if(db2Sqlca.getSqlErrmc() != null) {
                     sqlca.getSqlerrm().setSqlerrml(db2Sqlca.getSqlErrmc().length());
                     char ch = 65533;
                     char[] errmc = db2Sqlca.getSqlErrmc().toCharArray();
                      for(int i =0 ;i< errmc.length;i++){
                         if(errmc[i]==';'){
                              errmc[i] = ch;
                         }
                      }
                     sqlca.getSqlerrm().setSqlerrmc(errmc);
                }
                int[] sqlErrd = db2Sqlca.getSqlErrd();
                for (int i = 0; i < sqlErrd.length; i++) {
                    sqlca.setSqlerrd(i, sqlErrd[i]);
                }
                char[] sqlWarn = db2Sqlca.getSqlWarn();
                for (int i = 0; i < sqlWarn.length; i++) {
                    switch (i) {
                        case 0:
                            sqlca.getSqlwarn().setSqlwarn0(new char[]{sqlWarn[0]});
                            break;
                        case 1:
                            sqlca.getSqlwarn().setSqlwarn1(new char[]{sqlWarn[1]});
                            break;
                        case 2:
                            sqlca.getSqlwarn().setSqlwarn2(new char[]{sqlWarn[2]});
                            break;
                        case 3:
                            sqlca.getSqlwarn().setSqlwarn3(new char[]{sqlWarn[3]});
                            break;
                        case 4:
                            sqlca.getSqlwarn().setSqlwarn4(new char[]{sqlWarn[4]});
                            break;
                        case 5:
                            sqlca.getSqlwarn().setSqlwarn5(new char[]{sqlWarn[5]});
                            break;
                        case 6:
                            sqlca.getSqlwarn().setSqlwarn6(new char[]{sqlWarn[6]});
                            break;
                        case 7:
                            sqlca.getSqlwarn().setSqlwarn7(new char[]{sqlWarn[7]});
                            break;
                        case 8:
                            sqlca.getSqlext().setSqlwarn8(new char[]{sqlWarn[8]});
                            break;
                        case 9:
                            sqlca.getSqlext().setSqlwarn9(new char[]{sqlWarn[9]});
                            break;
                        case 10:
                            sqlca.getSqlext().setSqlwarna(new char[]{sqlWarn[10]});
                            break;
                    }
                }
                sqlca.getSqlext().setSqlstate(db2Sqlca.getSqlState().toCharArray());
        } else {
            sqlca.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
        }
    }
// methodEnd:fillSqlcaObject



    public void fill501SqlcaObject(Sqlca sqlca) {
                sqlca.setSqlcode(-501);
                sqlca.setSqlerrp("DSNXERT".toCharArray());
                sqlca.setSqlerrd(0,-240);
    	  		sqlca.setSqlerrd(1,0);
		    	sqlca.setSqlerrd(2,0);
		    	sqlca.setSqlerrd(3,-1);
		    	sqlca.setSqlerrd(4,0);
		    	sqlca.setSqlerrd(5,0);
			    sqlca.getSqlext().setSqlstate("24501".toCharArray());
    }


}
