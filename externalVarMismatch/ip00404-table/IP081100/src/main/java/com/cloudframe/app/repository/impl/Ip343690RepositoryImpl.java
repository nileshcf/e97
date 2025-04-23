package com.cloudframe.app.repository.impl;

import com.cloudframe.app.repository.Ip343690Repository;
import com.cloudframe.app.data.Field;
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

import com.cloudframe.app.ip343690.dto.*;

@Repository
@Qualifier("ip343690Repository")
public class Ip343690RepositoryImpl implements Ip343690Repository {
    Logger logger = LoggerFactory.getLogger(Ip343690RepositoryImpl.class);

// declare:start
    int sqlFetchCounter = 0;
static final short NOT_NULL = (short)0;
ResultSet pmaCursorResultSet = null;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:openPmaCursorIp343690
    
/**
******  DECLARE PMA_CURSOR CURSOR WITH HOLD FOR                    
******                                                             
******   SELECT                                                    
******         VRTL_ACCT_NUM,                                      
******         PRIM_ACCT_NUM                                       
******    FROM  TIPAPMA                                            
******    WHERE VRTL_ACCT_NUM  = :TIPAPMA-VRTL-ACCT-NUM AND        
******          PRIM_ACCT_NUM  = :TIPAPMA-PRIM-ACCT-NUM AND        
******          SUBSTR(:TIPAPMA-PRIM-ACCT-NUM,                     
******               LENGTH(TRIM(:TIPAPMA-PRIM-ACCT-NUM))-2,3)     
******                                  = PARTN_ID                 
******      FOR UPDATE OF PRIM_ACCT_SEQ_NUM                        
**/
    public void openPmaCursorIp343690(Tipapma tipapma, Sqlca sqlca) throws Exception {

try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	pmaCursorResultSet = db2Base.startQuery(2/* SQL Sequence*/, CONSTANTS.LITERAL_IP343690)
    .withSql(SQLS.SQL_438331198)
				.withInputs(tipapma.getTipapmaVrtlAcctNum(),tipapma.getTipapmaPrimAcctNum(),tipapma.getTipapmaPrimAcctNum(),tipapma.getTipapmaPrimAcctNum())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}


    }
// methodEnd:openPmaCursorIp343690
// methodStart:fetchPmaCursorIp343690
    
/**
******   FETCH PMA_CURSOR                                          
******     INTO                                                    
******           :TIPAPMA-VRTL-ACCT-NUM,                           
******           :TIPAPMA-PRIM-ACCT-NUM                            
**/
    public void fetchPmaCursorIp343690(Tipapma tipapma, Sqlca sqlca) throws Exception {
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
   tipapma.setTipapmaVrtlAcctNum( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = pmaCursorResultSet.getObject(2);
 if (resultObj != null) {
   tipapma.setTipapmaPrimAcctNum( resultObj.toString().toCharArray() );
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
 		logger.error("pmaCursorResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchPmaCursorIp343690
// methodStart:closePmaCursorIp343690
    
/**
******   CLOSE  PMA_CURSOR                                         
**/
    public void closePmaCursorIp343690(Sqlca sqlca) throws Exception {


    sqlca.setSqlcode(0);
	db2Base.updateFetchCounter(sqlFetchCounter);
    }
// methodEnd:closePmaCursorIp343690
// methodStart:updateTipapma1
    
/**
******     UPDATE TIPAPMA                                          
******       SET PRIM_ACCT_SEQ_NUM = :TIPAPMA-PRIM-ACCT-SEQ-NUM    
******                               :TIPAPMA-PRIM-ACCT-SEQ-NUM-N  
******       WHERE CURRENT OF PMA_CURSOR                           
**/
    public void updateTipapma1(Itipapma itipapma, Tipapma tipapma, Sqlca sqlca) throws Exception {
try {
	// UPDATE CURRENT OF
	// reset SQLCODE
	sqlca.setSqlcode(0);
  // Update the current result set

	pmaCursorResultSet.updateString("PRIM_ACCT_SEQ_NUM", String.valueOf(tipapma.getTipapmaPrimAcctSeqNum()));
  
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
// methodEnd:updateTipapma1
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
