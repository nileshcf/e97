package com.cloudframe.app.repository.impl;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.dao.Db2Base;
import java.sql.Types;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.repository.CrntofRepository;
import com.cloudframe.app.dao.SqlBase;
import java.sql.ResultSet;
import com.cloudframe.app.dao.CfSqlca;
import java.sql.SQLException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cloudframe.app.crntof.dto.*;

@Repository
@Qualifier("crntofRepository")
public class CrntofRepositoryImpl implements CrntofRepository {
    Logger logger = LoggerFactory.getLogger(CrntofRepositoryImpl.class);

// declare:start
    int sqlFetchCounter = 0;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:openPmaCursorCrntof
    
/**
******   DECLARE PMA_CURSOR CURSOR FOR                             
******       SELECT CRNTOFID,CRNTOFNAME FROM CRNTOF                
******       FOR UPDATE OF CRNTOFNAME                              
**/
    public ResultSet openPmaCursorCrntof(Sqlca sqlca) throws Exception {
ResultSet pmaCursorResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	pmaCursorResultSet = db2Base.startQuery(0/* SQL Sequence*/, CONSTANTS.LITERAL_CRNTOF)
    .withSql(SQLS.SQL_2084379142)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return pmaCursorResultSet;
    }
// methodEnd:openPmaCursorCrntof
// methodStart:fetchPmaCursorCrntof
    
/**
******             FETCH PMA_CURSOR INTO :CRNTOF-ID,               
******             :CRNTOF-NAME:CRNTOF-NAME-N                      
**/
    public void fetchPmaCursorCrntof(ResultSet pmaCursorResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception {
try {
	boolean hasResults = pmaCursorResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = pmaCursorResultSet.getObject(1);
 if (resultObj != null) {
   crntofTable.setCrntofId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = pmaCursorResultSet.getObject(2);
 if (resultObj != null) {
   crntofTable.setCrntofNameN( (short) 0);crntofTable.setCrntofName01( resultObj.toString().toCharArray() );
 } else {crntofTable.setCrntofNameN( (short) -1);
 }
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
 		logger.error("pmaCursorResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchPmaCursorCrntof
// methodStart:updateCrntof
    
/**
******                     UPDATE CRNTOF                           
******                     SET CRNTOFNAME = :CRNTOF-NAME           
******                     :CRNTOF-NAME-N                          
******                     WHERE CURRENT OF PMA_CURSOR             
**/
    public void updateCrntof(ResultSet pmaCursorResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception {
try {
	// UPDATE CURRENT OF
	// reset SQLCODE
	sqlca.setSqlcode(0);
  // Update the current result set

	pmaCursorResultSet.updateString("CRNTOFNAME", String.valueOf(crntofTable.getCrntofName01()));
  
  // Update the row to persist changes
  pmaCursorResultSet.updateRow();
  sqlca.setSqlerrd(2, 1);
}
catch (SQLException e) {
 fillSqlcaObject(sqlca, e);
}
 catch(Exception e) {
  throw e;
}
    }
// methodEnd:updateCrntof
// methodStart:updateCrntof1
    
/**
******                     UPDATE CRNTOF                           
******                     SET CRNTOFNAME = :CRNTOF-NAME           
******                     :CRNTOF-NAME-N                          
******                     WHERE CURRENT OF PMA_CURSOR             
**/
    public void updateCrntof1(ResultSet pmaCursorResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception {
try {
	// UPDATE CURRENT OF
	// reset SQLCODE
	sqlca.setSqlcode(0);
  // Update the current result set

	pmaCursorResultSet.updateString("CRNTOFNAME", String.valueOf(crntofTable.getCrntofName01()));
  
  // Update the row to persist changes
  pmaCursorResultSet.updateRow();
  sqlca.setSqlerrd(2, 1);
}
catch (SQLException e) {
 fillSqlcaObject(sqlca, e);
}
 catch(Exception e) {
  throw e;
}
    }
// methodEnd:updateCrntof1
// methodStart:updateCrntof2
    
/**
******                     UPDATE CRNTOF                           
******                     SET CRNTOFNAME = :CRNTOF-NAME           
******                     :CRNTOF-NAME-N                          
******                     WHERE CURRENT OF PMA_CURSOR             
**/
    public void updateCrntof2(ResultSet pmaCursorResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception {
try {
	// UPDATE CURRENT OF
	// reset SQLCODE
	sqlca.setSqlcode(0);
  // Update the current result set

	pmaCursorResultSet.updateString("CRNTOFNAME", String.valueOf(crntofTable.getCrntofName01()));
  
  // Update the row to persist changes
  pmaCursorResultSet.updateRow();
  sqlca.setSqlerrd(2, 1);
}
catch (SQLException e) {
 fillSqlcaObject(sqlca, e);
}
 catch(Exception e) {
  throw e;
}
    }
// methodEnd:updateCrntof2
// methodStart:updateCrntof3
    
/**
******                     UPDATE CRNTOF                           
******                     SET CRNTOFNAME = :CRNTOF-NAME           
******                     :CRNTOF-NAME-N                          
******                     WHERE CURRENT OF PMA_CURSOR             
**/
    public void updateCrntof3(ResultSet pmaCursorResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception {
try {
	// UPDATE CURRENT OF
	// reset SQLCODE
	sqlca.setSqlcode(0);
  // Update the current result set

	pmaCursorResultSet.updateString("CRNTOFNAME", String.valueOf(crntofTable.getCrntofName01()));
  
  // Update the row to persist changes
  pmaCursorResultSet.updateRow();
  sqlca.setSqlerrd(2, 1);
}
catch (SQLException e) {
 fillSqlcaObject(sqlca, e);
}
 catch(Exception e) {
  throw e;
}
    }
// methodEnd:updateCrntof3
// methodStart:closePmaCursorCrntof
    
/**
******     CLOSE PMA_CURSOR                                        
**/
    public void closePmaCursorCrntof(ResultSet pmaCursorResultSet, Sqlca sqlca) throws Exception {

	closeCursor(pmaCursorResultSet,sqlca);

    }
// methodEnd:closePmaCursorCrntof
// methodStart:openPmaCursor2Crntof
    
/**
******   DECLARE PMA_CURSOR2 CURSOR FOR                            
******       SELECT CRNTOFID FROM CRNTOF                           
******        WHERE CRNTOFNAME IN ( 'COBOL', 'JAVA')               
******       FOR UPDATE OF CRNTOFNAME                              
**/
    public ResultSet openPmaCursor2Crntof(Sqlca sqlca) throws Exception {
ResultSet pmaCursor2ResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	pmaCursor2ResultSet = db2Base.startQuery(1/* SQL Sequence*/, CONSTANTS.LITERAL_CRNTOF)
    .withSql(SQLS.SQL_1613240479)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return pmaCursor2ResultSet;
    }
// methodEnd:openPmaCursor2Crntof
// methodStart:fetchPmaCursor2Crntof
    
/**
******             FETCH PMA_CURSOR2 INTO :CRNTOF-ID               
**/
    public void fetchPmaCursor2Crntof(ResultSet pmaCursor2ResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception {
try {
	boolean hasResults = pmaCursor2ResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = pmaCursor2ResultSet.getObject(1);
 if (resultObj != null) {
   crntofTable.setCrntofId( resultObj.toString().toCharArray() );
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
 		logger.error("pmaCursor2ResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchPmaCursor2Crntof
// methodStart:updateCrntof4
    
/**
******                     UPDATE CRNTOF                           
******                     SET CRNTOFNAME = :CRNTOF-NAME           
******                     :CRNTOF-NAME-N                          
******                     WHERE CURRENT OF PMA_CURSOR2            
**/
    public void updateCrntof4(ResultSet pmaCursor2ResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception {
try {
	// UPDATE CURRENT OF
	// reset SQLCODE
	sqlca.setSqlcode(0);
  // Update the current result set

	pmaCursor2ResultSet.updateString("CRNTOFNAME", String.valueOf(crntofTable.getCrntofName01()));
  
  // Update the row to persist changes
  pmaCursor2ResultSet.updateRow();
  sqlca.setSqlerrd(2, 1);
}
catch (SQLException e) {
 fillSqlcaObject(sqlca, e);
}
 catch(Exception e) {
  throw e;
}
    }
// methodEnd:updateCrntof4
// methodStart:updateCrntof5
    
/**
******                     UPDATE CRNTOF                           
******                     SET CRNTOFNAME = :CRNTOF-NAME           
******                     :CRNTOF-NAME-N                          
******                     WHERE CURRENT OF PMA_CURSOR2            
**/
    public void updateCrntof5(ResultSet pmaCursor2ResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception {
try {
	// UPDATE CURRENT OF
	// reset SQLCODE
	sqlca.setSqlcode(0);
  // Update the current result set

	pmaCursor2ResultSet.updateString("CRNTOFNAME", String.valueOf(crntofTable.getCrntofName01()));
  
  // Update the row to persist changes
  pmaCursor2ResultSet.updateRow();
  sqlca.setSqlerrd(2, 1);
}
catch (SQLException e) {
 fillSqlcaObject(sqlca, e);
}
 catch(Exception e) {
  throw e;
}
    }
// methodEnd:updateCrntof5
// methodStart:updateCrntof6
    
/**
******                     UPDATE CRNTOF                           
******                     SET CRNTOFNAME = :CRNTOF-NAME           
******                     :CRNTOF-NAME-N                          
******                     WHERE CURRENT OF PMA_CURSOR2            
**/
    public void updateCrntof6(ResultSet pmaCursor2ResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception {
try {
	// UPDATE CURRENT OF
	// reset SQLCODE
	sqlca.setSqlcode(0);
  // Update the current result set

	pmaCursor2ResultSet.updateString("CRNTOFNAME", String.valueOf(crntofTable.getCrntofName01()));
  
  // Update the row to persist changes
  pmaCursor2ResultSet.updateRow();
  sqlca.setSqlerrd(2, 1);
}
catch (SQLException e) {
 fillSqlcaObject(sqlca, e);
}
 catch(Exception e) {
  throw e;
}
    }
// methodEnd:updateCrntof6
// methodStart:updateCrntof7
    
/**
******                     UPDATE CRNTOF                           
******                     SET CRNTOFNAME = :CRNTOF-NAME           
******                     :CRNTOF-NAME-N                          
******                     WHERE CURRENT OF PMA_CURSOR2            
**/
    public void updateCrntof7(ResultSet pmaCursor2ResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception {
try {
	// UPDATE CURRENT OF
	// reset SQLCODE
	sqlca.setSqlcode(0);
  // Update the current result set

	pmaCursor2ResultSet.updateString("CRNTOFNAME", String.valueOf(crntofTable.getCrntofName01()));
  
  // Update the row to persist changes
  pmaCursor2ResultSet.updateRow();
  sqlca.setSqlerrd(2, 1);
}
catch (SQLException e) {
 fillSqlcaObject(sqlca, e);
}
 catch(Exception e) {
  throw e;
}
    }
// methodEnd:updateCrntof7
// methodStart:closePmaCursor2Crntof
    
/**
******     CLOSE PMA_CURSOR2                                       
**/
    public void closePmaCursor2Crntof(ResultSet pmaCursor2ResultSet, Sqlca sqlca) throws Exception {

	closeCursor(pmaCursor2ResultSet,sqlca);

    }
// methodEnd:closePmaCursor2Crntof
// methodStart:openPmaCursor3Crntof
    
/**
******   DECLARE PMA_CURSOR3 INSENSITIVE SCROLL CURSOR FOR         
******       SELECT CRNTOFID FROM CRNTOF                           
******        WHERE CRNTOFNAME IN ( 'COBOL', 'JAVA')               
**/
    public ResultSet openPmaCursor3Crntof(Sqlca sqlca) throws Exception {
ResultSet pmaCursor3ResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	pmaCursor3ResultSet = db2Base.startQuery(2/* SQL Sequence*/, CONSTANTS.LITERAL_CRNTOF)
    .withSql(SQLS.SQL_1325886250)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return pmaCursor3ResultSet;
    }
// methodEnd:openPmaCursor3Crntof
// methodStart:fetchPmaCursor3Crntof
    
/**
******     FETCH PMA_CURSOR3                                       
******     INTO :CRNTOF-ID                                         
**/
    public void fetchPmaCursor3Crntof(ResultSet pmaCursor3ResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception {
try {
	boolean hasResults = pmaCursor3ResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = pmaCursor3ResultSet.getObject(1);
 if (resultObj != null) {
   crntofTable.setCrntofId( resultObj.toString().toCharArray() );
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
 		logger.error("pmaCursor3ResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchPmaCursor3Crntof
// methodStart:closePmaCursor3Crntof
    
/**
******     CLOSE PMA_CURSOR3                                       
**/
    public void closePmaCursor3Crntof(ResultSet pmaCursor3ResultSet, Sqlca sqlca) throws Exception {

	closeCursor(pmaCursor3ResultSet,sqlca);

    }
// methodEnd:closePmaCursor3Crntof
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

public void closeCursor(ResultSet result, Sqlca sqlca) throws Exception {
        sqlca.setSqlcode(0);
	try { 
	db2Base.closeCursor(result);
} catch(Exception e) {
	logger.info("{} close had exception", result);
}

db2Base.updateFetchCounter(sqlFetchCounter);
}

}
