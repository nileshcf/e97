package com.cloudframe.app.tstcdpag.dto;

/**
*  The class Out is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:55. using version 5.0.0.256
**/


import com.cloudframe.app.tstcdpag.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Out extends OutSerialized {
   

						private char[] byteWs = Field.fillLowValue(1);


						private char[] hexChar = Field.fillLowValue(2);


						private char[] nonDisplayableStr = Field.fillLowValue(25);
	
	/**
	* Constructor for Out
	**/
    public Out() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" Hex value is 0x").toCharArray()
             , getStartOffset() + 1
             ,16
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 19
             ,1
             );
    }


 

	/**
	 *	Returns the value of byteWs
	 *	@return byteWs
	 */
   public char[] getByteWs() throws CFException{
     if (isByteWsModified()) { 
        byteWs = refreshByteWs();
     }
   		return byteWs;
   }

  
	/**
	*  set variable byteWs
	*  Corresponding COBOL Variable is WS-BYTE
	*  @param value
	**/
   public void setByteWs(char[] value) {
      byteWs = checkByteWsConstraints(value);
      serializeByteWs(byteWs);
   } 

     /**
	 * 	Update ByteWs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setByteWs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginByteWs,byteWs.length);
   	
   }
   
   public void setByteWs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginByteWs,byteWs.length);
   	
   }
   
     /**
	 * 	Update ByteWs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setByteWs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginByteWs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ByteWs with another Field
	 *	@param value
	 */
   public void setByteWs(Field source) {
       replace(source,0,source.length(),beginByteWs,BYTE_WS_LEN);
   	
   }  
   
     /**
	 * 	Update ByteWs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setByteWs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginByteWs,BYTE_WS_LEN);
   	
   }
   
     /**
	 * 	Update ByteWs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setByteWs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginByteWs+targetIndex,targetLen);
    
   }
	char[] valHex0088Value = fillLowValue(1);
	/**
	 *	Test condition new byte[] {(byte)0x00} for isValHex00()
	 *	@return  Returns true if isValHex00() is new byte[] {(byte)0x00}
	 */
   public boolean isValHex00() throws CFException {
      return (  compareChars( getByteWs() , valHex0088Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00}
	*/
   	public void setValHex00True() {  			
    	setByteWs( valHex0088Value);
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x01} for isValHex01()
	 *	@return  Returns true if isValHex01() is new byte[] {(byte)0x01}
	 */
   public boolean isValHex01() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x01}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x01}
	*/
   	public void setValHex01True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x01})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x02} for isValHex02()
	 *	@return  Returns true if isValHex02() is new byte[] {(byte)0x02}
	 */
   public boolean isValHex02() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x02}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x02}
	*/
   	public void setValHex02True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x02})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x03} for isValHex03()
	 *	@return  Returns true if isValHex03() is new byte[] {(byte)0x03}
	 */
   public boolean isValHex03() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x03}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x03}
	*/
   	public void setValHex03True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x03})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x04} for isValHex04()
	 *	@return  Returns true if isValHex04() is new byte[] {(byte)0x04}
	 */
   public boolean isValHex04() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x04}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x04}
	*/
   	public void setValHex04True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x04})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x05} for isValHex05()
	 *	@return  Returns true if isValHex05() is new byte[] {(byte)0x05}
	 */
   public boolean isValHex05() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x05}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x05}
	*/
   	public void setValHex05True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x05})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x06} for isValHex06()
	 *	@return  Returns true if isValHex06() is new byte[] {(byte)0x06}
	 */
   public boolean isValHex06() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x06}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x06}
	*/
   	public void setValHex06True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x06})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x07} for isValHex07()
	 *	@return  Returns true if isValHex07() is new byte[] {(byte)0x07}
	 */
   public boolean isValHex07() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x07}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x07}
	*/
   	public void setValHex07True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x07})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x08} for isValHex08()
	 *	@return  Returns true if isValHex08() is new byte[] {(byte)0x08}
	 */
   public boolean isValHex08() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x08}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x08}
	*/
   	public void setValHex08True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x08})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x09} for isValHex09()
	 *	@return  Returns true if isValHex09() is new byte[] {(byte)0x09}
	 */
   public boolean isValHex09() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x09}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x09}
	*/
   	public void setValHex09True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x09})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x0A} for isValHex0a()
	 *	@return  Returns true if isValHex0a() is new byte[] {(byte)0x0A}
	 */
   public boolean isValHex0a() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x0A}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x0A}
	*/
   	public void setValHex0aTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x0A})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x0B} for isValHex0b()
	 *	@return  Returns true if isValHex0b() is new byte[] {(byte)0x0B}
	 */
   public boolean isValHex0b() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x0B}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x0B}
	*/
   	public void setValHex0bTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x0B})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x0C} for isValHex0c()
	 *	@return  Returns true if isValHex0c() is new byte[] {(byte)0x0C}
	 */
   public boolean isValHex0c() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x0C}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x0C}
	*/
   	public void setValHex0cTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x0C})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x0D} for isValHex0d()
	 *	@return  Returns true if isValHex0d() is new byte[] {(byte)0x0D}
	 */
   public boolean isValHex0d() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x0D}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x0D}
	*/
   	public void setValHex0dTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x0D})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x0E} for isValHex0e()
	 *	@return  Returns true if isValHex0e() is new byte[] {(byte)0x0E}
	 */
   public boolean isValHex0e() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x0E}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x0E}
	*/
   	public void setValHex0eTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x0E})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x0F} for isValHex0f()
	 *	@return  Returns true if isValHex0f() is new byte[] {(byte)0x0F}
	 */
   public boolean isValHex0f() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x0F}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x0F}
	*/
   	public void setValHex0fTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x0F})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x10} for isValHex10()
	 *	@return  Returns true if isValHex10() is new byte[] {(byte)0x10}
	 */
   public boolean isValHex10() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x10}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x10}
	*/
   	public void setValHex10True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x10})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x11} for isValHex11()
	 *	@return  Returns true if isValHex11() is new byte[] {(byte)0x11}
	 */
   public boolean isValHex11() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x11}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x11}
	*/
   	public void setValHex11True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x11})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x12} for isValHex12()
	 *	@return  Returns true if isValHex12() is new byte[] {(byte)0x12}
	 */
   public boolean isValHex12() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x12}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x12}
	*/
   	public void setValHex12True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x12})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x13} for isValHex13()
	 *	@return  Returns true if isValHex13() is new byte[] {(byte)0x13}
	 */
   public boolean isValHex13() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x13}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x13}
	*/
   	public void setValHex13True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x13})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x14} for isValHex14()
	 *	@return  Returns true if isValHex14() is new byte[] {(byte)0x14}
	 */
   public boolean isValHex14() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x14}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x14}
	*/
   	public void setValHex14True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x14})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x15} for isValHex15()
	 *	@return  Returns true if isValHex15() is new byte[] {(byte)0x15}
	 */
   public boolean isValHex15() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x15}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x15}
	*/
   	public void setValHex15True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x15})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x16} for isValHex16()
	 *	@return  Returns true if isValHex16() is new byte[] {(byte)0x16}
	 */
   public boolean isValHex16() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x16}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x16}
	*/
   	public void setValHex16True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x16})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x17} for isValHex17()
	 *	@return  Returns true if isValHex17() is new byte[] {(byte)0x17}
	 */
   public boolean isValHex17() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x17}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x17}
	*/
   	public void setValHex17True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x17})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x18} for isValHex18()
	 *	@return  Returns true if isValHex18() is new byte[] {(byte)0x18}
	 */
   public boolean isValHex18() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x18}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x18}
	*/
   	public void setValHex18True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x18})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x19} for isValHex19()
	 *	@return  Returns true if isValHex19() is new byte[] {(byte)0x19}
	 */
   public boolean isValHex19() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x19}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x19}
	*/
   	public void setValHex19True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x19})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x1A} for isValHex1a()
	 *	@return  Returns true if isValHex1a() is new byte[] {(byte)0x1A}
	 */
   public boolean isValHex1a() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x1A}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x1A}
	*/
   	public void setValHex1aTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x1A})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x1B} for isValHex1b()
	 *	@return  Returns true if isValHex1b() is new byte[] {(byte)0x1B}
	 */
   public boolean isValHex1b() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x1B}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x1B}
	*/
   	public void setValHex1bTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x1B})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x1C} for isValHex1c()
	 *	@return  Returns true if isValHex1c() is new byte[] {(byte)0x1C}
	 */
   public boolean isValHex1c() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x1C}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x1C}
	*/
   	public void setValHex1cTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x1C})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x1D} for isValHex1d()
	 *	@return  Returns true if isValHex1d() is new byte[] {(byte)0x1D}
	 */
   public boolean isValHex1d() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x1D}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x1D}
	*/
   	public void setValHex1dTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x1D})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x1E} for isValHex1e()
	 *	@return  Returns true if isValHex1e() is new byte[] {(byte)0x1E}
	 */
   public boolean isValHex1e() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x1E}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x1E}
	*/
   	public void setValHex1eTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x1E})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x1F} for isValHex1f()
	 *	@return  Returns true if isValHex1f() is new byte[] {(byte)0x1F}
	 */
   public boolean isValHex1f() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x1F}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x1F}
	*/
   	public void setValHex1fTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x1F})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x20} for isValHex20()
	 *	@return  Returns true if isValHex20() is new byte[] {(byte)0x20}
	 */
   public boolean isValHex20() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x20}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x20}
	*/
   	public void setValHex20True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x20})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x21} for isValHex21()
	 *	@return  Returns true if isValHex21() is new byte[] {(byte)0x21}
	 */
   public boolean isValHex21() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x21}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x21}
	*/
   	public void setValHex21True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x21})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x22} for isValHex22()
	 *	@return  Returns true if isValHex22() is new byte[] {(byte)0x22}
	 */
   public boolean isValHex22() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x22}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x22}
	*/
   	public void setValHex22True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x22})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x23} for isValHex23()
	 *	@return  Returns true if isValHex23() is new byte[] {(byte)0x23}
	 */
   public boolean isValHex23() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x23}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x23}
	*/
   	public void setValHex23True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x23})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x24} for isValHex24()
	 *	@return  Returns true if isValHex24() is new byte[] {(byte)0x24}
	 */
   public boolean isValHex24() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x24}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x24}
	*/
   	public void setValHex24True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x24})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x25} for isValHex25()
	 *	@return  Returns true if isValHex25() is new byte[] {(byte)0x25}
	 */
   public boolean isValHex25() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x25}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x25}
	*/
   	public void setValHex25True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x25})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x26} for isValHex26()
	 *	@return  Returns true if isValHex26() is new byte[] {(byte)0x26}
	 */
   public boolean isValHex26() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x26}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x26}
	*/
   	public void setValHex26True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x26})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x27} for isValHex27()
	 *	@return  Returns true if isValHex27() is new byte[] {(byte)0x27}
	 */
   public boolean isValHex27() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x27}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x27}
	*/
   	public void setValHex27True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x27})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x28} for isValHex28()
	 *	@return  Returns true if isValHex28() is new byte[] {(byte)0x28}
	 */
   public boolean isValHex28() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x28}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x28}
	*/
   	public void setValHex28True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x28})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x29} for isValHex29()
	 *	@return  Returns true if isValHex29() is new byte[] {(byte)0x29}
	 */
   public boolean isValHex29() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x29}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x29}
	*/
   	public void setValHex29True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x29})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x2A} for isValHex2a()
	 *	@return  Returns true if isValHex2a() is new byte[] {(byte)0x2A}
	 */
   public boolean isValHex2a() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x2A}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x2A}
	*/
   	public void setValHex2aTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x2A})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x2B} for isValHex2b()
	 *	@return  Returns true if isValHex2b() is new byte[] {(byte)0x2B}
	 */
   public boolean isValHex2b() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x2B}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x2B}
	*/
   	public void setValHex2bTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x2B})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x2C} for isValHex2c()
	 *	@return  Returns true if isValHex2c() is new byte[] {(byte)0x2C}
	 */
   public boolean isValHex2c() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x2C}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x2C}
	*/
   	public void setValHex2cTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x2C})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x2D} for isValHex2d()
	 *	@return  Returns true if isValHex2d() is new byte[] {(byte)0x2D}
	 */
   public boolean isValHex2d() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x2D}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x2D}
	*/
   	public void setValHex2dTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x2D})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x2E} for isValHex2e()
	 *	@return  Returns true if isValHex2e() is new byte[] {(byte)0x2E}
	 */
   public boolean isValHex2e() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x2E}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x2E}
	*/
   	public void setValHex2eTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x2E})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x2F} for isValHex2f()
	 *	@return  Returns true if isValHex2f() is new byte[] {(byte)0x2F}
	 */
   public boolean isValHex2f() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x2F}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x2F}
	*/
   	public void setValHex2fTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x2F})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x30} for isValHex30()
	 *	@return  Returns true if isValHex30() is new byte[] {(byte)0x30}
	 */
   public boolean isValHex30() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x30}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x30}
	*/
   	public void setValHex30True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x30})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x31} for isValHex31()
	 *	@return  Returns true if isValHex31() is new byte[] {(byte)0x31}
	 */
   public boolean isValHex31() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x31}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x31}
	*/
   	public void setValHex31True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x31})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x32} for isValHex32()
	 *	@return  Returns true if isValHex32() is new byte[] {(byte)0x32}
	 */
   public boolean isValHex32() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x32}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x32}
	*/
   	public void setValHex32True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x32})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x33} for isValHex33()
	 *	@return  Returns true if isValHex33() is new byte[] {(byte)0x33}
	 */
   public boolean isValHex33() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x33}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x33}
	*/
   	public void setValHex33True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x33})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x34} for isValHex34()
	 *	@return  Returns true if isValHex34() is new byte[] {(byte)0x34}
	 */
   public boolean isValHex34() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x34}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x34}
	*/
   	public void setValHex34True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x34})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x35} for isValHex35()
	 *	@return  Returns true if isValHex35() is new byte[] {(byte)0x35}
	 */
   public boolean isValHex35() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x35}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x35}
	*/
   	public void setValHex35True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x35})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x36} for isValHex36()
	 *	@return  Returns true if isValHex36() is new byte[] {(byte)0x36}
	 */
   public boolean isValHex36() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x36}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x36}
	*/
   	public void setValHex36True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x36})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x37} for isValHex37()
	 *	@return  Returns true if isValHex37() is new byte[] {(byte)0x37}
	 */
   public boolean isValHex37() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x37}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x37}
	*/
   	public void setValHex37True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x37})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x38} for isValHex38()
	 *	@return  Returns true if isValHex38() is new byte[] {(byte)0x38}
	 */
   public boolean isValHex38() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x38}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x38}
	*/
   	public void setValHex38True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x38})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x39} for isValHex39()
	 *	@return  Returns true if isValHex39() is new byte[] {(byte)0x39}
	 */
   public boolean isValHex39() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x39}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x39}
	*/
   	public void setValHex39True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x39})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x3A} for isValHex3a()
	 *	@return  Returns true if isValHex3a() is new byte[] {(byte)0x3A}
	 */
   public boolean isValHex3a() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x3A}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x3A}
	*/
   	public void setValHex3aTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x3A})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x3B} for isValHex3b()
	 *	@return  Returns true if isValHex3b() is new byte[] {(byte)0x3B}
	 */
   public boolean isValHex3b() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x3B}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x3B}
	*/
   	public void setValHex3bTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x3B})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x3C} for isValHex3c()
	 *	@return  Returns true if isValHex3c() is new byte[] {(byte)0x3C}
	 */
   public boolean isValHex3c() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x3C}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x3C}
	*/
   	public void setValHex3cTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x3C})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x3D} for isValHex3d()
	 *	@return  Returns true if isValHex3d() is new byte[] {(byte)0x3D}
	 */
   public boolean isValHex3d() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x3D}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x3D}
	*/
   	public void setValHex3dTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x3D})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x3E} for isValHex3e()
	 *	@return  Returns true if isValHex3e() is new byte[] {(byte)0x3E}
	 */
   public boolean isValHex3e() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x3E}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x3E}
	*/
   	public void setValHex3eTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x3E})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x3F} for isValHex3f()
	 *	@return  Returns true if isValHex3f() is new byte[] {(byte)0x3F}
	 */
   public boolean isValHex3f() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x3F}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x3F}
	*/
   	public void setValHex3fTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x3F})".toCharArray());
   	}
	char[] valHex4088Value = " ".toCharArray();
	/**
	 *	Test condition " " for isValHex40()
	 *	@return  Returns true if isValHex40() is " "
	 */
   public boolean isValHex40() throws CFException {
      return (  compareChars( getByteWs() , valHex4088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setValHex40True() {  			
    	setByteWs( valHex4088Value);
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x41} for isValHex41()
	 *	@return  Returns true if isValHex41() is new byte[] {(byte)0x41}
	 */
   public boolean isValHex41() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x41}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x41}
	*/
   	public void setValHex41True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x41})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x42} for isValHex42()
	 *	@return  Returns true if isValHex42() is new byte[] {(byte)0x42}
	 */
   public boolean isValHex42() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x42}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x42}
	*/
   	public void setValHex42True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x42})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x43} for isValHex43()
	 *	@return  Returns true if isValHex43() is new byte[] {(byte)0x43}
	 */
   public boolean isValHex43() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x43}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x43}
	*/
   	public void setValHex43True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x43})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x44} for isValHex44()
	 *	@return  Returns true if isValHex44() is new byte[] {(byte)0x44}
	 */
   public boolean isValHex44() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x44}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x44}
	*/
   	public void setValHex44True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x44})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x45} for isValHex45()
	 *	@return  Returns true if isValHex45() is new byte[] {(byte)0x45}
	 */
   public boolean isValHex45() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x45}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x45}
	*/
   	public void setValHex45True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x45})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x46} for isValHex46()
	 *	@return  Returns true if isValHex46() is new byte[] {(byte)0x46}
	 */
   public boolean isValHex46() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x46}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x46}
	*/
   	public void setValHex46True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x46})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x47} for isValHex47()
	 *	@return  Returns true if isValHex47() is new byte[] {(byte)0x47}
	 */
   public boolean isValHex47() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x47}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x47}
	*/
   	public void setValHex47True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x47})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x48} for isValHex48()
	 *	@return  Returns true if isValHex48() is new byte[] {(byte)0x48}
	 */
   public boolean isValHex48() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x48}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x48}
	*/
   	public void setValHex48True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x48})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x49} for isValHex49()
	 *	@return  Returns true if isValHex49() is new byte[] {(byte)0x49}
	 */
   public boolean isValHex49() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x49}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x49}
	*/
   	public void setValHex49True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x49})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x4A} for isValHex4a()
	 *	@return  Returns true if isValHex4a() is new byte[] {(byte)0x4A}
	 */
   public boolean isValHex4a() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x4A}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x4A}
	*/
   	public void setValHex4aTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x4A})".toCharArray());
   	}
	char[] valHex4b88Value = ".".toCharArray();
	/**
	 *	Test condition "." for isValHex4b()
	 *	@return  Returns true if isValHex4b() is "."
	 */
   public boolean isValHex4b() throws CFException {
      return (  compareChars( getByteWs() , valHex4b88Value)  == 0  );
   }


	/**
	*  set values "."
	*/
   	public void setValHex4bTrue() {  			
    	setByteWs( valHex4b88Value);
   	}
	char[] valHex4c88Value = "<".toCharArray();
	/**
	 *	Test condition "<" for isValHex4c()
	 *	@return  Returns true if isValHex4c() is "<"
	 */
   public boolean isValHex4c() throws CFException {
      return (  compareChars( getByteWs() , valHex4c88Value)  == 0  );
   }


	/**
	*  set values "<"
	*/
   	public void setValHex4cTrue() {  			
    	setByteWs( valHex4c88Value);
   	}
	char[] valHex4d88Value = "(".toCharArray();
	/**
	 *	Test condition "(" for isValHex4d()
	 *	@return  Returns true if isValHex4d() is "("
	 */
   public boolean isValHex4d() throws CFException {
      return (  compareChars( getByteWs() , valHex4d88Value)  == 0  );
   }


	/**
	*  set values "("
	*/
   	public void setValHex4dTrue() {  			
    	setByteWs( valHex4d88Value);
   	}
	char[] valHex4e88Value = "+".toCharArray();
	/**
	 *	Test condition "+" for isValHex4e()
	 *	@return  Returns true if isValHex4e() is "+"
	 */
   public boolean isValHex4e() throws CFException {
      return (  compareChars( getByteWs() , valHex4e88Value)  == 0  );
   }


	/**
	*  set values "+"
	*/
   	public void setValHex4eTrue() {  			
    	setByteWs( valHex4e88Value);
   	}
	char[] valHex4f88Value = "|".toCharArray();
	/**
	 *	Test condition "|" for isValHex4f()
	 *	@return  Returns true if isValHex4f() is "|"
	 */
   public boolean isValHex4f() throws CFException {
      return (  compareChars( getByteWs() , valHex4f88Value)  == 0  );
   }


	/**
	*  set values "|"
	*/
   	public void setValHex4fTrue() {  			
    	setByteWs( valHex4f88Value);
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x50} for isValHex50()
	 *	@return  Returns true if isValHex50() is new byte[] {(byte)0x50}
	 */
   public boolean isValHex50() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x50}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x50}
	*/
   	public void setValHex50True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x50})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x51} for isValHex51()
	 *	@return  Returns true if isValHex51() is new byte[] {(byte)0x51}
	 */
   public boolean isValHex51() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x51}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x51}
	*/
   	public void setValHex51True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x51})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x52} for isValHex52()
	 *	@return  Returns true if isValHex52() is new byte[] {(byte)0x52}
	 */
   public boolean isValHex52() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x52}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x52}
	*/
   	public void setValHex52True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x52})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x53} for isValHex53()
	 *	@return  Returns true if isValHex53() is new byte[] {(byte)0x53}
	 */
   public boolean isValHex53() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x53}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x53}
	*/
   	public void setValHex53True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x53})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x54} for isValHex54()
	 *	@return  Returns true if isValHex54() is new byte[] {(byte)0x54}
	 */
   public boolean isValHex54() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x54}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x54}
	*/
   	public void setValHex54True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x54})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x55} for isValHex55()
	 *	@return  Returns true if isValHex55() is new byte[] {(byte)0x55}
	 */
   public boolean isValHex55() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x55}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x55}
	*/
   	public void setValHex55True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x55})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x56} for isValHex56()
	 *	@return  Returns true if isValHex56() is new byte[] {(byte)0x56}
	 */
   public boolean isValHex56() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x56}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x56}
	*/
   	public void setValHex56True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x56})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x57} for isValHex57()
	 *	@return  Returns true if isValHex57() is new byte[] {(byte)0x57}
	 */
   public boolean isValHex57() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x57}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x57}
	*/
   	public void setValHex57True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x57})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x58} for isValHex58()
	 *	@return  Returns true if isValHex58() is new byte[] {(byte)0x58}
	 */
   public boolean isValHex58() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x58}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x58}
	*/
   	public void setValHex58True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x58})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x59} for isValHex59()
	 *	@return  Returns true if isValHex59() is new byte[] {(byte)0x59}
	 */
   public boolean isValHex59() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x59}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x59}
	*/
   	public void setValHex59True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x59})".toCharArray());
   	}
	char[] valHex5a88Value = "!".toCharArray();
	/**
	 *	Test condition "!" for isValHex5a()
	 *	@return  Returns true if isValHex5a() is "!"
	 */
   public boolean isValHex5a() throws CFException {
      return (  compareChars( getByteWs() , valHex5a88Value)  == 0  );
   }


	/**
	*  set values "!"
	*/
   	public void setValHex5aTrue() {  			
    	setByteWs( valHex5a88Value);
   	}
	char[] valHex5b88Value = "$".toCharArray();
	/**
	 *	Test condition "$" for isValHex5b()
	 *	@return  Returns true if isValHex5b() is "$"
	 */
   public boolean isValHex5b() throws CFException {
      return (  compareChars( getByteWs() , valHex5b88Value)  == 0  );
   }


	/**
	*  set values "$"
	*/
   	public void setValHex5bTrue() {  			
    	setByteWs( valHex5b88Value);
   	}
	char[] valHex5c88Value = "*".toCharArray();
	/**
	 *	Test condition "*" for isValHex5c()
	 *	@return  Returns true if isValHex5c() is "*"
	 */
   public boolean isValHex5c() throws CFException {
      return (  compareChars( getByteWs() , valHex5c88Value)  == 0  );
   }


	/**
	*  set values "*"
	*/
   	public void setValHex5cTrue() {  			
    	setByteWs( valHex5c88Value);
   	}
	char[] valHex5d88Value = ")".toCharArray();
	/**
	 *	Test condition ")" for isValHex5d()
	 *	@return  Returns true if isValHex5d() is ")"
	 */
   public boolean isValHex5d() throws CFException {
      return (  compareChars( getByteWs() , valHex5d88Value)  == 0  );
   }


	/**
	*  set values ")"
	*/
   	public void setValHex5dTrue() {  			
    	setByteWs( valHex5d88Value);
   	}
	char[] valHex5e88Value = ";".toCharArray();
	/**
	 *	Test condition ";" for isValHex5e()
	 *	@return  Returns true if isValHex5e() is ";"
	 */
   public boolean isValHex5e() throws CFException {
      return (  compareChars( getByteWs() , valHex5e88Value)  == 0  );
   }


	/**
	*  set values ";"
	*/
   	public void setValHex5eTrue() {  			
    	setByteWs( valHex5e88Value);
   	}
	char[] valHex5f88Value = "^".toCharArray();
	/**
	 *	Test condition "^" for isValHex5f()
	 *	@return  Returns true if isValHex5f() is "^"
	 */
   public boolean isValHex5f() throws CFException {
      return (  compareChars( getByteWs() , valHex5f88Value)  == 0  );
   }


	/**
	*  set values "^"
	*/
   	public void setValHex5fTrue() {  			
    	setByteWs( valHex5f88Value);
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x60} for isValHex60()
	 *	@return  Returns true if isValHex60() is new byte[] {(byte)0x60}
	 */
   public boolean isValHex60() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x60}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x60}
	*/
   	public void setValHex60True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x60})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x61} for isValHex61()
	 *	@return  Returns true if isValHex61() is new byte[] {(byte)0x61}
	 */
   public boolean isValHex61() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x61}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x61}
	*/
   	public void setValHex61True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x61})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x62} for isValHex62()
	 *	@return  Returns true if isValHex62() is new byte[] {(byte)0x62}
	 */
   public boolean isValHex62() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x62}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x62}
	*/
   	public void setValHex62True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x62})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x63} for isValHex63()
	 *	@return  Returns true if isValHex63() is new byte[] {(byte)0x63}
	 */
   public boolean isValHex63() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x63}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x63}
	*/
   	public void setValHex63True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x63})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x64} for isValHex64()
	 *	@return  Returns true if isValHex64() is new byte[] {(byte)0x64}
	 */
   public boolean isValHex64() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x64}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x64}
	*/
   	public void setValHex64True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x64})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x65} for isValHex65()
	 *	@return  Returns true if isValHex65() is new byte[] {(byte)0x65}
	 */
   public boolean isValHex65() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x65}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x65}
	*/
   	public void setValHex65True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x65})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x66} for isValHex66()
	 *	@return  Returns true if isValHex66() is new byte[] {(byte)0x66}
	 */
   public boolean isValHex66() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x66}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x66}
	*/
   	public void setValHex66True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x66})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x67} for isValHex67()
	 *	@return  Returns true if isValHex67() is new byte[] {(byte)0x67}
	 */
   public boolean isValHex67() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x67}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x67}
	*/
   	public void setValHex67True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x67})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x68} for isValHex68()
	 *	@return  Returns true if isValHex68() is new byte[] {(byte)0x68}
	 */
   public boolean isValHex68() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x68}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x68}
	*/
   	public void setValHex68True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x68})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x69} for isValHex69()
	 *	@return  Returns true if isValHex69() is new byte[] {(byte)0x69}
	 */
   public boolean isValHex69() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x69}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x69}
	*/
   	public void setValHex69True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x69})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x6A} for isValHex6a()
	 *	@return  Returns true if isValHex6a() is new byte[] {(byte)0x6A}
	 */
   public boolean isValHex6a() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x6A}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x6A}
	*/
   	public void setValHex6aTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x6A})".toCharArray());
   	}
	char[] valHex6b88Value = ",".toCharArray();
	/**
	 *	Test condition "," for isValHex6b()
	 *	@return  Returns true if isValHex6b() is ","
	 */
   public boolean isValHex6b() throws CFException {
      return (  compareChars( getByteWs() , valHex6b88Value)  == 0  );
   }


	/**
	*  set values ","
	*/
   	public void setValHex6bTrue() {  			
    	setByteWs( valHex6b88Value);
   	}
	char[] valHex6c88Value = "%".toCharArray();
	/**
	 *	Test condition "%" for isValHex6c()
	 *	@return  Returns true if isValHex6c() is "%"
	 */
   public boolean isValHex6c() throws CFException {
      return (  compareChars( getByteWs() , valHex6c88Value)  == 0  );
   }


	/**
	*  set values "%"
	*/
   	public void setValHex6cTrue() {  			
    	setByteWs( valHex6c88Value);
   	}
	char[] valHex6d88Value = "_".toCharArray();
	/**
	 *	Test condition "_" for isValHex6d()
	 *	@return  Returns true if isValHex6d() is "_"
	 */
   public boolean isValHex6d() throws CFException {
      return (  compareChars( getByteWs() , valHex6d88Value)  == 0  );
   }


	/**
	*  set values "_"
	*/
   	public void setValHex6dTrue() {  			
    	setByteWs( valHex6d88Value);
   	}
	char[] valHex6e88Value = ">".toCharArray();
	/**
	 *	Test condition ">" for isValHex6e()
	 *	@return  Returns true if isValHex6e() is ">"
	 */
   public boolean isValHex6e() throws CFException {
      return (  compareChars( getByteWs() , valHex6e88Value)  == 0  );
   }


	/**
	*  set values ">"
	*/
   	public void setValHex6eTrue() {  			
    	setByteWs( valHex6e88Value);
   	}
	char[] valHex6f88Value = "?".toCharArray();
	/**
	 *	Test condition "?" for isValHex6f()
	 *	@return  Returns true if isValHex6f() is "?"
	 */
   public boolean isValHex6f() throws CFException {
      return (  compareChars( getByteWs() , valHex6f88Value)  == 0  );
   }


	/**
	*  set values "?"
	*/
   	public void setValHex6fTrue() {  			
    	setByteWs( valHex6f88Value);
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x70} for isValHex70()
	 *	@return  Returns true if isValHex70() is new byte[] {(byte)0x70}
	 */
   public boolean isValHex70() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x70}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x70}
	*/
   	public void setValHex70True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x70})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x71} for isValHex71()
	 *	@return  Returns true if isValHex71() is new byte[] {(byte)0x71}
	 */
   public boolean isValHex71() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x71}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x71}
	*/
   	public void setValHex71True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x71})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x72} for isValHex72()
	 *	@return  Returns true if isValHex72() is new byte[] {(byte)0x72}
	 */
   public boolean isValHex72() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x72}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x72}
	*/
   	public void setValHex72True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x72})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x73} for isValHex73()
	 *	@return  Returns true if isValHex73() is new byte[] {(byte)0x73}
	 */
   public boolean isValHex73() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x73}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x73}
	*/
   	public void setValHex73True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x73})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x74} for isValHex74()
	 *	@return  Returns true if isValHex74() is new byte[] {(byte)0x74}
	 */
   public boolean isValHex74() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x74}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x74}
	*/
   	public void setValHex74True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x74})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x75} for isValHex75()
	 *	@return  Returns true if isValHex75() is new byte[] {(byte)0x75}
	 */
   public boolean isValHex75() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x75}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x75}
	*/
   	public void setValHex75True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x75})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x76} for isValHex76()
	 *	@return  Returns true if isValHex76() is new byte[] {(byte)0x76}
	 */
   public boolean isValHex76() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x76}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x76}
	*/
   	public void setValHex76True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x76})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x77} for isValHex77()
	 *	@return  Returns true if isValHex77() is new byte[] {(byte)0x77}
	 */
   public boolean isValHex77() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x77}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x77}
	*/
   	public void setValHex77True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x77})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x78} for isValHex78()
	 *	@return  Returns true if isValHex78() is new byte[] {(byte)0x78}
	 */
   public boolean isValHex78() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x78}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x78}
	*/
   	public void setValHex78True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x78})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x79} for isValHex79()
	 *	@return  Returns true if isValHex79() is new byte[] {(byte)0x79}
	 */
   public boolean isValHex79() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x79}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x79}
	*/
   	public void setValHex79True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x79})".toCharArray());
   	}
	char[] valHex7a88Value = ":".toCharArray();
	/**
	 *	Test condition ":" for isValHex7a()
	 *	@return  Returns true if isValHex7a() is ":"
	 */
   public boolean isValHex7a() throws CFException {
      return (  compareChars( getByteWs() , valHex7a88Value)  == 0  );
   }


	/**
	*  set values ":"
	*/
   	public void setValHex7aTrue() {  			
    	setByteWs( valHex7a88Value);
   	}
	char[] valHex7b88Value = "#".toCharArray();
	/**
	 *	Test condition "#" for isValHex7b()
	 *	@return  Returns true if isValHex7b() is "#"
	 */
   public boolean isValHex7b() throws CFException {
      return (  compareChars( getByteWs() , valHex7b88Value)  == 0  );
   }


	/**
	*  set values "#"
	*/
   	public void setValHex7bTrue() {  			
    	setByteWs( valHex7b88Value);
   	}
	char[] valHex7c88Value = "@".toCharArray();
	/**
	 *	Test condition "@" for isValHex7c()
	 *	@return  Returns true if isValHex7c() is "@"
	 */
   public boolean isValHex7c() throws CFException {
      return (  compareChars( getByteWs() , valHex7c88Value)  == 0  );
   }


	/**
	*  set values "@"
	*/
   	public void setValHex7cTrue() {  			
    	setByteWs( valHex7c88Value);
   	}
	char[] valHex7d88Value = "'".toCharArray();
	/**
	 *	Test condition "'" for isValHex7d()
	 *	@return  Returns true if isValHex7d() is "'"
	 */
   public boolean isValHex7d() throws CFException {
      return (  compareChars( getByteWs() , valHex7d88Value)  == 0  );
   }


	/**
	*  set values "'"
	*/
   	public void setValHex7dTrue() {  			
    	setByteWs( valHex7d88Value);
   	}
	char[] valHex7e88Value = "=".toCharArray();
	/**
	 *	Test condition "=" for isValHex7e()
	 *	@return  Returns true if isValHex7e() is "="
	 */
   public boolean isValHex7e() throws CFException {
      return (  compareChars( getByteWs() , valHex7e88Value)  == 0  );
   }


	/**
	*  set values "="
	*/
   	public void setValHex7eTrue() {  			
    	setByteWs( valHex7e88Value);
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x7F} for isValHex7f()
	 *	@return  Returns true if isValHex7f() is new byte[] {(byte)0x7F}
	 */
   public boolean isValHex7f() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x7F}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x7F}
	*/
   	public void setValHex7fTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x7F})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x80} for isValHex80()
	 *	@return  Returns true if isValHex80() is new byte[] {(byte)0x80}
	 */
   public boolean isValHex80() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x80}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x80}
	*/
   	public void setValHex80True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x80})".toCharArray());
   	}
	char[] valHex8188Value = "a".toCharArray();
	/**
	 *	Test condition "a" for isValHex81()
	 *	@return  Returns true if isValHex81() is "a"
	 */
   public boolean isValHex81() throws CFException {
      return (  compareChars( getByteWs() , valHex8188Value)  == 0  );
   }


	/**
	*  set values "a"
	*/
   	public void setValHex81True() {  			
    	setByteWs( valHex8188Value);
   	}
	char[] valHex8288Value = "b".toCharArray();
	/**
	 *	Test condition "b" for isValHex82()
	 *	@return  Returns true if isValHex82() is "b"
	 */
   public boolean isValHex82() throws CFException {
      return (  compareChars( getByteWs() , valHex8288Value)  == 0  );
   }


	/**
	*  set values "b"
	*/
   	public void setValHex82True() {  			
    	setByteWs( valHex8288Value);
   	}
	char[] valHex8388Value = "c".toCharArray();
	/**
	 *	Test condition "c" for isValHex83()
	 *	@return  Returns true if isValHex83() is "c"
	 */
   public boolean isValHex83() throws CFException {
      return (  compareChars( getByteWs() , valHex8388Value)  == 0  );
   }


	/**
	*  set values "c"
	*/
   	public void setValHex83True() {  			
    	setByteWs( valHex8388Value);
   	}
	char[] valHex8488Value = "d".toCharArray();
	/**
	 *	Test condition "d" for isValHex84()
	 *	@return  Returns true if isValHex84() is "d"
	 */
   public boolean isValHex84() throws CFException {
      return (  compareChars( getByteWs() , valHex8488Value)  == 0  );
   }


	/**
	*  set values "d"
	*/
   	public void setValHex84True() {  			
    	setByteWs( valHex8488Value);
   	}
	char[] valHex8588Value = "e".toCharArray();
	/**
	 *	Test condition "e" for isValHex85()
	 *	@return  Returns true if isValHex85() is "e"
	 */
   public boolean isValHex85() throws CFException {
      return (  compareChars( getByteWs() , valHex8588Value)  == 0  );
   }


	/**
	*  set values "e"
	*/
   	public void setValHex85True() {  			
    	setByteWs( valHex8588Value);
   	}
	char[] valHex8688Value = "f".toCharArray();
	/**
	 *	Test condition "f" for isValHex86()
	 *	@return  Returns true if isValHex86() is "f"
	 */
   public boolean isValHex86() throws CFException {
      return (  compareChars( getByteWs() , valHex8688Value)  == 0  );
   }


	/**
	*  set values "f"
	*/
   	public void setValHex86True() {  			
    	setByteWs( valHex8688Value);
   	}
	char[] valHex8788Value = "g".toCharArray();
	/**
	 *	Test condition "g" for isValHex87()
	 *	@return  Returns true if isValHex87() is "g"
	 */
   public boolean isValHex87() throws CFException {
      return (  compareChars( getByteWs() , valHex8788Value)  == 0  );
   }


	/**
	*  set values "g"
	*/
   	public void setValHex87True() {  			
    	setByteWs( valHex8788Value);
   	}
	char[] valHex8888Value = "h".toCharArray();
	/**
	 *	Test condition "h" for isValHex88()
	 *	@return  Returns true if isValHex88() is "h"
	 */
   public boolean isValHex88() throws CFException {
      return (  compareChars( getByteWs() , valHex8888Value)  == 0  );
   }


	/**
	*  set values "h"
	*/
   	public void setValHex88True() {  			
    	setByteWs( valHex8888Value);
   	}
	char[] valHex8988Value = "i".toCharArray();
	/**
	 *	Test condition "i" for isValHex89()
	 *	@return  Returns true if isValHex89() is "i"
	 */
   public boolean isValHex89() throws CFException {
      return (  compareChars( getByteWs() , valHex8988Value)  == 0  );
   }


	/**
	*  set values "i"
	*/
   	public void setValHex89True() {  			
    	setByteWs( valHex8988Value);
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x8A} for isValHex8a()
	 *	@return  Returns true if isValHex8a() is new byte[] {(byte)0x8A}
	 */
   public boolean isValHex8a() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x8A}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x8A}
	*/
   	public void setValHex8aTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x8A})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x8B} for isValHex8b()
	 *	@return  Returns true if isValHex8b() is new byte[] {(byte)0x8B}
	 */
   public boolean isValHex8b() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x8B}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x8B}
	*/
   	public void setValHex8bTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x8B})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x8C} for isValHex8c()
	 *	@return  Returns true if isValHex8c() is new byte[] {(byte)0x8C}
	 */
   public boolean isValHex8c() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x8C}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x8C}
	*/
   	public void setValHex8cTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x8C})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x8D} for isValHex8d()
	 *	@return  Returns true if isValHex8d() is new byte[] {(byte)0x8D}
	 */
   public boolean isValHex8d() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x8D}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x8D}
	*/
   	public void setValHex8dTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x8D})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x8E} for isValHex8e()
	 *	@return  Returns true if isValHex8e() is new byte[] {(byte)0x8E}
	 */
   public boolean isValHex8e() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x8E}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x8E}
	*/
   	public void setValHex8eTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x8E})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x8F} for isValHex8f()
	 *	@return  Returns true if isValHex8f() is new byte[] {(byte)0x8F}
	 */
   public boolean isValHex8f() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x8F}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x8F}
	*/
   	public void setValHex8fTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x8F})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x90} for isValHex90()
	 *	@return  Returns true if isValHex90() is new byte[] {(byte)0x90}
	 */
   public boolean isValHex90() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x90}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x90}
	*/
   	public void setValHex90True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x90})".toCharArray());
   	}
	char[] valHex9188Value = "j".toCharArray();
	/**
	 *	Test condition "j" for isValHex91()
	 *	@return  Returns true if isValHex91() is "j"
	 */
   public boolean isValHex91() throws CFException {
      return (  compareChars( getByteWs() , valHex9188Value)  == 0  );
   }


	/**
	*  set values "j"
	*/
   	public void setValHex91True() {  			
    	setByteWs( valHex9188Value);
   	}
	char[] valHex9288Value = "k".toCharArray();
	/**
	 *	Test condition "k" for isValHex92()
	 *	@return  Returns true if isValHex92() is "k"
	 */
   public boolean isValHex92() throws CFException {
      return (  compareChars( getByteWs() , valHex9288Value)  == 0  );
   }


	/**
	*  set values "k"
	*/
   	public void setValHex92True() {  			
    	setByteWs( valHex9288Value);
   	}
	char[] valHex9388Value = "l".toCharArray();
	/**
	 *	Test condition "l" for isValHex93()
	 *	@return  Returns true if isValHex93() is "l"
	 */
   public boolean isValHex93() throws CFException {
      return (  compareChars( getByteWs() , valHex9388Value)  == 0  );
   }


	/**
	*  set values "l"
	*/
   	public void setValHex93True() {  			
    	setByteWs( valHex9388Value);
   	}
	char[] valHex9488Value = "m".toCharArray();
	/**
	 *	Test condition "m" for isValHex94()
	 *	@return  Returns true if isValHex94() is "m"
	 */
   public boolean isValHex94() throws CFException {
      return (  compareChars( getByteWs() , valHex9488Value)  == 0  );
   }


	/**
	*  set values "m"
	*/
   	public void setValHex94True() {  			
    	setByteWs( valHex9488Value);
   	}
	char[] valHex9588Value = "n".toCharArray();
	/**
	 *	Test condition "n" for isValHex95()
	 *	@return  Returns true if isValHex95() is "n"
	 */
   public boolean isValHex95() throws CFException {
      return (  compareChars( getByteWs() , valHex9588Value)  == 0  );
   }


	/**
	*  set values "n"
	*/
   	public void setValHex95True() {  			
    	setByteWs( valHex9588Value);
   	}
	char[] valHex9688Value = "o".toCharArray();
	/**
	 *	Test condition "o" for isValHex96()
	 *	@return  Returns true if isValHex96() is "o"
	 */
   public boolean isValHex96() throws CFException {
      return (  compareChars( getByteWs() , valHex9688Value)  == 0  );
   }


	/**
	*  set values "o"
	*/
   	public void setValHex96True() {  			
    	setByteWs( valHex9688Value);
   	}
	char[] valHex9788Value = "p".toCharArray();
	/**
	 *	Test condition "p" for isValHex97()
	 *	@return  Returns true if isValHex97() is "p"
	 */
   public boolean isValHex97() throws CFException {
      return (  compareChars( getByteWs() , valHex9788Value)  == 0  );
   }


	/**
	*  set values "p"
	*/
   	public void setValHex97True() {  			
    	setByteWs( valHex9788Value);
   	}
	char[] valHex9888Value = "q".toCharArray();
	/**
	 *	Test condition "q" for isValHex98()
	 *	@return  Returns true if isValHex98() is "q"
	 */
   public boolean isValHex98() throws CFException {
      return (  compareChars( getByteWs() , valHex9888Value)  == 0  );
   }


	/**
	*  set values "q"
	*/
   	public void setValHex98True() {  			
    	setByteWs( valHex9888Value);
   	}
	char[] valHex9988Value = "r".toCharArray();
	/**
	 *	Test condition "r" for isValHex99()
	 *	@return  Returns true if isValHex99() is "r"
	 */
   public boolean isValHex99() throws CFException {
      return (  compareChars( getByteWs() , valHex9988Value)  == 0  );
   }


	/**
	*  set values "r"
	*/
   	public void setValHex99True() {  			
    	setByteWs( valHex9988Value);
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x9A} for isValHex9a()
	 *	@return  Returns true if isValHex9a() is new byte[] {(byte)0x9A}
	 */
   public boolean isValHex9a() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x9A}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x9A}
	*/
   	public void setValHex9aTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x9A})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x9B} for isValHex9b()
	 *	@return  Returns true if isValHex9b() is new byte[] {(byte)0x9B}
	 */
   public boolean isValHex9b() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x9B}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x9B}
	*/
   	public void setValHex9bTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x9B})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x9C} for isValHex9c()
	 *	@return  Returns true if isValHex9c() is new byte[] {(byte)0x9C}
	 */
   public boolean isValHex9c() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x9C}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x9C}
	*/
   	public void setValHex9cTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x9C})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x9D} for isValHex9d()
	 *	@return  Returns true if isValHex9d() is new byte[] {(byte)0x9D}
	 */
   public boolean isValHex9d() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x9D}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x9D}
	*/
   	public void setValHex9dTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x9D})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x9E} for isValHex9e()
	 *	@return  Returns true if isValHex9e() is new byte[] {(byte)0x9E}
	 */
   public boolean isValHex9e() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x9E}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x9E}
	*/
   	public void setValHex9eTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x9E})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x9F} for isValHex9f()
	 *	@return  Returns true if isValHex9f() is new byte[] {(byte)0x9F}
	 */
   public boolean isValHex9f() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0x9F}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x9F}
	*/
   	public void setValHex9fTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0x9F})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xA0} for isValHexA0()
	 *	@return  Returns true if isValHexA0() is new byte[] {(byte)0xA0}
	 */
   public boolean isValHexA0() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xA0}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xA0}
	*/
   	public void setValHexA0True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xA0})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xA1} for isValHexA1()
	 *	@return  Returns true if isValHexA1() is new byte[] {(byte)0xA1}
	 */
   public boolean isValHexA1() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xA1}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xA1}
	*/
   	public void setValHexA1True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xA1})".toCharArray());
   	}
	char[] valHexA288Value = "s".toCharArray();
	/**
	 *	Test condition "s" for isValHexA2()
	 *	@return  Returns true if isValHexA2() is "s"
	 */
   public boolean isValHexA2() throws CFException {
      return (  compareChars( getByteWs() , valHexA288Value)  == 0  );
   }


	/**
	*  set values "s"
	*/
   	public void setValHexA2True() {  			
    	setByteWs( valHexA288Value);
   	}
	char[] valHexA388Value = "t".toCharArray();
	/**
	 *	Test condition "t" for isValHexA3()
	 *	@return  Returns true if isValHexA3() is "t"
	 */
   public boolean isValHexA3() throws CFException {
      return (  compareChars( getByteWs() , valHexA388Value)  == 0  );
   }


	/**
	*  set values "t"
	*/
   	public void setValHexA3True() {  			
    	setByteWs( valHexA388Value);
   	}
	char[] valHexA488Value = "u".toCharArray();
	/**
	 *	Test condition "u" for isValHexA4()
	 *	@return  Returns true if isValHexA4() is "u"
	 */
   public boolean isValHexA4() throws CFException {
      return (  compareChars( getByteWs() , valHexA488Value)  == 0  );
   }


	/**
	*  set values "u"
	*/
   	public void setValHexA4True() {  			
    	setByteWs( valHexA488Value);
   	}
	char[] valHexA588Value = "v".toCharArray();
	/**
	 *	Test condition "v" for isValHexA5()
	 *	@return  Returns true if isValHexA5() is "v"
	 */
   public boolean isValHexA5() throws CFException {
      return (  compareChars( getByteWs() , valHexA588Value)  == 0  );
   }


	/**
	*  set values "v"
	*/
   	public void setValHexA5True() {  			
    	setByteWs( valHexA588Value);
   	}
	char[] valHexA688Value = "w".toCharArray();
	/**
	 *	Test condition "w" for isValHexA6()
	 *	@return  Returns true if isValHexA6() is "w"
	 */
   public boolean isValHexA6() throws CFException {
      return (  compareChars( getByteWs() , valHexA688Value)  == 0  );
   }


	/**
	*  set values "w"
	*/
   	public void setValHexA6True() {  			
    	setByteWs( valHexA688Value);
   	}
	char[] valHexA788Value = "x".toCharArray();
	/**
	 *	Test condition "x" for isValHexA7()
	 *	@return  Returns true if isValHexA7() is "x"
	 */
   public boolean isValHexA7() throws CFException {
      return (  compareChars( getByteWs() , valHexA788Value)  == 0  );
   }


	/**
	*  set values "x"
	*/
   	public void setValHexA7True() {  			
    	setByteWs( valHexA788Value);
   	}
	char[] valHexA888Value = "y".toCharArray();
	/**
	 *	Test condition "y" for isValHexA8()
	 *	@return  Returns true if isValHexA8() is "y"
	 */
   public boolean isValHexA8() throws CFException {
      return (  compareChars( getByteWs() , valHexA888Value)  == 0  );
   }


	/**
	*  set values "y"
	*/
   	public void setValHexA8True() {  			
    	setByteWs( valHexA888Value);
   	}
	char[] valHexA988Value = "z".toCharArray();
	/**
	 *	Test condition "z" for isValHexA9()
	 *	@return  Returns true if isValHexA9() is "z"
	 */
   public boolean isValHexA9() throws CFException {
      return (  compareChars( getByteWs() , valHexA988Value)  == 0  );
   }


	/**
	*  set values "z"
	*/
   	public void setValHexA9True() {  			
    	setByteWs( valHexA988Value);
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xAA} for isValHexAa()
	 *	@return  Returns true if isValHexAa() is new byte[] {(byte)0xAA}
	 */
   public boolean isValHexAa() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xAA}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xAA}
	*/
   	public void setValHexAaTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xAA})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xAB} for isValHexAb()
	 *	@return  Returns true if isValHexAb() is new byte[] {(byte)0xAB}
	 */
   public boolean isValHexAb() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xAB}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xAB}
	*/
   	public void setValHexAbTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xAB})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xAC} for isValHexAc()
	 *	@return  Returns true if isValHexAc() is new byte[] {(byte)0xAC}
	 */
   public boolean isValHexAc() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xAC}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xAC}
	*/
   	public void setValHexAcTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xAC})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xAD} for isValHexAd()
	 *	@return  Returns true if isValHexAd() is new byte[] {(byte)0xAD}
	 */
   public boolean isValHexAd() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xAD}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xAD}
	*/
   	public void setValHexAdTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xAD})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xAE} for isValHexAe()
	 *	@return  Returns true if isValHexAe() is new byte[] {(byte)0xAE}
	 */
   public boolean isValHexAe() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xAE}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xAE}
	*/
   	public void setValHexAeTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xAE})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xAF} for isValHexAf()
	 *	@return  Returns true if isValHexAf() is new byte[] {(byte)0xAF}
	 */
   public boolean isValHexAf() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xAF}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xAF}
	*/
   	public void setValHexAfTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xAF})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xB0} for isValHexB0()
	 *	@return  Returns true if isValHexB0() is new byte[] {(byte)0xB0}
	 */
   public boolean isValHexB0() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xB0}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xB0}
	*/
   	public void setValHexB0True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xB0})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xB1} for isValHexB1()
	 *	@return  Returns true if isValHexB1() is new byte[] {(byte)0xB1}
	 */
   public boolean isValHexB1() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xB1}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xB1}
	*/
   	public void setValHexB1True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xB1})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xB2} for isValHexB2()
	 *	@return  Returns true if isValHexB2() is new byte[] {(byte)0xB2}
	 */
   public boolean isValHexB2() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xB2}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xB2}
	*/
   	public void setValHexB2True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xB2})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xB3} for isValHexB3()
	 *	@return  Returns true if isValHexB3() is new byte[] {(byte)0xB3}
	 */
   public boolean isValHexB3() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xB3}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xB3}
	*/
   	public void setValHexB3True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xB3})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xB4} for isValHexB4()
	 *	@return  Returns true if isValHexB4() is new byte[] {(byte)0xB4}
	 */
   public boolean isValHexB4() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xB4}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xB4}
	*/
   	public void setValHexB4True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xB4})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xB5} for isValHexB5()
	 *	@return  Returns true if isValHexB5() is new byte[] {(byte)0xB5}
	 */
   public boolean isValHexB5() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xB5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xB5}
	*/
   	public void setValHexB5True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xB5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xB6} for isValHexB6()
	 *	@return  Returns true if isValHexB6() is new byte[] {(byte)0xB6}
	 */
   public boolean isValHexB6() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xB6}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xB6}
	*/
   	public void setValHexB6True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xB6})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xB7} for isValHexB7()
	 *	@return  Returns true if isValHexB7() is new byte[] {(byte)0xB7}
	 */
   public boolean isValHexB7() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xB7}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xB7}
	*/
   	public void setValHexB7True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xB7})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xB8} for isValHexB8()
	 *	@return  Returns true if isValHexB8() is new byte[] {(byte)0xB8}
	 */
   public boolean isValHexB8() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xB8}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xB8}
	*/
   	public void setValHexB8True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xB8})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xB9} for isValHexB9()
	 *	@return  Returns true if isValHexB9() is new byte[] {(byte)0xB9}
	 */
   public boolean isValHexB9() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xB9}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xB9}
	*/
   	public void setValHexB9True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xB9})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xBA} for isValHexBa()
	 *	@return  Returns true if isValHexBa() is new byte[] {(byte)0xBA}
	 */
   public boolean isValHexBa() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xBA}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xBA}
	*/
   	public void setValHexBaTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xBA})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xBB} for isValHexBb()
	 *	@return  Returns true if isValHexBb() is new byte[] {(byte)0xBB}
	 */
   public boolean isValHexBb() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xBB}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xBB}
	*/
   	public void setValHexBbTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xBB})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xBC} for isValHexBc()
	 *	@return  Returns true if isValHexBc() is new byte[] {(byte)0xBC}
	 */
   public boolean isValHexBc() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xBC}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xBC}
	*/
   	public void setValHexBcTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xBC})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xBD} for isValHexBd()
	 *	@return  Returns true if isValHexBd() is new byte[] {(byte)0xBD}
	 */
   public boolean isValHexBd() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xBD}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xBD}
	*/
   	public void setValHexBdTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xBD})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xBE} for isValHexBe()
	 *	@return  Returns true if isValHexBe() is new byte[] {(byte)0xBE}
	 */
   public boolean isValHexBe() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xBE}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xBE}
	*/
   	public void setValHexBeTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xBE})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xBF} for isValHexBf()
	 *	@return  Returns true if isValHexBf() is new byte[] {(byte)0xBF}
	 */
   public boolean isValHexBf() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xBF}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xBF}
	*/
   	public void setValHexBfTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xBF})".toCharArray());
   	}
	char[] valHexC088Value = "{".toCharArray();
	/**
	 *	Test condition "{" for isValHexC0()
	 *	@return  Returns true if isValHexC0() is "{"
	 */
   public boolean isValHexC0() throws CFException {
      return (  compareChars( getByteWs() , valHexC088Value)  == 0  );
   }


	/**
	*  set values "{"
	*/
   	public void setValHexC0True() {  			
    	setByteWs( valHexC088Value);
   	}
	char[] valHexC188Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isValHexC1()
	 *	@return  Returns true if isValHexC1() is "A"
	 */
   public boolean isValHexC1() throws CFException {
      return (  compareChars( getByteWs() , valHexC188Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setValHexC1True() {  			
    	setByteWs( valHexC188Value);
   	}
	char[] valHexC288Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isValHexC2()
	 *	@return  Returns true if isValHexC2() is "B"
	 */
   public boolean isValHexC2() throws CFException {
      return (  compareChars( getByteWs() , valHexC288Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setValHexC2True() {  			
    	setByteWs( valHexC288Value);
   	}
	char[] valHexC388Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isValHexC3()
	 *	@return  Returns true if isValHexC3() is "C"
	 */
   public boolean isValHexC3() throws CFException {
      return (  compareChars( getByteWs() , valHexC388Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setValHexC3True() {  			
    	setByteWs( valHexC388Value);
   	}
	char[] valHexC488Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isValHexC4()
	 *	@return  Returns true if isValHexC4() is "D"
	 */
   public boolean isValHexC4() throws CFException {
      return (  compareChars( getByteWs() , valHexC488Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setValHexC4True() {  			
    	setByteWs( valHexC488Value);
   	}
	char[] valHexC588Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isValHexC5()
	 *	@return  Returns true if isValHexC5() is "E"
	 */
   public boolean isValHexC5() throws CFException {
      return (  compareChars( getByteWs() , valHexC588Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setValHexC5True() {  			
    	setByteWs( valHexC588Value);
   	}
	char[] valHexC688Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isValHexC6()
	 *	@return  Returns true if isValHexC6() is "F"
	 */
   public boolean isValHexC6() throws CFException {
      return (  compareChars( getByteWs() , valHexC688Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setValHexC6True() {  			
    	setByteWs( valHexC688Value);
   	}
	char[] valHexC788Value = "G".toCharArray();
	/**
	 *	Test condition "G" for isValHexC7()
	 *	@return  Returns true if isValHexC7() is "G"
	 */
   public boolean isValHexC7() throws CFException {
      return (  compareChars( getByteWs() , valHexC788Value)  == 0  );
   }


	/**
	*  set values "G"
	*/
   	public void setValHexC7True() {  			
    	setByteWs( valHexC788Value);
   	}
	char[] valHexC888Value = "H".toCharArray();
	/**
	 *	Test condition "H" for isValHexC8()
	 *	@return  Returns true if isValHexC8() is "H"
	 */
   public boolean isValHexC8() throws CFException {
      return (  compareChars( getByteWs() , valHexC888Value)  == 0  );
   }


	/**
	*  set values "H"
	*/
   	public void setValHexC8True() {  			
    	setByteWs( valHexC888Value);
   	}
	char[] valHexC988Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isValHexC9()
	 *	@return  Returns true if isValHexC9() is "I"
	 */
   public boolean isValHexC9() throws CFException {
      return (  compareChars( getByteWs() , valHexC988Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setValHexC9True() {  			
    	setByteWs( valHexC988Value);
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xCA} for isValHexCa()
	 *	@return  Returns true if isValHexCa() is new byte[] {(byte)0xCA}
	 */
   public boolean isValHexCa() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xCA}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xCA}
	*/
   	public void setValHexCaTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xCA})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xCB} for isValHexCb()
	 *	@return  Returns true if isValHexCb() is new byte[] {(byte)0xCB}
	 */
   public boolean isValHexCb() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xCB}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xCB}
	*/
   	public void setValHexCbTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xCB})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xCC} for isValHexCc()
	 *	@return  Returns true if isValHexCc() is new byte[] {(byte)0xCC}
	 */
   public boolean isValHexCc() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xCC}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xCC}
	*/
   	public void setValHexCcTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xCC})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xCD} for isValHexCd()
	 *	@return  Returns true if isValHexCd() is new byte[] {(byte)0xCD}
	 */
   public boolean isValHexCd() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xCD}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xCD}
	*/
   	public void setValHexCdTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xCD})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xCE} for isValHexCe()
	 *	@return  Returns true if isValHexCe() is new byte[] {(byte)0xCE}
	 */
   public boolean isValHexCe() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xCE}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xCE}
	*/
   	public void setValHexCeTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xCE})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xCF} for isValHexCf()
	 *	@return  Returns true if isValHexCf() is new byte[] {(byte)0xCF}
	 */
   public boolean isValHexCf() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xCF}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xCF}
	*/
   	public void setValHexCfTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xCF})".toCharArray());
   	}
	char[] valHexD088Value = "}".toCharArray();
	/**
	 *	Test condition "}" for isValHexD0()
	 *	@return  Returns true if isValHexD0() is "}"
	 */
   public boolean isValHexD0() throws CFException {
      return (  compareChars( getByteWs() , valHexD088Value)  == 0  );
   }


	/**
	*  set values "}"
	*/
   	public void setValHexD0True() {  			
    	setByteWs( valHexD088Value);
   	}
	char[] valHexD188Value = "J".toCharArray();
	/**
	 *	Test condition "J" for isValHexD1()
	 *	@return  Returns true if isValHexD1() is "J"
	 */
   public boolean isValHexD1() throws CFException {
      return (  compareChars( getByteWs() , valHexD188Value)  == 0  );
   }


	/**
	*  set values "J"
	*/
   	public void setValHexD1True() {  			
    	setByteWs( valHexD188Value);
   	}
	char[] valHexD288Value = "K".toCharArray();
	/**
	 *	Test condition "K" for isValHexD2()
	 *	@return  Returns true if isValHexD2() is "K"
	 */
   public boolean isValHexD2() throws CFException {
      return (  compareChars( getByteWs() , valHexD288Value)  == 0  );
   }


	/**
	*  set values "K"
	*/
   	public void setValHexD2True() {  			
    	setByteWs( valHexD288Value);
   	}
	char[] valHexD388Value = "L".toCharArray();
	/**
	 *	Test condition "L" for isValHexD3()
	 *	@return  Returns true if isValHexD3() is "L"
	 */
   public boolean isValHexD3() throws CFException {
      return (  compareChars( getByteWs() , valHexD388Value)  == 0  );
   }


	/**
	*  set values "L"
	*/
   	public void setValHexD3True() {  			
    	setByteWs( valHexD388Value);
   	}
	char[] valHexD488Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isValHexD4()
	 *	@return  Returns true if isValHexD4() is "M"
	 */
   public boolean isValHexD4() throws CFException {
      return (  compareChars( getByteWs() , valHexD488Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setValHexD4True() {  			
    	setByteWs( valHexD488Value);
   	}
	char[] valHexD588Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isValHexD5()
	 *	@return  Returns true if isValHexD5() is "N"
	 */
   public boolean isValHexD5() throws CFException {
      return (  compareChars( getByteWs() , valHexD588Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setValHexD5True() {  			
    	setByteWs( valHexD588Value);
   	}
	char[] valHexD688Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isValHexD6()
	 *	@return  Returns true if isValHexD6() is "O"
	 */
   public boolean isValHexD6() throws CFException {
      return (  compareChars( getByteWs() , valHexD688Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setValHexD6True() {  			
    	setByteWs( valHexD688Value);
   	}
	char[] valHexD788Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isValHexD7()
	 *	@return  Returns true if isValHexD7() is "P"
	 */
   public boolean isValHexD7() throws CFException {
      return (  compareChars( getByteWs() , valHexD788Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setValHexD7True() {  			
    	setByteWs( valHexD788Value);
   	}
	char[] valHexD888Value = "Q".toCharArray();
	/**
	 *	Test condition "Q" for isValHexD8()
	 *	@return  Returns true if isValHexD8() is "Q"
	 */
   public boolean isValHexD8() throws CFException {
      return (  compareChars( getByteWs() , valHexD888Value)  == 0  );
   }


	/**
	*  set values "Q"
	*/
   	public void setValHexD8True() {  			
    	setByteWs( valHexD888Value);
   	}
	char[] valHexD988Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isValHexD9()
	 *	@return  Returns true if isValHexD9() is "R"
	 */
   public boolean isValHexD9() throws CFException {
      return (  compareChars( getByteWs() , valHexD988Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setValHexD9True() {  			
    	setByteWs( valHexD988Value);
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xDA} for isValHexDa()
	 *	@return  Returns true if isValHexDa() is new byte[] {(byte)0xDA}
	 */
   public boolean isValHexDa() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xDA}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xDA}
	*/
   	public void setValHexDaTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xDA})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xDB} for isValHexDb()
	 *	@return  Returns true if isValHexDb() is new byte[] {(byte)0xDB}
	 */
   public boolean isValHexDb() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xDB}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xDB}
	*/
   	public void setValHexDbTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xDB})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xDC} for isValHexDc()
	 *	@return  Returns true if isValHexDc() is new byte[] {(byte)0xDC}
	 */
   public boolean isValHexDc() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xDC}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xDC}
	*/
   	public void setValHexDcTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xDC})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xDD} for isValHexDd()
	 *	@return  Returns true if isValHexDd() is new byte[] {(byte)0xDD}
	 */
   public boolean isValHexDd() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xDD}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xDD}
	*/
   	public void setValHexDdTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xDD})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xDE} for isValHexDe()
	 *	@return  Returns true if isValHexDe() is new byte[] {(byte)0xDE}
	 */
   public boolean isValHexDe() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xDE}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xDE}
	*/
   	public void setValHexDeTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xDE})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xDF} for isValHexDf()
	 *	@return  Returns true if isValHexDf() is new byte[] {(byte)0xDF}
	 */
   public boolean isValHexDf() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xDF}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xDF}
	*/
   	public void setValHexDfTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xDF})".toCharArray());
   	}
	char[] valHexE088Value = "\\".toCharArray();
	/**
	 *	Test condition "\\" for isValHexE0()
	 *	@return  Returns true if isValHexE0() is "\\"
	 */
   public boolean isValHexE0() throws CFException {
      return (  compareChars( getByteWs() , valHexE088Value)  == 0  );
   }


	/**
	*  set values "\\"
	*/
   	public void setValHexE0True() {  			
    	setByteWs( valHexE088Value);
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xE1} for isValHexE1()
	 *	@return  Returns true if isValHexE1() is new byte[] {(byte)0xE1}
	 */
   public boolean isValHexE1() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xE1}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xE1}
	*/
   	public void setValHexE1True() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xE1})".toCharArray());
   	}
	char[] valHexE288Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isValHexE2()
	 *	@return  Returns true if isValHexE2() is "S"
	 */
   public boolean isValHexE2() throws CFException {
      return (  compareChars( getByteWs() , valHexE288Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setValHexE2True() {  			
    	setByteWs( valHexE288Value);
   	}
	char[] valHexE388Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isValHexE3()
	 *	@return  Returns true if isValHexE3() is "T"
	 */
   public boolean isValHexE3() throws CFException {
      return (  compareChars( getByteWs() , valHexE388Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setValHexE3True() {  			
    	setByteWs( valHexE388Value);
   	}
	char[] valHexE488Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isValHexE4()
	 *	@return  Returns true if isValHexE4() is "U"
	 */
   public boolean isValHexE4() throws CFException {
      return (  compareChars( getByteWs() , valHexE488Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setValHexE4True() {  			
    	setByteWs( valHexE488Value);
   	}
	char[] valHexE588Value = "V".toCharArray();
	/**
	 *	Test condition "V" for isValHexE5()
	 *	@return  Returns true if isValHexE5() is "V"
	 */
   public boolean isValHexE5() throws CFException {
      return (  compareChars( getByteWs() , valHexE588Value)  == 0  );
   }


	/**
	*  set values "V"
	*/
   	public void setValHexE5True() {  			
    	setByteWs( valHexE588Value);
   	}
	char[] valHexE688Value = "W".toCharArray();
	/**
	 *	Test condition "W" for isValHexE6()
	 *	@return  Returns true if isValHexE6() is "W"
	 */
   public boolean isValHexE6() throws CFException {
      return (  compareChars( getByteWs() , valHexE688Value)  == 0  );
   }


	/**
	*  set values "W"
	*/
   	public void setValHexE6True() {  			
    	setByteWs( valHexE688Value);
   	}
	char[] valHexE788Value = "X".toCharArray();
	/**
	 *	Test condition "X" for isValHexE7()
	 *	@return  Returns true if isValHexE7() is "X"
	 */
   public boolean isValHexE7() throws CFException {
      return (  compareChars( getByteWs() , valHexE788Value)  == 0  );
   }


	/**
	*  set values "X"
	*/
   	public void setValHexE7True() {  			
    	setByteWs( valHexE788Value);
   	}
	char[] valHexE888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isValHexE8()
	 *	@return  Returns true if isValHexE8() is "Y"
	 */
   public boolean isValHexE8() throws CFException {
      return (  compareChars( getByteWs() , valHexE888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setValHexE8True() {  			
    	setByteWs( valHexE888Value);
   	}
	char[] valHexE988Value = "Z".toCharArray();
	/**
	 *	Test condition "Z" for isValHexE9()
	 *	@return  Returns true if isValHexE9() is "Z"
	 */
   public boolean isValHexE9() throws CFException {
      return (  compareChars( getByteWs() , valHexE988Value)  == 0  );
   }


	/**
	*  set values "Z"
	*/
   	public void setValHexE9True() {  			
    	setByteWs( valHexE988Value);
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xEA} for isValHexEa()
	 *	@return  Returns true if isValHexEa() is new byte[] {(byte)0xEA}
	 */
   public boolean isValHexEa() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xEA}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xEA}
	*/
   	public void setValHexEaTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xEA})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xEB} for isValHexEb()
	 *	@return  Returns true if isValHexEb() is new byte[] {(byte)0xEB}
	 */
   public boolean isValHexEb() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xEB}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xEB}
	*/
   	public void setValHexEbTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xEB})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xEC} for isValHexEc()
	 *	@return  Returns true if isValHexEc() is new byte[] {(byte)0xEC}
	 */
   public boolean isValHexEc() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xEC}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xEC}
	*/
   	public void setValHexEcTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xEC})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xED} for isValHexEd()
	 *	@return  Returns true if isValHexEd() is new byte[] {(byte)0xED}
	 */
   public boolean isValHexEd() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xED}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xED}
	*/
   	public void setValHexEdTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xED})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xEE} for isValHexEe()
	 *	@return  Returns true if isValHexEe() is new byte[] {(byte)0xEE}
	 */
   public boolean isValHexEe() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xEE}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xEE}
	*/
   	public void setValHexEeTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xEE})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xEF} for isValHexEf()
	 *	@return  Returns true if isValHexEf() is new byte[] {(byte)0xEF}
	 */
   public boolean isValHexEf() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xEF}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xEF}
	*/
   	public void setValHexEfTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xEF})".toCharArray());
   	}
	char[] valHexF088Value = fillZeroes(1);
	/**
	 *	Test condition "0" for isValHexF0()
	 *	@return  Returns true if isValHexF0() is "0"
	 */
   public boolean isValHexF0() throws CFException {
      return (  compareChars( getByteWs() , valHexF088Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setValHexF0True() {  			
    	setByteWs( valHexF088Value);
   	}
	char[] valHexF188Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isValHexF1()
	 *	@return  Returns true if isValHexF1() is "1"
	 */
   public boolean isValHexF1() throws CFException {
      return (  compareChars( getByteWs() , valHexF188Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setValHexF1True() {  			
    	setByteWs( valHexF188Value);
   	}
	char[] valHexF288Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isValHexF2()
	 *	@return  Returns true if isValHexF2() is "2"
	 */
   public boolean isValHexF2() throws CFException {
      return (  compareChars( getByteWs() , valHexF288Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setValHexF2True() {  			
    	setByteWs( valHexF288Value);
   	}
	char[] valHexF388Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isValHexF3()
	 *	@return  Returns true if isValHexF3() is "3"
	 */
   public boolean isValHexF3() throws CFException {
      return (  compareChars( getByteWs() , valHexF388Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setValHexF3True() {  			
    	setByteWs( valHexF388Value);
   	}
	char[] valHexF488Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isValHexF4()
	 *	@return  Returns true if isValHexF4() is "4"
	 */
   public boolean isValHexF4() throws CFException {
      return (  compareChars( getByteWs() , valHexF488Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setValHexF4True() {  			
    	setByteWs( valHexF488Value);
   	}
	char[] valHexF588Value = "5".toCharArray();
	/**
	 *	Test condition "5" for isValHexF5()
	 *	@return  Returns true if isValHexF5() is "5"
	 */
   public boolean isValHexF5() throws CFException {
      return (  compareChars( getByteWs() , valHexF588Value)  == 0  );
   }


	/**
	*  set values "5"
	*/
   	public void setValHexF5True() {  			
    	setByteWs( valHexF588Value);
   	}
	char[] valHexF688Value = "6".toCharArray();
	/**
	 *	Test condition "6" for isValHexF6()
	 *	@return  Returns true if isValHexF6() is "6"
	 */
   public boolean isValHexF6() throws CFException {
      return (  compareChars( getByteWs() , valHexF688Value)  == 0  );
   }


	/**
	*  set values "6"
	*/
   	public void setValHexF6True() {  			
    	setByteWs( valHexF688Value);
   	}
	char[] valHexF788Value = "7".toCharArray();
	/**
	 *	Test condition "7" for isValHexF7()
	 *	@return  Returns true if isValHexF7() is "7"
	 */
   public boolean isValHexF7() throws CFException {
      return (  compareChars( getByteWs() , valHexF788Value)  == 0  );
   }


	/**
	*  set values "7"
	*/
   	public void setValHexF7True() {  			
    	setByteWs( valHexF788Value);
   	}
	char[] valHexF888Value = "8".toCharArray();
	/**
	 *	Test condition "8" for isValHexF8()
	 *	@return  Returns true if isValHexF8() is "8"
	 */
   public boolean isValHexF8() throws CFException {
      return (  compareChars( getByteWs() , valHexF888Value)  == 0  );
   }


	/**
	*  set values "8"
	*/
   	public void setValHexF8True() {  			
    	setByteWs( valHexF888Value);
   	}
	char[] valHexF988Value = "9".toCharArray();
	/**
	 *	Test condition "9" for isValHexF9()
	 *	@return  Returns true if isValHexF9() is "9"
	 */
   public boolean isValHexF9() throws CFException {
      return (  compareChars( getByteWs() , valHexF988Value)  == 0  );
   }


	/**
	*  set values "9"
	*/
   	public void setValHexF9True() {  			
    	setByteWs( valHexF988Value);
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xFA} for isValHexFa()
	 *	@return  Returns true if isValHexFa() is new byte[] {(byte)0xFA}
	 */
   public boolean isValHexFa() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xFA}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFA}
	*/
   	public void setValHexFaTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xFA})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xFB} for isValHexFb()
	 *	@return  Returns true if isValHexFb() is new byte[] {(byte)0xFB}
	 */
   public boolean isValHexFb() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xFB}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFB}
	*/
   	public void setValHexFbTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xFB})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xFC} for isValHexFc()
	 *	@return  Returns true if isValHexFc() is new byte[] {(byte)0xFC}
	 */
   public boolean isValHexFc() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xFC}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFC}
	*/
   	public void setValHexFcTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xFC})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xFD} for isValHexFd()
	 *	@return  Returns true if isValHexFd() is new byte[] {(byte)0xFD}
	 */
   public boolean isValHexFd() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xFD}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFD}
	*/
   	public void setValHexFdTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xFD})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0xFE} for isValHexFe()
	 *	@return  Returns true if isValHexFe() is new byte[] {(byte)0xFE}
	 */
   public boolean isValHexFe() throws CFException {
      return (  compareChars( getByteWs() , convertEbcdicBytes2Char(new byte[] {(byte)0xFE}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFE}
	*/
   	public void setValHexFeTrue() {  			
    	setByteWs( "convertEbcdicBytes2Char(new byte[] {(byte)0xFE})".toCharArray());
   	}
	char[] valHexFf88Value = fillHighValue(1);
	/**
	 *	Test condition new byte[] {(byte)0xFF} for isValHexFf()
	 *	@return  Returns true if isValHexFf() is new byte[] {(byte)0xFF}
	 */
   public boolean isValHexFf() throws CFException {
      return (  compareChars( getByteWs() , valHexFf88Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setValHexFfTrue() {  			
    	setByteWs( valHexFf88Value);
   	}
	/**
	 *	Returns the value of hexChar
	 *	@return hexChar
	 */
   public char[] getHexChar() throws CFException{
     if (isHexCharModified()) { 
        hexChar = refreshHexChar();
     }
   		return hexChar;
   }

  
	/**
	*  set variable hexChar
	*  Corresponding COBOL Variable is WS-HEX-CHAR
	*  @param value
	**/
   public void setHexChar(char[] value) {
      hexChar = checkHexCharConstraints(value);
      serializeHexChar(hexChar);
   } 

     /**
	 * 	Update HexChar 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHexChar(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHexChar,hexChar.length);
   	
   }
   
   public void setHexChar(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHexChar,hexChar.length);
   	
   }
   
     /**
	 * 	Update HexChar 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHexChar(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHexChar+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HexChar with another Field
	 *	@param value
	 */
   public void setHexChar(Field source) {
       replace(source,0,source.length(),beginHexChar,HEX_CHAR_LEN);
   	
   }  
   
     /**
	 * 	Update HexChar 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHexChar(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHexChar,HEX_CHAR_LEN);
   	
   }
   
     /**
	 * 	Update HexChar 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHexChar(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHexChar+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of nonDisplayableStr
	 *	@return nonDisplayableStr
	 */
   public char[] getNonDisplayableStr() throws CFException{
     if (isNonDisplayableStrModified()) { 
        nonDisplayableStr = refreshNonDisplayableStr();
     }
   		return nonDisplayableStr;
   }

  
	/**
	*  set variable nonDisplayableStr
	*  Corresponding COBOL Variable is WS-NON-DISPLAYABLE-STR
	*  @param value
	**/
   public void setNonDisplayableStr(char[] value) {
      nonDisplayableStr = checkNonDisplayableStrConstraints(value);
      serializeNonDisplayableStr(nonDisplayableStr);
   } 

     /**
	 * 	Update NonDisplayableStr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNonDisplayableStr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNonDisplayableStr,nonDisplayableStr.length);
   	
   }
   
   public void setNonDisplayableStr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNonDisplayableStr,nonDisplayableStr.length);
   	
   }
   
     /**
	 * 	Update NonDisplayableStr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNonDisplayableStr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNonDisplayableStr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NonDisplayableStr with another Field
	 *	@param value
	 */
   public void setNonDisplayableStr(Field source) {
       replace(source,0,source.length(),beginNonDisplayableStr,NON_DISPLAYABLE_STR_LEN);
   	
   }  
   
     /**
	 * 	Update NonDisplayableStr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNonDisplayableStr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNonDisplayableStr,NON_DISPLAYABLE_STR_LEN);
   	
   }
   
     /**
	 * 	Update NonDisplayableStr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNonDisplayableStr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNonDisplayableStr+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Out
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setByteWs(CONSTANTS.SPACE);
         setHexChar(CONSTANTS.SPACE_2);
         setNonDisplayableStr(CONSTANTS.SPACE_25);
   }

		public static int getOutFieldLength() {
			return OUT_LENGTH;
		}

}
  
