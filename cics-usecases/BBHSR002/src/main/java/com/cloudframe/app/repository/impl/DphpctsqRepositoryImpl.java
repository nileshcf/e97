package com.cloudframe.app.repository.impl;

import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.dao.CfSqlca;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.dao.SqlBase;
import com.cloudframe.app.dto.dphpctsq.*;
import com.cloudframe.app.repository.DphpctsqRepository;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("dphpctsqRepository")
public class DphpctsqRepositoryImpl implements DphpctsqRepository {
  Logger logger = LoggerFactory.getLogger(DphpctsqRepositoryImpl.class);

  // declare:start
  int sqlFetchCounter = 0;
  // declare:end

  @Autowired
  @Qualifier("db2Base")
  SqlBase<char[]> db2Base;

  // methodStart:openC1Dphpctsq

  /**
   * ***** DECLARE C1 CURSOR ***** WITH ROWSET POSITIONING FOR ***** WITH CTEA AS ***** (SELECT
   * INTEGER(1) AS QUERY_TYP, HIPAA_VER_NBR ***** ,SUBSTR(' ',1,2) AS SORT_COL1 ***** ,HIPAA_CD
   * ***** ,GRNRC_RQST_CD ***** ,HIPAA_GRP_CD ***** ,INTEGER(1) AS DATA_TYP ***** FROM HIPAA_PROC_CD
   * A ***** UNION ALL ***** SELECT INTEGER(1) AS QUERY_TYP, HIPAA_VER_NBR ***** ,SUBSTR(' ',1,2) AS
   * SORT_COL1 ***** ,HIPAA_CD ***** ,GRNRC_RQST_CD ***** ,HIPAA_GRP_CD ***** ,INTEGER(2) AS
   * DATA_TYP ***** FROM HIPAA_PROC_CD A ***** WHERE NOT EXISTS (SELECT 1 ***** FROM HIPAA_PROC_CD B
   * ***** WHERE A.HIPAA_CD = B.HIPAA_GRP_CD ***** FETCH FIRST 1 ROWS ONLY) ***** UNION ALL *****
   * SELECT INTEGER(1) AS QUERY_TYP, HIPAA_VER_NBR ***** ,SUBSTR(' ',1,2) AS SORT_COL1 *****
   * ,HIPAA_CD ***** ,GRNRC_RQST_CD ***** ,HIPAA_GRP_CD ***** ,INTEGER(3) AS DATA_TYP ***** FROM
   * HIPAA_PROC_CD ***** WHERE GRNRC_RQST_CD IN('S','G') ***** UNION ALL ***** SELECT INTEGER(2) AS
   * QUERY_TYP, HIPAA_VER_NBR ***** ,HIPAA_GRP_CD AS SORT_COL1 ***** ,HIPAA_CD ***** ,GRNRC_RQST_CD
   * ***** ,HIPAA_GRP_CD ***** ,INTEGER(0) AS DATA_TYP ***** FROM HIPAA_PROC_CD ***** UNION ALL
   * ***** SELECT INTEGER(3) AS QUERY_TYP, HIPAA_VER_NBR ***** ,HIPAA_CD AS SORT_COL1 *****
   * ,HIPAA_CD ***** ,GRNRC_RQST_CD ***** ,HIPAA_GRP_CD ***** ,INTEGER(0) AS DATA_TYP ***** FROM
   * HIPAA_PROC_CD ***** ), KEY AS ***** (SELECT COUNT(DISTINCT QUERY_TYP||HIPAA_VER_NBR|| *****
   * SORT_COL1) AS CNT ***** FROM CTEA ***** ), DATA AS ***** (SELECT COUNT(1) AS CNT ***** FROM
   * CTEA ***** ) ***** SELECT QUERY_TYP, HIPAA_VER_NBR, SORT_COL1 ***** ,HIPAA_CD, GRNRC_RQST_CD,
   * HIPAA_GRP_CD ***** ,DATA_TYP, KEY.CNT, DATA.CNT ***** FROM CTEA, KEY, DATA ***** ORDER BY 1, 2,
   * 3, 4, 5 ***** FOR FETCH ONLY ***** WITH UR
   */
  public ResultSet openC1Dphpctsq(Sqlca sqlca) throws Exception {
    ResultSet c1ResultSet = null;
    try {
      // OPEN CURSOR
      sqlca.setSqlcode(0);
      c1ResultSet =
          db2Base
              .startQuery(1 /* SQL Sequence*/, CONSTANTS.LITERAL_DPHPCTSQ)
              .withSql(SQLS.SQL_2068596369)
              .queryForList();
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }

    return c1ResultSet;
  }
  // methodEnd:openC1Dphpctsq
  // methodStart:fetchC1Dphpctsq

