  package com.cloudframe.app.process;
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
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.bm80022.file.*;
  import com.cloudframe.app.repository.Bm80022Repository;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.bm80022.dto.*;
  import com.cloudframe.app.bm80022.dto.Sqlca;
  import com.cloudframe.app.bm80022.file.records.Ge0018f;
  import com.cloudframe.app.bm80022.dto.AbendLinea7;
  import com.cloudframe.app.bm80022.dto.AbendLinea6;
  import com.cloudframe.app.bm80022.dto.Contadors;
  import com.cloudframe.app.bm80022.dto.AbendLinea4;
  import com.cloudframe.app.bm80022.dto.Ge1801Array;
  import com.cloudframe.app.bm80022.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("bm80022")
  
  public class Bm80022 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Bm80022.class);
  
  private Sqlca sqlca = new Sqlca() ;
  private Ge0018f ge0018f = new Ge0018f() ;
  private AbendLinea7 abendLinea7 = new AbendLinea7() ;
  private AbendLinea6 abendLinea6 = new AbendLinea6() ;
  private Contadors contadors = new Contadors() ;
  private AbendLinea4 abendLinea4 = new AbendLinea4() ;
  private Ge1801Array ge1801Array = new Ge1801Array() ;
  private Work work = new Work() ;
  
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
      @Override
      public int process() throws Exception {
       initVars();
       try {
       setCodePage("1047");
          ;
//  PERFORM START-OF-PROGRAM
          startOfProgram();/*START-OF-PROGRAM*/
          if (this.isProgramEnded()) {
              return getRc();
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
      
       return getRc(); // Exit with return code
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
      private void startOfProgram() throws Exception {
//  PERFORM 1000-INICIO
          inicio();/*1000-INICIO*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESO UNTIL SW-FIN-CUR-GE18-SI
          while (!(work.isSwFinCurGe18Si()) ) {
             proceso();/*2000-PROCESO*/
             if (this.isProgramEnded()) {
                 return ;
             }
          }
//  PERFORM 3000-FIN
          fin();/*3000-FIN*/
          if (this.isProgramEnded()) {
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
      private void inicio() throws Exception {
      
// *=================================================================

// *=================================================================

// * -->  It+ s.a  - mrow - 11.05.2012 - x000566
//  INITIALIZE WS-CONTADORS
          contadors.initialize();
//  SET SW-FIN-CUR-GE18-NO TO TRUE
          work.setSwFinCurGe18NoTrue(); 
          
//  SET SW-NO-FIN-CUR-ROWSET TO TRUE
          work.setSwNoFinCurRowsetTrue(); 
          

// * <--  It+ s.a  - mrow - 11.05.2012 - x000566
//  PERFORM 1100-OPEN-FICHEROS
          openFicheros();/*1100-OPEN-FICHEROS*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 1200-OPEN-CUR-GE18
          openCurGe18();/*1200-OPEN-CUR-GE18*/
          if (this.isProgramEnded()) {
              return ;
          }

// * -->  It+ s.a  - mrow - 11.05.2012 - x000566
// *    perform 1300-fetch-cur-ge18
//  PERFORM 1300-LEER-CURSOR-MROW
          leerCursorMrow();/*1300-LEER-CURSOR-MROW*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 1310-RECUPERAR-FILA
          recuperarFila();/*1310-RECUPERAR-FILA*/
          if (this.isProgramEnded()) {
              return ;
          }

// * <--  It+ s.a  - mrow - 11.05.2012 - x000566
//  IF SW-FIN-CUR-GE18-SI
          if ( work.isSwFinCurGe18Si()  ) { 
//  DISPLAY '************************************************'
              logger.info("************************************************"); 
//  DISPLAY '*      PGM: GE80022.                           *'
              logger.info("*      PGM: GE80022.                           *"); 
//  DISPLAY '*      TABLA GE18 VACIA                        *'
              logger.info("*      TABLA GE18 VACIA                        *"); 
//  DISPLAY '************************************************'
              logger.info("************************************************"); 
          }
      
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
      private void openFicheros() throws Exception {
			// Declare local variables used in the method
			char[] fsGe0001w = null;
			// End of variable declaration

      
// *=================================================================

// *=================================================================
//  OPEN OUTPUT GE0001W
          ge0001w.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),ge0001w.getFileName(),ge0001w.getGe0001wCharSet(),ge0001w.getGe0001wCrlfFlag());
          work.setFsGe0001w(ge0001w.getStatusString() );
          fsGe0001w = work.getFsGe0001w();
//  IF FS-GE0001W NOT = ZEROES
          if (!( allZeros(fsGe0001w) ) /*  !=  zeros*/) { 
              // MOVE LIT-GE0001W TO WS-FICHERO
              work.setFichero(work.getLitGe0001w());
              // MOVE LIT-ABRIR TO WS-ACCESO
              work.setAcceso(work.getLitAbrir());
              // MOVE FS-GE0001W TO FILE-STATUS
              work.setFileStatus(work.getFsGe0001w());
//  PERFORM U9998-TRATAR-ERR-FICHERO
              tratarErrFichero();/*U9998-TRATAR-ERR-FICHERO*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
      
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
      private void openCurGe18() throws Exception {
      
// *=================================================================
//  SELECT GE1801_CODENTID , GE1801_TIPPRODUCT , GE1801_CODCONTRAT , GE1801_OFIGESTORA , GE1801_IDEPSIG , GE1801_NUMPERSONA , GE1801_NUMCARTERA , GE1801_CODCARTERA , GE1801_FECHAALTA , GE1801_FECHABAJA , GE1801_CODNODO , GE1801_RESAMBITO , GE1801_NUMRESAMB , GE1801_NUMPRESAMB , GE1801_CENGESCAPT , GE1801_NUMGESCAP , GE1801_NUMPGESCAP , GE1801_NUMPESPRIE , GE1801_CODCARRIE , GE1801_FECCIECURSO FROM GE1801 WHERE GE1801_CODENTID > '' ORDER BY GE1801_CODENTID
          bm80022Repository.openCurGe18Bm80022(sqlca);
//  MOVE SQLCODE TO WS-SQLCODE
          work.setSqlcode_Ws(sqlca.getSqlcode());
//  EVALUATE TRUE
          if  ( work.isDb2StatusOk()  ) { 
              ;
          }
          else   { 
              // MOVE '1200' TO ABEND-PARRAF
              abendLinea7.setAbendParraf(CONSTANTS.LITERAL_1200_B6_);
//  MOVE 'GE80022' TO ABEND-PROG
              abendLinea7.setAbendProg(CONSTANTS.LITERAL_GE80022_B_);
//  MOVE 'GE1801' TO ABEND-TABLA
              abendLinea6.setAbendTabla(CONSTANTS.LITERAL_GE1801_B_);
//  MOVE WS-SQLCODE TO ABEND-SQLCODE
              abendLinea6.setAbendSqlcode( work.getSqlcode_Ws());
//  MOVE 'OPEN-CURSOR' TO ABEND-SENTEN
              abendLinea7.setAbendSenten(CONSTANTS.LITERAL_OPEN_MN_CURSOR_B10_);
//  MOVE WK-ERROR-DB2 TO RETURN-CODE
              this.setRc(CFUtil.getInt(work.getWkErrorDb2()));
//  PERFORM 9000-FIN-CON-ERROR
              finConError();/*9000-FIN-CON-ERROR*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
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
      private void leerCursorMrow() throws Exception {
      
// *****************************************************************
// * 1300-Leer-cursor-mrow                                         *
// *****************************************************************
// FETCH NEXT ROWSET FROM CUR_GE18 FOR 100 ROWS INTO  ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ? 
//  MOVE 100 TO DSNNROWS
          work.setDsnnrows(100);
//  FETCH NEXT ROWSET FROM CUR_GE18 FOR 100 ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          bm80022Repository.fetchCurGe18Bm80022(sqlca,ge1801Array);
//  MOVE 100 TO DSNNROWS
          work.setDsnnrows(100);
//  MOVE SQLCODE TO WS-SQLCODE
          work.setSqlcode_Ws(sqlca.getSqlcode());
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  MOVE 1 TO POS-ROW
              work.setPosRow(1);
//  MOVE SQLERRD (3) TO REGS-RECUP-ROWSET
              work.setRegsRecupRowset(sqlca.getSqlerrd(2));
          break;
          	case 100:
//  IF SQLERRD (3) > 0
              if (	( sqlca.getSqlerrd(2) > 0 )) { 
//  MOVE 1 TO POS-ROW
                  work.setPosRow(1);
//  MOVE SQLERRD (3) TO REGS-RECUP-ROWSET
                  work.setRegsRecupRowset(sqlca.getSqlerrd(2));
//  SET SW-SI-FIN-CUR-ROWSET TO TRUE
                  work.setSwSiFinCurRowsetTrue(); 
                  
              }
//  ELSE
              else { 
//  MOVE 0 TO REGS-RECUP-ROWSET
                  work.setRegsRecupRowset(0);
//  SET SW-SI-FIN-CUR-ROWSET TO TRUE
                  work.setSwSiFinCurRowsetTrue(); 
                  
//  SET SW-FIN-CUR-GE18-SI TO TRUE
                  work.setSwFinCurGe18SiTrue(); 
                  
              }
          break;
          default :
//  MOVE 'ERROR EN OPEN CURSOR. ' TO ABEND-MENSAJE
              abendLinea4.setAbendMensaje(CONSTANTS.LITERAL_2055775089);
//  MOVE WS-SQLCODE TO ABEND-SQLCODE
              abendLinea6.setAbendSqlcode( work.getSqlcode_Ws());
//  MOVE 'GE1801' TO ABEND-TABLA
              abendLinea6.setAbendTabla(CONSTANTS.LITERAL_GE1801_B_);
//  MOVE LIT-PROGRAMA TO ABEND-PROG
              abendLinea7.setAbendProg(work.getLitPrograma());
//  MOVE ' 1300' TO ABEND-PARRAF
              abendLinea7.setAbendParraf(CONSTANTS.LITERAL_B6_1300);
//  MOVE 'FETCH-CURSOR' TO ABEND-SENTEN
              abendLinea7.setAbendSenten(CONSTANTS.LITERAL_FETCH_MN_CURSOR_B9_);
//  PERFORM 9000-FIN-CON-ERROR
              finConError();/*9000-FIN-CON-ERROR*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
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
      private void recuperarFila() throws Exception {
			// Declare local variables used in the method
			int regsRecupRowset = 0;
			int posRow = 0;
			// End of variable declaration

      
// ******************************************************************
// * 1310-Recuperar-fila
// ******************************************************************
          regsRecupRowset = work.getRegsRecupRowset();
          posRow = work.getPosRow();
//  IF POS-ROW > REGS-RECUP-ROWSET
          if (	( posRow > regsRecupRowset )) { 
//  IF SW-NO-FIN-CUR-ROWSET
              if ( work.isSwNoFinCurRowset()  ) { 
//  PERFORM 1300-LEER-CURSOR-MROW
                  leerCursorMrow();/*1300-LEER-CURSOR-MROW*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
                  regsRecupRowset = work.getRegsRecupRowset();
//  IF REGS-RECUP-ROWSET > 0
                  if (	( regsRecupRowset > 0 )) { 
//  PERFORM 1320-TRATAR-FILA
                      tratarFila();/*1320-TRATAR-FILA*/
//  ADD 1 TO POS-ROW
                      work.setPosRow(work.getPosRow()+1);
                  }
  
              }
//  ELSE
              else { 
//  SET SW-FIN-CUR-GE18-SI TO TRUE
                  work.setSwFinCurGe18SiTrue(); 
                  
              }
          }
  
//  ELSE
          else { 
//  PERFORM 1320-TRATAR-FILA
              tratarFila();/*1320-TRATAR-FILA*/
//  ADD 1 TO POS-ROW
              work.setPosRow(work.getPosRow()+1);
          }
      
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
      private void tratarFila() throws Exception {
      
// ******************************************************************
// * 1320-Tratar-fila
// ******************************************************************
//  ADD 1 TO WS-LLEGITS-GE1801
          contadors.setLlegitsGe1801(contadors.getLlegitsGe1801()+(long)1);
//  PERFORM 1330-MOVER-ROWSET
          moverRowset();/*1330-MOVER-ROWSET*/
          ;
      
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
      private void moverRowset() throws Exception {
      
// ******************************************************************
// * 1330-Mover-rowset
// ******************************************************************
//  MOVE GE1801-A-CODENTID ( POS-ROW ) TO GE1801-CODENTID
          work.setGe1801Codentid(ge1801Array.getGe1801ACodentid(work.getPosRow() - 1));
//  MOVE GE1801-A-TIPPRODUCT ( POS-ROW ) TO GE1801-TIPPRODUCT
          work.setGe1801Tipproduct(ge1801Array.getGe1801ATipproduct(work.getPosRow() - 1));
//  MOVE GE1801-A-CODCONTRAT ( POS-ROW ) TO GE1801-CODCONTRAT
          work.setGe1801Codcontrat(ge1801Array.getGe1801ACodcontrat((work.getPosRow() - 1)));
//  MOVE GE1801-A-OFIGESTORA ( POS-ROW ) TO GE1801-OFIGESTORA
          work.setGe1801Ofigestora(ge1801Array.getGe1801AOfigestora((work.getPosRow() - 1)));
//  MOVE GE1801-A-IDEPSIG ( POS-ROW ) TO GE1801-IDEPSIG
          work.setGe1801Idepsig(ge1801Array.getGe1801AIdepsig(work.getPosRow() - 1));
//  MOVE GE1801-A-NUMPERSONA ( POS-ROW ) TO GE1801-NUMPERSONA
          work.setGe1801Numpersona(ge1801Array.getGe1801ANumpersona((work.getPosRow() - 1)));
//  MOVE GE1801-A-NUMCARTERA ( POS-ROW ) TO GE1801-NUMCARTERA
          work.setGe1801Numcartera(ge1801Array.getGe1801ANumcartera((work.getPosRow() - 1)));
//  MOVE GE1801-A-CODCARTERA ( POS-ROW ) TO GE1801-CODCARTERA
          work.setGe1801Codcartera(ge1801Array.getGe1801ACodcartera(work.getPosRow() - 1));
//  MOVE GE1801-A-FECHAALTA ( POS-ROW ) TO GE1801-FECHAALTA
          work.setGe1801Fechaalta(ge1801Array.getGe1801AFechaalta(work.getPosRow() - 1));
//  MOVE GE1801-A-FECHABAJA ( POS-ROW ) TO GE1801-FECHABAJA
          work.setGe1801Fechabaja(ge1801Array.getGe1801AFechabaja(work.getPosRow() - 1));
//  MOVE GE1801-A-CODNODO ( POS-ROW ) TO GE1801-CODNODO
          work.setGe1801Codnodo(ge1801Array.getGe1801ACodnodo(work.getPosRow() - 1));
//  MOVE GE1801-A-RESAMBITO ( POS-ROW ) TO GE1801-RESAMBITO
          work.setGe1801Resambito(ge1801Array.getGe1801AResambito(work.getPosRow() - 1));
//  MOVE GE1801-A-NUMRESAMB ( POS-ROW ) TO GE1801-NUMRESAMB
          work.setGe1801Numresamb(ge1801Array.getGe1801ANumresamb((work.getPosRow() - 1)));
//  MOVE GE1801-A-NUMPRESAMB ( POS-ROW ) TO GE1801-NUMPRESAMB
          work.setGe1801Numpresamb(ge1801Array.getGe1801ANumpresamb((work.getPosRow() - 1)));
//  MOVE GE1801-A-CENGESCAPT ( POS-ROW ) TO GE1801-CENGESCAPT
          work.setGe1801Cengescapt(ge1801Array.getGe1801ACengescapt(work.getPosRow() - 1));
//  MOVE GE1801-A-NUMGESCAP ( POS-ROW ) TO GE1801-NUMGESCAP
          work.setGe1801Numgescap(ge1801Array.getGe1801ANumgescap((work.getPosRow() - 1)));
//  MOVE GE1801-A-NUMPGESCAP ( POS-ROW ) TO GE1801-NUMPGESCAP
          work.setGe1801Numpgescap(ge1801Array.getGe1801ANumpgescap((work.getPosRow() - 1)));
//  MOVE GE1801-A-NUMPESPRIE ( POS-ROW ) TO GE1801-NUMPESPRIE
          work.setGe1801Numpesprie(ge1801Array.getGe1801ANumpesprie((work.getPosRow() - 1)));
//  MOVE GE1801-A-CODCARRIE ( POS-ROW ) TO GE1801-CODCARRIE
          work.setGe1801Codcarrie(ge1801Array.getGe1801ACodcarrie(work.getPosRow() - 1));
//  MOVE GE1801-A-FECCIECURSO ( POS-ROW ) TO GE1801-FECCIECURSO
          work.setGe1801Fecciecurso(ge1801Array.getGe1801AFecciecurso(work.getPosRow() - 1));
      
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
      private void closeCurGe18() throws Exception {
      
// * <--  It+ s.a  - mrow - 11.05.2012 - x000566
// *
// *=================================================================
//  CLOSE CUR_GE18
          bm80022Repository.closeCurGe18Bm80022(sqlca);
//  MOVE SQLCODE TO WS-SQLCODE
          work.setSqlcode_Ws(sqlca.getSqlcode());
//  EVALUATE TRUE
          if  ( work.isDb2StatusOk()  ) { 
              ;
          }
          else   { 
              // MOVE '1400' TO ABEND-PARRAF
              abendLinea7.setAbendParraf(CONSTANTS.LITERAL_1400_B6_);
//  MOVE 'GE80022' TO ABEND-PROG
              abendLinea7.setAbendProg(CONSTANTS.LITERAL_GE80022_B_);
//  MOVE 'GE1801' TO ABEND-TABLA
              abendLinea6.setAbendTabla(CONSTANTS.LITERAL_GE1801_B_);
//  MOVE SQLCODE TO ABEND-SQLCODE
              abendLinea6.setAbendSqlcode( sqlca.getSqlcode());
//  MOVE 'CLOSE-CURSOR ' TO ABEND-SENTEN
              abendLinea7.setAbendSenten(CONSTANTS.LITERAL_CLOSE_MN_CURSOR_B9_);
//  MOVE WK-ERROR-DB2 TO RETURN-CODE
              this.setRc(CFUtil.getInt(work.getWkErrorDb2()));
//  PERFORM 9000-FIN-CON-ERROR
              finConError();/*9000-FIN-CON-ERROR*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
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
      private void proceso() throws Exception {
      
// *=================================================================

// *=================================================================
//  SET SW-NO-INFO-SALIDA TO TRUE
          work.setSwNoInfoSalidaTrue(); 
          
//  PERFORM 2100-INFORMAR-SALIDA
          informarSalida();/*2100-INFORMAR-SALIDA*/
          if (this.isProgramEnded()) {
              return ;
          }

// * -->  It+ s.a  - mrow - 11.05.2012 - x000566
// *    perform 1300-fetch-cur-ge18.

// *=================================================================

// *=================================================================
// *

// *
//  PERFORM 1310-RECUPERAR-FILA
          recuperarFila();/*1310-RECUPERAR-FILA*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
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
      private void informarSalida() throws Exception {
//  INITIALIZE GE0018F
          ge0018f.initialize();
//  MOVE GE1801-CODENTID TO GE0018F-CODENTID
          ge0018f.setGe0018fCodentid(work.getGe1801Codentid());
//  MOVE GE1801-TIPPRODUCT TO GE0018F-TIPPRODUCT
          ge0018f.setGe0018fTipproduct(work.getGe1801Tipproduct());
//  MOVE GE1801-CODCONTRAT TO GE0018F-CODCONTRAT
          ge0018f.setGe0018fCodcontrat(work.getGe1801Codcontrat());
//  MOVE GE1801-OFIGESTORA TO GE0018F-OFIGESTORA
          ge0018f.setGe0018fOfigestora(work.getGe1801Ofigestora());
//  MOVE GE1801-IDEPSIG TO GE0018F-IDEPSIG
          ge0018f.setGe0018fIdepsig(work.getGe1801Idepsig());
//  MOVE GE1801-NUMPERSONA TO GE0018F-NUMPERSONA
          ge0018f.setGe0018fNumpersona(work.getGe1801Numpersona());
//  MOVE GE1801-NUMCARTERA TO GE0018F-NUMCARTERA
          ge0018f.setGe0018fNumcartera( work.getGe1801Numcartera());
//  MOVE GE1801-CODCARTERA TO GE0018F-CODCARTERA
          ge0018f.setGe0018fCodcartera(work.getGe1801Codcartera());
//  MOVE GE1801-FECHAALTA TO GE0018F-FECHAALTA
          ge0018f.setGe0018fFechaalta(work.getGe1801Fechaalta());
//  MOVE GE1801-FECHABAJA TO GE0018F-FECHABAJA
          ge0018f.setGe0018fFechabaja(work.getGe1801Fechabaja());
//  MOVE GE1801-CODNODO TO GE0018F-CODNODO
          ge0018f.setGe0018fCodnodo(work.getGe1801Codnodo());
//  MOVE GE1801-RESAMBITO TO GE0018F-RESAMBITO
          ge0018f.setGe0018fResambito(work.getGe1801Resambito());
//  MOVE GE1801-NUMRESAMB TO GE0018F-NUMRESAMB
          ge0018f.setGe0018fNumresamb(work.getGe1801Numresamb());
//  MOVE GE1801-NUMPRESAMB TO GE0018F-NUMPRESAMB
          ge0018f.setGe0018fNumpresamb(work.getGe1801Numpresamb());
//  MOVE GE1801-CENGESCAPT TO GE0018F-CENGESCAPT
          ge0018f.setGe0018fCengescapt(work.getGe1801Cengescapt());
//  MOVE GE1801-NUMGESCAP TO GE0018F-NUMGESCAP
          ge0018f.setGe0018fNumgescap(work.getGe1801Numgescap());
//  MOVE GE1801-NUMPGESCAP TO GE0018F-NUMPGESCAP
          ge0018f.setGe0018fNumpgescap(work.getGe1801Numpgescap());
//  MOVE GE1801-NUMPESPRIE TO GE0018F-NUMPESPRIE
          ge0018f.setGe0018fNumpesprie(work.getGe1801Numpesprie());
//  MOVE GE1801-CODCARRIE TO GE0018F-CODCARRIE
          ge0018f.setGe0018fCodcarrie(work.getGe1801Codcarrie());
//  MOVE GE1801-FECCIECURSO TO GE0018F-FECCIECURSO
          ge0018f.setGe0018fFecciecurso(work.getGe1801Fecciecurso());

// *

// *=================================================================

// *=================================================================
// *

// *
//  PERFORM 2110-ESCRIBIR-SALIDA
          escribirSalida();/*2110-ESCRIBIR-SALIDA*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
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
      private void escribirSalida() throws Exception {
//  WRITE GE0018F
          ge0001w.write(ge0018f.toCharArray()); 
          ge0018f.setString(CONSTANTS.LOW_VALUE_215751770);
          work.setFsGe0001w(ge0001w.getStatusString() );
//  EVALUATE FS-GE0001W
          switch(new String(work.getFsGe0001w())){
          	case "00":
//  ADD 1 TO WS-GRAVATS-GE0001W
              contadors.setGravatsGe0001w(contadors.getGravatsGe0001w()+(long)1);
          break;
          default :
              // MOVE LIT-GE0001W TO WS-FICHERO
              work.setFichero(work.getLitGe0001w());
              // MOVE LIT-WRITE TO WS-ACCESO
              work.setAcceso(work.getLitWrite());
              // MOVE FS-GE0001W TO FILE-STATUS
              work.setFileStatus(work.getFsGe0001w());
//  PERFORM U9998-TRATAR-ERR-FICHERO
              tratarErrFichero();/*U9998-TRATAR-ERR-FICHERO*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
      }
      /**
      * fin 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-FIN COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void fin() throws Exception {
      
// *
// *================================================================

// *=================================================================
//  PERFORM 3100-CERRAR-FICHEROS
          cerrarFicheros();/*3100-CERRAR-FICHEROS*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 1400-CLOSE-CUR-GE18
          closeCurGe18();/*1400-CLOSE-CUR-GE18*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM U9990-ESTADISTICAS
          estadisticas();/*U9990-ESTADISTICAS*/
          if (this.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
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
      private void cerrarFicheros() throws Exception {
			// Declare local variables used in the method
			char[] fsGe0001w = null;
			// End of variable declaration

      
// *=================================================================

// *=================================================================
//  CLOSE GE0001W
          ge0001w.close(); 
          work.setFsGe0001w(ge0001w.getStatusString() );
          fsGe0001w = work.getFsGe0001w();
//  IF FS-GE0001W NOT = ZEROES
          if (!( allZeros(fsGe0001w) ) /*  !=  zeros*/) { 
              // MOVE LIT-GE0001W TO WS-FICHERO
              work.setFichero(work.getLitGe0001w());
              // MOVE LIT-CERRAR TO WS-ACCESO
              work.setAcceso(work.getLitCerrar());
              // MOVE FS-GE0001W TO FILE-STATUS
              work.setFileStatus(work.getFsGe0001w());
//  PERFORM U9998-TRATAR-ERR-FICHERO
              tratarErrFichero();/*U9998-TRATAR-ERR-FICHERO*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
      
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
      private void estadisticas() throws Exception {
      
// *=================================================================

// *=================================================================
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
          logger.info("REGISTROS LEIDOS GE1801....:   {}", String.valueOf(contadors.getLlegitsGe1801())); 
//  DISPLAY 'REGISTROS GRABADOS GE0001W :   ' WS-GRAVATS-GE0001W
          logger.info("REGISTROS GRABADOS GE0001W :   {}", String.valueOf(contadors.getGravatsGe0001w())); 
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
      private void tratarErrFichero() throws Exception {
      
// *=================================================================

// *=================================================================
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
          logger.info(" FICHERO       : {}", new String(work.getFichero())); 
//  DISPLAY ' ACCESO        : ' , WS-ACCESO
          logger.info(" ACCESO        : {}", new String(work.getAcceso())); 
//  DISPLAY ' FILE-STATUS   : ' , FILE-STATUS
          logger.info(" FILE-STATUS   : {}", new String(work.getFileStatus())); 
//  DISPLAY '                                                '
          logger.info("                                                "); 
//  DISPLAY '================================================'
          logger.info("================================================"); 
//  PERFORM U9999-ABORTAR
          abortar();/*U9999-ABORTAR*/
          if (this.isProgramEnded()) {
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
      private void abortar() throws Exception {
      
// *=================================================================

// *=================================================================
//  PERFORM U9990-ESTADISTICAS
          estadisticas();/*U9990-ESTADISTICAS*/
          if (this.isProgramEnded()) {
              return ;
          }
//  MOVE '12' TO RETURN-CODE
          this.setRc(12);
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
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
      private void finConError() throws Exception {
      
// *=================================================================

// *=================================================================
//  PERFORM U9990-ESTADISTICAS
          estadisticas();/*U9990-ESTADISTICAS*/
          if (this.isProgramEnded()) {
              return ;
          }
//  MOVE '35' TO RETURN-CODE
          this.setRc(35);
//  DISPLAY ABEND-LINEA1
          logger.info(new String(work.getAbendLinea1())); 
//  DISPLAY ABEND-LINEA2
          logger.info(new String(work.getAbendLinea2())); 
//  DISPLAY ABEND-LINEA3
          logger.info(new String(work.getAbendLinea3())); 
//  DISPLAY ABEND-LINEA4
          logger.info(abendLinea4.toString()); 
//  DISPLAY ABEND-LINEA5
          logger.info(new String(work.getAbendLinea5())); 
//  DISPLAY ABEND-LINEA6
          logger.info(abendLinea6.toString()); 
//  DISPLAY ABEND-LINEA7
          logger.info(abendLinea7.toString()); 
//  DISPLAY ABEND-LINEA8
          logger.info(new String(work.getAbendLinea8())); 
//  DISPLAY ABEND-LINEA9
          logger.info(new String(work.getAbendLinea9())); 
//  DISPLAY ABEND-LINEA10
          logger.info(new String(work.getAbendLinea10())); 
//  DISPLAY ABEND-LINEA11
          logger.info(new String(work.getAbendLinea11())); 
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
  
  
      /**
* This method pre-initializes variables consistent with
* what a mainframe program would have done at the start of a program
*/
      @Override
      public void initVars() throws CFException {
      setProgramEnded(false);
          db2Base.reset("BM80022" ,dbQualifier, true/*use Dynamic SQL*/);
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
        CFUtil.setDecimalAsComma();
       }
  
  
  
  
  
  
  }
