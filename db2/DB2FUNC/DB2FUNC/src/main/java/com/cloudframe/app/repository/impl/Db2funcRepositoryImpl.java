package com.cloudframe.app.repository.impl;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.repository.Db2funcRepository;
import com.cloudframe.app.dao.Db2Base;
import java.sql.Types;
import java.math.MathContext;
import com.cloudframe.app.common.CONSTANTS;
import java.math.BigDecimal;
import com.cloudframe.app.dao.SqlBase;
import java.sql.ResultSet;
import com.cloudframe.app.dao.CfSqlca;
import java.sql.SQLException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cloudframe.app.db2func.dto.*;

@Repository
@Qualifier("db2funcRepository")
public class Db2funcRepositoryImpl implements Db2funcRepository {
    Logger logger = LoggerFactory.getLogger(Db2funcRepositoryImpl.class);

// declare:start
    int sqlFetchCounter = 0;
static final short NOT_NULL = (short)0;
ResultSet positionCursorResultSet = null;
ResultSet resultSet = null;
ResultSet isinCursorResultSet = null;
ResultSet c1ResultSet = null;
ResultSet xrefCursorResultSet = null;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:selectTbdemsec
    
/**
******   SELECT DATE(:WS-CURRENT-DATE) - 18 MONTHS                 
******     INTO :WS-18MTHS-AGO-DATE                                
******     FROM TBDEMSEC                                           
******     WHERE ISIN = 'DE000PAH0038'                             
**/
    public void selectTbdemsec(Sqlca sqlca, DateFields dateFields) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(21/* SQL Sequence*/, CONSTANTS.LITERAL_DB2FUNC)
.withSql(SQLS.SQL_2127614158)
				.withInputs(dateFields.getCurrentDate())
				.withDataTypes(Types.CHAR)
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
   dateFields.setMthsAgoDate18( resultObjString.toCharArray() );
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
// methodEnd:selectTbdemsec
// methodStart:call
    
/**
******   CALL GETPRML(:PROCNM,                                     
******              :SCHEMA,                                       
******              :NUM-CURSORS,                                  
******              :OUT-CODE,                                     
******              :PARMLST INDICATOR :PARMIND)                   
**/
    public void call(ParmlstGroup parmlstGroup, Sqlca sqlca, Work work) throws Exception {
try {
	// CALL Stored procedure with one parameter that is both input and output
	// reset SQLCODE
	sqlca.setSqlcode(0);
	// populate input and input datatypes for the SQL
   Object[] inputParms = new Object[]{work.getProcnm(),work.getSchema(),work.getNumCursors(),work.getOutCode(),parmlstGroup.getParmlst()};
   int[] dataTypes = new int[]{Types.CHAR,Types.CHAR,Types.INTEGER,Types.INTEGER,Types.VARCHAR};
   // execute Call procedure
   // make sure currentSchema and currentFunctionPath are both set
   java.sql.CallableStatement cs = db2Base.callableStatement(22/* SQL Sequence*/,SQLS.SQL_112483823,CONSTANTS.LITERAL_DB2FUNC);
   // set input and output
   db2Base.setInput(cs, inputParms, dataTypes);
   // dataType is also an output
   db2Base.setOutput(cs, dataTypes);
   // execute the stored procedure
   cs.execute();

   // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = cs.getObject(1);
 if (resultObj != null) {
   work.setProcnm( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = cs.getString(2);
 if (resultObjString != null) {
   work.setSchema( db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = cs.getObject(3);
 if (resultObj != null) {
   try {   
   work.setNumCursors(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        work.setNumCursors(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        work.setNumCursors(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        work.setNumCursors(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = cs.getObject(4);
 if (resultObj != null) {
   try {   
   work.setOutCode(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        work.setOutCode(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        work.setOutCode(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        work.setOutCode(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = cs.getObject(5);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   parmlstGroup.setParmlst( value,0, value.length,2,value.length);
   parmlstGroup.getParmlst().setParmlen((short) value.length);
if (work.getParmind() != 0) work.setParmind( (short) 0);
 } else work.setParmind((short) -1 );

  cs.close();
} catch(Exception e) {
  sqlca.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
  throw e;
}
    }
// methodEnd:call
// methodStart:associate
    
/**
******     ASSOCIATE LOCATORS (:LOC1)                              
******     WITH PROCEDURE GETPRML                                  
**/
    public void associate(Sqlca sqlca, Work work) throws Exception {

sqlca.setSqlcode(0); // cursor closed
    }
// methodEnd:associate
// methodStart:allocate
    
/**
******   ALLOCATE C1 CURSOR FOR RESULT SET :LOC1                   
**/
    public void allocate(Sqlca sqlca, Work work) throws Exception {

sqlca.setSqlcode(0); // cursor closed
    }
// methodEnd:allocate
// methodStart:fetchC1Db2func
    
/**
******     FETCH C1                                                
******      INTO :ISIN                                             
******          ,:SEDOL                                            
******          ,:RIC                                              
******          ,:INTLKEY                                          
******          ,:COMPANY                                          
******          ,:COUNTRY                                          
******          ,:CURRENCY1                                        
******          ,:INDUSTRY                                         
******          ,:SECTOR                                           
******          ,:FFMCAPMILUSD                                     
******          ,:SECTORWEIGHT                                     
**/
    public void fetchC1Db2func(Dcltbdemsec dcltbdemsec, Sqlca sqlca) throws Exception {
try {
	boolean hasResults = c1ResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = c1ResultSet.getObject(1);
 if (resultObj != null) {
   dcltbdemsec.setIsin01( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = c1ResultSet.getString(2);
 if (resultObjString != null) {
   dcltbdemsec.setSedol01( db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObjString = c1ResultSet.getString(3);
 if (resultObjString != null) {
   dcltbdemsec.setRic01( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = c1ResultSet.getString(4);
 if (resultObjString != null) {
   dcltbdemsec.setIntlkey01( db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = c1ResultSet.getObject(5);
 if (resultObj != null) {
   dcltbdemsec.setCompany01( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = c1ResultSet.getObject(6);
 if (resultObj != null) {
   dcltbdemsec.setCountry01( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = c1ResultSet.getObject(7);
 if (resultObj != null) {
   dcltbdemsec.setCurrency1( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = c1ResultSet.getObject(8);
 if (resultObj != null) {
   dcltbdemsec.setIndustry( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = c1ResultSet.getObject(9);
 if (resultObj != null) {
   dcltbdemsec.setSector( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = c1ResultSet.getObject(10);
 if (resultObj != null) {
   try {   
   dcltbdemsec.setFfmcapmilusd(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dcltbdemsec.setFfmcapmilusd(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dcltbdemsec.setFfmcapmilusd(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dcltbdemsec.setFfmcapmilusd(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObjString = c1ResultSet.getString(11);
 if (resultObjString != null) {
   dcltbdemsec.setSectorweight( db2Base.formatISOTime(resultObjString) );
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
 		logger.error("c1ResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchC1Db2func
// methodStart:call1
    
/**
******   CALL GETDATA (:SDMS01-PARM)                               
**/
    public void call1(Sqlca sqlca, Sdms01Parm sdms01Parm) throws Exception {
try {
	// CALL Stored procedure with one parameter that is both input and output
	// reset SQLCODE
	sqlca.setSqlcode(0);
	// populate input and input datatypes for the SQL
   Object[] inputParms = new Object[]{sdms01Parm};
   int[] dataTypes = new int[]{Types.VARCHAR};
   // execute Call procedure
   // make sure currentSchema and currentFunctionPath are both set
   java.sql.CallableStatement cs = db2Base.callableStatement(26/* SQL Sequence*/,SQLS.SQL_1772696462,CONSTANTS.LITERAL_DB2FUNC);
   // set input and output
   db2Base.setInput(cs, inputParms, dataTypes);
   // dataType is also an output
   db2Base.setOutput(cs, dataTypes);
   // execute the stored procedure
   cs.execute();

   // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = cs.getObject(1);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   sdms01Parm.setSdms01ParmData(value , 0, value.length , 0, value.length );
   sdms01Parm.setSdms01ParmLen((short) value.length);
} else {sqlca.setSqlcode(-305); }

  cs.close();
} catch(Exception e) {
  sqlca.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
  throw e;
}
    }
// methodEnd:call1
// methodStart:openPositionCursorDb2func
    
/**
******     DECLARE    POSITION-CURSOR CURSOR WITH HOLD FOR         
******     SELECT     X.ADP_NO                 AS ADP_NO           
******               ,X.APPL_CODE_CD           AS APPL_CODE_CD     
******               ,T13.SYMBOL               AS SYMBOL           
******               ,T13.CUSIP                AS CUSIP            
******               ,T13.SEDOL                AS SEDOL            
******               ,T13.ISIN                 AS ISIN             
******               ,X.FAM_ID                 AS FAM_ID           
******               ,T15.FAM_NAME             AS FAM_NAME         
******               ,X.ACCOUNT                AS ACCOUNT          
******               ,X.ACCT_CHK_DIGIT         AS ACCT_CHK_DIGIT   
******               ,T16.MACT_NAME            AS ACCT_NAME        
******               ,DECIMAL(X.POS_QTY,18,5)  AS POS_QTY          
******               ,DECIMAL(X.PRICE,17,8)    AS PRICE            
******               ,X.SOURCE_CD              AS SOURCE_CD        
******               ,X.PRICE_CD               AS PRICE_CD         
******               ,X.SOURCE_ID              AS SOURCE_ID        
******               ,X.SOURCE_TYPE            AS SOURCE_TYPE      
******               ,T13.INSTRUMENT_TYPE1     CONCAT              
******                ' '                      CONCAT              
******                T13.INSTRUMENT_TYPE2     CONCAT              
******                ' '                      CONCAT              
******                T13.EXCHANGE_OR_OTHER    AS INSTRUMENT_TYPE  
******               ,T14.INST_1_DESC          CONCAT              
******                ' '                      CONCAT              
******                T14.INST_2_DESC          CONCAT              
******                ' '                      CONCAT              
******                T14.EXCH_OTHER_DESC      AS INSTRUMENT_DESC  
******       FROM (                                                
******     SELECT  T1.ADP_SECURITY_NO      AS ADP_NO               
******            ,T1.APPL_CODE_CD         AS APPL_CODE_CD         
******            ,T1.FAMILY_ID            AS FAM_ID               
******            ,(T1.OFFICE_ACCOUNT_CD   CONCAT                  
******             T1.ACCT_CURR_CD         CONCAT                  
******             T1.ACCT_TYP)            AS ACCOUNT              
******            ,T1.ACCT_CHKDIGIT_NO     AS ACCT_CHK_DIGIT       
******            ,T1.SOURCE_CD            AS SOURCE_CD            
******            ,T1.PRICE_CD             AS PRICE_CD             
******            ,MIN(T1.SOURCE_ID)       AS SOURCE_ID            
******            ,MIN(T1.SOURCE_TYP)      AS SOURCE_TYPE          
******            ,MIN(T1.PRICE_PRC)       AS PRICE                
******            ,MIN(T1.POS_QTY)         AS POS_QTY              
******       FROM  SCPSECTB T1                                     
******      WHERE  T1.ADP_SECURITY_NO    =  :SCPSEC-ADP-SECURITY-NO
******        AND ((T1.APPL_CODE_CD     IN (:WS-HOST-APP-CODE-TBL))
******         OR  (                                               
******              (                                              
******               (:WS-RAP-APP-CD-ALLOWED-SW = 'Y'              
******           AND T1.APPL_CODE_CD     = 'RAP')                  
******            OR (:WS-REM-APP-CD-ALLOWED-SW = 'Y'              
******           AND T1.APPL_CODE_CD     = 'REM')                  
******            OR (:WS-RTL-APP-CD-ALLOWED-SW = 'Y'              
******           AND T1.APPL_CODE_CD     = 'RTL')                  
******              )                                              
******           AND T1.FAMILY_ID        = '52V'                   
******           AND T1.OFFICE_ACCOUNT_CD = 'SHA00001'             
******           AND T1.ACCT_CURR_CD     = 'USD'                   
******           AND T1.ACCT_TYP        IN ('1', '3')              
******             )                                               
******            )                                                
******        AND  T1.POS_QTY           <> 0                       
******        AND  T1.SOURCE_DSC        <> 'UNPRICED'              
******        AND  T1.SOURCE_DSC        <> 'STALE'                 
******        AND  T1.SOURCE_DSC        <> 'EXPIRED'               
******        AND ((T1.SOURCE_CD        <>  '999'                  
******          AND T1.SOURCE_ID        <>  'STALE')               
******          OR T1.SOURCE_CD          =  '999')                 
******        AND  T1.PRICE_PRC         <> 0                       
******        AND  T1.PRICE_CD           =  :SCPSEC-PRICE-CD       
******        AND  T1.SOURCE_CD          =  :SCPSEC-SOURCE-CD      
******   GROUP BY  T1.ADP_SECURITY_NO                              
******            ,T1.APPL_CODE_CD                                 
******            ,T1.FAMILY_ID                                    
******            ,T1.OFFICE_ACCOUNT_CD                            
******            ,T1.ACCT_CURR_CD                                 
******            ,T1.ACCT_TYP                                     
******            ,T1.ACCT_CHKDIGIT_NO                             
******            ,T1.SOURCE_CD                                    
******            ,T1.PRICE_CD                                     
******            ) X                                              
******                                                             
******       LEFT OUTER JOIN SCSECXTB      T13                     
******         ON T13.ADP_SECURITY_NO    =  X.ADP_NO               
******                                                             
******       LEFT OUTER JOIN SCINSTTB      T14                     
******         ON T14.INSTRUMENT_TYPE1   = T13.INSTRUMENT_TYPE1    
******        AND T14.INSTRUMENT_TYPE2   = T13.INSTRUMENT_TYPE2    
******        AND T14.EXCHANGE_OR_OTHER  = T13.EXCHANGE_OR_OTHER   
******                                                             
******       LEFT OUTER JOIN CLOUDFRM.SPCFAMTB T15                 
******         ON T15.FAM_NUMBER         = X.FAM_ID                
******                                                             
******       LEFT OUTER JOIN CLOUDFRM.SPCACTTB T16                 
******         ON T16.MACT_OFFICE        = SUBSTR(X.ACCOUNT,01,03) 
******        AND T16.MACT_ACCT_NO       = SUBSTR(X.ACCOUNT,04,05) 
******        AND T16.ACCT_CURR_BSC      = SUBSTR(X.ACCOUNT,09,03) 
******        AND T16.ACCT_TYP           = SUBSTR(X.ACCOUNT,12,01) 
******                                                             
******      ORDER BY 1, 2                                          
******        FOR FETCH ONLY                                       
**/
    public void openPositionCursorDb2func(ApplicationCodeListGroup applicationCodeListGroup, Dclscpsectb dclscpsectb, Sqlca sqlca, HostVariables hostVariables) throws Exception {

try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	positionCursorResultSet = db2Base.startQuery(12/* SQL Sequence*/, CONSTANTS.LITERAL_DB2FUNC)
    .withSql(SQLS.SQL_1167685409)
				.withInputs(dclscpsectb.getScpsecAdpSecurityNo(),applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().getHostAppCode01(),applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().getHostAppCode02(),applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().getHostAppCode03(),applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().getHostAppCode04(),applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().getHostAppCode05(),applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().getHostAppCode06(),applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().getHostAppCode07(),hostVariables.getRapAppCdAllowedSw(),hostVariables.getRemAppCdAllowedSw(),hostVariables.getRtlAppCdAllowedSw(),dclscpsectb.getScpsecPriceCd(),dclscpsectb.getScpsecSourceCd())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}


    }
// methodEnd:openPositionCursorDb2func
// methodStart:selectSysdummy1
    
/**
******     SELECT                                                  
******         DATE(SUBSTR (CHAR(:WS-CURRENT-DATE),1,8) || '01')   
******                    + 1 MONTH - 1 DAY                        
******     INTO :WS-LAST-DAY-DT                                    
******     FROM                                                    
******          SYSIBM.SYSDUMMY1                                   
******     WITH UR                                                 
**/
    public void selectSysdummy1(Sqlca sqlca, DateFields dateFields) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(28/* SQL Sequence*/, CONSTANTS.LITERAL_DB2FUNC)
.withSql(SQLS.SQL_628248409)
				.withInputs(dateFields.getCurrentDate())
				.withDataTypes(Types.CHAR)
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
   dateFields.setLastDayDt( resultObjString.toCharArray() );
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
// methodEnd:selectSysdummy1
// methodStart:selectTmasterAdpNumber
    
/**
******   SELECT TRML_CD                                            
******         ,TRAN_CD                                            
******         ,ADDED_TMSTP                                        
******         ,DO_NOT_USE_DT                                      
******         ,SRCE_SETUP_SEC_CD                                  
******         ,SECURITY_IDA_CD                                    
******         ,TYPE_SECURITY_CD                                   
******         ,CNTRY_ISSUE_CD                                     
******         ,CNTRY_ORGN_CD                                      
******         ,A.CLIENT_NBR                                       
******         ,DESC_SEC_TXT                                       
******         ,MCGILL_CD                                          
******         ,CUSIP_CNTRA_NBR                                    
******         ,CLASS_IND                                          
******         ,SYMBL_TRDS_AS_CD                                   
******         ,SYMBL_TRDS_WHI_CD                                  
******         ,SEC_LCKD_IND                                       
******         ,FATCA_CD                                           
******         ,MTRL_MDFD_DT                                       
******         ,FATCA_OVRRD_CD                                     
******         ,FATCA_CD_CALC_IND                                  
******   INTO  :DCLVMSTRANB.TRML-CD                                
******        ,:DCLVMSTRANB.TRAN-CD                                
******        ,:DCLVMSTRANB.ADDED-TMSTP                            
******        ,:DCLVMSTRANB.DO-NOT-USE-DT:DO-NOT-USE-DT-NULL       
******        ,:DCLVMSTRANB.SRCE-SETUP-SEC-CD                      
******        ,:DCLVMSTRANB.SECURITY-IDA-CD                        
******        ,:DCLVMSTRANB.TYPE-SECURITY-CD                       
******        ,:DCLVMSTRANB.CNTRY-ISSUE-CD                         
******        ,:DCLVMSTRANB.CNTRY-ORGN-CD                          
******        ,:DCLVMSTRANB.CLIENT-NBR:CLIENT-NBR-NULL             
******        ,:DCLVMSTRANB.DESC-SEC-TXT                           
******        ,:DCLVMSTRANB.MCGILL-CD:MCGILL-CD-NULL               
******        ,:DCLVMSTRANB.CUSIP-CNTRA-NBR:CUSIP-CNTRA-NBR-NULL   
******        ,:DCLVMSTRANB.CLASS-IND                              
******        ,:DCLVMSTRANB.SYMBL-TRDS-AS-CD:SYMBL-TRDS-AS-CD-NULL 
******        ,:DCLVMSTRANB.SYMBL-TRDS-WHI-CD:SYMBL-TRDS-WHI-NULL  
******        ,:DCLVMSTRANB.SEC-LCKD-IND                           
******        ,:BDMS01-FATCA-CD                                    
******        ,:BDMS01-MTRL-MDFD-DT:MTRL-MDFD-DT-NULL              
******        ,:BDMS01-FATCA-OVRRD-CD                              
******        ,:BDMS01-FATCA-CD-CALC-IND                           
******   FROM CLOUDFRM.TMASTER_ADP_NUMBER A                        
******   WHERE SECURITY_ADP_NBR = :DCLVMSTRANB.SECURITY-ADP-NBR    
******   WITH UR                                                   
**/
    public void selectTmasterAdpNumber(Dclvmstranb dclvmstranb, Sqlca sqlca, Bdms01CallParameters bdms01CallParameters, Db2Indicators db2Indicators) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(29/* SQL Sequence*/, CONSTANTS.LITERAL_DB2FUNC)
.withSql(SQLS.SQL_1216894373)
				.withInputs(dclvmstranb.getSecurityAdpNbr())
				.withDataTypes(Types.CHAR)
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
   dclvmstranb.setTrmlCd( db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(2);
 if (resultObjString != null) {
   dclvmstranb.setTranCd( db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(3);
 if (resultObjString != null) {
   dclvmstranb.setAddedTmstp( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(4);
 if (resultObjString != null) {
   db2Indicators.setDoNotUseDtNull( (short) 0);dclvmstranb.setDoNotUseDt( resultObjString.toCharArray() );
 } else {db2Indicators.setDoNotUseDtNull( (short) -1);
 }
 resultObj = resultSet.getObject(5);
 if (resultObj != null) {
   dclvmstranb.setSrceSetupSecCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(6);
 if (resultObj != null) {
   dclvmstranb.setSecurityIdaCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(7);
 if (resultObj != null) {
   dclvmstranb.setTypeSecurityCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(8);
 if (resultObj != null) {
   dclvmstranb.setCntryIssueCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(9);
 if (resultObj != null) {
   dclvmstranb.setCntryOrgnCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(10);
 if (resultObj != null) {
   db2Indicators.setClientNbrNull( (short) 0);dclvmstranb.setClientNbr( resultObj.toString().toCharArray() );
 } else {db2Indicators.setClientNbrNull( (short) -1);
 }
 resultObj = resultSet.getObject(11);
 if (resultObj != null) {
   dclvmstranb.setDescSecTxt( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(12);
 if (resultObj != null) {
   db2Indicators.setMcgillCdNull( (short) 0);dclvmstranb.setMcgillCd( (Db2Base.castToBigDecimal(resultObj)).intValue());
 } else {db2Indicators.setMcgillCdNull( (short) -1);
 }
 resultObjString = resultSet.getString(13);
 if (resultObjString != null) {
   db2Indicators.setCusipCntraNbrNull( (short) 0);dclvmstranb.setCusipCntraNbr( db2Base.formatISOTime(resultObjString) );
 } else {db2Indicators.setCusipCntraNbrNull( (short) -1);
 }
 resultObj = resultSet.getObject(14);
 if (resultObj != null) {
   dclvmstranb.setClassInd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(15);
 if (resultObj != null) {
   db2Indicators.setSymblTrdsAsCdNull( (short) 0);dclvmstranb.setSymblTrdsAsCd( resultObj.toString().toCharArray() );
 } else {db2Indicators.setSymblTrdsAsCdNull( (short) -1);
 }
 resultObj = resultSet.getObject(16);
 if (resultObj != null) {
   db2Indicators.setSymblTrdsWhiNull( (short) 0);dclvmstranb.setSymblTrdsWhiCd( resultObj.toString().toCharArray() );
 } else {db2Indicators.setSymblTrdsWhiNull( (short) -1);
 }
 resultObj = resultSet.getObject(17);
 if (resultObj != null) {
   dclvmstranb.setSecLckdInd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(18);
 if (resultObj != null) {
   bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(19);
 if (resultObjString != null) {
   db2Indicators.setMtrlMdfdDtNull( (short) 0);bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01MtrlMdfdDt( resultObjString.toCharArray() );
 } else {db2Indicators.setMtrlMdfdDtNull( (short) -1);
 }
 resultObj = resultSet.getObject(20);
 if (resultObj != null) {
   bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaOvrrdCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(21);
 if (resultObj != null) {
   bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaCdCalcInd( resultObj.toString().toCharArray() );
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
// methodEnd:selectTmasterAdpNumber
// methodStart:selectTcrrncyExchRate
    
/**
******    SELECT EXCHANGE_RATE_AMT                                 
******    INTO  :DCLVCRREXRT.EXCHANGE-RATE-AMT                     
******    FROM CLOUDFRM.TCRRNCY_EXCH_RATE                          
******    WHERE CURRENCY_CD = :DCLVCRREXRT.CURRENCY-CD             
******    WITH UR                                                  
**/
    public void selectTcrrncyExchRate(Dclvcrrexrt dclvcrrexrt, Sqlca sqlca) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(30/* SQL Sequence*/, CONSTANTS.LITERAL_DB2FUNC)
.withSql(SQLS.SQL_251085083)
				.withInputs(dclvcrrexrt.getCurrencyCd())
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
   try {   
   dclvcrrexrt.setExchangeRateAmt(new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dclvcrrexrt.setExchangeRateAmt( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dclvcrrexrt.setExchangeRateAmt( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dclvcrrexrt.setExchangeRateAmt( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
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
// methodEnd:selectTcrrncyExchRate
// methodStart:openXrefCursorDb2func
    
/**
******   DECLARE XREF-CURSOR CURSOR FOR                            
******   SELECT  CROSS_REFERENCE_CD                                
******          ,TYPE_XREF_CD                                      
******   FROM CLOUDFRM.TMSD_XREF_KEYS                              
******   WHERE SECURITY_ADP_NBR = :DCLVMSDXRFK.SECURITY-ADP-NBR    
******   AND TYPE_XREF_CD IN ('CU','CB','SY','SW','IS',            
******                        'SD','EU','CI','CM','OC','OP', 'D')  
******   UNION                                                     
******   SELECT SECURITY_ADP_NBR                                   
******          ,TYPE_XREF_CD                                      
******   FROM CLOUDFRM.TMSD_XREF_KEYS                              
******   WHERE CROSS_REFERENCE_CD = :DCLVMSDXRFK.SECURITY-ADP-NBR  
******   AND TYPE_XREF_CD = 'D'                                    
******   WITH UR                                                   
**/
    public void openXrefCursorDb2func(Sqlca sqlca, Dclvmsdxrfk dclvmsdxrfk) throws Exception {

try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	xrefCursorResultSet = db2Base.startQuery(17/* SQL Sequence*/, CONSTANTS.LITERAL_DB2FUNC)
    .withSql(SQLS.SQL_1372155246)
				.withInputs(dclvmsdxrfk.getSecurityAdpNbr01(),dclvmsdxrfk.getSecurityAdpNbr01())
				.withDataTypes(Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}


    }
// methodEnd:openXrefCursorDb2func
// methodStart:fetchXrefCursorDb2func
    
/**
******      FETCH XREF-CURSOR                                      
******      INTO  :DCLVMSDXRFK.CROSS-REFERENCE-CD                  
******           ,:DCLVMSDXRFK.TYPE-XREF-CD                        
**/
    public void fetchXrefCursorDb2func(Sqlca sqlca, Dclvmsdxrfk dclvmsdxrfk) throws Exception {
try {
	boolean hasResults = xrefCursorResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = xrefCursorResultSet.getObject(1);
 if (resultObj != null) {
   dclvmsdxrfk.setCrossReferenceCd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = xrefCursorResultSet.getObject(2);
 if (resultObj != null) {
   dclvmsdxrfk.setTypeXrefCd( resultObj.toString().toCharArray() );
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
 		logger.error("xrefCursorResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchXrefCursorDb2func
// methodStart:closeXrefCursorDb2func
    
/**
******   CLOSE XREF-CURSOR                                         
**/
    public void closeXrefCursorDb2func(Sqlca sqlca) throws Exception {


    sqlca.setSqlcode(0);
	db2Base.updateFetchCounter(sqlFetchCounter);
    }
// methodEnd:closeXrefCursorDb2func
// methodStart:openIsinCursorDb2func
    
/**
******EXEC SQL DECLARE ISIN-CURSOR CURSOR WITH HOLD FOR            
******  SELECT                                                     
******     ISIN                                                    
******    ,SEDOL                                                   
******    ,RIC                                                     
******    ,INTLKEY                                                 
******    ,COMPANY                                                 
******    ,COUNTRY                                                 
******    ,INDUSTRY                                                
******    ,SECTOR                                                  
******    ,FFMCAPMILUSD                                            
******    ,SECTORWEIGHT                                            
******  FROM TBDEMSEC                                              
******  ORDER BY ISIN                                              
**/
    public void openIsinCursorDb2func(Sqlca sqlca) throws Exception {

try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	isinCursorResultSet = db2Base.startQuery(16/* SQL Sequence*/, CONSTANTS.LITERAL_DB2FUNC)
    .withSql(SQLS.SQL_1024174197)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}


    }
// methodEnd:openIsinCursorDb2func
// methodStart:fetchIsinCursorDb2func
    
/**
******      FETCH ISIN-CURSOR                                      
******      INTO  :ISIN                                            
******           ,:SEDOL                                           
******           ,:RIC                                             
******           ,:INTLKEY                                         
******           ,:COMPANY                                         
******           ,:COUNTRY                                         
******           ,:INDUSTRY                                        
******           ,:SECTOR                                          
******           ,:FFMCAPMILUSD                                    
******           ,:SECTORWEIGHT                                    
**/
    public void fetchIsinCursorDb2func(Dcltbdemsec dcltbdemsec, Sqlca sqlca) throws Exception {
try {
	boolean hasResults = isinCursorResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = isinCursorResultSet.getObject(1);
 if (resultObj != null) {
   dcltbdemsec.setIsin01( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = isinCursorResultSet.getString(2);
 if (resultObjString != null) {
   dcltbdemsec.setSedol01( db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObjString = isinCursorResultSet.getString(3);
 if (resultObjString != null) {
   dcltbdemsec.setRic01( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = isinCursorResultSet.getString(4);
 if (resultObjString != null) {
   dcltbdemsec.setIntlkey01( db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = isinCursorResultSet.getObject(5);
 if (resultObj != null) {
   dcltbdemsec.setCompany01( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = isinCursorResultSet.getObject(6);
 if (resultObj != null) {
   dcltbdemsec.setCountry01( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = isinCursorResultSet.getObject(7);
 if (resultObj != null) {
   dcltbdemsec.setIndustry( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = isinCursorResultSet.getObject(8);
 if (resultObj != null) {
   dcltbdemsec.setSector( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = isinCursorResultSet.getObject(9);
 if (resultObj != null) {
   try {   
   dcltbdemsec.setFfmcapmilusd(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dcltbdemsec.setFfmcapmilusd(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dcltbdemsec.setFfmcapmilusd(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dcltbdemsec.setFfmcapmilusd(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObjString = isinCursorResultSet.getString(10);
 if (resultObjString != null) {
   dcltbdemsec.setSectorweight( db2Base.formatISOTime(resultObjString) );
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
 		logger.error("isinCursorResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchIsinCursorDb2func
// methodStart:updateTbdemsec
    
/**
******         UPDATE TBDEMSEC                                     
******            SET COMPANY = :COMPANY                           
******         WHERE ISIN = :ISIN                                  
**/
    public void updateTbdemsec(Dcltbdemsec dcltbdemsec, Sqlca sqlca) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(36/* SQL Sequence*/,CONSTANTS.LITERAL_DB2FUNC)
    .withSql(SQLS.SQL_699244639)
				.withInputs(dcltbdemsec.getCompany01(),dcltbdemsec.getIsin01())
				.withDataTypes(Types.CHAR,Types.CHAR)
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
// methodEnd:updateTbdemsec
// methodStart:updateTbdemsec1
    
/**
******         UPDATE TBDEMSEC                                     
******            SET COMPANY = :COMPANY                           
******         WHERE ISIN = :ISIN                                  
**/
    public void updateTbdemsec1(Dcltbdemsec dcltbdemsec, Sqlca sqlca) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(36/* SQL Sequence*/,CONSTANTS.LITERAL_DB2FUNC)
    .withSql(SQLS.SQL_699244639_1)
				.withInputs(dcltbdemsec.getCompany01(),dcltbdemsec.getIsin01())
				.withDataTypes(Types.CHAR,Types.CHAR)
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
// methodEnd:updateTbdemsec1
// methodStart:selectTbdemsec1
    
/**
******              SELECT ISIN                                    
******                INTO :ISIN                                   
******              FROM TBDEMSEC                                  
******              WHERE ISIN = :ISIN                             
**/
    public void selectTbdemsec1(Dcltbdemsec dcltbdemsec, Sqlca sqlca) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(37/* SQL Sequence*/, CONSTANTS.LITERAL_DB2FUNC)
.withSql(SQLS.SQL_1985660312)
				.withInputs(dcltbdemsec.getIsin01())
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
   dcltbdemsec.setIsin01( resultObj.toString().toCharArray() );
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
// methodEnd:selectTbdemsec1
// methodStart:closeIsinCursorDb2func
    
/**
******   CLOSE ISIN-CURSOR                                         
**/
    public void closeIsinCursorDb2func(Sqlca sqlca) throws Exception {


    sqlca.setSqlcode(0);
	db2Base.updateFetchCounter(sqlFetchCounter);
    }
// methodEnd:closeIsinCursorDb2func
// methodStart:selectTbaseSecurityDat
    
/**
******   SELECT YIELD_BID_PCT                                      
******         ,PUT_NTC_MIN_DY_QTY                                 
******         ,PUT_NTC_MAX_DY_QTY                                 
******         ,CNTNG_YLD_RT                                       
******   INTO  :DCLVBSSCRDT.YIELD-BID-PCT:YIELD-BID-NULL           
******        ,:DCLVBSSCRDT.PUT-NTC-MIN-DY-QTY:PUT-NTC-MIN-NULL    
******        ,:DCLVBSSCRDT.PUT-NTC-MAX-DY-QTY:PUT-NTC-MAX-NULL    
******        ,:WS-CNTNG-YLD-RT                                    
******   FROM CLOUDFRM.TBASE_SECURITY_DAT A                        
******   WITH UR                                                   
**/
    public void selectTbaseSecurityDat(Dclvbsscrdt dclvbsscrdt, Sqlca sqlca, Work work, Db2Indicators db2Indicators) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(40/* SQL Sequence*/, CONSTANTS.LITERAL_DB2FUNC)
.withSql(SQLS.SQL_455091892)
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
   db2Indicators.setYieldBidNull( (short) 0);dclvbsscrdt.setYieldBidPct(new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dclvbsscrdt.setYieldBidPct( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dclvbsscrdt.setYieldBidPct( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dclvbsscrdt.setYieldBidPct( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
 } else {db2Indicators.setYieldBidNull( (short) -1);
 }
 resultObj = resultSet.getObject(2);
 if (resultObj != null) {
   db2Indicators.setPutNtcMinNull( (short) 0);dclvbsscrdt.setPutNtcMinDyQty( (Db2Base.castToBigDecimal(resultObj)).shortValue());
 } else {db2Indicators.setPutNtcMinNull( (short) -1);
 }
 resultObj = resultSet.getObject(3);
 if (resultObj != null) {
   db2Indicators.setPutNtcMaxNull( (short) 0);dclvbsscrdt.setPutNtcMaxDyQty( (Db2Base.castToBigDecimal(resultObj)).shortValue());
 } else {db2Indicators.setPutNtcMaxNull( (short) -1);
 }
 resultObj = resultSet.getObject(4);
 if (resultObj != null) {
   try {   
   work.setCntngYldRt( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        work.setCntngYldRt( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        work.setCntngYldRt( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        work.setCntngYldRt( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
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
// methodEnd:selectTbaseSecurityDat
// methodStart:selectScholitb
    
/**
******   SELECT 1                                                  
******     INTO :WS-CTRY-HOLI-CT                                   
******     FROM  SCHOLITB                                          
******    WHERE  ISO_CNTRY_CD = 'US'                               
******      AND  HOLIDAY_DT   = '2020-04-16'                       
******      AND  HOLIDAY_IND  = 'Y'                                
******     FETCH FIRST 1 ROWS ONLY                                 
******     WITH  UR                                                
**/
    public void selectScholitb(Sqlca sqlca, Work work) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(41/* SQL Sequence*/, CONSTANTS.LITERAL_DB2FUNC)
.withSql(SQLS.SQL_1074901811)
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
   work.setCtryHoliCt(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        work.setCtryHoliCt(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        work.setCtryHoliCt(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        work.setCtryHoliCt(((Double) resultObj).intValue());
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
// methodEnd:selectScholitb
// methodStart:selectScholitb1
    
/**
******   SELECT COUNT(*)                                           
******     INTO :WS-CTRY-HOLI-CT                                   
******     FROM  SCHOLITB                                          
******    WHERE  ISO_CNTRY_CD = 'US'                               
******      AND  HOLIDAY_DT   = '2020-04-16'                       
******      AND  HOLIDAY_IND  = 'Y'                                
******     FETCH FIRST 1 ROWS ONLY                                 
******     WITH  UR                                                
**/
    public void selectScholitb1(Sqlca sqlca, Work work) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(42/* SQL Sequence*/, CONSTANTS.LITERAL_DB2FUNC)
.withSql(SQLS.SQL_705346004)
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
   work.setCtryHoliCt(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        work.setCtryHoliCt(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        work.setCtryHoliCt(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        work.setCtryHoliCt(((Double) resultObj).intValue());
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
// methodEnd:selectScholitb1
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
