package com.cloudframe.app.repository.impl;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.repository.Db2set3Repository;
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

import com.cloudframe.app.db2set3.dto.*;

@Repository
@Qualifier("db2set3Repository")
public class Db2set3RepositoryImpl implements Db2set3Repository {
    Logger logger = LoggerFactory.getLogger(Db2set3RepositoryImpl.class);

// declare:start
    static final short NOT_NULL = (short)0;
ResultSet resultSet = null;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:select
    
/**
******    SET :WS-FIRST-DAY-MNTH=                                  
******        ADD_MONTHS(DATE(:WS-INPUT-DATE), +1),                
******        :WS-EFF-END-DATE-CALC                                
******        = LAST_DAY(DATE(:WS-EFF-END-DATE-BUILD) - 1 MONTH)   
******                                                             
**/
    public void select(Vars vars, Sqlca sqlca) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(0/* SQL Sequence*/, CONSTANTS.LITERAL_DB2SET3)
.withSql(SQLS.SQL_1076458777)
				.withInputs(vars.getInputDate(),vars.getEffEndDateBuild())
				.withDataTypes(Types.CHAR,Types.CHAR)
	.queryForList();
	// check sqlca.getSqlcode() or errors
	sqlca.setSqlcode(Db2Base.fillSQLCode(resultSet));
	if (sqlca.getSqlcode() != 100) {
	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObjString = resultSet.getString(1);
 if (resultObjString != null) {
   vars.setFirstDayMnth( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(2);
 if (resultObjString != null) {
   vars.setEffEndDateCalc( resultObjString.toCharArray() );
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
// methodEnd:select
// methodStart:select1
    
/**
******    SET ( :WS-FIRST-DAY-MNTH,                                
******          :WS-EFF-END-DATE-CALC,                             
******          :WS-LAST-DATE)                                     
******        =                                                    
******        (  ADD_MONTHS(DATE(:WS-INPUT-DATE), -2),             
******           LAST_DAY(DATE(:WS-EFF-END-DATE-BUILD) + 2 MONTH), 
******           ADD_MONTHS(LAST_DAY(CURRENT_DATE), 1))            
******                                                             
**/
    public void select1(Vars vars, Sqlca sqlca) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(1/* SQL Sequence*/, CONSTANTS.LITERAL_DB2SET3)
.withSql(SQLS.SQL_681022108)
				.withInputs(vars.getInputDate(),vars.getEffEndDateBuild())
				.withDataTypes(Types.CHAR,Types.CHAR)
	.queryForList();
	// check sqlca.getSqlcode() or errors
	sqlca.setSqlcode(Db2Base.fillSQLCode(resultSet));
	if (sqlca.getSqlcode() != 100) {
	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObjString = resultSet.getString(1);
 if (resultObjString != null) {
   vars.setFirstDayMnth( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(2);
 if (resultObjString != null) {
   vars.setEffEndDateCalc( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(3);
 if (resultObjString != null) {
   vars.setLastDate( resultObjString.toCharArray() );
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
// methodEnd:select1
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
