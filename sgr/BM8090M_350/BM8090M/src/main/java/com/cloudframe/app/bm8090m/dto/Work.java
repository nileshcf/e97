package com.cloudframe.app.bm8090m.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] wSwiInpUp1vez = Field.fillLowValue(1);

						private char[] wSwiInoUp1vez = Field.fillLowValue(1);

						private char[] wSwiInpDown1vez = Field.fillLowValue(1);

								private int wCntString;

								private int wIndOpc;

						private char[] wNomPer = Field.fillLowValue(60);

						private char[] wPapPer = Field.fillLowValue(100);

						private char[] wSapPer = Field.fillLowValue(60);

						private char[] wSepApe = Field.fillLowValue(1);

						private char[] wNomCom = Field.fillLowValue(60);

						private char[] wNomApe = Field.fillLowValue(40);

						private char[] wNomRed = Field.fillLowValue(24);

						private char[] wEsp1 = new char[1];

						private char[] wEsp2 = new char[2];

						private char[] wPunto = new char[1];

						private char[] wAster = new char[1];

						private char[] wnomPer01 = new char[22];

						private char[] wpapPer01 = new char[22];

						private char[] wsapPer01 = new char[22];

								private int llaTroParti;

								private int numCarParti;

						private char[] nomP01Parti = Field.fillLowValue(50);

						private char[] nomP02Parti = Field.fillLowValue(50);

								private int wpointAnt;

								private int wpointAct;

								private int wguarCar;

								private int wswCarDiv;

								private int wcntNumTro;

								private int wcntString01;

								private int wcntNcar;

						private char[] wresp = new char[50];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWCntString(0);
								setWEsp1(fillSpace(1));
								setWEsp2(fillSpace(2));
								setWPunto((".").toCharArray());
								setWAster(("*").toCharArray());
								setWnomPer01(fillSpace(22));
								setWpapPer01(fillSpace(22));
								setWsapPer01(fillSpace(22));
								setLlaTroParti(50);
								setNumCarParti(50);
								setWpointAnt(0);
								setWpointAct(0);
								setWguarCar(0);
								setWswCarDiv(0);
								setWcntNumTro(0);
								setWcntString01(0);
								setWcntNcar(0);
								setWresp(fillSpace(50));
    }


 

	/**
	 *	Returns the value of wSwiInpUp1vez
	 *	@return wSwiInpUp1vez
	 */
   public char[] getWSwiInpUp1vez() throws CFException{
   		return wSwiInpUp1vez;
   }

  
	/**
	*  set variable wSwiInpUp1vez
	*  Corresponding COBOL Variable is W-SWI-INP-UP-1VEZ
	*  @param value
	**/
   public void setWSwiInpUp1vez(char[] value) {
       value = checkWSwiInpUp1vezConstraints(value);
       arraycopy(value,0,wSwiInpUp1vez,0,value.length);
   } 
	public void setWSwiInpUp1vez(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wSwiInpUp1vez,0,beginIndex + endIndex);
   }
	char[] inpUp1vez88Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isInpUp1vez()
	 *	@return  Returns true if isInpUp1vez() is "S"
	 */
   public boolean isInpUp1vez() throws CFException {
      return (  compareChars( getWSwiInpUp1vez() , inpUp1vez88Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setInpUp1vezTrue() {  			
    	setWSwiInpUp1vez( inpUp1vez88Value);
   	}
	char[] noInpUp1vez88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNoInpUp1vez()
	 *	@return  Returns true if isNoInpUp1vez() is "N"
	 */
   public boolean isNoInpUp1vez() throws CFException {
      return (  compareChars( getWSwiInpUp1vez() , noInpUp1vez88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNoInpUp1vezTrue() {  			
    	setWSwiInpUp1vez( noInpUp1vez88Value);
   	}
	/**
	 *	Returns the value of wSwiInoUp1vez
	 *	@return wSwiInoUp1vez
	 */
   public char[] getWSwiInoUp1vez() throws CFException{
   		return wSwiInoUp1vez;
   }

  
	/**
	*  set variable wSwiInoUp1vez
	*  Corresponding COBOL Variable is W-SWI-INO-UP-1VEZ
	*  @param value
	**/
   public void setWSwiInoUp1vez(char[] value) {
       value = checkWSwiInoUp1vezConstraints(value);
       arraycopy(value,0,wSwiInoUp1vez,0,value.length);
   } 
	public void setWSwiInoUp1vez(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wSwiInoUp1vez,0,beginIndex + endIndex);
   }
	char[] inoUp1vez88Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isInoUp1vez()
	 *	@return  Returns true if isInoUp1vez() is "S"
	 */
   public boolean isInoUp1vez() throws CFException {
      return (  compareChars( getWSwiInoUp1vez() , inoUp1vez88Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setInoUp1vezTrue() {  			
    	setWSwiInoUp1vez( inoUp1vez88Value);
   	}
	char[] noInoUp1vez88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNoInoUp1vez()
	 *	@return  Returns true if isNoInoUp1vez() is "N"
	 */
   public boolean isNoInoUp1vez() throws CFException {
      return (  compareChars( getWSwiInoUp1vez() , noInoUp1vez88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNoInoUp1vezTrue() {  			
    	setWSwiInoUp1vez( noInoUp1vez88Value);
   	}
	/**
	 *	Returns the value of wSwiInpDown1vez
	 *	@return wSwiInpDown1vez
	 */
   public char[] getWSwiInpDown1vez() throws CFException{
   		return wSwiInpDown1vez;
   }

  
	/**
	*  set variable wSwiInpDown1vez
	*  Corresponding COBOL Variable is W-SWI-INP-DOWN-1VEZ
	*  @param value
	**/
   public void setWSwiInpDown1vez(char[] value) {
       value = checkWSwiInpDown1vezConstraints(value);
       arraycopy(value,0,wSwiInpDown1vez,0,value.length);
   } 
	public void setWSwiInpDown1vez(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wSwiInpDown1vez,0,beginIndex + endIndex);
   }
	char[] inpDown1vez88Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isInpDown1vez()
	 *	@return  Returns true if isInpDown1vez() is "S"
	 */
   public boolean isInpDown1vez() throws CFException {
      return (  compareChars( getWSwiInpDown1vez() , inpDown1vez88Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setInpDown1vezTrue() {  			
    	setWSwiInpDown1vez( inpDown1vez88Value);
   	}
	char[] noInpDown1vez88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNoInpDown1vez()
	 *	@return  Returns true if isNoInpDown1vez() is "N"
	 */
   public boolean isNoInpDown1vez() throws CFException {
      return (  compareChars( getWSwiInpDown1vez() , noInpDown1vez88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNoInpDown1vezTrue() {  			
    	setWSwiInpDown1vez( noInpDown1vez88Value);
   	}
	public int getWCntString() throws CFException {
        if (isWCntStringModified()) { 
           wCntString = refreshWCntString();
        }
   		return wCntString;
	}
	
	/**
	 * 	Update WCntString with the passed value
	 *  Corresponding COBOL Variable is W-CNT-STRING
	 *	@param number
	 */
	public void setWCntString(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			wCntString = checkWCntStringMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeWCntString(wCntString);
	}


	public void setWCntString(long number) {
	    number = checkWCntStringMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWCntString((int)number);
	}
	
	/**
	 *	Returns the value of wIndOpc
	 *	@return wIndOpc
	 */
	public int getWIndOpc() throws CFException {
       if (isWIndOpcModified()) { 
           wIndOpc = refreshWIndOpc();
        }
   		return wIndOpc;
	}
	

	
	   
	/**
	 * 	Update WIndOpc with the passed value
	 *  Corresponding COBOL Variable is W-IND-OPC
	 *	@param number
	 */
	public void setWIndOpc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wIndOpc = checkWIndOpcMaxLimit(number); 
		serializeWIndOpc(wIndOpc);
	}
	

	public void setWIndOpc(long number) {
	    number = checkWIndOpcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWIndOpc((int)number);
	}
	
	/**
	 * 	Update WIndOpc with the passed value
	 *	@param value (String or char[])
	 */
	public void setWIndOpc(char[] value) throws CFException {
		 wIndOpc = serializeWIndOpc(value);
	}
	/**
	 * 	Update WIndOpc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWIndOpcString(char[] value) throws CFException {
		 setWIndOpc(value);
	}
	/**
	 *	Returns the value of wNomPer
	 *	@return wNomPer
	 */
   public char[] getWNomPer() throws CFException{
   		return wNomPer;
   }

  
	/**
	*  set variable wNomPer
	*  Corresponding COBOL Variable is W-NOM-PER
	*  @param value
	**/
   public void setWNomPer(char[] value) {
       value = checkWNomPerConstraints(value);
       arraycopy(value,0,wNomPer,0,value.length);
   } 
	public void setWNomPer(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wNomPer,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wPapPer
	 *	@return wPapPer
	 */
   public char[] getWPapPer() throws CFException{
   		return wPapPer;
   }

  
	/**
	*  set variable wPapPer
	*  Corresponding COBOL Variable is W-PAP-PER
	*  @param value
	**/
   public void setWPapPer(char[] value) {
       value = checkWPapPerConstraints(value);
       arraycopy(value,0,wPapPer,0,value.length);
   } 
	public void setWPapPer(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wPapPer,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wSapPer
	 *	@return wSapPer
	 */
   public char[] getWSapPer() throws CFException{
   		return wSapPer;
   }

  
	/**
	*  set variable wSapPer
	*  Corresponding COBOL Variable is W-SAP-PER
	*  @param value
	**/
   public void setWSapPer(char[] value) {
       value = checkWSapPerConstraints(value);
       arraycopy(value,0,wSapPer,0,value.length);
   } 
	public void setWSapPer(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wSapPer,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wSepApe
	 *	@return wSepApe
	 */
   public char[] getWSepApe() throws CFException{
   		return wSepApe;
   }

  
	/**
	*  set variable wSepApe
	*  Corresponding COBOL Variable is W-SEP-APE
	*  @param value
	**/
   public void setWSepApe(char[] value) {
       value = checkWSepApeConstraints(value);
       arraycopy(value,0,wSepApe,0,value.length);
   } 
	public void setWSepApe(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wSepApe,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wNomCom
	 *	@return wNomCom
	 */
   public char[] getWNomCom() throws CFException{
   		return wNomCom;
   }

  
	/**
	*  set variable wNomCom
	*  Corresponding COBOL Variable is W-NOM-COM
	*  @param value
	**/
   public void setWNomCom(char[] value) {
       value = checkWNomComConstraints(value);
       arraycopy(value,0,wNomCom,0,value.length);
   } 
	public void setWNomCom(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wNomCom,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wNomApe
	 *	@return wNomApe
	 */
   public char[] getWNomApe() throws CFException{
   		return wNomApe;
   }

  
	/**
	*  set variable wNomApe
	*  Corresponding COBOL Variable is W-NOM-APE
	*  @param value
	**/
   public void setWNomApe(char[] value) {
       value = checkWNomApeConstraints(value);
       arraycopy(value,0,wNomApe,0,value.length);
   } 
	public void setWNomApe(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wNomApe,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wNomRed
	 *	@return wNomRed
	 */
   public char[] getWNomRed() throws CFException{
   		return wNomRed;
   }

  
	/**
	*  set variable wNomRed
	*  Corresponding COBOL Variable is W-NOM-RED
	*  @param value
	**/
   public void setWNomRed(char[] value) {
       value = checkWNomRedConstraints(value);
       arraycopy(value,0,wNomRed,0,value.length);
   } 
	public void setWNomRed(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wNomRed,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wEsp1
	 *	@return wEsp1
	 */
   public char[] getWEsp1() throws CFException{
   		return wEsp1;
   }

  
	/**
	*  set variable wEsp1
	*  Corresponding COBOL Variable is W-ESP1
	*  @param value
	**/
   public void setWEsp1(char[] value) {
       value = checkWEsp1Constraints(value);
       arraycopy(value,0,wEsp1,0,value.length);
   } 
	public void setWEsp1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wEsp1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wEsp2
	 *	@return wEsp2
	 */
   public char[] getWEsp2() throws CFException{
   		return wEsp2;
   }

  
	/**
	*  set variable wEsp2
	*  Corresponding COBOL Variable is W-ESP2
	*  @param value
	**/
   public void setWEsp2(char[] value) {
       value = checkWEsp2Constraints(value);
       arraycopy(value,0,wEsp2,0,value.length);
   } 
	public void setWEsp2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wEsp2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wPunto
	 *	@return wPunto
	 */
   public char[] getWPunto() throws CFException{
   		return wPunto;
   }

  
	/**
	*  set variable wPunto
	*  Corresponding COBOL Variable is W-PUNTO
	*  @param value
	**/
   public void setWPunto(char[] value) {
       value = checkWPuntoConstraints(value);
       arraycopy(value,0,wPunto,0,value.length);
   } 
	public void setWPunto(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wPunto,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wAster
	 *	@return wAster
	 */
   public char[] getWAster() throws CFException{
   		return wAster;
   }

  
	/**
	*  set variable wAster
	*  Corresponding COBOL Variable is W-ASTER
	*  @param value
	**/
   public void setWAster(char[] value) {
       value = checkWAsterConstraints(value);
       arraycopy(value,0,wAster,0,value.length);
   } 
	public void setWAster(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wAster,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wnomPer01
	 *	@return wnomPer01
	 */
   public char[] getWnomPer01() throws CFException{
   		return wnomPer01;
   }

  
	/**
	*  set variable wnomPer01
	*  Corresponding COBOL Variable is WNOM-PER
	*  @param value
	**/
   public void setWnomPer01(char[] value) {
       value = checkWnomPer01Constraints(value);
       arraycopy(value,0,wnomPer01,0,value.length);
   } 
	public void setWnomPer01(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wnomPer01,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wpapPer01
	 *	@return wpapPer01
	 */
   public char[] getWpapPer01() throws CFException{
   		return wpapPer01;
   }

  
	/**
	*  set variable wpapPer01
	*  Corresponding COBOL Variable is WPAP-PER
	*  @param value
	**/
   public void setWpapPer01(char[] value) {
       value = checkWpapPer01Constraints(value);
       arraycopy(value,0,wpapPer01,0,value.length);
   } 
	public void setWpapPer01(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wpapPer01,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wsapPer01
	 *	@return wsapPer01
	 */
   public char[] getWsapPer01() throws CFException{
   		return wsapPer01;
   }

  
	/**
	*  set variable wsapPer01
	*  Corresponding COBOL Variable is WSAP-PER
	*  @param value
	**/
   public void setWsapPer01(char[] value) {
       value = checkWsapPer01Constraints(value);
       arraycopy(value,0,wsapPer01,0,value.length);
   } 
	public void setWsapPer01(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wsapPer01,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of llaTroParti
	 *	@return llaTroParti
	 */
	public int getLlaTroParti() throws CFException {
       if (isLlaTroPartiModified()) { 
           llaTroParti = refreshLlaTroParti();
        }
   		return llaTroParti;
	}
	

	
	   
	/**
	 * 	Update LlaTroParti with the passed value
	 *  Corresponding COBOL Variable is LLA-TRO-PARTI
	 *	@param number
	 */
	public void setLlaTroParti(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    llaTroParti = checkLlaTroPartiMaxLimit(number); 
		serializeLlaTroParti(llaTroParti);
	}
	

	public void setLlaTroParti(long number) {
	    number = checkLlaTroPartiMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLlaTroParti((int)number);
	}
	
	/**
	 * 	Update LlaTroParti with the passed value
	 *	@param value (String or char[])
	 */
	public void setLlaTroParti(char[] value) throws CFException {
		 llaTroParti = serializeLlaTroParti(value);
	}
	/**
	 * 	Update LlaTroParti with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLlaTroPartiString(char[] value) throws CFException {
		 setLlaTroParti(value);
	}
	/**
	 *	Returns the value of numCarParti
	 *	@return numCarParti
	 */
	public int getNumCarParti() throws CFException {
       if (isNumCarPartiModified()) { 
           numCarParti = refreshNumCarParti();
        }
   		return numCarParti;
	}
	

	
	   
	/**
	 * 	Update NumCarParti with the passed value
	 *  Corresponding COBOL Variable is NUM-CAR-PARTI
	 *	@param number
	 */
	public void setNumCarParti(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    numCarParti = checkNumCarPartiMaxLimit(number); 
		serializeNumCarParti(numCarParti);
	}
	

	public void setNumCarParti(long number) {
	    number = checkNumCarPartiMaxLimit(number); // Truncate if value is beyond +/- Max range
		setNumCarParti((int)number);
	}
	
	/**
	 * 	Update NumCarParti with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumCarParti(char[] value) throws CFException {
		 numCarParti = serializeNumCarParti(value);
	}
	/**
	 * 	Update NumCarParti with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNumCarPartiString(char[] value) throws CFException {
		 setNumCarParti(value);
	}
	/**
	 *	Returns the value of nomP01Parti
	 *	@return nomP01Parti
	 */
   public char[] getNomP01Parti() throws CFException{
   		return nomP01Parti;
   }

  
	/**
	*  set variable nomP01Parti
	*  Corresponding COBOL Variable is NOM-P01-PARTI
	*  @param value
	**/
   public void setNomP01Parti(char[] value) {
       value = checkNomP01PartiConstraints(value);
       arraycopy(value,0,nomP01Parti,0,value.length);
   } 
	public void setNomP01Parti(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,nomP01Parti,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of nomP02Parti
	 *	@return nomP02Parti
	 */
   public char[] getNomP02Parti() throws CFException{
   		return nomP02Parti;
   }

  
	/**
	*  set variable nomP02Parti
	*  Corresponding COBOL Variable is NOM-P02-PARTI
	*  @param value
	**/
   public void setNomP02Parti(char[] value) {
       value = checkNomP02PartiConstraints(value);
       arraycopy(value,0,nomP02Parti,0,value.length);
   } 
	public void setNomP02Parti(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,nomP02Parti,0,beginIndex + endIndex);
   }
	public int getWpointAnt() throws CFException {
        if (isWpointAntModified()) { 
           wpointAnt = refreshWpointAnt();
        }
   		return wpointAnt;
	}
	
	/**
	 * 	Update WpointAnt with the passed value
	 *  Corresponding COBOL Variable is WPOINT-ANT
	 *	@param number
	 */
	public void setWpointAnt(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			wpointAnt = checkWpointAntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeWpointAnt(wpointAnt);
	}


	public void setWpointAnt(long number) {
	    number = checkWpointAntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWpointAnt((int)number);
	}
	
	public int getWpointAct() throws CFException {
        if (isWpointActModified()) { 
           wpointAct = refreshWpointAct();
        }
   		return wpointAct;
	}
	
	/**
	 * 	Update WpointAct with the passed value
	 *  Corresponding COBOL Variable is WPOINT-ACT
	 *	@param number
	 */
	public void setWpointAct(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			wpointAct = checkWpointActMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeWpointAct(wpointAct);
	}


	public void setWpointAct(long number) {
	    number = checkWpointActMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWpointAct((int)number);
	}
	
	public int getWguarCar() throws CFException {
        if (isWguarCarModified()) { 
           wguarCar = refreshWguarCar();
        }
   		return wguarCar;
	}
	
	/**
	 * 	Update WguarCar with the passed value
	 *  Corresponding COBOL Variable is WGUAR-CAR
	 *	@param number
	 */
	public void setWguarCar(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			wguarCar = checkWguarCarMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeWguarCar(wguarCar);
	}


	public void setWguarCar(long number) {
	    number = checkWguarCarMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWguarCar((int)number);
	}
	
	public int getWswCarDiv() throws CFException {
        if (isWswCarDivModified()) { 
           wswCarDiv = refreshWswCarDiv();
        }
   		return wswCarDiv;
	}
	
	/**
	 * 	Update WswCarDiv with the passed value
	 *  Corresponding COBOL Variable is WSW-CAR-DIV
	 *	@param number
	 */
	public void setWswCarDiv(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			wswCarDiv = checkWswCarDivMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeWswCarDiv(wswCarDiv);
	}


	public void setWswCarDiv(long number) {
	    number = checkWswCarDivMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWswCarDiv((int)number);
	}
	
	public int getWcntNumTro() throws CFException {
        if (isWcntNumTroModified()) { 
           wcntNumTro = refreshWcntNumTro();
        }
   		return wcntNumTro;
	}
	
	/**
	 * 	Update WcntNumTro with the passed value
	 *  Corresponding COBOL Variable is WCNT-NUM-TRO
	 *	@param number
	 */
	public void setWcntNumTro(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			wcntNumTro = checkWcntNumTroMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeWcntNumTro(wcntNumTro);
	}


	public void setWcntNumTro(long number) {
	    number = checkWcntNumTroMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcntNumTro((int)number);
	}
	
	public int getWcntString01() throws CFException {
        if (isWcntString01Modified()) { 
           wcntString01 = refreshWcntString01();
        }
   		return wcntString01;
	}
	
	/**
	 * 	Update WcntString01 with the passed value
	 *  Corresponding COBOL Variable is WCNT-STRING
	 *	@param number
	 */
	public void setWcntString01(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			wcntString01 = checkWcntString01MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeWcntString01(wcntString01);
	}


	public void setWcntString01(long number) {
	    number = checkWcntString01MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcntString01((int)number);
	}
	
	public int getWcntNcar() throws CFException {
        if (isWcntNcarModified()) { 
           wcntNcar = refreshWcntNcar();
        }
   		return wcntNcar;
	}
	
	/**
	 * 	Update WcntNcar with the passed value
	 *  Corresponding COBOL Variable is WCNT-NCAR
	 *	@param number
	 */
	public void setWcntNcar(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			wcntNcar = checkWcntNcarMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeWcntNcar(wcntNcar);
	}


	public void setWcntNcar(long number) {
	    number = checkWcntNcarMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcntNcar((int)number);
	}
	
	/**
	 *	Returns the value of wresp
	 *	@return wresp
	 */
   public char[] getWresp() throws CFException{
   		return wresp;
   }

  
	/**
	*  set variable wresp
	*  Corresponding COBOL Variable is WRESP
	*  @param value
	**/
   public void setWresp(char[] value) {
       value = checkWrespConstraints(value);
       arraycopy(value,0,wresp,0,value.length);
   } 
	public void setWresp(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wresp,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
