package com.cloudframe.app.cfif01.dto;

/**
*  The class Init is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:54. using version 5.0.0.256
**/


import com.cloudframe.app.cfif01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Init extends InitSerialized { 
   

								private short dispNum;

						private char[] charWs = new char[1];

						private char[] char1 = new char[1];

								private int intWs;

						private char[] char2 = new char[5];
	
	/**
	* Constructor for Init
	**/
    public Init() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Init. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Init(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCharWs(("A").toCharArray());
								setChar1(("A").toCharArray());
								setIntWs(88);
								setChar2(String.join("", java.util.Collections.nCopies(5, "B")).toCharArray());
    } 

	/**
	 *	Returns the value of dispNum
	 *	@return dispNum
	 */
	public short getDispNum() throws CFException {
       if (isDispNumModified()) { 
           dispNum = refreshDispNum();
        }
   		return dispNum;
	}
	

    /**
	 *	Returns the String value of dispNum
	 *	@return dispNum
	 */
	public char[]  getDispNumActualString() {
	    String value = String.valueOf(dispNum).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update DispNum with the passed value
	 *  Corresponding COBOL Variable is WS-DISP-NUM
	 *	@param number
	 */
	public void setDispNum(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    dispNum = checkDispNumMaxLimit(number); 
		serializeDispNum(dispNum);
	}
	
	public void setDispNum(int number) {
	    number = checkDispNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDispNum((short)number);
	}
	public void setDispNum(long number) {
	    number = checkDispNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDispNum((short)number);
	}
	

	/**
	 * 	Update DispNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setDispNum(char[] value) throws CFException {
		 dispNum = serializeDispNum(value);
	}
	/**
	 * 	Update DispNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDispNumString(char[] value) throws CFException {
		 setDispNum(value);
	}
	/**
	 *	Returns the value of charWs
	 *	@return charWs
	 */
   public char[] getCharWs() throws CFException{
     if (isCharWsModified()) { 
        charWs = refreshCharWs();
     }
   		return charWs;
   }

  
	/**
	*  set variable charWs
	*  Corresponding COBOL Variable is WS-CHAR
	*  @param value
	**/
   public void setCharWs(char[] value) {
      charWs = checkCharWsConstraints(value);
      serializeCharWs(charWs);
   } 

     /**
	 * 	Update CharWs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCharWs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCharWs,charWs.length);
   	
   }
   
   public void setCharWs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCharWs,charWs.length);
   	
   }
   
     /**
	 * 	Update CharWs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCharWs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharWs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CharWs with another Field
	 *	@param value
	 */
   public void setCharWs(Field source) {
       replace(source,0,source.length(),beginCharWs,CHAR_WS_LEN);
   	
   }  
   
     /**
	 * 	Update CharWs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCharWs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCharWs,CHAR_WS_LEN);
   	
   }
   
     /**
	 * 	Update CharWs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCharWs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharWs+targetIndex,targetLen);
    
   }
	char[] charA8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isCharA88()
	 *	@return  Returns true if isCharA88() is "A"
	 */
   public boolean isCharA88() throws CFException {
      return (  compareChars( getCharWs() , charA8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setCharA88True() {  			
    	setCharWs( charA8888Value);
   	}
	char[] charB8888Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isCharB88()
	 *	@return  Returns true if isCharB88() is "B"
	 */
   public boolean isCharB88() throws CFException {
      return (  compareChars( getCharWs() , charB8888Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setCharB88True() {  			
    	setCharWs( charB8888Value);
   	}
	char[] charC8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isCharC88()
	 *	@return  Returns true if isCharC88() is "C"
	 */
   public boolean isCharC88() throws CFException {
      return (  compareChars( getCharWs() , charC8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setCharC88True() {  			
    	setCharWs( charC8888Value);
   	}
	/**
	 *	Returns the value of char1
	 *	@return char1
	 */
   public char[] getChar1() throws CFException{
     if (isChar1Modified()) { 
        char1 = refreshChar1();
     }
   		return char1;
   }

  
	/**
	*  set variable char1
	*  Corresponding COBOL Variable is WS-CHAR1
	*  @param value
	**/
   public void setChar1(char[] value) {
      char1 = checkChar1Constraints(value);
      serializeChar1(char1);
   } 

     /**
	 * 	Update Char1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setChar1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginChar1,char1.length);
   	
   }
   
   public void setChar1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginChar1,char1.length);
   	
   }
   
     /**
	 * 	Update Char1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChar1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChar1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Char1 with another Field
	 *	@param value
	 */
   public void setChar1(Field source) {
       replace(source,0,source.length(),beginChar1,CHAR_1_LEN);
   	
   }  
   
     /**
	 * 	Update Char1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setChar1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginChar1,CHAR_1_LEN);
   	
   }
   
     /**
	 * 	Update Char1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChar1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChar1+targetIndex,targetLen);
    
   }
	char[] char8888Value1 = "A".toCharArray();
char[] char8888Value2 = "B".toCharArray();
char[] char8888Value3 = "C".toCharArray();

	/**
	 *	Test condition "A" "B" "C" for isChar88()
	 *	@return  Returns true if isChar88() is "A" "B" "C"
	 */
   public boolean isChar88() throws CFException {
      return (  compareChars( getChar1() , char8888Value1)  == 0  ||  compareChars( getChar1() , char8888Value2)  == 0  ||  compareChars( getChar1() , char8888Value3)  == 0  );
   }


	/**
	*  set values "A" "B" "C"
	*/
   	public void setChar88True() {  			
    	setChar1( char8888Value1);
   	}
	/**
	 *	Returns the value of intWs
	 *	@return intWs
	 */
	public int getIntWs() throws CFException {
        if (isIntWsModified()) { 
           intWs = refreshIntWs();
        }
   		return intWs;
	}
	
	/**
	 * 	Update IntWs with the passed value
	 *  Corresponding COBOL Variable is WS-INT
	 *	@param number
	 */
	public void setIntWs(int number) {
	     // Truncate if the number is beyond +/- Max range
	    intWs = checkIntWsMaxLimit(number); 
		serializeIntWs(intWs);
	}


	public void setIntWs(long number) {
	    number = checkIntWsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIntWs((int)number);
	}
	
	/**
	 *	Returns the value of char2
	 *	@return char2
	 */
   public char[] getChar2() throws CFException{
     if (isChar2Modified()) { 
        char2 = refreshChar2();
     }
   		return char2;
   }

  
	/**
	*  set variable char2
	*  Corresponding COBOL Variable is WS-CHAR2
	*  @param value
	**/
   public void setChar2(char[] value) {
      char2 = checkChar2Constraints(value);
      serializeChar2(char2);
   } 

     /**
	 * 	Update Char2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setChar2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginChar2,char2.length);
   	
   }
   
   public void setChar2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginChar2,char2.length);
   	
   }
   
     /**
	 * 	Update Char2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChar2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChar2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Char2 with another Field
	 *	@param value
	 */
   public void setChar2(Field source) {
       replace(source,0,source.length(),beginChar2,CHAR_2_LEN);
   	
   }  
   
     /**
	 * 	Update Char2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setChar2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginChar2,CHAR_2_LEN);
   	
   }
   
     /**
	 * 	Update Char2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChar2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChar2+targetIndex,targetLen);
    
   }
	char[] char2A8888Value = "A    ".toCharArray();
	/**
	 *	Test condition "A" for isChar2A88()
	 *	@return  Returns true if isChar2A88() is "A"
	 */
   public boolean isChar2A88() throws CFException {
      return (  compareChars( getChar2() , char2A8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setChar2A88True() {  			
    	setChar2( char2A8888Value);
   	}
	char[] char2B8888Value = "B    ".toCharArray();
	/**
	 *	Test condition "B" for isChar2B88()
	 *	@return  Returns true if isChar2B88() is "B"
	 */
   public boolean isChar2B88() throws CFException {
      return (  compareChars( getChar2() , char2B8888Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setChar2B88True() {  			
    	setChar2( char2B8888Value);
   	}
	char[] char2C8888Value = "C    ".toCharArray();
	/**
	 *	Test condition "C" for isChar2C88()
	 *	@return  Returns true if isChar2C88() is "C"
	 */
   public boolean isChar2C88() throws CFException {
      return (  compareChars( getChar2() , char2C8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setChar2C88True() {  			
    	setChar2( char2C8888Value);
   	}

	
	
	

		public static int getInitFieldLength() {
			return INIT_LENGTH;
		}

}
  
