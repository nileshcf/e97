package com.cloudframe.app.vsamdb2.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.vsamdb2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] isItFirstTime100 = new char[1];

						private char[] sys001FileStatus200 = new char[2];

						private char[] abendParaName300 = new char[30];

								private int abendCode300;

						private char[] abendPara900 = new char[42];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItFirstTime100(("Y").toCharArray());
								setSys001FileStatus200(fillSpace(2));
								setAbendParaName300(fillSpace(30));
								setAbendCode300(0);
								setAbendPara900(("PARA NAME :                               ").toCharArray());
    }


 

	/**
	 *	Returns the value of isItFirstTime100
	 *	@return isItFirstTime100
	 */
   public char[] getIsItFirstTime100() throws CFException{
   		return isItFirstTime100;
   }

  
	/**
	*  set variable isItFirstTime100
	*  Corresponding COBOL Variable is 100-IS-IT-FIRST-TIME
	*  @param value
	**/
   public void setIsItFirstTime100(char[] value) {
       value = checkIsItFirstTime100Constraints(value);
       arraycopy(value,0,isItFirstTime100,0,value.length);
   } 
	public void setIsItFirstTime100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isItFirstTime100,0,beginIndex + endIndex);
   }
	char[] itIsNotFirstTime8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isItIsNotFirstTime88100()
	 *	@return  Returns true if isItIsNotFirstTime88100() is "N"
	 */
   public boolean isItIsNotFirstTime88100() throws CFException {
      return (  compareChars( getIsItFirstTime100() , itIsNotFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setItIsNotFirstTime88100True() {  			
    	setIsItFirstTime100( itIsNotFirstTime8810088Value);
   	}
	char[] itIsFirstTime8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsFirstTime88100()
	 *	@return  Returns true if isItIsFirstTime88100() is "Y"
	 */
   public boolean isItIsFirstTime88100() throws CFException {
      return (  compareChars( getIsItFirstTime100() , itIsFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsFirstTime88100True() {  			
    	setIsItFirstTime100( itIsFirstTime8810088Value);
   	}
	/**
	 *	Returns the value of sys001FileStatus200
	 *	@return sys001FileStatus200
	 */
   public char[] getSys001FileStatus200() throws CFException{
   		return sys001FileStatus200;
   }

  
	/**
	*  set variable sys001FileStatus200
	*  Corresponding COBOL Variable is 200-SYS001-FILE-STATUS
	*  @param value
	**/
   public void setSys001FileStatus200(char[] value) {
       value = checkSys001FileStatus200Constraints(value);
       arraycopy(value,0,sys001FileStatus200,0,value.length);
   } 
	public void setSys001FileStatus200(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys001FileStatus200,0,beginIndex + endIndex);
   }
	char[] sys001IoGood8820088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys001IoGood88200()
	 *	@return  Returns true if isSys001IoGood88200() is "00"
	 */
   public boolean isSys001IoGood88200() throws CFException {
      return (  compareChars( getSys001FileStatus200() , sys001IoGood8820088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys001IoGood88200True() {  			
    	setSys001FileStatus200( sys001IoGood8820088Value);
   	}
	char[] sys001Eof8820088Value = "10".toCharArray();
	/**
	 *	Test condition "10" for isSys001Eof88200()
	 *	@return  Returns true if isSys001Eof88200() is "10"
	 */
   public boolean isSys001Eof88200() throws CFException {
      return (  compareChars( getSys001FileStatus200() , sys001Eof8820088Value)  == 0  );
   }


	/**
	*  set values "10"
	*/
   	public void setSys001Eof88200True() {  			
    	setSys001FileStatus200( sys001Eof8820088Value);
   	}
	char[] sys001NoRecs8820088Value = "23".toCharArray();
	/**
	 *	Test condition "23" for isSys001NoRecs88200()
	 *	@return  Returns true if isSys001NoRecs88200() is "23"
	 */
   public boolean isSys001NoRecs88200() throws CFException {
      return (  compareChars( getSys001FileStatus200() , sys001NoRecs8820088Value)  == 0  );
   }


	/**
	*  set values "23"
	*/
   	public void setSys001NoRecs88200True() {  			
    	setSys001FileStatus200( sys001NoRecs8820088Value);
   	}
	/**
	 *	Returns the value of abendParaName300
	 *	@return abendParaName300
	 */
   public char[] getAbendParaName300() throws CFException{
   		return abendParaName300;
   }

  
	/**
	*  set variable abendParaName300
	*  Corresponding COBOL Variable is 300-ABEND-PARA-NAME
	*  @param value
	**/
   public void setAbendParaName300(char[] value) {
       value = checkAbendParaName300Constraints(value);
       arraycopy(value,0,abendParaName300,0,value.length);
   } 
	public void setAbendParaName300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendParaName300,0,beginIndex + endIndex);
   }
	char[] abendPara10008830088Value = "1000-DO-INITIALIZATION        ".toCharArray();
	/**
	 *	Test condition "1000-DO-INITIALIZATION" for isAbendPara100088300()
	 *	@return  Returns true if isAbendPara100088300() is "1000-DO-INITIALIZATION"
	 */
   public boolean isAbendPara100088300() throws CFException {
      return (  compareChars( getAbendParaName300() , abendPara10008830088Value)  == 0  );
   }


	/**
	*  set values "1000-DO-INITIALIZATION"
	*/
   	public void setAbendPara100088300True() {  			
    	setAbendParaName300( abendPara10008830088Value);
   	}
	char[] abendPara12008830088Value = "1200-OPEN-INPUT-SYS001        ".toCharArray();
	/**
	 *	Test condition "1200-OPEN-INPUT-SYS001" for isAbendPara120088300()
	 *	@return  Returns true if isAbendPara120088300() is "1200-OPEN-INPUT-SYS001"
	 */
   public boolean isAbendPara120088300() throws CFException {
      return (  compareChars( getAbendParaName300() , abendPara12008830088Value)  == 0  );
   }


	/**
	*  set values "1200-OPEN-INPUT-SYS001"
	*/
   	public void setAbendPara120088300True() {  			
    	setAbendParaName300( abendPara12008830088Value);
   	}
	char[] abendPara20008830088Value = "2000-PROCESS-IRD-EXTR         ".toCharArray();
	/**
	 *	Test condition "2000-PROCESS-IRD-EXTR" for isAbendPara200088300()
	 *	@return  Returns true if isAbendPara200088300() is "2000-PROCESS-IRD-EXTR"
	 */
   public boolean isAbendPara200088300() throws CFException {
      return (  compareChars( getAbendParaName300() , abendPara20008830088Value)  == 0  );
   }


	/**
	*  set values "2000-PROCESS-IRD-EXTR"
	*/
   	public void setAbendPara200088300True() {  			
    	setAbendParaName300( abendPara20008830088Value);
   	}
	char[] abendPara30008830088Value = "3000-CLOSE-IRD-EXTR           ".toCharArray();
	/**
	 *	Test condition "3000-CLOSE-IRD-EXTR" for isAbendPara300088300()
	 *	@return  Returns true if isAbendPara300088300() is "3000-CLOSE-IRD-EXTR"
	 */
   public boolean isAbendPara300088300() throws CFException {
      return (  compareChars( getAbendParaName300() , abendPara30008830088Value)  == 0  );
   }


	/**
	*  set values "3000-CLOSE-IRD-EXTR"
	*/
   	public void setAbendPara300088300True() {  			
    	setAbendParaName300( abendPara30008830088Value);
   	}
	char[] abendPara80008830088Value = "8000-READ-SYS001-FILE         ".toCharArray();
	/**
	 *	Test condition "8000-READ-SYS001-FILE" for isAbendPara800088300()
	 *	@return  Returns true if isAbendPara800088300() is "8000-READ-SYS001-FILE"
	 */
   public boolean isAbendPara800088300() throws CFException {
      return (  compareChars( getAbendParaName300() , abendPara80008830088Value)  == 0  );
   }


	/**
	*  set values "8000-READ-SYS001-FILE"
	*/
   	public void setAbendPara800088300True() {  			
    	setAbendParaName300( abendPara80008830088Value);
   	}
	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
	public int getAbendCode300() throws CFException {
       if (isAbendCode300Modified()) { 
           abendCode300 = refreshAbendCode300();
        }
   		return abendCode300;
	}
	

	
	   
	/**
	 * 	Update AbendCode300 with the passed value
	 *  Corresponding COBOL Variable is 300-ABEND-CODE
	 *	@param number
	 */
	public void setAbendCode300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    abendCode300 = checkAbendCode300MaxLimit(number); 
		serializeAbendCode300(abendCode300);
	}
	

	public void setAbendCode300(long number) {
	    number = checkAbendCode300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAbendCode300((int)number);
	}
	
	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode300(char[] value) throws CFException {
		 abendCode300 = serializeAbendCode300(value);
	}
	/**
	 * 	Update AbendCode300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode300String(char[] value) throws CFException {
		 setAbendCode300(value);
	}
	
	/**
	 *	Test condition 3001 for isOpenAbendCode88300()
	 *	@return  Returns true if isOpenAbendCode88300() is 3001
	 */
   public boolean isOpenAbendCode88300() throws CFException {
      return (  getAbendCode300()  ==  3001  );
   }


	/**
	*  set values 3001
	*/
   	public void setOpenAbendCode88300True() {  			
    	setAbendCode300( 3001);
   	}
	
	/**
	 *	Test condition 3002 for isReadAbendCode88300()
	 *	@return  Returns true if isReadAbendCode88300() is 3002
	 */
   public boolean isReadAbendCode88300() throws CFException {
      return (  getAbendCode300()  ==  3002  );
   }


	/**
	*  set values 3002
	*/
   	public void setReadAbendCode88300True() {  			
    	setAbendCode300( 3002);
   	}
	
	/**
	 *	Test condition 3003 for isCloseAbendCode88300()
	 *	@return  Returns true if isCloseAbendCode88300() is 3003
	 */
   public boolean isCloseAbendCode88300() throws CFException {
      return (  getAbendCode300()  ==  3003  );
   }


	/**
	*  set values 3003
	*/
   	public void setCloseAbendCode88300True() {  			
    	setAbendCode300( 3003);
   	}
	
	/**
	 *	Test condition 3004 for isStrtAbendCode88300()
	 *	@return  Returns true if isStrtAbendCode88300() is 3004
	 */
   public boolean isStrtAbendCode88300() throws CFException {
      return (  getAbendCode300()  ==  3004  );
   }


	/**
	*  set values 3004
	*/
   	public void setStrtAbendCode88300True() {  			
    	setAbendCode300( 3004);
   	}
	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException{
   		return abendPara900;
   }

  
	/**
	*  set variable abendPara900
	*  Corresponding COBOL Variable is 900-ABEND-PARA
	*  @param value
	**/
   public void setAbendPara900(char[] value) {
       value = checkAbendPara900Constraints(value);
       arraycopy(value,0,abendPara900,0,value.length);
   } 
	public void setAbendPara900(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendPara900,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
