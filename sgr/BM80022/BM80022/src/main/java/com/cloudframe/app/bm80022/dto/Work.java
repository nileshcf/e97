package com.cloudframe.app.bm80022.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/


import com.cloudframe.app.bm80022.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] litAbrir = new char[5];

						private char[] litWrite = new char[5];

						private char[] litCerrar = new char[6];

						private char[] litGe0001w = new char[8];

						private char[] litPrograma = new char[8];

						private char[] acceso = new char[8];

						private char[] fichero = new char[7];

						private char[] fileStatus = new char[2];

						private char[] fsGe0001w = new char[2];

								private int sqlcode_Ws;

						private char[] wkErrorDb2 = new char[2];

						private char[] swFinCurGe18 = Field.fillLowValue(1);

						private char[] swInfoSalida = Field.fillLowValue(1);

						private char[] swFinCursorRowset = new char[1];

								private int posRow;

								private int regsRecupRowset;

						private char[] abendLinea1 = new char[80];

						private char[] abendLinea2 = new char[80];

						private char[] abendLinea3 = new char[80];

						private char[] abendLinea5 = new char[80];

						private char[] abendLinea8 = new char[80];

						private char[] abendLinea9 = new char[80];

						private char[] abendLinea10 = new char[80];

						private char[] abendLinea11 = new char[80];

						private char[] ge1801Codentid = Field.fillLowValue(2);

						private char[] ge1801Tipproduct = Field.fillLowValue(3);

								private long ge1801Codcontrat;

								private short ge1801Ofigestora;

						private char[] ge1801Idepsig = Field.fillLowValue(12);

								private int ge1801Numpersona;

								private int ge1801Numcartera;

						private char[] ge1801Codcartera = Field.fillLowValue(8);

						private char[] ge1801Fechaalta = Field.fillLowValue(10);

						private char[] ge1801Fechabaja = Field.fillLowValue(10);

						private char[] ge1801Codnodo = Field.fillLowValue(8);

						private char[] ge1801Resambito = Field.fillLowValue(12);

								private int ge1801Numresamb;

								private int ge1801Numpresamb;

						private char[] ge1801Cengescapt = Field.fillLowValue(8);

								private int ge1801Numgescap;

								private int ge1801Numpgescap;

								private int ge1801Numpesprie;

						private char[] ge1801Codcarrie = Field.fillLowValue(8);

						private char[] ge1801Fecciecurso = Field.fillLowValue(10);

								private int dsnnrows;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setLitAbrir(("ABRIR").toCharArray());
								setLitWrite(("WRITE").toCharArray());
								setLitCerrar(("CERRAR").toCharArray());
								setLitGe0001w(("GE0001W ").toCharArray());
								setLitPrograma(("GE80022 ").toCharArray());
								setAcceso(fillSpace(8));
								setFichero(fillSpace(7));
								setFileStatus(("00").toCharArray());
								setFsGe0001w(("00").toCharArray());
								setWkErrorDb2(("35").toCharArray());
								setSwFinCursorRowset(("N").toCharArray());
								setPosRow(0);
								setRegsRecupRowset(0);
								setAbendLinea1(String.join("", java.util.Collections.nCopies(80, "*")).toCharArray());
								setAbendLinea2("*****                             A  B  E  N  D                            *****".toCharArray());
								setAbendLinea3(String.join("", java.util.Collections.nCopies(80, "*")).toCharArray());
								setAbendLinea5("*                                                                              *".toCharArray());
								setAbendLinea8("*                                                                              *".toCharArray());
								setAbendLinea9(String.join("", java.util.Collections.nCopies(80, "*")).toCharArray());
								setAbendLinea10(pad(80," ".toCharArray(),' ',RIGHT_PAD));
								setAbendLinea11(pad(80," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of litAbrir
	 *	@return litAbrir
	 */
   public char[] getLitAbrir() throws CFException{
   		return litAbrir;
   }

  
	/**
	*  set variable litAbrir
	*  Corresponding COBOL Variable is LIT-ABRIR
	*  @param value
	**/
   public void setLitAbrir(char[] value) {
       value = checkLitAbrirConstraints(value);
       arraycopy(value,0,litAbrir,0,value.length);
   } 
	public void setLitAbrir(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,litAbrir,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of litWrite
	 *	@return litWrite
	 */
   public char[] getLitWrite() throws CFException{
   		return litWrite;
   }

  
	/**
	*  set variable litWrite
	*  Corresponding COBOL Variable is LIT-WRITE
	*  @param value
	**/
   public void setLitWrite(char[] value) {
       value = checkLitWriteConstraints(value);
       arraycopy(value,0,litWrite,0,value.length);
   } 
	public void setLitWrite(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,litWrite,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of litCerrar
	 *	@return litCerrar
	 */
   public char[] getLitCerrar() throws CFException{
   		return litCerrar;
   }

  
	/**
	*  set variable litCerrar
	*  Corresponding COBOL Variable is LIT-CERRAR
	*  @param value
	**/
   public void setLitCerrar(char[] value) {
       value = checkLitCerrarConstraints(value);
       arraycopy(value,0,litCerrar,0,value.length);
   } 
	public void setLitCerrar(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,litCerrar,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of litGe0001w
	 *	@return litGe0001w
	 */
   public char[] getLitGe0001w() throws CFException{
   		return litGe0001w;
   }

  
	/**
	*  set variable litGe0001w
	*  Corresponding COBOL Variable is LIT-GE0001W
	*  @param value
	**/
   public void setLitGe0001w(char[] value) {
       value = checkLitGe0001wConstraints(value);
       arraycopy(value,0,litGe0001w,0,value.length);
   } 
	public void setLitGe0001w(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,litGe0001w,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of litPrograma
	 *	@return litPrograma
	 */
   public char[] getLitPrograma() throws CFException{
   		return litPrograma;
   }

  
	/**
	*  set variable litPrograma
	*  Corresponding COBOL Variable is LIT-PROGRAMA
	*  @param value
	**/
   public void setLitPrograma(char[] value) {
       value = checkLitProgramaConstraints(value);
       arraycopy(value,0,litPrograma,0,value.length);
   } 
	public void setLitPrograma(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,litPrograma,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of acceso
	 *	@return acceso
	 */
   public char[] getAcceso() throws CFException{
   		return acceso;
   }

  
	/**
	*  set variable acceso
	*  Corresponding COBOL Variable is WS-ACCESO
	*  @param value
	**/
   public void setAcceso(char[] value) {
       value = checkAccesoConstraints(value);
       arraycopy(value,0,acceso,0,value.length);
   } 
	public void setAcceso(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,acceso,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of fichero
	 *	@return fichero
	 */
   public char[] getFichero() throws CFException{
   		return fichero;
   }

  
	/**
	*  set variable fichero
	*  Corresponding COBOL Variable is WS-FICHERO
	*  @param value
	**/
   public void setFichero(char[] value) {
       value = checkFicheroConstraints(value);
       arraycopy(value,0,fichero,0,value.length);
   } 
	public void setFichero(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fichero,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of fileStatus
	 *	@return fileStatus
	 */
   public char[] getFileStatus() throws CFException{
   		return fileStatus;
   }

  
	/**
	*  set variable fileStatus
	*  Corresponding COBOL Variable is FILE-STATUS
	*  @param value
	**/
   public void setFileStatus(char[] value) {
       value = checkFileStatusConstraints(value);
       arraycopy(value,0,fileStatus,0,value.length);
   } 
	public void setFileStatus(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fileStatus,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of fsGe0001w
	 *	@return fsGe0001w
	 */
   public char[] getFsGe0001w() throws CFException{
   		return fsGe0001w;
   }

  
	/**
	*  set variable fsGe0001w
	*  Corresponding COBOL Variable is FS-GE0001W
	*  @param value
	**/
   public void setFsGe0001w(char[] value) {
       value = checkFsGe0001wConstraints(value);
       arraycopy(value,0,fsGe0001w,0,value.length);
   } 
	public void setFsGe0001w(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fsGe0001w,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
	public int getSqlcode_Ws() throws CFException {
   		return sqlcode_Ws;
	}
	
	/**
	 * 	Update Sqlcode_Ws with the passed value
	 *  Corresponding COBOL Variable is WS-SQLCODE
	 *	@param number
	 */
	public void setSqlcode_Ws(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlcode_Ws = checkSqlcode_WsMaxLimit(number); 
	}


	public void setSqlcode_Ws(long number) {
	    number = checkSqlcode_WsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSqlcode_Ws((int)number);
	}
	
	
	/**
	 *	Test condition 100 for isDb2NotFound()
	 *	@return  Returns true if isDb2NotFound() is 100
	 */
   public boolean isDb2NotFound() throws CFException {
      return (  getSqlcode_Ws()  ==  100  );
   }


	/**
	*  set values 100
	*/
   	public void setDb2NotFoundTrue() {  			
    	setSqlcode_Ws( 100);
   	}
	
	/**
	 *	Test condition 0 for isDb2StatusOk()
	 *	@return  Returns true if isDb2StatusOk() is 0
	 */
   public boolean isDb2StatusOk() throws CFException {
      return (  getSqlcode_Ws()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setDb2StatusOkTrue() {  			
    	setSqlcode_Ws( 0);
   	}
	/**
	 *	Returns the value of wkErrorDb2
	 *	@return wkErrorDb2
	 */
   public char[] getWkErrorDb2() throws CFException{
   		return wkErrorDb2;
   }

  
	/**
	*  set variable wkErrorDb2
	*  Corresponding COBOL Variable is WK-ERROR-DB2
	*  @param value
	**/
   public void setWkErrorDb2(char[] value) {
       value = checkWkErrorDb2Constraints(value);
       arraycopy(value,0,wkErrorDb2,0,value.length);
   } 
	public void setWkErrorDb2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wkErrorDb2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of swFinCurGe18
	 *	@return swFinCurGe18
	 */
   public char[] getSwFinCurGe18() throws CFException{
   		return swFinCurGe18;
   }

  
	/**
	*  set variable swFinCurGe18
	*  Corresponding COBOL Variable is SW-FIN-CUR-GE18
	*  @param value
	**/
   public void setSwFinCurGe18(char[] value) {
       value = checkSwFinCurGe18Constraints(value);
       arraycopy(value,0,swFinCurGe18,0,value.length);
   } 
	public void setSwFinCurGe18(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,swFinCurGe18,0,beginIndex + endIndex);
   }
	char[] swFinCurGe18Si88Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isSwFinCurGe18Si()
	 *	@return  Returns true if isSwFinCurGe18Si() is "S"
	 */
   public boolean isSwFinCurGe18Si() throws CFException {
      return (  compareChars( getSwFinCurGe18() , swFinCurGe18Si88Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setSwFinCurGe18SiTrue() {  			
    	setSwFinCurGe18( swFinCurGe18Si88Value);
   	}
	char[] swFinCurGe18No88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSwFinCurGe18No()
	 *	@return  Returns true if isSwFinCurGe18No() is "N"
	 */
   public boolean isSwFinCurGe18No() throws CFException {
      return (  compareChars( getSwFinCurGe18() , swFinCurGe18No88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSwFinCurGe18NoTrue() {  			
    	setSwFinCurGe18( swFinCurGe18No88Value);
   	}
	/**
	 *	Returns the value of swInfoSalida
	 *	@return swInfoSalida
	 */
   public char[] getSwInfoSalida() throws CFException{
   		return swInfoSalida;
   }

  
	/**
	*  set variable swInfoSalida
	*  Corresponding COBOL Variable is SW-INFO-SALIDA
	*  @param value
	**/
   public void setSwInfoSalida(char[] value) {
       value = checkSwInfoSalidaConstraints(value);
       arraycopy(value,0,swInfoSalida,0,value.length);
   } 
	public void setSwInfoSalida(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,swInfoSalida,0,beginIndex + endIndex);
   }
	char[] swSiInfoSalida88Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isSwSiInfoSalida()
	 *	@return  Returns true if isSwSiInfoSalida() is "S"
	 */
   public boolean isSwSiInfoSalida() throws CFException {
      return (  compareChars( getSwInfoSalida() , swSiInfoSalida88Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setSwSiInfoSalidaTrue() {  			
    	setSwInfoSalida( swSiInfoSalida88Value);
   	}
	char[] swNoInfoSalida88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSwNoInfoSalida()
	 *	@return  Returns true if isSwNoInfoSalida() is "N"
	 */
   public boolean isSwNoInfoSalida() throws CFException {
      return (  compareChars( getSwInfoSalida() , swNoInfoSalida88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSwNoInfoSalidaTrue() {  			
    	setSwInfoSalida( swNoInfoSalida88Value);
   	}
	/**
	 *	Returns the value of swFinCursorRowset
	 *	@return swFinCursorRowset
	 */
   public char[] getSwFinCursorRowset() throws CFException{
   		return swFinCursorRowset;
   }

  
	/**
	*  set variable swFinCursorRowset
	*  Corresponding COBOL Variable is SW-FIN-CURSOR-ROWSET
	*  @param value
	**/
   public void setSwFinCursorRowset(char[] value) {
       value = checkSwFinCursorRowsetConstraints(value);
       arraycopy(value,0,swFinCursorRowset,0,value.length);
   } 
	public void setSwFinCursorRowset(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,swFinCursorRowset,0,beginIndex + endIndex);
   }
	char[] swSiFinCurRowset88Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isSwSiFinCurRowset()
	 *	@return  Returns true if isSwSiFinCurRowset() is "S"
	 */
   public boolean isSwSiFinCurRowset() throws CFException {
      return (  compareChars( getSwFinCursorRowset() , swSiFinCurRowset88Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setSwSiFinCurRowsetTrue() {  			
    	setSwFinCursorRowset( swSiFinCurRowset88Value);
   	}
	char[] swNoFinCurRowset88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSwNoFinCurRowset()
	 *	@return  Returns true if isSwNoFinCurRowset() is "N"
	 */
   public boolean isSwNoFinCurRowset() throws CFException {
      return (  compareChars( getSwFinCursorRowset() , swNoFinCurRowset88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSwNoFinCurRowsetTrue() {  			
    	setSwFinCursorRowset( swNoFinCurRowset88Value);
   	}
	/**
	 *	Returns the value of posRow
	 *	@return posRow
	 */
	public int getPosRow() throws CFException {
   		return posRow;
	}
	
	/**
	 * 	Update PosRow with the passed value
	 *  Corresponding COBOL Variable is POS-ROW
	 *	@param number
	 */
	public void setPosRow(int number) {
	     // Truncate if the number is beyond +/- Max range
	    posRow = checkPosRowMaxLimit(number); 
	}


	public void setPosRow(long number) {
	    number = checkPosRowMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPosRow((int)number);
	}
	
	/**
	 *	Returns the value of regsRecupRowset
	 *	@return regsRecupRowset
	 */
	public int getRegsRecupRowset() throws CFException {
   		return regsRecupRowset;
	}
	
	/**
	 * 	Update RegsRecupRowset with the passed value
	 *  Corresponding COBOL Variable is REGS-RECUP-ROWSET
	 *	@param number
	 */
	public void setRegsRecupRowset(int number) {
	     // Truncate if the number is beyond +/- Max range
	    regsRecupRowset = checkRegsRecupRowsetMaxLimit(number); 
	}


	public void setRegsRecupRowset(long number) {
	    number = checkRegsRecupRowsetMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRegsRecupRowset((int)number);
	}
	
	/**
	 *	Returns the value of abendLinea1
	 *	@return abendLinea1
	 */
   public char[] getAbendLinea1() throws CFException{
   		return abendLinea1;
   }

  
	/**
	*  set variable abendLinea1
	*  Corresponding COBOL Variable is ABEND-LINEA1
	*  @param value
	**/
   public void setAbendLinea1(char[] value) {
       value = checkAbendLinea1Constraints(value);
       arraycopy(value,0,abendLinea1,0,value.length);
   } 
	public void setAbendLinea1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendLinea1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendLinea2
	 *	@return abendLinea2
	 */
   public char[] getAbendLinea2() throws CFException{
   		return abendLinea2;
   }

  
	/**
	*  set variable abendLinea2
	*  Corresponding COBOL Variable is ABEND-LINEA2
	*  @param value
	**/
   public void setAbendLinea2(char[] value) {
       value = checkAbendLinea2Constraints(value);
       arraycopy(value,0,abendLinea2,0,value.length);
   } 
	public void setAbendLinea2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendLinea2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendLinea3
	 *	@return abendLinea3
	 */
   public char[] getAbendLinea3() throws CFException{
   		return abendLinea3;
   }

  
	/**
	*  set variable abendLinea3
	*  Corresponding COBOL Variable is ABEND-LINEA3
	*  @param value
	**/
   public void setAbendLinea3(char[] value) {
       value = checkAbendLinea3Constraints(value);
       arraycopy(value,0,abendLinea3,0,value.length);
   } 
	public void setAbendLinea3(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendLinea3,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendLinea5
	 *	@return abendLinea5
	 */
   public char[] getAbendLinea5() throws CFException{
   		return abendLinea5;
   }

  
	/**
	*  set variable abendLinea5
	*  Corresponding COBOL Variable is ABEND-LINEA5
	*  @param value
	**/
   public void setAbendLinea5(char[] value) {
       value = checkAbendLinea5Constraints(value);
       arraycopy(value,0,abendLinea5,0,value.length);
   } 
	public void setAbendLinea5(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendLinea5,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendLinea8
	 *	@return abendLinea8
	 */
   public char[] getAbendLinea8() throws CFException{
   		return abendLinea8;
   }

  
	/**
	*  set variable abendLinea8
	*  Corresponding COBOL Variable is ABEND-LINEA8
	*  @param value
	**/
   public void setAbendLinea8(char[] value) {
       value = checkAbendLinea8Constraints(value);
       arraycopy(value,0,abendLinea8,0,value.length);
   } 
	public void setAbendLinea8(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendLinea8,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendLinea9
	 *	@return abendLinea9
	 */
   public char[] getAbendLinea9() throws CFException{
   		return abendLinea9;
   }

  
	/**
	*  set variable abendLinea9
	*  Corresponding COBOL Variable is ABEND-LINEA9
	*  @param value
	**/
   public void setAbendLinea9(char[] value) {
       value = checkAbendLinea9Constraints(value);
       arraycopy(value,0,abendLinea9,0,value.length);
   } 
	public void setAbendLinea9(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendLinea9,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendLinea10
	 *	@return abendLinea10
	 */
   public char[] getAbendLinea10() throws CFException{
   		return abendLinea10;
   }

  
	/**
	*  set variable abendLinea10
	*  Corresponding COBOL Variable is ABEND-LINEA10
	*  @param value
	**/
   public void setAbendLinea10(char[] value) {
       value = checkAbendLinea10Constraints(value);
       arraycopy(value,0,abendLinea10,0,value.length);
   } 
	public void setAbendLinea10(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendLinea10,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendLinea11
	 *	@return abendLinea11
	 */
   public char[] getAbendLinea11() throws CFException{
   		return abendLinea11;
   }

  
	/**
	*  set variable abendLinea11
	*  Corresponding COBOL Variable is ABEND-LINEA11
	*  @param value
	**/
   public void setAbendLinea11(char[] value) {
       value = checkAbendLinea11Constraints(value);
       arraycopy(value,0,abendLinea11,0,value.length);
   } 
	public void setAbendLinea11(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendLinea11,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ge1801Codentid
	 *	@return ge1801Codentid
	 */
   public char[] getGe1801Codentid() throws CFException{
   		return ge1801Codentid;
   }

  
	/**
	*  set variable ge1801Codentid
	*  Corresponding COBOL Variable is GE1801-CODENTID
	*  @param value
	**/
   public void setGe1801Codentid(char[] value) {
       value = checkGe1801CodentidConstraints(value);
       arraycopy(value,0,ge1801Codentid,0,value.length);
   } 
	public void setGe1801Codentid(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ge1801Codentid,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ge1801Tipproduct
	 *	@return ge1801Tipproduct
	 */
   public char[] getGe1801Tipproduct() throws CFException{
   		return ge1801Tipproduct;
   }

  
	/**
	*  set variable ge1801Tipproduct
	*  Corresponding COBOL Variable is GE1801-TIPPRODUCT
	*  @param value
	**/
   public void setGe1801Tipproduct(char[] value) {
       value = checkGe1801TipproductConstraints(value);
       arraycopy(value,0,ge1801Tipproduct,0,value.length);
   } 
	public void setGe1801Tipproduct(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ge1801Tipproduct,0,beginIndex + endIndex);
   }
	public long getGe1801Codcontrat() throws CFException {
        if (isGe1801CodcontratModified()) { 
           ge1801Codcontrat = refreshGe1801Codcontrat();
        }
   		return ge1801Codcontrat;
	}
	
	/**
	 * 	Update Ge1801Codcontrat with the passed value
	 *  Corresponding COBOL Variable is GE1801-CODCONTRAT
	 *	@param number
	 */
	public void setGe1801Codcontrat(long number) {
			ge1801Codcontrat = checkGe1801CodcontratMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeGe1801Codcontrat(ge1801Codcontrat);
	}


	public short getGe1801Ofigestora() throws CFException {
        if (isGe1801OfigestoraModified()) { 
           ge1801Ofigestora = refreshGe1801Ofigestora();
        }
   		return ge1801Ofigestora;
	}
	
	/**
	 * 	Update Ge1801Ofigestora with the passed value
	 *  Corresponding COBOL Variable is GE1801-OFIGESTORA
	 *	@param number
	 */
	public void setGe1801Ofigestora(short number) {
			ge1801Ofigestora = checkGe1801OfigestoraMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeGe1801Ofigestora(ge1801Ofigestora);
	}

	public void setGe1801Ofigestora(int number) {
	    number = checkGe1801OfigestoraMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setGe1801Ofigestora((short)number);
	}
	public void setGe1801Ofigestora(long number) {
	    number = checkGe1801OfigestoraMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setGe1801Ofigestora((short)number);
	}
	

	/**
	 *	Returns the value of ge1801Idepsig
	 *	@return ge1801Idepsig
	 */
   public char[] getGe1801Idepsig() throws CFException{
   		return ge1801Idepsig;
   }

  
	/**
	*  set variable ge1801Idepsig
	*  Corresponding COBOL Variable is GE1801-IDEPSIG
	*  @param value
	**/
   public void setGe1801Idepsig(char[] value) {
       value = checkGe1801IdepsigConstraints(value);
       arraycopy(value,0,ge1801Idepsig,0,value.length);
   } 
	public void setGe1801Idepsig(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ge1801Idepsig,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ge1801Numpersona
	 *	@return ge1801Numpersona
	 */
	public int getGe1801Numpersona() throws CFException {
   		return ge1801Numpersona;
	}
	
	/**
	 * 	Update Ge1801Numpersona with the passed value
	 *  Corresponding COBOL Variable is GE1801-NUMPERSONA
	 *	@param number
	 */
	public void setGe1801Numpersona(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ge1801Numpersona = checkGe1801NumpersonaMaxLimit(number); 
	}


	public void setGe1801Numpersona(long number) {
	    number = checkGe1801NumpersonaMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGe1801Numpersona((int)number);
	}
	
	public int getGe1801Numcartera() throws CFException {
        if (isGe1801NumcarteraModified()) { 
           ge1801Numcartera = refreshGe1801Numcartera();
        }
   		return ge1801Numcartera;
	}
	
	/**
	 * 	Update Ge1801Numcartera with the passed value
	 *  Corresponding COBOL Variable is GE1801-NUMCARTERA
	 *	@param number
	 */
	public void setGe1801Numcartera(int number) {
			ge1801Numcartera = checkGe1801NumcarteraMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeGe1801Numcartera(ge1801Numcartera);
	}


	public void setGe1801Numcartera(long number) {
	    number = checkGe1801NumcarteraMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGe1801Numcartera((int)number);
	}
	
	/**
	 *	Returns the value of ge1801Codcartera
	 *	@return ge1801Codcartera
	 */
   public char[] getGe1801Codcartera() throws CFException{
   		return ge1801Codcartera;
   }

  
	/**
	*  set variable ge1801Codcartera
	*  Corresponding COBOL Variable is GE1801-CODCARTERA
	*  @param value
	**/
   public void setGe1801Codcartera(char[] value) {
       value = checkGe1801CodcarteraConstraints(value);
       arraycopy(value,0,ge1801Codcartera,0,value.length);
   } 
	public void setGe1801Codcartera(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ge1801Codcartera,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ge1801Fechaalta
	 *	@return ge1801Fechaalta
	 */
   public char[] getGe1801Fechaalta() throws CFException{
   		return ge1801Fechaalta;
   }

  
	/**
	*  set variable ge1801Fechaalta
	*  Corresponding COBOL Variable is GE1801-FECHAALTA
	*  @param value
	**/
   public void setGe1801Fechaalta(char[] value) {
       value = checkGe1801FechaaltaConstraints(value);
       arraycopy(value,0,ge1801Fechaalta,0,value.length);
   } 
	public void setGe1801Fechaalta(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ge1801Fechaalta,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ge1801Fechabaja
	 *	@return ge1801Fechabaja
	 */
   public char[] getGe1801Fechabaja() throws CFException{
   		return ge1801Fechabaja;
   }

  
	/**
	*  set variable ge1801Fechabaja
	*  Corresponding COBOL Variable is GE1801-FECHABAJA
	*  @param value
	**/
   public void setGe1801Fechabaja(char[] value) {
       value = checkGe1801FechabajaConstraints(value);
       arraycopy(value,0,ge1801Fechabaja,0,value.length);
   } 
	public void setGe1801Fechabaja(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ge1801Fechabaja,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ge1801Codnodo
	 *	@return ge1801Codnodo
	 */
   public char[] getGe1801Codnodo() throws CFException{
   		return ge1801Codnodo;
   }

  
	/**
	*  set variable ge1801Codnodo
	*  Corresponding COBOL Variable is GE1801-CODNODO
	*  @param value
	**/
   public void setGe1801Codnodo(char[] value) {
       value = checkGe1801CodnodoConstraints(value);
       arraycopy(value,0,ge1801Codnodo,0,value.length);
   } 
	public void setGe1801Codnodo(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ge1801Codnodo,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ge1801Resambito
	 *	@return ge1801Resambito
	 */
   public char[] getGe1801Resambito() throws CFException{
   		return ge1801Resambito;
   }

  
	/**
	*  set variable ge1801Resambito
	*  Corresponding COBOL Variable is GE1801-RESAMBITO
	*  @param value
	**/
   public void setGe1801Resambito(char[] value) {
       value = checkGe1801ResambitoConstraints(value);
       arraycopy(value,0,ge1801Resambito,0,value.length);
   } 
	public void setGe1801Resambito(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ge1801Resambito,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ge1801Numresamb
	 *	@return ge1801Numresamb
	 */
	public int getGe1801Numresamb() throws CFException {
   		return ge1801Numresamb;
	}
	
	/**
	 * 	Update Ge1801Numresamb with the passed value
	 *  Corresponding COBOL Variable is GE1801-NUMRESAMB
	 *	@param number
	 */
	public void setGe1801Numresamb(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ge1801Numresamb = checkGe1801NumresambMaxLimit(number); 
	}


	public void setGe1801Numresamb(long number) {
	    number = checkGe1801NumresambMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGe1801Numresamb((int)number);
	}
	
	/**
	 *	Returns the value of ge1801Numpresamb
	 *	@return ge1801Numpresamb
	 */
	public int getGe1801Numpresamb() throws CFException {
   		return ge1801Numpresamb;
	}
	
	/**
	 * 	Update Ge1801Numpresamb with the passed value
	 *  Corresponding COBOL Variable is GE1801-NUMPRESAMB
	 *	@param number
	 */
	public void setGe1801Numpresamb(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ge1801Numpresamb = checkGe1801NumpresambMaxLimit(number); 
	}


	public void setGe1801Numpresamb(long number) {
	    number = checkGe1801NumpresambMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGe1801Numpresamb((int)number);
	}
	
	/**
	 *	Returns the value of ge1801Cengescapt
	 *	@return ge1801Cengescapt
	 */
   public char[] getGe1801Cengescapt() throws CFException{
   		return ge1801Cengescapt;
   }

  
	/**
	*  set variable ge1801Cengescapt
	*  Corresponding COBOL Variable is GE1801-CENGESCAPT
	*  @param value
	**/
   public void setGe1801Cengescapt(char[] value) {
       value = checkGe1801CengescaptConstraints(value);
       arraycopy(value,0,ge1801Cengescapt,0,value.length);
   } 
	public void setGe1801Cengescapt(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ge1801Cengescapt,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ge1801Numgescap
	 *	@return ge1801Numgescap
	 */
	public int getGe1801Numgescap() throws CFException {
   		return ge1801Numgescap;
	}
	
	/**
	 * 	Update Ge1801Numgescap with the passed value
	 *  Corresponding COBOL Variable is GE1801-NUMGESCAP
	 *	@param number
	 */
	public void setGe1801Numgescap(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ge1801Numgescap = checkGe1801NumgescapMaxLimit(number); 
	}


	public void setGe1801Numgescap(long number) {
	    number = checkGe1801NumgescapMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGe1801Numgescap((int)number);
	}
	
	/**
	 *	Returns the value of ge1801Numpgescap
	 *	@return ge1801Numpgescap
	 */
	public int getGe1801Numpgescap() throws CFException {
   		return ge1801Numpgescap;
	}
	
	/**
	 * 	Update Ge1801Numpgescap with the passed value
	 *  Corresponding COBOL Variable is GE1801-NUMPGESCAP
	 *	@param number
	 */
	public void setGe1801Numpgescap(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ge1801Numpgescap = checkGe1801NumpgescapMaxLimit(number); 
	}


	public void setGe1801Numpgescap(long number) {
	    number = checkGe1801NumpgescapMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGe1801Numpgescap((int)number);
	}
	
	/**
	 *	Returns the value of ge1801Numpesprie
	 *	@return ge1801Numpesprie
	 */
	public int getGe1801Numpesprie() throws CFException {
   		return ge1801Numpesprie;
	}
	
	/**
	 * 	Update Ge1801Numpesprie with the passed value
	 *  Corresponding COBOL Variable is GE1801-NUMPESPRIE
	 *	@param number
	 */
	public void setGe1801Numpesprie(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ge1801Numpesprie = checkGe1801NumpesprieMaxLimit(number); 
	}


	public void setGe1801Numpesprie(long number) {
	    number = checkGe1801NumpesprieMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGe1801Numpesprie((int)number);
	}
	
	/**
	 *	Returns the value of ge1801Codcarrie
	 *	@return ge1801Codcarrie
	 */
   public char[] getGe1801Codcarrie() throws CFException{
   		return ge1801Codcarrie;
   }

  
	/**
	*  set variable ge1801Codcarrie
	*  Corresponding COBOL Variable is GE1801-CODCARRIE
	*  @param value
	**/
   public void setGe1801Codcarrie(char[] value) {
       value = checkGe1801CodcarrieConstraints(value);
       arraycopy(value,0,ge1801Codcarrie,0,value.length);
   } 
	public void setGe1801Codcarrie(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ge1801Codcarrie,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ge1801Fecciecurso
	 *	@return ge1801Fecciecurso
	 */
   public char[] getGe1801Fecciecurso() throws CFException{
   		return ge1801Fecciecurso;
   }

  
	/**
	*  set variable ge1801Fecciecurso
	*  Corresponding COBOL Variable is GE1801-FECCIECURSO
	*  @param value
	**/
   public void setGe1801Fecciecurso(char[] value) {
       value = checkGe1801FecciecursoConstraints(value);
       arraycopy(value,0,ge1801Fecciecurso,0,value.length);
   } 
	public void setGe1801Fecciecurso(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ge1801Fecciecurso,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dsnnrows
	 *	@return dsnnrows
	 */
	public int getDsnnrows() throws CFException {
   		return dsnnrows;
	}
	
	/**
	 * 	Update Dsnnrows with the passed value
	 *  Corresponding COBOL Variable is DSNNROWS
	 *	@param number
	 */
	public void setDsnnrows(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dsnnrows = checkDsnnrowsMaxLimit(number); 
	}


	public void setDsnnrows(long number) {
	    number = checkDsnnrowsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDsnnrows((int)number);
	}
	

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
