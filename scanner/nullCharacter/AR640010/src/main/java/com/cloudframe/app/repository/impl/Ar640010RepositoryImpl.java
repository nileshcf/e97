package com.cloudframe.app.repository.impl;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.dao.Db2Base;
import java.sql.Types;
import com.cloudframe.app.common.CONSTANTS;
import java.math.BigDecimal;
import com.cloudframe.app.dao.SqlBase;
import java.sql.ResultSet;
import com.cloudframe.app.dao.CfSqlca;
import com.cloudframe.app.repository.Ar640010Repository;
import java.sql.SQLException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cloudframe.app.ar640010.dto.*;

@Repository
@Qualifier("ar640010Repository")
public class Ar640010RepositoryImpl implements Ar640010Repository {
    Logger logger = LoggerFactory.getLogger(Ar640010RepositoryImpl.class);

// declare:start
    ResultSet fxsRetrieveRowResultSet = null;
int sqlFetchCounter = 0;
ResultSet fxaResetRowResultSet = null;
static final short NOT_NULL = (short)0;
ResultSet efpBulkRowResultSet = null;
ResultSet fxsFiforetrRowResultSet = null;
ResultSet resultSet = null;
ResultSet fxsInstallRowResultSet = null;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:selectTaraxtk
    
/**
******         SELECT                                              
******               TASK_WORK_PARM_TXT                            
******           INTO                                              
******               :TARAXTK-TASK-WORK-PARM-TXT                   
******               :TARAXTK-TASK-WORK-PARM-TXT-N                 
******           FROM TARAXTK                                      
******          WHERE TARAXTK.APP_NAM = :600-PROGRAM-ID            
**/
    public void selectTaraxtk(Taraxtk taraxtk, Sqlca sqlca, Itaraxtk itaraxtk, Messages600 messages600) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(23/* SQL Sequence*/, CONSTANTS.LITERAL_AR640010)
.withSql(SQLS.SQL_949704940)
				.withInputs(messages600.getMsgPrefix600().getProgramId600())
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
      value = resultObj.toString().toCharArray();  
   taraxtk.setTaraxtkTaskWorkParmTxt( value,0, value.length,2,value.length);
   taraxtk.getTaraxtkTaskWorkParmTxt().setTaraxtkTaskWorkParmTxtLen((short) value.length);
if (itaraxtk.getTaraxtkTaskWorkParmTxtN() != 0) itaraxtk.setTaraxtkTaskWorkParmTxtN( (short) 0);
 } else itaraxtk.setTaraxtkTaskWorkParmTxtN((short) -1 );
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
// methodEnd:selectTaraxtk
// methodStart:openFxsFiforetrRowAr640010
    
/**
******EXEC SQL DECLARE FXS_FIFORETR_ROW CURSOR FOR                 
******    SELECT MC_MNFRM_FILE_NAM                                 
******         , CYCL_NUM                                          
******         , BUS_PRTNR_ID                                      
******         , ENDPT_ID                                          
******         , XFER_MTHD_CD                                      
******         , AVAIL_TS                                          
******         , STAT_CD                                           
******         , SND_RCV_PRMSN_CD                                  
******         , MCIBDIO_PARM_TXT                                  
******         , PRTY_NUM                                          
******         , LST_UPDT_TS                                       
******         , NXT_MNFRM_FILE_NAM                                
******         , NXT_CYCL_NUM                                      
******         , NXT_BUS_PRTNR_ID                                  
******         , NXT_ENDPT_ID                                      
******         , NXT_AVAIL_TS                                      
******         , APPL_EXIT_NAM                                     
******         , APPL_PRCSSNG_DT                                   
******         , TRGT_LOC_ENT_NAM                                  
******         , TRGT_TASK_NAM                                     
******         , TRGT_TASK_ID                                      
******         , TRGT_TASK_USR                                     
******         , TRGT_TASK_STRT_TS                                 
******         , TRGT_TASK_STOP_TS                                 
******         , APPL_TKN_NAM                                      
******      FROM TARAFXS                                           
******     WHERE BULK_ID        = :TARAFXS-BULK-ID                 
******       AND STAT_CD        = 'R'                              
******       AND CYCL_NUM BETWEEN :810-CYCL-NUM-LO                 
******                        AND :810-CYCL-NUM-HI                 
******     ORDER BY AVAIL_TS ASC                                   
******     SKIP LOCKED DATA                                        
******     OPTIMIZE FOR 1 ROWS                                     
**/
    public void openFxsFiforetrRowAr640010(ReqWorkAreas810 reqWorkAreas810, Tarafxs tarafxs, Sqlca sqlca) throws Exception {

try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	fxsFiforetrRowResultSet = db2Base.startQuery(7/* SQL Sequence*/, CONSTANTS.LITERAL_AR640010)
    .withSql(SQLS.SQL_1976872396)
				.withInputs(tarafxs.getTarafxsBulkId(),reqWorkAreas810.getCyclNumRange810().getCyclNumLo810(),reqWorkAreas810.getCyclNumRange810().getCyclNumHi810())
				.withDataTypes(Types.CHAR,Types.SMALLINT,Types.SMALLINT)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}


    }
// methodEnd:openFxsFiforetrRowAr640010
// methodStart:openFxsRetrieveRowAr640010
    
/**
******EXEC SQL DECLARE FXS_RETRIEVE_ROW CURSOR FOR                 
******    SELECT MC_MNFRM_FILE_NAM                                 
******         , CYCL_NUM                                          
******         , BUS_PRTNR_ID                                      
******         , ENDPT_ID                                          
******         , XFER_MTHD_CD                                      
******         , AVAIL_TS                                          
******         , STAT_CD                                           
******         , SND_RCV_PRMSN_CD                                  
******         , MCIBDIO_PARM_TXT                                  
******         , PRTY_NUM                                          
******         , LST_UPDT_TS                                       
******         , NXT_MNFRM_FILE_NAM                                
******         , NXT_CYCL_NUM                                      
******         , NXT_BUS_PRTNR_ID                                  
******         , NXT_ENDPT_ID                                      
******         , NXT_AVAIL_TS                                      
******         , APPL_EXIT_NAM                                     
******         , APPL_PRCSSNG_DT                                   
******         , TRGT_LOC_ENT_NAM                                  
******         , TRGT_TASK_NAM                                     
******         , TRGT_TASK_ID                                      
******         , TRGT_TASK_USR                                     
******         , TRGT_TASK_STRT_TS                                 
******         , TRGT_TASK_STOP_TS                                 
******         , APPL_TKN_NAM                                      
******      FROM TARAFXS                                           
******     WHERE BULK_ID        = :TARAFXS-BULK-ID                 
******       AND STAT_CD        = 'R'                              
******       AND CYCL_NUM BETWEEN :810-CYCL-NUM-LO                 
******                        AND :810-CYCL-NUM-HI                 
******     ORDER BY PRTY_NUM DESC                                  
******            , AVAIL_TS ASC                                   
******     SKIP LOCKED DATA                                        
******     OPTIMIZE FOR 1 ROWS                                     
**/
    public void openFxsRetrieveRowAr640010(ReqWorkAreas810 reqWorkAreas810, Tarafxs tarafxs, Sqlca sqlca) throws Exception {

try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	fxsRetrieveRowResultSet = db2Base.startQuery(6/* SQL Sequence*/, CONSTANTS.LITERAL_AR640010)
    .withSql(SQLS.SQL_1566476291)
				.withInputs(tarafxs.getTarafxsBulkId(),reqWorkAreas810.getCyclNumRange810().getCyclNumLo810(),reqWorkAreas810.getCyclNumRange810().getCyclNumHi810())
				.withDataTypes(Types.CHAR,Types.SMALLINT,Types.SMALLINT)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}


    }
// methodEnd:openFxsRetrieveRowAr640010
// methodStart:fetchFxsFiforetrRowAr640010
    
