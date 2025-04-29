package com.cloudframe.app.repository.impl;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.dao.Db2Base;
import java.sql.Types;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.dao.SqlBase;
import java.sql.ResultSet;
import com.cloudframe.app.dao.CfSqlca;
import com.cloudframe.app.repository.DlcrntofRepository;
import java.sql.SQLException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cloudframe.app.dlcrntof.dto.*;

@Repository
@Qualifier("dlcrntofRepository")
public class DlcrntofRepositoryImpl implements DlcrntofRepository {
    Logger logger = LoggerFactory.getLogger(DlcrntofRepositoryImpl.class);

// declare:start
    int sqlFetchCounter = 0;
ResultSet secCursorResultSet = null;
static final short NOT_NULL = (short)0;
ResultSet resultSet = null;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:insertTbdemsec
    
/**
******    INSERT INTO TBDELSEC                                     
******       SELECT * FROM TBDEMSEC                                
**/
    public void insertTbdemsec(Sqlca sqlca) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(3/* SQL Sequence*/,CONSTANTS.LITERAL_DLCRNTOF)
    .withSql(SQLS.SQL_1420525278)
    .executeUpdate();
    
    sqlca.setSqlerrd(2,count);
   }
    catch (SQLException e) {
            fillSqlcaObject(sqlca, e);
    }
    catch(Exception e) {
    throw e;
    }
    }
// methodEnd:insertTbdemsec
// methodStart:openSecCursorDlcrntof
    
/**
******   DECLARE SEC_CURSOR CURSOR WITH HOLD FOR                   
******       SELECT                                                
******            ISIN                                             
******          , SEDOL                                            
******          , RIC                                              
******          , INTLKEY                                          
******          , COMPANY                                          
******          , COUNTRY                                          
******       FROM TBDELSEC                                         
******       WHERE ISIN <> :ISIN                                   
**/
    public void openSecCursorDlcrntof(Sqlca sqlca, Dcltbdelsec dcltbdelsec) throws Exception {

try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	secCursorResultSet = db2Base.startQuery(1/* SQL Sequence*/, CONSTANTS.LITERAL_DLCRNTOF)
    .withSql(SQLS.SQL_468136674)
				.withInputs(dcltbdelsec.getIsin())
				.withDataTypes(Types.CHAR)
				.withUpdatableCursor(true) /* ResultSet.CONCUR_UPDATABLE */
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}


    }
// methodEnd:openSecCursorDlcrntof
// methodStart:fetchSecCursorDlcrntof
    
/**
******        FETCH SEC_CURSOR                                     
******        INTO :ISIN                                           
******           , :SEDOL                                          
******           , :RIC                                            
******           , :INTLKEY                                        
******           , :COMPANY                                        
******           , :COUNTRY                                        
**/
    public void fetchSecCursorDlcrntof(Sqlca sqlca, Dcltbdelsec dcltbdelsec) throws Exception {
try {
	boolean hasResults = secCursorResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = secCursorResultSet.getObject(1);
 if (resultObj != null) {
   dcltbdelsec.setIsin( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = secCursorResultSet.getString(2);
 if (resultObjString != null) {
   dcltbdelsec.setSedol( db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObjString = secCursorResultSet.getString(3);
 if (resultObjString != null) {
   dcltbdelsec.setRic( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = secCursorResultSet.getString(4);
 if (resultObjString != null) {
   dcltbdelsec.setIntlkey( db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = secCursorResultSet.getObject(5);
 if (resultObj != null) {
   dcltbdelsec.setCompany( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = secCursorResultSet.getObject(6);
 if (resultObj != null) {
   dcltbdelsec.setCountry( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
		sqlFetchCounter++;
	} else {
		sqlca.setSqlcode(100); // No More rows
	}
}


catch (SQLException e) {
    if(e.getMessage().contains("result set is closed")) {
		fill501SqlcaObject(sqlca); // cursor closed
	}
	else {
 		logger.error("secCursorResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchSecCursorDlcrntof
// methodStart:deleteTbdelsec
    
/**
******              DELETE FROM TBDELSEC                           
******                 WHERE CURRENT OF SEC_CURSOR                 
**/
    public void deleteTbdelsec(Sqlca sqlca) throws Exception {
try {
	// DELETE CURRENT OF CURSOR
	// reset SQLCODE
	sqlca.setSqlcode(0);
    secCursorResultSet.deleteRow();
	sqlca.setSqlerrd(2,1);
}
catch (SQLException e) {
			fillSqlcaObject(sqlca, e);
}
catch(Exception e) {
	throw e;
}
    }
// methodEnd:deleteTbdelsec
// methodStart:deleteTbdelsec1
    
/**
******              DELETE FROM TBDELSEC                           
******                 WHERE CURRENT OF SEC_CURSOR                 
**/
    public void deleteTbdelsec1(Sqlca sqlca) throws Exception {
try {
	// DELETE CURRENT OF CURSOR
	// reset SQLCODE
	sqlca.setSqlcode(0);
    secCursorResultSet.deleteRow();
	sqlca.setSqlerrd(2,1);
}
catch (SQLException e) {
			fillSqlcaObject(sqlca, e);
}
catch(Exception e) {
	throw e;
}
    }
// methodEnd:deleteTbdelsec1
// methodStart:closeSecCursorDlcrntof
    
/**
******     CLOSE SEC_CURSOR                                        
**/
    public void closeSecCursorDlcrntof(Sqlca sqlca) throws Exception {


    sqlca.setSqlcode(0);
	db2Base.updateFetchCounter(sqlFetchCounter);
    }
// methodEnd:closeSecCursorDlcrntof
// methodStart:selectTbdelsec
    
/**
******    SELECT COUNT(*)                                          
******      INTO :WS-SECNT                                         
******      FROM TBDELSEC                                          
**/
    public void selectTbdelsec(Sqlca sqlca, Work work) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(10/* SQL Sequence*/, CONSTANTS.LITERAL_DLCRNTOF)
.withSql(SQLS.SQL_1349830992)
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
   work.setSecnt((short) ((Integer) resultObj ).intValue());
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
// methodEnd:selectTbdelsec
// methodStart:deleteTbdelsec2
    
/**
******   DELETE FROM TBDELSEC                                      
******     WHERE ISIN NOT LIKE 'IG%'                               
**/
    public void deleteTbdelsec2(Sqlca sqlca) throws Exception {
try {
	// DELETE 
	// reset SQLCODE
	sqlca.setSqlcode(0);
	// execute SQLJ query
	int count = db2Base.startQuery(11/* SQL Sequence*/,CONSTANTS.LITERAL_DLCRNTOF)
.withSql(SQLS.SQL_1901011832)
		.executeUpdate(); 
	if(count == 0) {
	sqlca.setSqlcode(100);
}

	sqlca.setSqlerrd(2,count);
}
catch (SQLException e) {
			fillSqlcaObject(sqlca, e);
}
catch(Exception e) {
	throw e;
}
    }
// methodEnd:deleteTbdelsec2
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
