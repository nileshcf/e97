  package com.cloudframe.app.process.impl;
  /* 
*
*****************************************************************
* informados, realizara una descarega de la tabla ge18.         *
*                                                               *
*****************************************************************
*                                                               *
*                   identification division                     *
*                                                               *
*****************************************************************
*****************************************************************
* log de modificaciones                                         *
*****************************************************************
* ============================================================= *
* 11.05.2012 * it+ sa  * modificaciones para el tratamiento     *
*            * x000566 * del cursor con multirow fetch          *
*            *         * marca mrow                             *
* ============================================================= *
*****************************************************************
*                                                               *
*                    environment division                       *
*                                                               *
*****************************************************************
*/
  
  import com.cloudframe.app.bm80022.Bm80022Ctx.*;
  import com.cloudframe.app.bm80022.Bm80022Ctx;
  import com.cloudframe.app.process.Bm80022;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.bm80022.file.*;
  import com.cloudframe.app.repository.Bm80022Repository;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.bm80022.dto.*;
  import com.cloudframe.app.bm80022.dto.Sqlca;
  import com.cloudframe.app.bm80022.dto.AbendLinea6;
  import com.cloudframe.app.bm80022.dto.AbendLinea4;
  import com.cloudframe.app.bm80022.dto.AbendLinea7;
  import com.cloudframe.app.bm80022.dto.Ge1801Array;
  import com.cloudframe.app.bm80022.dto.Contadors;
  import com.cloudframe.app.bm80022.file.records.Ge0018f;
  import com.cloudframe.app.bm80022.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("bm80022")
  
  public class Bm80022Impl extends CommonProcess implements Bm80022 {
  
  Logger logger = LoggerFactory.getLogger(Bm80022Impl.class);
  
  
  @Value("${BM80022.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("bm80022_ge0001w")
  Ge0001w ge0001w;
  @Autowired 
  @Qualifier("db2Base")
  Db2Base db2Base;
  @Autowired 
  @Qualifier("bm80022Repository")
  Bm80022Repository bm80022Repository;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Bm80022Ctx programCtx) throws Exception {
CFUtil.setDecimalAsComma();
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("BM80022" ,dbQualifier, true/*use Dynamic SQL*/);
          ;
//  PERFORM START-OF-PROGRAM
          startOfProgram(programCtx.getStartOfProgramInCtx());/*START-OF-PROGRAM*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
      		if(ge0001w.hasOpened() && !ge0001w.isReadOnly()) { 
      			ge0001w.flush(); 
      		}
		handleDbAtEnd(db2Base); 
		clearVars(); 
      

      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * startOfProgram 
      *   This method is derived from 
  *   COBOL Paragraph - START-OF-PROGRAM COBOL Cyclomatic complexity - 2
      * Input  :  

      * - swFinCurGe18                   COBOL Name: SW-FIN-CUR-GE18
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void startOfProgram(StartOfProgramInCtx methodIn) throws Exception {
Bm80022Ctx programCtx = methodIn.getBm80022Ctx();
//  PERFORM 1000-INICIO
          inicio(programCtx);/*1000-INICIO*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESO UNTIL SW-FIN-CUR-GE18-SI
          while (!(methodIn.isSwFinCurGe18Si()) ) {
             proceso(programCtx);/*2000-PROCESO*/
             if (programCtx.isProgramEnded()) {
                 return ;
             }
          }
//  PERFORM 3000-FIN
          fin(programCtx);/*3000-FIN*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * inicio 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INICIO COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - contadors                      COBOL Name: WS-CONTADORS
      * - swFinCurGe18                   COBOL Name: SW-FIN-CUR-GE18
      * - swFinCursorRowset              COBOL Name: SW-FIN-CURSOR-ROWSET
      *
      * @throws CFException
      */
      @Override
      public InicioOutCtx inicio(Bm80022Ctx programCtx) throws Exception {
      
// *=================================================================

// *=================================================================

// * -->  It+ s.a  - mrow - 11.05.2012 - x000566
InicioOutCtx methodOut = programCtx.getInicioOutCtx();
//  INITIALIZE WS-CONTADORS
          methodOut.getContadors().initialize();
//  SET SW-FIN-CUR-GE18-NO TO TRUE
          methodOut.setSwFinCurGe18NoTrue(); 
          
//  SET SW-NO-FIN-CUR-ROWSET TO TRUE
          methodOut.setSwNoFinCurRowsetTrue(); 
          

// * <--  It+ s.a  - mrow - 11.05.2012 - x000566
//  PERFORM 1100-OPEN-FICHEROS
          openFicheros(programCtx.getOpenFicherosInCtx());/*1100-OPEN-FICHEROS*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  PERFORM 1200-OPEN-CUR-GE18
          openCurGe18(programCtx.getOpenCurGe18InCtx());/*1200-OPEN-CUR-GE18*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// * -->  It+ s.a  - mrow - 11.05.2012 - x000566
// *    perform 1300-fetch-cur-ge18
//  PERFORM 1300-LEER-CURSOR-MROW
          leerCursorMrow(programCtx.getLeerCursorMrowInCtx());/*1300-LEER-CURSOR-MROW*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  PERFORM 1310-RECUPERAR-FILA
          recuperarFila(programCtx.getRecuperarFilaInCtx());/*1310-RECUPERAR-FILA*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// * <--  It+ s.a  - mrow - 11.05.2012 - x000566
//  IF SW-FIN-CUR-GE18-SI
          if ( methodOut.isSwFinCurGe18Si()  ) { 
//  DISPLAY '************************************************'
              logger.info("************************************************"); 
//  DISPLAY '*      PGM: GE80022.                           *'
              logger.info("*      PGM: GE80022.                           *"); 
//  DISPLAY '*      TABLA GE18 VACIA                        *'
              logger.info("*      TABLA GE18 VACIA                        *"); 
//  DISPLAY '************************************************'
              logger.info("************************************************"); 
          }
      
      return methodOut;
      }
      /**
      * openFicheros 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-OPEN-FICHEROS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - litGe0001w                     COBOL Name: LIT-GE0001W
      * - litAbrir                       COBOL Name: LIT-ABRIR
      *
      * Output :  

      * - fsGe0001w                      COBOL Name: FS-GE0001W
      * - fichero                        COBOL Name: WS-FICHERO
      * - litGe0001w                     COBOL Name: LIT-GE0001W
      * - acceso                         COBOL Name: WS-ACCESO
      * - litAbrir                       COBOL Name: LIT-ABRIR
      * - fileStatus                     COBOL Name: FILE-STATUS
      *
      * @throws CFException
      */
      @Override
      public OpenFicherosOutCtx openFicheros(OpenFicherosInCtx methodIn) throws Exception {
      
// *=================================================================

// *=================================================================
Bm80022Ctx programCtx = methodIn.getBm80022Ctx();
OpenFicherosOutCtx methodOut = methodIn.getOpenFicherosOutCtx();
//  OPEN OUTPUT GE0001W
          ge0001w.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),ge0001w.getFileName(),ge0001w.getGe0001wCharSet(),ge0001w.getGe0001wCrlfFlag());
          methodOut.setFsGe0001w(ge0001w.getStatusString() );
//  IF FS-GE0001W NOT = ZEROES
          if (!( allZeros(methodOut.getFsGe0001w()) ) /*  !=  zeros*/) { 
              // MOVE LIT-GE0001W TO WS-FICHERO
              methodOut.setFichero(methodOut.getLitGe0001w());
              // MOVE LIT-ABRIR TO WS-ACCESO
              methodOut.setAcceso(methodOut.getLitAbrir());
              // MOVE FS-GE0001W TO FILE-STATUS
              methodOut.setFileStatus(methodOut.getFsGe0001w());
//  PERFORM U9998-TRATAR-ERR-FICHERO
              tratarErrFichero(programCtx.getTratarErrFicheroInCtx());/*U9998-TRATAR-ERR-FICHERO*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
      }
      /**
      * openCurGe18 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-OPEN-CUR-GE18 COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      * - wkErrorDb2                     COBOL Name: WK-ERROR-DB2
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - abendParraf                    COBOL Name: ABEND-PARRAF
      * - abendProg                      COBOL Name: ABEND-PROG
      * - abendTabla                     COBOL Name: ABEND-TABLA
      * - abendSqlcode                   COBOL Name: ABEND-SQLCODE
      * - abendSenten                    COBOL Name: ABEND-SENTEN
      * - rc                             COBOL Name: RETURN-CODE
      * - wkErrorDb2                     COBOL Name: WK-ERROR-DB2
      *
      * @throws CFException
      */
      @Override
      public OpenCurGe18OutCtx openCurGe18(OpenCurGe18InCtx methodIn) throws Exception {
      
// *=================================================================
Bm80022Ctx programCtx = methodIn.getBm80022Ctx();
OpenCurGe18OutCtx methodOut = methodIn.getOpenCurGe18OutCtx();
//  SELECT GE1801_CODENTID , GE1801_TIPPRODUCT , GE1801_CODCONTRAT , GE1801_OFIGESTORA , GE1801_IDEPSIG , GE1801_NUMPERSONA , GE1801_NUMCARTERA , GE1801_CODCARTERA , GE1801_FECHAALTA , GE1801_FECHABAJA , GE1801_CODNODO , GE1801_RESAMBITO , GE1801_NUMRESAMB , GE1801_NUMPRESAMB , GE1801_CENGESCAPT , GE1801_NUMGESCAP , GE1801_NUMPGESCAP , GE1801_NUMPESPRIE , GE1801_CODCARRIE , GE1801_FECCIECURSO FROM GE1801 WHERE GE1801_CODENTID > '' ORDER BY GE1801_CODENTID
          programCtx.setCurGe18ResultSet(bm80022Repository.openCurGe18Bm80022(programCtx.getSqlca()));
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  EVALUATE TRUE
          if  ( methodOut.isDb2StatusOk()  ) { 
              ;
          }
          else   { 
              // MOVE '1200' TO ABEND-PARRAF
              methodOut.setAbendParraf(CONSTANTS.LITERAL_1200_B6_);
//  MOVE 'GE80022' TO ABEND-PROG
              methodOut.setAbendProg(CONSTANTS.LITERAL_GE80022_B_);
//  MOVE 'GE1801' TO ABEND-TABLA
              methodOut.setAbendTabla(CONSTANTS.LITERAL_GE1801_B_);
//  MOVE WS-SQLCODE TO ABEND-SQLCODE
              methodOut.setAbendSqlcode( methodOut.getSqlcode_Ws());
//  MOVE 'OPEN-CURSOR' TO ABEND-SENTEN
              methodOut.setAbendSenten(CONSTANTS.LITERAL_OPEN_MN_CURSOR_B10_);
//  MOVE WK-ERROR-DB2 TO RETURN-CODE
              programCtx.setRc(CFUtil.getInt(methodOut.getWkErrorDb2()));
//  PERFORM 9000-FIN-CON-ERROR
              finConError(programCtx.getFinConErrorInCtx());/*9000-FIN-CON-ERROR*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
      }
      /**
      * leerCursorMrow 
      *   This method is derived from 
  *   COBOL Paragraph - 1300-LEER-CURSOR-MROW COBOL Cyclomatic complexity - 6
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      * - sqlerrd                        COBOL Name: SQLERRD
      * - litPrograma                    COBOL Name: LIT-PROGRAMA
      *
      * Output :  

      * - dsnnrows                       COBOL Name: DSNNROWS
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - posRow                         COBOL Name: POS-ROW
      * - regsRecupRowset                COBOL Name: REGS-RECUP-ROWSET
      * - sqlerrd                        COBOL Name: SQLERRD
      * - swFinCursorRowset              COBOL Name: SW-FIN-CURSOR-ROWSET
      * - swFinCurGe18                   COBOL Name: SW-FIN-CUR-GE18
      * - abendMensaje                   COBOL Name: ABEND-MENSAJE
      * - abendSqlcode                   COBOL Name: ABEND-SQLCODE
      * - abendTabla                     COBOL Name: ABEND-TABLA
      * - abendProg                      COBOL Name: ABEND-PROG
      * - litPrograma                    COBOL Name: LIT-PROGRAMA
      * - abendParraf                    COBOL Name: ABEND-PARRAF
      * - abendSenten                    COBOL Name: ABEND-SENTEN
      *
      * @throws CFException
      */
      @Override
      public LeerCursorMrowOutCtx leerCursorMrow(LeerCursorMrowInCtx methodIn) throws Exception {
      
// *****************************************************************
// * 1300-Leer-cursor-mrow                                         *
// *****************************************************************
// FETCH NEXT ROWSET FROM CUR_GE18 FOR 100 ROWS INTO  ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ? 
Bm80022Ctx programCtx = methodIn.getBm80022Ctx();
LeerCursorMrowOutCtx methodOut = methodIn.getLeerCursorMrowOutCtx();
//  MOVE 100 TO DSNNROWS
          methodOut.setDsnnrows(100);
//  FETCH NEXT ROWSET FROM CUR_GE18 FOR 100 ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          bm80022Repository.fetchCurGe18Bm80022(programCtx.getCurGe18ResultSet(),programCtx.getSqlca(),methodOut.getGe1801Array());
//  MOVE 100 TO DSNNROWS
          methodOut.setDsnnrows(100);
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  MOVE 1 TO POS-ROW
              methodOut.setPosRow(1);
//  MOVE SQLERRD (3) TO REGS-RECUP-ROWSET
              methodOut.setRegsRecupRowset(methodOut.getSqlerrd(2));
          break;
          	case 100:
//  IF SQLERRD (3) > 0
              if (	( methodOut.getSqlerrd(2) > 0 )) { 
//  MOVE 1 TO POS-ROW
                  methodOut.setPosRow(1);
//  MOVE SQLERRD (3) TO REGS-RECUP-ROWSET
                  methodOut.setRegsRecupRowset(methodOut.getSqlerrd(2));
//  SET SW-SI-FIN-CUR-ROWSET TO TRUE
                  methodOut.setSwSiFinCurRowsetTrue(); 
                  
              }
//  ELSE
              else { 
//  MOVE 0 TO REGS-RECUP-ROWSET
                  methodOut.setRegsRecupRowset(0);
//  SET SW-SI-FIN-CUR-ROWSET TO TRUE
                  methodOut.setSwSiFinCurRowsetTrue(); 
                  
//  SET SW-FIN-CUR-GE18-SI TO TRUE
                  methodOut.setSwFinCurGe18SiTrue(); 
                  
              }
          break;
          default :
//  MOVE 'ERROR EN OPEN CURSOR. ' TO ABEND-MENSAJE
              methodOut.setAbendMensaje(CONSTANTS.LITERAL_2055775089);
//  MOVE WS-SQLCODE TO ABEND-SQLCODE
              methodOut.setAbendSqlcode( methodOut.getSqlcode_Ws());
//  MOVE 'GE1801' TO ABEND-TABLA
              methodOut.setAbendTabla(CONSTANTS.LITERAL_GE1801_B_);
//  MOVE LIT-PROGRAMA TO ABEND-PROG
              methodOut.setAbendProg(methodOut.getLitPrograma());
//  MOVE ' 1300' TO ABEND-PARRAF
              methodOut.setAbendParraf(CONSTANTS.LITERAL_B6_1300);
//  MOVE 'FETCH-CURSOR' TO ABEND-SENTEN
              methodOut.setAbendSenten(CONSTANTS.LITERAL_FETCH_MN_CURSOR_B9_);
//  PERFORM 9000-FIN-CON-ERROR
              finConError(programCtx.getFinConErrorInCtx());/*9000-FIN-CON-ERROR*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
      }
      /**
      * recuperarFila 
      *   This method is derived from 
  *   COBOL Paragraph - 1310-RECUPERAR-FILA COBOL Cyclomatic complexity - 4
      * Input  :  

      * - posRow                         COBOL Name: POS-ROW
      * - regsRecupRowset                COBOL Name: REGS-RECUP-ROWSET
      * - swFinCursorRowset              COBOL Name: SW-FIN-CURSOR-ROWSET
      *
      * Output :  

      * - posRow                         COBOL Name: POS-ROW
      * - swFinCurGe18                   COBOL Name: SW-FIN-CUR-GE18
      *
      * @throws CFException
      */
      @Override
      public RecuperarFilaOutCtx recuperarFila(RecuperarFilaInCtx methodIn) throws Exception {
      
// ******************************************************************
// * 1310-Recuperar-fila
// ******************************************************************
Bm80022Ctx programCtx = methodIn.getBm80022Ctx();
RecuperarFilaOutCtx methodOut = methodIn.getRecuperarFilaOutCtx();
//  IF POS-ROW > REGS-RECUP-ROWSET
          if (	( methodOut.getPosRow() > methodIn.getRegsRecupRowset() )) { 
//  IF SW-NO-FIN-CUR-ROWSET
              if ( methodIn.isSwNoFinCurRowset()  ) { 
//  PERFORM 1300-LEER-CURSOR-MROW
                  leerCursorMrow(programCtx.getLeerCursorMrowInCtx());/*1300-LEER-CURSOR-MROW*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
//  IF REGS-RECUP-ROWSET > 0
                  if (	( methodIn.getRegsRecupRowset() > 0 )) { 
//  PERFORM 1320-TRATAR-FILA
                      tratarFila(programCtx.getTratarFilaInCtx());/*1320-TRATAR-FILA*/
//  ADD 1 TO POS-ROW
                      methodOut.setPosRow(methodOut.getPosRow()+1);
                  }
              }
//  ELSE
              else { 
//  SET SW-FIN-CUR-GE18-SI TO TRUE
                  methodOut.setSwFinCurGe18SiTrue(); 
                  
              }
          }
//  ELSE
          else { 
//  PERFORM 1320-TRATAR-FILA
              tratarFila(programCtx.getTratarFilaInCtx());/*1320-TRATAR-FILA*/
//  ADD 1 TO POS-ROW
              methodOut.setPosRow(methodOut.getPosRow()+1);
          }
      
      return methodOut;
      }
      /**
      * tratarFila 
      *   This method is derived from 
  *   COBOL Paragraph - 1320-TRATAR-FILA COBOL Cyclomatic complexity - 1
      * Input  :  

      * - llegitsGe1801                  COBOL Name: WS-LLEGITS-GE1801
      *
      * Output :  

      * - llegitsGe1801                  COBOL Name: WS-LLEGITS-GE1801
      *
      * @throws CFException
      */
      @Override
      public TratarFilaOutCtx tratarFila(TratarFilaInCtx methodIn) throws Exception {
      
// ******************************************************************
// * 1320-Tratar-fila
// ******************************************************************
Bm80022Ctx programCtx = methodIn.getBm80022Ctx();
TratarFilaOutCtx methodOut = methodIn.getTratarFilaOutCtx();
//  ADD 1 TO WS-LLEGITS-GE1801
          methodOut.setLlegitsGe1801(methodOut.getLlegitsGe1801()+(long)1);
//  PERFORM 1330-MOVER-ROWSET
          moverRowset(programCtx.getMoverRowsetInCtx());/*1330-MOVER-ROWSET*/
          ;
      
      return methodOut;
      }
      /**
      * moverRowset 
      *   This method is derived from 
  *   COBOL Paragraph - 1330-MOVER-ROWSET COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ge1801ACodentid                COBOL Name: GE1801-A-CODENTID
      * - ge1801ATipproduct              COBOL Name: GE1801-A-TIPPRODUCT
      * - ge1801ACodcontrat              COBOL Name: GE1801-A-CODCONTRAT
      * - ge1801AOfigestora              COBOL Name: GE1801-A-OFIGESTORA
      * - ge1801AIdepsig                 COBOL Name: GE1801-A-IDEPSIG
      * - ge1801ANumpersona              COBOL Name: GE1801-A-NUMPERSONA
      * - ge1801ANumcartera              COBOL Name: GE1801-A-NUMCARTERA
      * - ge1801ACodcartera              COBOL Name: GE1801-A-CODCARTERA
      * - ge1801AFechaalta               COBOL Name: GE1801-A-FECHAALTA
      * - ge1801AFechabaja               COBOL Name: GE1801-A-FECHABAJA
      * - ge1801ACodnodo                 COBOL Name: GE1801-A-CODNODO
      * - ge1801AResambito               COBOL Name: GE1801-A-RESAMBITO
      * - ge1801ANumresamb               COBOL Name: GE1801-A-NUMRESAMB
      * - ge1801ANumpresamb              COBOL Name: GE1801-A-NUMPRESAMB
      * - ge1801ACengescapt              COBOL Name: GE1801-A-CENGESCAPT
      * - ge1801ANumgescap               COBOL Name: GE1801-A-NUMGESCAP
      * - ge1801ANumpgescap              COBOL Name: GE1801-A-NUMPGESCAP
      * - ge1801ANumpesprie              COBOL Name: GE1801-A-NUMPESPRIE
      * - ge1801ACodcarrie               COBOL Name: GE1801-A-CODCARRIE
      * - ge1801AFecciecurso             COBOL Name: GE1801-A-FECCIECURSO
      *
      * Output :  

      * - ge1801Codentid                 COBOL Name: GE1801-CODENTID
      * - ge1801ACodentid                COBOL Name: GE1801-A-CODENTID
      * - ge1801Tipproduct               COBOL Name: GE1801-TIPPRODUCT
      * - ge1801ATipproduct              COBOL Name: GE1801-A-TIPPRODUCT
      * - ge1801Codcontrat               COBOL Name: GE1801-CODCONTRAT
      * - ge1801ACodcontrat              COBOL Name: GE1801-A-CODCONTRAT
      * - ge1801Ofigestora               COBOL Name: GE1801-OFIGESTORA
      * - ge1801AOfigestora              COBOL Name: GE1801-A-OFIGESTORA
      * - ge1801Idepsig                  COBOL Name: GE1801-IDEPSIG
      * - ge1801AIdepsig                 COBOL Name: GE1801-A-IDEPSIG
      * - ge1801Numpersona               COBOL Name: GE1801-NUMPERSONA
      * - ge1801ANumpersona              COBOL Name: GE1801-A-NUMPERSONA
      * - ge1801Numcartera               COBOL Name: GE1801-NUMCARTERA
      * - ge1801ANumcartera              COBOL Name: GE1801-A-NUMCARTERA
      * - ge1801Codcartera               COBOL Name: GE1801-CODCARTERA
      * - ge1801ACodcartera              COBOL Name: GE1801-A-CODCARTERA
      * - ge1801Fechaalta                COBOL Name: GE1801-FECHAALTA
      * - ge1801AFechaalta               COBOL Name: GE1801-A-FECHAALTA
      * - ge1801Fechabaja                COBOL Name: GE1801-FECHABAJA
      * - ge1801AFechabaja               COBOL Name: GE1801-A-FECHABAJA
      * - ge1801Codnodo                  COBOL Name: GE1801-CODNODO
      * - ge1801ACodnodo                 COBOL Name: GE1801-A-CODNODO
      * - ge1801Resambito                COBOL Name: GE1801-RESAMBITO
      * - ge1801AResambito               COBOL Name: GE1801-A-RESAMBITO
      * - ge1801Numresamb                COBOL Name: GE1801-NUMRESAMB
      * - ge1801ANumresamb               COBOL Name: GE1801-A-NUMRESAMB
      * - ge1801Numpresamb               COBOL Name: GE1801-NUMPRESAMB
      * - ge1801ANumpresamb              COBOL Name: GE1801-A-NUMPRESAMB
      * - ge1801Cengescapt               COBOL Name: GE1801-CENGESCAPT
      * - ge1801ACengescapt              COBOL Name: GE1801-A-CENGESCAPT
      * - ge1801Numgescap                COBOL Name: GE1801-NUMGESCAP
      * - ge1801ANumgescap               COBOL Name: GE1801-A-NUMGESCAP
      * - ge1801Numpgescap               COBOL Name: GE1801-NUMPGESCAP
      * - ge1801ANumpgescap              COBOL Name: GE1801-A-NUMPGESCAP
      * - ge1801Numpesprie               COBOL Name: GE1801-NUMPESPRIE
      * - ge1801ANumpesprie              COBOL Name: GE1801-A-NUMPESPRIE
      * - ge1801Codcarrie                COBOL Name: GE1801-CODCARRIE
      * - ge1801ACodcarrie               COBOL Name: GE1801-A-CODCARRIE
      * - ge1801Fecciecurso              COBOL Name: GE1801-FECCIECURSO
      * - ge1801AFecciecurso             COBOL Name: GE1801-A-FECCIECURSO
      *
      * @throws CFException
      */
      @Override
      public MoverRowsetOutCtx moverRowset(MoverRowsetInCtx methodIn) throws Exception {
      
// ******************************************************************
// * 1330-Mover-rowset
// ******************************************************************
Bm80022Ctx programCtx = methodIn.getBm80022Ctx();
MoverRowsetOutCtx methodOut = methodIn.getMoverRowsetOutCtx();
//  MOVE GE1801-A-CODENTID ( POS-ROW ) TO GE1801-CODENTID
          methodOut.setGe1801Codentid(methodOut.getGe1801ACodentid(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-TIPPRODUCT ( POS-ROW ) TO GE1801-TIPPRODUCT
          methodOut.setGe1801Tipproduct(methodOut.getGe1801ATipproduct(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-CODCONTRAT ( POS-ROW ) TO GE1801-CODCONTRAT
          methodOut.setGe1801Codcontrat(methodOut.getGe1801ACodcontrat(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-OFIGESTORA ( POS-ROW ) TO GE1801-OFIGESTORA
          methodOut.setGe1801Ofigestora(methodOut.getGe1801AOfigestora(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-IDEPSIG ( POS-ROW ) TO GE1801-IDEPSIG
          methodOut.setGe1801Idepsig(methodOut.getGe1801AIdepsig(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-NUMPERSONA ( POS-ROW ) TO GE1801-NUMPERSONA
          methodOut.setGe1801Numpersona(methodOut.getGe1801ANumpersona(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-NUMCARTERA ( POS-ROW ) TO GE1801-NUMCARTERA
          methodOut.setGe1801Numcartera(methodOut.getGe1801ANumcartera(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-CODCARTERA ( POS-ROW ) TO GE1801-CODCARTERA
          methodOut.setGe1801Codcartera(methodOut.getGe1801ACodcartera(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-FECHAALTA ( POS-ROW ) TO GE1801-FECHAALTA
          methodOut.setGe1801Fechaalta(methodOut.getGe1801AFechaalta(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-FECHABAJA ( POS-ROW ) TO GE1801-FECHABAJA
          methodOut.setGe1801Fechabaja(methodOut.getGe1801AFechabaja(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-CODNODO ( POS-ROW ) TO GE1801-CODNODO
          methodOut.setGe1801Codnodo(methodOut.getGe1801ACodnodo(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-RESAMBITO ( POS-ROW ) TO GE1801-RESAMBITO
          methodOut.setGe1801Resambito(methodOut.getGe1801AResambito(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-NUMRESAMB ( POS-ROW ) TO GE1801-NUMRESAMB
          methodOut.setGe1801Numresamb(methodOut.getGe1801ANumresamb(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-NUMPRESAMB ( POS-ROW ) TO GE1801-NUMPRESAMB
          methodOut.setGe1801Numpresamb(methodOut.getGe1801ANumpresamb(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-CENGESCAPT ( POS-ROW ) TO GE1801-CENGESCAPT
          methodOut.setGe1801Cengescapt(methodOut.getGe1801ACengescapt(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-NUMGESCAP ( POS-ROW ) TO GE1801-NUMGESCAP
          methodOut.setGe1801Numgescap(methodOut.getGe1801ANumgescap(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-NUMPGESCAP ( POS-ROW ) TO GE1801-NUMPGESCAP
          methodOut.setGe1801Numpgescap(methodOut.getGe1801ANumpgescap(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-NUMPESPRIE ( POS-ROW ) TO GE1801-NUMPESPRIE
          methodOut.setGe1801Numpesprie(methodOut.getGe1801ANumpesprie(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-CODCARRIE ( POS-ROW ) TO GE1801-CODCARRIE
          methodOut.setGe1801Codcarrie(methodOut.getGe1801ACodcarrie(methodIn.getPosRow() - 1));
//  MOVE GE1801-A-FECCIECURSO ( POS-ROW ) TO GE1801-FECCIECURSO
          methodOut.setGe1801Fecciecurso(methodOut.getGe1801AFecciecurso(methodIn.getPosRow() - 1));
      
      return methodOut;
      }
      /**
      * closeCurGe18 
      *   This method is derived from 
  *   COBOL Paragraph - 1400-CLOSE-CUR-GE18 COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      * - wkErrorDb2                     COBOL Name: WK-ERROR-DB2
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - abendParraf                    COBOL Name: ABEND-PARRAF
      * - abendProg                      COBOL Name: ABEND-PROG
      * - abendTabla                     COBOL Name: ABEND-TABLA
      * - abendSqlcode                   COBOL Name: ABEND-SQLCODE
      * - abendSenten                    COBOL Name: ABEND-SENTEN
      * - rc                             COBOL Name: RETURN-CODE
      * - wkErrorDb2                     COBOL Name: WK-ERROR-DB2
      *
      * @throws CFException
      */
      @Override
      public CloseCurGe18OutCtx closeCurGe18(CloseCurGe18InCtx methodIn) throws Exception {
      
// * <--  It+ s.a  - mrow - 11.05.2012 - x000566
// *
// *=================================================================
Bm80022Ctx programCtx = methodIn.getBm80022Ctx();
CloseCurGe18OutCtx methodOut = methodIn.getCloseCurGe18OutCtx();
//  CLOSE CUR_GE18
          bm80022Repository.closeCurGe18Bm80022(programCtx.getCurGe18ResultSet(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  EVALUATE TRUE
          if  ( methodOut.isDb2StatusOk()  ) { 
              ;
          }
          else   { 
              // MOVE '1400' TO ABEND-PARRAF
              methodOut.setAbendParraf(CONSTANTS.LITERAL_1400_B6_);
//  MOVE 'GE80022' TO ABEND-PROG
              methodOut.setAbendProg(CONSTANTS.LITERAL_GE80022_B_);
//  MOVE 'GE1801' TO ABEND-TABLA
              methodOut.setAbendTabla(CONSTANTS.LITERAL_GE1801_B_);
//  MOVE SQLCODE TO ABEND-SQLCODE
              methodOut.setAbendSqlcode( methodOut.getSqlcode());
//  MOVE 'CLOSE-CURSOR ' TO ABEND-SENTEN
              methodOut.setAbendSenten(CONSTANTS.LITERAL_CLOSE_MN_CURSOR_B9_);
//  MOVE WK-ERROR-DB2 TO RETURN-CODE
              programCtx.setRc(CFUtil.getInt(methodOut.getWkErrorDb2()));
//  PERFORM 9000-FIN-CON-ERROR
              finConError(programCtx.getFinConErrorInCtx());/*9000-FIN-CON-ERROR*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
      }
      /**
      * proceso 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PROCESO COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - swInfoSalida                   COBOL Name: SW-INFO-SALIDA
      *
      * @throws CFException
      */
      @Override
      public ProcesoOutCtx proceso(Bm80022Ctx programCtx) throws Exception {
      
// *=================================================================

// *=================================================================
ProcesoOutCtx methodOut = programCtx.getProcesoOutCtx();
//  SET SW-NO-INFO-SALIDA TO TRUE
          methodOut.setSwNoInfoSalidaTrue(); 
          
//  PERFORM 2100-INFORMAR-SALIDA
          informarSalida(programCtx.getInformarSalidaInCtx());/*2100-INFORMAR-SALIDA*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// * -->  It+ s.a  - mrow - 11.05.2012 - x000566
// *    perform 1300-fetch-cur-ge18.

// *=================================================================

// *=================================================================
// *

// *
//  PERFORM 1310-RECUPERAR-FILA
          recuperarFila(programCtx.getRecuperarFilaInCtx());/*1310-RECUPERAR-FILA*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
          ;
      
      return methodOut;
      }
      /**
      * informarSalida 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-INFORMAR-SALIDA COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ge1801Codentid                 COBOL Name: GE1801-CODENTID
      * - ge1801Tipproduct               COBOL Name: GE1801-TIPPRODUCT
      * - ge1801Codcontrat               COBOL Name: GE1801-CODCONTRAT
      * - ge1801Ofigestora               COBOL Name: GE1801-OFIGESTORA
      * - ge1801Idepsig                  COBOL Name: GE1801-IDEPSIG
      * - ge1801Numpersona               COBOL Name: GE1801-NUMPERSONA
      * - ge1801Numcartera               COBOL Name: GE1801-NUMCARTERA
      * - ge1801Codcartera               COBOL Name: GE1801-CODCARTERA
      * - ge1801Fechaalta                COBOL Name: GE1801-FECHAALTA
      * - ge1801Fechabaja                COBOL Name: GE1801-FECHABAJA
      * - ge1801Codnodo                  COBOL Name: GE1801-CODNODO
      * - ge1801Resambito                COBOL Name: GE1801-RESAMBITO
      * - ge1801Numresamb                COBOL Name: GE1801-NUMRESAMB
      * - ge1801Numpresamb               COBOL Name: GE1801-NUMPRESAMB
      * - ge1801Cengescapt               COBOL Name: GE1801-CENGESCAPT
      * - ge1801Numgescap                COBOL Name: GE1801-NUMGESCAP
      * - ge1801Numpgescap               COBOL Name: GE1801-NUMPGESCAP
      * - ge1801Numpesprie               COBOL Name: GE1801-NUMPESPRIE
      * - ge1801Codcarrie                COBOL Name: GE1801-CODCARRIE
      * - ge1801Fecciecurso              COBOL Name: GE1801-FECCIECURSO
      *
      * Output :  

      * - ge0018f                        COBOL Name: GE0018F
      * - ge0018fCodentid                COBOL Name: GE0018F-CODENTID
      * - ge1801Codentid                 COBOL Name: GE1801-CODENTID
      * - ge0018fTipproduct              COBOL Name: GE0018F-TIPPRODUCT
      * - ge1801Tipproduct               COBOL Name: GE1801-TIPPRODUCT
      * - ge0018fCodcontrat              COBOL Name: GE0018F-CODCONTRAT
      * - ge1801Codcontrat               COBOL Name: GE1801-CODCONTRAT
      * - ge0018fOfigestora              COBOL Name: GE0018F-OFIGESTORA
      * - ge1801Ofigestora               COBOL Name: GE1801-OFIGESTORA
      * - ge0018fIdepsig                 COBOL Name: GE0018F-IDEPSIG
      * - ge1801Idepsig                  COBOL Name: GE1801-IDEPSIG
      * - ge0018fNumpersona              COBOL Name: GE0018F-NUMPERSONA
      * - ge1801Numpersona               COBOL Name: GE1801-NUMPERSONA
      * - ge0018fNumcartera              COBOL Name: GE0018F-NUMCARTERA
      * - ge1801Numcartera               COBOL Name: GE1801-NUMCARTERA
      * - ge0018fCodcartera              COBOL Name: GE0018F-CODCARTERA
      * - ge1801Codcartera               COBOL Name: GE1801-CODCARTERA
      * - ge0018fFechaalta               COBOL Name: GE0018F-FECHAALTA
      * - ge1801Fechaalta                COBOL Name: GE1801-FECHAALTA
      * - ge0018fFechabaja               COBOL Name: GE0018F-FECHABAJA
      * - ge1801Fechabaja                COBOL Name: GE1801-FECHABAJA
      * - ge0018fCodnodo                 COBOL Name: GE0018F-CODNODO
      * - ge1801Codnodo                  COBOL Name: GE1801-CODNODO
      * - ge0018fResambito               COBOL Name: GE0018F-RESAMBITO
      * - ge1801Resambito                COBOL Name: GE1801-RESAMBITO
      * - ge0018fNumresamb               COBOL Name: GE0018F-NUMRESAMB
      * - ge1801Numresamb                COBOL Name: GE1801-NUMRESAMB
      * - ge0018fNumpresamb              COBOL Name: GE0018F-NUMPRESAMB
      * - ge1801Numpresamb               COBOL Name: GE1801-NUMPRESAMB
      * - ge0018fCengescapt              COBOL Name: GE0018F-CENGESCAPT
      * - ge1801Cengescapt               COBOL Name: GE1801-CENGESCAPT
      * - ge0018fNumgescap               COBOL Name: GE0018F-NUMGESCAP
      * - ge1801Numgescap                COBOL Name: GE1801-NUMGESCAP
      * - ge0018fNumpgescap              COBOL Name: GE0018F-NUMPGESCAP
      * - ge1801Numpgescap               COBOL Name: GE1801-NUMPGESCAP
      * - ge0018fNumpesprie              COBOL Name: GE0018F-NUMPESPRIE
      * - ge1801Numpesprie               COBOL Name: GE1801-NUMPESPRIE
      * - ge0018fCodcarrie               COBOL Name: GE0018F-CODCARRIE
      * - ge1801Codcarrie                COBOL Name: GE1801-CODCARRIE
      * - ge0018fFecciecurso             COBOL Name: GE0018F-FECCIECURSO
      * - ge1801Fecciecurso              COBOL Name: GE1801-FECCIECURSO
      *
      * @throws CFException
      */
      @Override
      public InformarSalidaOutCtx informarSalida(InformarSalidaInCtx methodIn) throws Exception {
Bm80022Ctx programCtx = methodIn.getBm80022Ctx();
InformarSalidaOutCtx methodOut = methodIn.getInformarSalidaOutCtx();
//  INITIALIZE GE0018F
          methodOut.getGe0018f().initialize();
//  MOVE GE1801-CODENTID TO GE0018F-CODENTID
          methodOut.setGe0018fCodentid(methodOut.getGe1801Codentid());
//  MOVE GE1801-TIPPRODUCT TO GE0018F-TIPPRODUCT
          methodOut.setGe0018fTipproduct(methodOut.getGe1801Tipproduct());
//  MOVE GE1801-CODCONTRAT TO GE0018F-CODCONTRAT
          methodOut.setGe0018fCodcontrat(methodOut.getGe1801Codcontrat());
//  MOVE GE1801-OFIGESTORA TO GE0018F-OFIGESTORA
          methodOut.setGe0018fOfigestora(methodOut.getGe1801Ofigestora());
//  MOVE GE1801-IDEPSIG TO GE0018F-IDEPSIG
          methodOut.setGe0018fIdepsig(methodOut.getGe1801Idepsig());
//  MOVE GE1801-NUMPERSONA TO GE0018F-NUMPERSONA
          methodOut.setGe0018fNumpersona(methodOut.getGe1801Numpersona());
//  MOVE GE1801-NUMCARTERA TO GE0018F-NUMCARTERA
          methodOut.setGe0018fNumcartera( methodOut.getGe1801Numcartera());
//  MOVE GE1801-CODCARTERA TO GE0018F-CODCARTERA
          methodOut.setGe0018fCodcartera(methodOut.getGe1801Codcartera());
//  MOVE GE1801-FECHAALTA TO GE0018F-FECHAALTA
          methodOut.setGe0018fFechaalta(methodOut.getGe1801Fechaalta());
//  MOVE GE1801-FECHABAJA TO GE0018F-FECHABAJA
          methodOut.setGe0018fFechabaja(methodOut.getGe1801Fechabaja());
//  MOVE GE1801-CODNODO TO GE0018F-CODNODO
          methodOut.setGe0018fCodnodo(methodOut.getGe1801Codnodo());
//  MOVE GE1801-RESAMBITO TO GE0018F-RESAMBITO
          methodOut.setGe0018fResambito(methodOut.getGe1801Resambito());
//  MOVE GE1801-NUMRESAMB TO GE0018F-NUMRESAMB
          methodOut.setGe0018fNumresamb(methodOut.getGe1801Numresamb());
//  MOVE GE1801-NUMPRESAMB TO GE0018F-NUMPRESAMB
          methodOut.setGe0018fNumpresamb(methodOut.getGe1801Numpresamb());
//  MOVE GE1801-CENGESCAPT TO GE0018F-CENGESCAPT
          methodOut.setGe0018fCengescapt(methodOut.getGe1801Cengescapt());
//  MOVE GE1801-NUMGESCAP TO GE0018F-NUMGESCAP
          methodOut.setGe0018fNumgescap(methodOut.getGe1801Numgescap());
//  MOVE GE1801-NUMPGESCAP TO GE0018F-NUMPGESCAP
          methodOut.setGe0018fNumpgescap(methodOut.getGe1801Numpgescap());
//  MOVE GE1801-NUMPESPRIE TO GE0018F-NUMPESPRIE
          methodOut.setGe0018fNumpesprie(methodOut.getGe1801Numpesprie());
//  MOVE GE1801-CODCARRIE TO GE0018F-CODCARRIE
          methodOut.setGe0018fCodcarrie(methodOut.getGe1801Codcarrie());
//  MOVE GE1801-FECCIECURSO TO GE0018F-FECCIECURSO
          methodOut.setGe0018fFecciecurso(methodOut.getGe1801Fecciecurso());

// *

// *=================================================================

// *=================================================================
// *

// *
//  PERFORM 2110-ESCRIBIR-SALIDA
          escribirSalida(programCtx.getEscribirSalidaInCtx());/*2110-ESCRIBIR-SALIDA*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
          ;
      
      return methodOut;
      }
      /**
      * escribirSalida 
      *   This method is derived from 
  *   COBOL Paragraph - 2110-ESCRIBIR-SALIDA COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ge0018f                        COBOL Name: GE0018F
      * - gravatsGe0001w                 COBOL Name: WS-GRAVATS-GE0001W
      * - litGe0001w                     COBOL Name: LIT-GE0001W
      * - litWrite                       COBOL Name: LIT-WRITE
      *
      * Output :  

      * - fsGe0001w                      COBOL Name: FS-GE0001W
      * - gravatsGe0001w                 COBOL Name: WS-GRAVATS-GE0001W
      * - fichero                        COBOL Name: WS-FICHERO
      * - litGe0001w                     COBOL Name: LIT-GE0001W
      * - acceso                         COBOL Name: WS-ACCESO
      * - litWrite                       COBOL Name: LIT-WRITE
      * - fileStatus                     COBOL Name: FILE-STATUS
      *
      * @throws CFException
      */
      @Override
      public EscribirSalidaOutCtx escribirSalida(EscribirSalidaInCtx methodIn) throws Exception {
Bm80022Ctx programCtx = methodIn.getBm80022Ctx();
EscribirSalidaOutCtx methodOut = methodIn.getEscribirSalidaOutCtx();
//  WRITE GE0018F
          ge0001w.write(methodOut.getGe0018f().toCharArray()); 
          methodOut.getGe0018f().setString(CONSTANTS.LOW_VALUE_215751770);
          methodOut.setFsGe0001w(ge0001w.getStatusString() );
//  EVALUATE FS-GE0001W
          switch(new String(methodOut.getFsGe0001w())){
          	case "00":
//  ADD 1 TO WS-GRAVATS-GE0001W
              methodOut.setGravatsGe0001w(methodOut.getGravatsGe0001w()+(long)1);
          break;
          default :
              // MOVE LIT-GE0001W TO WS-FICHERO
              methodOut.setFichero(methodOut.getLitGe0001w());
              // MOVE LIT-WRITE TO WS-ACCESO
              methodOut.setAcceso(methodOut.getLitWrite());
              // MOVE FS-GE0001W TO FILE-STATUS
              methodOut.setFileStatus(methodOut.getFsGe0001w());
//  PERFORM U9998-TRATAR-ERR-FICHERO
              tratarErrFichero(programCtx.getTratarErrFicheroInCtx());/*U9998-TRATAR-ERR-FICHERO*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
      }
      /**
      * fin 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-FIN COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void fin(Bm80022Ctx programCtx) throws Exception {
      
// *
// *================================================================

// *=================================================================
//  PERFORM 3100-CERRAR-FICHEROS
          cerrarFicheros(programCtx.getCerrarFicherosInCtx());/*3100-CERRAR-FICHEROS*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 1400-CLOSE-CUR-GE18
          closeCurGe18(programCtx.getCloseCurGe18InCtx());/*1400-CLOSE-CUR-GE18*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM U9990-ESTADISTICAS
          estadisticas(programCtx.getEstadisticasInCtx());/*U9990-ESTADISTICAS*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
      /**
      * cerrarFicheros 
      *   This method is derived from 
  *   COBOL Paragraph - 3100-CERRAR-FICHEROS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - fsGe0001w                      COBOL Name: FS-GE0001W
      * - litGe0001w                     COBOL Name: LIT-GE0001W
      * - litCerrar                      COBOL Name: LIT-CERRAR
      *
      * Output :  

      * - fichero                        COBOL Name: WS-FICHERO
      * - litGe0001w                     COBOL Name: LIT-GE0001W
      * - acceso                         COBOL Name: WS-ACCESO
      * - litCerrar                      COBOL Name: LIT-CERRAR
      * - fileStatus                     COBOL Name: FILE-STATUS
      * - fsGe0001w                      COBOL Name: FS-GE0001W
      *
      * @throws CFException
      */
      @Override
      public CerrarFicherosOutCtx cerrarFicheros(CerrarFicherosInCtx methodIn) throws Exception {
      
// *=================================================================

// *=================================================================
Bm80022Ctx programCtx = methodIn.getBm80022Ctx();
CerrarFicherosOutCtx methodOut = methodIn.getCerrarFicherosOutCtx();
//  CLOSE GE0001W
          ge0001w.close(); 
          methodOut.setFsGe0001w(ge0001w.getStatusString() );
//  IF FS-GE0001W NOT = ZEROES
          if (!( allZeros(methodOut.getFsGe0001w()) ) /*  !=  zeros*/) { 
              // MOVE LIT-GE0001W TO WS-FICHERO
              methodOut.setFichero(methodOut.getLitGe0001w());
              // MOVE LIT-CERRAR TO WS-ACCESO
              methodOut.setAcceso(methodOut.getLitCerrar());
              // MOVE FS-GE0001W TO FILE-STATUS
              methodOut.setFileStatus(methodOut.getFsGe0001w());
//  PERFORM U9998-TRATAR-ERR-FICHERO
              tratarErrFichero(programCtx.getTratarErrFicheroInCtx());/*U9998-TRATAR-ERR-FICHERO*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
      }
      /**
      * estadisticas 
      *   This method is derived from 
  *   COBOL Paragraph - U9990-ESTADISTICAS COBOL Cyclomatic complexity - 1
      * Input  :  

      * - llegitsGe1801                  COBOL Name: WS-LLEGITS-GE1801
      * - gravatsGe0001w                 COBOL Name: WS-GRAVATS-GE0001W
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void estadisticas(EstadisticasInCtx methodIn) throws Exception {
      
// *=================================================================

// *=================================================================
Bm80022Ctx programCtx = methodIn.getBm80022Ctx();
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY '************************************************'
          logger.info("************************************************"); 
//  DISPLAY '*      E S T A D I S T I C A S    GE80022      *'
          logger.info("*      E S T A D I S T I C A S    GE80022      *"); 
//  DISPLAY '************************************************'
          logger.info("************************************************"); 
//  DISPLAY '************************************************'
          logger.info("************************************************"); 
//  DISPLAY 'REGISTROS LEIDOS GE1801....:   ' WS-LLEGITS-GE1801
          logger.info("REGISTROS LEIDOS GE1801....:   {}", String.valueOf(methodIn.getLlegitsGe1801())); 
//  DISPLAY 'REGISTROS GRABADOS GE0001W :   ' WS-GRAVATS-GE0001W
          logger.info("REGISTROS GRABADOS GE0001W :   {}", String.valueOf(methodIn.getGravatsGe0001w())); 
//  DISPLAY '************************************************'
          logger.info("************************************************"); 
      
      }
      /**
      * tratarErrFichero 
      *   This method is derived from 
  *   COBOL Paragraph - U9998-TRATAR-ERR-FICHERO COBOL Cyclomatic complexity - 1
      * Input  :  

      * - fichero                        COBOL Name: WS-FICHERO
      * - acceso                         COBOL Name: WS-ACCESO
      * - fileStatus                     COBOL Name: FILE-STATUS
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void tratarErrFichero(TratarErrFicheroInCtx methodIn) throws Exception {
      
// *=================================================================

// *=================================================================
Bm80022Ctx programCtx = methodIn.getBm80022Ctx();
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY '================================================'
          logger.info("================================================"); 
//  DISPLAY ' ************ ERROR EN PGM.:GE80022************ '
          logger.info(" ************ ERROR EN PGM.:GE80022************ "); 
//  DISPLAY '                                                '
          logger.info("                                                "); 
//  DISPLAY ' ERROR EN UN FICHERO '
          logger.info(" ERROR EN UN FICHERO "); 
//  DISPLAY '---------------------'
          logger.info("---------------------"); 
//  DISPLAY ' FICHERO       : ' , WS-FICHERO
          logger.info(" FICHERO       : {}", new String(methodIn.getFichero())); 
//  DISPLAY ' ACCESO        : ' , WS-ACCESO
          logger.info(" ACCESO        : {}", new String(methodIn.getAcceso())); 
//  DISPLAY ' FILE-STATUS   : ' , FILE-STATUS
          logger.info(" FILE-STATUS   : {}", new String(methodIn.getFileStatus())); 
//  DISPLAY '                                                '
          logger.info("                                                "); 
//  DISPLAY '================================================'
          logger.info("================================================"); 
//  PERFORM U9999-ABORTAR
          abortar(programCtx);/*U9999-ABORTAR*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * abortar 
      *   This method is derived from 
  *   COBOL Paragraph - U9999-ABORTAR COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public AbortarOutCtx abortar(Bm80022Ctx programCtx) throws Exception {
      
// *=================================================================

// *=================================================================
AbortarOutCtx methodOut = programCtx.getAbortarOutCtx();
//  PERFORM U9990-ESTADISTICAS
          estadisticas(programCtx.getEstadisticasInCtx());/*U9990-ESTADISTICAS*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  MOVE '12' TO RETURN-CODE
          programCtx.setRc(12);
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * finConError 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-FIN-CON-ERROR COBOL Cyclomatic complexity - 2
      * Input  :  

      * - abendLinea1                    COBOL Name: ABEND-LINEA1
      * - abendLinea2                    COBOL Name: ABEND-LINEA2
      * - abendLinea3                    COBOL Name: ABEND-LINEA3
      * - abendLinea4                    COBOL Name: ABEND-LINEA4
      * - abendLinea5                    COBOL Name: ABEND-LINEA5
      * - abendLinea6                    COBOL Name: ABEND-LINEA6
      * - abendLinea7                    COBOL Name: ABEND-LINEA7
      * - abendLinea8                    COBOL Name: ABEND-LINEA8
      * - abendLinea9                    COBOL Name: ABEND-LINEA9
      * - abendLinea10                   COBOL Name: ABEND-LINEA10
      * - abendLinea11                   COBOL Name: ABEND-LINEA11
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public FinConErrorOutCtx finConError(FinConErrorInCtx methodIn) throws Exception {
      
// *=================================================================

// *=================================================================
Bm80022Ctx programCtx = methodIn.getBm80022Ctx();
FinConErrorOutCtx methodOut = methodIn.getFinConErrorOutCtx();
//  PERFORM U9990-ESTADISTICAS
          estadisticas(programCtx.getEstadisticasInCtx());/*U9990-ESTADISTICAS*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  MOVE '35' TO RETURN-CODE
          programCtx.setRc(35);
//  DISPLAY ABEND-LINEA1
          logger.info(new String(methodIn.getAbendLinea1())); 
//  DISPLAY ABEND-LINEA2
          logger.info(new String(methodIn.getAbendLinea2())); 
//  DISPLAY ABEND-LINEA3
          logger.info(new String(methodIn.getAbendLinea3())); 
//  DISPLAY ABEND-LINEA4
          logger.info(methodIn.getAbendLinea4().toString()); 
//  DISPLAY ABEND-LINEA5
          logger.info(new String(methodIn.getAbendLinea5())); 
//  DISPLAY ABEND-LINEA6
          logger.info(methodIn.getAbendLinea6().toString()); 
//  DISPLAY ABEND-LINEA7
          logger.info(methodIn.getAbendLinea7().toString()); 
//  DISPLAY ABEND-LINEA8
          logger.info(new String(methodIn.getAbendLinea8())); 
//  DISPLAY ABEND-LINEA9
          logger.info(new String(methodIn.getAbendLinea9())); 
//  DISPLAY ABEND-LINEA10
          logger.info(new String(methodIn.getAbendLinea10())); 
//  DISPLAY ABEND-LINEA11
          logger.info(new String(methodIn.getAbendLinea11())); 
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
  
  
  
  
  
  
  
  
  }