/**
******    EXEC SQL FETCH FXS_FIFORETR_ROW                          
******              INTO :TARAFXS-MC-MNFRM-FILE-NAM                
******                 , :TARAFXS-CYCL-NUM                         
******                 , :TARAFXS-BUS-PRTNR-ID                     
******                 , :TARAFXS-ENDPT-ID                         
******                 , :TARAFXS-XFER-MTHD-CD                     
******                 , :TARAFXS-AVAIL-TS                         
******                 , :TARAFXS-STAT-CD                          
******                 , :TARAFXS-SND-RCV-PRMSN-CD                 
******                 , :TARAFXS-MCIBDIO-PARM-TXT                 
******                 , :TARAFXS-PRTY-NUM                         
******                 , :TARAFXS-LST-UPDT-TS                      
******                 , :TARAFXS-NXT-MNFRM-FILE-NAM               
******                   :TARAFXS-NXT-MNFRM-FILE-NAM-N             
******                 , :TARAFXS-NXT-CYCL-NUM                     
******                   :TARAFXS-NXT-CYCL-NUM-N                   
******                 , :TARAFXS-NXT-BUS-PRTNR-ID                 
******                   :TARAFXS-NXT-BUS-PRTNR-ID-N               
******                 , :TARAFXS-NXT-ENDPT-ID                     
******                   :TARAFXS-NXT-ENDPT-ID-N                   
******                 , :TARAFXS-NXT-AVAIL-TS                     
******                   :TARAFXS-NXT-AVAIL-TS-N                   
******                 , :TARAFXS-APPL-EXIT-NAM                    
******                   :TARAFXS-APPL-EXIT-NAM-N                  
******                 , :TARAFXS-APPL-PRCSSNG-DT                  
******                   :TARAFXS-APPL-PRCSSNG-DT-N                
******                 , :TARAFXS-TRGT-LOC-ENT-NAM                 
******                   :TARAFXS-TRGT-LOC-ENT-NAM-N               
******                 , :TARAFXS-TRGT-TASK-NAM                    
******                   :TARAFXS-TRGT-TASK-NAM-N                  
******                 , :TARAFXS-TRGT-TASK-ID                     
******                   :TARAFXS-TRGT-TASK-ID-N                   
******                 , :TARAFXS-TRGT-TASK-USR                    
******                   :TARAFXS-TRGT-TASK-USR-N                  
******                 , :TARAFXS-TRGT-TASK-STRT-TS                
******                   :TARAFXS-TRGT-TASK-STRT-TS-N              
******                 , :TARAFXS-TRGT-TASK-STOP-TS                
******                   :TARAFXS-TRGT-TASK-STOP-TS-N              
******                 , :TARAFXS-APPL-TKN-NAM                     
******                   :TARAFXS-APPL-TKN-NAM-N                   
**/
    public void fetchFxsFiforetrRowAr640010(Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception {
try {
	boolean hasResults = fxsFiforetrRowResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = fxsFiforetrRowResultSet.getObject(1);
 if (resultObj != null) {
   tarafxs.setTarafxsMcMnfrmFileNam( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsFiforetrRowResultSet.getObject(2);
 if (resultObj != null) {
   tarafxs.setTarafxsCyclNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsFiforetrRowResultSet.getObject(3);
 if (resultObj != null) {
   tarafxs.setTarafxsBusPrtnrId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsFiforetrRowResultSet.getObject(4);
 if (resultObj != null) {
   tarafxs.setTarafxsEndptId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsFiforetrRowResultSet.getObject(5);
 if (resultObj != null) {
   tarafxs.setTarafxsXferMthdCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = fxsFiforetrRowResultSet.getString(6);
 if (resultObjString != null) {
   tarafxs.setTarafxsAvailTs( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsFiforetrRowResultSet.getObject(7);
 if (resultObj != null) {
   tarafxs.setTarafxsStatCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsFiforetrRowResultSet.getObject(8);
 if (resultObj != null) {
   tarafxs.setTarafxsSndRcvPrmsnCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsFiforetrRowResultSet.getObject(9);
 if (resultObj != null) {
   tarafxs.setTarafxsMcibdioParmTxt( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsFiforetrRowResultSet.getObject(10);
 if (resultObj != null) {
   tarafxs.setTarafxsPrtyNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = fxsFiforetrRowResultSet.getString(11);
 if (resultObjString != null) {
   tarafxs.setTarafxsLstUpdtTs( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsFiforetrRowResultSet.getObject(12);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtMnfrmFileNamN( (short) 0);tarafxs.setTarafxsNxtMnfrmFileNam( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsNxtMnfrmFileNamN( (short) -1);
 }
 resultObj = fxsFiforetrRowResultSet.getObject(13);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtCyclNumN( (short) 0);tarafxs.setTarafxsNxtCyclNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
 } else {itarafxs.setTarafxsNxtCyclNumN( (short) -1);
 }
 resultObj = fxsFiforetrRowResultSet.getObject(14);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtBusPrtnrIdN( (short) 0);tarafxs.setTarafxsNxtBusPrtnrId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsNxtBusPrtnrIdN( (short) -1);
 }
 resultObj = fxsFiforetrRowResultSet.getObject(15);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtEndptIdN( (short) 0);tarafxs.setTarafxsNxtEndptId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsNxtEndptIdN( (short) -1);
 }
 resultObjString = fxsFiforetrRowResultSet.getString(16);
 if (resultObjString != null) {
   itarafxs.setTarafxsNxtAvailTsN( (short) 0);tarafxs.setTarafxsNxtAvailTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsNxtAvailTsN( (short) -1);
 }
 resultObjString = fxsFiforetrRowResultSet.getString(17);
 if (resultObjString != null) {
   itarafxs.setTarafxsApplExitNamN( (short) 0);tarafxs.setTarafxsApplExitNam( db2Base.formatISOTime(resultObjString) );
 } else {itarafxs.setTarafxsApplExitNamN( (short) -1);
 }
 resultObjString = fxsFiforetrRowResultSet.getString(18);
 if (resultObjString != null) {
   itarafxs.setTarafxsApplPrcssngDtN( (short) 0);tarafxs.setTarafxsApplPrcssngDt( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsApplPrcssngDtN( (short) -1);
 }
 resultObjString = fxsFiforetrRowResultSet.getString(19);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtLocEntNamN( (short) 0);tarafxs.setTarafxsTrgtLocEntNam( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtLocEntNamN( (short) -1);
 }
 resultObjString = fxsFiforetrRowResultSet.getString(20);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtTaskNamN( (short) 0);tarafxs.setTarafxsTrgtTaskNam( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskNamN( (short) -1);
 }
 resultObj = fxsFiforetrRowResultSet.getObject(21);
 if (resultObj != null) {
   itarafxs.setTarafxsTrgtTaskIdN( (short) 0);tarafxs.setTarafxsTrgtTaskId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskIdN( (short) -1);
 }
 resultObj = fxsFiforetrRowResultSet.getObject(22);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   tarafxs.setTarafxsTrgtTaskUsr( value,0, value.length,2,value.length);
   tarafxs.getTarafxsTrgtTaskUsr().setTarafxsTrgtTaskUsrLen((short) value.length);
if (itarafxs.getTarafxsTrgtTaskUsrN() != 0) itarafxs.setTarafxsTrgtTaskUsrN( (short) 0);
 } else itarafxs.setTarafxsTrgtTaskUsrN((short) -1 );
 resultObjString = fxsFiforetrRowResultSet.getString(23);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtTaskStrtTsN( (short) 0);tarafxs.setTarafxsTrgtTaskStrtTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskStrtTsN( (short) -1);
 }
 resultObjString = fxsFiforetrRowResultSet.getString(24);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtTaskStopTsN( (short) 0);tarafxs.setTarafxsTrgtTaskStopTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskStopTsN( (short) -1);
 }
 resultObj = fxsFiforetrRowResultSet.getObject(25);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   tarafxs.setTarafxsApplTknNam( value,0, value.length,2,value.length);
   tarafxs.getTarafxsApplTknNam().setTarafxsApplTknNamLen((short) value.length);
if (itarafxs.getTarafxsApplTknNamN() != 0) itarafxs.setTarafxsApplTknNamN( (short) 0);
 } else itarafxs.setTarafxsApplTknNamN((short) -1 );
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
 		logger.error("fxsFiforetrRowResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchFxsFiforetrRowAr640010
// methodStart:fetchFxsRetrieveRowAr640010
    
/**
******    EXEC SQL FETCH FXS_RETRIEVE_ROW                          
******              INTO :TARAFXS-MC-MNFRM-FILE-NAM                
******                 , :TARAFXS-CYCL-NUM                         
******                 , :TARAFXS-BUS-PRTNR-ID                     
******                 , :TARAFXS-ENDPT-ID                         
******                 , :TARAFXS-XFER-MTHD-CD                     
******                 , :TARAFXS-AVAIL-TS                         
******                 , :TARAFXS-STAT-CD                          
******                 , :TARAFXS-SND-RCV-PRMSN-CD                 
******                 , :TARAFXS-MCIBDIO-PARM-TXT                 
******                 , :TARAFXS-PRTY-NUM                         
******                 , :TARAFXS-LST-UPDT-TS                      
******                 , :TARAFXS-NXT-MNFRM-FILE-NAM               
******                   :TARAFXS-NXT-MNFRM-FILE-NAM-N             
******                 , :TARAFXS-NXT-CYCL-NUM                     
******                   :TARAFXS-NXT-CYCL-NUM-N                   
******                 , :TARAFXS-NXT-BUS-PRTNR-ID                 
******                   :TARAFXS-NXT-BUS-PRTNR-ID-N               
******                 , :TARAFXS-NXT-ENDPT-ID                     
******                   :TARAFXS-NXT-ENDPT-ID-N                   
******                 , :TARAFXS-NXT-AVAIL-TS                     
******                   :TARAFXS-NXT-AVAIL-TS-N                   
******                 , :TARAFXS-APPL-EXIT-NAM                    
******                   :TARAFXS-APPL-EXIT-NAM-N                  
******                 , :TARAFXS-APPL-PRCSSNG-DT                  
******                   :TARAFXS-APPL-PRCSSNG-DT-N                
******                 , :TARAFXS-TRGT-LOC-ENT-NAM                 
******                   :TARAFXS-TRGT-LOC-ENT-NAM-N               
******                 , :TARAFXS-TRGT-TASK-NAM                    
******                   :TARAFXS-TRGT-TASK-NAM-N                  
******                 , :TARAFXS-TRGT-TASK-ID                     
******                   :TARAFXS-TRGT-TASK-ID-N                   
******                 , :TARAFXS-TRGT-TASK-USR                    
******                   :TARAFXS-TRGT-TASK-USR-N                  
******                 , :TARAFXS-TRGT-TASK-STRT-TS                
******                   :TARAFXS-TRGT-TASK-STRT-TS-N              
******                 , :TARAFXS-TRGT-TASK-STOP-TS                
******                   :TARAFXS-TRGT-TASK-STOP-TS-N              
******                 , :TARAFXS-APPL-TKN-NAM                     
******                   :TARAFXS-APPL-TKN-NAM-N                   
**/
    public void fetchFxsRetrieveRowAr640010(Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception {
try {
	boolean hasResults = fxsRetrieveRowResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = fxsRetrieveRowResultSet.getObject(1);
 if (resultObj != null) {
   tarafxs.setTarafxsMcMnfrmFileNam( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsRetrieveRowResultSet.getObject(2);
 if (resultObj != null) {
   tarafxs.setTarafxsCyclNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsRetrieveRowResultSet.getObject(3);
 if (resultObj != null) {
   tarafxs.setTarafxsBusPrtnrId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsRetrieveRowResultSet.getObject(4);
 if (resultObj != null) {
   tarafxs.setTarafxsEndptId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsRetrieveRowResultSet.getObject(5);
 if (resultObj != null) {
   tarafxs.setTarafxsXferMthdCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = fxsRetrieveRowResultSet.getString(6);
 if (resultObjString != null) {
   tarafxs.setTarafxsAvailTs( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsRetrieveRowResultSet.getObject(7);
 if (resultObj != null) {
   tarafxs.setTarafxsStatCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsRetrieveRowResultSet.getObject(8);
 if (resultObj != null) {
   tarafxs.setTarafxsSndRcvPrmsnCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsRetrieveRowResultSet.getObject(9);
 if (resultObj != null) {
   tarafxs.setTarafxsMcibdioParmTxt( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsRetrieveRowResultSet.getObject(10);
 if (resultObj != null) {
   tarafxs.setTarafxsPrtyNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = fxsRetrieveRowResultSet.getString(11);
 if (resultObjString != null) {
   tarafxs.setTarafxsLstUpdtTs( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsRetrieveRowResultSet.getObject(12);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtMnfrmFileNamN( (short) 0);tarafxs.setTarafxsNxtMnfrmFileNam( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsNxtMnfrmFileNamN( (short) -1);
 }
 resultObj = fxsRetrieveRowResultSet.getObject(13);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtCyclNumN( (short) 0);tarafxs.setTarafxsNxtCyclNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
 } else {itarafxs.setTarafxsNxtCyclNumN( (short) -1);
 }
 resultObj = fxsRetrieveRowResultSet.getObject(14);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtBusPrtnrIdN( (short) 0);tarafxs.setTarafxsNxtBusPrtnrId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsNxtBusPrtnrIdN( (short) -1);
 }
 resultObj = fxsRetrieveRowResultSet.getObject(15);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtEndptIdN( (short) 0);tarafxs.setTarafxsNxtEndptId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsNxtEndptIdN( (short) -1);
 }
 resultObjString = fxsRetrieveRowResultSet.getString(16);
 if (resultObjString != null) {
   itarafxs.setTarafxsNxtAvailTsN( (short) 0);tarafxs.setTarafxsNxtAvailTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsNxtAvailTsN( (short) -1);
 }
 resultObjString = fxsRetrieveRowResultSet.getString(17);
 if (resultObjString != null) {
   itarafxs.setTarafxsApplExitNamN( (short) 0);tarafxs.setTarafxsApplExitNam( db2Base.formatISOTime(resultObjString) );
 } else {itarafxs.setTarafxsApplExitNamN( (short) -1);
 }
 resultObjString = fxsRetrieveRowResultSet.getString(18);
 if (resultObjString != null) {
   itarafxs.setTarafxsApplPrcssngDtN( (short) 0);tarafxs.setTarafxsApplPrcssngDt( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsApplPrcssngDtN( (short) -1);
 }
 resultObjString = fxsRetrieveRowResultSet.getString(19);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtLocEntNamN( (short) 0);tarafxs.setTarafxsTrgtLocEntNam( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtLocEntNamN( (short) -1);
 }
 resultObjString = fxsRetrieveRowResultSet.getString(20);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtTaskNamN( (short) 0);tarafxs.setTarafxsTrgtTaskNam( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskNamN( (short) -1);
 }
 resultObj = fxsRetrieveRowResultSet.getObject(21);
 if (resultObj != null) {
   itarafxs.setTarafxsTrgtTaskIdN( (short) 0);tarafxs.setTarafxsTrgtTaskId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskIdN( (short) -1);
 }
 resultObj = fxsRetrieveRowResultSet.getObject(22);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   tarafxs.setTarafxsTrgtTaskUsr( value,0, value.length,2,value.length);
   tarafxs.getTarafxsTrgtTaskUsr().setTarafxsTrgtTaskUsrLen((short) value.length);
if (itarafxs.getTarafxsTrgtTaskUsrN() != 0) itarafxs.setTarafxsTrgtTaskUsrN( (short) 0);
 } else itarafxs.setTarafxsTrgtTaskUsrN((short) -1 );
 resultObjString = fxsRetrieveRowResultSet.getString(23);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtTaskStrtTsN( (short) 0);tarafxs.setTarafxsTrgtTaskStrtTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskStrtTsN( (short) -1);
 }
 resultObjString = fxsRetrieveRowResultSet.getString(24);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtTaskStopTsN( (short) 0);tarafxs.setTarafxsTrgtTaskStopTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskStopTsN( (short) -1);
 }
 resultObj = fxsRetrieveRowResultSet.getObject(25);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   tarafxs.setTarafxsApplTknNam( value,0, value.length,2,value.length);
   tarafxs.getTarafxsApplTknNam().setTarafxsApplTknNamLen((short) value.length);
if (itarafxs.getTarafxsApplTknNamN() != 0) itarafxs.setTarafxsApplTknNamN( (short) 0);
 } else itarafxs.setTarafxsApplTknNamN((short) -1 );
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
 		logger.error("fxsRetrieveRowResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchFxsRetrieveRowAr640010
// methodStart:closeFxsFiforetrRowAr640010
    
/**
******            CLOSE FXS_FIFORETR_ROW                           
**/
    public void closeFxsFiforetrRowAr640010(Sqlca sqlca) throws Exception {


    sqlca.setSqlcode(0);
	db2Base.updateFetchCounter(sqlFetchCounter);
    }
// methodEnd:closeFxsFiforetrRowAr640010
// methodStart:closeFxsRetrieveRowAr640010
    
/**
******            CLOSE FXS_RETRIEVE_ROW                           
**/
    public void closeFxsRetrieveRowAr640010(Sqlca sqlca) throws Exception {


    sqlca.setSqlcode(0);
	db2Base.updateFetchCounter(sqlFetchCounter);
    }
// methodEnd:closeFxsRetrieveRowAr640010
// methodStart:selectTarafxs1
    
/**
******         SELECT BUS_PRTNR_ID                                 
******              , XFER_MTHD_CD                                 
******              , AVAIL_TS                                     
******              , STAT_CD                                      
******              , SND_RCV_PRMSN_CD                             
******              , MCIBDIO_PARM_TXT                             
******              , PRTY_NUM                                     
******              , LST_UPDT_TS                                  
******              , NXT_MNFRM_FILE_NAM                           
******              , NXT_CYCL_NUM                                 
******              , NXT_BUS_PRTNR_ID                             
******              , NXT_ENDPT_ID                                 
******              , NXT_AVAIL_TS                                 
******              , APPL_EXIT_NAM                                
******              , APPL_PRCSSNG_DT                              
******              , TRGT_LOC_ENT_NAM                             
******              , TRGT_TASK_NAM                                
******              , TRGT_TASK_ID                                 
******              , TRGT_TASK_USR                                
******              , TRGT_TASK_STRT_TS                            
******              , TRGT_TASK_STOP_TS                            
******              , APPL_TKN_NAM                                 
******                                                             
******          INTO :TARAFXS-BUS-PRTNR-ID                         
******             , :TARAFXS-XFER-MTHD-CD                         
******             , :TARAFXS-AVAIL-TS                             
******             , :TARAFXS-STAT-CD                              
******             , :TARAFXS-SND-RCV-PRMSN-CD                     
******             , :TARAFXS-MCIBDIO-PARM-TXT                     
******             , :TARAFXS-PRTY-NUM                             
******             , :TARAFXS-LST-UPDT-TS                          
******             , :TARAFXS-NXT-MNFRM-FILE-NAM                   
******               :TARAFXS-NXT-MNFRM-FILE-NAM-N                 
******             , :TARAFXS-NXT-CYCL-NUM                         
******               :TARAFXS-NXT-CYCL-NUM-N                       
******             , :TARAFXS-NXT-BUS-PRTNR-ID                     
******               :TARAFXS-NXT-BUS-PRTNR-ID-N                   
******             , :TARAFXS-NXT-ENDPT-ID                         
******               :TARAFXS-NXT-ENDPT-ID-N                       
******             , :TARAFXS-NXT-AVAIL-TS                         
******               :TARAFXS-NXT-AVAIL-TS-N                       
******             , :TARAFXS-APPL-EXIT-NAM                        
******               :TARAFXS-APPL-EXIT-NAM-N                      
******             , :TARAFXS-APPL-PRCSSNG-DT                      
******               :TARAFXS-APPL-PRCSSNG-DT-N                    
******             , :TARAFXS-TRGT-LOC-ENT-NAM                     
******               :TARAFXS-TRGT-LOC-ENT-NAM-N                   
******             , :TARAFXS-TRGT-TASK-NAM                        
******               :TARAFXS-TRGT-TASK-NAM-N                      
******             , :TARAFXS-TRGT-TASK-ID                         
******               :TARAFXS-TRGT-TASK-ID-N                       
******             , :TARAFXS-TRGT-TASK-USR                        
******               :TARAFXS-TRGT-TASK-USR-N                      
******             , :TARAFXS-TRGT-TASK-STRT-TS                    
******               :TARAFXS-TRGT-TASK-STRT-TS-N                  
******             , :TARAFXS-TRGT-TASK-STOP-TS                    
******               :TARAFXS-TRGT-TASK-STOP-TS-N                  
******             , :TARAFXS-APPL-TKN-NAM                         
******               :TARAFXS-APPL-TKN-NAM-N                       
******                                                             
******     FROM TARAFXS                                            
******                                                             
******    WHERE MC_MNFRM_FILE_NAM = :TARAFXS-MC-MNFRM-FILE-NAM     
******      AND CYCL_NUM          = :TARAFXS-CYCL-NUM              
******      AND ENDPT_ID          = :TARAFXS-ENDPT-ID              
******      AND BULK_ID           = :TARAFXS-BULK-ID               
******                                                             
**/
    public void selectTarafxs1(Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(30/* SQL Sequence*/, CONSTANTS.LITERAL_AR640010)
.withSql(SQLS.SQL_997471185)
				.withInputs(tarafxs.getTarafxsMcMnfrmFileNam(),tarafxs.getTarafxsCyclNum(),tarafxs.getTarafxsEndptId(),tarafxs.getTarafxsBulkId())
				.withDataTypes(Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR)
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
   tarafxs.setTarafxsBusPrtnrId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(2);
 if (resultObj != null) {
   tarafxs.setTarafxsXferMthdCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(3);
 if (resultObjString != null) {
   tarafxs.setTarafxsAvailTs( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(4);
 if (resultObj != null) {
   tarafxs.setTarafxsStatCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(5);
 if (resultObj != null) {
   tarafxs.setTarafxsSndRcvPrmsnCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(6);
 if (resultObj != null) {
   tarafxs.setTarafxsMcibdioParmTxt( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(7);
 if (resultObj != null) {
   tarafxs.setTarafxsPrtyNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(8);
 if (resultObjString != null) {
   tarafxs.setTarafxsLstUpdtTs( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(9);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtMnfrmFileNamN( (short) 0);tarafxs.setTarafxsNxtMnfrmFileNam( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsNxtMnfrmFileNamN( (short) -1);
 }
 resultObj = resultSet.getObject(10);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtCyclNumN( (short) 0);tarafxs.setTarafxsNxtCyclNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
 } else {itarafxs.setTarafxsNxtCyclNumN( (short) -1);
 }
 resultObj = resultSet.getObject(11);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtBusPrtnrIdN( (short) 0);tarafxs.setTarafxsNxtBusPrtnrId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsNxtBusPrtnrIdN( (short) -1);
 }
 resultObj = resultSet.getObject(12);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtEndptIdN( (short) 0);tarafxs.setTarafxsNxtEndptId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsNxtEndptIdN( (short) -1);
 }
 resultObjString = resultSet.getString(13);
 if (resultObjString != null) {
   itarafxs.setTarafxsNxtAvailTsN( (short) 0);tarafxs.setTarafxsNxtAvailTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsNxtAvailTsN( (short) -1);
 }
 resultObjString = resultSet.getString(14);
 if (resultObjString != null) {
   itarafxs.setTarafxsApplExitNamN( (short) 0);tarafxs.setTarafxsApplExitNam( db2Base.formatISOTime(resultObjString) );
 } else {itarafxs.setTarafxsApplExitNamN( (short) -1);
 }
 resultObjString = resultSet.getString(15);
 if (resultObjString != null) {
   itarafxs.setTarafxsApplPrcssngDtN( (short) 0);tarafxs.setTarafxsApplPrcssngDt( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsApplPrcssngDtN( (short) -1);
 }
 resultObjString = resultSet.getString(16);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtLocEntNamN( (short) 0);tarafxs.setTarafxsTrgtLocEntNam( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtLocEntNamN( (short) -1);
 }
 resultObjString = resultSet.getString(17);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtTaskNamN( (short) 0);tarafxs.setTarafxsTrgtTaskNam( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskNamN( (short) -1);
 }
 resultObj = resultSet.getObject(18);
 if (resultObj != null) {
   itarafxs.setTarafxsTrgtTaskIdN( (short) 0);tarafxs.setTarafxsTrgtTaskId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskIdN( (short) -1);
 }
 resultObj = resultSet.getObject(19);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   tarafxs.setTarafxsTrgtTaskUsr( value,0, value.length,2,value.length);
   tarafxs.getTarafxsTrgtTaskUsr().setTarafxsTrgtTaskUsrLen((short) value.length);
if (itarafxs.getTarafxsTrgtTaskUsrN() != 0) itarafxs.setTarafxsTrgtTaskUsrN( (short) 0);
 } else itarafxs.setTarafxsTrgtTaskUsrN((short) -1 );
 resultObjString = resultSet.getString(20);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtTaskStrtTsN( (short) 0);tarafxs.setTarafxsTrgtTaskStrtTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskStrtTsN( (short) -1);
 }
 resultObjString = resultSet.getString(21);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtTaskStopTsN( (short) 0);tarafxs.setTarafxsTrgtTaskStopTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskStopTsN( (short) -1);
 }
 resultObj = resultSet.getObject(22);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   tarafxs.setTarafxsApplTknNam( value,0, value.length,2,value.length);
   tarafxs.getTarafxsApplTknNam().setTarafxsApplTknNamLen((short) value.length);
if (itarafxs.getTarafxsApplTknNamN() != 0) itarafxs.setTarafxsApplTknNamN( (short) 0);
 } else itarafxs.setTarafxsApplTknNamN((short) -1 );
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
// methodEnd:selectTarafxs1
// methodStart:selectTarafxs12
    
/**
******    EXEC SQL SELECT BUS_PRTNR_ID                             
******                  , XFER_MTHD_CD                             
******                  , AVAIL_TS                                 
******                  , STAT_CD                                  
******                  , SND_RCV_PRMSN_CD                         
******                  , MCIBDIO_PARM_TXT                         
******                  , PRTY_NUM                                 
******                  , ARCH_LOC_TXT                             
******                  , SVR_FILE_STAT_CD                         
******                  , LST_STAT_TS                              
******                  , XFER_FILE_SZ_NUM                         
******                  , TMS_XFERD_CNT                            
******                  , XFER_REC_CNT                             
******                  , XFER_RQST_TS                             
******                  , XFER_STRT_TS                             
******                  , XFER_STOP_TS                             
******                  , XFER_RDY_TS                              
******                  , XFER_COND_CD                             
******                  , XFER_STAT_TXT                            
******                  , XFER_PRCSS_ID                            
******                  , ORG_XFER_PRCS_ID                         
******                  , TRGR_COND_CD                             
******                  , TRGR_STAT_TXT                            
******                  , ORG_LOC_NAM                              
******                  , LST_UPDT_USER_ID                         
******                  , LST_UPDT_TS                              
******                  , TRGR_ACT_NAM                             
******                  , PRV_MNFRM_FILE_NAM                       
******                  , PRV_CYCL_NUM                             
******                  , PRV_BUS_PRTNR_ID                         
******                  , PRV_ENDPT_ID                             
******                  , PRV_AVAIL_TS                             
******                  , NXT_MNFRM_FILE_NAM                       
******                  , NXT_CYCL_NUM                             
******                  , NXT_BUS_PRTNR_ID                         
******                  , NXT_ENDPT_ID                             
******                  , NXT_AVAIL_TS                             
******                  , APPL_EXIT_JOB_NAM                        
******                  , APPL_EXIT_TS                             
******                  , CS_MIP_ID                                
******                  , RM_MIP_ID                                
******                  , APPL_EXIT_NAM                            
******                  , TAPE_CMPLTD_SW                           
******                  , TAPE_MULT_VOL_SW                         
******                  , APPL_PRCSSNG_DT                          
******                  , TRANSITIONAL_DSN                         
******                  , SOURCE_HUB_ID                            
******                  , OWNING_HUB_ID                            
******                  , STAT_REF_ID                              
******                  , SRC_LOC_ENT_NAM                          
******                  , SRC_TASK_NAM                             
******                  , SRC_TASK_ID                              
******                  , SRC_TASK_USR                             
******                  , SRC_TASK_STRT_TS                         
******                  , SRC_TASK_STOP_TS                         
******                  , TRGT_LOC_ENT_NAM                         
******                  , TRGT_TASK_NAM                            
******                  , TRGT_TASK_ID                             
******                  , TRGT_TASK_USR                            
******                  , TRGT_TASK_STRT_TS                        
******                  , TRGT_TASK_STOP_TS                        
******                  , APPL_TKN_NAM                             
******                                                             
******    INTO :TARAFXS-BUS-PRTNR-ID                               
******       , :TARAFXS-XFER-MTHD-CD                               
******       , :TARAFXS-AVAIL-TS                                   
******       , :TARAFXS-STAT-CD                                    
******       , :TARAFXS-SND-RCV-PRMSN-CD                           
******       , :TARAFXS-MCIBDIO-PARM-TXT                           
******       , :TARAFXS-PRTY-NUM                                   
******       , :TARAFXS-ARCH-LOC-TXT                               
******         :TARAFXS-ARCH-LOC-TXT-N                             
******       , :TARAFXS-SVR-FILE-STAT-CD                           
******       , :TARAFXS-LST-STAT-TS                                
******         :TARAFXS-LST-STAT-TS-N                              
******       , :TARAFXS-XFER-FILE-SZ-NUM                           
******       , :TARAFXS-TMS-XFERD-CNT                              
******       , :TARAFXS-XFER-REC-CNT                               
******       , :TARAFXS-XFER-RQST-TS                               
******         :TARAFXS-XFER-RQST-TS-N                             
******       , :TARAFXS-XFER-STRT-TS                               
******         :TARAFXS-XFER-STRT-TS-N                             
******       , :TARAFXS-XFER-STOP-TS                               
******         :TARAFXS-XFER-STOP-TS-N                             
******       , :TARAFXS-XFER-RDY-TS                                
******         :TARAFXS-XFER-RDY-TS-N                              
******       , :TARAFXS-XFER-COND-CD                               
******         :TARAFXS-XFER-COND-CD-N                             
******       , :TARAFXS-XFER-STAT-TXT                              
******         :TARAFXS-XFER-STAT-TXT-N                            
******       , :TARAFXS-XFER-PRCSS-ID                              
******         :TARAFXS-XFER-PRCSS-ID-N                            
******       , :TARAFXS-ORG-XFER-PRCS-ID                           
******         :TARAFXS-ORG-XFER-PRCS-ID-N                         
******       , :TARAFXS-TRGR-COND-CD                               
******         :TARAFXS-TRGR-COND-CD-N                             
******       , :TARAFXS-TRGR-STAT-TXT                              
******         :TARAFXS-TRGR-STAT-TXT-N                            
******       , :TARAFXS-ORG-LOC-NAM                                
******         :TARAFXS-ORG-LOC-NAM-N                              
******       , :TARAFXS-LST-UPDT-USER-ID                           
******       , :TARAFXS-LST-UPDT-TS                                
******       , :TARAFXS-TRGR-ACT-NAM                               
******         :TARAFXS-TRGR-ACT-NAM-N                             
******       , :TARAFXS-PRV-MNFRM-FILE-NAM                         
******         :TARAFXS-PRV-MNFRM-FILE-NAM-N                       
******       , :TARAFXS-PRV-CYCL-NUM                               
******         :TARAFXS-PRV-CYCL-NUM-N                             
******       , :TARAFXS-PRV-BUS-PRTNR-ID                           
******         :TARAFXS-PRV-BUS-PRTNR-ID-N                         
******       , :TARAFXS-PRV-ENDPT-ID                               
******         :TARAFXS-PRV-ENDPT-ID-N                             
******       , :TARAFXS-PRV-AVAIL-TS                               
******         :TARAFXS-PRV-AVAIL-TS-N                             
******       , :TARAFXS-NXT-MNFRM-FILE-NAM                         
******         :TARAFXS-NXT-MNFRM-FILE-NAM-N                       
******       , :TARAFXS-NXT-CYCL-NUM                               
******         :TARAFXS-NXT-CYCL-NUM-N                             
******       , :TARAFXS-NXT-BUS-PRTNR-ID                           
******         :TARAFXS-NXT-BUS-PRTNR-ID-N                         
******       , :TARAFXS-NXT-ENDPT-ID                               
******         :TARAFXS-NXT-ENDPT-ID-N                             
******       , :TARAFXS-NXT-AVAIL-TS                               
******         :TARAFXS-NXT-AVAIL-TS-N                             
******       , :TARAFXS-APPL-EXIT-JOB-NAM                          
******         :TARAFXS-APPL-EXIT-JOB-NAM-N                        
******       , :TARAFXS-APPL-EXIT-TS                               
******         :TARAFXS-APPL-EXIT-TS-N                             
******       , :TARAFXS-CS-MIP-ID                                  
******         :TARAFXS-CS-MIP-ID-N                                
******       , :TARAFXS-RM-MIP-ID                                  
******         :TARAFXS-RM-MIP-ID-N                                
******       , :TARAFXS-APPL-EXIT-NAM                              
******         :TARAFXS-APPL-EXIT-NAM-N                            
******       , :TARAFXS-TAPE-CMPLTD-SW                             
******         :TARAFXS-TAPE-CMPLTD-SW-N                           
******       , :TARAFXS-TAPE-MULT-VOL-SW                           
******         :TARAFXS-TAPE-MULT-VOL-SW-N                         
******       , :TARAFXS-APPL-PRCSSNG-DT                            
******         :TARAFXS-APPL-PRCSSNG-DT-N                          
******       , :TARAFXS-TRANSITIONAL-DSN                           
******         :TARAFXS-TRANSITIONAL-DSN-N                         
******       , :TARAFXS-SOURCE-HUB-ID                              
******         :TARAFXS-SOURCE-HUB-ID-N                            
******       , :TARAFXS-OWNING-HUB-ID                              
******         :TARAFXS-OWNING-HUB-ID-N                            
******       , :TARAFXS-STAT-REF-ID                                
******         :TARAFXS-STAT-REF-ID-N                              
******       , :TARAFXS-SRC-LOC-ENT-NAM                            
******         :TARAFXS-SRC-LOC-ENT-NAM-N                          
******       , :TARAFXS-SRC-TASK-NAM                               
******         :TARAFXS-SRC-TASK-NAM-N                             
******       , :TARAFXS-SRC-TASK-ID                                
******         :TARAFXS-SRC-TASK-ID-N                              
******       , :TARAFXS-SRC-TASK-USR                               
******         :TARAFXS-SRC-TASK-USR-N                             
******       , :TARAFXS-SRC-TASK-STRT-TS                           
******         :TARAFXS-SRC-TASK-STRT-TS-N                         
******       , :TARAFXS-SRC-TASK-STOP-TS                           
******         :TARAFXS-SRC-TASK-STOP-TS-N                         
******       , :TARAFXS-TRGT-LOC-ENT-NAM                           
******         :TARAFXS-TRGT-LOC-ENT-NAM-N                         
******       , :TARAFXS-TRGT-TASK-NAM                              
******         :TARAFXS-TRGT-TASK-NAM-N                            
******       , :TARAFXS-TRGT-TASK-ID                               
******         :TARAFXS-TRGT-TASK-ID-N                             
******       , :TARAFXS-TRGT-TASK-USR                              
******         :TARAFXS-TRGT-TASK-USR-N                            
******       , :TARAFXS-TRGT-TASK-STRT-TS                          
******         :TARAFXS-TRGT-TASK-STRT-TS-N                        
******       , :TARAFXS-TRGT-TASK-STOP-TS                          
******         :TARAFXS-TRGT-TASK-STOP-TS-N                        
******       , :TARAFXS-APPL-TKN-NAM                               
******         :TARAFXS-APPL-TKN-NAM-N                             
******                                                             
******    FROM  TARAFXS                                            
******    WHERE MC_MNFRM_FILE_NAM = :TARAFXS-MC-MNFRM-FILE-NAM     
******      AND CYCL_NUM          = :TARAFXS-CYCL-NUM              
******      AND ENDPT_ID          = :TARAFXS-ENDPT-ID              
******      AND BULK_ID           = :TARAFXS-BULK-ID               
**/
    public void selectTarafxs12(Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(31/* SQL Sequence*/, CONSTANTS.LITERAL_AR640010)
.withSql(SQLS.SQL_987606325)
				.withInputs(tarafxs.getTarafxsMcMnfrmFileNam(),tarafxs.getTarafxsCyclNum(),tarafxs.getTarafxsEndptId(),tarafxs.getTarafxsBulkId())
				.withDataTypes(Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR)
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
   tarafxs.setTarafxsBusPrtnrId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(2);
 if (resultObj != null) {
   tarafxs.setTarafxsXferMthdCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(3);
 if (resultObjString != null) {
   tarafxs.setTarafxsAvailTs( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(4);
 if (resultObj != null) {
   tarafxs.setTarafxsStatCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(5);
 if (resultObj != null) {
   tarafxs.setTarafxsSndRcvPrmsnCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(6);
 if (resultObj != null) {
   tarafxs.setTarafxsMcibdioParmTxt( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(7);
 if (resultObj != null) {
   tarafxs.setTarafxsPrtyNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(8);
 if (resultObj != null) {
   itarafxs.setTarafxsArchLocTxtN( (short) 0);tarafxs.setTarafxsArchLocTxt( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsArchLocTxtN( (short) -1);
 }
 resultObj = resultSet.getObject(9);
 if (resultObj != null) {
   tarafxs.setTarafxsSvrFileStatCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(10);
 if (resultObjString != null) {
   itarafxs.setTarafxsLstStatTsN( (short) 0);tarafxs.setTarafxsLstStatTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsLstStatTsN( (short) -1);
 }
 resultObj = resultSet.getObject(11);
 if (resultObj != null) {
   tarafxs.setTarafxsXferFileSzNum( (Db2Base.castToBigDecimal(resultObj)).longValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(12);
 if (resultObj != null) {
   tarafxs.setTarafxsTmsXferdCnt( (Db2Base.castToBigDecimal(resultObj)).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(13);
 if (resultObj != null) {
   tarafxs.setTarafxsXferRecCnt( (Db2Base.castToBigDecimal(resultObj)).longValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(14);
 if (resultObjString != null) {
   itarafxs.setTarafxsXferRqstTsN( (short) 0);tarafxs.setTarafxsXferRqstTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsXferRqstTsN( (short) -1);
 }
 resultObjString = resultSet.getString(15);
 if (resultObjString != null) {
   itarafxs.setTarafxsXferStrtTsN( (short) 0);tarafxs.setTarafxsXferStrtTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsXferStrtTsN( (short) -1);
 }
 resultObjString = resultSet.getString(16);
 if (resultObjString != null) {
   itarafxs.setTarafxsXferStopTsN( (short) 0);tarafxs.setTarafxsXferStopTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsXferStopTsN( (short) -1);
 }
 resultObjString = resultSet.getString(17);
 if (resultObjString != null) {
   itarafxs.setTarafxsXferRdyTsN( (short) 0);tarafxs.setTarafxsXferRdyTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsXferRdyTsN( (short) -1);
 }
 resultObj = resultSet.getObject(18);
 if (resultObj != null) {
   itarafxs.setTarafxsXferCondCdN( (short) 0);tarafxs.setTarafxsXferCondCd( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsXferCondCdN( (short) -1);
 }
 resultObj = resultSet.getObject(19);
 if (resultObj != null) {
   itarafxs.setTarafxsXferStatTxtN( (short) 0);tarafxs.setTarafxsXferStatTxt( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsXferStatTxtN( (short) -1);
 }
 resultObj = resultSet.getObject(20);
 if (resultObj != null) {
   itarafxs.setTarafxsXferPrcssIdN( (short) 0);tarafxs.setTarafxsXferPrcssId( (Db2Base.castToBigDecimal(resultObj)).longValue());
 } else {itarafxs.setTarafxsXferPrcssIdN( (short) -1);
 }
 resultObj = resultSet.getObject(21);
 if (resultObj != null) {
   itarafxs.setTarafxsOrgXferPrcsIdN( (short) 0);tarafxs.setTarafxsOrgXferPrcsId( (Db2Base.castToBigDecimal(resultObj)).longValue());
 } else {itarafxs.setTarafxsOrgXferPrcsIdN( (short) -1);
 }
 resultObj = resultSet.getObject(22);
 if (resultObj != null) {
   itarafxs.setTarafxsTrgrCondCdN( (short) 0);tarafxs.setTarafxsTrgrCondCd( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsTrgrCondCdN( (short) -1);
 }
 resultObj = resultSet.getObject(23);
 if (resultObj != null) {
   itarafxs.setTarafxsTrgrStatTxtN( (short) 0);tarafxs.setTarafxsTrgrStatTxt( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsTrgrStatTxtN( (short) -1);
 }
 resultObj = resultSet.getObject(24);
 if (resultObj != null) {
   itarafxs.setTarafxsOrgLocNamN( (short) 0);tarafxs.setTarafxsOrgLocNam( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsOrgLocNamN( (short) -1);
 }
 resultObj = resultSet.getObject(25);
 if (resultObj != null) {
   tarafxs.setTarafxsLstUpdtUserId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(26);
 if (resultObjString != null) {
   tarafxs.setTarafxsLstUpdtTs( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(27);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgrActNamN( (short) 0);tarafxs.setTarafxsTrgrActNam( db2Base.formatISOTime(resultObjString) );
 } else {itarafxs.setTarafxsTrgrActNamN( (short) -1);
 }
 resultObj = resultSet.getObject(28);
 if (resultObj != null) {
   itarafxs.setTarafxsPrvMnfrmFileNamN( (short) 0);tarafxs.setTarafxsPrvMnfrmFileNam( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsPrvMnfrmFileNamN( (short) -1);
 }
 resultObj = resultSet.getObject(29);
 if (resultObj != null) {
   itarafxs.setTarafxsPrvCyclNumN( (short) 0);tarafxs.setTarafxsPrvCyclNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
 } else {itarafxs.setTarafxsPrvCyclNumN( (short) -1);
 }
 resultObj = resultSet.getObject(30);
 if (resultObj != null) {
   itarafxs.setTarafxsPrvBusPrtnrIdN( (short) 0);tarafxs.setTarafxsPrvBusPrtnrId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsPrvBusPrtnrIdN( (short) -1);
 }
 resultObj = resultSet.getObject(31);
 if (resultObj != null) {
   itarafxs.setTarafxsPrvEndptIdN( (short) 0);tarafxs.setTarafxsPrvEndptId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsPrvEndptIdN( (short) -1);
 }
 resultObjString = resultSet.getString(32);
 if (resultObjString != null) {
   itarafxs.setTarafxsPrvAvailTsN( (short) 0);tarafxs.setTarafxsPrvAvailTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsPrvAvailTsN( (short) -1);
 }
 resultObj = resultSet.getObject(33);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtMnfrmFileNamN( (short) 0);tarafxs.setTarafxsNxtMnfrmFileNam( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsNxtMnfrmFileNamN( (short) -1);
 }
 resultObj = resultSet.getObject(34);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtCyclNumN( (short) 0);tarafxs.setTarafxsNxtCyclNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
 } else {itarafxs.setTarafxsNxtCyclNumN( (short) -1);
 }
 resultObj = resultSet.getObject(35);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtBusPrtnrIdN( (short) 0);tarafxs.setTarafxsNxtBusPrtnrId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsNxtBusPrtnrIdN( (short) -1);
 }
 resultObj = resultSet.getObject(36);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtEndptIdN( (short) 0);tarafxs.setTarafxsNxtEndptId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsNxtEndptIdN( (short) -1);
 }
 resultObjString = resultSet.getString(37);
 if (resultObjString != null) {
   itarafxs.setTarafxsNxtAvailTsN( (short) 0);tarafxs.setTarafxsNxtAvailTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsNxtAvailTsN( (short) -1);
 }
 resultObjString = resultSet.getString(38);
 if (resultObjString != null) {
   itarafxs.setTarafxsApplExitJobNamN( (short) 0);tarafxs.setTarafxsApplExitJobNam( db2Base.formatISOTime(resultObjString) );
 } else {itarafxs.setTarafxsApplExitJobNamN( (short) -1);
 }
 resultObjString = resultSet.getString(39);
 if (resultObjString != null) {
   itarafxs.setTarafxsApplExitTsN( (short) 0);tarafxs.setTarafxsApplExitTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsApplExitTsN( (short) -1);
 }
 resultObj = resultSet.getObject(40);
 if (resultObj != null) {
   itarafxs.setTarafxsCsMipIdN( (short) 0);tarafxs.setTarafxsCsMipId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsCsMipIdN( (short) -1);
 }
 resultObj = resultSet.getObject(41);
 if (resultObj != null) {
   itarafxs.setTarafxsRmMipIdN( (short) 0);tarafxs.setTarafxsRmMipId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsRmMipIdN( (short) -1);
 }
 resultObjString = resultSet.getString(42);
 if (resultObjString != null) {
   itarafxs.setTarafxsApplExitNamN( (short) 0);tarafxs.setTarafxsApplExitNam( db2Base.formatISOTime(resultObjString) );
 } else {itarafxs.setTarafxsApplExitNamN( (short) -1);
 }
 resultObj = resultSet.getObject(43);
 if (resultObj != null) {
   itarafxs.setTarafxsTapeCmpltdSwN( (short) 0);tarafxs.setTarafxsTapeCmpltdSw( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsTapeCmpltdSwN( (short) -1);
 }
 resultObj = resultSet.getObject(44);
 if (resultObj != null) {
   itarafxs.setTarafxsTapeMultVolSwN( (short) 0);tarafxs.setTarafxsTapeMultVolSw( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsTapeMultVolSwN( (short) -1);
 }
 resultObjString = resultSet.getString(45);
 if (resultObjString != null) {
   itarafxs.setTarafxsApplPrcssngDtN( (short) 0);tarafxs.setTarafxsApplPrcssngDt( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsApplPrcssngDtN( (short) -1);
 }
 resultObj = resultSet.getObject(46);
 if (resultObj != null) {
   itarafxs.setTarafxsTransitionalDsnN( (short) 0);tarafxs.setTarafxsTransitionalDsn( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsTransitionalDsnN( (short) -1);
 }
 resultObjString = resultSet.getString(47);
 if (resultObjString != null) {
   itarafxs.setTarafxsSourceHubIdN( (short) 0);tarafxs.setTarafxsSourceHubId( db2Base.formatISOTime(resultObjString) );
 } else {itarafxs.setTarafxsSourceHubIdN( (short) -1);
 }
 resultObjString = resultSet.getString(48);
 if (resultObjString != null) {
   itarafxs.setTarafxsOwningHubIdN( (short) 0);tarafxs.setTarafxsOwningHubId( db2Base.formatISOTime(resultObjString) );
 } else {itarafxs.setTarafxsOwningHubIdN( (short) -1);
 }
 resultObj = resultSet.getObject(49);
 if (resultObj != null) {
   itarafxs.setTarafxsStatRefIdN( (short) 0);tarafxs.setTarafxsStatRefId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsStatRefIdN( (short) -1);
 }
 resultObjString = resultSet.getString(50);
 if (resultObjString != null) {
   itarafxs.setTarafxsSrcLocEntNamN( (short) 0);tarafxs.setTarafxsSrcLocEntNam( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsSrcLocEntNamN( (short) -1);
 }
 resultObjString = resultSet.getString(51);
 if (resultObjString != null) {
   itarafxs.setTarafxsSrcTaskNamN( (short) 0);tarafxs.setTarafxsSrcTaskNam( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsSrcTaskNamN( (short) -1);
 }
 resultObj = resultSet.getObject(52);
 if (resultObj != null) {
   itarafxs.setTarafxsSrcTaskIdN( (short) 0);tarafxs.setTarafxsSrcTaskId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsSrcTaskIdN( (short) -1);
 }
 resultObj = resultSet.getObject(53);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   tarafxs.setTarafxsSrcTaskUsr( value,0, value.length,2,value.length);
   tarafxs.getTarafxsSrcTaskUsr().setTarafxsSrcTaskUsrLen((short) value.length);
if (itarafxs.getTarafxsSrcTaskUsrN() != 0) itarafxs.setTarafxsSrcTaskUsrN( (short) 0);
 } else itarafxs.setTarafxsSrcTaskUsrN((short) -1 );
 resultObjString = resultSet.getString(54);
 if (resultObjString != null) {
   itarafxs.setTarafxsSrcTaskStrtTsN( (short) 0);tarafxs.setTarafxsSrcTaskStrtTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsSrcTaskStrtTsN( (short) -1);
 }
 resultObjString = resultSet.getString(55);
 if (resultObjString != null) {
   itarafxs.setTarafxsSrcTaskStopTsN( (short) 0);tarafxs.setTarafxsSrcTaskStopTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsSrcTaskStopTsN( (short) -1);
 }
 resultObjString = resultSet.getString(56);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtLocEntNamN( (short) 0);tarafxs.setTarafxsTrgtLocEntNam( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtLocEntNamN( (short) -1);
 }
 resultObjString = resultSet.getString(57);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtTaskNamN( (short) 0);tarafxs.setTarafxsTrgtTaskNam( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskNamN( (short) -1);
 }
 resultObj = resultSet.getObject(58);
 if (resultObj != null) {
   itarafxs.setTarafxsTrgtTaskIdN( (short) 0);tarafxs.setTarafxsTrgtTaskId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskIdN( (short) -1);
 }
 resultObj = resultSet.getObject(59);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   tarafxs.setTarafxsTrgtTaskUsr( value,0, value.length,2,value.length);
   tarafxs.getTarafxsTrgtTaskUsr().setTarafxsTrgtTaskUsrLen((short) value.length);
if (itarafxs.getTarafxsTrgtTaskUsrN() != 0) itarafxs.setTarafxsTrgtTaskUsrN( (short) 0);
 } else itarafxs.setTarafxsTrgtTaskUsrN((short) -1 );
 resultObjString = resultSet.getString(60);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtTaskStrtTsN( (short) 0);tarafxs.setTarafxsTrgtTaskStrtTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskStrtTsN( (short) -1);
 }
 resultObjString = resultSet.getString(61);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtTaskStopTsN( (short) 0);tarafxs.setTarafxsTrgtTaskStopTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskStopTsN( (short) -1);
 }
 resultObj = resultSet.getObject(62);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   tarafxs.setTarafxsApplTknNam( value,0, value.length,2,value.length);
   tarafxs.getTarafxsApplTknNam().setTarafxsApplTknNamLen((short) value.length);
if (itarafxs.getTarafxsApplTknNamN() != 0) itarafxs.setTarafxsApplTknNamN( (short) 0);
 } else itarafxs.setTarafxsApplTknNamN((short) -1 );
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
// methodEnd:selectTarafxs12
// methodStart:openEfpBulkRowAr640010
    
/**
******EXEC SQL DECLARE EFP_BULK_ROW CURSOR FOR                     
******    SELECT ENDPT_ID                                          
******         , APP_FILE_RTN_NUM                                  
******         , PRTY_NUM                                          
******         , TRNSLTN_SW                                        
******         , TRNSLTN_RTN_NAM                                   
******         , XFER_TYPE_CD                                      
******         , STATUS_CD                                         
******      FROM TARAEFP                                           
******     WHERE BULK_ID      = :TARAEFP-BULK-ID                   
******      AND  CYCL_NUM     = :TARAEFP-CYCL-NUM                  
******      AND (NOT ENDPT_ID = '0000000')                         
******      AND  EFF_FROM_TS <= CURRENT_TIMESTAMP                  
******      AND (EFF_TO_TS   IS NULL                               
******       OR  EFF_TO_TS   >= CURRENT_TIMESTAMP)                 
******     ORDER BY ENDPT_ID                                       
**/
    public void openEfpBulkRowAr640010(Taraefp taraefp, Sqlca sqlca) throws Exception {

try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	efpBulkRowResultSet = db2Base.startQuery(18/* SQL Sequence*/, CONSTANTS.LITERAL_AR640010)
    .withSql(SQLS.SQL_541626585)
				.withInputs(taraefp.getTaraefpBulkId(),taraefp.getTaraefpCyclNum())
				.withDataTypes(Types.CHAR,Types.SMALLINT)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}


    }
// methodEnd:openEfpBulkRowAr640010
// methodStart:closeEfpBulkRowAr640010
    
/**
******    EXEC SQL CLOSE EFP_BULK_ROW END-EXEC                     
**/
    public void closeEfpBulkRowAr640010(Sqlca sqlca) throws Exception {


    sqlca.setSqlcode(0);
	db2Base.updateFetchCounter(sqlFetchCounter);
    }
// methodEnd:closeEfpBulkRowAr640010
// methodStart:selectTarafxs13
    
/**
******    EXEC SQL SELECT COUNT(*)                                 
******        INTO :840-FILES-AVAIL                                
******        FROM  TARAFXS                                        
******        WHERE BULK_ID        = :TARAFXS-BULK-ID              
******          AND STAT_CD        = :TARAFXS-STAT-CD              
******          AND CYCL_NUM BETWEEN :810-CYCL-NUM-LO              
******                           AND :810-CYCL-NUM-HI              
******          AND XFER_MTHD_CD  <> :320-CHAR-D                   
**/
    public void selectTarafxs13(SqlWorkAreas840 sqlWorkAreas840, ReqWorkAreas810 reqWorkAreas810, Tarafxs tarafxs, Sqlca sqlca, CharacterLiterals320 characterLiterals320) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(34/* SQL Sequence*/, CONSTANTS.LITERAL_AR640010)
.withSql(SQLS.SQL_2033852024)
				.withInputs(tarafxs.getTarafxsBulkId(),tarafxs.getTarafxsStatCd(),reqWorkAreas810.getCyclNumRange810().getCyclNumLo810(),reqWorkAreas810.getCyclNumRange810().getCyclNumHi810(),characterLiterals320.getCharD320())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.SMALLINT,Types.SMALLINT,Types.CHAR)
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
   try {   
   sqlWorkAreas840.setFilesAvail840(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        sqlWorkAreas840.setFilesAvail840(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        sqlWorkAreas840.setFilesAvail840(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        sqlWorkAreas840.setFilesAvail840(((Double) resultObj).intValue());
   }
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
// methodEnd:selectTarafxs13
// methodStart:selectTarafxs14
    
/**
******    EXEC SQL SELECT                                          
******          BUS_PRTNR_ID                                       
******        , XFER_MTHD_CD                                       
******        , STAT_CD                                            
******        , SND_RCV_PRMSN_CD                                   
******        , XFER_RDY_TS                                        
******        , LST_UPDT_USER_ID                                   
******        , LST_UPDT_TS                                        
******        , NXT_MNFRM_FILE_NAM                                 
******        , NXT_CYCL_NUM                                       
******        , NXT_BUS_PRTNR_ID                                   
******        , NXT_ENDPT_ID                                       
******        , NXT_AVAIL_TS                                       
******        , APPL_EXIT_NAM                                      
******        , STAT_REF_ID                                        
******        , TRGT_LOC_ENT_NAM                                   
******        , TRGT_TASK_NAM                                      
******        , TRGT_TASK_ID                                       
******        , TRGT_TASK_USR                                      
******        , TRGT_TASK_STRT_TS                                  
******        , TRGT_TASK_STOP_TS                                  
******    INTO :TARAFXS-BUS-PRTNR-ID                               
******       , :TARAFXS-XFER-MTHD-CD                               
******       , :TARAFXS-STAT-CD                                    
******       , :TARAFXS-SND-RCV-PRMSN-CD                           
******       , :TARAFXS-XFER-RDY-TS                                
******         :TARAFXS-XFER-RDY-TS-N                              
******       , :TARAFXS-LST-UPDT-USER-ID                           
******       , :TARAFXS-LST-UPDT-TS                                
******       , :TARAFXS-NXT-MNFRM-FILE-NAM                         
******         :TARAFXS-NXT-MNFRM-FILE-NAM-N                       
******       , :TARAFXS-NXT-CYCL-NUM                               
******         :TARAFXS-NXT-CYCL-NUM-N                             
******       , :TARAFXS-NXT-BUS-PRTNR-ID                           
******         :TARAFXS-NXT-BUS-PRTNR-ID-N                         
******       , :TARAFXS-NXT-ENDPT-ID                               
******         :TARAFXS-NXT-ENDPT-ID-N                             
******       , :TARAFXS-NXT-AVAIL-TS                               
******         :TARAFXS-NXT-AVAIL-TS-N                             
******       , :TARAFXS-APPL-EXIT-NAM                              
******         :TARAFXS-APPL-EXIT-NAM-N                            
******       , :TARAFXS-STAT-REF-ID                                
******       , :TARAFXS-TRGT-LOC-ENT-NAM                           
******         :TARAFXS-TRGT-LOC-ENT-NAM-N                         
******       , :TARAFXS-TRGT-TASK-NAM                              
******         :TARAFXS-TRGT-TASK-NAM-N                            
******       , :TARAFXS-TRGT-TASK-ID                               
******         :TARAFXS-TRGT-TASK-ID-N                             
******       , :TARAFXS-TRGT-TASK-USR                              
******         :TARAFXS-TRGT-TASK-USR-N                            
******       , :TARAFXS-TRGT-TASK-STRT-TS                          
******         :TARAFXS-TRGT-TASK-STRT-TS-N                        
******       , :TARAFXS-TRGT-TASK-STOP-TS                          
******         :TARAFXS-TRGT-TASK-STOP-TS-N                        
******    FROM  TARAFXS                                            
******    WHERE MC_MNFRM_FILE_NAM = :TARAFXS-MC-MNFRM-FILE-NAM     
******      AND CYCL_NUM          = :TARAFXS-CYCL-NUM              
******      AND ENDPT_ID          = :TARAFXS-ENDPT-ID              
******      AND BULK_ID           = :TARAFXS-BULK-ID               
**/
    public void selectTarafxs14(Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(35/* SQL Sequence*/, CONSTANTS.LITERAL_AR640010)
.withSql(SQLS.SQL_877336330)
				.withInputs(tarafxs.getTarafxsMcMnfrmFileNam(),tarafxs.getTarafxsCyclNum(),tarafxs.getTarafxsEndptId(),tarafxs.getTarafxsBulkId())
				.withDataTypes(Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR)
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
   tarafxs.setTarafxsBusPrtnrId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(2);
 if (resultObj != null) {
   tarafxs.setTarafxsXferMthdCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(3);
 if (resultObj != null) {
   tarafxs.setTarafxsStatCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(4);
 if (resultObj != null) {
   tarafxs.setTarafxsSndRcvPrmsnCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(5);
 if (resultObjString != null) {
   itarafxs.setTarafxsXferRdyTsN( (short) 0);tarafxs.setTarafxsXferRdyTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsXferRdyTsN( (short) -1);
 }
 resultObj = resultSet.getObject(6);
 if (resultObj != null) {
   tarafxs.setTarafxsLstUpdtUserId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(7);
 if (resultObjString != null) {
   tarafxs.setTarafxsLstUpdtTs( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(8);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtMnfrmFileNamN( (short) 0);tarafxs.setTarafxsNxtMnfrmFileNam( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsNxtMnfrmFileNamN( (short) -1);
 }
 resultObj = resultSet.getObject(9);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtCyclNumN( (short) 0);tarafxs.setTarafxsNxtCyclNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
 } else {itarafxs.setTarafxsNxtCyclNumN( (short) -1);
 }
 resultObj = resultSet.getObject(10);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtBusPrtnrIdN( (short) 0);tarafxs.setTarafxsNxtBusPrtnrId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsNxtBusPrtnrIdN( (short) -1);
 }
 resultObj = resultSet.getObject(11);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtEndptIdN( (short) 0);tarafxs.setTarafxsNxtEndptId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsNxtEndptIdN( (short) -1);
 }
 resultObjString = resultSet.getString(12);
 if (resultObjString != null) {
   itarafxs.setTarafxsNxtAvailTsN( (short) 0);tarafxs.setTarafxsNxtAvailTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsNxtAvailTsN( (short) -1);
 }
 resultObjString = resultSet.getString(13);
 if (resultObjString != null) {
   itarafxs.setTarafxsApplExitNamN( (short) 0);tarafxs.setTarafxsApplExitNam( db2Base.formatISOTime(resultObjString) );
 } else {itarafxs.setTarafxsApplExitNamN( (short) -1);
 }
 resultObj = resultSet.getObject(14);
 if (resultObj != null) {
   tarafxs.setTarafxsStatRefId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(15);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtLocEntNamN( (short) 0);tarafxs.setTarafxsTrgtLocEntNam( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtLocEntNamN( (short) -1);
 }
 resultObjString = resultSet.getString(16);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtTaskNamN( (short) 0);tarafxs.setTarafxsTrgtTaskNam( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskNamN( (short) -1);
 }
 resultObj = resultSet.getObject(17);
 if (resultObj != null) {
   itarafxs.setTarafxsTrgtTaskIdN( (short) 0);tarafxs.setTarafxsTrgtTaskId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskIdN( (short) -1);
 }
 resultObj = resultSet.getObject(18);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   tarafxs.setTarafxsTrgtTaskUsr( value,0, value.length,2,value.length);
   tarafxs.getTarafxsTrgtTaskUsr().setTarafxsTrgtTaskUsrLen((short) value.length);
if (itarafxs.getTarafxsTrgtTaskUsrN() != 0) itarafxs.setTarafxsTrgtTaskUsrN( (short) 0);
 } else itarafxs.setTarafxsTrgtTaskUsrN((short) -1 );
 resultObjString = resultSet.getString(19);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtTaskStrtTsN( (short) 0);tarafxs.setTarafxsTrgtTaskStrtTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskStrtTsN( (short) -1);
 }
 resultObjString = resultSet.getString(20);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtTaskStopTsN( (short) 0);tarafxs.setTarafxsTrgtTaskStopTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskStopTsN( (short) -1);
 }
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
// methodEnd:selectTarafxs14
// methodStart:openFxaResetRowAr640010
    
/**
******EXEC SQL DECLARE FXA_RESET_ROW CURSOR FOR                    
******    SELECT MC_MNFRM_FILE_NAM                                 
******         , CYCL_NUM                                          
******         , BUS_PRTNR_ID                                      
******         , ENDPT_ID                                          
******         , XFER_MTHD_CD                                      
******         , AVAIL_TS                                          
******         , BULK_ID                                           
******         , STAT_CD                                           
******         , SND_RCV_PRMSN_CD                                  
******         , MCIBDIO_PARM_TXT                                  
******         , PRTY_NUM                                          
******         , ARCH_LOC_TXT                                      
******         , SVR_FILE_STAT_CD                                  
******         , LST_STAT_TS                                       
******         , XFER_FILE_SZ_NUM                                  
******         , TMS_XFERD_CNT                                     
******         , XFER_REC_CNT                                      
******         , XFER_RQST_TS                                      
******         , XFER_STRT_TS                                      
******         , XFER_STOP_TS                                      
******         , XFER_RDY_TS                                       
******         , XFER_COND_CD                                      
******         , XFER_STAT_TXT                                     
******         , XFER_PRCSS_ID                                     
******         , ORG_XFER_PRCS_ID                                  
******         , TRGR_COND_CD                                      
******         , TRGR_STAT_TXT                                     
******         , ORG_LOC_NAM                                       
******         , LST_UPDT_USER_ID                                  
******         , LST_UPDT_TS                                       
******         , TRGR_ACT_NAM                                      
******         , PRV_MNFRM_FILE_NAM                                
******         , PRV_CYCL_NUM                                      
******         , PRV_BUS_PRTNR_ID                                  
******         , PRV_ENDPT_ID                                      
******         , PRV_AVAIL_TS                                      
******         , NXT_MNFRM_FILE_NAM                                
******         , NXT_CYCL_NUM                                      
******         , NXT_BUS_PRTNR_ID                                  
******         , NXT_ENDPT_ID                                      
******         , NXT_AVAIL_TS                                      
******         , APPL_EXIT_JOB_NAM                                 
******         , APPL_EXIT_TS                                      
******         , CS_MIP_ID                                         
******         , RM_MIP_ID                                         
******         , APPL_EXIT_NAM                                     
******         , TAPE_CMPLTD_SW                                    
******         , TAPE_MULT_VOL_SW                                  
******         , APPL_PRCSSNG_DT                                   
******         , TRANSITIONAL_DSN                                  
******         , SOURCE_HUB_ID                                     
******         , OWNING_HUB_ID                                     
******         , STAT_REF_ID                                       
******         , SRC_LOC_ENT_NAM                                   
******         , SRC_TASK_NAM                                      
******         , SRC_TASK_ID                                       
******         , SRC_TASK_USR                                      
******         , SRC_TASK_STRT_TS                                  
******         , SRC_TASK_STOP_TS                                  
******         , TRGT_LOC_ENT_NAM                                  
******         , TRGT_TASK_NAM                                     
******         , TRGT_TASK_ID                                      
******         , TRGT_TASK_USR                                     
******         , TRGT_TASK_STRT_TS                                 
******         , TRGT_TASK_STOP_TS                                 
******         , APPL_TKN_NAM                                      
******      FROM TARAFXA                                           
******     WHERE MC_MNFRM_FILE_NAM = :TARAFXS-MC-MNFRM-FILE-NAM    
******       AND CYCL_NUM          = :TARAFXS-CYCL-NUM             
******       AND ENDPT_ID          = :TARAFXS-ENDPT-ID             
******       AND BULK_ID           = :TARAFXS-BULK-ID              
******     ORDER BY LST_UPDT_TS DESC                               
**/
    public void openFxaResetRowAr640010(Tarafxs tarafxs, Sqlca sqlca) throws Exception {

try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	fxaResetRowResultSet = db2Base.startQuery(11/* SQL Sequence*/, CONSTANTS.LITERAL_AR640010)
    .withSql(SQLS.SQL_1233184966)
				.withInputs(tarafxs.getTarafxsMcMnfrmFileNam(),tarafxs.getTarafxsCyclNum(),tarafxs.getTarafxsEndptId(),tarafxs.getTarafxsBulkId())
				.withDataTypes(Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}


    }
// methodEnd:openFxaResetRowAr640010
// methodStart:fetchFxaResetRowAr640010
    
/**
******EXEC SQL FETCH FXA_RESET_ROW                                 
******    INTO :TARAFXA-MC-MNFRM-FILE-NAM                          
******       , :TARAFXA-CYCL-NUM                                   
******       , :TARAFXA-BUS-PRTNR-ID                               
******       , :TARAFXA-ENDPT-ID                                   
******       , :TARAFXA-XFER-MTHD-CD                               
******       , :TARAFXA-AVAIL-TS                                   
******       , :TARAFXA-BULK-ID                                    
******       , :TARAFXA-STAT-CD                                    
******       , :TARAFXA-SND-RCV-PRMSN-CD                           
******       , :TARAFXA-MCIBDIO-PARM-TXT                           
******       , :TARAFXA-PRTY-NUM                                   
******       , :TARAFXA-ARCH-LOC-TXT                               
******         :TARAFXA-ARCH-LOC-TXT-N                             
******       , :TARAFXA-SVR-FILE-STAT-CD                           
******       , :TARAFXA-LST-STAT-TS                                
******         :TARAFXA-LST-STAT-TS-N                              
******       , :TARAFXA-XFER-FILE-SZ-NUM                           
******       , :TARAFXA-TMS-XFERD-CNT                              
******       , :TARAFXA-XFER-REC-CNT                               
******       , :TARAFXA-XFER-RQST-TS                               
******         :TARAFXA-XFER-RQST-TS-N                             
******       , :TARAFXA-XFER-STRT-TS                               
******         :TARAFXA-XFER-STRT-TS-N                             
******       , :TARAFXA-XFER-STOP-TS                               
******         :TARAFXA-XFER-STOP-TS-N                             
******       , :TARAFXA-XFER-RDY-TS                                
******         :TARAFXA-XFER-RDY-TS-N                              
******       , :TARAFXA-XFER-COND-CD                               
******         :TARAFXA-XFER-COND-CD-N                             
******       , :TARAFXA-XFER-STAT-TXT                              
******         :TARAFXA-XFER-STAT-TXT-N                            
******       , :TARAFXA-XFER-PRCSS-ID                              
******         :TARAFXA-XFER-PRCSS-ID-N                            
******       , :TARAFXA-ORG-XFER-PRCS-ID                           
******         :TARAFXA-ORG-XFER-PRCS-ID-N                         
******       , :TARAFXA-TRGR-COND-CD                               
******         :TARAFXA-TRGR-COND-CD-N                             
******       , :TARAFXA-TRGR-STAT-TXT                              
******         :TARAFXA-TRGR-STAT-TXT-N                            
******       , :TARAFXA-ORG-LOC-NAM                                
******         :TARAFXA-ORG-LOC-NAM-N                              
******       , :TARAFXA-LST-UPDT-USER-ID                           
******       , :TARAFXA-LST-UPDT-TS                                
******       , :TARAFXA-TRGR-ACT-NAM                               
******         :TARAFXA-TRGR-ACT-NAM-N                             
******       , :TARAFXA-PRV-MNFRM-FILE-NAM                         
******         :TARAFXA-PRV-MNFRM-FILE-NAM-N                       
******       , :TARAFXA-PRV-CYCL-NUM                               
******         :TARAFXA-PRV-CYCL-NUM-N                             
******       , :TARAFXA-PRV-BUS-PRTNR-ID                           
******         :TARAFXA-PRV-BUS-PRTNR-ID-N                         
******       , :TARAFXA-PRV-ENDPT-ID                               
******         :TARAFXA-PRV-ENDPT-ID-N                             
******       , :TARAFXA-PRV-AVAIL-TS                               
******         :TARAFXA-PRV-AVAIL-TS-N                             
******       , :TARAFXA-NXT-MNFRM-FILE-NAM                         
******         :TARAFXA-NXT-MNFRM-FILE-NAM-N                       
******       , :TARAFXA-NXT-CYCL-NUM                               
******         :TARAFXA-NXT-CYCL-NUM-N                             
******       , :TARAFXA-NXT-BUS-PRTNR-ID                           
******         :TARAFXA-NXT-BUS-PRTNR-ID-N                         
******       , :TARAFXA-NXT-ENDPT-ID                               
******         :TARAFXA-NXT-ENDPT-ID-N                             
******       , :TARAFXA-NXT-AVAIL-TS                               
******         :TARAFXA-NXT-AVAIL-TS-N                             
******       , :TARAFXA-APPL-EXIT-JOB-NAM                          
******         :TARAFXA-APPL-EXIT-JOB-NAM-N                        
******       , :TARAFXA-APPL-EXIT-TS                               
******         :TARAFXA-APPL-EXIT-TS-N                             
******       , :TARAFXA-CS-MIP-ID                                  
******         :TARAFXA-CS-MIP-ID-N                                
******       , :TARAFXA-RM-MIP-ID                                  
******         :TARAFXA-RM-MIP-ID-N                                
******       , :TARAFXA-APPL-EXIT-NAM                              
******         :TARAFXA-APPL-EXIT-NAM-N                            
******       , :TARAFXA-TAPE-CMPLTD-SW                             
******         :TARAFXA-TAPE-CMPLTD-SW-N                           
******       , :TARAFXA-TAPE-MULT-VOL-SW                           
******         :TARAFXA-TAPE-MULT-VOL-SW-N                         
******       , :TARAFXA-APPL-PRCSSNG-DT                            
******         :TARAFXA-APPL-PRCSSNG-DT-N                          
******       , :TARAFXA-TRANSITIONAL-DSN                           
******         :TARAFXA-TRANSITIONAL-DSN-N                         
******       , :TARAFXA-SOURCE-HUB-ID                              
******         :TARAFXA-SOURCE-HUB-ID-N                            
******       , :TARAFXA-OWNING-HUB-ID                              
******         :TARAFXA-OWNING-HUB-ID-N                            
******       , :TARAFXA-STAT-REF-ID                                
******         :TARAFXA-STAT-REF-ID-N                              
******       , :TARAFXA-SRC-LOC-ENT-NAM                            
******         :TARAFXA-SRC-LOC-ENT-NAM-N                          
******       , :TARAFXA-SRC-TASK-NAM                               
******         :TARAFXA-SRC-TASK-NAM-N                             
******       , :TARAFXA-SRC-TASK-ID                                
******         :TARAFXA-SRC-TASK-ID-N                              
******       , :TARAFXA-SRC-TASK-USR                               
******         :TARAFXA-SRC-TASK-USR-N                             
******       , :TARAFXA-SRC-TASK-STRT-TS                           
******         :TARAFXA-SRC-TASK-STRT-TS-N                         
******       , :TARAFXA-SRC-TASK-STOP-TS                           
******         :TARAFXA-SRC-TASK-STOP-TS-N                         
******       , :TARAFXA-TRGT-LOC-ENT-NAM                           
******         :TARAFXA-TRGT-LOC-ENT-NAM-N                         
******       , :TARAFXA-TRGT-TASK-NAM                              
******         :TARAFXA-TRGT-TASK-NAM-N                            
******       , :TARAFXA-TRGT-TASK-ID                               
******         :TARAFXA-TRGT-TASK-ID-N                             
******       , :TARAFXA-TRGT-TASK-USR                              
******         :TARAFXA-TRGT-TASK-USR-N                            
******       , :TARAFXA-TRGT-TASK-STRT-TS                          
******         :TARAFXA-TRGT-TASK-STRT-TS-N                        
******       , :TARAFXA-TRGT-TASK-STOP-TS                          
******         :TARAFXA-TRGT-TASK-STOP-TS-N                        
******       , :TARAFXA-APPL-TKN-NAM                               
******         :TARAFXA-APPL-TKN-NAM-N                             
**/
    public void fetchFxaResetRowAr640010(Tarafxa tarafxa, Itarafxa itarafxa, Sqlca sqlca) throws Exception {
try {
	boolean hasResults = fxaResetRowResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = fxaResetRowResultSet.getObject(1);
 if (resultObj != null) {
   tarafxa.setTarafxaMcMnfrmFileNam( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxaResetRowResultSet.getObject(2);
 if (resultObj != null) {
   tarafxa.setTarafxaCyclNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = fxaResetRowResultSet.getObject(3);
 if (resultObj != null) {
   tarafxa.setTarafxaBusPrtnrId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxaResetRowResultSet.getObject(4);
 if (resultObj != null) {
   tarafxa.setTarafxaEndptId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxaResetRowResultSet.getObject(5);
 if (resultObj != null) {
   tarafxa.setTarafxaXferMthdCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = fxaResetRowResultSet.getString(6);
 if (resultObjString != null) {
   tarafxa.setTarafxaAvailTs( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxaResetRowResultSet.getObject(7);
 if (resultObj != null) {
   tarafxa.setTarafxaBulkId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxaResetRowResultSet.getObject(8);
 if (resultObj != null) {
   tarafxa.setTarafxaStatCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxaResetRowResultSet.getObject(9);
 if (resultObj != null) {
   tarafxa.setTarafxaSndRcvPrmsnCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxaResetRowResultSet.getObject(10);
 if (resultObj != null) {
   tarafxa.setTarafxaMcibdioParmTxt( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxaResetRowResultSet.getObject(11);
 if (resultObj != null) {
   tarafxa.setTarafxaPrtyNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = fxaResetRowResultSet.getObject(12);
 if (resultObj != null) {
   itarafxa.setTarafxaArchLocTxtN( (short) 0);tarafxa.setTarafxaArchLocTxt( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaArchLocTxtN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(13);
 if (resultObj != null) {
   tarafxa.setTarafxaSvrFileStatCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = fxaResetRowResultSet.getString(14);
 if (resultObjString != null) {
   itarafxa.setTarafxaLstStatTsN( (short) 0);tarafxa.setTarafxaLstStatTs( resultObjString.toCharArray() );
 } else {itarafxa.setTarafxaLstStatTsN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(15);
 if (resultObj != null) {
   tarafxa.setTarafxaXferFileSzNum( (Db2Base.castToBigDecimal(resultObj)).longValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = fxaResetRowResultSet.getObject(16);
 if (resultObj != null) {
   tarafxa.setTarafxaTmsXferdCnt( (Db2Base.castToBigDecimal(resultObj)).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = fxaResetRowResultSet.getObject(17);
 if (resultObj != null) {
   tarafxa.setTarafxaXferRecCnt( (Db2Base.castToBigDecimal(resultObj)).longValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = fxaResetRowResultSet.getString(18);
 if (resultObjString != null) {
   itarafxa.setTarafxaXferRqstTsN( (short) 0);tarafxa.setTarafxaXferRqstTs( resultObjString.toCharArray() );
 } else {itarafxa.setTarafxaXferRqstTsN( (short) -1);
 }
 resultObjString = fxaResetRowResultSet.getString(19);
 if (resultObjString != null) {
   itarafxa.setTarafxaXferStrtTsN( (short) 0);tarafxa.setTarafxaXferStrtTs( resultObjString.toCharArray() );
 } else {itarafxa.setTarafxaXferStrtTsN( (short) -1);
 }
 resultObjString = fxaResetRowResultSet.getString(20);
 if (resultObjString != null) {
   itarafxa.setTarafxaXferStopTsN( (short) 0);tarafxa.setTarafxaXferStopTs( resultObjString.toCharArray() );
 } else {itarafxa.setTarafxaXferStopTsN( (short) -1);
 }
 resultObjString = fxaResetRowResultSet.getString(21);
 if (resultObjString != null) {
   itarafxa.setTarafxaXferRdyTsN( (short) 0);tarafxa.setTarafxaXferRdyTs( resultObjString.toCharArray() );
 } else {itarafxa.setTarafxaXferRdyTsN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(22);
 if (resultObj != null) {
   itarafxa.setTarafxaXferCondCdN( (short) 0);tarafxa.setTarafxaXferCondCd( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaXferCondCdN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(23);
 if (resultObj != null) {
   itarafxa.setTarafxaXferStatTxtN( (short) 0);tarafxa.setTarafxaXferStatTxt( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaXferStatTxtN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(24);
 if (resultObj != null) {
   itarafxa.setTarafxaXferPrcssIdN( (short) 0);tarafxa.setTarafxaXferPrcssId( (Db2Base.castToBigDecimal(resultObj)).longValue());
 } else {itarafxa.setTarafxaXferPrcssIdN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(25);
 if (resultObj != null) {
   itarafxa.setTarafxaOrgXferPrcsIdN( (short) 0);tarafxa.setTarafxaOrgXferPrcsId( (Db2Base.castToBigDecimal(resultObj)).longValue());
 } else {itarafxa.setTarafxaOrgXferPrcsIdN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(26);
 if (resultObj != null) {
   itarafxa.setTarafxaTrgrCondCdN( (short) 0);tarafxa.setTarafxaTrgrCondCd( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaTrgrCondCdN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(27);
 if (resultObj != null) {
   itarafxa.setTarafxaTrgrStatTxtN( (short) 0);tarafxa.setTarafxaTrgrStatTxt( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaTrgrStatTxtN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(28);
 if (resultObj != null) {
   itarafxa.setTarafxaOrgLocNamN( (short) 0);tarafxa.setTarafxaOrgLocNam( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaOrgLocNamN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(29);
 if (resultObj != null) {
   tarafxa.setTarafxaLstUpdtUserId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = fxaResetRowResultSet.getString(30);
 if (resultObjString != null) {
   tarafxa.setTarafxaLstUpdtTs( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = fxaResetRowResultSet.getString(31);
 if (resultObjString != null) {
   itarafxa.setTarafxaTrgrActNamN( (short) 0);tarafxa.setTarafxaTrgrActNam( db2Base.formatISOTime(resultObjString) );
 } else {itarafxa.setTarafxaTrgrActNamN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(32);
 if (resultObj != null) {
   itarafxa.setTarafxaPrvMnfrmFileNamN( (short) 0);tarafxa.setTarafxaPrvMnfrmFileNam( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaPrvMnfrmFileNamN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(33);
 if (resultObj != null) {
   itarafxa.setTarafxaPrvCyclNumN( (short) 0);tarafxa.setTarafxaPrvCyclNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
 } else {itarafxa.setTarafxaPrvCyclNumN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(34);
 if (resultObj != null) {
   itarafxa.setTarafxaPrvBusPrtnrIdN( (short) 0);tarafxa.setTarafxaPrvBusPrtnrId( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaPrvBusPrtnrIdN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(35);
 if (resultObj != null) {
   itarafxa.setTarafxaPrvEndptIdN( (short) 0);tarafxa.setTarafxaPrvEndptId( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaPrvEndptIdN( (short) -1);
 }
 resultObjString = fxaResetRowResultSet.getString(36);
 if (resultObjString != null) {
   itarafxa.setTarafxaPrvAvailTsN( (short) 0);tarafxa.setTarafxaPrvAvailTs( resultObjString.toCharArray() );
 } else {itarafxa.setTarafxaPrvAvailTsN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(37);
 if (resultObj != null) {
   itarafxa.setTarafxaNxtMnfrmFileNamN( (short) 0);tarafxa.setTarafxaNxtMnfrmFileNam( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaNxtMnfrmFileNamN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(38);
 if (resultObj != null) {
   itarafxa.setTarafxaNxtCyclNumN( (short) 0);tarafxa.setTarafxaNxtCyclNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
 } else {itarafxa.setTarafxaNxtCyclNumN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(39);
 if (resultObj != null) {
   itarafxa.setTarafxaNxtBusPrtnrIdN( (short) 0);tarafxa.setTarafxaNxtBusPrtnrId( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaNxtBusPrtnrIdN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(40);
 if (resultObj != null) {
   itarafxa.setTarafxaNxtEndptIdN( (short) 0);tarafxa.setTarafxaNxtEndptId( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaNxtEndptIdN( (short) -1);
 }
 resultObjString = fxaResetRowResultSet.getString(41);
 if (resultObjString != null) {
   itarafxa.setTarafxaNxtAvailTsN( (short) 0);tarafxa.setTarafxaNxtAvailTs( resultObjString.toCharArray() );
 } else {itarafxa.setTarafxaNxtAvailTsN( (short) -1);
 }
 resultObjString = fxaResetRowResultSet.getString(42);
 if (resultObjString != null) {
   itarafxa.setTarafxaApplExitJobNamN( (short) 0);tarafxa.setTarafxaApplExitJobNam( db2Base.formatISOTime(resultObjString) );
 } else {itarafxa.setTarafxaApplExitJobNamN( (short) -1);
 }
 resultObjString = fxaResetRowResultSet.getString(43);
 if (resultObjString != null) {
   itarafxa.setTarafxaApplExitTsN( (short) 0);tarafxa.setTarafxaApplExitTs( resultObjString.toCharArray() );
 } else {itarafxa.setTarafxaApplExitTsN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(44);
 if (resultObj != null) {
   itarafxa.setTarafxaCsMipIdN( (short) 0);tarafxa.setTarafxaCsMipId( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaCsMipIdN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(45);
 if (resultObj != null) {
   itarafxa.setTarafxaRmMipIdN( (short) 0);tarafxa.setTarafxaRmMipId( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaRmMipIdN( (short) -1);
 }
 resultObjString = fxaResetRowResultSet.getString(46);
 if (resultObjString != null) {
   itarafxa.setTarafxaApplExitNamN( (short) 0);tarafxa.setTarafxaApplExitNam( db2Base.formatISOTime(resultObjString) );
 } else {itarafxa.setTarafxaApplExitNamN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(47);
 if (resultObj != null) {
   itarafxa.setTarafxaTapeCmpltdSwN( (short) 0);tarafxa.setTarafxaTapeCmpltdSw( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaTapeCmpltdSwN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(48);
 if (resultObj != null) {
   itarafxa.setTarafxaTapeMultVolSwN( (short) 0);tarafxa.setTarafxaTapeMultVolSw( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaTapeMultVolSwN( (short) -1);
 }
 resultObjString = fxaResetRowResultSet.getString(49);
 if (resultObjString != null) {
   itarafxa.setTarafxaApplPrcssngDtN( (short) 0);tarafxa.setTarafxaApplPrcssngDt( resultObjString.toCharArray() );
 } else {itarafxa.setTarafxaApplPrcssngDtN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(50);
 if (resultObj != null) {
   itarafxa.setTarafxaTransitionalDsnN( (short) 0);tarafxa.setTarafxaTransitionalDsn( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaTransitionalDsnN( (short) -1);
 }
 resultObjString = fxaResetRowResultSet.getString(51);
 if (resultObjString != null) {
   itarafxa.setTarafxaSourceHubIdN( (short) 0);tarafxa.setTarafxaSourceHubId( db2Base.formatISOTime(resultObjString) );
 } else {itarafxa.setTarafxaSourceHubIdN( (short) -1);
 }
 resultObjString = fxaResetRowResultSet.getString(52);
 if (resultObjString != null) {
   itarafxa.setTarafxaOwningHubIdN( (short) 0);tarafxa.setTarafxaOwningHubId( db2Base.formatISOTime(resultObjString) );
 } else {itarafxa.setTarafxaOwningHubIdN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(53);
 if (resultObj != null) {
   itarafxa.setTarafxaStatRefIdN( (short) 0);tarafxa.setTarafxaStatRefId( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaStatRefIdN( (short) -1);
 }
 resultObjString = fxaResetRowResultSet.getString(54);
 if (resultObjString != null) {
   itarafxa.setTarafxaSrcLocEntNamN( (short) 0);tarafxa.setTarafxaSrcLocEntNam( resultObjString.toCharArray() );
 } else {itarafxa.setTarafxaSrcLocEntNamN( (short) -1);
 }
 resultObjString = fxaResetRowResultSet.getString(55);
 if (resultObjString != null) {
   itarafxa.setTarafxaSrcTaskNamN( (short) 0);tarafxa.setTarafxaSrcTaskNam( resultObjString.toCharArray() );
 } else {itarafxa.setTarafxaSrcTaskNamN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(56);
 if (resultObj != null) {
   itarafxa.setTarafxaSrcTaskIdN( (short) 0);tarafxa.setTarafxaSrcTaskId( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaSrcTaskIdN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(57);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   tarafxa.setTarafxaSrcTaskUsr( value,0, value.length,2,value.length);
   tarafxa.getTarafxaSrcTaskUsr().setTarafxaSrcTaskUsrLen((short) value.length);
if (itarafxa.getTarafxaSrcTaskUsrN() != 0) itarafxa.setTarafxaSrcTaskUsrN( (short) 0);
 } else itarafxa.setTarafxaSrcTaskUsrN((short) -1 );
 resultObjString = fxaResetRowResultSet.getString(58);
 if (resultObjString != null) {
   itarafxa.setTarafxaSrcTaskStrtTsN( (short) 0);tarafxa.setTarafxaSrcTaskStrtTs( resultObjString.toCharArray() );
 } else {itarafxa.setTarafxaSrcTaskStrtTsN( (short) -1);
 }
 resultObjString = fxaResetRowResultSet.getString(59);
 if (resultObjString != null) {
   itarafxa.setTarafxaSrcTaskStopTsN( (short) 0);tarafxa.setTarafxaSrcTaskStopTs( resultObjString.toCharArray() );
 } else {itarafxa.setTarafxaSrcTaskStopTsN( (short) -1);
 }
 resultObjString = fxaResetRowResultSet.getString(60);
 if (resultObjString != null) {
   itarafxa.setTarafxaTrgtLocEntNamN( (short) 0);tarafxa.setTarafxaTrgtLocEntNam( resultObjString.toCharArray() );
 } else {itarafxa.setTarafxaTrgtLocEntNamN( (short) -1);
 }
 resultObjString = fxaResetRowResultSet.getString(61);
 if (resultObjString != null) {
   itarafxa.setTarafxaTrgtTaskNamN( (short) 0);tarafxa.setTarafxaTrgtTaskNam( resultObjString.toCharArray() );
 } else {itarafxa.setTarafxaTrgtTaskNamN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(62);
 if (resultObj != null) {
   itarafxa.setTarafxaTrgtTaskIdN( (short) 0);tarafxa.setTarafxaTrgtTaskId( resultObj.toString().toCharArray() );
 } else {itarafxa.setTarafxaTrgtTaskIdN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(63);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   tarafxa.setTarafxaTrgtTaskUsr( value,0, value.length,2,value.length);
   tarafxa.getTarafxaTrgtTaskUsr().setTarafxaTrgtTaskUsrLen((short) value.length);
if (itarafxa.getTarafxaTrgtTaskUsrN() != 0) itarafxa.setTarafxaTrgtTaskUsrN( (short) 0);
 } else itarafxa.setTarafxaTrgtTaskUsrN((short) -1 );
 resultObjString = fxaResetRowResultSet.getString(64);
 if (resultObjString != null) {
   itarafxa.setTarafxaTrgtTaskStrtTsN( (short) 0);tarafxa.setTarafxaTrgtTaskStrtTs( resultObjString.toCharArray() );
 } else {itarafxa.setTarafxaTrgtTaskStrtTsN( (short) -1);
 }
 resultObjString = fxaResetRowResultSet.getString(65);
 if (resultObjString != null) {
   itarafxa.setTarafxaTrgtTaskStopTsN( (short) 0);tarafxa.setTarafxaTrgtTaskStopTs( resultObjString.toCharArray() );
 } else {itarafxa.setTarafxaTrgtTaskStopTsN( (short) -1);
 }
 resultObj = fxaResetRowResultSet.getObject(66);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   tarafxa.setTarafxaApplTknNam( value,0, value.length,2,value.length);
   tarafxa.getTarafxaApplTknNam().setTarafxaApplTknNamLen((short) value.length);
if (itarafxa.getTarafxaApplTknNamN() != 0) itarafxa.setTarafxaApplTknNamN( (short) 0);
 } else itarafxa.setTarafxaApplTknNamN((short) -1 );
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
 		logger.error("fxaResetRowResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchFxaResetRowAr640010
// methodStart:closeFxaResetRowAr640010
    
/**
******    EXEC SQL CLOSE FXA_RESET_ROW END-EXEC                    
**/
    public void closeFxaResetRowAr640010(Sqlca sqlca) throws Exception {


    sqlca.setSqlcode(0);
	db2Base.updateFetchCounter(sqlFetchCounter);
    }
// methodEnd:closeFxaResetRowAr640010
// methodStart:openFxsInstallRowAr640010
    
/**
******EXEC SQL DECLARE FXS_INSTALL_ROW CURSOR FOR                  
******    SELECT MC_MNFRM_FILE_NAM                                 
******         , CYCL_NUM                                          
******         , BUS_PRTNR_ID                                      
******         , ENDPT_ID                                          
******         , XFER_MTHD_CD                                      
******         , AVAIL_TS                                          
******         , BULK_ID                                           
******         , STAT_CD                                           
******         , SND_RCV_PRMSN_CD                                  
******         , MCIBDIO_PARM_TXT                                  
******         , PRTY_NUM                                          
******         , ARCH_LOC_TXT                                      
******         , SVR_FILE_STAT_CD                                  
******         , LST_STAT_TS                                       
******         , XFER_FILE_SZ_NUM                                  
******         , TMS_XFERD_CNT                                     
******         , XFER_REC_CNT                                      
******         , XFER_RQST_TS                                      
******         , XFER_STRT_TS                                      
******         , XFER_STOP_TS                                      
******         , XFER_RDY_TS                                       
******         , XFER_COND_CD                                      
******         , XFER_STAT_TXT                                     
******         , XFER_PRCSS_ID                                     
******         , ORG_XFER_PRCS_ID                                  
******         , TRGR_COND_CD                                      
******         , TRGR_STAT_TXT                                     
******         , ORG_LOC_NAM                                       
******         , LST_UPDT_USER_ID                                  
******         , LST_UPDT_TS                                       
******         , TRGR_ACT_NAM                                      
******         , PRV_MNFRM_FILE_NAM                                
******         , PRV_CYCL_NUM                                      
******         , PRV_BUS_PRTNR_ID                                  
******         , PRV_ENDPT_ID                                      
******         , PRV_AVAIL_TS                                      
******         , NXT_MNFRM_FILE_NAM                                
******         , NXT_CYCL_NUM                                      
******         , NXT_BUS_PRTNR_ID                                  
******         , NXT_ENDPT_ID                                      
******         , NXT_AVAIL_TS                                      
******         , APPL_EXIT_JOB_NAM                                 
******         , APPL_EXIT_TS                                      
******         , CS_MIP_ID                                         
******         , RM_MIP_ID                                         
******         , APPL_EXIT_NAM                                     
******         , TAPE_CMPLTD_SW                                    
******         , TAPE_MULT_VOL_SW                                  
******         , APPL_PRCSSNG_DT                                   
******         , TRANSITIONAL_DSN                                  
******         , SOURCE_HUB_ID                                     
******         , OWNING_HUB_ID                                     
******         , STAT_REF_ID                                       
******         , SRC_LOC_ENT_NAM                                   
******         , SRC_TASK_NAM                                      
******         , SRC_TASK_ID                                       
******         , SRC_TASK_USR                                      
******         , SRC_TASK_STRT_TS                                  
******         , SRC_TASK_STOP_TS                                  
******         , TRGT_LOC_ENT_NAM                                  
******         , TRGT_TASK_NAM                                     
******         , TRGT_TASK_ID                                      
******         , TRGT_TASK_USR                                     
******         , TRGT_TASK_STRT_TS                                 
******         , TRGT_TASK_STOP_TS                                 
******         , APPL_TKN_NAM                                      
******      FROM TARAFXS                                           
******     WHERE MC_MNFRM_FILE_NAM = :TARAFXS-MC-MNFRM-FILE-NAM    
******       AND CYCL_NUM          = :TARAFXS-CYCL-NUM             
******       AND BULK_ID           = :TARAFXS-BULK-ID              
******       AND STAT_CD           = :TARAFXS-STAT-CD              
******       AND APPL_EXIT_NAM     = :TARAFXS-APPL-EXIT-NAM        
******     ORDER BY ENDPT_ID                                       
**/
    public void openFxsInstallRowAr640010(Tarafxs tarafxs, Sqlca sqlca) throws Exception {

try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	fxsInstallRowResultSet = db2Base.startQuery(8/* SQL Sequence*/, CONSTANTS.LITERAL_AR640010)
    .withSql(SQLS.SQL_1350222514)
				.withInputs(tarafxs.getTarafxsMcMnfrmFileNam(),tarafxs.getTarafxsCyclNum(),tarafxs.getTarafxsBulkId(),tarafxs.getTarafxsStatCd(),tarafxs.getTarafxsApplExitNam())
				.withDataTypes(Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}


    }
// methodEnd:openFxsInstallRowAr640010
// methodStart:fetchFxsInstallRowAr640010
    
/**
******EXEC SQL FETCH FXS_INSTALL_ROW                               
******    INTO :TARAFXS-MC-MNFRM-FILE-NAM                          
******       , :TARAFXS-CYCL-NUM                                   
******       , :TARAFXS-BUS-PRTNR-ID                               
******       , :TARAFXS-ENDPT-ID                                   
******       , :TARAFXS-XFER-MTHD-CD                               
******       , :TARAFXS-AVAIL-TS                                   
******       , :TARAFXS-BULK-ID                                    
******       , :TARAFXS-STAT-CD                                    
******       , :TARAFXS-SND-RCV-PRMSN-CD                           
******       , :TARAFXS-MCIBDIO-PARM-TXT                           
******       , :TARAFXS-PRTY-NUM                                   
******       , :TARAFXS-ARCH-LOC-TXT                               
******         :TARAFXS-ARCH-LOC-TXT-N                             
******       , :TARAFXS-SVR-FILE-STAT-CD                           
******       , :TARAFXS-LST-STAT-TS                                
******         :TARAFXS-LST-STAT-TS-N                              
******       , :TARAFXS-XFER-FILE-SZ-NUM                           
******       , :TARAFXS-TMS-XFERD-CNT                              
******       , :TARAFXS-XFER-REC-CNT                               
******       , :TARAFXS-XFER-RQST-TS                               
******         :TARAFXS-XFER-RQST-TS-N                             
******       , :TARAFXS-XFER-STRT-TS                               
******         :TARAFXS-XFER-STRT-TS-N                             
******       , :TARAFXS-XFER-STOP-TS                               
******         :TARAFXS-XFER-STOP-TS-N                             
******       , :TARAFXS-XFER-RDY-TS                                
******         :TARAFXS-XFER-RDY-TS-N                              
******       , :TARAFXS-XFER-COND-CD                               
******         :TARAFXS-XFER-COND-CD-N                             
******       , :TARAFXS-XFER-STAT-TXT                              
******         :TARAFXS-XFER-STAT-TXT-N                            
******       , :TARAFXS-XFER-PRCSS-ID                              
******         :TARAFXS-XFER-PRCSS-ID-N                            
******       , :TARAFXS-ORG-XFER-PRCS-ID                           
******         :TARAFXS-ORG-XFER-PRCS-ID-N                         
******       , :TARAFXS-TRGR-COND-CD                               
******         :TARAFXS-TRGR-COND-CD-N                             
******       , :TARAFXS-TRGR-STAT-TXT                              
******         :TARAFXS-TRGR-STAT-TXT-N                            
******       , :TARAFXS-ORG-LOC-NAM                                
******         :TARAFXS-ORG-LOC-NAM-N                              
******       , :TARAFXS-LST-UPDT-USER-ID                           
******       , :TARAFXS-LST-UPDT-TS                                
******       , :TARAFXS-TRGR-ACT-NAM                               
******         :TARAFXS-TRGR-ACT-NAM-N                             
******       , :TARAFXS-PRV-MNFRM-FILE-NAM                         
******         :TARAFXS-PRV-MNFRM-FILE-NAM-N                       
******       , :TARAFXS-PRV-CYCL-NUM                               
******         :TARAFXS-PRV-CYCL-NUM-N                             
******       , :TARAFXS-PRV-BUS-PRTNR-ID                           
******         :TARAFXS-PRV-BUS-PRTNR-ID-N                         
******       , :TARAFXS-PRV-ENDPT-ID                               
******         :TARAFXS-PRV-ENDPT-ID-N                             
******       , :TARAFXS-PRV-AVAIL-TS                               
******         :TARAFXS-PRV-AVAIL-TS-N                             
******       , :TARAFXS-NXT-MNFRM-FILE-NAM                         
******         :TARAFXS-NXT-MNFRM-FILE-NAM-N                       
******       , :TARAFXS-NXT-CYCL-NUM                               
******         :TARAFXS-NXT-CYCL-NUM-N                             
******       , :TARAFXS-NXT-BUS-PRTNR-ID                           
******         :TARAFXS-NXT-BUS-PRTNR-ID-N                         
******       , :TARAFXS-NXT-ENDPT-ID                               
******         :TARAFXS-NXT-ENDPT-ID-N                             
******       , :TARAFXS-NXT-AVAIL-TS                               
******         :TARAFXS-NXT-AVAIL-TS-N                             
******       , :TARAFXS-APPL-EXIT-JOB-NAM                          
******         :TARAFXS-APPL-EXIT-JOB-NAM-N                        
******       , :TARAFXS-APPL-EXIT-TS                               
******         :TARAFXS-APPL-EXIT-TS-N                             
******       , :TARAFXS-CS-MIP-ID                                  
******         :TARAFXS-CS-MIP-ID-N                                
******       , :TARAFXS-RM-MIP-ID                                  
******         :TARAFXS-RM-MIP-ID-N                                
******       , :TARAFXS-APPL-EXIT-NAM                              
******         :TARAFXS-APPL-EXIT-NAM-N                            
******       , :TARAFXS-TAPE-CMPLTD-SW                             
******         :TARAFXS-TAPE-CMPLTD-SW-N                           
******       , :TARAFXS-TAPE-MULT-VOL-SW                           
******         :TARAFXS-TAPE-MULT-VOL-SW-N                         
******       , :TARAFXS-APPL-PRCSSNG-DT                            
******         :TARAFXS-APPL-PRCSSNG-DT-N                          
******       , :TARAFXS-TRANSITIONAL-DSN                           
******         :TARAFXS-TRANSITIONAL-DSN-N                         
******       , :TARAFXS-SOURCE-HUB-ID                              
******         :TARAFXS-SOURCE-HUB-ID-N                            
******       , :TARAFXS-OWNING-HUB-ID                              
******         :TARAFXS-OWNING-HUB-ID-N                            
******       , :TARAFXS-STAT-REF-ID                                
******         :TARAFXS-STAT-REF-ID-N                              
******       , :TARAFXS-SRC-LOC-ENT-NAM                            
******         :TARAFXS-SRC-LOC-ENT-NAM-N                          
******       , :TARAFXS-SRC-TASK-NAM                               
******         :TARAFXS-SRC-TASK-NAM-N                             
******       , :TARAFXS-SRC-TASK-ID                                
******         :TARAFXS-SRC-TASK-ID-N                              
******       , :TARAFXS-SRC-TASK-USR                               
******         :TARAFXS-SRC-TASK-USR-N                             
******       , :TARAFXS-SRC-TASK-STRT-TS                           
******         :TARAFXS-SRC-TASK-STRT-TS-N                         
******       , :TARAFXS-SRC-TASK-STOP-TS                           
******         :TARAFXS-SRC-TASK-STOP-TS-N                         
******       , :TARAFXS-TRGT-LOC-ENT-NAM                           
******         :TARAFXS-TRGT-LOC-ENT-NAM-N                         
******       , :TARAFXS-TRGT-TASK-NAM                              
******         :TARAFXS-TRGT-TASK-NAM-N                            
******       , :TARAFXS-TRGT-TASK-ID                               
******         :TARAFXS-TRGT-TASK-ID-N                             
******       , :TARAFXS-TRGT-TASK-USR                              
******         :TARAFXS-TRGT-TASK-USR-N                            
******       , :TARAFXS-TRGT-TASK-STRT-TS                          
******         :TARAFXS-TRGT-TASK-STRT-TS-N                        
******       , :TARAFXS-TRGT-TASK-STOP-TS                          
******         :TARAFXS-TRGT-TASK-STOP-TS-N                        
******       , :TARAFXS-APPL-TKN-NAM                               
******         :TARAFXS-APPL-TKN-NAM-N                             
**/
    public void fetchFxsInstallRowAr640010(Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception {
try {
	boolean hasResults = fxsInstallRowResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = fxsInstallRowResultSet.getObject(1);
 if (resultObj != null) {
   tarafxs.setTarafxsMcMnfrmFileNam( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsInstallRowResultSet.getObject(2);
 if (resultObj != null) {
   tarafxs.setTarafxsCyclNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsInstallRowResultSet.getObject(3);
 if (resultObj != null) {
   tarafxs.setTarafxsBusPrtnrId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsInstallRowResultSet.getObject(4);
 if (resultObj != null) {
   tarafxs.setTarafxsEndptId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsInstallRowResultSet.getObject(5);
 if (resultObj != null) {
   tarafxs.setTarafxsXferMthdCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = fxsInstallRowResultSet.getString(6);
 if (resultObjString != null) {
   tarafxs.setTarafxsAvailTs( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsInstallRowResultSet.getObject(7);
 if (resultObj != null) {
   tarafxs.setTarafxsBulkId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsInstallRowResultSet.getObject(8);
 if (resultObj != null) {
   tarafxs.setTarafxsStatCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsInstallRowResultSet.getObject(9);
 if (resultObj != null) {
   tarafxs.setTarafxsSndRcvPrmsnCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsInstallRowResultSet.getObject(10);
 if (resultObj != null) {
   tarafxs.setTarafxsMcibdioParmTxt( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsInstallRowResultSet.getObject(11);
 if (resultObj != null) {
   tarafxs.setTarafxsPrtyNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsInstallRowResultSet.getObject(12);
 if (resultObj != null) {
   itarafxs.setTarafxsArchLocTxtN( (short) 0);tarafxs.setTarafxsArchLocTxt( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsArchLocTxtN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(13);
 if (resultObj != null) {
   tarafxs.setTarafxsSvrFileStatCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = fxsInstallRowResultSet.getString(14);
 if (resultObjString != null) {
   itarafxs.setTarafxsLstStatTsN( (short) 0);tarafxs.setTarafxsLstStatTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsLstStatTsN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(15);
 if (resultObj != null) {
   tarafxs.setTarafxsXferFileSzNum( (Db2Base.castToBigDecimal(resultObj)).longValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsInstallRowResultSet.getObject(16);
 if (resultObj != null) {
   tarafxs.setTarafxsTmsXferdCnt( (Db2Base.castToBigDecimal(resultObj)).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = fxsInstallRowResultSet.getObject(17);
 if (resultObj != null) {
   tarafxs.setTarafxsXferRecCnt( (Db2Base.castToBigDecimal(resultObj)).longValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = fxsInstallRowResultSet.getString(18);
 if (resultObjString != null) {
   itarafxs.setTarafxsXferRqstTsN( (short) 0);tarafxs.setTarafxsXferRqstTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsXferRqstTsN( (short) -1);
 }
 resultObjString = fxsInstallRowResultSet.getString(19);
 if (resultObjString != null) {
   itarafxs.setTarafxsXferStrtTsN( (short) 0);tarafxs.setTarafxsXferStrtTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsXferStrtTsN( (short) -1);
 }
 resultObjString = fxsInstallRowResultSet.getString(20);
 if (resultObjString != null) {
   itarafxs.setTarafxsXferStopTsN( (short) 0);tarafxs.setTarafxsXferStopTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsXferStopTsN( (short) -1);
 }
 resultObjString = fxsInstallRowResultSet.getString(21);
 if (resultObjString != null) {
   itarafxs.setTarafxsXferRdyTsN( (short) 0);tarafxs.setTarafxsXferRdyTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsXferRdyTsN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(22);
 if (resultObj != null) {
   itarafxs.setTarafxsXferCondCdN( (short) 0);tarafxs.setTarafxsXferCondCd( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsXferCondCdN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(23);
 if (resultObj != null) {
   itarafxs.setTarafxsXferStatTxtN( (short) 0);tarafxs.setTarafxsXferStatTxt( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsXferStatTxtN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(24);
 if (resultObj != null) {
   itarafxs.setTarafxsXferPrcssIdN( (short) 0);tarafxs.setTarafxsXferPrcssId( (Db2Base.castToBigDecimal(resultObj)).longValue());
 } else {itarafxs.setTarafxsXferPrcssIdN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(25);
 if (resultObj != null) {
   itarafxs.setTarafxsOrgXferPrcsIdN( (short) 0);tarafxs.setTarafxsOrgXferPrcsId( (Db2Base.castToBigDecimal(resultObj)).longValue());
 } else {itarafxs.setTarafxsOrgXferPrcsIdN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(26);
 if (resultObj != null) {
   itarafxs.setTarafxsTrgrCondCdN( (short) 0);tarafxs.setTarafxsTrgrCondCd( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsTrgrCondCdN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(27);
 if (resultObj != null) {
   itarafxs.setTarafxsTrgrStatTxtN( (short) 0);tarafxs.setTarafxsTrgrStatTxt( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsTrgrStatTxtN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(28);
 if (resultObj != null) {
   itarafxs.setTarafxsOrgLocNamN( (short) 0);tarafxs.setTarafxsOrgLocNam( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsOrgLocNamN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(29);
 if (resultObj != null) {
   tarafxs.setTarafxsLstUpdtUserId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = fxsInstallRowResultSet.getString(30);
 if (resultObjString != null) {
   tarafxs.setTarafxsLstUpdtTs( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = fxsInstallRowResultSet.getString(31);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgrActNamN( (short) 0);tarafxs.setTarafxsTrgrActNam( db2Base.formatISOTime(resultObjString) );
 } else {itarafxs.setTarafxsTrgrActNamN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(32);
 if (resultObj != null) {
   itarafxs.setTarafxsPrvMnfrmFileNamN( (short) 0);tarafxs.setTarafxsPrvMnfrmFileNam( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsPrvMnfrmFileNamN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(33);
 if (resultObj != null) {
   itarafxs.setTarafxsPrvCyclNumN( (short) 0);tarafxs.setTarafxsPrvCyclNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
 } else {itarafxs.setTarafxsPrvCyclNumN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(34);
 if (resultObj != null) {
   itarafxs.setTarafxsPrvBusPrtnrIdN( (short) 0);tarafxs.setTarafxsPrvBusPrtnrId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsPrvBusPrtnrIdN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(35);
 if (resultObj != null) {
   itarafxs.setTarafxsPrvEndptIdN( (short) 0);tarafxs.setTarafxsPrvEndptId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsPrvEndptIdN( (short) -1);
 }
 resultObjString = fxsInstallRowResultSet.getString(36);
 if (resultObjString != null) {
   itarafxs.setTarafxsPrvAvailTsN( (short) 0);tarafxs.setTarafxsPrvAvailTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsPrvAvailTsN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(37);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtMnfrmFileNamN( (short) 0);tarafxs.setTarafxsNxtMnfrmFileNam( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsNxtMnfrmFileNamN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(38);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtCyclNumN( (short) 0);tarafxs.setTarafxsNxtCyclNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
 } else {itarafxs.setTarafxsNxtCyclNumN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(39);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtBusPrtnrIdN( (short) 0);tarafxs.setTarafxsNxtBusPrtnrId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsNxtBusPrtnrIdN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(40);
 if (resultObj != null) {
   itarafxs.setTarafxsNxtEndptIdN( (short) 0);tarafxs.setTarafxsNxtEndptId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsNxtEndptIdN( (short) -1);
 }
 resultObjString = fxsInstallRowResultSet.getString(41);
 if (resultObjString != null) {
   itarafxs.setTarafxsNxtAvailTsN( (short) 0);tarafxs.setTarafxsNxtAvailTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsNxtAvailTsN( (short) -1);
 }
 resultObjString = fxsInstallRowResultSet.getString(42);
 if (resultObjString != null) {
   itarafxs.setTarafxsApplExitJobNamN( (short) 0);tarafxs.setTarafxsApplExitJobNam( db2Base.formatISOTime(resultObjString) );
 } else {itarafxs.setTarafxsApplExitJobNamN( (short) -1);
 }
 resultObjString = fxsInstallRowResultSet.getString(43);
 if (resultObjString != null) {
   itarafxs.setTarafxsApplExitTsN( (short) 0);tarafxs.setTarafxsApplExitTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsApplExitTsN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(44);
 if (resultObj != null) {
   itarafxs.setTarafxsCsMipIdN( (short) 0);tarafxs.setTarafxsCsMipId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsCsMipIdN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(45);
 if (resultObj != null) {
   itarafxs.setTarafxsRmMipIdN( (short) 0);tarafxs.setTarafxsRmMipId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsRmMipIdN( (short) -1);
 }
 resultObjString = fxsInstallRowResultSet.getString(46);
 if (resultObjString != null) {
   itarafxs.setTarafxsApplExitNamN( (short) 0);tarafxs.setTarafxsApplExitNam( db2Base.formatISOTime(resultObjString) );
 } else {itarafxs.setTarafxsApplExitNamN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(47);
 if (resultObj != null) {
   itarafxs.setTarafxsTapeCmpltdSwN( (short) 0);tarafxs.setTarafxsTapeCmpltdSw( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsTapeCmpltdSwN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(48);
 if (resultObj != null) {
   itarafxs.setTarafxsTapeMultVolSwN( (short) 0);tarafxs.setTarafxsTapeMultVolSw( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsTapeMultVolSwN( (short) -1);
 }
 resultObjString = fxsInstallRowResultSet.getString(49);
 if (resultObjString != null) {
   itarafxs.setTarafxsApplPrcssngDtN( (short) 0);tarafxs.setTarafxsApplPrcssngDt( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsApplPrcssngDtN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(50);
 if (resultObj != null) {
   itarafxs.setTarafxsTransitionalDsnN( (short) 0);tarafxs.setTarafxsTransitionalDsn( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsTransitionalDsnN( (short) -1);
 }
 resultObjString = fxsInstallRowResultSet.getString(51);
 if (resultObjString != null) {
   itarafxs.setTarafxsSourceHubIdN( (short) 0);tarafxs.setTarafxsSourceHubId( db2Base.formatISOTime(resultObjString) );
 } else {itarafxs.setTarafxsSourceHubIdN( (short) -1);
 }
 resultObjString = fxsInstallRowResultSet.getString(52);
 if (resultObjString != null) {
   itarafxs.setTarafxsOwningHubIdN( (short) 0);tarafxs.setTarafxsOwningHubId( db2Base.formatISOTime(resultObjString) );
 } else {itarafxs.setTarafxsOwningHubIdN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(53);
 if (resultObj != null) {
   itarafxs.setTarafxsStatRefIdN( (short) 0);tarafxs.setTarafxsStatRefId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsStatRefIdN( (short) -1);
 }
 resultObjString = fxsInstallRowResultSet.getString(54);
 if (resultObjString != null) {
   itarafxs.setTarafxsSrcLocEntNamN( (short) 0);tarafxs.setTarafxsSrcLocEntNam( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsSrcLocEntNamN( (short) -1);
 }
 resultObjString = fxsInstallRowResultSet.getString(55);
 if (resultObjString != null) {
   itarafxs.setTarafxsSrcTaskNamN( (short) 0);tarafxs.setTarafxsSrcTaskNam( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsSrcTaskNamN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(56);
 if (resultObj != null) {
   itarafxs.setTarafxsSrcTaskIdN( (short) 0);tarafxs.setTarafxsSrcTaskId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsSrcTaskIdN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(57);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   tarafxs.setTarafxsSrcTaskUsr( value,0, value.length,2,value.length);
   tarafxs.getTarafxsSrcTaskUsr().setTarafxsSrcTaskUsrLen((short) value.length);
if (itarafxs.getTarafxsSrcTaskUsrN() != 0) itarafxs.setTarafxsSrcTaskUsrN( (short) 0);
 } else itarafxs.setTarafxsSrcTaskUsrN((short) -1 );
 resultObjString = fxsInstallRowResultSet.getString(58);
 if (resultObjString != null) {
   itarafxs.setTarafxsSrcTaskStrtTsN( (short) 0);tarafxs.setTarafxsSrcTaskStrtTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsSrcTaskStrtTsN( (short) -1);
 }
 resultObjString = fxsInstallRowResultSet.getString(59);
 if (resultObjString != null) {
   itarafxs.setTarafxsSrcTaskStopTsN( (short) 0);tarafxs.setTarafxsSrcTaskStopTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsSrcTaskStopTsN( (short) -1);
 }
 resultObjString = fxsInstallRowResultSet.getString(60);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtLocEntNamN( (short) 0);tarafxs.setTarafxsTrgtLocEntNam( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtLocEntNamN( (short) -1);
 }
 resultObjString = fxsInstallRowResultSet.getString(61);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtTaskNamN( (short) 0);tarafxs.setTarafxsTrgtTaskNam( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskNamN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(62);
 if (resultObj != null) {
   itarafxs.setTarafxsTrgtTaskIdN( (short) 0);tarafxs.setTarafxsTrgtTaskId( resultObj.toString().toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskIdN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(63);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   tarafxs.setTarafxsTrgtTaskUsr( value,0, value.length,2,value.length);
   tarafxs.getTarafxsTrgtTaskUsr().setTarafxsTrgtTaskUsrLen((short) value.length);
if (itarafxs.getTarafxsTrgtTaskUsrN() != 0) itarafxs.setTarafxsTrgtTaskUsrN( (short) 0);
 } else itarafxs.setTarafxsTrgtTaskUsrN((short) -1 );
 resultObjString = fxsInstallRowResultSet.getString(64);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtTaskStrtTsN( (short) 0);tarafxs.setTarafxsTrgtTaskStrtTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskStrtTsN( (short) -1);
 }
 resultObjString = fxsInstallRowResultSet.getString(65);
 if (resultObjString != null) {
   itarafxs.setTarafxsTrgtTaskStopTsN( (short) 0);tarafxs.setTarafxsTrgtTaskStopTs( resultObjString.toCharArray() );
 } else {itarafxs.setTarafxsTrgtTaskStopTsN( (short) -1);
 }
 resultObj = fxsInstallRowResultSet.getObject(66);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   tarafxs.setTarafxsApplTknNam( value,0, value.length,2,value.length);
   tarafxs.getTarafxsApplTknNam().setTarafxsApplTknNamLen((short) value.length);
if (itarafxs.getTarafxsApplTknNamN() != 0) itarafxs.setTarafxsApplTknNamN( (short) 0);
 } else itarafxs.setTarafxsApplTknNamN((short) -1 );
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
 		logger.error("fxsInstallRowResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchFxsInstallRowAr640010
// methodStart:closeFxsInstallRowAr640010
    
/**
******    EXEC SQL CLOSE FXS_INSTALL_ROW END-EXEC                  
**/
    public void closeFxsInstallRowAr640010(Sqlca sqlca) throws Exception {


    sqlca.setSqlcode(0);
	db2Base.updateFetchCounter(sqlFetchCounter);
    }
// methodEnd:closeFxsInstallRowAr640010
// methodStart:release
    
/**
******         RELEASE :630-CONNECT-GFT-DBID                       
**/
    public void release(ConnectDatabaseMsg630 connectDatabaseMsg630, Sqlca sqlca) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(43/* SQL Sequence*/,CONSTANTS.LITERAL_AR640010)
    .withInputs(connectDatabaseMsg630.getConnectGftDbid630())
				.withDataTypes(Types.CHAR)
				.withInputs(connectDatabaseMsg630.getConnectGftDbid630())
				.withDataTypes(Types.CHAR)
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
// methodEnd:release
// methodStart:selectTarafpl1
    
/**
******         SELECT TTL_NAM                                      
******              , PRTY_NUM                                     
******              , ALCTN_SPC_TYPE_CD                            
******              , ALCTN_SPC_PRIM_NUM                           
******              , SND_RCV_PRMSN_CD                             
******              , REC_LEN_NUM                                  
******              , REC_FRMT_CD                                  
******              , BULK_FILE_SZ_NUM                             
******              , SYSTEM_ID                                    
******              , APP_ENDPT_ID                                 
******                                                             
******          INTO :TARAFPL-TTL-NAM                              
******             , :TARAFPL-PRTY-NUM                             
******             , :TARAFPL-ALCTN-SPC-TYPE-CD                    
******             , :TARAFPL-ALCTN-SPC-PRIM-NUM                   
******             , :TARAFPL-SND-RCV-PRMSN-CD                     
******             , :TARAFPL-REC-LEN-NUM                          
******             , :TARAFPL-REC-FRMT-CD                          
******             , :TARAFPL-BULK-FILE-SZ-NUM                     
******             , :TARAFPL-SYSTEM-ID                            
******             , :TARAFPL-APP-ENDPT-ID                         
******               :TARAFPL-APP-ENDPT-ID-N                       
******                                                             
******         FROM  TARAFPL                                       
******                                                             
******        WHERE  BULK_ID     = :TARAFPL-BULK-ID                
******          AND  EFF_FROM_TS <= CURRENT_TIMESTAMP              
******          AND (EFF_TO_TS   IS NULL                           
******           OR  EFF_TO_TS   >= CURRENT_TIMESTAMP)             
**/
    public void selectTarafpl1(Sqlca sqlca, Tarafpl tarafpl, Itarafpl itarafpl) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(46/* SQL Sequence*/, CONSTANTS.LITERAL_AR640010)
.withSql(SQLS.SQL_1197547915)
				.withInputs(tarafpl.getTarafplBulkId())
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
   tarafpl.setTarafplTtlNam( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(2);
 if (resultObj != null) {
   tarafpl.setTarafplPrtyNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(3);
 if (resultObj != null) {
   tarafpl.setTarafplAlctnSpcTypeCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(4);
 if (resultObj != null) {
   tarafpl.setTarafplAlctnSpcPrimNum( (Db2Base.castToBigDecimal(resultObj)).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(5);
 if (resultObj != null) {
   tarafpl.setTarafplSndRcvPrmsnCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(6);
 if (resultObj != null) {
   tarafpl.setTarafplRecLenNum( (Db2Base.castToBigDecimal(resultObj)).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(7);
 if (resultObj != null) {
   tarafpl.setTarafplRecFrmtCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(8);
 if (resultObj != null) {
   tarafpl.setTarafplBulkFileSzNum( (Db2Base.castToBigDecimal(resultObj)).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(9);
 if (resultObj != null) {
   tarafpl.setTarafplSystemId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(10);
 if (resultObj != null) {
   itarafpl.setTarafplAppEndptIdN( (short) 0);tarafpl.setTarafplAppEndptId( resultObj.toString().toCharArray() );
 } else {itarafpl.setTarafplAppEndptIdN( (short) -1);
 }
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
// methodEnd:selectTarafpl1
// methodStart:selectTarafxs15
    
/**
******    EXEC SQL SELECT LST_UPDT_USER_ID                         
******                  , LST_UPDT_TS                              
******              INTO :TARAFXS-LST-UPDT-USER-ID                 
******                 , :TARAFXS-LST-UPDT-TS                      
******              FROM TARAFXS                                   
******             WHERE MC_MNFRM_FILE_NAM = :850-DYNAM-DSN        
******             FETCH FIRST 1 ROW ONLY                          
**/
    public void selectTarafxs15(Tarafxs tarafxs, Sqlca sqlca, DynamWorkAreas850 dynamWorkAreas850) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(47/* SQL Sequence*/, CONSTANTS.LITERAL_AR640010)
.withSql(SQLS.SQL_850419232)
				.withInputs(dynamWorkAreas850.getDynamAllocParms850().getDynamDsn850())
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
   tarafxs.setTarafxsLstUpdtUserId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(2);
 if (resultObjString != null) {
   tarafxs.setTarafxsLstUpdtTs( resultObjString.toCharArray() );
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
// methodEnd:selectTarafxs15
// methodStart:fetchEfpBulkRowAr640010
    
/**
******EXEC SQL FETCH EFP_BULK_ROW                                  
******    INTO :TARAEFP-ENDPT-ID                                   
******       , :TARAEFP-APP-FILE-RTN-NUM                           
******       , :TARAEFP-PRTY-NUM                                   
******       , :TARAEFP-TRNSLTN-SW                                 
******       , :TARAEFP-TRNSLTN-RTN-NAM                            
******       , :TARAEFP-XFER-TYPE-CD                               
******       , :TARAEFP-STATUS-CD                                  
******         :TARAEFP-STATUS-CD-N                                
**/
    public void fetchEfpBulkRowAr640010(Itaraefp itaraefp, Taraefp taraefp, Sqlca sqlca) throws Exception {
try {
	boolean hasResults = efpBulkRowResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = efpBulkRowResultSet.getObject(1);
 if (resultObj != null) {
   taraefp.setTaraefpEndptId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = efpBulkRowResultSet.getObject(2);
 if (resultObj != null) {
   taraefp.setTaraefpAppFileRtnNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = efpBulkRowResultSet.getObject(3);
 if (resultObj != null) {
   taraefp.setTaraefpPrtyNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = efpBulkRowResultSet.getObject(4);
 if (resultObj != null) {
   taraefp.setTaraefpTrnsltnSw( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = efpBulkRowResultSet.getObject(5);
 if (resultObj != null) {
   taraefp.setTaraefpTrnsltnRtnNam( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = efpBulkRowResultSet.getObject(6);
 if (resultObj != null) {
   taraefp.setTaraefpXferTypeCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = efpBulkRowResultSet.getObject(7);
 if (resultObj != null) {
   itaraefp.setTaraefpStatusCdN( (short) 0);taraefp.setTaraefpStatusCd( resultObj.toString().toCharArray() );
 } else {itaraefp.setTaraefpStatusCdN( (short) -1);
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
 		logger.error("efpBulkRowResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchEfpBulkRowAr640010
// methodStart:updateTarafxs1
    
/**
******      UPDATE TARAFXS                                         
******                                                             
******       SET STAT_CD            = :TARAFXS-STAT-CD             
******         , XFER_RDY_TS        = :TARAFXS-XFER-RDY-TS         
******                                :TARAFXS-XFER-RDY-TS-N       
******         , LST_UPDT_USER_ID   = :TARAFXS-LST-UPDT-USER-ID    
******         , LST_UPDT_TS        = :TARAFXS-LST-UPDT-TS         
******         , NXT_MNFRM_FILE_NAM = :TARAFXS-NXT-MNFRM-FILE-NAM  
******                                :TARAFXS-NXT-MNFRM-FILE-NAM-N
******         , NXT_CYCL_NUM       = :TARAFXS-NXT-CYCL-NUM        
******                                :TARAFXS-NXT-CYCL-NUM-N      
******         , NXT_BUS_PRTNR_ID   = :TARAFXS-NXT-BUS-PRTNR-ID    
******                                :TARAFXS-NXT-BUS-PRTNR-ID-N  
******         , NXT_ENDPT_ID       = :TARAFXS-NXT-ENDPT-ID        
******                                :TARAFXS-NXT-ENDPT-ID-N      
******         , NXT_AVAIL_TS       = :TARAFXS-NXT-AVAIL-TS        
******                                :TARAFXS-NXT-AVAIL-TS-N      
******         , APPL_EXIT_NAM      = :TARAFXS-APPL-EXIT-NAM       
******                                :TARAFXS-APPL-EXIT-NAM-N     
******         , STAT_REF_ID        = :TARAFXS-STAT-REF-ID         
******         , TRGT_LOC_ENT_NAM   = :TARAFXS-TRGT-LOC-ENT-NAM    
******                                :TARAFXS-TRGT-LOC-ENT-NAM-N  
******         , TRGT_TASK_NAM      = :TARAFXS-TRGT-TASK-NAM       
******                                :TARAFXS-TRGT-TASK-NAM-N     
******         , TRGT_TASK_ID       = :TARAFXS-TRGT-TASK-ID        
******                                :TARAFXS-TRGT-TASK-ID-N      
******         , TRGT_TASK_USR      = :TARAFXS-TRGT-TASK-USR       
******                                :TARAFXS-TRGT-TASK-USR-N     
******         , TRGT_TASK_STRT_TS  = :TARAFXS-TRGT-TASK-STRT-TS   
******                                :TARAFXS-TRGT-TASK-STRT-TS-N 
******         , TRGT_TASK_STOP_TS  = :TARAFXS-TRGT-TASK-STOP-TS   
******                                :TARAFXS-TRGT-TASK-STOP-TS-N 
******                                                             
******     WHERE MC_MNFRM_FILE_NAM  = :TARAFXS-MC-MNFRM-FILE-NAM   
******       AND CYCL_NUM           = :TARAFXS-CYCL-NUM            
******       AND BUS_PRTNR_ID       = :TARAFXS-BUS-PRTNR-ID        
******       AND ENDPT_ID           = :TARAFXS-ENDPT-ID            
******       AND BULK_ID            = :TARAFXS-BULK-ID             
******       AND STAT_CD            = :840-OLD-STAT-CD             
******       AND LST_UPDT_TS        = :840-OLD-LST-UPDT-TS         
**/
    public void updateTarafxs1(SqlWorkAreas840 sqlWorkAreas840, Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(49/* SQL Sequence*/,CONSTANTS.LITERAL_AR640010)
    .withSql(SQLS.SQL_752334200)
				.withInputs(tarafxs.getTarafxsStatCd(),tarafxs.getTarafxsXferRdyTs(),tarafxs.getTarafxsLstUpdtUserId(),tarafxs.getTarafxsLstUpdtTs(),tarafxs.getTarafxsNxtMnfrmFileNam(),tarafxs.getTarafxsNxtCyclNum(),tarafxs.getTarafxsNxtBusPrtnrId(),tarafxs.getTarafxsNxtEndptId(),tarafxs.getTarafxsNxtAvailTs(),tarafxs.getTarafxsApplExitNam(),tarafxs.getTarafxsStatRefId(),tarafxs.getTarafxsTrgtLocEntNam(),tarafxs.getTarafxsTrgtTaskNam(),tarafxs.getTarafxsTrgtTaskId(),tarafxs.getTarafxsTrgtTaskUsr(),tarafxs.getTarafxsTrgtTaskStrtTs(),tarafxs.getTarafxsTrgtTaskStopTs(),tarafxs.getTarafxsMcMnfrmFileNam(),tarafxs.getTarafxsCyclNum(),tarafxs.getTarafxsBusPrtnrId(),tarafxs.getTarafxsEndptId(),tarafxs.getTarafxsBulkId(),sqlWorkAreas840.getOldStatCd840(),sqlWorkAreas840.getOldLstUpdtTs840())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.VARCHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
				.withNullIndicators(NOT_NULL,itarafxs.getTarafxsXferRdyTsN(),NOT_NULL,NOT_NULL,itarafxs.getTarafxsNxtMnfrmFileNamN(),itarafxs.getTarafxsNxtCyclNumN(),itarafxs.getTarafxsNxtBusPrtnrIdN(),itarafxs.getTarafxsNxtEndptIdN(),itarafxs.getTarafxsNxtAvailTsN(),itarafxs.getTarafxsApplExitNamN(),NOT_NULL,itarafxs.getTarafxsTrgtLocEntNamN(),itarafxs.getTarafxsTrgtTaskNamN(),itarafxs.getTarafxsTrgtTaskIdN(),itarafxs.getTarafxsTrgtTaskUsrN(),itarafxs.getTarafxsTrgtTaskStrtTsN(),itarafxs.getTarafxsTrgtTaskStopTsN(),NOT_NULL,NOT_NULL,NOT_NULL,NOT_NULL,NOT_NULL,NOT_NULL,NOT_NULL)
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
// methodEnd:updateTarafxs1
// methodStart:insertTarafxs1
    
/**
******    EXEC SQL INSERT INTO TARAFXS                             
******        ( MC_MNFRM_FILE_NAM                                  
******        , CYCL_NUM                                           
******        , BUS_PRTNR_ID                                       
******        , ENDPT_ID                                           
******        , XFER_MTHD_CD                                       
******        , AVAIL_TS                                           
******        , BULK_ID                                            
******        , STAT_CD                                            
******        , SND_RCV_PRMSN_CD                                   
******        , MCIBDIO_PARM_TXT                                   
******        , PRTY_NUM                                           
******        , ARCH_LOC_TXT                                       
******        , SVR_FILE_STAT_CD                                   
******        , LST_STAT_TS                                        
******        , XFER_FILE_SZ_NUM                                   
******        , TMS_XFERD_CNT                                      
******        , XFER_REC_CNT                                       
******        , XFER_RQST_TS                                       
******        , XFER_STRT_TS                                       
******        , XFER_STOP_TS                                       
******        , XFER_RDY_TS                                        
******        , XFER_COND_CD                                       
******        , XFER_STAT_TXT                                      
******        , XFER_PRCSS_ID                                      
******        , ORG_XFER_PRCS_ID                                   
******        , TRGR_COND_CD                                       
******        , TRGR_STAT_TXT                                      
******        , ORG_LOC_NAM                                        
******        , LST_UPDT_USER_ID                                   
******        , LST_UPDT_TS                                        
******        , TRGR_ACT_NAM                                       
******        , PRV_MNFRM_FILE_NAM                                 
******        , PRV_CYCL_NUM                                       
******        , PRV_BUS_PRTNR_ID                                   
******        , PRV_ENDPT_ID                                       
******        , PRV_AVAIL_TS                                       
******        , NXT_MNFRM_FILE_NAM                                 
******        , NXT_CYCL_NUM                                       
******        , NXT_BUS_PRTNR_ID                                   
******        , NXT_ENDPT_ID                                       
******        , NXT_AVAIL_TS                                       
******        , APPL_EXIT_JOB_NAM                                  
******        , APPL_EXIT_TS                                       
******        , CS_MIP_ID                                          
******        , RM_MIP_ID                                          
******        , APPL_EXIT_NAM                                      
******        , TAPE_CMPLTD_SW                                     
******        , TAPE_MULT_VOL_SW                                   
******        , APPL_PRCSSNG_DT                                    
******        , TRANSITIONAL_DSN                                   
******        , SOURCE_HUB_ID                                      
******        , OWNING_HUB_ID                                      
******        , STAT_REF_ID                                        
******        , SRC_LOC_ENT_NAM                                    
******        , SRC_TASK_NAM                                       
******        , SRC_TASK_ID                                        
******        , SRC_TASK_USR                                       
******        , SRC_TASK_STRT_TS                                   
******        , SRC_TASK_STOP_TS                                   
******        , TRGT_LOC_ENT_NAM                                   
******        , TRGT_TASK_NAM                                      
******        , TRGT_TASK_ID                                       
******        , TRGT_TASK_USR                                      
******        , TRGT_TASK_STRT_TS                                  
******        , TRGT_TASK_STOP_TS                                  
******        , APPL_TKN_NAM                                       
******        )                                                    
******    VALUES                                                   
******       ( :TARAFXS-MC-MNFRM-FILE-NAM                          
******       , :TARAFXS-CYCL-NUM                                   
******       , :TARAFXS-BUS-PRTNR-ID                               
******       , :TARAFXS-ENDPT-ID                                   
******       , :TARAFXS-XFER-MTHD-CD                               
******       , :TARAFXS-AVAIL-TS                                   
******       , :TARAFXS-BULK-ID                                    
******       , :TARAFXS-STAT-CD                                    
******       , :TARAFXS-SND-RCV-PRMSN-CD                           
******       , :TARAFXS-MCIBDIO-PARM-TXT                           
******       , :TARAFXS-PRTY-NUM                                   
******       , :TARAFXS-ARCH-LOC-TXT                               
******         :TARAFXS-ARCH-LOC-TXT-N                             
******       , :TARAFXS-SVR-FILE-STAT-CD                           
******       , :TARAFXS-LST-STAT-TS                                
******         :TARAFXS-LST-STAT-TS-N                              
******       , :TARAFXS-XFER-FILE-SZ-NUM                           
******       , :TARAFXS-TMS-XFERD-CNT                              
******       , :TARAFXS-XFER-REC-CNT                               
******       , :TARAFXS-XFER-RQST-TS                               
******         :TARAFXS-XFER-RQST-TS-N                             
******       , :TARAFXS-XFER-STRT-TS                               
******         :TARAFXS-XFER-STRT-TS-N                             
******       , :TARAFXS-XFER-STOP-TS                               
******         :TARAFXS-XFER-STOP-TS-N                             
******       , :TARAFXS-XFER-RDY-TS                                
******         :TARAFXS-XFER-RDY-TS-N                              
******       , :TARAFXS-XFER-COND-CD                               
******         :TARAFXS-XFER-COND-CD-N                             
******       , :TARAFXS-XFER-STAT-TXT                              
******         :TARAFXS-XFER-STAT-TXT-N                            
******       , :TARAFXS-XFER-PRCSS-ID                              
******         :TARAFXS-XFER-PRCSS-ID-N                            
******       , :TARAFXS-ORG-XFER-PRCS-ID                           
******         :TARAFXS-ORG-XFER-PRCS-ID-N                         
******       , :TARAFXS-TRGR-COND-CD                               
******         :TARAFXS-TRGR-COND-CD-N                             
******       , :TARAFXS-TRGR-STAT-TXT                              
******         :TARAFXS-TRGR-STAT-TXT-N                            
******       , :TARAFXS-ORG-LOC-NAM                                
******         :TARAFXS-ORG-LOC-NAM-N                              
******       , :TARAFXS-LST-UPDT-USER-ID                           
******       , :TARAFXS-LST-UPDT-TS                                
******       , :TARAFXS-TRGR-ACT-NAM                               
******         :TARAFXS-TRGR-ACT-NAM-N                             
******       , :TARAFXS-PRV-MNFRM-FILE-NAM                         
******         :TARAFXS-PRV-MNFRM-FILE-NAM-N                       
******       , :TARAFXS-PRV-CYCL-NUM                               
******         :TARAFXS-PRV-CYCL-NUM-N                             
******       , :TARAFXS-PRV-BUS-PRTNR-ID                           
******         :TARAFXS-PRV-BUS-PRTNR-ID-N                         
******       , :TARAFXS-PRV-ENDPT-ID                               
******         :TARAFXS-PRV-ENDPT-ID-N                             
******       , :TARAFXS-PRV-AVAIL-TS                               
******         :TARAFXS-PRV-AVAIL-TS-N                             
******       , :TARAFXS-NXT-MNFRM-FILE-NAM                         
******         :TARAFXS-NXT-MNFRM-FILE-NAM-N                       
******       , :TARAFXS-NXT-CYCL-NUM                               
******         :TARAFXS-NXT-CYCL-NUM-N                             
******       , :TARAFXS-NXT-BUS-PRTNR-ID                           
******         :TARAFXS-NXT-BUS-PRTNR-ID-N                         
******       , :TARAFXS-NXT-ENDPT-ID                               
******         :TARAFXS-NXT-ENDPT-ID-N                             
******       , :TARAFXS-NXT-AVAIL-TS                               
******         :TARAFXS-NXT-AVAIL-TS-N                             
******       , :TARAFXS-APPL-EXIT-JOB-NAM                          
******         :TARAFXS-APPL-EXIT-JOB-NAM-N                        
******       , :TARAFXS-APPL-EXIT-TS                               
******         :TARAFXS-APPL-EXIT-TS-N                             
******       , :TARAFXS-CS-MIP-ID                                  
******         :TARAFXS-CS-MIP-ID-N                                
******       , :TARAFXS-RM-MIP-ID                                  
******         :TARAFXS-RM-MIP-ID-N                                
******       , :TARAFXS-APPL-EXIT-NAM                              
******         :TARAFXS-APPL-EXIT-NAM-N                            
******       , :TARAFXS-TAPE-CMPLTD-SW                             
******         :TARAFXS-TAPE-CMPLTD-SW-N                           
******       , :TARAFXS-TAPE-MULT-VOL-SW                           
******         :TARAFXS-TAPE-MULT-VOL-SW-N                         
******       , :TARAFXS-APPL-PRCSSNG-DT                            
******         :TARAFXS-APPL-PRCSSNG-DT-N                          
******       , :TARAFXS-TRANSITIONAL-DSN                           
******         :TARAFXS-TRANSITIONAL-DSN-N                         
******       , :TARAFXS-SOURCE-HUB-ID                              
******         :TARAFXS-SOURCE-HUB-ID-N                            
******       , :TARAFXS-OWNING-HUB-ID                              
******         :TARAFXS-OWNING-HUB-ID-N                            
******       , :TARAFXS-STAT-REF-ID                                
******         :TARAFXS-STAT-REF-ID-N                              
******       , :TARAFXS-SRC-LOC-ENT-NAM                            
******         :TARAFXS-SRC-LOC-ENT-NAM-N                          
******       , :TARAFXS-SRC-TASK-NAM                               
******         :TARAFXS-SRC-TASK-NAM-N                             
******       , :TARAFXS-SRC-TASK-ID                                
******         :TARAFXS-SRC-TASK-ID-N                              
******       , :TARAFXS-SRC-TASK-USR                               
******         :TARAFXS-SRC-TASK-USR-N                             
******       , :TARAFXS-SRC-TASK-STRT-TS                           
******         :TARAFXS-SRC-TASK-STRT-TS-N                         
******       , :TARAFXS-SRC-TASK-STOP-TS                           
******         :TARAFXS-SRC-TASK-STOP-TS-N                         
******       , :TARAFXS-TRGT-LOC-ENT-NAM                           
******         :TARAFXS-TRGT-LOC-ENT-NAM-N                         
******       , :TARAFXS-TRGT-TASK-NAM                              
******         :TARAFXS-TRGT-TASK-NAM-N                            
******       , :TARAFXS-TRGT-TASK-ID                               
******         :TARAFXS-TRGT-TASK-ID-N                             
******       , :TARAFXS-TRGT-TASK-USR                              
******         :TARAFXS-TRGT-TASK-USR-N                            
******       , :TARAFXS-TRGT-TASK-STRT-TS                          
******         :TARAFXS-TRGT-TASK-STRT-TS-N                        
******       , :TARAFXS-TRGT-TASK-STOP-TS                          
******         :TARAFXS-TRGT-TASK-STOP-TS-N                        
******       , :TARAFXS-APPL-TKN-NAM                               
******         :TARAFXS-APPL-TKN-NAM-N                             
******       )                                                     
**/
    public void insertTarafxs1(Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(50/* SQL Sequence*/,CONSTANTS.LITERAL_AR640010)
    .withSql(SQLS.SQL_158149272)
				.withInputs(tarafxs.getTarafxsMcMnfrmFileNam(),tarafxs.getTarafxsCyclNum(),tarafxs.getTarafxsBusPrtnrId(),tarafxs.getTarafxsEndptId(),tarafxs.getTarafxsXferMthdCd(),tarafxs.getTarafxsAvailTs(),tarafxs.getTarafxsBulkId(),tarafxs.getTarafxsStatCd(),tarafxs.getTarafxsSndRcvPrmsnCd(),tarafxs.getTarafxsMcibdioParmTxt(),tarafxs.getTarafxsPrtyNum(),tarafxs.getTarafxsArchLocTxt(),tarafxs.getTarafxsSvrFileStatCd(),tarafxs.getTarafxsLstStatTs(),tarafxs.getTarafxsXferFileSzNum(),tarafxs.getTarafxsTmsXferdCnt(),tarafxs.getTarafxsXferRecCnt(),tarafxs.getTarafxsXferRqstTs(),tarafxs.getTarafxsXferStrtTs(),tarafxs.getTarafxsXferStopTs(),tarafxs.getTarafxsXferRdyTs(),tarafxs.getTarafxsXferCondCd(),tarafxs.getTarafxsXferStatTxt(),tarafxs.getTarafxsXferPrcssId(),tarafxs.getTarafxsOrgXferPrcsId(),tarafxs.getTarafxsTrgrCondCd(),tarafxs.getTarafxsTrgrStatTxt(),tarafxs.getTarafxsOrgLocNam(),tarafxs.getTarafxsLstUpdtUserId(),tarafxs.getTarafxsLstUpdtTs(),tarafxs.getTarafxsTrgrActNam(),tarafxs.getTarafxsPrvMnfrmFileNam(),tarafxs.getTarafxsPrvCyclNum(),tarafxs.getTarafxsPrvBusPrtnrId(),tarafxs.getTarafxsPrvEndptId(),tarafxs.getTarafxsPrvAvailTs(),tarafxs.getTarafxsNxtMnfrmFileNam(),tarafxs.getTarafxsNxtCyclNum(),tarafxs.getTarafxsNxtBusPrtnrId(),tarafxs.getTarafxsNxtEndptId(),tarafxs.getTarafxsNxtAvailTs(),tarafxs.getTarafxsApplExitJobNam(),tarafxs.getTarafxsApplExitTs(),tarafxs.getTarafxsCsMipId(),tarafxs.getTarafxsRmMipId(),tarafxs.getTarafxsApplExitNam(),tarafxs.getTarafxsTapeCmpltdSw(),tarafxs.getTarafxsTapeMultVolSw(),tarafxs.getTarafxsApplPrcssngDt(),tarafxs.getTarafxsTransitionalDsn(),tarafxs.getTarafxsSourceHubId(),tarafxs.getTarafxsOwningHubId(),tarafxs.getTarafxsStatRefId(),tarafxs.getTarafxsSrcLocEntNam(),tarafxs.getTarafxsSrcTaskNam(),tarafxs.getTarafxsSrcTaskId(),tarafxs.getTarafxsSrcTaskUsr(),tarafxs.getTarafxsSrcTaskStrtTs(),tarafxs.getTarafxsSrcTaskStopTs(),tarafxs.getTarafxsTrgtLocEntNam(),tarafxs.getTarafxsTrgtTaskNam(),tarafxs.getTarafxsTrgtTaskId(),tarafxs.getTarafxsTrgtTaskUsr(),tarafxs.getTarafxsTrgtTaskStrtTs(),tarafxs.getTarafxsTrgtTaskStopTs(),tarafxs.getTarafxsApplTknNam())
				.withDataTypes(Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.BIGINT,Types.INTEGER,Types.BIGINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.BIGINT,Types.BIGINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.VARCHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.VARCHAR,Types.CHAR,Types.CHAR,Types.VARCHAR)
				.withNullIndicators(NOT_NULL,NOT_NULL,NOT_NULL,NOT_NULL,NOT_NULL,NOT_NULL,NOT_NULL,NOT_NULL,NOT_NULL,NOT_NULL,NOT_NULL,itarafxs.getTarafxsArchLocTxtN(),NOT_NULL,itarafxs.getTarafxsLstStatTsN(),NOT_NULL,NOT_NULL,NOT_NULL,itarafxs.getTarafxsXferRqstTsN(),itarafxs.getTarafxsXferStrtTsN(),itarafxs.getTarafxsXferStopTsN(),itarafxs.getTarafxsXferRdyTsN(),itarafxs.getTarafxsXferCondCdN(),itarafxs.getTarafxsXferStatTxtN(),itarafxs.getTarafxsXferPrcssIdN(),itarafxs.getTarafxsOrgXferPrcsIdN(),itarafxs.getTarafxsTrgrCondCdN(),itarafxs.getTarafxsTrgrStatTxtN(),itarafxs.getTarafxsOrgLocNamN(),NOT_NULL,NOT_NULL,itarafxs.getTarafxsTrgrActNamN(),itarafxs.getTarafxsPrvMnfrmFileNamN(),itarafxs.getTarafxsPrvCyclNumN(),itarafxs.getTarafxsPrvBusPrtnrIdN(),itarafxs.getTarafxsPrvEndptIdN(),itarafxs.getTarafxsPrvAvailTsN(),itarafxs.getTarafxsNxtMnfrmFileNamN(),itarafxs.getTarafxsNxtCyclNumN(),itarafxs.getTarafxsNxtBusPrtnrIdN(),itarafxs.getTarafxsNxtEndptIdN(),itarafxs.getTarafxsNxtAvailTsN(),itarafxs.getTarafxsApplExitJobNamN(),itarafxs.getTarafxsApplExitTsN(),itarafxs.getTarafxsCsMipIdN(),itarafxs.getTarafxsRmMipIdN(),itarafxs.getTarafxsApplExitNamN(),itarafxs.getTarafxsTapeCmpltdSwN(),itarafxs.getTarafxsTapeMultVolSwN(),itarafxs.getTarafxsApplPrcssngDtN(),itarafxs.getTarafxsTransitionalDsnN(),itarafxs.getTarafxsSourceHubIdN(),itarafxs.getTarafxsOwningHubIdN(),itarafxs.getTarafxsStatRefIdN(),itarafxs.getTarafxsSrcLocEntNamN(),itarafxs.getTarafxsSrcTaskNamN(),itarafxs.getTarafxsSrcTaskIdN(),itarafxs.getTarafxsSrcTaskUsrN(),itarafxs.getTarafxsSrcTaskStrtTsN(),itarafxs.getTarafxsSrcTaskStopTsN(),itarafxs.getTarafxsTrgtLocEntNamN(),itarafxs.getTarafxsTrgtTaskNamN(),itarafxs.getTarafxsTrgtTaskIdN(),itarafxs.getTarafxsTrgtTaskUsrN(),itarafxs.getTarafxsTrgtTaskStrtTsN(),itarafxs.getTarafxsTrgtTaskStopTsN(),itarafxs.getTarafxsApplTknNamN())
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
// methodEnd:insertTarafxs1
// methodStart:selectTaraefp1
    
/**
******         SELECT APP_FILE_RTN_NUM                             
******              , PRTY_NUM                                     
******              , TRNSLTN_SW                                   
******              , TRNSLTN_RTN_NAM                              
******              , XFER_TYPE_CD                                 
******              , STATUS_CD                                    
******                                                             
******          INTO :TARAEFP-APP-FILE-RTN-NUM                     
******             , :TARAEFP-PRTY-NUM                             
******             , :TARAEFP-TRNSLTN-SW                           
******             , :TARAEFP-TRNSLTN-RTN-NAM                      
******             , :TARAEFP-XFER-TYPE-CD                         
******             , :TARAEFP-STATUS-CD                            
******               :TARAEFP-STATUS-CD-N                          
******                                                             
******          FROM TARAEFP                                       
******                                                             
******         WHERE  ENDPT_ID     = :TARAEFP-ENDPT-ID             
******           AND  BULK_ID      = :TARAEFP-BULK-ID              
******           AND  CYCL_NUM     = :TARAEFP-CYCL-NUM             
******           AND  EFF_FROM_TS <= CURRENT_TIMESTAMP             
******           AND (EFF_TO_TS   IS NULL                          
******            OR  EFF_TO_TS   >= CURRENT_TIMESTAMP)            
**/
    public void selectTaraefp1(Itaraefp itaraefp, Taraefp taraefp, Sqlca sqlca) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(51/* SQL Sequence*/, CONSTANTS.LITERAL_AR640010)
.withSql(SQLS.SQL_1076306377)
				.withInputs(taraefp.getTaraefpEndptId(),taraefp.getTaraefpBulkId(),taraefp.getTaraefpCyclNum())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.SMALLINT)
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
   taraefp.setTaraefpAppFileRtnNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(2);
 if (resultObj != null) {
   taraefp.setTaraefpPrtyNum( (Db2Base.castToBigDecimal(resultObj)).shortValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(3);
 if (resultObj != null) {
   taraefp.setTaraefpTrnsltnSw( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(4);
 if (resultObj != null) {
   taraefp.setTaraefpTrnsltnRtnNam( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(5);
 if (resultObj != null) {
   taraefp.setTaraefpXferTypeCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(6);
 if (resultObj != null) {
   itaraefp.setTaraefpStatusCdN( (short) 0);taraefp.setTaraefpStatusCd( resultObj.toString().toCharArray() );
 } else {itaraefp.setTaraefpStatusCdN( (short) -1);
 }
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
// methodEnd:selectTaraefp1
// methodStart:selectTaraept1
    
/**
******         SELECT XFER_MTHD_CD                                 
******              , BUS_PRTNR_ID                                 
******              , USER_SRVR_ID                                 
******              , BKUP_ENDPT_ID                                
******              , BKUP_ACTV_SW                                 
******              , CS_MIP_ID                                    
******              , RM_MIP_ID                                    
******              , RTE_TO_HUB_SW                                
******                                                             
******          INTO :TARAEPT-XFER-MTHD-CD                         
******             , :TARAEPT-BUS-PRTNR-ID                         
******             , :TARAEPT-USER-SRVR-ID                         
******               :TARAEPT-USER-SRVR-ID-N                       
******             , :TARAEPT-BKUP-ENDPT-ID                        
******               :TARAEPT-BKUP-ENDPT-ID-N                      
******             , :TARAEPT-BKUP-ACTV-SW                         
******             , :TARAEPT-CS-MIP-ID                            
******               :TARAEPT-CS-MIP-ID-N                          
******             , :TARAEPT-RM-MIP-ID                            
******               :TARAEPT-RM-MIP-ID-N                          
******             , :TARAEPT-RTE-TO-HUB-SW                        
******                                                             
******          FROM  TARAEPT                                      
******                                                             
******         WHERE  ENDPT_ID    = :TARAEPT-ENDPT-ID              
******           AND  EFF_FROM_TS <= CURRENT_TIMESTAMP             
******           AND (EFF_TO_TS   IS NULL                          
******            OR  EFF_TO_TS   >= CURRENT_TIMESTAMP)            
**/
    public void selectTaraept1(Sqlca sqlca, Taraept taraept, Itaraept itaraept) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(52/* SQL Sequence*/, CONSTANTS.LITERAL_AR640010)
.withSql(SQLS.SQL_33508182)
				.withInputs(taraept.getTaraeptEndptId())
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
   taraept.setTaraeptXferMthdCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(2);
 if (resultObj != null) {
   taraept.setTaraeptBusPrtnrId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(3);
 if (resultObj != null) {
   itaraept.setTaraeptUserSrvrIdN( (short) 0);taraept.setTaraeptUserSrvrId( resultObj.toString().toCharArray() );
 } else {itaraept.setTaraeptUserSrvrIdN( (short) -1);
 }
 resultObj = resultSet.getObject(4);
 if (resultObj != null) {
   itaraept.setTaraeptBkupEndptIdN( (short) 0);taraept.setTaraeptBkupEndptId( resultObj.toString().toCharArray() );
 } else {itaraept.setTaraeptBkupEndptIdN( (short) -1);
 }
 resultObj = resultSet.getObject(5);
 if (resultObj != null) {
   taraept.setTaraeptBkupActvSw( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(6);
 if (resultObj != null) {
   itaraept.setTaraeptCsMipIdN( (short) 0);taraept.setTaraeptCsMipId( resultObj.toString().toCharArray() );
 } else {itaraept.setTaraeptCsMipIdN( (short) -1);
 }
 resultObj = resultSet.getObject(7);
 if (resultObj != null) {
   itaraept.setTaraeptRmMipIdN( (short) 0);taraept.setTaraeptRmMipId( resultObj.toString().toCharArray() );
 } else {itaraept.setTaraeptRmMipIdN( (short) -1);
 }
 resultObj = resultSet.getObject(8);
 if (resultObj != null) {
   taraept.setTaraeptRteToHubSw( resultObj.toString().toCharArray() );
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
// methodEnd:selectTaraept1
// methodStart:selectTaraept12
    
/**
******    EXEC SQL SELECT RTE_TO_HUB_SW                            
******        INTO :810-RTE-TO-HUB-SW                              
******        FROM  TARAEPT                                        
******        WHERE ENDPT_ID = :TARAFPL-APP-ENDPT-ID               
**/
    public void selectTaraept12(ReqWorkAreas810 reqWorkAreas810, Sqlca sqlca, Tarafpl tarafpl) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(53/* SQL Sequence*/, CONSTANTS.LITERAL_AR640010)
.withSql(SQLS.SQL_1838142197)
				.withInputs(tarafpl.getTarafplAppEndptId())
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
   reqWorkAreas810.setRteToHubSw810( resultObj.toString().toCharArray() );
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
// methodEnd:selectTaraept12
// methodStart:selectTarafxs16
    
/**
******    EXEC SQL SELECT MCIBDIO_PARM_TXT                         
******        INTO :TARAFXS-MCIBDIO-PARM-TXT                       
******        FROM  TARAFXS                                        
******        WHERE MCIBDIO_PARM_TXT = :TARAFXS-MCIBDIO-PARM-TXT   
******          AND STAT_CD IN ('A', 'C', 'D', 'I', 'L', 'X')      
******        FETCH FIRST 1 ROW ONLY                               
**/
    public void selectTarafxs16(Tarafxs tarafxs, Sqlca sqlca) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(54/* SQL Sequence*/, CONSTANTS.LITERAL_AR640010)
.withSql(SQLS.SQL_1114213105)
				.withInputs(tarafxs.getTarafxsMcibdioParmTxt())
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
   tarafxs.setTarafxsMcibdioParmTxt( resultObj.toString().toCharArray() );
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
// methodEnd:selectTarafxs16
// methodStart:selectTarasts
    
/**
******     SELECT STAT_REF_DESC                                    
******                                                             
******       INTO :TARASTS-STAT-REF-DESC                           
******                                                             
******       FROM TARASTS                                          
******                                                             
******      WHERE STAT_REF_ID = :TARASTS-STAT-REF-ID               
**/
    public void selectTarasts(Tarasts tarasts, Sqlca sqlca) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(55/* SQL Sequence*/, CONSTANTS.LITERAL_AR640010)
.withSql(SQLS.SQL_326043885)
				.withInputs(tarasts.getTarastsStatRefId())
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
   tarasts.setTarastsStatRefDesc( resultObj.toString().toCharArray() );
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
// methodEnd:selectTarasts
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
