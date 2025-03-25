package com.cloudframe.app.repository.impl;

import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.dao.CfSqlca;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.dao.SqlBase;
import com.cloudframe.app.dto.d5427pol.*;
import com.cloudframe.app.repository.D5427polRepository;
import java.math.BigDecimal;
import java.math.MathContext;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("d5427polRepository")
public class D5427polRepositoryImpl implements D5427polRepository {
  Logger logger = LoggerFactory.getLogger(D5427polRepositoryImpl.class);

  // declare:start
  int sqlFetchCounter = 0;
  static final short NOT_NULL = (short) 0;
  // declare:end

  @Autowired
  @Qualifier("db2Base")
  SqlBase<char[]> db2Base;

  // methodStart:selectCustPolPlnXref

  /**
   * ***** SELECT ***** STD_PLN_POL_NBR ***** ,STD_PLN_PLN_NBR ***** ,STD_PLN_CLSS_NBR *****
   * ,MML_COV_SET_NBR ***** INTO ***** :XRF-STD-PLN-POL-NBR ***** ,:XRF-STD-PLN-PLN-NBR *****
   * ,:XRF-STD-PLN-CLSS-NBR ***** ,:XRF-MML-COV-SET-NBR ***** FROM CUST_POL_PLN_XREF ***** WHERE
   * ***** COV_TYP_CD = :XRF-COV-TYP-CD AND ***** POL_NBR = :XRF-POL-NBR AND ***** PLN_NBR =
   * :XRF-PLN-NBR AND ***** CLSS_NBR = :XRF-CLSS-NBR AND ***** ((EFF_DT <=:XRF-EFF-DT AND *****
   * CANC_DT >=:XRF-EFF-DT) OR ***** (EFF_DT <=:XRF-CANC-DT AND ***** CANC_DT >=:XRF-CANC-DT)) *****
   * ORDER BY EFF_DT ASC ***** FETCH FIRST 1 ROWS ONLY
   */
  public void selectCustPolPlnXref(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(21 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1586418667)
              .withInputs(
                  dclcustPolPlnXref.getXrfCovTypCd(),
                  dclcustPolPlnXref.getXrfPolNbr(),
                  dclcustPolPlnXref.getXrfPlnNbr(),
                  dclcustPolPlnXref.getXrfClssNbr(),
                  dclcustPolPlnXref.getXrfEffDt(),
                  dclcustPolPlnXref.getXrfEffDt(),
                  dclcustPolPlnXref.getXrfCancDt(),
                  dclcustPolPlnXref.getXrfCancDt())
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
          dclcustPolPlnXref.setXrfStdPlnPolNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(2);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfStdPlnPlnNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(3);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfStdPlnClssNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(4);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfMmlCovSetNbr(resultObj.toString().toCharArray());
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
  // methodEnd:selectCustPolPlnXref
  // methodStart:selectCustPolPlnXref1

  /**
   * ***** SELECT ***** EFF_DT ***** , CANC_DT ***** INTO ***** :XRF-EFF-DT ***** , :XRF-CANC-DT
   * ***** FROM CUST_POL_PLN_XREF ***** WHERE ***** COV_TYP_CD = :XRF-COV-TYP-CD AND ***** POL_NBR =
   * :XRF-POL-NBR AND ***** PLN_NBR = :XRF-PLN-NBR AND ***** CLSS_NBR = :XRF-CLSS-NBR AND *****
   * EFF_DT <= DATE (CURRENT TIMESTAMP) ***** ORDER BY EFF_DT DESC ***** FETCH FIRST 1 ROWS ONLY
   */
  public void selectCustPolPlnXref1(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(22 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_461420477)
              .withInputs(
                  dclcustPolPlnXref.getXrfCovTypCd(),
                  dclcustPolPlnXref.getXrfPolNbr(),
                  dclcustPolPlnXref.getXrfPlnNbr(),
                  dclcustPolPlnXref.getXrfClssNbr())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
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
          dclcustPolPlnXref.setXrfEffDt(resultObjString.toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = resultSet.getString(2);
        if (resultObjString != null) {
          dclcustPolPlnXref.setXrfCancDt(resultObjString.toCharArray());
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
  // methodEnd:selectCustPolPlnXref1
  // methodStart:openCurMxiCsrD5427pol

  /**
   * ***** DECLARE CUR-MXI-CSR CURSOR FOR ***** SELECT ***** STD_PLN_POL_NBR ***** ,STD_PLN_PLN_NBR
   * ***** ,STD_PLN_CLSS_NBR ***** ,EFF_DT ***** ,CANC_DT ***** FROM CUST_POL_PLN_XREF ***** WHERE
   * ***** COV_TYP_CD = :XRF-COV-TYP-CD AND ***** POL_NBR = :XRF-POL-NBR AND ***** PLN_NBR =
   * :XRF-PLN-NBR AND ***** CLSS_NBR = :XRF-CLSS-NBR AND ***** ((EFF_DT <=:XRF-EFF-DT AND *****
   * CANC_DT >=:XRF-EFF-DT) OR ***** (EFF_DT <=:XRF-CANC-DT AND ***** CANC_DT >=:XRF-CANC-DT)) *****
   * ORDER BY EFF_DT ASC ***** FETCH FIRST 2 ROWS ONLY
   */
  public ResultSet openCurMxiCsrD5427pol(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception {
    ResultSet curMxiCsrResultSet = null;
    try {
      // OPEN CURSOR
      sqlca.setSqlcode(0);
      curMxiCsrResultSet =
          db2Base
              .startQuery(13 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_642087827)
              .withInputs(
                  dclcustPolPlnXref.getXrfCovTypCd(),
                  dclcustPolPlnXref.getXrfPolNbr(),
                  dclcustPolPlnXref.getXrfPlnNbr(),
                  dclcustPolPlnXref.getXrfClssNbr(),
                  dclcustPolPlnXref.getXrfEffDt(),
                  dclcustPolPlnXref.getXrfEffDt(),
                  dclcustPolPlnXref.getXrfCancDt(),
                  dclcustPolPlnXref.getXrfCancDt())
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

    return curMxiCsrResultSet;
  }
  // methodEnd:openCurMxiCsrD5427pol
  // methodStart:fetchCurMxiCsrD5427pol

  /**
   * ***** FETCH CUR-MXI-CSR ***** INTO ***** :XRF-STD-PLN-POL-NBR ***** ,:XRF-STD-PLN-PLN-NBR *****
   * ,:XRF-STD-PLN-CLSS-NBR ***** ,:XRF-EFF-DT ***** ,:XRF-CANC-DT
   */
  public void fetchCurMxiCsrD5427pol(
      ResultSet curMxiCsrResultSet, Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception {
    try {
      boolean hasResults = curMxiCsrResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = curMxiCsrResultSet.getObject(1);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfStdPlnPolNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curMxiCsrResultSet.getObject(2);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfStdPlnPlnNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curMxiCsrResultSet.getObject(3);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfStdPlnClssNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = curMxiCsrResultSet.getString(4);
        if (resultObjString != null) {
          dclcustPolPlnXref.setXrfEffDt(resultObjString.toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = curMxiCsrResultSet.getString(5);
        if (resultObjString != null) {
          dclcustPolPlnXref.setXrfCancDt(resultObjString.toCharArray());
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
        logger.error("curMxiCsrResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchCurMxiCsrD5427pol
  // methodStart:closeCurMxiCsrD5427pol

  /** ***** CLOSE CUR-MXI-CSR */
  public void closeCurMxiCsrD5427pol(ResultSet curMxiCsrResultSet, Sqlca sqlca) throws Exception {

    closeCursor(curMxiCsrResultSet, sqlca);
  }
  // methodEnd:closeCurMxiCsrD5427pol
  // methodStart:selectPolPlnMstr

  /**
   * ***** SELECT POL_TYP_CD ***** ,EFF_DT ***** ,VAR_PRD_FCT ***** INTO :MMI-POL-TYP-CD *****
   * ,:MMI-EFF-DT ***** ,:MMI-VAR-PRD-FCT ***** FROM POL_PLN_MSTR ***** WHERE POL_NBR = :MMI-POL-NBR
   * ***** AND PLN_NBR = :MMI-PLN-NBR ***** AND CLSS_NBR = :MMI-CLSS-NBR ***** AND COV_TYP_CD =
   * :MMI-COV-TYP-CD
   */
  public void selectPolPlnMstr(DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca) throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(26 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_778476303)
              .withInputs(
                  dclpolPlnMstr.getMmiPolNbr(),
                  dclpolPlnMstr.getMmiPlnNbr(),
                  dclpolPlnMstr.getMmiClssNbr(),
                  dclpolPlnMstr.getMmiCovTypCd())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
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
          dclpolPlnMstr.setMmiPolTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = resultSet.getString(2);
        if (resultObjString != null) {
          dclpolPlnMstr.setMmiEffDt(resultObjString.toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(3);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiVarPrdFct((short) ((Integer) resultObj).intValue());
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
  // methodEnd:selectPolPlnMstr
  // methodStart:selectNtwkRcprctyDtl

  /**
   * ***** SELECT ***** PREF_CD ***** INTO :DTL-PREF-CD ***** FROM NTWK_RCPRCTY_DTL A ***** WHERE
   * RCPRCTY_TBL_ID = :MMI-RCPRCTY-TBL-ID ***** AND PREF_CD > ' ' ***** FETCH FIRST 1 ROWS ONLY
   */
  public void selectNtwkRcprctyDtl(
      DclpolPlnMstr dclpolPlnMstr, DclntwkRcprctyDtl dclntwkRcprctyDtl, Sqlca sqlca)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(27 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1713950648)
              .withInputs(dclpolPlnMstr.getMmiRcprctyTblId())
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
          dclntwkRcprctyDtl.setDtlPrefCd(resultObj.toString().toCharArray());
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
  // methodEnd:selectNtwkRcprctyDtl
  // methodStart:selectCustPolPlnXref2

  /**
   * ***** SELECT MNNRP_CD ***** ,MNNRP_PCT ***** ,UH_PREM_DESG_CD ***** ,PRORT_EVNT *****
   * ,PRDCT_PLN_CLSS_CD ***** ,PLN_DED_PRORT_IND ***** ,EFF_DT ***** ,CANC_DT ***** INTO *****
   * :XRF-MNNRP-CD ***** ,:XRF-MNNRP-PCT ***** ,:XRF-UH-PREM-DESG-CD ***** ,:XRF-PRORT-EVNT *****
   * ,:XRF-PRDCT-PLN-CLSS-CD ***** ,:XRF-PLN-DED-PRORT-IND ***** ,:XRF-EFF-DT ***** ,:XRF-CANC-DT
   * ***** FROM CUST_POL_PLN_XREF ***** WHERE POL_NBR = :XRF-POL-NBR AND ***** COV_TYP_CD =
   * :XRF-COV-TYP-CD AND ***** PLN_NBR = :XRF-PLN-NBR AND ***** CLSS_NBR = :XRF-CLSS-NBR AND *****
   * ((EFF_DT <=:XRF-EFF-DT AND ***** CANC_DT >=:XRF-EFF-DT) OR ***** (EFF_DT <=:XRF-CANC-DT AND
   * ***** CANC_DT >=:XRF-CANC-DT)) ***** ORDER BY EFF_DT ***** FETCH FIRST 1 ROWS ONLY
   */
  public void selectCustPolPlnXref2(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(28 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1388261140)
              .withInputs(
                  dclcustPolPlnXref.getXrfPolNbr(),
                  dclcustPolPlnXref.getXrfCovTypCd(),
                  dclcustPolPlnXref.getXrfPlnNbr(),
                  dclcustPolPlnXref.getXrfClssNbr(),
                  dclcustPolPlnXref.getXrfEffDt(),
                  dclcustPolPlnXref.getXrfEffDt(),
                  dclcustPolPlnXref.getXrfCancDt(),
                  dclcustPolPlnXref.getXrfCancDt())
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
          dclcustPolPlnXref.setXrfMnnrpCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(2);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfMnnrpPct((Db2Base.castToBigDecimal(resultObj)).shortValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(3);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfUhPremDesgCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(4);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfPrortEvnt(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(5);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfPrdctPlnClssCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(6);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfPlnDedPrortInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = resultSet.getString(7);
        if (resultObjString != null) {
          dclcustPolPlnXref.setXrfEffDt(resultObjString.toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = resultSet.getString(8);
        if (resultObjString != null) {
          dclcustPolPlnXref.setXrfCancDt(resultObjString.toCharArray());
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
  // methodEnd:selectCustPolPlnXref2
  // methodStart:selectPolPlnMstr1

  /**
   * ***** SELECT ***** MNRP_CD ***** ,MNRP_PCT ***** ,NON_EMBD_DED_CD ***** ,UHP_CD *****
   * ,PRORT_EVNT_TYP_CD ***** ,MBR_NTWK_KEY_MTCH_CD ***** ,LFTM_MAX_AMT ***** ,TIER_1_LFTM_MAX_AMT
   * ***** ,OOP_COMB_NBR_CD ***** ,PSY_LFTM_CNFM_MAX_AMT ***** ,PSY_LFTM_NON_CNFM_MAX_AMT *****
   * ,PSY_LFTM_COMB_PRSC_MAX_AMT ***** ,PSY_CYR_CNFM_MAX_AMT ***** ,PSY_CYR_NON_CNFM_MAX_AMT *****
   * ,PSY_CYR_COMB_PRSC_MAX_AMT ***** ,DSES_ST_TBL_NBR ***** ,HI_DED_PLN_CD *****
   * ,PRORT_INTRVL_FREQ_CD ***** ,RCPRCTY_TBL_ID ***** ,OOP_MAX_COV_CD ***** INTO ***** :MMI-MNRP-CD
   * ***** ,:MMI-MNRP-PCT ***** ,:MMI-NON-EMBD-DED-CD ***** ,:MMI-UHP-CD *****
   * ,:MMI-PRORT-EVNT-TYP-CD ***** ,:MMI-MBR-NTWK-KEY-MTCH-CD ***** ,:MMI-LFTM-MAX-AMT *****
   * ,:MMI-TIER-1-LFTM-MAX-AMT ***** ,:MMI-OOP-COMB-NBR-CD ***** ,:MMI-PSY-LFTM-CNFM-MAX-AMT *****
   * ,:MMI-PSY-LFTM-NON-CNFM-MAX-AMT ***** ,:MMI-PSY-LFTM-COMB-PRSC-MAX-AMT *****
   * ,:MMI-PSY-CYR-CNFM-MAX-AMT ***** ,:MMI-PSY-CYR-NON-CNFM-MAX-AMT *****
   * ,:MMI-PSY-CYR-COMB-PRSC-MAX-AMT ***** ,:MMI-DSES-ST-TBL-NBR ***** ,:MMI-HI-DED-PLN-CD *****
   * ,:MMI-PRORT-INTRVL-FREQ-CD ***** ,:MMI-RCPRCTY-TBL-ID ***** ,:MMI-OOP-MAX-COV-CD ***** FROM
   * POL_PLN_MSTR ***** WHERE POL_NBR = :MMI-POL-NBR ***** AND PLN_NBR = :MMI-PLN-NBR ***** AND
   * CLSS_NBR = :MMI-CLSS-NBR ***** AND COV_TYP_CD = :MMI-COV-TYP-CD
   */
  public void selectPolPlnMstr1(DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca) throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(29 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1318075471)
              .withInputs(
                  dclpolPlnMstr.getMmiPolNbr(),
                  dclpolPlnMstr.getMmiPlnNbr(),
                  dclpolPlnMstr.getMmiClssNbr(),
                  dclpolPlnMstr.getMmiCovTypCd())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
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
          dclpolPlnMstr.setMmiMnrpCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(2);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiMnrpPct((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(3);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiNonEmbdDedCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(4);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiUhpCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(5);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiPrortEvntTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(6);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiMbrNtwkKeyMtchCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(7);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiLftmMaxAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiLftmMaxAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiLftmMaxAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiLftmMaxAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(8);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiTier1LftmMaxAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiTier1LftmMaxAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiTier1LftmMaxAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiTier1LftmMaxAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(9);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiOopCombNbrCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(10);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiPsyLftmCnfmMaxAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyLftmCnfmMaxAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyLftmCnfmMaxAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyLftmCnfmMaxAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(11);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiPsyLftmNonCnfmMaxAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyLftmNonCnfmMaxAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyLftmNonCnfmMaxAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyLftmNonCnfmMaxAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(12);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiPsyLftmCombPrscMaxAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyLftmCombPrscMaxAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyLftmCombPrscMaxAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyLftmCombPrscMaxAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(13);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiPsyCyrCnfmMaxAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyCyrCnfmMaxAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyCyrCnfmMaxAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyCyrCnfmMaxAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(14);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiPsyCyrNonCnfmMaxAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyCyrNonCnfmMaxAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyCyrNonCnfmMaxAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyCyrNonCnfmMaxAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(15);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiPsyCyrCombPrscMaxAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyCyrCombPrscMaxAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyCyrCombPrscMaxAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyCyrCombPrscMaxAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(16);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiDsesStTblNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(17);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiHiDedPlnCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(18);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiPrortIntrvlFreqCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(19);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiRcprctyTblId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(20);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiOopMaxCovCd(resultObj.toString().toCharArray());
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
  // methodEnd:selectPolPlnMstr1
  // methodStart:selectCustPolPlnXref3

  /**
   * ***** SELECT OBLIG_ID ***** ,SHR_ARNG_CD ***** ,EVD_BAS_DIALG_IND ***** ,CORE_MED_PRR_AUTH_CD
   * ***** INTO :XRF-OBLIG-ID ***** ,:XRF-SHR-ARNG-CD ***** ,:XRF-EVD-BAS-DIALG-IND *****
   * ,:XRF-CORE-MED-PRR-AUTH-CD ***** FROM CUST_POL_PLN_XREF ***** WHERE POL_NBR = :XRF-POL-NBR AND
   * ***** COV_TYP_CD = :XRF-COV-TYP-CD AND ***** PLN_NBR = :XRF-PLN-NBR AND ***** CLSS_NBR =
   * :XRF-CLSS-NBR AND ***** ((EFF_DT <=:XRF-EFF-DT AND ***** CANC_DT >=:XRF-EFF-DT) OR *****
   * (EFF_DT <=:XRF-CANC-DT AND ***** CANC_DT >=:XRF-CANC-DT)) ***** ORDER BY EFF_DT ASC ***** FETCH
   * FIRST 1 ROW ONLY
   */
  public void selectCustPolPlnXref3(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(30 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1334302832)
              .withInputs(
                  dclcustPolPlnXref.getXrfPolNbr(),
                  dclcustPolPlnXref.getXrfCovTypCd(),
                  dclcustPolPlnXref.getXrfPlnNbr(),
                  dclcustPolPlnXref.getXrfClssNbr(),
                  dclcustPolPlnXref.getXrfEffDt(),
                  dclcustPolPlnXref.getXrfEffDt(),
                  dclcustPolPlnXref.getXrfCancDt(),
                  dclcustPolPlnXref.getXrfCancDt())
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
          dclcustPolPlnXref.setXrfObligId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(2);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfShrArngCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(3);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfEvdBasDialgInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(4);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfCoreMedPrrAuthCd(resultObj.toString().toCharArray());
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
  // methodEnd:selectCustPolPlnXref3
  // methodStart:selectPolPlnMstr2

  /**
   * ***** SELECT T3.POL_NBR ***** ,T3.PLN_NBR ***** ,T3.CLSS_NBR ***** ,T3.COV_TYP_CD *****
   * ,MAX(T1.NEW_OLD_SRVC_IND) ***** ,MAX(T1.OBLIG_ID) ***** ,MAX(T1.SHR_ARNG_CD) *****
   * ,MAX(T1.FUND_TYP_CD) ***** ,MAX(T1.PRDCT_KEY_CD) ***** ,MAX(T1.MBR_PRDCT_TYP_CD) *****
   * ,MAX(T1.NTFY_CRDC_EP_IND) ***** ,MAX(T1.ONC_POL_PRTCP_CD) ***** ,MAX(T1.EVD_BAS_DIALG_IND)
   * ***** ,MAX(T1.REL_SRVC_IND) ***** ,MAX(T1.CORE_MED_PRR_AUTH_CD) ***** ,MAX(T1.BHV_HLTH_VEND_CD)
   * ***** ,MAX(T2.GEN_TST_POL_PRTCP_CD) ***** ,MAX(T2.SEC_OPIN_VEND_CD) ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 1 THEN SVI_TBL_NBR ***** END) AS SLOT_001 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 1 THEN SVI_EFF_DT ***** END) AS EFF_001 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 1 THEN SVI_CANC_DT ***** END) AS CANC_001 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 2 THEN SVI_TBL_NBR ***** END) AS SLOT_002 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 2 THEN SVI_EFF_DT ***** END) AS EFF_002 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 2 THEN SVI_CANC_DT ***** END) AS CANC_002 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 3 THEN SVI_TBL_NBR ***** END) AS SLOT_003 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 3 THEN SVI_EFF_DT ***** END) AS EFF_003 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 3 THEN SVI_CANC_DT ***** END) AS CANC_003 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 4 THEN SVI_TBL_NBR ***** END) AS SLOT_004 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 4 THEN SVI_EFF_DT ***** END) AS EFF_004 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 4 THEN SVI_CANC_DT ***** END) AS CANC_004 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 5 THEN SVI_TBL_NBR ***** END) AS SLOT_005 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 5 THEN SVI_EFF_DT ***** END) AS EFF_005 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 5 THEN SVI_CANC_DT ***** END) AS CANC_005 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 6 THEN SVI_TBL_NBR ***** END) AS SLOT_006 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 6 THEN SVI_EFF_DT ***** END) AS EFF_006 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 6 THEN SVI_CANC_DT ***** END) AS CANC_006 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 7 THEN SVI_TBL_NBR ***** END) AS SLOT_007 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 7 THEN SVI_EFF_DT ***** END) AS EFF_007 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 7 THEN SVI_CANC_DT ***** END) AS CANC_007 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 8 THEN SVI_TBL_NBR ***** END) AS SLOT_008 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 8 THEN SVI_EFF_DT ***** END) AS EFF_008 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 8 THEN SVI_CANC_DT ***** END) AS CANC_008 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 9 THEN SVI_TBL_NBR ***** END) AS SLOT_009 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 9 THEN SVI_EFF_DT ***** END) AS EFF_009 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 9 THEN SVI_CANC_DT ***** END) AS CANC_009 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 10 THEN SVI_TBL_NBR ***** END) AS SLOT_010 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 10 THEN SVI_EFF_DT ***** END) AS EFF_010 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 10 THEN SVI_CANC_DT ***** END) AS CANC_010 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 11 THEN SVI_TBL_NBR ***** END) AS SLOT_011 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 11 THEN SVI_EFF_DT ***** END) AS EFF_011 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 11 THEN SVI_CANC_DT ***** END) AS CANC_011 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 12 THEN SVI_TBL_NBR ***** END) AS SLOT_012 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 12 THEN SVI_EFF_DT ***** END) AS EFF_012 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 12 THEN SVI_CANC_DT ***** END) AS CANC_012 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 13 THEN SVI_TBL_NBR ***** END) AS SLOT_013 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 13 THEN SVI_EFF_DT ***** END) AS EFF_013 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 13 THEN SVI_CANC_DT ***** END) AS CANC_013 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 14 THEN SVI_TBL_NBR ***** END) AS SLOT_014 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 14 THEN SVI_EFF_DT ***** END) AS EFF_014 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 14 THEN SVI_CANC_DT ***** END) AS CANC_014 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 15 THEN SVI_TBL_NBR ***** END) AS SLOT_015 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 16 THEN SVI_TBL_NBR ***** END) AS SLOT_016 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 17 THEN SVI_TBL_NBR ***** END) AS SLOT_017 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 18 THEN SVI_TBL_NBR ***** END) AS SLOT_018 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 19 THEN SVI_TBL_NBR ***** END) AS SLOT_019 ***** ,MAX(CASE
   * SVI_TBL_ORDR_NBR ***** WHEN 20 THEN SVI_TBL_NBR ***** END) AS SLOT_020 ***** INTO :DSVI-POL-NBR
   * ***** ,:DSVI-PLN-NBR ***** ,:DSVI-CLSS-NBR ***** ,:DSVI-COV-TYP-CD ***** ,:MMI-NEW-OLD-SRVC-IND
   * ***** ,:MMI-OBLIG-ID ***** ,:MMI-SHR-ARNG-CD ***** ,:MMI-FUND-TYP-CD ***** ,:MMI-PRDCT-KEY-CD
   * ***** ,:MMI-MBR-PRDCT-TYP-CD ***** ,:MMI-NTFY-CRDC-EP-IND ***** ,:MMI-ONC-POL-PRTCP-CD *****
   * ,:MMI-EVD-BAS-DIALG-IND ***** ,:MMI-REL-SRVC-IND ***** ,:MMI-CORE-MED-PRR-AUTH-CD *****
   * ,:MMI-BHV-HLTH-VEND-CD ***** ,:MMA-GEN-TST-POL-PRTCP-CD ***** ,:MMA-SEC-OPIN-VEND-CD *****
   * ,:WS-SLOT-001:WS-SLOT-001-IND ***** ,:WS-EFF-001:WS-EFF-001-IND *****
   * ,:WS-CANC-001:WS-CANC-001-IND ***** ,:WS-SLOT-002:WS-SLOT-002-IND *****
   * ,:WS-EFF-002:WS-EFF-002-IND ***** ,:WS-CANC-002:WS-CANC-002-IND *****
   * ,:WS-SLOT-003:WS-SLOT-003-IND ***** ,:WS-EFF-003:WS-EFF-003-IND *****
   * ,:WS-CANC-003:WS-CANC-003-IND ***** ,:WS-SLOT-004:WS-SLOT-004-IND *****
   * ,:WS-EFF-004:WS-EFF-004-IND ***** ,:WS-CANC-004:WS-CANC-004-IND *****
   * ,:WS-SLOT-005:WS-SLOT-005-IND ***** ,:WS-EFF-005:WS-EFF-005-IND *****
   * ,:WS-CANC-005:WS-CANC-005-IND ***** ,:WS-SLOT-006:WS-SLOT-006-IND *****
   * ,:WS-EFF-006:WS-EFF-006-IND ***** ,:WS-CANC-006:WS-CANC-006-IND *****
   * ,:WS-SLOT-007:WS-SLOT-007-IND ***** ,:WS-EFF-007:WS-EFF-007-IND *****
   * ,:WS-CANC-007:WS-CANC-007-IND ***** ,:WS-SLOT-008:WS-SLOT-008-IND *****
   * ,:WS-EFF-008:WS-EFF-008-IND ***** ,:WS-CANC-008:WS-CANC-008-IND *****
   * ,:WS-SLOT-009:WS-SLOT-009-IND ***** ,:WS-EFF-009:WS-EFF-009-IND *****
   * ,:WS-CANC-009:WS-CANC-009-IND ***** ,:WS-SLOT-010:WS-SLOT-010-IND *****
   * ,:WS-EFF-010:WS-EFF-010-IND ***** ,:WS-CANC-010:WS-CANC-010-IND *****
   * ,:WS-SLOT-011:WS-SLOT-011-IND ***** ,:WS-EFF-011:WS-EFF-011-IND *****
   * ,:WS-CANC-011:WS-CANC-011-IND ***** ,:WS-SLOT-012:WS-SLOT-012-IND *****
   * ,:WS-EFF-012:WS-EFF-012-IND ***** ,:WS-CANC-012:WS-CANC-012-IND *****
   * ,:WS-SLOT-013:WS-SLOT-013-IND ***** ,:WS-EFF-013:WS-EFF-013-IND *****
   * ,:WS-CANC-013:WS-CANC-013-IND ***** ,:WS-SLOT-014:WS-SLOT-014-IND *****
   * ,:WS-EFF-014:WS-EFF-014-IND ***** ,:WS-CANC-014:WS-CANC-014-IND *****
   * ,:WS-SLOT-015:WS-SLOT-015-IND ***** ,:WS-SLOT-016:WS-SLOT-016-IND *****
   * ,:WS-SLOT-017:WS-SLOT-017-IND ***** ,:WS-SLOT-018:WS-SLOT-018-IND *****
   * ,:WS-SLOT-019:WS-SLOT-019-IND ***** ,:WS-SLOT-020:WS-SLOT-020-IND ***** FROM POL_PLN_MSTR T1
   * ***** ,POL_PLN_MSTR_ADDTL_INFO T2 ***** ,POL_PLN_MSTR_SVI_INFO T3 ***** WHERE T3.POL_NBR =
   * :MMI-POL-NBR ***** AND T3.PLN_NBR = :MMI-PLN-NBR ***** AND T3.CLSS_NBR = :MMI-CLSS-NBR *****
   * AND T3.COV_TYP_CD = :MMI-COV-TYP-CD ***** ***** AND T1.POL_NBR = :MMI-POL-NBR ***** AND
   * T1.PLN_NBR = :MMI-PLN-NBR ***** AND T1.CLSS_NBR = :MMI-CLSS-NBR ***** AND T1.COV_TYP_CD =
   * :MMI-COV-TYP-CD ***** ***** AND T2.POL_NBR = :MMI-POL-NBR ***** AND T2.PLN_NBR = :MMI-PLN-NBR
   * ***** AND T2.CLSS_NBR = :MMI-CLSS-NBR ***** AND T2.COV_TYP_CD = :MMI-COV-TYP-CD ***** GROUP BY
   * T3.POL_NBR ***** ,T3.PLN_NBR ***** ,T3.CLSS_NBR ***** ,T3.COV_TYP_CD ***** WITH UR
   */
  public void selectPolPlnMstr2(
      DclpolPlnMstrAddtlInfo dclpolPlnMstrAddtlInfo,
      DclpolPlnMstrSviInfo dclpolPlnMstrSviInfo,
      DclpolPlnMstr dclpolPlnMstr,
      Sqlca sqlca,
      SviTablesData sviTablesData)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(31 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_560460742)
              .withInputs(
                  dclpolPlnMstr.getMmiPolNbr(),
                  dclpolPlnMstr.getMmiPlnNbr(),
                  dclpolPlnMstr.getMmiClssNbr(),
                  dclpolPlnMstr.getMmiCovTypCd(),
                  dclpolPlnMstr.getMmiPolNbr(),
                  dclpolPlnMstr.getMmiPlnNbr(),
                  dclpolPlnMstr.getMmiClssNbr(),
                  dclpolPlnMstr.getMmiCovTypCd(),
                  dclpolPlnMstr.getMmiPolNbr(),
                  dclpolPlnMstr.getMmiPlnNbr(),
                  dclpolPlnMstr.getMmiClssNbr(),
                  dclpolPlnMstr.getMmiCovTypCd())
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
          dclpolPlnMstrSviInfo.setDsviPolNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(2);
        if (resultObj != null) {
          dclpolPlnMstrSviInfo.setDsviPlnNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(3);
        if (resultObj != null) {
          dclpolPlnMstrSviInfo.setDsviClssNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(4);
        if (resultObj != null) {
          dclpolPlnMstrSviInfo.setDsviCovTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(5);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiNewOldSrvcInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(6);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiObligId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(7);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiShrArngCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(8);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiFundTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(9);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiPrdctKeyCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(10);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiMbrPrdctTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(11);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiNtfyCrdcEpInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(12);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiOncPolPrtcpCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(13);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiEvdBasDialgInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(14);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiRelSrvcInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(15);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiCoreMedPrrAuthCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(16);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBhvHlthVendCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(17);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaGenTstPolPrtcpCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(18);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaSecOpinVendCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(19);
        if (resultObj != null) {
          sviTablesData.setSlot001Ind((short) 0);
          sviTablesData.setSlot001(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot001Ind((short) -1);
        }
        resultObjString = resultSet.getString(20);
        if (resultObjString != null) {
          sviTablesData.setEff001Ind((short) 0);
          sviTablesData.setEff001(resultObjString.toCharArray());
        } else {
          sviTablesData.setEff001Ind((short) -1);
        }
        resultObjString = resultSet.getString(21);
        if (resultObjString != null) {
          sviTablesData.setCanc001Ind((short) 0);
          sviTablesData.setCanc001(resultObjString.toCharArray());
        } else {
          sviTablesData.setCanc001Ind((short) -1);
        }
        resultObj = resultSet.getObject(22);
        if (resultObj != null) {
          sviTablesData.setSlot002Ind((short) 0);
          sviTablesData.setSlot002(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot002Ind((short) -1);
        }
        resultObjString = resultSet.getString(23);
        if (resultObjString != null) {
          sviTablesData.setEff002Ind((short) 0);
          sviTablesData.setEff002(resultObjString.toCharArray());
        } else {
          sviTablesData.setEff002Ind((short) -1);
        }
        resultObjString = resultSet.getString(24);
        if (resultObjString != null) {
          sviTablesData.setCanc002Ind((short) 0);
          sviTablesData.setCanc002(resultObjString.toCharArray());
        } else {
          sviTablesData.setCanc002Ind((short) -1);
        }
        resultObj = resultSet.getObject(25);
        if (resultObj != null) {
          sviTablesData.setSlot003Ind((short) 0);
          sviTablesData.setSlot003(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot003Ind((short) -1);
        }
        resultObjString = resultSet.getString(26);
        if (resultObjString != null) {
          sviTablesData.setEff003Ind((short) 0);
          sviTablesData.setEff003(resultObjString.toCharArray());
        } else {
          sviTablesData.setEff003Ind((short) -1);
        }
        resultObjString = resultSet.getString(27);
        if (resultObjString != null) {
          sviTablesData.setCanc003Ind((short) 0);
          sviTablesData.setCanc003(resultObjString.toCharArray());
        } else {
          sviTablesData.setCanc003Ind((short) -1);
        }
        resultObj = resultSet.getObject(28);
        if (resultObj != null) {
          sviTablesData.setSlot004Ind((short) 0);
          sviTablesData.setSlot004(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot004Ind((short) -1);
        }
        resultObjString = resultSet.getString(29);
        if (resultObjString != null) {
          sviTablesData.setEff004Ind((short) 0);
          sviTablesData.setEff004(resultObjString.toCharArray());
        } else {
          sviTablesData.setEff004Ind((short) -1);
        }
        resultObjString = resultSet.getString(30);
        if (resultObjString != null) {
          sviTablesData.setCanc004Ind((short) 0);
          sviTablesData.setCanc004(resultObjString.toCharArray());
        } else {
          sviTablesData.setCanc004Ind((short) -1);
        }
        resultObj = resultSet.getObject(31);
        if (resultObj != null) {
          sviTablesData.setSlot005Ind((short) 0);
          sviTablesData.setSlot005(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot005Ind((short) -1);
        }
        resultObjString = resultSet.getString(32);
        if (resultObjString != null) {
          sviTablesData.setEff005Ind((short) 0);
          sviTablesData.setEff005(resultObjString.toCharArray());
        } else {
          sviTablesData.setEff005Ind((short) -1);
        }
        resultObjString = resultSet.getString(33);
        if (resultObjString != null) {
          sviTablesData.setCanc005Ind((short) 0);
          sviTablesData.setCanc005(resultObjString.toCharArray());
        } else {
          sviTablesData.setCanc005Ind((short) -1);
        }
        resultObj = resultSet.getObject(34);
        if (resultObj != null) {
          sviTablesData.setSlot006Ind((short) 0);
          sviTablesData.setSlot006(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot006Ind((short) -1);
        }
        resultObjString = resultSet.getString(35);
        if (resultObjString != null) {
          sviTablesData.setEff006Ind((short) 0);
          sviTablesData.setEff006(resultObjString.toCharArray());
        } else {
          sviTablesData.setEff006Ind((short) -1);
        }
        resultObjString = resultSet.getString(36);
        if (resultObjString != null) {
          sviTablesData.setCanc006Ind((short) 0);
          sviTablesData.setCanc006(resultObjString.toCharArray());
        } else {
          sviTablesData.setCanc006Ind((short) -1);
        }
        resultObj = resultSet.getObject(37);
        if (resultObj != null) {
          sviTablesData.setSlot007Ind((short) 0);
          sviTablesData.setSlot007(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot007Ind((short) -1);
        }
        resultObjString = resultSet.getString(38);
        if (resultObjString != null) {
          sviTablesData.setEff007Ind((short) 0);
          sviTablesData.setEff007(resultObjString.toCharArray());
        } else {
          sviTablesData.setEff007Ind((short) -1);
        }
        resultObjString = resultSet.getString(39);
        if (resultObjString != null) {
          sviTablesData.setCanc007Ind((short) 0);
          sviTablesData.setCanc007(resultObjString.toCharArray());
        } else {
          sviTablesData.setCanc007Ind((short) -1);
        }
        resultObj = resultSet.getObject(40);
        if (resultObj != null) {
          sviTablesData.setSlot008Ind((short) 0);
          sviTablesData.setSlot008(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot008Ind((short) -1);
        }
        resultObjString = resultSet.getString(41);
        if (resultObjString != null) {
          sviTablesData.setEff008Ind((short) 0);
          sviTablesData.setEff008(resultObjString.toCharArray());
        } else {
          sviTablesData.setEff008Ind((short) -1);
        }
        resultObjString = resultSet.getString(42);
        if (resultObjString != null) {
          sviTablesData.setCanc008Ind((short) 0);
          sviTablesData.setCanc008(resultObjString.toCharArray());
        } else {
          sviTablesData.setCanc008Ind((short) -1);
        }
        resultObj = resultSet.getObject(43);
        if (resultObj != null) {
          sviTablesData.setSlot009Ind((short) 0);
          sviTablesData.setSlot009(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot009Ind((short) -1);
        }
        resultObjString = resultSet.getString(44);
        if (resultObjString != null) {
          sviTablesData.setEff009Ind((short) 0);
          sviTablesData.setEff009(resultObjString.toCharArray());
        } else {
          sviTablesData.setEff009Ind((short) -1);
        }
        resultObjString = resultSet.getString(45);
        if (resultObjString != null) {
          sviTablesData.setCanc009Ind((short) 0);
          sviTablesData.setCanc009(resultObjString.toCharArray());
        } else {
          sviTablesData.setCanc009Ind((short) -1);
        }
        resultObj = resultSet.getObject(46);
        if (resultObj != null) {
          sviTablesData.setSlot010Ind((short) 0);
          sviTablesData.setSlot010(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot010Ind((short) -1);
        }
        resultObjString = resultSet.getString(47);
        if (resultObjString != null) {
          sviTablesData.setEff010Ind((short) 0);
          sviTablesData.setEff010(resultObjString.toCharArray());
        } else {
          sviTablesData.setEff010Ind((short) -1);
        }
        resultObjString = resultSet.getString(48);
        if (resultObjString != null) {
          sviTablesData.setCanc010Ind((short) 0);
          sviTablesData.setCanc010(resultObjString.toCharArray());
        } else {
          sviTablesData.setCanc010Ind((short) -1);
        }
        resultObj = resultSet.getObject(49);
        if (resultObj != null) {
          sviTablesData.setSlot011Ind((short) 0);
          sviTablesData.setSlot011(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot011Ind((short) -1);
        }
        resultObjString = resultSet.getString(50);
        if (resultObjString != null) {
          sviTablesData.setEff011Ind((short) 0);
          sviTablesData.setEff011(resultObjString.toCharArray());
        } else {
          sviTablesData.setEff011Ind((short) -1);
        }
        resultObjString = resultSet.getString(51);
        if (resultObjString != null) {
          sviTablesData.setCanc011Ind((short) 0);
          sviTablesData.setCanc011(resultObjString.toCharArray());
        } else {
          sviTablesData.setCanc011Ind((short) -1);
        }
        resultObj = resultSet.getObject(52);
        if (resultObj != null) {
          sviTablesData.setSlot012Ind((short) 0);
          sviTablesData.setSlot012(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot012Ind((short) -1);
        }
        resultObjString = resultSet.getString(53);
        if (resultObjString != null) {
          sviTablesData.setEff012Ind((short) 0);
          sviTablesData.setEff012(resultObjString.toCharArray());
        } else {
          sviTablesData.setEff012Ind((short) -1);
        }
        resultObjString = resultSet.getString(54);
        if (resultObjString != null) {
          sviTablesData.setCanc012Ind((short) 0);
          sviTablesData.setCanc012(resultObjString.toCharArray());
        } else {
          sviTablesData.setCanc012Ind((short) -1);
        }
        resultObj = resultSet.getObject(55);
        if (resultObj != null) {
          sviTablesData.setSlot013Ind((short) 0);
          sviTablesData.setSlot013(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot013Ind((short) -1);
        }
        resultObjString = resultSet.getString(56);
        if (resultObjString != null) {
          sviTablesData.setEff013Ind((short) 0);
          sviTablesData.setEff013(resultObjString.toCharArray());
        } else {
          sviTablesData.setEff013Ind((short) -1);
        }
        resultObjString = resultSet.getString(57);
        if (resultObjString != null) {
          sviTablesData.setCanc013Ind((short) 0);
          sviTablesData.setCanc013(resultObjString.toCharArray());
        } else {
          sviTablesData.setCanc013Ind((short) -1);
        }
        resultObj = resultSet.getObject(58);
        if (resultObj != null) {
          sviTablesData.setSlot014Ind((short) 0);
          sviTablesData.setSlot014(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot014Ind((short) -1);
        }
        resultObjString = resultSet.getString(59);
        if (resultObjString != null) {
          sviTablesData.setEff014Ind((short) 0);
          sviTablesData.setEff014(resultObjString.toCharArray());
        } else {
          sviTablesData.setEff014Ind((short) -1);
        }
        resultObjString = resultSet.getString(60);
        if (resultObjString != null) {
          sviTablesData.setCanc014Ind((short) 0);
          sviTablesData.setCanc014(resultObjString.toCharArray());
        } else {
          sviTablesData.setCanc014Ind((short) -1);
        }
        resultObj = resultSet.getObject(61);
        if (resultObj != null) {
          sviTablesData.setSlot015Ind((short) 0);
          sviTablesData.setSlot015(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot015Ind((short) -1);
        }
        resultObj = resultSet.getObject(62);
        if (resultObj != null) {
          sviTablesData.setSlot016Ind((short) 0);
          sviTablesData.setSlot016(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot016Ind((short) -1);
        }
        resultObj = resultSet.getObject(63);
        if (resultObj != null) {
          sviTablesData.setSlot017Ind((short) 0);
          sviTablesData.setSlot017(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot017Ind((short) -1);
        }
        resultObj = resultSet.getObject(64);
        if (resultObj != null) {
          sviTablesData.setSlot018Ind((short) 0);
          sviTablesData.setSlot018(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot018Ind((short) -1);
        }
        resultObj = resultSet.getObject(65);
        if (resultObj != null) {
          sviTablesData.setSlot019Ind((short) 0);
          sviTablesData.setSlot019(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot019Ind((short) -1);
        }
        resultObj = resultSet.getObject(66);
        if (resultObj != null) {
          sviTablesData.setSlot020Ind((short) 0);
          sviTablesData.setSlot020(resultObj.toString().toCharArray());
        } else {
          sviTablesData.setSlot020Ind((short) -1);
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
  // methodEnd:selectPolPlnMstr2
  // methodStart:selectPolPlnMstr3

  /**
   * ***** SELECT T1.NEW_OLD_SRVC_IND ***** ,T1.OBLIG_ID ***** ,T1.SHR_ARNG_CD ***** ,T1.FUND_TYP_CD
   * ***** ,T1.PRDCT_KEY_CD ***** ,T1.MBR_PRDCT_TYP_CD ***** ,T1.NTFY_CRDC_EP_IND *****
   * ,T1.ONC_POL_PRTCP_CD ***** ,T1.EVD_BAS_DIALG_IND ***** ,T1.REL_SRVC_IND *****
   * ,T1.CORE_MED_PRR_AUTH_CD ***** ,T2.GEN_TST_POL_PRTCP_CD ***** ,T2.SEC_OPIN_VEND_CD ***** INTO
   * :MMI-NEW-OLD-SRVC-IND ***** ,:MMI-OBLIG-ID ***** ,:MMI-SHR-ARNG-CD ***** ,:MMI-FUND-TYP-CD
   * ***** ,:MMI-PRDCT-KEY-CD ***** ,:MMI-MBR-PRDCT-TYP-CD ***** ,:MMI-NTFY-CRDC-EP-IND *****
   * ,:MMI-ONC-POL-PRTCP-CD ***** ,:MMI-EVD-BAS-DIALG-IND ***** ,:MMI-REL-SRVC-IND *****
   * ,:MMI-CORE-MED-PRR-AUTH-CD ***** ,:MMA-GEN-TST-POL-PRTCP-CD ***** ,:MMA-SEC-OPIN-VEND-CD *****
   * FROM POL_PLN_MSTR T1 ***** ,POL_PLN_MSTR_ADDTL_INFO T2 ***** WHERE T1.POL_NBR = :MMI-POL-NBR
   * ***** AND T1.PLN_NBR = :MMI-PLN-NBR ***** AND T1.CLSS_NBR = :MMI-CLSS-NBR ***** AND
   * T1.COV_TYP_CD = :MMI-COV-TYP-CD ***** AND T1.POL_NBR = T2.POL_NBR ***** AND T1.PLN_NBR =
   * T2.PLN_NBR ***** AND T1.CLSS_NBR = T2.CLSS_NBR ***** AND T1.COV_TYP_CD = T2.COV_TYP_CD
   */
  public void selectPolPlnMstr3(
      DclpolPlnMstrAddtlInfo dclpolPlnMstrAddtlInfo, DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(32 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1456537741)
              .withInputs(
                  dclpolPlnMstr.getMmiPolNbr(),
                  dclpolPlnMstr.getMmiPlnNbr(),
                  dclpolPlnMstr.getMmiClssNbr(),
                  dclpolPlnMstr.getMmiCovTypCd())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
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
          dclpolPlnMstr.setMmiNewOldSrvcInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(2);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiObligId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(3);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiShrArngCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(4);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiFundTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(5);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiPrdctKeyCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(6);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiMbrPrdctTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(7);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiNtfyCrdcEpInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(8);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiOncPolPrtcpCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(9);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiEvdBasDialgInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(10);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiRelSrvcInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(11);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiCoreMedPrrAuthCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(12);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaGenTstPolPrtcpCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(13);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaSecOpinVendCd(resultObj.toString().toCharArray());
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
  // methodEnd:selectPolPlnMstr3
  // methodStart:selectCustPolPlnXref4

  /**
   * ***** SELECT OBLIG_ID ***** ,SHR_ARNG_CD ***** ,IPLN_TYP_CD ***** ,CAP_XCLS_IND *****
   * ,EMERGENT_WRP_IND ***** INTO :XRF-OBLIG-ID ***** ,:XRF-SHR-ARNG-CD ***** ,:XRF-IPLN-TYP-CD
   * ***** ,:XRF-CAP-XCLS-IND ***** ,:XRF-EMERGENT-WRP-IND ***** FROM CUST_POL_PLN_XREF ***** WHERE
   * POL_NBR = :XRF-POL-NBR AND ***** COV_TYP_CD = :XRF-COV-TYP-CD AND ***** PLN_NBR = :XRF-PLN-NBR
   * AND ***** CLSS_NBR = :XRF-CLSS-NBR AND ***** ((EFF_DT <=:XRF-EFF-DT AND ***** CANC_DT
   * >=:XRF-EFF-DT) OR ***** (EFF_DT <=:XRF-CANC-DT AND ***** CANC_DT >=:XRF-CANC-DT)) ***** ORDER
   * BY EFF_DT ASC ***** FETCH FIRST 1 ROW ONLY
   */
  public void selectCustPolPlnXref4(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(33 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_702515491)
              .withInputs(
                  dclcustPolPlnXref.getXrfPolNbr(),
                  dclcustPolPlnXref.getXrfCovTypCd(),
                  dclcustPolPlnXref.getXrfPlnNbr(),
                  dclcustPolPlnXref.getXrfClssNbr(),
                  dclcustPolPlnXref.getXrfEffDt(),
                  dclcustPolPlnXref.getXrfEffDt(),
                  dclcustPolPlnXref.getXrfCancDt(),
                  dclcustPolPlnXref.getXrfCancDt())
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
          dclcustPolPlnXref.setXrfObligId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(2);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfShrArngCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(3);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfIplnTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(4);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfCapXclsInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(5);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfEmergentWrpInd(resultObj.toString().toCharArray());
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
  // methodEnd:selectCustPolPlnXref4
  // methodStart:selectPolPlnMstr4

  /**
   * ***** SELECT T1.COMB_PRSC_DED_PRI_CD ***** ,T1.COMB_PRSC_DED_QUAL_CD *****
   * ,T1.COMB_PRSC_DED_SEC_CD ***** ,T1.COMB_PRSC_DED_TIR_CD ***** ,T1.CONTR_ST_CD *****
   * ,T1.COPAY_AMT ***** ,T1.FAM_NEW_COINS_AMT ***** ,T1.NEW_COINS_AMT *****
   * ,T1.NEW_COINS_COMB_PRSC_CD ***** ,T1.NEW_COINS_PRD_CD ***** ,T1.NEW_COINS_SAL_FAM_MULT_FCT
   * ***** ,T1.NEW_COINS_SAL_FAM_TYP_CD ***** ,T1.NEW_COINS_SAL_INDV_TYP_CD *****
   * ,T1.NON_EMBD_DED_CD ***** ,T1.NTWK_PCP_COPAY_AMT ***** ,T1.OBLIG_ID ***** ,T1.OOP_COMB_FAM_AMT
   * ***** ,T1.OOP_COMB_INDV_AMT ***** ,T1.OOP_COMB_PRSC_CD ***** ,T1.PCP_COPAY_CD *****
   * ,T1.PCP_SPEC_COINS_IND ***** ,T1.RCPRCTY_TBL_ID ***** ,T1.SHR_ARNG_CD *****
   * ,T1.SRVC_CD_N_SET_IND ***** ,T1.SRVC_CD_P_SET_IND ***** ,T1.SRVC_CD_T_SET_IND *****
   * ,T1.SRVC_CD_A_SET_IND ***** ,T1.SRVC_CD_B_SET_IND ***** ,T1.SRVC_CD_C_SET_IND *****
   * ,T1.SRVC_CD_D_SET_IND ***** ,T1.SRVC_CD_E_SET_IND ***** ,T1.SRVC_CD_F_SET_IND *****
   * ,T1.SRVC_CD_G_SET_IND ***** ,T1.SRVC_CD_H_SET_IND ***** ,T1.SRVC_CD_I_SET_IND *****
   * ,T1.SRVC_CD_J_SET_IND ***** ,T1.SRVC_CD_K_SET_IND ***** ,T1.SRVC_CD_L_SET_IND *****
   * ,T1.SRVC_CD_M_SET_IND ***** ,T1.SRVC_CD_O_SET_IND ***** ,T1.SRVC_CD_Q_SET_IND *****
   * ,T1.SRVC_CD_R_SET_IND ***** ,T1.SRVC_CD_S_SET_IND ***** ,T1.SRVC_CD_U_SET_IND *****
   * ,T1.SRVC_CD_V_SET_IND ***** ,T1.SRVC_CD_W_SET_IND ***** ,T1.SRVC_CD_X_SET_IND *****
   * ,T1.SRVC_CD_Y_SET_IND ***** ,T1.SRVC_CD_Z_SET_IND ***** ,T1.TIER_1_COPAY_AMT *****
   * ,T1.TIER_1_FAM_NEW_COINS_AMT ***** ,T1.TIER_1_NEW_COINS_AMT ***** ,T1.TIER_1_URGNT_CARE_AMT
   * ***** ,T1.URGNT_CARE_AMT ***** ,T1.FAM_TXT_SWAP_CD ***** ,T1.FAM_MBR_CNT ***** ,T1.COPAY_VAR_ID
   * ***** ,T1.XTRA_TERR_ST_MAND_IND ***** ,T1.TIER_LBL_IND ***** ,T1.SPCL_PROC_3_CD *****
   * ,T1.IPLAN_TYP_CD ***** ,T1.OOP_IN_NTWK_EE_PLS_1_AMT ***** ,T1.OOP_IN_NTWK_EE_SPO_AMT *****
   * ,T1.OOP_IN_NTWK_EE_CHRG_AMT ***** ,T1.OOP_COMB_EE_PLS_1_AMT ***** ,T1.OOP_COMB_EE_SPO_AMT *****
   * ,T1.OOP_COMB_EE_CHRG_AMT ***** ,T1.COINS_COPAY_CD ***** ,T1.COPAY_MAX_ANNL_AMT *****
   * ,T1.BHV_HLTH_VEND_CD ***** ,T1.CPTN_XCLS_IND ***** ,T1.PRDCT_KEY_CD ***** ,T1.RSN_CUSTY_PRD_CD
   * ***** ,T1.DFLT_CHRG_PCT ***** ,T1.FACL_SHR_SV_CD ***** ,T1.PHYSN_SHR_SV_CD *****
   * ,T1.NEW_COINS_ACCUM_CD ***** ,T1.ALLNC_CD ***** ,T1.FUND_TYP_CD ***** ,T1.PRDCT_CD_ID *****
   * ,T1.EMERGENT_WRP_IND ***** ,T1.OOP_MAX_COV_CD ***** ,T1.SPCL_PROC_6_CD ***** ,T1.SPCL_PROC_1_CD
   * ***** ,T1.SPCL_PROC_2_CD ***** ,T1.SPCL_PROC_4_CD ***** ,T1.SPCL_PROC_5_CD *****
   * ,T1.SPCL_PROC_7_CD ***** ,T1.SPCL_PROC_8_CD ***** ,T1.SPCL_PROC_9_CD ***** ,T1.SPCL_PROC_10_CD
   * ***** ,T1.NON_EMBD_COPAY_CD ***** ,T1.NON_EMBD_CORE_OOP_CD ***** ,T1.NON_EMBD_NEW_COINS_CD
   * ***** ,T1.NON_EMBD_CORE_DED_CD ***** ,T1.XAPPLY_OOP_CD ***** ,T1.XAPPLY_COPAY_CD *****
   * ,T1.INDV_OOP_CD ***** ,T1.INDV_PRD_CD ***** ,T1.INDV_SALRY_TYP_CD ***** ,T1.FAM_SALRY_TYP_CD
   * ***** ,T1.FAM_MULT_PCT ***** ,T1.LMT_SRVC_CD ***** ,T2.NPT_RULE_PKG_ID *****
   * ,T2.RHAB_COMB_PT_LMT_CD ***** ,T2.RHAB_COMB_OT_LMT_CD ***** ,T2.RHAB_COMB_ST_LMT_CD *****
   * ,T2.RHAB_COMB_SM_LMT_CD ***** ,T2.RHAB_COMB_CI_LMT_CD ***** ,T2.RHAB_COMB_CT_LMT_CD *****
   * ,T2.RHAB_COMB_CR_LMT_CD ***** ,T2.RHAB_COMB_PR_LMT_CD ***** ,T2.RHAB_COMB_MT_LMT_CD *****
   * ,T2.HAB_COMB_PT_LMT_CD ***** ,T2.HAB_COMB_OT_LMT_CD ***** ,T2.HAB_COMB_ST_LMT_CD *****
   * ,T2.HAB_COMB_SM_LMT_CD ***** ,T2.HAB_COMB_CI_LMT_CD ***** ,T2.HAB_COMB_CT_LMT_CD *****
   * ,T2.HAB_COMB_MT_LMT_CD ***** ,T2.UGI_IND ***** ,T2.LGI_IND ***** ,T2.EXD_IND *****
   * ,T1.OOP_COMB_NBR_CD ***** INTO :MMI-COMB-PRSC-DED-PRI-CD ***** ,:MMI-COMB-PRSC-DED-QUAL-CD
   * ***** ,:MMI-COMB-PRSC-DED-SEC-CD ***** ,:MMI-COMB-PRSC-DED-TIR-CD ***** ,:MMI-CONTR-ST-CD *****
   * ,:MMI-COPAY-AMT ***** ,:MMI-FAM-NEW-COINS-AMT ***** ,:MMI-NEW-COINS-AMT *****
   * ,:MMI-NEW-COINS-COMB-PRSC-CD ***** ,:MMI-NEW-COINS-PRD-CD *****
   * ,:MMI-NEW-COINS-SAL-FAM-MULT-FCT ***** ,:MMI-NEW-COINS-SAL-FAM-TYP-CD *****
   * ,:MMI-NEW-COINS-SAL-INDV-TYP-CD ***** ,:MMI-NON-EMBD-DED-CD ***** ,:MMI-NTWK-PCP-COPAY-AMT
   * ***** ,:MMI-OBLIG-ID ***** ,:MMI-OOP-COMB-FAM-AMT ***** ,:MMI-OOP-COMB-INDV-AMT *****
   * ,:MMI-OOP-COMB-PRSC-CD ***** ,:MMI-PCP-COPAY-CD ***** ,:MMI-PCP-SPEC-COINS-IND *****
   * ,:MMI-RCPRCTY-TBL-ID ***** ,:MMI-SHR-ARNG-CD ***** ,:MMI-SRVC-CD-N-SET-IND *****
   * ,:MMI-SRVC-CD-P-SET-IND ***** ,:MMI-SRVC-CD-T-SET-IND ***** ,:MMI-SRVC-CD-A-SET-IND *****
   * ,:MMI-SRVC-CD-B-SET-IND ***** ,:MMI-SRVC-CD-C-SET-IND ***** ,:MMI-SRVC-CD-D-SET-IND *****
   * ,:MMI-SRVC-CD-E-SET-IND ***** ,:MMI-SRVC-CD-F-SET-IND ***** ,:MMI-SRVC-CD-G-SET-IND *****
   * ,:MMI-SRVC-CD-H-SET-IND ***** ,:MMI-SRVC-CD-I-SET-IND ***** ,:MMI-SRVC-CD-J-SET-IND *****
   * ,:MMI-SRVC-CD-K-SET-IND ***** ,:MMI-SRVC-CD-L-SET-IND ***** ,:MMI-SRVC-CD-M-SET-IND *****
   * ,:MMI-SRVC-CD-O-SET-IND ***** ,:MMI-SRVC-CD-Q-SET-IND ***** ,:MMI-SRVC-CD-R-SET-IND *****
   * ,:MMI-SRVC-CD-S-SET-IND ***** ,:MMI-SRVC-CD-U-SET-IND ***** ,:MMI-SRVC-CD-V-SET-IND *****
   * ,:MMI-SRVC-CD-W-SET-IND ***** ,:MMI-SRVC-CD-X-SET-IND ***** ,:MMI-SRVC-CD-Y-SET-IND *****
   * ,:MMI-SRVC-CD-Z-SET-IND ***** ,:MMI-TIER-1-COPAY-AMT ***** ,:MMI-TIER-1-FAM-NEW-COINS-AMT *****
   * ,:MMI-TIER-1-NEW-COINS-AMT ***** ,:MMI-TIER-1-URGNT-CARE-AMT ***** ,:MMI-URGNT-CARE-AMT *****
   * ,:MMI-FAM-TXT-SWAP-CD ***** ,:MMI-FAM-MBR-CNT ***** ,:MMI-COPAY-VAR-ID *****
   * ,:MMI-XTRA-TERR-ST-MAND-IND ***** ,:MMI-TIER-LBL-IND ***** ,:MMI-SPCL-PROC-3-CD *****
   * ,:MMI-IPLAN-TYP-CD ***** ,:MMI-OOP-IN-NTWK-EE-PLS-1-AMT ***** ,:MMI-OOP-IN-NTWK-EE-SPO-AMT
   * ***** ,:MMI-OOP-IN-NTWK-EE-CHRG-AMT ***** ,:MMI-OOP-COMB-EE-PLS-1-AMT *****
   * ,:MMI-OOP-COMB-EE-SPO-AMT ***** ,:MMI-OOP-COMB-EE-CHRG-AMT ***** ,:MMI-COINS-COPAY-CD *****
   * ,:MMI-COPAY-MAX-ANNL-AMT ***** ,:MMI-BHV-HLTH-VEND-CD ***** ,:MMI-CPTN-XCLS-IND *****
   * ,:MMI-PRDCT-KEY-CD ***** ,:MMI-RSN-CUSTY-PRD-CD ***** ,:MMI-DFLT-CHRG-PCT *****
   * ,:MMI-FACL-SHR-SV-CD ***** ,:MMI-PHYSN-SHR-SV-CD ***** ,:MMI-NEW-COINS-ACCUM-CD *****
   * ,:MMI-ALLNC-CD ***** ,:MMI-FUND-TYP-CD ***** ,:MMI-PRDCT-CD-ID ***** ,:MMI-EMERGENT-WRP-IND
   * ***** ,:MMI-OOP-MAX-COV-CD ***** ,:MMI-SPCL-PROC-6-CD ***** ,:MMI-SPCL-PROC-1-CD *****
   * ,:MMI-SPCL-PROC-2-CD ***** ,:MMI-SPCL-PROC-4-CD ***** ,:MMI-SPCL-PROC-5-CD *****
   * ,:MMI-SPCL-PROC-7-CD ***** ,:MMI-SPCL-PROC-8-CD ***** ,:MMI-SPCL-PROC-9-CD *****
   * ,:MMI-SPCL-PROC-10-CD ***** ,:MMI-NON-EMBD-COPAY-CD ***** ,:MMI-NON-EMBD-CORE-OOP-CD *****
   * ,:MMI-NON-EMBD-NEW-COINS-CD ***** ,:MMI-NON-EMBD-CORE-DED-CD ***** ,:MMI-XAPPLY-OOP-CD *****
   * ,:MMI-XAPPLY-COPAY-CD ***** ,:MMI-INDV-OOP-CD ***** ,:MMI-INDV-PRD-CD *****
   * ,:MMI-INDV-SALRY-TYP-CD ***** ,:MMI-FAM-SALRY-TYP-CD ***** ,:MMI-FAM-MULT-PCT *****
   * ,:MMI-LMT-SRVC-CD ***** ,:MMA-NPT-RULE-PKG-ID ***** ,:MMA-RHAB-COMB-PT-LMT-CD *****
   * ,:MMA-RHAB-COMB-OT-LMT-CD ***** ,:MMA-RHAB-COMB-ST-LMT-CD ***** ,:MMA-RHAB-COMB-SM-LMT-CD *****
   * ,:MMA-RHAB-COMB-CI-LMT-CD ***** ,:MMA-RHAB-COMB-CT-LMT-CD ***** ,:MMA-RHAB-COMB-CR-LMT-CD *****
   * ,:MMA-RHAB-COMB-PR-LMT-CD ***** ,:MMA-RHAB-COMB-MT-LMT-CD ***** ,:MMA-HAB-COMB-PT-LMT-CD *****
   * ,:MMA-HAB-COMB-OT-LMT-CD ***** ,:MMA-HAB-COMB-ST-LMT-CD ***** ,:MMA-HAB-COMB-SM-LMT-CD *****
   * ,:MMA-HAB-COMB-CI-LMT-CD ***** ,:MMA-HAB-COMB-CT-LMT-CD ***** ,:MMA-HAB-COMB-MT-LMT-CD *****
   * ,:MMA-UGI-IND ***** ,:MMA-LGI-IND ***** ,:MMA-EXD-IND ***** ,:MMI-OOP-COMB-NBR-CD ***** FROM
   * POL_PLN_MSTR T1 ***** ,POL_PLN_MSTR_ADDTL_INFO T2 ***** WHERE T1.COV_TYP_CD = :MMI-COV-TYP-CD
   * ***** AND T1.POL_NBR = :MMI-POL-NBR ***** AND T1.PLN_NBR = :MMI-PLN-NBR ***** AND T1.CLSS_NBR =
   * :MMI-CLSS-NBR ***** AND T1.POL_NBR = T2.POL_NBR ***** AND T1.PLN_NBR = T2.PLN_NBR ***** AND
   * T1.CLSS_NBR = T2.CLSS_NBR ***** AND T1.COV_TYP_CD = T2.COV_TYP_CD
   */
  public void selectPolPlnMstr4(
      DclpolPlnMstrAddtlInfo dclpolPlnMstrAddtlInfo, DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(34 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1309476776)
              .withInputs(
                  dclpolPlnMstr.getMmiCovTypCd(),
                  dclpolPlnMstr.getMmiPolNbr(),
                  dclpolPlnMstr.getMmiPlnNbr(),
                  dclpolPlnMstr.getMmiClssNbr())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
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
          dclpolPlnMstr.setMmiCombPrscDedPriCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(2);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiCombPrscDedQualCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(3);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiCombPrscDedSecCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(4);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiCombPrscDedTirCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(5);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiContrStCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(6);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiCopayAmt((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiCopayAmt(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiCopayAmt(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiCopayAmt(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(7);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiFamNewCoinsAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiFamNewCoinsAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiFamNewCoinsAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiFamNewCoinsAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(8);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiNewCoinsAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiNewCoinsAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiNewCoinsAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiNewCoinsAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(9);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiNewCoinsCombPrscCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(10);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiNewCoinsPrdCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(11);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiNewCoinsSalFamMultFct((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiNewCoinsSalFamMultFct(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiNewCoinsSalFamMultFct(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiNewCoinsSalFamMultFct(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(12);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiNewCoinsSalFamTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(13);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiNewCoinsSalIndvTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(14);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiNonEmbdDedCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(15);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiNtwkPcpCopayAmt((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiNtwkPcpCopayAmt(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiNtwkPcpCopayAmt(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiNtwkPcpCopayAmt(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(16);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiObligId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(17);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiOopCombFamAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopCombFamAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopCombFamAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopCombFamAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(18);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiOopCombIndvAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopCombIndvAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopCombIndvAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopCombIndvAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(19);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiOopCombPrscCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(20);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiPcpCopayCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(21);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiPcpSpecCoinsInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(22);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiRcprctyTblId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(23);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiShrArngCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(24);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdNSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(25);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdPSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(26);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdTSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(27);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdASetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(28);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdBSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(29);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdCSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(30);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdDSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(31);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdESetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(32);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdFSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(33);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdGSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(34);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdHSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(35);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdISetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(36);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdJSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(37);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdKSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(38);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdLSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(39);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdMSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(40);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdOSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(41);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdQSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(42);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdRSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(43);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdSSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(44);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdUSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(45);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdVSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(46);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdWSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(47);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdXSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(48);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdYSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(49);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdZSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(50);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiTier1CopayAmt((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiTier1CopayAmt(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiTier1CopayAmt(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiTier1CopayAmt(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(51);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiTier1FamNewCoinsAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiTier1FamNewCoinsAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiTier1FamNewCoinsAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiTier1FamNewCoinsAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(52);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiTier1NewCoinsAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiTier1NewCoinsAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiTier1NewCoinsAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiTier1NewCoinsAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(53);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiTier1UrgntCareAmt((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiTier1UrgntCareAmt(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiTier1UrgntCareAmt(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiTier1UrgntCareAmt(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(54);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiUrgntCareAmt((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiUrgntCareAmt(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiUrgntCareAmt(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiUrgntCareAmt(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(55);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiFamTxtSwapCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(56);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiFamMbrCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(57);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiCopayVarId(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiCopayVarId(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiCopayVarId(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiCopayVarId(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(58);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiXtraTerrStMandInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(59);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiTierLblInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(60);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSpclProc3Cd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(61);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiIplanTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(62);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiOopInNtwkEePls1Amt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopInNtwkEePls1Amt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopInNtwkEePls1Amt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopInNtwkEePls1Amt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(63);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiOopInNtwkEeSpoAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopInNtwkEeSpoAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopInNtwkEeSpoAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopInNtwkEeSpoAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(64);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiOopInNtwkEeChrgAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopInNtwkEeChrgAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopInNtwkEeChrgAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopInNtwkEeChrgAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(65);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiOopCombEePls1Amt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopCombEePls1Amt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopCombEePls1Amt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopCombEePls1Amt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(66);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiOopCombEeSpoAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopCombEeSpoAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopCombEeSpoAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopCombEeSpoAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(67);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiOopCombEeChrgAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopCombEeChrgAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopCombEeChrgAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOopCombEeChrgAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(68);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiCoinsCopayCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(69);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiCopayMaxAnnlAmt((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiCopayMaxAnnlAmt(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiCopayMaxAnnlAmt(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiCopayMaxAnnlAmt(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(70);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBhvHlthVendCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(71);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiCptnXclsInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(72);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiPrdctKeyCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(73);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiRsnCustyPrdCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(74);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiDfltChrgPct((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiDfltChrgPct(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiDfltChrgPct(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiDfltChrgPct(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(75);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiFaclShrSvCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(76);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiPhysnShrSvCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(77);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiNewCoinsAccumCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(78);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiAllncCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(79);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiFundTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(80);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiPrdctCdId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(81);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiEmergentWrpInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(82);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiOopMaxCovCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(83);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSpclProc6Cd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(84);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSpclProc1Cd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(85);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSpclProc2Cd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(86);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSpclProc4Cd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(87);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSpclProc5Cd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(88);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSpclProc7Cd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(89);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSpclProc8Cd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(90);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSpclProc9Cd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(91);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSpclProc10Cd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(92);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiNonEmbdCopayCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(93);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiNonEmbdCoreOopCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(94);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiNonEmbdNewCoinsCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(95);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiNonEmbdCoreDedCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(96);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiXapplyOopCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(97);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiXapplyCopayCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(98);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiIndvOopCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(99);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiIndvPrdCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(100);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiIndvSalryTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(101);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiFamSalryTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(102);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiFamMultPct((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiFamMultPct(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiFamMultPct(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiFamMultPct(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(103);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiLmtSrvcCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(104);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaNptRulePkgId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(105);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRhabCombPtLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(106);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRhabCombOtLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(107);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRhabCombStLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(108);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRhabCombSmLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(109);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRhabCombCiLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(110);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRhabCombCtLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(111);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRhabCombCrLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(112);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRhabCombPrLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(113);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRhabCombMtLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(114);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaHabCombPtLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(115);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaHabCombOtLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(116);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaHabCombStLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(117);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaHabCombSmLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(118);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaHabCombCiLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(119);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaHabCombCtLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(120);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaHabCombMtLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(121);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaUgiInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(122);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaLgiInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(123);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaExdInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(124);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiOopCombNbrCd(resultObj.toString().toCharArray());
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
  // methodEnd:selectPolPlnMstr4
  // methodStart:openCurBenLvlD5427pol

  /**
   * ***** DECLARE CUR-BEN-LVL CURSOR FOR ***** SELECT ***** BEN_LVL_TYP_CD ***** ,BAS_PCT_OVRLAY_CD
   * ***** ,INCNT_PNTLY_BAS_CD ***** ,INCNT_PNTLY_BAS_PCT ***** ,INCNT_PNTLY_MED_CD *****
   * ,INCNT_PNTLY_MED_PCT ***** ,OVERLAY_PCT_CD ***** ,DED_DESC_CD ***** FROM POL_PLN_MSTR_BEN_LVL
   * ***** WHERE COV_TYP_CD = :DBLV-COV-TYP-CD ***** AND POL_NBR = :DBLV-POL-NBR ***** AND PLN_NBR =
   * :DBLV-PLN-NBR ***** AND CLSS_NBR = :DBLV-CLSS-NBR ***** FOR FETCH ONLY
   */
  public ResultSet openCurBenLvlD5427pol(Sqlca sqlca, DclpolPlnMstrBenLvl dclpolPlnMstrBenLvl)
      throws Exception {
    ResultSet curBenLvlResultSet = null;
    try {
      // OPEN CURSOR
      sqlca.setSqlcode(0);
      curBenLvlResultSet =
          db2Base
              .startQuery(14 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_609281083)
              .withInputs(
                  dclpolPlnMstrBenLvl.getDblvCovTypCd(),
                  dclpolPlnMstrBenLvl.getDblvPolNbr(),
                  dclpolPlnMstrBenLvl.getDblvPlnNbr(),
                  dclpolPlnMstrBenLvl.getDblvClssNbr())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
              .queryForList();
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }

    return curBenLvlResultSet;
  }
  // methodEnd:openCurBenLvlD5427pol
  // methodStart:fetchCurBenLvlD5427pol

  /**
   * ***** FETCH CUR-BEN-LVL ***** INTO :DBLV-BEN-LVL-TYP-CD ***** ,:DBLV-BAS-PCT-OVRLAY-CD *****
   * ,:DBLV-INCNT-PNTLY-BAS-CD ***** ,:DBLV-INCNT-PNTLY-BAS-PCT ***** ,:DBLV-INCNT-PNTLY-MED-CD
   * ***** ,:DBLV-INCNT-PNTLY-MED-PCT ***** ,:DBLV-OVERLAY-PCT-CD ***** ,:DBLV-DED-DESC-CD
   */
  public void fetchCurBenLvlD5427pol(
      ResultSet curBenLvlResultSet, Sqlca sqlca, DclpolPlnMstrBenLvl dclpolPlnMstrBenLvl)
      throws Exception {
    try {
      boolean hasResults = curBenLvlResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = curBenLvlResultSet.getObject(1);
        if (resultObj != null) {
          dclpolPlnMstrBenLvl.setDblvBenLvlTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curBenLvlResultSet.getObject(2);
        if (resultObj != null) {
          dclpolPlnMstrBenLvl.setDblvBasPctOvrlayCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curBenLvlResultSet.getObject(3);
        if (resultObj != null) {
          dclpolPlnMstrBenLvl.setDblvIncntPntlyBasCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curBenLvlResultSet.getObject(4);
        if (resultObj != null) {
          try {
            dclpolPlnMstrBenLvl.setDblvIncntPntlyBasPct((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnMstrBenLvl.setDblvIncntPntlyBasPct(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstrBenLvl.setDblvIncntPntlyBasPct(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstrBenLvl.setDblvIncntPntlyBasPct(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curBenLvlResultSet.getObject(5);
        if (resultObj != null) {
          dclpolPlnMstrBenLvl.setDblvIncntPntlyMedCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curBenLvlResultSet.getObject(6);
        if (resultObj != null) {
          try {
            dclpolPlnMstrBenLvl.setDblvIncntPntlyMedPct((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnMstrBenLvl.setDblvIncntPntlyMedPct(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstrBenLvl.setDblvIncntPntlyMedPct(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstrBenLvl.setDblvIncntPntlyMedPct(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curBenLvlResultSet.getObject(7);
        if (resultObj != null) {
          dclpolPlnMstrBenLvl.setDblvOverlayPctCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curBenLvlResultSet.getObject(8);
        if (resultObj != null) {
          dclpolPlnMstrBenLvl.setDblvDedDescCd(resultObj.toString().toCharArray());
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
        logger.error("curBenLvlResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchCurBenLvlD5427pol
  // methodStart:closeCurBenLvlD5427pol

  /** ***** CLOSE CUR-BEN-LVL */
  public void closeCurBenLvlD5427pol(ResultSet curBenLvlResultSet, Sqlca sqlca) throws Exception {

    closeCursor(curBenLvlResultSet, sqlca);
  }
  // methodEnd:closeCurBenLvlD5427pol
  // methodStart:openCurFamDedD5427pol

  /**
   * ***** DECLARE CUR-FAM-DED CURSOR FOR ***** SELECT ***** SEQ_NBR ***** ,DED_AMT *****
   * ,DED_CARO_CD ***** ,DED_CD ***** ,DED_MBR_DESC ***** ,DED_MULT_FCT ***** ,DED_MULT_SALRY_PCT
   * ***** ,OOP_MULT_FCT ***** ,DED_EE_PLS_1_AMT ***** ,DED_EE_SPO_AMT ***** ,DED_EE_CHRG_AMT *****
   * FROM POL_PLN_MSTR_FAM_DED ***** WHERE COV_TYP_CD = :DFDE-COV-TYP-CD ***** AND POL_NBR =
   * :DFDE-POL-NBR ***** AND PLN_NBR = :DFDE-PLN-NBR ***** AND CLSS_NBR = :DFDE-CLSS-NBR ***** FOR
   * FETCH ONLY
   */
  public ResultSet openCurFamDedD5427pol(DclpolPlnMstrFamDed dclpolPlnMstrFamDed, Sqlca sqlca)
      throws Exception {
    ResultSet curFamDedResultSet = null;
    try {
      // OPEN CURSOR
      sqlca.setSqlcode(0);
      curFamDedResultSet =
          db2Base
              .startQuery(15 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1946740623)
              .withInputs(
                  dclpolPlnMstrFamDed.getDfdeCovTypCd(),
                  dclpolPlnMstrFamDed.getDfdePolNbr(),
                  dclpolPlnMstrFamDed.getDfdePlnNbr(),
                  dclpolPlnMstrFamDed.getDfdeClssNbr())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
              .queryForList();
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }

    return curFamDedResultSet;
  }
  // methodEnd:openCurFamDedD5427pol
  // methodStart:fetchCurFamDedD5427pol

  /**
   * ***** FETCH CUR-FAM-DED ***** INTO :DFDE-SEQ-NBR ***** ,:DFDE-DED-AMT ***** ,:DFDE-DED-CARO-CD
   * ***** ,:DFDE-DED-CD ***** ,:DFDE-DED-MBR-DESC ***** ,:DFDE-DED-MULT-FCT *****
   * ,:DFDE-DED-MULT-SALRY-PCT ***** ,:DFDE-OOP-MULT-FCT ***** ,:DFDE-DED-EE-PLS-1-AMT *****
   * ,:DFDE-DED-EE-SPO-AMT ***** ,:DFDE-DED-EE-CHRG-AMT
   */
  public void fetchCurFamDedD5427pol(
      ResultSet curFamDedResultSet, DclpolPlnMstrFamDed dclpolPlnMstrFamDed, Sqlca sqlca)
      throws Exception {
    try {
      boolean hasResults = curFamDedResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = curFamDedResultSet.getObject(1);
        if (resultObj != null) {
          dclpolPlnMstrFamDed.setDfdeSeqNbr((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curFamDedResultSet.getObject(2);
        if (resultObj != null) {
          try {
            dclpolPlnMstrFamDed.setDfdeDedAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstrFamDed.setDfdeDedAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstrFamDed.setDfdeDedAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstrFamDed.setDfdeDedAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curFamDedResultSet.getObject(3);
        if (resultObj != null) {
          dclpolPlnMstrFamDed.setDfdeDedCaroCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curFamDedResultSet.getObject(4);
        if (resultObj != null) {
          dclpolPlnMstrFamDed.setDfdeDedCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curFamDedResultSet.getObject(5);
        if (resultObj != null) {
          dclpolPlnMstrFamDed.setDfdeDedMbrDesc(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curFamDedResultSet.getObject(6);
        if (resultObj != null) {
          dclpolPlnMstrFamDed.setDfdeDedMultFct((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curFamDedResultSet.getObject(7);
        if (resultObj != null) {
          try {
            dclpolPlnMstrFamDed.setDfdeDedMultSalryPct((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnMstrFamDed.setDfdeDedMultSalryPct(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstrFamDed.setDfdeDedMultSalryPct(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstrFamDed.setDfdeDedMultSalryPct(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curFamDedResultSet.getObject(8);
        if (resultObj != null) {
          try {
            dclpolPlnMstrFamDed.setDfdeOopMultFct((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnMstrFamDed.setDfdeOopMultFct(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstrFamDed.setDfdeOopMultFct(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstrFamDed.setDfdeOopMultFct(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curFamDedResultSet.getObject(9);
        if (resultObj != null) {
          try {
            dclpolPlnMstrFamDed.setDfdeDedEePls1Amt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstrFamDed.setDfdeDedEePls1Amt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstrFamDed.setDfdeDedEePls1Amt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstrFamDed.setDfdeDedEePls1Amt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curFamDedResultSet.getObject(10);
        if (resultObj != null) {
          try {
            dclpolPlnMstrFamDed.setDfdeDedEeSpoAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstrFamDed.setDfdeDedEeSpoAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstrFamDed.setDfdeDedEeSpoAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstrFamDed.setDfdeDedEeSpoAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curFamDedResultSet.getObject(11);
        if (resultObj != null) {
          try {
            dclpolPlnMstrFamDed.setDfdeDedEeChrgAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstrFamDed.setDfdeDedEeChrgAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstrFamDed.setDfdeDedEeChrgAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstrFamDed.setDfdeDedEeChrgAmt(((Double) resultObj).intValue());
          }
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
        logger.error("curFamDedResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchCurFamDedD5427pol
  // methodStart:closeCurFamDedD5427pol

  /** ***** CLOSE CUR-FAM-DED */
  public void closeCurFamDedD5427pol(ResultSet curFamDedResultSet, Sqlca sqlca) throws Exception {

    closeCursor(curFamDedResultSet, sqlca);
  }
  // methodEnd:closeCurFamDedD5427pol
  // methodStart:openCurIndDedD5427pol

  /**
   * ***** DECLARE CUR-IND-DED CURSOR FOR ***** SELECT ***** SEQ_NBR ***** ,DED_AMT ***** ,DED_CD
   * ***** ,DED_NTWK_TYP_CD ***** ,DED_SRVC_DESC ***** ,DED_FREQ_CD ***** FROM POL_PLN_MSTR_INDV_DED
   * ***** WHERE COV_TYP_CD = :DIDE-COV-TYP-CD ***** AND POL_NBR = :DIDE-POL-NBR ***** AND PLN_NBR =
   * :DIDE-PLN-NBR ***** AND CLSS_NBR = :DIDE-CLSS-NBR ***** FOR FETCH ONLY
   */
  public ResultSet openCurIndDedD5427pol(Sqlca sqlca, DclpolPlnMstrIndvDed dclpolPlnMstrIndvDed)
      throws Exception {
    ResultSet curIndDedResultSet = null;
    try {
      // OPEN CURSOR
      sqlca.setSqlcode(0);
      curIndDedResultSet =
          db2Base
              .startQuery(16 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_909126546)
              .withInputs(
                  dclpolPlnMstrIndvDed.getDideCovTypCd(),
                  dclpolPlnMstrIndvDed.getDidePolNbr(),
                  dclpolPlnMstrIndvDed.getDidePlnNbr(),
                  dclpolPlnMstrIndvDed.getDideClssNbr())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
              .queryForList();
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }

    return curIndDedResultSet;
  }
  // methodEnd:openCurIndDedD5427pol
  // methodStart:fetchCurIndDedD5427pol

  /**
   * ***** FETCH CUR-IND-DED ***** INTO :DIDE-SEQ-NBR ***** ,:DIDE-DED-AMT ***** ,:DIDE-DED-CD *****
   * ,:DIDE-DED-NTWK-TYP-CD ***** ,:DIDE-DED-SRVC-DESC ***** ,:DIDE-DED-FREQ-CD
   */
  public void fetchCurIndDedD5427pol(
      ResultSet curIndDedResultSet, Sqlca sqlca, DclpolPlnMstrIndvDed dclpolPlnMstrIndvDed)
      throws Exception {
    try {
      boolean hasResults = curIndDedResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = curIndDedResultSet.getObject(1);
        if (resultObj != null) {
          dclpolPlnMstrIndvDed.setDideSeqNbr((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curIndDedResultSet.getObject(2);
        if (resultObj != null) {
          try {
            dclpolPlnMstrIndvDed.setDideDedAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstrIndvDed.setDideDedAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstrIndvDed.setDideDedAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstrIndvDed.setDideDedAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curIndDedResultSet.getObject(3);
        if (resultObj != null) {
          dclpolPlnMstrIndvDed.setDideDedCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curIndDedResultSet.getObject(4);
        if (resultObj != null) {
          dclpolPlnMstrIndvDed.setDideDedNtwkTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curIndDedResultSet.getObject(5);
        if (resultObj != null) {
          dclpolPlnMstrIndvDed.setDideDedSrvcDesc(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curIndDedResultSet.getObject(6);
        if (resultObj != null) {
          dclpolPlnMstrIndvDed.setDideDedFreqCd(resultObj.toString().toCharArray());
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
        logger.error("curIndDedResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchCurIndDedD5427pol
  // methodStart:closeCurIndDedD5427pol

  /** ***** CLOSE CUR-IND-DED */
  public void closeCurIndDedD5427pol(ResultSet curIndDedResultSet, Sqlca sqlca) throws Exception {

    closeCursor(curIndDedResultSet, sqlca);
  }
  // methodEnd:closeCurIndDedD5427pol
  // methodStart:openCurCopayOopCsrD5427pol

  /**
   * ***** DECLARE CUR-COPAY-OOP-CSR CURSOR FOR ***** SELECT ***** ACCUM_RULE_TYP_CD *****
   * ,ACCUM_BEN_TYP_CD ***** ,INDV_OOP_AMT ***** ,FAM_OOP_AMT ***** ,INDV_MAX_AMT ***** ,FAM_MAX_AMT
   * ***** ,EE_PLS_1_AMT ***** ,EE_PLS_SP_AMT ***** ,EE_PLS_CH_AMT ***** FROM POL_PLN_ACCUM_RULE
   * ***** WHERE POL_NBR = :DACM-POL-NBR ***** AND PLN_NBR = :DACM-PLN-NBR ***** AND CLSS_NBR =
   * :DACM-CLSS-NBR ***** AND COV_TYP_CD = :DACM-COV-TYP-CD ***** FOR FETCH ONLY
   */
  public ResultSet openCurCopayOopCsrD5427pol(Sqlca sqlca, DclpolPlnAccumRule dclpolPlnAccumRule)
      throws Exception {
    ResultSet curCopayOopCsrResultSet = null;
    try {
      // OPEN CURSOR
      sqlca.setSqlcode(0);
      curCopayOopCsrResultSet =
          db2Base
              .startQuery(19 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_976965899)
              .withInputs(
                  dclpolPlnAccumRule.getDacmPolNbr(),
                  dclpolPlnAccumRule.getDacmPlnNbr(),
                  dclpolPlnAccumRule.getDacmClssNbr(),
                  dclpolPlnAccumRule.getDacmCovTypCd())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
              .queryForList();
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }

    return curCopayOopCsrResultSet;
  }
  // methodEnd:openCurCopayOopCsrD5427pol
  // methodStart:fetchCurCopayOopCsrD5427pol

  /**
   * ***** FETCH CUR-COPAY-OOP-CSR ***** INTO :DACM-ACCUM-RULE-TYP-CD ***** ,:DACM-ACCUM-BEN-TYP-CD
   * ***** ,:DACM-INDV-OOP-AMT ***** ,:DACM-FAM-OOP-AMT ***** ,:DACM-INDV-MAX-AMT *****
   * ,:DACM-FAM-MAX-AMT ***** ,:DACM-EE-PLS-1-AMT ***** ,:DACM-EE-PLS-SP-AMT *****
   * ,:DACM-EE-PLS-CH-AMT
   */
  public void fetchCurCopayOopCsrD5427pol(
      ResultSet curCopayOopCsrResultSet, Sqlca sqlca, DclpolPlnAccumRule dclpolPlnAccumRule)
      throws Exception {
    try {
      boolean hasResults = curCopayOopCsrResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = curCopayOopCsrResultSet.getObject(1);
        if (resultObj != null) {
          dclpolPlnAccumRule.setDacmAccumRuleTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curCopayOopCsrResultSet.getObject(2);
        if (resultObj != null) {
          dclpolPlnAccumRule.setDacmAccumBenTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curCopayOopCsrResultSet.getObject(3);
        if (resultObj != null) {
          try {
            dclpolPlnAccumRule.setDacmIndvOopAmt((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmIndvOopAmt(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmIndvOopAmt(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmIndvOopAmt(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curCopayOopCsrResultSet.getObject(4);
        if (resultObj != null) {
          try {
            dclpolPlnAccumRule.setDacmFamOopAmt((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmFamOopAmt(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmFamOopAmt(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmFamOopAmt(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curCopayOopCsrResultSet.getObject(5);
        if (resultObj != null) {
          try {
            dclpolPlnAccumRule.setDacmIndvMaxAmt((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmIndvMaxAmt(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmIndvMaxAmt(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmIndvMaxAmt(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curCopayOopCsrResultSet.getObject(6);
        if (resultObj != null) {
          try {
            dclpolPlnAccumRule.setDacmFamMaxAmt((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmFamMaxAmt(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmFamMaxAmt(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmFamMaxAmt(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curCopayOopCsrResultSet.getObject(7);
        if (resultObj != null) {
          try {
            dclpolPlnAccumRule.setDacmEePls1Amt((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmEePls1Amt(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmEePls1Amt(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmEePls1Amt(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curCopayOopCsrResultSet.getObject(8);
        if (resultObj != null) {
          try {
            dclpolPlnAccumRule.setDacmEePlsSpAmt((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmEePlsSpAmt(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmEePlsSpAmt(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmEePlsSpAmt(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curCopayOopCsrResultSet.getObject(9);
        if (resultObj != null) {
          try {
            dclpolPlnAccumRule.setDacmEePlsChAmt((Db2Base.castToBigDecimal(resultObj)));
          } catch (java.lang.ClassCastException cce) {
            if (Integer.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmEePlsChAmt(BigDecimal.valueOf((Integer) resultObj));
            else if (Float.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmEePlsChAmt(
                  new BigDecimal((Float) resultObj, MathContext.DECIMAL32));
            else if (Double.class.isInstance(resultObj))
              dclpolPlnAccumRule.setDacmEePlsChAmt(
                  new BigDecimal((Double) resultObj, MathContext.DECIMAL64));
          }
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
        logger.error("curCopayOopCsrResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchCurCopayOopCsrD5427pol
  // methodStart:closeCurCopayOopCsrD5427pol

  /** ***** CLOSE CUR-COPAY-OOP-CSR */
  public void closeCurCopayOopCsrD5427pol(ResultSet curCopayOopCsrResultSet, Sqlca sqlca)
      throws Exception {

    closeCursor(curCopayOopCsrResultSet, sqlca);
  }
  // methodEnd:closeCurCopayOopCsrD5427pol
  // methodStart:selectPolPlnMstr5

  /**
   * ***** SELECT BEN_MAX_COMB_PRI_CD ***** ,BEN_MAX_COMB_PRI_CNT ***** ,BEN_MAX_COMB_SEC_CD *****
   * ,BEN_MAX_COMB_SEC_CNT ***** ,BEN_MAX_CRDC_REHAB_PRI_CD ***** ,BEN_MAX_CRDC_REHAB_PRI_CNT *****
   * ,BEN_MAX_CRDC_REHAB_SEC_CD ***** ,BEN_MAX_CRDC_REHAB_SEC_CNT ***** ,BEN_MAX_OCP_TRPY_PRI_CD
   * ***** ,BEN_MAX_OCP_TRPY_PRI_CNT ***** ,BEN_MAX_OCP_TRPY_SEC_CD ***** ,BEN_MAX_OCP_TRPY_SEC_CNT
   * ***** ,BEN_MAX_PH_OC_SPCH_PRI_CD ***** ,BEN_MAX_PH_OC_SPCH_PRI_CNT *****
   * ,BEN_MAX_PH_OC_SPCH_SEC_CD ***** ,BEN_MAX_PH_OC_SPCH_SEC_CNT ***** ,BEN_MAX_PH_OC_TRPY_PRI_CD
   * ***** ,BEN_MAX_PH_OC_TRPY_PRI_CNT ***** ,BEN_MAX_PH_OC_TRPY_SEC_CD *****
   * ,BEN_MAX_PH_OC_TRPY_SEC_CNT ***** ,BEN_MAX_PHYS_TRPY_PRI_CD ***** ,BEN_MAX_PHYS_TRPY_PRI_CNT
   * ***** ,BEN_MAX_PHYS_TRPY_SEC_CD ***** ,BEN_MAX_PHYS_TRPY_SEC_CNT *****
   * ,BEN_MAX_SPCH_TRPY_PRI_CD ***** ,BEN_MAX_SPCH_TRPY_PRI_CNT ***** ,BEN_MAX_SPCH_TRPY_SEC_CD
   * ***** ,BEN_MAX_SPCH_TRPY_SEC_CNT ***** ,BEN_MAX_SPNE_MNIP_PRI_CD *****
   * ,BEN_MAX_SPNE_MNIP_PRI_CNT ***** ,BEN_MAX_SPNE_MNIP_SEC_CD ***** ,BEN_MAX_SPNE_MNIP_SEC_CNT
   * ***** ,PHYS_MEDCN_PRD_CD ***** ,SRVC_CD_N_SET_IND ***** ,SRVC_CD_P_SET_IND *****
   * ,SRVC_CD_T_SET_IND ***** ,MCR_CD ***** ***** ,BEN_MAX_AURAL_CI_PRI_CD *****
   * ,BEN_MAX_AURAL_CI_PRI_CNT ***** ,BEN_MAX_AURAL_CI_SEC_CD ***** ,BEN_MAX_AURAL_CI_SEC_CNT *****
   * ,BEN_MAX_COG_TRPY_PRI_CD ***** ,BEN_MAX_COG_TRPY_PRI_CNT ***** ,BEN_MAX_COG_TRPY_SEC_CD *****
   * ,BEN_MAX_COG_TRPY_SEC_CNT ***** ,BEN_MAX_COG_TRPY_EXCL_CD ***** ,BEN_MAX_EHB_SPNE_RHAB_CNT
   * ***** ,BEN_MAX_EHB_SPNE_HAB_CNT ***** ,BEN_MAX_EHB_PT_RHAB_CNT ***** ,BEN_MAX_EHB_PT_HAB_CNT
   * ***** ,BEN_MAX_EHB_SPCH_RHAB_CNT ***** ,BEN_MAX_EHB_SPCH_HAB_CNT *****
   * ,BEN_MAX_EHB_CRDC_RHAB_CNT ***** ,BEN_MAX_EHB_OT_RHAB_CNT ***** ,BEN_MAX_EHB_OT_HAB_CNT *****
   * ,BEN_MAX_EHB_PLMRY_RHAB_CNT ***** ,BEN_MAX_EHB_AURAL_RHAB_CNT ***** ,BEN_MAX_EHB_AURAL_HAB_CNT
   * ***** ,BEN_MAX_EHB_COG_RHAB_CNT ***** ,BEN_MAX_EHB_COG_HAB_CNT ***** ,BEN_MAX_EHB_POST_RHAB_CNT
   * ***** ,BEN_MAX_EHB_POST_HAB_CNT ***** ,BEN_MAX_EHB_PTOT_RHAB_CNT *****
   * ,BEN_MAX_EHB_PTOT_HAB_CNT ***** ,BEN_MAX_EHB_RHAB_RMRK_CD ***** ,BEN_MAX_EHB_POSM_RHAB_CNT
   * ***** ,BEN_MAX_EHB_POSM_HAB_CNT ***** ,BEN_MAX_EHB_HAB_RMRK_CD ***** ,BEN_PHYS_MEDCN_PRD_CD
   * ***** ,RHAB_COMB_PT_LMT_CD ***** ,RHAB_COMB_OT_LMT_CD ***** ,RHAB_COMB_ST_LMT_CD *****
   * ,RHAB_COMB_SM_LMT_CD ***** ,RHAB_COMB_CI_LMT_CD ***** ,RHAB_COMB_CT_LMT_CD *****
   * ,RHAB_COMB_CR_LMT_CD ***** ,RHAB_COMB_PR_LMT_CD ***** ,RHAB_COMB_MT_LMT_CD *****
   * ,HAB_COMB_PT_LMT_CD ***** ,HAB_COMB_OT_LMT_CD ***** ,HAB_COMB_ST_LMT_CD *****
   * ,HAB_COMB_SM_LMT_CD ***** ,HAB_COMB_CI_LMT_CD ***** ,HAB_COMB_CT_LMT_CD *****
   * ,HAB_COMB_MT_LMT_CD ***** ***** INTO :MMI-BEN-MAX-COMB-PRI-CD ***** ,:MMI-BEN-MAX-COMB-PRI-CNT
   * ***** ,:MMI-BEN-MAX-COMB-SEC-CD ***** ,:MMI-BEN-MAX-COMB-SEC-CNT *****
   * ,:MMI-BEN-MAX-CRDC-REHAB-PRI-CD ***** ,:MMI-BEN-MAX-CRDC-REHAB-PRI-CNT *****
   * ,:MMI-BEN-MAX-CRDC-REHAB-SEC-CD ***** ,:MMI-BEN-MAX-CRDC-REHAB-SEC-CNT *****
   * ,:MMI-BEN-MAX-OCP-TRPY-PRI-CD ***** ,:MMI-BEN-MAX-OCP-TRPY-PRI-CNT *****
   * ,:MMI-BEN-MAX-OCP-TRPY-SEC-CD ***** ,:MMI-BEN-MAX-OCP-TRPY-SEC-CNT *****
   * ,:MMI-BEN-MAX-PH-OC-SPCH-PRI-CD ***** ,:MMI-BEN-MAX-PH-OC-SPCH-PRI-CNT *****
   * ,:MMI-BEN-MAX-PH-OC-SPCH-SEC-CD ***** ,:MMI-BEN-MAX-PH-OC-SPCH-SEC-CNT *****
   * ,:MMI-BEN-MAX-PH-OC-TRPY-PRI-CD ***** ,:MMI-BEN-MAX-PH-OC-TRPY-PRI-CNT *****
   * ,:MMI-BEN-MAX-PH-OC-TRPY-SEC-CD ***** ,:MMI-BEN-MAX-PH-OC-TRPY-SEC-CNT *****
   * ,:MMI-BEN-MAX-PHYS-TRPY-PRI-CD ***** ,:MMI-BEN-MAX-PHYS-TRPY-PRI-CNT *****
   * ,:MMI-BEN-MAX-PHYS-TRPY-SEC-CD ***** ,:MMI-BEN-MAX-PHYS-TRPY-SEC-CNT *****
   * ,:MMI-BEN-MAX-SPCH-TRPY-PRI-CD ***** ,:MMI-BEN-MAX-SPCH-TRPY-PRI-CNT *****
   * ,:MMI-BEN-MAX-SPCH-TRPY-SEC-CD ***** ,:MMI-BEN-MAX-SPCH-TRPY-SEC-CNT *****
   * ,:MMI-BEN-MAX-SPNE-MNIP-PRI-CD ***** ,:MMI-BEN-MAX-SPNE-MNIP-PRI-CNT *****
   * ,:MMI-BEN-MAX-SPNE-MNIP-SEC-CD ***** ,:MMI-BEN-MAX-SPNE-MNIP-SEC-CNT *****
   * ,:MMI-PHYS-MEDCN-PRD-CD ***** ,:MMI-SRVC-CD-N-SET-IND ***** ,:MMI-SRVC-CD-P-SET-IND *****
   * ,:MMI-SRVC-CD-T-SET-IND ***** ,:MMI-MCR-CD ***** ***** ,:MMI-BEN-MAX-AURAL-CI-PRI-CD *****
   * ,:MMI-BEN-MAX-AURAL-CI-PRI-CNT ***** ,:MMI-BEN-MAX-AURAL-CI-SEC-CD *****
   * ,:MMI-BEN-MAX-AURAL-CI-SEC-CNT ***** ,:MMI-BEN-MAX-COG-TRPY-PRI-CD *****
   * ,:MMI-BEN-MAX-COG-TRPY-PRI-CNT ***** ,:MMI-BEN-MAX-COG-TRPY-SEC-CD *****
   * ,:MMI-BEN-MAX-COG-TRPY-SEC-CNT ***** ,:MMI-BEN-MAX-COG-TRPY-EXCL-CD *****
   * ,:MMI-BEN-MAX-EHB-SPNE-RHAB-CNT ***** ,:MMI-BEN-MAX-EHB-SPNE-HAB-CNT *****
   * ,:MMI-BEN-MAX-EHB-PT-RHAB-CNT ***** ,:MMI-BEN-MAX-EHB-PT-HAB-CNT *****
   * ,:MMI-BEN-MAX-EHB-SPCH-RHAB-CNT ***** ,:MMI-BEN-MAX-EHB-SPCH-HAB-CNT *****
   * ,:MMI-BEN-MAX-EHB-CRDC-RHAB-CNT ***** ,:MMI-BEN-MAX-EHB-OT-RHAB-CNT *****
   * ,:MMI-BEN-MAX-EHB-OT-HAB-CNT ***** ,:MMI-BEN-MAX-EHB-PLMRY-RHAB-CNT *****
   * ,:MMI-BEN-MAX-EHB-AURAL-RHAB-CNT ***** ,:MMI-BEN-MAX-EHB-AURAL-HAB-CNT *****
   * ,:MMI-BEN-MAX-EHB-COG-RHAB-CNT ***** ,:MMI-BEN-MAX-EHB-COG-HAB-CNT *****
   * ,:MMI-BEN-MAX-EHB-POST-RHAB-CNT ***** ,:MMI-BEN-MAX-EHB-POST-HAB-CNT *****
   * ,:MMI-BEN-MAX-EHB-PTOT-RHAB-CNT ***** ,:MMI-BEN-MAX-EHB-PTOT-HAB-CNT *****
   * ,:MMI-BEN-MAX-EHB-RHAB-RMRK-CD ***** ,:MMI-BEN-MAX-EHB-POSM-RHAB-CNT *****
   * ,:MMI-BEN-MAX-EHB-POSM-HAB-CNT ***** ,:MMI-BEN-MAX-EHB-HAB-RMRK-CD *****
   * ,:MMI-BEN-PHYS-MEDCN-PRD-CD ***** ,:MMA-RHAB-COMB-PT-LMT-CD ***** ,:MMA-RHAB-COMB-OT-LMT-CD
   * ***** ,:MMA-RHAB-COMB-ST-LMT-CD ***** ,:MMA-RHAB-COMB-SM-LMT-CD ***** ,:MMA-RHAB-COMB-CI-LMT-CD
   * ***** ,:MMA-RHAB-COMB-CT-LMT-CD ***** ,:MMA-RHAB-COMB-CR-LMT-CD ***** ,:MMA-RHAB-COMB-PR-LMT-CD
   * ***** ,:MMA-RHAB-COMB-MT-LMT-CD ***** ,:MMA-HAB-COMB-PT-LMT-CD ***** ,:MMA-HAB-COMB-OT-LMT-CD
   * ***** ,:MMA-HAB-COMB-ST-LMT-CD ***** ,:MMA-HAB-COMB-SM-LMT-CD ***** ,:MMA-HAB-COMB-CI-LMT-CD
   * ***** ,:MMA-HAB-COMB-CT-LMT-CD ***** ,:MMA-HAB-COMB-MT-LMT-CD ***** ***** FROM POL_PLN_MSTR T1
   * ***** ,POL_PLN_MSTR_ADDTL_INFO T2 ***** WHERE T1.COV_TYP_CD = :MMI-COV-TYP-CD ***** AND
   * T1.POL_NBR = :MMI-POL-NBR ***** AND T1.PLN_NBR = :MMI-PLN-NBR ***** AND T1.CLSS_NBR =
   * :MMI-CLSS-NBR ***** AND T1.COV_TYP_CD = T2.COV_TYP_CD ***** AND T1.POL_NBR = T2.POL_NBR *****
   * AND T1.PLN_NBR = T2.PLN_NBR ***** AND T1.CLSS_NBR = T2.CLSS_NBR
   */
  public void selectPolPlnMstr5(
      DclpolPlnMstrAddtlInfo dclpolPlnMstrAddtlInfo, DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(47 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_297808893)
              .withInputs(
                  dclpolPlnMstr.getMmiCovTypCd(),
                  dclpolPlnMstr.getMmiPolNbr(),
                  dclpolPlnMstr.getMmiPlnNbr(),
                  dclpolPlnMstr.getMmiClssNbr())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
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
          dclpolPlnMstr.setMmiBenMaxCombPriCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(2);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxCombPriCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(3);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxCombSecCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(4);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxCombSecCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(5);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxCrdcRehabPriCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(6);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxCrdcRehabPriCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(7);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxCrdcRehabSecCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(8);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxCrdcRehabSecCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(9);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxOcpTrpyPriCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(10);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxOcpTrpyPriCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(11);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxOcpTrpySecCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(12);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxOcpTrpySecCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(13);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxPhOcSpchPriCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(14);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxPhOcSpchPriCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(15);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxPhOcSpchSecCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(16);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxPhOcSpchSecCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(17);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxPhOcTrpyPriCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(18);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxPhOcTrpyPriCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(19);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxPhOcTrpySecCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(20);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxPhOcTrpySecCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(21);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxPhysTrpyPriCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(22);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxPhysTrpyPriCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(23);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxPhysTrpySecCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(24);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxPhysTrpySecCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(25);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxSpchTrpyPriCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(26);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxSpchTrpyPriCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(27);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxSpchTrpySecCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(28);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxSpchTrpySecCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(29);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxSpneMnipPriCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(30);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxSpneMnipPriCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(31);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxSpneMnipSecCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(32);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxSpneMnipSecCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(33);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiPhysMedcnPrdCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(34);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdNSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(35);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdPSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(36);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdTSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(37);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiMcrCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(38);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxAuralCiPriCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(39);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxAuralCiPriCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(40);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxAuralCiSecCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(41);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxAuralCiSecCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(42);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxCogTrpyPriCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(43);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxCogTrpyPriCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(44);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxCogTrpySecCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(45);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxCogTrpySecCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(46);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxCogTrpyExclCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(47);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbSpneRhabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(48);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbSpneHabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(49);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbPtRhabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(50);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbPtHabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(51);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbSpchRhabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(52);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbSpchHabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(53);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbCrdcRhabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(54);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbOtRhabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(55);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbOtHabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(56);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbPlmryRhabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(57);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbAuralRhabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(58);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbAuralHabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(59);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbCogRhabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(60);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbCogHabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(61);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbPostRhabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(62);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbPostHabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(63);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbPtotRhabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(64);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbPtotHabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(65);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbRhabRmrkCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(66);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbPosmRhabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(67);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbPosmHabCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(68);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxEhbHabRmrkCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(69);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenPhysMedcnPrdCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(70);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRhabCombPtLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(71);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRhabCombOtLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(72);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRhabCombStLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(73);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRhabCombSmLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(74);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRhabCombCiLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(75);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRhabCombCtLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(76);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRhabCombCrLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(77);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRhabCombPrLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(78);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRhabCombMtLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(79);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaHabCombPtLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(80);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaHabCombOtLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(81);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaHabCombStLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(82);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaHabCombSmLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(83);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaHabCombCiLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(84);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaHabCombCtLmtCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(85);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaHabCombMtLmtCd(resultObj.toString().toCharArray());
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
  // methodEnd:selectPolPlnMstr5
  // methodStart:selectCustPolPlnXref5

  /**
   * ***** SELECT PAY_LOC_1_NBR ***** ,STD_PLN_POL_NBR ***** ,STD_PLN_PLN_NBR *****
   * ,STD_PLN_CLSS_NBR ***** ,MML_COV_SET_NBR ***** ,LMT_SRVC_CD ***** INTO ***** :XRF-PAY-LOC-1-NBR
   * ***** ,:XRF-STD-PLN-POL-NBR ***** ,:XRF-STD-PLN-PLN-NBR ***** ,:XRF-STD-PLN-CLSS-NBR *****
   * ,:XRF-LMT-SRVC-CD ***** ,:XRF-MML-COV-SET-NBR ***** FROM CUST_POL_PLN_XREF ***** WHERE POL_NBR
   * = :XRF-POL-NBR AND ***** COV_TYP_CD = :XRF-COV-TYP-CD AND ***** PLN_NBR = :XRF-PLN-NBR AND
   * ***** CLSS_NBR = :XRF-CLSS-NBR AND ***** ((EFF_DT <=:XRF-EFF-DT AND ***** CANC_DT
   * >=:XRF-EFF-DT) OR ***** (EFF_DT <=:XRF-CANC-DT AND ***** CANC_DT >=:XRF-CANC-DT)) ***** ORDER
   * BY EFF_DT ASC ***** FETCH FIRST 1 ROWS ONLY
   */
  public void selectCustPolPlnXref5(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(48 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1877494853)
              .withInputs(
                  dclcustPolPlnXref.getXrfPolNbr(),
                  dclcustPolPlnXref.getXrfCovTypCd(),
                  dclcustPolPlnXref.getXrfPlnNbr(),
                  dclcustPolPlnXref.getXrfClssNbr(),
                  dclcustPolPlnXref.getXrfEffDt(),
                  dclcustPolPlnXref.getXrfEffDt(),
                  dclcustPolPlnXref.getXrfCancDt(),
                  dclcustPolPlnXref.getXrfCancDt())
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
          dclcustPolPlnXref.setXrfPayLoc1Nbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(2);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfStdPlnPolNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(3);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfStdPlnPlnNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(4);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfStdPlnClssNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(5);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfLmtSrvcCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(6);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfMmlCovSetNbr(resultObj.toString().toCharArray());
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
  // methodEnd:selectCustPolPlnXref5
  // methodStart:selectPolPlnMstr6

  /**
   * ***** SELECT SRVC_CATGY_TBL_ID ***** ,LFTM_MAX_AMT ***** ,NEW_COINS_PRD_CD *****
   * ,NEW_COINS_SAL_INDV_TYP_CD ***** ,NEW_COINS_AMT ***** ,PAY_LOC_CD ***** ,PCP_SPEC_COINS_IND
   * ***** ,SRVC_CD_N_SET_IND ***** ,SRVC_CD_P_SET_IND ***** ,SRVC_CD_T_SET_IND *****
   * ,BEN_MAX_COMB_PRI_CD ***** ,BEN_MAX_SPNE_MNIP_PRI_CD ***** ,BEN_MAX_PHYS_TRPY_PRI_CD *****
   * ,BEN_MAX_PH_OC_TRPY_PRI_CD ***** ,BEN_MAX_SPCH_TRPY_PRI_CD ***** ,BEN_MAX_OCP_TRPY_PRI_CD *****
   * ,BEN_MAX_PH_OC_SPCH_PRI_CD ***** ,BEN_MAX_CRDC_REHAB_PRI_CD ***** INTO :MMI-SRVC-CATGY-TBL-ID
   * ***** ,:MMI-LFTM-MAX-AMT ***** ,:MMI-NEW-COINS-PRD-CD ***** ,:MMI-NEW-COINS-SAL-INDV-TYP-CD
   * ***** ,:MMI-NEW-COINS-AMT ***** ,:MMI-PAY-LOC-CD ***** ,:MMI-PCP-SPEC-COINS-IND *****
   * ,:MMI-SRVC-CD-N-SET-IND ***** ,:MMI-SRVC-CD-P-SET-IND ***** ,:MMI-SRVC-CD-T-SET-IND *****
   * ,:MMI-BEN-MAX-COMB-PRI-CD ***** ,:MMI-BEN-MAX-SPNE-MNIP-PRI-CD *****
   * ,:MMI-BEN-MAX-PHYS-TRPY-PRI-CD ***** ,:MMI-BEN-MAX-PH-OC-TRPY-PRI-CD *****
   * ,:MMI-BEN-MAX-SPCH-TRPY-PRI-CD ***** ,:MMI-BEN-MAX-OCP-TRPY-PRI-CD *****
   * ,:MMI-BEN-MAX-PH-OC-SPCH-PRI-CD ***** ,:MMI-BEN-MAX-CRDC-REHAB-PRI-CD ***** FROM POL_PLN_MSTR
   * ***** WHERE COV_TYP_CD = :MMI-COV-TYP-CD ***** AND POL_NBR = :MMI-POL-NBR ***** AND PLN_NBR =
   * :MMI-PLN-NBR ***** AND CLSS_NBR = :MMI-CLSS-NBR
   */
  public void selectPolPlnMstr6(DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca) throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(49 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_814270242)
              .withInputs(
                  dclpolPlnMstr.getMmiCovTypCd(),
                  dclpolPlnMstr.getMmiPolNbr(),
                  dclpolPlnMstr.getMmiPlnNbr(),
                  dclpolPlnMstr.getMmiClssNbr())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
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
          dclpolPlnMstr.setMmiSrvcCatgyTblId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(2);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiLftmMaxAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiLftmMaxAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiLftmMaxAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiLftmMaxAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(3);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiNewCoinsPrdCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(4);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiNewCoinsSalIndvTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(5);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiNewCoinsAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiNewCoinsAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiNewCoinsAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiNewCoinsAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(6);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiPayLocCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(7);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiPcpSpecCoinsInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(8);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdNSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(9);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdPSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(10);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSrvcCdTSetInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(11);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxCombPriCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(12);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxSpneMnipPriCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(13);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxPhysTrpyPriCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(14);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxPhOcTrpyPriCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(15);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxSpchTrpyPriCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(16);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxOcpTrpyPriCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(17);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxPhOcSpchPriCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(18);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiBenMaxCrdcRehabPriCd(resultObj.toString().toCharArray());
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
  // methodEnd:selectPolPlnMstr6
  // methodStart:openCurFamDedCsrD5427pol

  /**
   * ***** DECLARE CUR-FAM-DED-CSR CURSOR FOR ***** SELECT ***** DED_CARO_CD ***** ,DED_MBR_DESC
   * ***** FROM POL_PLN_MSTR_FAM_DED ***** WHERE POL_NBR = :DFDE-POL-NBR ***** AND PLN_NBR =
   * :DFDE-PLN-NBR ***** AND CLSS_NBR = :DFDE-CLSS-NBR ***** AND COV_TYP_CD = :DFDE-COV-TYP-CD *****
   * FOR FETCH ONLY
   */
  public ResultSet openCurFamDedCsrD5427pol(DclpolPlnMstrFamDed dclpolPlnMstrFamDed, Sqlca sqlca)
      throws Exception {
    ResultSet curFamDedCsrResultSet = null;
    try {
      // OPEN CURSOR
      sqlca.setSqlcode(0);
      curFamDedCsrResultSet =
          db2Base
              .startQuery(18 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1518360634)
              .withInputs(
                  dclpolPlnMstrFamDed.getDfdePolNbr(),
                  dclpolPlnMstrFamDed.getDfdePlnNbr(),
                  dclpolPlnMstrFamDed.getDfdeClssNbr(),
                  dclpolPlnMstrFamDed.getDfdeCovTypCd())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
              .queryForList();
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }

    return curFamDedCsrResultSet;
  }
  // methodEnd:openCurFamDedCsrD5427pol
  // methodStart:fetchCurFamDedCsrD5427pol

  /** ***** FETCH CUR-FAM-DED-CSR ***** INTO ***** :DFDE-DED-CARO-CD ***** ,:DFDE-DED-MBR-DESC */
  public void fetchCurFamDedCsrD5427pol(
      ResultSet curFamDedCsrResultSet, DclpolPlnMstrFamDed dclpolPlnMstrFamDed, Sqlca sqlca)
      throws Exception {
    try {
      boolean hasResults = curFamDedCsrResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = curFamDedCsrResultSet.getObject(1);
        if (resultObj != null) {
          dclpolPlnMstrFamDed.setDfdeDedCaroCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curFamDedCsrResultSet.getObject(2);
        if (resultObj != null) {
          dclpolPlnMstrFamDed.setDfdeDedMbrDesc(resultObj.toString().toCharArray());
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
        logger.error("curFamDedCsrResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchCurFamDedCsrD5427pol
  // methodStart:closeCurFamDedCsrD5427pol

  /** ***** CLOSE CUR-FAM-DED-CSR */
  public void closeCurFamDedCsrD5427pol(ResultSet curFamDedCsrResultSet, Sqlca sqlca)
      throws Exception {

    closeCursor(curFamDedCsrResultSet, sqlca);
  }
  // methodEnd:closeCurFamDedCsrD5427pol
  // methodStart:openCurIndDedCsrD5427pol

  /**
   * ***** DECLARE CUR-IND-DED-CSR CURSOR FOR ***** SELECT DED_SRVC_DESC ***** ,DED_NTWK_TYP_CD
   * ***** ,DED_CARO_CD ***** FROM POL_PLN_MSTR_INDV_DED ***** WHERE COV_TYP_CD = :DIDE-COV-TYP-CD
   * ***** AND POL_NBR = :DIDE-POL-NBR ***** AND PLN_NBR = :DIDE-PLN-NBR ***** AND CLSS_NBR =
   * :DIDE-CLSS-NBR ***** FOR FETCH ONLY
   */
  public ResultSet openCurIndDedCsrD5427pol(Sqlca sqlca, DclpolPlnMstrIndvDed dclpolPlnMstrIndvDed)
      throws Exception {
    ResultSet curIndDedCsrResultSet = null;
    try {
      // OPEN CURSOR
      sqlca.setSqlcode(0);
      curIndDedCsrResultSet =
          db2Base
              .startQuery(17 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1190006976)
              .withInputs(
                  dclpolPlnMstrIndvDed.getDideCovTypCd(),
                  dclpolPlnMstrIndvDed.getDidePolNbr(),
                  dclpolPlnMstrIndvDed.getDidePlnNbr(),
                  dclpolPlnMstrIndvDed.getDideClssNbr())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
              .queryForList();
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }

    return curIndDedCsrResultSet;
  }
  // methodEnd:openCurIndDedCsrD5427pol
  // methodStart:fetchCurIndDedCsrD5427pol

  /**
   * ***** FETCH CUR-IND-DED-CSR ***** INTO ***** :DIDE-DED-SRVC-DESC ***** ,:DIDE-DED-NTWK-TYP-CD
   * ***** ,:DIDE-DED-CARO-CD
   */
  public void fetchCurIndDedCsrD5427pol(
      ResultSet curIndDedCsrResultSet, Sqlca sqlca, DclpolPlnMstrIndvDed dclpolPlnMstrIndvDed)
      throws Exception {
    try {
      boolean hasResults = curIndDedCsrResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = curIndDedCsrResultSet.getObject(1);
        if (resultObj != null) {
          dclpolPlnMstrIndvDed.setDideDedSrvcDesc(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curIndDedCsrResultSet.getObject(2);
        if (resultObj != null) {
          dclpolPlnMstrIndvDed.setDideDedNtwkTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = curIndDedCsrResultSet.getObject(3);
        if (resultObj != null) {
          dclpolPlnMstrIndvDed.setDideDedCaroCd(resultObj.toString().toCharArray());
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
        logger.error("curIndDedCsrResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchCurIndDedCsrD5427pol
  // methodStart:closeCurIndDedCsrD5427pol

  /** ***** CLOSE CUR-IND-DED-CSR */
  public void closeCurIndDedCsrD5427pol(ResultSet curIndDedCsrResultSet, Sqlca sqlca)
      throws Exception {

    closeCursor(curIndDedCsrResultSet, sqlca);
  }
  // methodEnd:closeCurIndDedCsrD5427pol
  // methodStart:selectCustPolPlnXref6

  /**
   * ***** SELECT MNNRP_CD ***** ,MNNRP_PCT ***** ,UH_PREM_DESG_CD ***** ,PRORT_EVNT *****
   * ,PRDCT_PLN_CLSS_CD ***** ,PLN_DED_PRORT_IND ***** ,EFF_DT ***** ,CANC_DT ***** ,OBLIG_ID *****
   * ,SHR_ARNG_CD ***** INTO ***** :XRF-MNNRP-CD ***** ,:XRF-MNNRP-PCT ***** ,:XRF-UH-PREM-DESG-CD
   * ***** ,:XRF-PRORT-EVNT ***** ,:XRF-PRDCT-PLN-CLSS-CD ***** ,:XRF-PLN-DED-PRORT-IND *****
   * ,:XRF-EFF-DT ***** ,:XRF-CANC-DT ***** ,:XRF-OBLIG-ID ***** ,:XRF-SHR-ARNG-CD ***** FROM
   * CUST_POL_PLN_XREF ***** WHERE POL_NBR = :XRF-POL-NBR AND ***** COV_TYP_CD = :XRF-COV-TYP-CD AND
   * ***** PLN_NBR = :XRF-PLN-NBR AND ***** CLSS_NBR = :XRF-CLSS-NBR AND ***** ((EFF_DT
   * <=:XRF-EFF-DT AND ***** CANC_DT >=:XRF-EFF-DT) OR ***** (EFF_DT <=:XRF-CANC-DT AND *****
   * CANC_DT >=:XRF-CANC-DT)) ***** ORDER BY EFF_DT ***** FETCH FIRST 1 ROWS ONLY
   */
  public void selectCustPolPlnXref6(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(56 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1091792495)
              .withInputs(
                  dclcustPolPlnXref.getXrfPolNbr(),
                  dclcustPolPlnXref.getXrfCovTypCd(),
                  dclcustPolPlnXref.getXrfPlnNbr(),
                  dclcustPolPlnXref.getXrfClssNbr(),
                  dclcustPolPlnXref.getXrfEffDt(),
                  dclcustPolPlnXref.getXrfEffDt(),
                  dclcustPolPlnXref.getXrfCancDt(),
                  dclcustPolPlnXref.getXrfCancDt())
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
          dclcustPolPlnXref.setXrfMnnrpCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(2);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfMnnrpPct((Db2Base.castToBigDecimal(resultObj)).shortValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(3);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfUhPremDesgCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(4);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfPrortEvnt(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(5);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfPrdctPlnClssCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(6);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfPlnDedPrortInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = resultSet.getString(7);
        if (resultObjString != null) {
          dclcustPolPlnXref.setXrfEffDt(resultObjString.toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObjString = resultSet.getString(8);
        if (resultObjString != null) {
          dclcustPolPlnXref.setXrfCancDt(resultObjString.toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(9);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfObligId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(10);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfShrArngCd(resultObj.toString().toCharArray());
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
  // methodEnd:selectCustPolPlnXref6
  // methodStart:selectPolPlnMstr7

  /**
   * ***** SELECT ***** MNRP_CD ***** ,MNRP_PCT ***** ,NON_EMBD_DED_CD ***** ,UHP_CD *****
   * ,PRORT_EVNT_TYP_CD ***** ,MBR_NTWK_KEY_MTCH_CD ***** ,LFTM_MAX_AMT ***** ,TIER_1_LFTM_MAX_AMT
   * ***** ,OOP_COMB_NBR_CD ***** ,PSY_LFTM_CNFM_MAX_AMT ***** ,PSY_LFTM_NON_CNFM_MAX_AMT *****
   * ,PSY_LFTM_COMB_PRSC_MAX_AMT ***** ,PSY_CYR_CNFM_MAX_AMT ***** ,PSY_CYR_NON_CNFM_MAX_AMT *****
   * ,PSY_CYR_COMB_PRSC_MAX_AMT ***** ,DSES_ST_TBL_NBR ***** ,HI_DED_PLN_CD *****
   * ,PRORT_INTRVL_FREQ_CD ***** ,RCPRCTY_TBL_ID ***** ,OOP_MAX_COV_CD ***** ,PLN_FTUR_IND *****
   * ,OON_LFTM_MAX_AMT ***** ,POL.OBLIG_ID ***** ,SHR_ARNG_CD ***** ,NHP_NTWK_FLEX_IND *****
   * ,NPT_RULE_PKG_ID ***** ,POL.PRDCT_KEY_CD ***** ,PREF_LAB_NTWK_IND ***** ,CONTR_ST_CD *****
   * ,FUND_TYP_CD ***** ,FACL_SHR_SV_CD ***** ,PHYSN_SHR_SV_CD ***** ,PHRM_CPN_IND *****
   * ,DESG_DIAG_PROV_CD ***** ,MED_CPN_CD ***** INTO ***** :MMI-MNRP-CD ***** ,:MMI-MNRP-PCT *****
   * ,:MMI-NON-EMBD-DED-CD ***** ,:MMI-UHP-CD ***** ,:MMI-PRORT-EVNT-TYP-CD *****
   * ,:MMI-MBR-NTWK-KEY-MTCH-CD ***** ,:MMI-LFTM-MAX-AMT ***** ,:MMI-TIER-1-LFTM-MAX-AMT *****
   * ,:MMI-OOP-COMB-NBR-CD ***** ,:MMI-PSY-LFTM-CNFM-MAX-AMT ***** ,:MMI-PSY-LFTM-NON-CNFM-MAX-AMT
   * ***** ,:MMI-PSY-LFTM-COMB-PRSC-MAX-AMT ***** ,:MMI-PSY-CYR-CNFM-MAX-AMT *****
   * ,:MMI-PSY-CYR-NON-CNFM-MAX-AMT ***** ,:MMI-PSY-CYR-COMB-PRSC-MAX-AMT *****
   * ,:MMI-DSES-ST-TBL-NBR ***** ,:MMI-HI-DED-PLN-CD ***** ,:MMI-PRORT-INTRVL-FREQ-CD *****
   * ,:MMI-RCPRCTY-TBL-ID ***** ,:MMI-OOP-MAX-COV-CD ***** ,:MMI-PLN-FTUR-IND *****
   * ,:MMI-OON-LFTM-MAX-AMT ***** ,:MMI-OBLIG-ID ***** ,:MMI-SHR-ARNG-CD *****
   * ,:MMA-NHP-NTWK-FLEX-IND ***** ,:MMA-NPT-RULE-PKG-ID ***** ,:MMI-PRDCT-KEY-CD *****
   * ,:MMA-PREF-LAB-NTWK-IND ***** ,:MMI-CONTR-ST-CD ***** ,:MMI-FUND-TYP-CD *****
   * ,:MMI-FACL-SHR-SV-CD ***** ,:MMI-PHYSN-SHR-SV-CD ***** ,:MMA-PHRM-CPN-IND *****
   * ,:MMA-DESG-DIAG-PROV-CD ***** ,:MMA-MED-CPN-CD ***** FROM POL_PLN_MSTR POL *****
   * ,POL_PLN_MSTR_ADDTL_INFO POLA ***** WHERE POL.POL_NBR = :MMI-POL-NBR ***** AND POL.PLN_NBR =
   * :MMI-PLN-NBR ***** AND POL.CLSS_NBR = :MMI-CLSS-NBR ***** AND POL.COV_TYP_CD = :MMI-COV-TYP-CD
   * ***** AND POLA.POL_NBR = POL.POL_NBR ***** AND POLA.PLN_NBR = POL.PLN_NBR ***** AND
   * POLA.CLSS_NBR = POL.CLSS_NBR ***** AND POLA.COV_TYP_CD = POL.COV_TYP_CD
   */
  public void selectPolPlnMstr7(
      DclpolPlnMstrAddtlInfo dclpolPlnMstrAddtlInfo, DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(57 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1624902238)
              .withInputs(
                  dclpolPlnMstr.getMmiPolNbr(),
                  dclpolPlnMstr.getMmiPlnNbr(),
                  dclpolPlnMstr.getMmiClssNbr(),
                  dclpolPlnMstr.getMmiCovTypCd())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
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
          dclpolPlnMstr.setMmiMnrpCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(2);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiMnrpPct((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(3);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiNonEmbdDedCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(4);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiUhpCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(5);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiPrortEvntTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(6);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiMbrNtwkKeyMtchCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(7);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiLftmMaxAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiLftmMaxAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiLftmMaxAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiLftmMaxAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(8);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiTier1LftmMaxAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiTier1LftmMaxAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiTier1LftmMaxAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiTier1LftmMaxAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(9);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiOopCombNbrCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(10);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiPsyLftmCnfmMaxAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyLftmCnfmMaxAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyLftmCnfmMaxAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyLftmCnfmMaxAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(11);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiPsyLftmNonCnfmMaxAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyLftmNonCnfmMaxAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyLftmNonCnfmMaxAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyLftmNonCnfmMaxAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(12);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiPsyLftmCombPrscMaxAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyLftmCombPrscMaxAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyLftmCombPrscMaxAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyLftmCombPrscMaxAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(13);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiPsyCyrCnfmMaxAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyCyrCnfmMaxAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyCyrCnfmMaxAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyCyrCnfmMaxAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(14);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiPsyCyrNonCnfmMaxAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyCyrNonCnfmMaxAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyCyrNonCnfmMaxAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyCyrNonCnfmMaxAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(15);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiPsyCyrCombPrscMaxAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyCyrCombPrscMaxAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyCyrCombPrscMaxAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiPsyCyrCombPrscMaxAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(16);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiDsesStTblNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(17);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiHiDedPlnCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(18);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiPrortIntrvlFreqCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(19);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiRcprctyTblId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(20);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiOopMaxCovCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(21);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiPlnFturInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(22);
        if (resultObj != null) {
          try {
            dclpolPlnMstr.setMmiOonLftmMaxAmt(((Integer) resultObj).intValue());
          } catch (java.lang.ClassCastException cce) {
            if (BigDecimal.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOonLftmMaxAmt(((BigDecimal) resultObj).intValue());
            else if (Float.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOonLftmMaxAmt(((Float) resultObj).intValue());
            else if (Double.class.isInstance(resultObj))
              dclpolPlnMstr.setMmiOonLftmMaxAmt(((Double) resultObj).intValue());
          }
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(23);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiObligId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(24);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiShrArngCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(25);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaNhpNtwkFlexInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(26);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaNptRulePkgId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(27);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiPrdctKeyCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(28);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaPrefLabNtwkInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(29);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiContrStCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(30);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiFundTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(31);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiFaclShrSvCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(32);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiPhysnShrSvCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(33);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaPhrmCpnInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(34);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaDesgDiagProvCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(35);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaMedCpnCd(resultObj.toString().toCharArray());
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
  // methodEnd:selectPolPlnMstr7
  // methodStart:selectNtwkRcprctyDtl1

  /**
   * ***** SELECT ***** PREF_CD ***** INTO :DTL-PREF-CD ***** FROM NTWK_RCPRCTY_DTL A ***** WHERE
   * RCPRCTY_TBL_ID = :MMI-RCPRCTY-TBL-ID ***** AND PREF_CD > ' ' ***** FETCH FIRST 1 ROWS ONLY
   */
  public void selectNtwkRcprctyDtl1(
      DclpolPlnMstr dclpolPlnMstr, DclntwkRcprctyDtl dclntwkRcprctyDtl, Sqlca sqlca)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(58 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1713950648_1)
              .withInputs(dclpolPlnMstr.getMmiRcprctyTblId())
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
          dclntwkRcprctyDtl.setDtlPrefCd(resultObj.toString().toCharArray());
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
  // methodEnd:selectNtwkRcprctyDtl1
  // methodStart:selectNtwkRcprctyDtl2

  /**
   * ***** SELECT ***** PREF_CD ***** ,RVRS_TIER_IND ***** INTO :DTL-PREF-CD *****
   * ,:DTL-RVRS-TIER-IND ***** FROM NTWK_RCPRCTY_DTL A ***** WHERE RCPRCTY_TBL_ID =
   * :MMI-RCPRCTY-TBL-ID ***** AND PREF_CD > ' ' ***** AND RVRS_TIER_IND = 'Y' ***** FETCH FIRST 1
   * ROWS ONLY
   */
  public void selectNtwkRcprctyDtl2(
      DclpolPlnMstr dclpolPlnMstr, DclntwkRcprctyDtl dclntwkRcprctyDtl, Sqlca sqlca)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(59 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_928393851)
              .withInputs(dclpolPlnMstr.getMmiRcprctyTblId())
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
          dclntwkRcprctyDtl.setDtlPrefCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(2);
        if (resultObj != null) {
          dclntwkRcprctyDtl.setDtlRvrsTierInd(resultObj.toString().toCharArray());
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
  // methodEnd:selectNtwkRcprctyDtl2
  // methodStart:selectNtwkRcprctyDtl3

  /**
   * ***** SELECT ***** PREF_CD ***** INTO :DTL-PREF-CD ***** FROM NTWK_RCPRCTY_DTL A ***** WHERE
   * RCPRCTY_TBL_ID = :MMI-RCPRCTY-TBL-ID ***** AND PREF_CD IN ('P','M','T','X') ***** FETCH FIRST 1
   * ROWS ONLY
   */
  public void selectNtwkRcprctyDtl3(
      DclpolPlnMstr dclpolPlnMstr, DclntwkRcprctyDtl dclntwkRcprctyDtl, Sqlca sqlca)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(60 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_974685605)
              .withInputs(dclpolPlnMstr.getMmiRcprctyTblId())
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
          dclntwkRcprctyDtl.setDtlPrefCd(resultObj.toString().toCharArray());
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
  // methodEnd:selectNtwkRcprctyDtl3
  // methodStart:selectNtwkRcprctyDtl4

  /**
   * ***** SELECT MKT_TYP_CD ***** INTO :DTL-MKT-TYP-CD ***** FROM NTWK_RCPRCTY_DTL ***** WHERE
   * RCPRCTY_TBL_ID = :MMI-RCPRCTY-TBL-ID ***** FETCH FIRST 1 ROWS ONLY
   */
  public void selectNtwkRcprctyDtl4(
      DclpolPlnMstr dclpolPlnMstr, DclntwkRcprctyDtl dclntwkRcprctyDtl, Sqlca sqlca)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(61 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_255929060)
              .withInputs(dclpolPlnMstr.getMmiRcprctyTblId())
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
          dclntwkRcprctyDtl.setDtlMktTypCd(resultObj.toString().toCharArray());
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
  // methodEnd:selectNtwkRcprctyDtl4
  // methodStart:selectNtwkRcprctyDtl5

  /**
   * ***** SELECT ***** MKT_TYP_CD ***** INTO :DTL-MKT-TYP-CD ***** FROM NTWK_RCPRCTY_DTL *****
   * WHERE RCPRCTY_TBL_ID = :MMI-RCPRCTY-TBL-ID ***** AND MKT_TYP_CD IN ('23') ***** FETCH FIRST 1
   * ROWS ONLY
   */
  public void selectNtwkRcprctyDtl5(
      DclpolPlnMstr dclpolPlnMstr, DclntwkRcprctyDtl dclntwkRcprctyDtl, Sqlca sqlca)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(62 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1364091382)
              .withInputs(dclpolPlnMstr.getMmiRcprctyTblId())
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
          dclntwkRcprctyDtl.setDtlMktTypCd(resultObj.toString().toCharArray());
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
  // methodEnd:selectNtwkRcprctyDtl5
  // methodStart:selectNtwkRcprctyDtl6

  /**
   * ***** SELECT ***** MKT_TYP_CD ***** INTO :DTL-MKT-TYP-CD ***** FROM NTWK_RCPRCTY_DTL *****
   * WHERE RCPRCTY_TBL_ID = :MMI-RCPRCTY-TBL-ID ***** AND MKT_TYP_CD IN ('15','37','69' *****
   * ,'71','72','73','74','75','89','90','91','92') ***** FETCH FIRST 1 ROWS ONLY
   */
  public void selectNtwkRcprctyDtl6(
      DclpolPlnMstr dclpolPlnMstr, DclntwkRcprctyDtl dclntwkRcprctyDtl, Sqlca sqlca)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(63 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1879174647)
              .withInputs(dclpolPlnMstr.getMmiRcprctyTblId())
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
          dclntwkRcprctyDtl.setDtlMktTypCd(resultObj.toString().toCharArray());
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
  // methodEnd:selectNtwkRcprctyDtl6
  // methodStart:openTherapyCsrD5427pol

  /**
   * ***** DECLARE THERAPY-CSR CURSOR FOR ***** SELECT TRPY_TYP_CD ***** ,TRPY_CTGY_CD *****
   * ,TRPY_BEN_LMT_PAR_CNT ***** ,NTWK_STS_PAR_CD ***** ,TRPY_BEN_LMT_NPAR_CNT *****
   * ,NTWK_STS_NPAR_CD ***** FROM POL_PLN_MSTR T1 ***** ,POL_PLN_MSTR_ADDTL_INFO T2 *****
   * ,POL_PLN_MSTR_PHYS_MEDCN T3 ***** WHERE T1.COV_TYP_CD = :MMI-COV-TYP-CD ***** AND T1.POL_NBR =
   * :MMI-POL-NBR ***** AND T1.PLN_NBR = :MMI-PLN-NBR ***** AND T1.CLSS_NBR = :MMI-CLSS-NBR *****
   * AND T1.COV_TYP_CD = T2.COV_TYP_CD ***** AND T1.POL_NBR = T2.POL_NBR ***** AND T1.PLN_NBR =
   * T2.PLN_NBR ***** AND T1.CLSS_NBR = T2.CLSS_NBR ***** AND T1.COV_TYP_CD = T3.COV_TYP_CD *****
   * AND T1.POL_NBR = T3.POL_NBR ***** AND T1.PLN_NBR = T3.PLN_NBR ***** AND T1.CLSS_NBR =
   * T3.CLSS_NBR ***** FOR FETCH ONLY
   */
  public ResultSet openTherapyCsrD5427pol(DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca)
      throws Exception {
    ResultSet therapyCsrResultSet = null;
    try {
      // OPEN CURSOR
      sqlca.setSqlcode(0);
      therapyCsrResultSet =
          db2Base
              .startQuery(20 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1796892999)
              .withInputs(
                  dclpolPlnMstr.getMmiCovTypCd(),
                  dclpolPlnMstr.getMmiPolNbr(),
                  dclpolPlnMstr.getMmiPlnNbr(),
                  dclpolPlnMstr.getMmiClssNbr())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
              .queryForList();
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }

    return therapyCsrResultSet;
  }
  // methodEnd:openTherapyCsrD5427pol
  // methodStart:fetchTherapyCsrD5427pol

  /**
   * ***** FETCH THERAPY-CSR ***** INTO :DCPM-TRPY-TYP-CD ***** ,:DCPM-TRPY-CTGY-CD *****
   * ,:DCPM-TRPY-BEN-LMT-PAR-CNT ***** ,:DCPM-NTWK-STS-PAR-CD ***** ,:DCPM-TRPY-BEN-LMT-NPAR-CNT
   * ***** ,:DCPM-NTWK-STS-NPAR-CD
   */
  public void fetchTherapyCsrD5427pol(
      ResultSet therapyCsrResultSet, Sqlca sqlca, DclpolPlnMstrPhysMedcn dclpolPlnMstrPhysMedcn)
      throws Exception {
    try {
      boolean hasResults = therapyCsrResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = therapyCsrResultSet.getObject(1);
        if (resultObj != null) {
          dclpolPlnMstrPhysMedcn.setDcpmTrpyTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = therapyCsrResultSet.getObject(2);
        if (resultObj != null) {
          dclpolPlnMstrPhysMedcn.setDcpmTrpyCtgyCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = therapyCsrResultSet.getObject(3);
        if (resultObj != null) {
          dclpolPlnMstrPhysMedcn.setDcpmTrpyBenLmtParCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = therapyCsrResultSet.getObject(4);
        if (resultObj != null) {
          dclpolPlnMstrPhysMedcn.setDcpmNtwkStsParCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = therapyCsrResultSet.getObject(5);
        if (resultObj != null) {
          dclpolPlnMstrPhysMedcn.setDcpmTrpyBenLmtNparCnt((short) ((Integer) resultObj).intValue());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = therapyCsrResultSet.getObject(6);
        if (resultObj != null) {
          dclpolPlnMstrPhysMedcn.setDcpmNtwkStsNparCd(resultObj.toString().toCharArray());
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
        logger.error("therapyCsrResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchTherapyCsrD5427pol
  // methodStart:closeTherapyCsrD5427pol

  /** ***** CLOSE THERAPY-CSR */
  public void closeTherapyCsrD5427pol(ResultSet therapyCsrResultSet, Sqlca sqlca) throws Exception {

    closeCursor(therapyCsrResultSet, sqlca);
  }
  // methodEnd:closeTherapyCsrD5427pol
  // methodStart:selectPolPlnDenorm

  /**
   * ***** SELECT 'Y' ***** INTO :WS-POLICY-IND ***** FROM POL_PLN_DENORM ***** WHERE (POL_NBR =
   * :WS-POLICY-NBR) ***** FETCH FIRST ROW ONLY
   */
  public void selectPolPlnDenorm(WorkVariables workVariables, Sqlca sqlca) throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(67 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1344793473)
              .withInputs(workVariables.getPolicyNbr())
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
          workVariables.setPolicyInd(resultObj.toString().toCharArray());
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
  // methodEnd:selectPolPlnDenorm
  // methodStart:selectCustPolPlnXref7

  /**
   * ***** SELECT LGL_ENTY_CD ***** INTO :XRF-LGL-ENTY-CD ***** FROM CUST_POL_PLN_XREF ***** WHERE
   * POL_NBR = :XRF-POL-NBR AND ***** COV_TYP_CD = :XRF-COV-TYP-CD AND ***** PLN_NBR = :XRF-PLN-NBR
   * AND ***** CLSS_NBR = :XRF-CLSS-NBR AND ***** ((EFF_DT <=:XRF-EFF-DT AND ***** CANC_DT
   * >=:XRF-EFF-DT) OR ***** (EFF_DT <=:XRF-CANC-DT AND ***** CANC_DT >=:XRF-CANC-DT)) ***** ORDER
   * BY EFF_DT ASC ***** FETCH FIRST 1 ROW ONLY
   */
  public void selectCustPolPlnXref7(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(68 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_807978841)
              .withInputs(
                  dclcustPolPlnXref.getXrfPolNbr(),
                  dclcustPolPlnXref.getXrfCovTypCd(),
                  dclcustPolPlnXref.getXrfPlnNbr(),
                  dclcustPolPlnXref.getXrfClssNbr(),
                  dclcustPolPlnXref.getXrfEffDt(),
                  dclcustPolPlnXref.getXrfEffDt(),
                  dclcustPolPlnXref.getXrfCancDt(),
                  dclcustPolPlnXref.getXrfCancDt())
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
          dclcustPolPlnXref.setXrfLglEntyCd(resultObj.toString().toCharArray());
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
  // methodEnd:selectCustPolPlnXref7
  // methodStart:selectPolPlnMstr8

  /**
   * ***** SELECT T1.FUND_TYP_CD ***** ,T2.RISK_CLS_CD ***** INTO :MMI-FUND-TYP-CD *****
   * ,:MMA-RISK-CLS-CD ***** FROM POL_PLN_MSTR T1 ***** ,POL_PLN_MSTR_ADDTL_INFO T2 ***** WHERE
   * T1.POL_NBR = :MMI-POL-NBR ***** AND T1.PLN_NBR = :MMI-PLN-NBR ***** AND T1.CLSS_NBR =
   * :MMI-CLSS-NBR ***** AND T1.COV_TYP_CD = :MMI-COV-TYP-CD ***** AND T1.POL_NBR = T2.POL_NBR *****
   * AND T1.PLN_NBR = T2.PLN_NBR ***** AND T1.CLSS_NBR = T2.CLSS_NBR ***** AND T1.COV_TYP_CD =
   * T2.COV_TYP_CD
   */
  public void selectPolPlnMstr8(
      DclpolPlnMstrAddtlInfo dclpolPlnMstrAddtlInfo, DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(69 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1809727975)
              .withInputs(
                  dclpolPlnMstr.getMmiPolNbr(),
                  dclpolPlnMstr.getMmiPlnNbr(),
                  dclpolPlnMstr.getMmiClssNbr(),
                  dclpolPlnMstr.getMmiCovTypCd())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
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
          dclpolPlnMstr.setMmiFundTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(2);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaRiskClsCd(resultObj.toString().toCharArray());
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
  // methodEnd:selectPolPlnMstr8
  // methodStart:selectCustPolPlnXref8

  /**
   * ***** SELECT PAY_LOC_1_NBR ***** ,PAY_LOC_2_NBR ***** ,STD_PLN_PLN_NBR ***** ,STD_PLN_CLSS_NBR
   * ***** INTO ***** :XRF-PAY-LOC-1-NBR ***** ,:XRF-PAY-LOC-2-NBR ***** ,:XRF-STD-PLN-POL-NBR *****
   * ,:XRF-STD-PLN-PLN-NBR ***** ,:XRF-STD-PLN-CLSS-NBR ***** FROM CUST_POL_PLN_XREF ***** WHERE
   * POL_NBR = :XRF-POL-NBR AND ***** COV_TYP_CD = :XRF-COV-TYP-CD AND ***** PLN_NBR = :XRF-PLN-NBR
   * AND ***** CLSS_NBR = :XRF-CLSS-NBR AND ***** ((EFF_DT <=:XRF-EFF-DT AND ***** CANC_DT
   * >=:XRF-EFF-DT) OR ***** (EFF_DT <=:XRF-CANC-DT AND ***** CANC_DT >=:XRF-CANC-DT)) ***** ORDER
   * BY EFF_DT ASC ***** FETCH FIRST 1 ROWS ONLY
   */
  public void selectCustPolPlnXref8(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(70 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_541657718)
              .withInputs(
                  dclcustPolPlnXref.getXrfPolNbr(),
                  dclcustPolPlnXref.getXrfCovTypCd(),
                  dclcustPolPlnXref.getXrfPlnNbr(),
                  dclcustPolPlnXref.getXrfClssNbr(),
                  dclcustPolPlnXref.getXrfEffDt(),
                  dclcustPolPlnXref.getXrfEffDt(),
                  dclcustPolPlnXref.getXrfCancDt(),
                  dclcustPolPlnXref.getXrfCancDt())
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
          dclcustPolPlnXref.setXrfPayLoc1Nbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(2);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfPayLoc2Nbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(3);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfStdPlnPolNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(4);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfStdPlnPlnNbr(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(5);
        if (resultObj != null) {
          dclcustPolPlnXref.setXrfStdPlnClssNbr(resultObj.toString().toCharArray());
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
  // methodEnd:selectCustPolPlnXref8
  // methodStart:selectPolPlnMstr9

  /**
   * ***** SELECT T1.EVD_BAS_DIALG_IND ***** ,T1.NTFY_CRDC_EP_IND ***** ,T1.ONC_POL_PRTCP_CD *****
   * ,T1.SITE_SRVC_PRTCP_CD ***** ,T1.CONTR_ST_CD ***** ,T1.FUND_TYP_CD ***** ,T1.ERISA_IND *****
   * ,T2.SITE_CARE_PROC_CD ***** ,T2.GEN_TST_POL_PRTCP_CD ***** ,T2.SPCL_RX_IND ***** INTO
   * :MMI-EVD-BAS-DIALG-IND ***** ,:MMI-NTFY-CRDC-EP-IND ***** ,:MMI-ONC-POL-PRTCP-CD *****
   * ,:MMI-SITE-SRVC-PRTCP-CD ***** ,:MMI-CONTR-ST-CD ***** ,:MMI-FUND-TYP-CD ***** ,:MMI-ERISA-IND
   * ***** ,:MMA-SITE-CARE-PROC-CD ***** ,:MMA-GEN-TST-POL-PRTCP-CD ***** ,:MMA-SPCL-RX-IND *****
   * FROM POL_PLN_MSTR T1 ***** ,POL_PLN_MSTR_ADDTL_INFO T2 ***** WHERE T1.POL_NBR = :MMI-POL-NBR
   * ***** AND T1.PLN_NBR = :MMI-PLN-NBR ***** AND T1.CLSS_NBR = :MMI-CLSS-NBR ***** AND
   * T1.COV_TYP_CD = :MMI-COV-TYP-CD ***** AND T1.POL_NBR = T2.POL_NBR ***** AND T1.PLN_NBR =
   * T2.PLN_NBR ***** AND T1.CLSS_NBR = T2.CLSS_NBR ***** AND T1.COV_TYP_CD = T2.COV_TYP_CD
   */
  public void selectPolPlnMstr9(
      DclpolPlnMstrAddtlInfo dclpolPlnMstrAddtlInfo, DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca)
      throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(71 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427POL)
              .withSql(SQLS.SQL_1350972904)
              .withInputs(
                  dclpolPlnMstr.getMmiPolNbr(),
                  dclpolPlnMstr.getMmiPlnNbr(),
                  dclpolPlnMstr.getMmiClssNbr(),
                  dclpolPlnMstr.getMmiCovTypCd())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
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
          dclpolPlnMstr.setMmiEvdBasDialgInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(2);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiNtfyCrdcEpInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(3);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiOncPolPrtcpCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(4);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiSiteSrvcPrtcpCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(5);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiContrStCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(6);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiFundTypCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(7);
        if (resultObj != null) {
          dclpolPlnMstr.setMmiErisaInd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(8);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaSiteCareProcCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(9);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaGenTstPolPrtcpCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = resultSet.getObject(10);
        if (resultObj != null) {
          dclpolPlnMstrAddtlInfo.setMmaSpclRxInd(resultObj.toString().toCharArray());
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
  // methodEnd:selectPolPlnMstr9
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
