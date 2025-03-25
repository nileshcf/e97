package com.cloudframe.app.repository.impl;

import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.dao.CfSqlca;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.dao.SqlBase;
import com.cloudframe.app.dto.d5427bhi.*;
import com.cloudframe.app.repository.D5427bhiRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("d5427bhiRepository")
public class D5427bhiRepositoryImpl implements D5427bhiRepository {
  Logger logger = LoggerFactory.getLogger(D5427bhiRepositoryImpl.class);

  // declare:start
  int sqlFetchCounter = 0;
  static final short NOT_NULL = (short) 0;
  // declare:end

  @Autowired
  @Qualifier("db2Base")
  SqlBase<char[]> db2Base;

  // methodStart:openHipaaSrvcCsrD5427bhi

  /**
   * ***** DECLARE HIPAA_SRVC_CSR CURSOR FOR ***** SELECT SRVC_CD, ***** A.PL_OF_SRVC_CD, *****
   * A.CAUS_CD, ***** A.BEN_LVL_CD, ***** A.NTWK_TYP_CD, ***** A.IN_NTWK_CLSS_CD, *****
   * A.TIER1_NTWK_CLSS_CD, ***** A.PROC_CD_RNG_BEGN_VAL, ***** A.PROC_CD_RNG_END_VAL, *****
   * A.PROC_CD_RNG_TYP_VAL ***** ,A.PROV_ORG_TYP_CD ***** ,COALESCE(B.HIPAA_COMMT_TXT, ' ') *****
   * FROM BEN_HIPAA_SRVC A ***** LEFT OUTER JOIN ***** BEN_HIPAA_SRVC_DTLS B ***** ON A.HIPAA_CD =
   * B.HIPAA_CD AND ***** A.SLOT_TBL_ID = B.SLOT_TBL_ID AND ***** A.HIPAA_VER_NBR = B.HIPAA_VER_NBR
   * AND ***** A.NTWK_TYP_CD = B.NTWK_TYP_CD AND ***** A.EFF_DT = B.EFF_DT AND ***** A.CANC_DT =
   * B.CANC_DT AND ***** A.CREAT_DTTM = B.CREAT_DTTM AND ***** A.STS_CD = B.STS_CD ***** WHERE
   * A.HIPAA_CD =:DBHS-HIPAA-CD AND ***** A.SLOT_TBL_ID =:DBHS-SLOT-TBL-ID AND ***** A.HIPAA_VER_NBR
   * =:DBHS-HIPAA-VER-NBR AND ***** ((A.EFF_DT <=:DBHS-EFF-DT AND ***** A.CANC_DT >=:DBHS-EFF-DT) OR
   * ***** (A.EFF_DT <=:DBHS-CANC-DT AND ***** A.CANC_DT >=:DBHS-CANC-DT)) AND ***** A.STS_CD
   * =:DBHS-STS-CD
   */
  public ResultSet openHipaaSrvcCsrD5427bhi(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc)
      throws Exception {
    ResultSet hipaaSrvcCsrResultSet = null;
    try {
      // OPEN CURSOR
      sqlca.setSqlcode(0);
      hipaaSrvcCsrResultSet =
          db2Base
              .startQuery(5 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_1880803781)
              .withInputs(
                  dclbenHipaaSrvc.getDbhsHipaaCd(),
                  dclbenHipaaSrvc.getDbhsSlotTblId(),
                  dclbenHipaaSrvc.getDbhsHipaaVerNbr(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsStsCd())
              .withDataTypes(
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR)
              .queryForList();
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }

    return hipaaSrvcCsrResultSet;
  }
  // methodEnd:openHipaaSrvcCsrD5427bhi
  // methodStart:fetchHipaaSrvcCsrD5427bhi

  /**
   * ***** FETCH HIPAA_SRVC_CSR ***** INTO ***** :DBHS-SRVC-CD ***** ,:DBHS-PL-OF-SRVC-CD *****
   * ,:DBHS-CAUS-CD ***** ,:DBHS-BEN-LVL-CD ***** ,:DBHS-NTWK-TYP-CD ***** ,:DBHS-IN-NTWK-CLSS-CD
   * ***** ,:DBHS-TIER1-NTWK-CLSS-CD ***** ,:DBHS-PROC-CD-RNG-BEGN-VAL *****
   * ,:DBHS-PROC-CD-RNG-END-VAL ***** ,:DBHS-PROC-CD-RNG-TYP-VAL ***** ,:DBHS-PROV-ORG-TYP-CD *****
   * ,:DBHSD-HIPAA-COMMT-TXT:WS-NULL-IND
   */
  public void fetchHipaaSrvcCsrD5427bhi(
      ResultSet hipaaSrvcCsrResultSet,
      DclbenHipaaSrvcDtls dclbenHipaaSrvcDtls,
      Sqlca sqlca,
      DclbenHipaaSrvc dclbenHipaaSrvc,
      Work work)
      throws Exception {
    try {
      boolean hasResults = hipaaSrvcCsrResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = hipaaSrvcCsrResultSet.getObject(1);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsSrvcCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = hipaaSrvcCsrResultSet.getObject(2);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsPlOfSrvcCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = hipaaSrvcCsrResultSet.getObject(3);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsCausCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = hipaaSrvcCsrResultSet.getObject(4);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsBenLvlCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = hipaaSrvcCsrResultSet.getObject(5);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsNtwkTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = hipaaSrvcCsrResultSet.getObject(6);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsInNtwkClssCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = hipaaSrvcCsrResultSet.getObject(7);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsTier1NtwkClssCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = hipaaSrvcCsrResultSet.getObject(8);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProcCdRngBegnVal(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = hipaaSrvcCsrResultSet.getObject(9);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProcCdRngEndVal(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = hipaaSrvcCsrResultSet.getObject(10);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProcCdRngTypVal(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = hipaaSrvcCsrResultSet.getObject(11);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProvOrgTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = hipaaSrvcCsrResultSet.getObject(12);
        if (resultObj != null) {
          value = resultObj.toString().toCharArray();
          dclbenHipaaSrvcDtls.setDbhsdHipaaCommtTxt(value, 0, value.length, 2, value.length);
          dclbenHipaaSrvcDtls
              .getDbhsdHipaaCommtTxt()
              .setDbhsdHipaaCommtTxtLen((short) value.length);
          if (work.getNullInd() != 0) work.setNullInd((short) 0);
        } else work.setNullInd((short) -1);
        sqlFetchCounter++;
      } else {
        sqlca.setSqlcode(100); // No More rows
      }
    } catch (SQLException e) {
      if (e.getMessage().contains("result set is closed")) {
        fill501SqlcaObject(sqlca); // cursor closed
      } else {
        logger.error("hipaaSrvcCsrResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchHipaaSrvcCsrD5427bhi
  // methodStart:closeHipaaSrvcCsrD5427bhi

  /** ***** CLOSE HIPAA_SRVC_CSR */
  public void closeHipaaSrvcCsrD5427bhi(ResultSet hipaaSrvcCsrResultSet, Sqlca sqlca)
      throws Exception {

    closeCursor(hipaaSrvcCsrResultSet, sqlca);
  }
  // methodEnd:closeHipaaSrvcCsrD5427bhi
  // methodStart:openCursorSlotTableD5427bhi

  /**
   * ***** DECLARE CURSOR-SLOT-TABLE CURSOR FOR ***** SELECT SLOT_TBL_ID, ***** SRVC_CD, *****
   * EFF_DT, ***** PL_OF_SRVC_CD, ***** CAUS_CD, ***** BEN_LVL_CD, ***** NTWK_TYP_CD, *****
   * PROC_CD_RNG_BEGN_VAL, ***** PROC_CD_RNG_END_VAL, ***** PROC_CD_RNG_TYP_VAL, *****
   * HIPAA_VER_NBR, ***** HIPAA_CD, ***** IN_NTWK_CLSS_CD, ***** TIER1_NTWK_CLSS_CD, ***** CANC_DT,
   * ***** LST_UPDT_DTTM, ***** LST_UPDT_USER_ID, ***** STS_CD, ***** PROV_ORG_TYP_CD ***** FROM
   * BEN_HIPAA_SRVC ***** ***** WHERE SLOT_TBL_ID = :DBHS-SLOT-TBL-ID ***** ORDER BY HIPAA_VER_NBR
   * ASC, ***** SLOT_TBL_ID ASC, ***** HIPAA_CD ASC, ***** SRVC_CD ASC, ***** NTWK_TYP_CD ASC, *****
   * PROV_ORG_TYP_CD ASC, ***** STS_CD ASC, ***** EFF_DT DESC, ***** LST_UPDT_DTTM DESC
   */
  public ResultSet openCursorSlotTableD5427bhi(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc)
      throws Exception {
    ResultSet cursorSlotTableResultSet = null;
    try {
      // OPEN CURSOR
      sqlca.setSqlcode(0);
      cursorSlotTableResultSet =
          db2Base
              .startQuery(7 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_840655799)
              .withInputs(dclbenHipaaSrvc.getDbhsSlotTblId())
              .withDataTypes(Types.CHAR)
              .queryForList();
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }

    return cursorSlotTableResultSet;
  }
  // methodEnd:openCursorSlotTableD5427bhi
  // methodStart:fetchCursorSlotTableD5427bhi

  /**
   * ***** FETCH CURSOR-SLOT-TABLE INTO ***** :DBHS-SLOT-TBL-ID, ***** :DBHS-SRVC-CD, *****
   * :DBHS-EFF-DT, ***** :DBHS-PL-OF-SRVC-CD, ***** :DBHS-CAUS-CD, ***** :DBHS-BEN-LVL-CD, *****
   * :DBHS-NTWK-TYP-CD, ***** :DBHS-PROC-CD-RNG-BEGN-VAL, ***** :DBHS-PROC-CD-RNG-END-VAL, *****
   * :DBHS-PROC-CD-RNG-TYP-VAL, ***** :DBHS-HIPAA-VER-NBR, ***** :DBHS-HIPAA-CD, *****
   * :DBHS-IN-NTWK-CLSS-CD, ***** :DBHS-TIER1-NTWK-CLSS-CD, ***** :DBHS-CANC-DT, *****
   * :DBHS-LST-UPDT-DTTM, ***** :DBHS-LST-UPDT-USER-ID, ***** :DBHS-STS-CD *****
   * ,:DBHS-PROV-ORG-TYP-CD
   */
  public void fetchCursorSlotTableD5427bhi(
      ResultSet cursorSlotTableResultSet, Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc)
      throws Exception {
    try {
      boolean hasResults = cursorSlotTableResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = cursorSlotTableResultSet.getObject(1);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsSlotTblId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(2);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsSrvcCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = cursorSlotTableResultSet.getString(3);
        if (resultObjString != null) {
          dclbenHipaaSrvc.setDbhsEffDt(resultObjString.toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(4);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsPlOfSrvcCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(5);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsCausCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(6);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsBenLvlCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(7);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsNtwkTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(8);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProcCdRngBegnVal(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(9);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProcCdRngEndVal(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(10);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProcCdRngTypVal(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(11);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsHipaaVerNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(12);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsHipaaCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(13);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsInNtwkClssCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(14);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsTier1NtwkClssCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = cursorSlotTableResultSet.getString(15);
        if (resultObjString != null) {
          dclbenHipaaSrvc.setDbhsCancDt(resultObjString.toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = cursorSlotTableResultSet.getString(16);
        if (resultObjString != null) {
          dclbenHipaaSrvc.setDbhsLstUpdtDttm(resultObjString.toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(17);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsLstUpdtUserId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(18);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsStsCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(19);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProvOrgTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        sqlFetchCounter++;
      } else {
        sqlca.setSqlcode(100); // No More rows
      }
    } catch (SQLException e) {
      if (e.getMessage().contains("result set is closed")) {
        fill501SqlcaObject(sqlca); // cursor closed
      } else {
        logger.error("cursorSlotTableResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchCursorSlotTableD5427bhi
  // methodStart:fetchCursorSlotTable1D5427bhi

  /**
   * ***** FETCH CURSOR-SLOT-TABLE INTO ***** :DBHS-SLOT-TBL-ID, ***** :DBHS-SRVC-CD, *****
   * :DBHS-EFF-DT, ***** :DBHS-PL-OF-SRVC-CD, ***** :DBHS-CAUS-CD, ***** :DBHS-BEN-LVL-CD, *****
   * :DBHS-NTWK-TYP-CD, ***** :DBHS-PROC-CD-RNG-BEGN-VAL, ***** :DBHS-PROC-CD-RNG-END-VAL, *****
   * :DBHS-PROC-CD-RNG-TYP-VAL, ***** :DBHS-HIPAA-VER-NBR, ***** :DBHS-HIPAA-CD, *****
   * :DBHS-IN-NTWK-CLSS-CD, ***** :DBHS-TIER1-NTWK-CLSS-CD, ***** :DBHS-CANC-DT, *****
   * :DBHS-LST-UPDT-DTTM, ***** :DBHS-LST-UPDT-USER-ID, ***** :DBHS-STS-CD *****
   * ,:DBHS-PROV-ORG-TYP-CD
   */
  public void fetchCursorSlotTable1D5427bhi(
      ResultSet cursorSlotTableResultSet, Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc)
      throws Exception {
    try {
      boolean hasResults = cursorSlotTableResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = cursorSlotTableResultSet.getObject(1);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsSlotTblId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(2);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsSrvcCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = cursorSlotTableResultSet.getString(3);
        if (resultObjString != null) {
          dclbenHipaaSrvc.setDbhsEffDt(resultObjString.toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(4);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsPlOfSrvcCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(5);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsCausCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(6);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsBenLvlCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(7);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsNtwkTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(8);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProcCdRngBegnVal(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(9);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProcCdRngEndVal(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(10);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProcCdRngTypVal(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(11);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsHipaaVerNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(12);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsHipaaCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(13);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsInNtwkClssCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(14);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsTier1NtwkClssCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = cursorSlotTableResultSet.getString(15);
        if (resultObjString != null) {
          dclbenHipaaSrvc.setDbhsCancDt(resultObjString.toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = cursorSlotTableResultSet.getString(16);
        if (resultObjString != null) {
          dclbenHipaaSrvc.setDbhsLstUpdtDttm(resultObjString.toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(17);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsLstUpdtUserId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(18);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsStsCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorSlotTableResultSet.getObject(19);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProvOrgTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        sqlFetchCounter++;
      } else {
        sqlca.setSqlcode(100); // No More rows
      }
    } catch (SQLException e) {
      if (e.getMessage().contains("result set is closed")) {
        fill501SqlcaObject(sqlca); // cursor closed
      } else {
        logger.error("cursorSlotTableResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchCursorSlotTable1D5427bhi
  // methodStart:closeCursorSlotTableD5427bhi

  /** ***** CLOSE CURSOR-SLOT-TABLE */
  public void closeCursorSlotTableD5427bhi(ResultSet cursorSlotTableResultSet, Sqlca sqlca)
      throws Exception {

    closeCursor(cursorSlotTableResultSet, sqlca);
  }
  // methodEnd:closeCursorSlotTableD5427bhi
  // methodStart:openCursorAllD5427bhi

  /**
   * ***** DECLARE CURSOR-ALL CURSOR FOR ***** SELECT SLOT_TBL_ID, ***** SRVC_CD, ***** EFF_DT,
   * ***** PL_OF_SRVC_CD, ***** CAUS_CD, ***** BEN_LVL_CD, ***** NTWK_TYP_CD, *****
   * PROC_CD_RNG_BEGN_VAL, ***** PROC_CD_RNG_END_VAL, ***** PROC_CD_RNG_TYP_VAL, *****
   * HIPAA_VER_NBR, ***** HIPAA_CD, ***** IN_NTWK_CLSS_CD, ***** TIER1_NTWK_CLSS_CD, ***** CANC_DT,
   * ***** LST_UPDT_DTTM, ***** LST_UPDT_USER_ID, ***** STS_CD, ***** PROV_ORG_TYP_CD ***** FROM
   * BEN_HIPAA_SRVC ***** ***** ORDER BY HIPAA_VER_NBR ASC, ***** SLOT_TBL_ID ASC, ***** HIPAA_CD
   * ASC, ***** SRVC_CD ASC, ***** NTWK_TYP_CD ASC, ***** PROV_ORG_TYP_CD ASC, ***** STS_CD ASC,
   * ***** EFF_DT DESC, ***** LST_UPDT_DTTM DESC *****
   */
  public ResultSet openCursorAllD5427bhi(Sqlca sqlca) throws Exception {
    ResultSet cursorAllResultSet = null;
    try {
      // OPEN CURSOR
      sqlca.setSqlcode(0);
      cursorAllResultSet =
          db2Base
              .startQuery(6 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_2071866505)
              .queryForList();
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }

    return cursorAllResultSet;
  }
  // methodEnd:openCursorAllD5427bhi
  // methodStart:fetchCursorAllD5427bhi

  /**
   * ***** FETCH CURSOR-ALL INTO ***** :DBHS-SLOT-TBL-ID, ***** :DBHS-SRVC-CD, ***** :DBHS-EFF-DT,
   * ***** :DBHS-PL-OF-SRVC-CD, ***** :DBHS-CAUS-CD, ***** :DBHS-BEN-LVL-CD, *****
   * :DBHS-NTWK-TYP-CD, ***** :DBHS-PROC-CD-RNG-BEGN-VAL, ***** :DBHS-PROC-CD-RNG-END-VAL, *****
   * :DBHS-PROC-CD-RNG-TYP-VAL, ***** :DBHS-HIPAA-VER-NBR, ***** :DBHS-HIPAA-CD, *****
   * :DBHS-IN-NTWK-CLSS-CD, ***** :DBHS-TIER1-NTWK-CLSS-CD, ***** :DBHS-CANC-DT, *****
   * :DBHS-LST-UPDT-DTTM, ***** :DBHS-LST-UPDT-USER-ID, ***** :DBHS-STS-CD, *****
   * :DBHS-PROV-ORG-TYP-CD
   */
  public void fetchCursorAllD5427bhi(
      ResultSet cursorAllResultSet, Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc) throws Exception {
    try {
      boolean hasResults = cursorAllResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = cursorAllResultSet.getObject(1);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsSlotTblId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(2);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsSrvcCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = cursorAllResultSet.getString(3);
        if (resultObjString != null) {
          dclbenHipaaSrvc.setDbhsEffDt(resultObjString.toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(4);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsPlOfSrvcCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(5);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsCausCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(6);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsBenLvlCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(7);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsNtwkTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(8);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProcCdRngBegnVal(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(9);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProcCdRngEndVal(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(10);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProcCdRngTypVal(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(11);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsHipaaVerNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(12);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsHipaaCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(13);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsInNtwkClssCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(14);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsTier1NtwkClssCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = cursorAllResultSet.getString(15);
        if (resultObjString != null) {
          dclbenHipaaSrvc.setDbhsCancDt(resultObjString.toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = cursorAllResultSet.getString(16);
        if (resultObjString != null) {
          dclbenHipaaSrvc.setDbhsLstUpdtDttm(resultObjString.toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(17);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsLstUpdtUserId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(18);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsStsCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(19);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProvOrgTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        sqlFetchCounter++;
      } else {
        sqlca.setSqlcode(100); // No More rows
      }
    } catch (SQLException e) {
      if (e.getMessage().contains("result set is closed")) {
        fill501SqlcaObject(sqlca); // cursor closed
      } else {
        logger.error("cursorAllResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchCursorAllD5427bhi
  // methodStart:fetchCursorAll1D5427bhi

  /**
   * ***** FETCH CURSOR-ALL INTO ***** :DBHS-SLOT-TBL-ID, ***** :DBHS-SRVC-CD, ***** :DBHS-EFF-DT,
   * ***** :DBHS-PL-OF-SRVC-CD, ***** :DBHS-CAUS-CD, ***** :DBHS-BEN-LVL-CD, *****
   * :DBHS-NTWK-TYP-CD, ***** :DBHS-PROC-CD-RNG-BEGN-VAL, ***** :DBHS-PROC-CD-RNG-END-VAL, *****
   * :DBHS-PROC-CD-RNG-TYP-VAL, ***** :DBHS-HIPAA-VER-NBR, ***** :DBHS-HIPAA-CD, *****
   * :DBHS-IN-NTWK-CLSS-CD, ***** :DBHS-TIER1-NTWK-CLSS-CD, ***** :DBHS-CANC-DT, *****
   * :DBHS-LST-UPDT-DTTM, ***** :DBHS-LST-UPDT-USER-ID, ***** :DBHS-STS-CD, *****
   * :DBHS-PROV-ORG-TYP-CD
   */
  public void fetchCursorAll1D5427bhi(
      ResultSet cursorAllResultSet, Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc) throws Exception {
    try {
      boolean hasResults = cursorAllResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = cursorAllResultSet.getObject(1);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsSlotTblId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(2);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsSrvcCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = cursorAllResultSet.getString(3);
        if (resultObjString != null) {
          dclbenHipaaSrvc.setDbhsEffDt(resultObjString.toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(4);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsPlOfSrvcCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(5);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsCausCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(6);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsBenLvlCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(7);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsNtwkTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(8);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProcCdRngBegnVal(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(9);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProcCdRngEndVal(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(10);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProcCdRngTypVal(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(11);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsHipaaVerNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(12);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsHipaaCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(13);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsInNtwkClssCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(14);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsTier1NtwkClssCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = cursorAllResultSet.getString(15);
        if (resultObjString != null) {
          dclbenHipaaSrvc.setDbhsCancDt(resultObjString.toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = cursorAllResultSet.getString(16);
        if (resultObjString != null) {
          dclbenHipaaSrvc.setDbhsLstUpdtDttm(resultObjString.toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(17);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsLstUpdtUserId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(18);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsStsCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = cursorAllResultSet.getObject(19);
        if (resultObj != null) {
          dclbenHipaaSrvc.setDbhsProvOrgTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        sqlFetchCounter++;
      } else {
        sqlca.setSqlcode(100); // No More rows
      }
    } catch (SQLException e) {
      if (e.getMessage().contains("result set is closed")) {
        fill501SqlcaObject(sqlca); // cursor closed
      } else {
        logger.error("cursorAllResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchCursorAll1D5427bhi
  // methodStart:closeCursorAllD5427bhi

  /** ***** CLOSE CURSOR-ALL */
  public void closeCursorAllD5427bhi(ResultSet cursorAllResultSet, Sqlca sqlca) throws Exception {

    closeCursor(cursorAllResultSet, sqlca);
  }
  // methodEnd:closeCursorAllD5427bhi
  // methodStart:selectBenHipaaSrvc

  /**
   * ***** SELECT STS_CD ***** INTO :DBHS-STS-CD ***** FROM BEN_HIPAA_SRVC ***** WHERE SLOT_TBL_ID =
   * :DBHS-SLOT-TBL-ID AND ***** STS_CD = :DBHS-STS-CD AND ***** HIPAA_CD = :DBHS-HIPAA-CD AND *****
   * EFF_DT = :DBHS-EFF-DT AND ***** HIPAA_VER_NBR = :DBHS-HIPAA-VER-NBR AND ***** NTWK_TYP_CD =
   * :DBHS-NTWK-TYP-CD AND ***** EFF_DT = :DBHS-EFF-DT AND ***** CANC_DT = :DBHS-CANC-DT
   */
  public void selectBenHipaaSrvc(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc) throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(19 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_1112632564)
              .withInputs(
                  dclbenHipaaSrvc.getDbhsSlotTblId(),
                  dclbenHipaaSrvc.getDbhsStsCd(),
                  dclbenHipaaSrvc.getDbhsHipaaCd(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsHipaaVerNbr(),
                  dclbenHipaaSrvc.getDbhsNtwkTypCd(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsCancDt())
              .withDataTypes(
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR)
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
          dclbenHipaaSrvc.setDbhsStsCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        if (resultSet.next()) sqlca.setSqlcode(-811);
      } else {
        sqlca.setSqlerrp("DSNXRFF".toCharArray());
        int[] arr = {-110, 0, 0, -1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
          sqlca.setSqlerrd(i, arr[i]);
        }
        sqlca.getSqlext().setSqlstate("02000".toCharArray());
      }
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:selectBenHipaaSrvc
  // methodStart:updateBenHipaaSrvc

  /**
   * ***** UPDATE BEN_HIPAA_SRVC ***** SET STS_CD = :DBHS-STS-CD, ***** LST_UPDT_DTTM =
   * :DBHS-LST-UPDT-DTTM, ***** LST_UPDT_USER_ID = :DBHS-LST-UPDT-USER-ID ***** WHERE SLOT_TBL_ID =
   * :DBHS-SLOT-TBL-ID AND ***** HIPAA_VER_NBR = :DBHS-HIPAA-VER-NBR AND ***** HIPAA_CD =
   * :DBHS-HIPAA-CD AND ***** NTWK_TYP_CD = :DBHS-NTWK-TYP-CD AND ***** EFF_DT = :DBHS-EFF-DT AND
   * ***** CANC_DT = :DBHS-CANC-DT
   */
  public void updateBenHipaaSrvc(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc) throws Exception {

    try {
      // INSRT/UPDATE
      // reset SQLCODE
      sqlca.setSqlcode(0);
      // execute SQLJ query
      int count =
          db2Base
              .startQuery(21 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_1486496571)
              .withInputs(
                  dclbenHipaaSrvc.getDbhsStsCd(),
                  dclbenHipaaSrvc.getDbhsLstUpdtDttm(),
                  dclbenHipaaSrvc.getDbhsLstUpdtUserId(),
                  dclbenHipaaSrvc.getDbhsSlotTblId(),
                  dclbenHipaaSrvc.getDbhsHipaaVerNbr(),
                  dclbenHipaaSrvc.getDbhsHipaaCd(),
                  dclbenHipaaSrvc.getDbhsNtwkTypCd(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsCancDt())
              .withDataTypes(
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR)
              .executeUpdate();
      if (count == 0) {
        sqlca.setSqlcode(100);
      }

      sqlca.setSqlerrd(2, count);
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:updateBenHipaaSrvc
  // methodStart:selectSlotTbl

  /**
   * ***** SELECT 'Y' ***** INTO :WS-TEMP-VAR ***** FROM SLOT_TBL ***** WHERE SLOT_TBL_ID =
   * :HDR-SLOT-TBL-ID
   */
  public void selectSlotTbl(Sqlca sqlca, DclslotTbl dclslotTbl, Variables variables)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(22 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_441913244)
              .withInputs(dclslotTbl.getHdrSlotTblId())
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
          variables.setTempVar(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        if (resultSet.next()) sqlca.setSqlcode(-811);
      } else {
        sqlca.setSqlerrp("DSNXRFF".toCharArray());
        int[] arr = {-110, 0, 0, -1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
          sqlca.setSqlerrd(i, arr[i]);
        }
        sqlca.getSqlext().setSqlstate("02000".toCharArray());
      }
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:selectSlotTbl
  // methodStart:selectSrvcCdTransTbl

  /**
   * ***** SELECT 'Y' ***** INTO :WS-TEMP-VAR ***** FROM SRVC_CD_TRANS_TBL ***** WHERE SRVC_CD =
   * :DBHS-SRVC-CD
   */
  public void selectSrvcCdTransTbl(
      Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables) throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(23 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_461760984)
              .withInputs(dclbenHipaaSrvc.getDbhsSrvcCd())
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
          variables.setTempVar(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        if (resultSet.next()) sqlca.setSqlcode(-811);
      } else {
        sqlca.setSqlerrp("DSNXRFF".toCharArray());
        int[] arr = {-110, 0, 0, -1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
          sqlca.setSqlerrd(i, arr[i]);
        }
        sqlca.getSqlext().setSqlstate("02000".toCharArray());
      }
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:selectSrvcCdTransTbl
  // methodStart:selectHipaaProcCd

  /**
   * ***** SELECT 'Y' ***** INTO :WS-TEMP-VAR ***** FROM HIPAA_PROC_CD ***** WHERE HIPAA_CD =
   * :DBHS-HIPAA-CD AND ***** HIPAA_VER_NBR = :DBHS-HIPAA-VER-NBR
   */
  public void selectHipaaProcCd(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(24 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_101349912)
              .withInputs(dclbenHipaaSrvc.getDbhsHipaaCd(), dclbenHipaaSrvc.getDbhsHipaaVerNbr())
              .withDataTypes(Types.CHAR, Types.CHAR)
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
          variables.setTempVar(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        if (resultSet.next()) sqlca.setSqlcode(-811);
      } else {
        sqlca.setSqlerrp("DSNXRFF".toCharArray());
        int[] arr = {-110, 0, 0, -1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
          sqlca.setSqlerrd(i, arr[i]);
        }
        sqlca.getSqlext().setSqlstate("02000".toCharArray());
      }
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:selectHipaaProcCd
  // methodStart:selectBenHipaaSrvc1

  /**
   * ***** SELECT 'Y' ***** INTO :WS-TEMP-VAR ***** FROM BEN_HIPAA_SRVC ***** WHERE SLOT_TBL_ID =
   * :DBHS-SLOT-TBL-ID AND ***** HIPAA_CD = :DBHS-HIPAA-CD AND ***** HIPAA_VER_NBR =
   * :DBHS-HIPAA-VER-NBR AND ***** NTWK_TYP_CD = :DBHS-NTWK-TYP-CD AND ***** SRVC_CD = :DBHS-SRVC-CD
   * AND ***** EFF_DT = :DBHS-EFF-DT AND ***** PL_OF_SRVC_CD = :DBHS-PL-OF-SRVC-CD AND ***** CANC_DT
   * = :DBHS-CANC-DT AND ***** STS_CD = :DBHS-STS-CD
   */
  public void selectBenHipaaSrvc1(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(25 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_518875545)
              .withInputs(
                  dclbenHipaaSrvc.getDbhsSlotTblId(),
                  dclbenHipaaSrvc.getDbhsHipaaCd(),
                  dclbenHipaaSrvc.getDbhsHipaaVerNbr(),
                  dclbenHipaaSrvc.getDbhsNtwkTypCd(),
                  dclbenHipaaSrvc.getDbhsSrvcCd(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsPlOfSrvcCd(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsStsCd())
              .withDataTypes(
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR)
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
          variables.setTempVar(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        if (resultSet.next()) sqlca.setSqlcode(-811);
      } else {
        sqlca.setSqlerrp("DSNXRFF".toCharArray());
        int[] arr = {-110, 0, 0, -1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
          sqlca.setSqlerrd(i, arr[i]);
        }
        sqlca.getSqlext().setSqlstate("02000".toCharArray());
      }
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:selectBenHipaaSrvc1
  // methodStart:selectBenHipaaSrvc2

  /**
   * ***** SELECT 'Y' ***** INTO :WS-TEMP-VAR ***** FROM BEN_HIPAA_SRVC ***** WHERE SLOT_TBL_ID =
   * :DBHS-SLOT-TBL-ID AND ***** HIPAA_CD = :DBHS-HIPAA-CD AND ***** HIPAA_VER_NBR =
   * :DBHS-HIPAA-VER-NBR AND ***** NTWK_TYP_CD = :DBHS-NTWK-TYP-CD AND ***** SRVC_CD = :DBHS-SRVC-CD
   * AND ***** EFF_DT = :DBHS-EFF-DT AND ***** CANC_DT = :DBHS-CANC-DT AND ***** STS_CD =
   * :DBHS-STS-CD
   */
  public void selectBenHipaaSrvc2(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(26 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_269725495)
              .withInputs(
                  dclbenHipaaSrvc.getDbhsSlotTblId(),
                  dclbenHipaaSrvc.getDbhsHipaaCd(),
                  dclbenHipaaSrvc.getDbhsHipaaVerNbr(),
                  dclbenHipaaSrvc.getDbhsNtwkTypCd(),
                  dclbenHipaaSrvc.getDbhsSrvcCd(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsStsCd())
              .withDataTypes(
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR)
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
          variables.setTempVar(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        if (resultSet.next()) sqlca.setSqlcode(-811);
      } else {
        sqlca.setSqlerrp("DSNXRFF".toCharArray());
        int[] arr = {-110, 0, 0, -1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
          sqlca.setSqlerrd(i, arr[i]);
        }
        sqlca.getSqlext().setSqlstate("02000".toCharArray());
      }
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:selectBenHipaaSrvc2
  // methodStart:selectBenHipaaSrvc3

  /**
   * ***** SELECT 'Y' ***** INTO :WS-TEMP-VAR ***** FROM BEN_HIPAA_SRVC ***** WHERE SLOT_TBL_ID =
   * :DBHS-SLOT-TBL-ID AND ***** HIPAA_CD = :DBHS-HIPAA-CD AND ***** HIPAA_VER_NBR =
   * :DBHS-HIPAA-VER-NBR AND ***** NTWK_TYP_CD = :DBHS-NTWK-TYP-CD AND ***** STS_CD = :DBHS-STS-CD
   * AND ***** PL_OF_SRVC_CD = :DBHS-PL-OF-SRVC-CD AND ***** ((EFF_DT <= :DBHS-EFF-DT AND *****
   * CANC_DT >= :DBHS-EFF-DT) OR ***** (EFF_DT <= :DBHS-CANC-DT AND ***** CANC_DT >= :DBHS-CANC-DT)
   * OR ***** (EFF_DT >= :DBHS-EFF-DT AND ***** CANC_DT <= :DBHS-CANC-DT))
   */
  public void selectBenHipaaSrvc3(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(27 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_1511790402)
              .withInputs(
                  dclbenHipaaSrvc.getDbhsSlotTblId(),
                  dclbenHipaaSrvc.getDbhsHipaaCd(),
                  dclbenHipaaSrvc.getDbhsHipaaVerNbr(),
                  dclbenHipaaSrvc.getDbhsNtwkTypCd(),
                  dclbenHipaaSrvc.getDbhsStsCd(),
                  dclbenHipaaSrvc.getDbhsPlOfSrvcCd(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsCancDt())
              .withDataTypes(
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR)
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
          variables.setTempVar(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        if (resultSet.next()) sqlca.setSqlcode(-811);
      } else {
        sqlca.setSqlerrp("DSNXRFF".toCharArray());
        int[] arr = {-110, 0, 0, -1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
          sqlca.setSqlerrd(i, arr[i]);
        }
        sqlca.getSqlext().setSqlstate("02000".toCharArray());
      }
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:selectBenHipaaSrvc3
  // methodStart:selectBenHipaaSrvc4

  /**
   * ***** SELECT 'Y' ***** INTO :WS-TEMP-VAR ***** FROM BEN_HIPAA_SRVC ***** WHERE SLOT_TBL_ID =
   * :DBHS-SLOT-TBL-ID AND ***** HIPAA_CD = :DBHS-HIPAA-CD AND ***** HIPAA_VER_NBR =
   * :DBHS-HIPAA-VER-NBR AND ***** NTWK_TYP_CD = :DBHS-NTWK-TYP-CD AND ***** STS_CD = :DBHS-STS-CD
   * AND ***** PL_OF_SRVC_CD = :DBHS-PL-OF-SRVC-CD AND ***** EFF_DT <> :DBHS-EFF-DT AND *****
   * ((EFF_DT >= :DBHS-EFF-DT AND ***** EFF_DT <= :DBHS-CANC-DT) OR ***** (CANC_DT >= :DBHS-EFF-DT
   * AND ***** CANC_DT <= :DBHS-EFF-DT))
   */
  public void selectBenHipaaSrvc4(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(28 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_1297032895)
              .withInputs(
                  dclbenHipaaSrvc.getDbhsSlotTblId(),
                  dclbenHipaaSrvc.getDbhsHipaaCd(),
                  dclbenHipaaSrvc.getDbhsHipaaVerNbr(),
                  dclbenHipaaSrvc.getDbhsNtwkTypCd(),
                  dclbenHipaaSrvc.getDbhsStsCd(),
                  dclbenHipaaSrvc.getDbhsPlOfSrvcCd(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsEffDt())
              .withDataTypes(
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR)
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
          variables.setTempVar(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        if (resultSet.next()) sqlca.setSqlcode(-811);
      } else {
        sqlca.setSqlerrp("DSNXRFF".toCharArray());
        int[] arr = {-110, 0, 0, -1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
          sqlca.setSqlerrd(i, arr[i]);
        }
        sqlca.getSqlext().setSqlstate("02000".toCharArray());
      }
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:selectBenHipaaSrvc4
  // methodStart:selectBenHipaaSrvc5

  /**
   * ***** SELECT 'Y' ***** INTO :WS-TEMP-VAR ***** FROM BEN_HIPAA_SRVC ***** WHERE SLOT_TBL_ID =
   * :DBHS-SLOT-TBL-ID AND ***** HIPAA_CD = :DBHS-HIPAA-CD AND ***** HIPAA_VER_NBR =
   * :DBHS-HIPAA-VER-NBR AND ***** NTWK_TYP_CD = :DBHS-NTWK-TYP-CD AND ***** STS_CD = :DBHS-STS-CD
   * AND ***** ((EFF_DT <= :DBHS-EFF-DT AND ***** CANC_DT >= :DBHS-EFF-DT) OR ***** (EFF_DT <=
   * :DBHS-CANC-DT AND ***** CANC_DT >= :DBHS-CANC-DT) OR ***** (EFF_DT >= :DBHS-EFF-DT AND *****
   * CANC_DT <= :DBHS-CANC-DT))
   */
  public void selectBenHipaaSrvc5(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(29 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_907709156)
              .withInputs(
                  dclbenHipaaSrvc.getDbhsSlotTblId(),
                  dclbenHipaaSrvc.getDbhsHipaaCd(),
                  dclbenHipaaSrvc.getDbhsHipaaVerNbr(),
                  dclbenHipaaSrvc.getDbhsNtwkTypCd(),
                  dclbenHipaaSrvc.getDbhsStsCd(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsCancDt())
              .withDataTypes(
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR)
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
          variables.setTempVar(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        if (resultSet.next()) sqlca.setSqlcode(-811);
      } else {
        sqlca.setSqlerrp("DSNXRFF".toCharArray());
        int[] arr = {-110, 0, 0, -1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
          sqlca.setSqlerrd(i, arr[i]);
        }
        sqlca.getSqlext().setSqlstate("02000".toCharArray());
      }
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:selectBenHipaaSrvc5
  // methodStart:selectBenHipaaSrvc6

  /**
   * ***** SELECT 'Y' ***** INTO :WS-TEMP-VAR ***** FROM BEN_HIPAA_SRVC ***** WHERE SLOT_TBL_ID =
   * :DBHS-SLOT-TBL-ID AND ***** HIPAA_CD = :DBHS-HIPAA-CD AND ***** HIPAA_VER_NBR =
   * :DBHS-HIPAA-VER-NBR AND ***** NTWK_TYP_CD = :DBHS-NTWK-TYP-CD AND ***** STS_CD = :DBHS-STS-CD
   * AND ***** EFF_DT <> :DBHS-EFF-DT AND ***** ((EFF_DT >= :DBHS-EFF-DT AND ***** EFF_DT <=
   * :DBHS-CANC-DT) OR ***** (CANC_DT >= :DBHS-EFF-DT AND ***** CANC_DT <= :DBHS-EFF-DT))
   */
  public void selectBenHipaaSrvc6(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(30 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_329256477)
              .withInputs(
                  dclbenHipaaSrvc.getDbhsSlotTblId(),
                  dclbenHipaaSrvc.getDbhsHipaaCd(),
                  dclbenHipaaSrvc.getDbhsHipaaVerNbr(),
                  dclbenHipaaSrvc.getDbhsNtwkTypCd(),
                  dclbenHipaaSrvc.getDbhsStsCd(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsEffDt())
              .withDataTypes(
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR)
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
          variables.setTempVar(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        if (resultSet.next()) sqlca.setSqlcode(-811);
      } else {
        sqlca.setSqlerrp("DSNXRFF".toCharArray());
        int[] arr = {-110, 0, 0, -1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
          sqlca.setSqlerrd(i, arr[i]);
        }
        sqlca.getSqlext().setSqlstate("02000".toCharArray());
      }
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:selectBenHipaaSrvc6
  // methodStart:selectBenHipaaSrvc7

  /**
   * ***** SELECT 'Y' ***** INTO :WS-TEMP-VAR ***** FROM BEN_HIPAA_SRVC ***** WHERE SLOT_TBL_ID =
   * :DBHS-SLOT-TBL-ID AND ***** HIPAA_CD = :DBHS-HIPAA-CD AND ***** HIPAA_VER_NBR =
   * :DBHS-HIPAA-VER-NBR AND ***** NTWK_TYP_CD = :DBHS-NTWK-TYP-CD AND ***** STS_CD = :DBHS-STS-CD
   * AND ***** PL_OF_SRVC_CD = :DBHS-PL-OF-SRVC-CD AND ***** SRVC_CD = :DBHS-SRVC-CD AND *****
   * ((EFF_DT <= :DBHS-EFF-DT AND ***** CANC_DT >= :DBHS-EFF-DT) OR ***** (EFF_DT <= :DBHS-CANC-DT
   * AND ***** CANC_DT >= :DBHS-CANC-DT) OR ***** (EFF_DT >= :DBHS-EFF-DT AND ***** CANC_DT <=
   * :DBHS-CANC-DT))
   */
  public void selectBenHipaaSrvc7(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(31 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_1350357797)
              .withInputs(
                  dclbenHipaaSrvc.getDbhsSlotTblId(),
                  dclbenHipaaSrvc.getDbhsHipaaCd(),
                  dclbenHipaaSrvc.getDbhsHipaaVerNbr(),
                  dclbenHipaaSrvc.getDbhsNtwkTypCd(),
                  dclbenHipaaSrvc.getDbhsStsCd(),
                  dclbenHipaaSrvc.getDbhsPlOfSrvcCd(),
                  dclbenHipaaSrvc.getDbhsSrvcCd(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsCancDt())
              .withDataTypes(
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR)
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
          variables.setTempVar(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        if (resultSet.next()) sqlca.setSqlcode(-811);
      } else {
        sqlca.setSqlerrp("DSNXRFF".toCharArray());
        int[] arr = {-110, 0, 0, -1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
          sqlca.setSqlerrd(i, arr[i]);
        }
        sqlca.getSqlext().setSqlstate("02000".toCharArray());
      }
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:selectBenHipaaSrvc7
  // methodStart:selectBenHipaaSrvc8

  /**
   * ***** SELECT 'Y' ***** INTO :WS-TEMP-VAR ***** FROM BEN_HIPAA_SRVC ***** WHERE SLOT_TBL_ID =
   * :DBHS-SLOT-TBL-ID AND ***** HIPAA_CD = :DBHS-HIPAA-CD AND ***** HIPAA_VER_NBR =
   * :DBHS-HIPAA-VER-NBR AND ***** NTWK_TYP_CD = :DBHS-NTWK-TYP-CD AND ***** STS_CD = :DBHS-STS-CD
   * AND ***** PL_OF_SRVC_CD = :DBHS-PL-OF-SRVC-CD AND ***** SRVC_CD = :DBHS-SRVC-CD AND *****
   * EFF_DT <> :DBHS-EFF-DT AND ***** ((EFF_DT >= :DBHS-EFF-DT AND ***** EFF_DT <= :DBHS-CANC-DT) OR
   * ***** (CANC_DT >= :DBHS-EFF-DT AND ***** CANC_DT <= :DBHS-EFF-DT))
   */
  public void selectBenHipaaSrvc8(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(32 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_1120793946)
              .withInputs(
                  dclbenHipaaSrvc.getDbhsSlotTblId(),
                  dclbenHipaaSrvc.getDbhsHipaaCd(),
                  dclbenHipaaSrvc.getDbhsHipaaVerNbr(),
                  dclbenHipaaSrvc.getDbhsNtwkTypCd(),
                  dclbenHipaaSrvc.getDbhsStsCd(),
                  dclbenHipaaSrvc.getDbhsPlOfSrvcCd(),
                  dclbenHipaaSrvc.getDbhsSrvcCd(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsEffDt())
              .withDataTypes(
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR)
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
          variables.setTempVar(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        if (resultSet.next()) sqlca.setSqlcode(-811);
      } else {
        sqlca.setSqlerrp("DSNXRFF".toCharArray());
        int[] arr = {-110, 0, 0, -1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
          sqlca.setSqlerrd(i, arr[i]);
        }
        sqlca.getSqlext().setSqlstate("02000".toCharArray());
      }
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:selectBenHipaaSrvc8
  // methodStart:selectBenHipaaSrvc9

  /**
   * ***** SELECT 'Y' ***** INTO :WS-TEMP-VAR ***** FROM BEN_HIPAA_SRVC ***** WHERE SLOT_TBL_ID =
   * :DBHS-SLOT-TBL-ID AND ***** HIPAA_CD = :DBHS-HIPAA-CD AND ***** HIPAA_VER_NBR =
   * :DBHS-HIPAA-VER-NBR AND ***** NTWK_TYP_CD = :DBHS-NTWK-TYP-CD AND ***** STS_CD = :DBHS-STS-CD
   * AND ***** SRVC_CD = :DBHS-SRVC-CD AND ***** ((EFF_DT <= :DBHS-EFF-DT AND ***** CANC_DT >=
   * :DBHS-EFF-DT) OR ***** (EFF_DT <= :DBHS-CANC-DT AND ***** CANC_DT >= :DBHS-CANC-DT) OR *****
   * (EFF_DT >= :DBHS-EFF-DT AND ***** CANC_DT <= :DBHS-CANC-DT))
   */
  public void selectBenHipaaSrvc9(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(33 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_700062845)
              .withInputs(
                  dclbenHipaaSrvc.getDbhsSlotTblId(),
                  dclbenHipaaSrvc.getDbhsHipaaCd(),
                  dclbenHipaaSrvc.getDbhsHipaaVerNbr(),
                  dclbenHipaaSrvc.getDbhsNtwkTypCd(),
                  dclbenHipaaSrvc.getDbhsStsCd(),
                  dclbenHipaaSrvc.getDbhsSrvcCd(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsCancDt())
              .withDataTypes(
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR)
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
          variables.setTempVar(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        if (resultSet.next()) sqlca.setSqlcode(-811);
      } else {
        sqlca.setSqlerrp("DSNXRFF".toCharArray());
        int[] arr = {-110, 0, 0, -1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
          sqlca.setSqlerrd(i, arr[i]);
        }
        sqlca.getSqlext().setSqlstate("02000".toCharArray());
      }
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:selectBenHipaaSrvc9
  // methodStart:selectBenHipaaSrvc10

  /**
   * ***** SELECT 'Y' ***** INTO :WS-TEMP-VAR ***** FROM BEN_HIPAA_SRVC ***** WHERE SLOT_TBL_ID =
   * :DBHS-SLOT-TBL-ID AND ***** HIPAA_CD = :DBHS-HIPAA-CD AND ***** HIPAA_VER_NBR =
   * :DBHS-HIPAA-VER-NBR AND ***** NTWK_TYP_CD = :DBHS-NTWK-TYP-CD AND ***** STS_CD = :DBHS-STS-CD
   * AND ***** SRVC_CD = :DBHS-SRVC-CD AND ***** EFF_DT <> :DBHS-EFF-DT AND ***** ((EFF_DT >=
   * :DBHS-EFF-DT AND ***** EFF_DT <= :DBHS-CANC-DT) OR ***** (CANC_DT >= :DBHS-EFF-DT AND *****
   * CANC_DT <= :DBHS-EFF-DT))
   */
  public void selectBenHipaaSrvc10(
      Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables) throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(34 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_919308796)
              .withInputs(
                  dclbenHipaaSrvc.getDbhsSlotTblId(),
                  dclbenHipaaSrvc.getDbhsHipaaCd(),
                  dclbenHipaaSrvc.getDbhsHipaaVerNbr(),
                  dclbenHipaaSrvc.getDbhsNtwkTypCd(),
                  dclbenHipaaSrvc.getDbhsStsCd(),
                  dclbenHipaaSrvc.getDbhsSrvcCd(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsEffDt())
              .withDataTypes(
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR)
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
          variables.setTempVar(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        if (resultSet.next()) sqlca.setSqlcode(-811);
      } else {
        sqlca.setSqlerrp("DSNXRFF".toCharArray());
        int[] arr = {-110, 0, 0, -1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
          sqlca.setSqlerrd(i, arr[i]);
        }
        sqlca.getSqlext().setSqlstate("02000".toCharArray());
      }
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:selectBenHipaaSrvc10
  // methodStart:selectBenHipaaSrvc11

  /**
   * ***** SELECT 'Y' ***** INTO :WS-TEMP-VAR ***** FROM BEN_HIPAA_SRVC ***** WHERE SLOT_TBL_ID =
   * :DBHS-SLOT-TBL-ID AND ***** HIPAA_CD = :DBHS-HIPAA-CD AND ***** HIPAA_VER_NBR =
   * :DBHS-HIPAA-VER-NBR AND ***** NTWK_TYP_CD = :WS-NET-IND-BOTH AND ***** EFF_DT = :DBHS-EFF-DT
   * AND ***** CANC_DT = :DBHS-CANC-DT AND ***** STS_CD = :DBHS-STS-CD
   */
  public void selectBenHipaaSrvc11(
      Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables) throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(35 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_479260222)
              .withInputs(
                  dclbenHipaaSrvc.getDbhsSlotTblId(),
                  dclbenHipaaSrvc.getDbhsHipaaCd(),
                  dclbenHipaaSrvc.getDbhsHipaaVerNbr(),
                  variables.getNetIndBoth(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsStsCd())
              .withDataTypes(
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR)
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
          variables.setTempVar(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        if (resultSet.next()) sqlca.setSqlcode(-811);
      } else {
        sqlca.setSqlerrp("DSNXRFF".toCharArray());
        int[] arr = {-110, 0, 0, -1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
          sqlca.setSqlerrd(i, arr[i]);
        }
        sqlca.getSqlext().setSqlstate("02000".toCharArray());
      }
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:selectBenHipaaSrvc11
  // methodStart:selectBenHipaaSrvc12

  /**
   * ***** SELECT 'Y' ***** INTO :WS-TEMP-VAR ***** FROM BEN_HIPAA_SRVC ***** WHERE SLOT_TBL_ID =
   * :DBHS-SLOT-TBL-ID AND ***** HIPAA_CD = :DBHS-HIPAA-CD AND ***** HIPAA_VER_NBR =
   * :DBHS-HIPAA-VER-NBR AND ***** NTWK_TYP_CD IN ('I', 'O') AND ***** EFF_DT = :DBHS-EFF-DT AND
   * ***** CANC_DT = :DBHS-CANC-DT AND ***** STS_CD = :DBHS-STS-CD
   */
  public void selectBenHipaaSrvc12(
      Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables) throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(36 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_1691661082)
              .withInputs(
                  dclbenHipaaSrvc.getDbhsSlotTblId(),
                  dclbenHipaaSrvc.getDbhsHipaaCd(),
                  dclbenHipaaSrvc.getDbhsHipaaVerNbr(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsStsCd())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
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
          variables.setTempVar(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        if (resultSet.next()) sqlca.setSqlcode(-811);
      } else {
        sqlca.setSqlerrp("DSNXRFF".toCharArray());
        int[] arr = {-110, 0, 0, -1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
          sqlca.setSqlerrd(i, arr[i]);
        }
        sqlca.getSqlext().setSqlstate("02000".toCharArray());
      }
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:selectBenHipaaSrvc12
  // methodStart:insertBenHipaaSrvc

  /**
   * ***** INSERT INTO BEN_HIPAA_SRVC ***** (SLOT_TBL_ID, ***** EFF_DT, ***** CREAT_DTTM, *****
   * SRVC_CD, ***** PL_OF_SRVC_CD, ***** CAUS_CD, ***** BEN_LVL_CD, ***** NTWK_TYP_CD, *****
   * PROC_CD_RNG_BEGN_VAL, ***** PROC_CD_RNG_END_VAL, ***** PROC_CD_RNG_TYP_VAL, ***** HIPAA_CD,
   * ***** IN_NTWK_CLSS_CD, ***** TIER1_NTWK_CLSS_CD, ***** CANC_DT, ***** LST_UPDT_DTTM, *****
   * LST_UPDT_USER_ID, ***** STS_CD, ***** PROV_ORG_TYP_CD) ***** VALUES (:DBHS-SLOT-TBL-ID, *****
   * :DBHS-EFF-DT, ***** :DBHS-LST-UPDT-DTTM, ***** :DBHS-SRVC-CD, ***** :DBHS-PL-OF-SRVC-CD, *****
   * :DBHS-CAUS-CD, ***** :DBHS-BEN-LVL-CD, ***** :DBHS-NTWK-TYP-CD, *****
   * :DBHS-PROC-CD-RNG-BEGN-VAL, ***** :DBHS-PROC-CD-RNG-END-VAL, ***** :DBHS-PROC-CD-RNG-TYP-VAL,
   * ***** :DBHS-HIPAA-CD, ***** :DBHS-IN-NTWK-CLSS-CD, ***** :DBHS-TIER1-NTWK-CLSS-CD, *****
   * :DBHS-CANC-DT, ***** :DBHS-LST-UPDT-DTTM, ***** :DBHS-LST-UPDT-USER-ID, ***** :DBHS-STS-CD,
   * ***** :DBHS-PROV-ORG-TYP-CD)
   */
  public void insertBenHipaaSrvc(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc) throws Exception {

    try {
      // INSRT/UPDATE
      // reset SQLCODE
      sqlca.setSqlcode(0);
      // execute SQLJ query
      int count =
          db2Base
              .startQuery(38 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_1052262107)
              .withInputs(
                  dclbenHipaaSrvc.getDbhsSlotTblId(),
                  dclbenHipaaSrvc.getDbhsEffDt(),
                  dclbenHipaaSrvc.getDbhsLstUpdtDttm(),
                  dclbenHipaaSrvc.getDbhsSrvcCd(),
                  dclbenHipaaSrvc.getDbhsPlOfSrvcCd(),
                  dclbenHipaaSrvc.getDbhsCausCd(),
                  dclbenHipaaSrvc.getDbhsBenLvlCd(),
                  dclbenHipaaSrvc.getDbhsNtwkTypCd(),
                  dclbenHipaaSrvc.getDbhsProcCdRngBegnVal(),
                  dclbenHipaaSrvc.getDbhsProcCdRngEndVal(),
                  dclbenHipaaSrvc.getDbhsProcCdRngTypVal(),
                  dclbenHipaaSrvc.getDbhsHipaaCd(),
                  dclbenHipaaSrvc.getDbhsInNtwkClssCd(),
                  dclbenHipaaSrvc.getDbhsTier1NtwkClssCd(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsLstUpdtDttm(),
                  dclbenHipaaSrvc.getDbhsLstUpdtUserId(),
                  dclbenHipaaSrvc.getDbhsStsCd(),
                  dclbenHipaaSrvc.getDbhsProvOrgTypCd())
              .withDataTypes(
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR)
              .executeUpdate();

      sqlca.setSqlerrd(2, count);
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:insertBenHipaaSrvc
  // methodStart:updateBenHipaaSrvc1

  /**
   * ***** UPDATE BEN_HIPAA_SRVC ***** SET SRVC_CD = :DBHS-SRVC-CD ***** ,PL_OF_SRVC_CD =
   * :DBHS-PL-OF-SRVC-CD ***** ,CAUS_CD = :DBHS-CAUS-CD ***** ,BEN_LVL_CD = :DBHS-BEN-LVL-CD *****
   * ,PROC_CD_RNG_BEGN_VAL = :DBHS-PROC-CD-RNG-BEGN-VAL ***** ,PROC_CD_RNG_END_VAL =
   * :DBHS-PROC-CD-RNG-END-VAL ***** ,PROC_CD_RNG_TYP_VAL = :DBHS-PROC-CD-RNG-TYP-VAL *****
   * ,IN_NTWK_CLSS_CD = :DBHS-IN-NTWK-CLSS-CD ***** ,TIER1_NTWK_CLSS_CD = :DBHS-TIER1-NTWK-CLSS-CD
   * ***** ,PROV_ORG_TYP_CD = :DBHS-PROV-ORG-TYP-CD ***** ,CANC_DT = :DBHS-CANC-DT *****
   * ,LST_UPDT_DTTM = :DBHS-LST-UPDT-DTTM ***** ,LST_UPDT_USER_ID = :DBHS-LST-UPDT-USER-ID *****
   * WHERE SLOT_TBL_ID = :DBHS-SLOT-TBL-ID AND ***** HIPAA_VER_NBR = :DBHS-HIPAA-VER-NBR AND *****
   * HIPAA_CD = :DBHS-HIPAA-CD AND ***** NTWK_TYP_CD = :DBHS-NTWK-TYP-CD AND ***** STS_CD =
   * :DBHS-STS-CD AND ***** EFF_DT = :DBHS-EFF-DT
   */
  public void updateBenHipaaSrvc1(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc) throws Exception {

    try {
      // INSRT/UPDATE
      // reset SQLCODE
      sqlca.setSqlcode(0);
      // execute SQLJ query
      int count =
          db2Base
              .startQuery(40 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427BHI)
              .withSql(SQLS.SQL_1347193703)
              .withInputs(
                  dclbenHipaaSrvc.getDbhsSrvcCd(),
                  dclbenHipaaSrvc.getDbhsPlOfSrvcCd(),
                  dclbenHipaaSrvc.getDbhsCausCd(),
                  dclbenHipaaSrvc.getDbhsBenLvlCd(),
                  dclbenHipaaSrvc.getDbhsProcCdRngBegnVal(),
                  dclbenHipaaSrvc.getDbhsProcCdRngEndVal(),
                  dclbenHipaaSrvc.getDbhsProcCdRngTypVal(),
                  dclbenHipaaSrvc.getDbhsInNtwkClssCd(),
                  dclbenHipaaSrvc.getDbhsTier1NtwkClssCd(),
                  dclbenHipaaSrvc.getDbhsProvOrgTypCd(),
                  dclbenHipaaSrvc.getDbhsCancDt(),
                  dclbenHipaaSrvc.getDbhsLstUpdtDttm(),
                  dclbenHipaaSrvc.getDbhsLstUpdtUserId(),
                  dclbenHipaaSrvc.getDbhsSlotTblId(),
                  dclbenHipaaSrvc.getDbhsHipaaVerNbr(),
                  dclbenHipaaSrvc.getDbhsHipaaCd(),
                  dclbenHipaaSrvc.getDbhsNtwkTypCd(),
                  dclbenHipaaSrvc.getDbhsStsCd(),
                  dclbenHipaaSrvc.getDbhsEffDt())
              .withDataTypes(
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR)
              .executeUpdate();
      if (count == 0) {
        sqlca.setSqlcode(100);
      }

      sqlca.setSqlerrd(2, count);
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:updateBenHipaaSrvc1
  // methodStart:fillSqlcaObject
  public void fillSqlcaObject(Sqlca sqlca, SQLException e) {
    CfSqlca db2Sqlca = Db2Base.getCfSqlca(e);
    if (db2Sqlca != null) {
      sqlca.setSqlcaid("SQLCA  ".toCharArray());
      sqlca.setSqlcabc(136);
      sqlca.setSqlcode(db2Sqlca.getSqlCode());
      sqlca.setSqlerrp(db2Sqlca.getSqlErrp().toCharArray());
      if (db2Sqlca.getSqlErrmc() != null) {
        sqlca.getSqlerrm().setSqlerrml(db2Sqlca.getSqlErrmc().length());
        char ch = 65533;
        char[] errmc = db2Sqlca.getSqlErrmc().toCharArray();
        for (int i = 0; i < errmc.length; i++) {
          if (errmc[i] == ';') {
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
            sqlca.getSqlwarn().setSqlwarn0(new char[] {sqlWarn[0]});
            break;
          case 1:
            sqlca.getSqlwarn().setSqlwarn1(new char[] {sqlWarn[1]});
            break;
          case 2:
            sqlca.getSqlwarn().setSqlwarn2(new char[] {sqlWarn[2]});
            break;
          case 3:
            sqlca.getSqlwarn().setSqlwarn3(new char[] {sqlWarn[3]});
            break;
          case 4:
            sqlca.getSqlwarn().setSqlwarn4(new char[] {sqlWarn[4]});
            break;
          case 5:
            sqlca.getSqlwarn().setSqlwarn5(new char[] {sqlWarn[5]});
            break;
          case 6:
            sqlca.getSqlwarn().setSqlwarn6(new char[] {sqlWarn[6]});
            break;
          case 7:
            sqlca.getSqlwarn().setSqlwarn7(new char[] {sqlWarn[7]});
            break;
          case 8:
            sqlca.getSqlext().setSqlwarn8(new char[] {sqlWarn[8]});
            break;
          case 9:
            sqlca.getSqlext().setSqlwarn9(new char[] {sqlWarn[9]});
            break;
          case 10:
            sqlca.getSqlext().setSqlwarna(new char[] {sqlWarn[10]});
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
    sqlca.setSqlerrd(0, -240);
    sqlca.setSqlerrd(1, 0);
    sqlca.setSqlerrd(2, 0);
    sqlca.setSqlerrd(3, -1);
    sqlca.setSqlerrd(4, 0);
    sqlca.setSqlerrd(5, 0);
    sqlca.getSqlext().setSqlstate("24501".toCharArray());
  }

  public void closeCursor(ResultSet result, Sqlca sqlca) throws Exception {
    sqlca.setSqlcode(0);
    try {
      db2Base.closeCursor(result);
    } catch (Exception e) {
      logger.info("{} close had exception", result);
    }

    db2Base.updateFetchCounter(sqlFetchCounter);
  }
}