  /**
   * ***** FETCH NEXT ROWSET FROM C1 FOR 100 ROWS ***** INTO :HV-QUERY-TYP ***** ,:HV-HIPAA-VER-NBR
   * ***** ,:HV-SORT-COL1 ***** ,:HV-HIPAA-CD ***** ,:HV-GRNRC-RQST-CD ***** ,:HV-HIPAA-GRP-CD *****
   * ,:HV-DATA-TYP ***** ,:HV-KEY-CNT ***** ,:HV-DATA-CNT
   */
  public void fetchC1Dphpctsq(ResultSet c1ResultSet, HostVarArrayArea hostVarArrayArea, Sqlca sqlca)
      throws Exception {
    try {
      boolean hasResults = true;
      sqlca.setSqlcode(0);
      int ftchRowCnt = 0;
      while (hasResults && ftchRowCnt < 100) {
        hasResults = c1ResultSet.next();
        if (hasResults) {
          // Extract values from the result set
          Object resultObj;
          String resultObjString = null;
          char[] value;
          resultObj = c1ResultSet.getObject(1);
          if (resultObj != null) {
            try {
              hostVarArrayArea.setHvQueryTyp(ftchRowCnt, ((Integer) resultObj).intValue());
            } catch (java.lang.ClassCastException cce) {
              if (BigDecimal.class.isInstance(resultObj))
                hostVarArrayArea.setHvQueryTyp(ftchRowCnt, ((BigDecimal) resultObj).intValue());
              else if (Float.class.isInstance(resultObj))
                hostVarArrayArea.setHvQueryTyp(ftchRowCnt, ((Float) resultObj).intValue());
              else if (Double.class.isInstance(resultObj))
                hostVarArrayArea.setHvQueryTyp(ftchRowCnt, ((Double) resultObj).intValue());
            }
          } else {
            sqlca.setSqlcode(-305);
          }
          resultObj = c1ResultSet.getObject(2);
          if (resultObj != null) {
            hostVarArrayArea.setHvHipaaVerNbr(ftchRowCnt, resultObj.toString().toCharArray());
          } else {
            sqlca.setSqlcode(-305);
          }
          resultObj = c1ResultSet.getObject(3);
          if (resultObj != null) {
            hostVarArrayArea.setHvSortCol1(ftchRowCnt, resultObj.toString().toCharArray());
          } else {
            sqlca.setSqlcode(-305);
          }
          resultObj = c1ResultSet.getObject(4);
          if (resultObj != null) {
            hostVarArrayArea.setHvHipaaCd(ftchRowCnt, resultObj.toString().toCharArray());
          } else {
            sqlca.setSqlcode(-305);
          }
          resultObj = c1ResultSet.getObject(5);
          if (resultObj != null) {
            hostVarArrayArea.setHvGrnrcRqstCd(ftchRowCnt, resultObj.toString().toCharArray());
          } else {
            sqlca.setSqlcode(-305);
          }
          resultObj = c1ResultSet.getObject(6);
          if (resultObj != null) {
            hostVarArrayArea.setHvHipaaGrpCd(ftchRowCnt, resultObj.toString().toCharArray());
          } else {
            sqlca.setSqlcode(-305);
          }
          resultObj = c1ResultSet.getObject(7);
          if (resultObj != null) {
            try {
              hostVarArrayArea.setHvDataTyp(ftchRowCnt, ((Integer) resultObj).intValue());
            } catch (java.lang.ClassCastException cce) {
              if (BigDecimal.class.isInstance(resultObj))
                hostVarArrayArea.setHvDataTyp(ftchRowCnt, ((BigDecimal) resultObj).intValue());
              else if (Float.class.isInstance(resultObj))
                hostVarArrayArea.setHvDataTyp(ftchRowCnt, ((Float) resultObj).intValue());
              else if (Double.class.isInstance(resultObj))
                hostVarArrayArea.setHvDataTyp(ftchRowCnt, ((Double) resultObj).intValue());
            }
          } else {
            sqlca.setSqlcode(-305);
          }
          resultObj = c1ResultSet.getObject(8);
          if (resultObj != null) {
            try {
              hostVarArrayArea.setHvKeyCnt(ftchRowCnt, ((Integer) resultObj).intValue());
            } catch (java.lang.ClassCastException cce) {
              if (BigDecimal.class.isInstance(resultObj))
                hostVarArrayArea.setHvKeyCnt(ftchRowCnt, ((BigDecimal) resultObj).intValue());
              else if (Float.class.isInstance(resultObj))
                hostVarArrayArea.setHvKeyCnt(ftchRowCnt, ((Float) resultObj).intValue());
              else if (Double.class.isInstance(resultObj))
                hostVarArrayArea.setHvKeyCnt(ftchRowCnt, ((Double) resultObj).intValue());
            }
          } else {
            sqlca.setSqlcode(-305);
          }
          resultObj = c1ResultSet.getObject(9);
          if (resultObj != null) {
            try {
              hostVarArrayArea.setHvDataCnt(ftchRowCnt, ((Integer) resultObj).intValue());
            } catch (java.lang.ClassCastException cce) {
              if (BigDecimal.class.isInstance(resultObj))
                hostVarArrayArea.setHvDataCnt(ftchRowCnt, ((BigDecimal) resultObj).intValue());
              else if (Float.class.isInstance(resultObj))
                hostVarArrayArea.setHvDataCnt(ftchRowCnt, ((Float) resultObj).intValue());
              else if (Double.class.isInstance(resultObj))
                hostVarArrayArea.setHvDataCnt(ftchRowCnt, ((Double) resultObj).intValue());
            }
          } else {
            sqlca.setSqlcode(-305);
          }
          sqlFetchCounter++;
          ftchRowCnt++;
        } else {
          sqlca.setSqlcode(100); // No More rows
        }
        sqlca.setSqlerrd(2, ftchRowCnt);
      }
    } catch (SQLException e) {
      if (e.getMessage().contains("result set is closed"))
        fill501SqlcaObject(sqlca); // cursor closed
      else {
        logger.error("c1ResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:fetchC1Dphpctsq
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
}
