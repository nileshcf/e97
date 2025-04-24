package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00060aDeAttrRow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00060aDeAttrRow extends Ip00060aDeAttrRowSerialized { 
   

						private char[] ip00060aDeAb = Field.fillLowValue(3);

								private int ip00060aDeNo;

						private char[] ip00060aDeName = Field.fillLowValue(57);

						private char[] ip00060aDeFormat = Field.fillLowValue(3);

								private short ip00060aDeMinLngth;

								private short ip00060aDeMcMaxLngth;

								private short ip00060aDeIsoMaxLngth;

								private short ip00060aDeLllSize;

								private short ip00060aDeSubflds;

								private int ip00060aDeFirstSubfld;

						private char[] ip00060aDeFirstSubfldRedefined = Field.fillLowValue(4);
	
	/**
	* Constructor for Ip00060aDeAttrRow
	**/
    public Ip00060aDeAttrRow() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00060aDeAttrRow. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00060aDeAttrRow(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00060aDeAb
	 *	@return ip00060aDeAb
	 */
   public char[] getIp00060aDeAb() throws CFException{
     if (isIp00060aDeAbModified()) { 
        ip00060aDeAb = refreshIp00060aDeAb();
     }
   		return ip00060aDeAb;
   }

  
	/**
	*  set variable ip00060aDeAb
	*  Corresponding COBOL Variable is IP00060A-DE-AB
	*  @param value
	**/
   public void setIp00060aDeAb(char[] value) {
      ip00060aDeAb = checkIp00060aDeAbConstraints(value);
      serializeIp00060aDeAb(ip00060aDeAb);
   } 

     /**
	 * 	Update Ip00060aDeAb 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00060aDeAb(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00060aDeAb,ip00060aDeAb.length);
   	
   }
   
   public void setIp00060aDeAb(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00060aDeAb,ip00060aDeAb.length);
   	
   }
   
     /**
	 * 	Update Ip00060aDeAb 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00060aDeAb(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00060aDeAb+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00060aDeAb with another Field
	 *	@param value
	 */
   public void setIp00060aDeAb(Field source) {
       replace(source,0,source.length(),beginIp00060aDeAb,IP_00060A_DE_AB_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00060aDeAb 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00060aDeAb(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00060aDeAb,IP_00060A_DE_AB_LEN);
   	
   }
   
     /**
	 * 	Update Ip00060aDeAb 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00060aDeAb(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00060aDeAb+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00060aDeNo
	 *	@return ip00060aDeNo
	 */
	public int getIp00060aDeNo() throws CFException {
       if (isIp00060aDeNoModified()) { 
           ip00060aDeNo = refreshIp00060aDeNo();
        }
   		return ip00060aDeNo;
	}
	

	
	   
	/**
	 * 	Update Ip00060aDeNo with the passed value
	 *  Corresponding COBOL Variable is IP00060A-DE-NO
	 *	@param number
	 */
	public void setIp00060aDeNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00060aDeNo = checkIp00060aDeNoMaxLimit(number); 
		serializeIp00060aDeNo(ip00060aDeNo);
	}
	

	public void setIp00060aDeNo(long number) {
	    number = checkIp00060aDeNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00060aDeNo((int)number);
	}
	
	/**
	 * 	Update Ip00060aDeNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00060aDeNo(char[] value) throws CFException {
		 ip00060aDeNo = serializeIp00060aDeNo(value);
	}
	/**
	 * 	Update Ip00060aDeNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00060aDeNoString(char[] value) throws CFException {
		 setIp00060aDeNo(value);
	}
	/**
	 *	Returns the value of ip00060aDeName
	 *	@return ip00060aDeName
	 */
   public char[] getIp00060aDeName() throws CFException{
     if (isIp00060aDeNameModified()) { 
        ip00060aDeName = refreshIp00060aDeName();
     }
   		return ip00060aDeName;
   }

  
	/**
	*  set variable ip00060aDeName
	*  Corresponding COBOL Variable is IP00060A-DE-NAME
	*  @param value
	**/
   public void setIp00060aDeName(char[] value) {
      ip00060aDeName = checkIp00060aDeNameConstraints(value);
      serializeIp00060aDeName(ip00060aDeName);
   } 

     /**
	 * 	Update Ip00060aDeName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00060aDeName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00060aDeName,ip00060aDeName.length);
   	
   }
   
   public void setIp00060aDeName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00060aDeName,ip00060aDeName.length);
   	
   }
   
     /**
	 * 	Update Ip00060aDeName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00060aDeName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00060aDeName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00060aDeName with another Field
	 *	@param value
	 */
   public void setIp00060aDeName(Field source) {
       replace(source,0,source.length(),beginIp00060aDeName,IP_00060A_DE_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00060aDeName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00060aDeName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00060aDeName,IP_00060A_DE_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip00060aDeName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00060aDeName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00060aDeName+targetIndex,targetLen);
    
   }
	char[] ip00060aUndefinedDe88Value1 = fillHighValue(57);
char[] ip00060aUndefinedDe88Value2 = "                                                         ".toCharArray();

	/**
	 *	Test condition new byte[] {(byte)0xFF} " " for isIp00060aUndefinedDe()
	 *	@return  Returns true if isIp00060aUndefinedDe() is new byte[] {(byte)0xFF} " "
	 */
   public boolean isIp00060aUndefinedDe() throws CFException {
      return (  compareChars( getIp00060aDeName() , ip00060aUndefinedDe88Value1)  == 0  ||  compareChars( getIp00060aDeName() , ip00060aUndefinedDe88Value2)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFF} " "
	*/
   	public void setIp00060aUndefinedDeTrue() {  			
    	setIp00060aDeName( ip00060aUndefinedDe88Value1);
   	}
	/**
	 *	Returns the value of ip00060aDeFormat
	 *	@return ip00060aDeFormat
	 */
   public char[] getIp00060aDeFormat() throws CFException{
     if (isIp00060aDeFormatModified()) { 
        ip00060aDeFormat = refreshIp00060aDeFormat();
     }
   		return ip00060aDeFormat;
   }

  
	/**
	*  set variable ip00060aDeFormat
	*  Corresponding COBOL Variable is IP00060A-DE-FORMAT
	*  @param value
	**/
   public void setIp00060aDeFormat(char[] value) {
      ip00060aDeFormat = checkIp00060aDeFormatConstraints(value);
      serializeIp00060aDeFormat(ip00060aDeFormat);
   } 

     /**
	 * 	Update Ip00060aDeFormat 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00060aDeFormat(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00060aDeFormat,ip00060aDeFormat.length);
   	
   }
   
   public void setIp00060aDeFormat(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00060aDeFormat,ip00060aDeFormat.length);
   	
   }
   
     /**
	 * 	Update Ip00060aDeFormat 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00060aDeFormat(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00060aDeFormat+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00060aDeFormat with another Field
	 *	@param value
	 */
   public void setIp00060aDeFormat(Field source) {
       replace(source,0,source.length(),beginIp00060aDeFormat,IP_00060A_DE_FORMAT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00060aDeFormat 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00060aDeFormat(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00060aDeFormat,IP_00060A_DE_FORMAT_LEN);
   	
   }
   
     /**
	 * 	Update Ip00060aDeFormat 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00060aDeFormat(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00060aDeFormat+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00060aDeMinLngth
	 *	@return ip00060aDeMinLngth
	 */
	public short getIp00060aDeMinLngth() throws CFException {
        if (isIp00060aDeMinLngthModified()) { 
           ip00060aDeMinLngth = refreshIp00060aDeMinLngth();
        }
   		return ip00060aDeMinLngth;
	}
	
	/**
	 * 	Update Ip00060aDeMinLngth with the passed value
	 *  Corresponding COBOL Variable is IP00060A-DE-MIN-LNGTH
	 *	@param number
	 */
	public void setIp00060aDeMinLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00060aDeMinLngth = checkIp00060aDeMinLngthMaxLimit(number); 
		serializeIp00060aDeMinLngth(ip00060aDeMinLngth);
	}

	public void setIp00060aDeMinLngth(int number) {
	    number = checkIp00060aDeMinLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00060aDeMinLngth((short)number);
	}
	public void setIp00060aDeMinLngth(long number) {
	    number = checkIp00060aDeMinLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00060aDeMinLngth((short)number);
	}
	

	/**
	 *	Returns the value of ip00060aDeMcMaxLngth
	 *	@return ip00060aDeMcMaxLngth
	 */
	public short getIp00060aDeMcMaxLngth() throws CFException {
        if (isIp00060aDeMcMaxLngthModified()) { 
           ip00060aDeMcMaxLngth = refreshIp00060aDeMcMaxLngth();
        }
   		return ip00060aDeMcMaxLngth;
	}
	
	/**
	 * 	Update Ip00060aDeMcMaxLngth with the passed value
	 *  Corresponding COBOL Variable is IP00060A-DE-MC-MAX-LNGTH
	 *	@param number
	 */
	public void setIp00060aDeMcMaxLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00060aDeMcMaxLngth = checkIp00060aDeMcMaxLngthMaxLimit(number); 
		serializeIp00060aDeMcMaxLngth(ip00060aDeMcMaxLngth);
	}

	public void setIp00060aDeMcMaxLngth(int number) {
	    number = checkIp00060aDeMcMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00060aDeMcMaxLngth((short)number);
	}
	public void setIp00060aDeMcMaxLngth(long number) {
	    number = checkIp00060aDeMcMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00060aDeMcMaxLngth((short)number);
	}
	

	/**
	 *	Returns the value of ip00060aDeIsoMaxLngth
	 *	@return ip00060aDeIsoMaxLngth
	 */
	public short getIp00060aDeIsoMaxLngth() throws CFException {
        if (isIp00060aDeIsoMaxLngthModified()) { 
           ip00060aDeIsoMaxLngth = refreshIp00060aDeIsoMaxLngth();
        }
   		return ip00060aDeIsoMaxLngth;
	}
	
	/**
	 * 	Update Ip00060aDeIsoMaxLngth with the passed value
	 *  Corresponding COBOL Variable is IP00060A-DE-ISO-MAX-LNGTH
	 *	@param number
	 */
	public void setIp00060aDeIsoMaxLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00060aDeIsoMaxLngth = checkIp00060aDeIsoMaxLngthMaxLimit(number); 
		serializeIp00060aDeIsoMaxLngth(ip00060aDeIsoMaxLngth);
	}

	public void setIp00060aDeIsoMaxLngth(int number) {
	    number = checkIp00060aDeIsoMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00060aDeIsoMaxLngth((short)number);
	}
	public void setIp00060aDeIsoMaxLngth(long number) {
	    number = checkIp00060aDeIsoMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00060aDeIsoMaxLngth((short)number);
	}
	

	/**
	 *	Returns the value of ip00060aDeLllSize
	 *	@return ip00060aDeLllSize
	 */
	public short getIp00060aDeLllSize() throws CFException {
        if (isIp00060aDeLllSizeModified()) { 
           ip00060aDeLllSize = refreshIp00060aDeLllSize();
        }
   		return ip00060aDeLllSize;
	}
	
	/**
	 * 	Update Ip00060aDeLllSize with the passed value
	 *  Corresponding COBOL Variable is IP00060A-DE-LLL-SIZE
	 *	@param number
	 */
	public void setIp00060aDeLllSize(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00060aDeLllSize = checkIp00060aDeLllSizeMaxLimit(number); 
		serializeIp00060aDeLllSize(ip00060aDeLllSize);
	}

	public void setIp00060aDeLllSize(int number) {
	    number = checkIp00060aDeLllSizeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00060aDeLllSize((short)number);
	}
	public void setIp00060aDeLllSize(long number) {
	    number = checkIp00060aDeLllSizeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00060aDeLllSize((short)number);
	}
	

	/**
	 *	Returns the value of ip00060aDeSubflds
	 *	@return ip00060aDeSubflds
	 */
	public short getIp00060aDeSubflds() throws CFException {
        if (isIp00060aDeSubfldsModified()) { 
           ip00060aDeSubflds = refreshIp00060aDeSubflds();
        }
   		return ip00060aDeSubflds;
	}
	
	/**
	 * 	Update Ip00060aDeSubflds with the passed value
	 *  Corresponding COBOL Variable is IP00060A-DE-SUBFLDS
	 *	@param number
	 */
	public void setIp00060aDeSubflds(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00060aDeSubflds = checkIp00060aDeSubfldsMaxLimit(number); 
		serializeIp00060aDeSubflds(ip00060aDeSubflds);
	}

	public void setIp00060aDeSubflds(int number) {
	    number = checkIp00060aDeSubfldsMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00060aDeSubflds((short)number);
	}
	public void setIp00060aDeSubflds(long number) {
	    number = checkIp00060aDeSubfldsMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00060aDeSubflds((short)number);
	}
	

	/**
	 *	Returns the value of ip00060aDeFirstSubfld
	 *	@return ip00060aDeFirstSubfld
	 */
	public int getIp00060aDeFirstSubfld() throws CFException {
        if (isIp00060aDeFirstSubfldModified()) { 
           ip00060aDeFirstSubfld = refreshIp00060aDeFirstSubfld();
        }
   		return ip00060aDeFirstSubfld;
	}
	
	/**
	 * 	Update Ip00060aDeFirstSubfld with the passed value
	 *  Corresponding COBOL Variable is IP00060A-DE-FIRST-SUBFLD
	 *	@param number
	 */
	public void setIp00060aDeFirstSubfld(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00060aDeFirstSubfld = checkIp00060aDeFirstSubfldMaxLimit(number); 
		serializeIp00060aDeFirstSubfld(ip00060aDeFirstSubfld);
	}


	public void setIp00060aDeFirstSubfld(long number) {
	    number = checkIp00060aDeFirstSubfldMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00060aDeFirstSubfld((int)number);
	}
	
	/**
	 *	Returns the value of ip00060aDeFirstSubfldRedefined
	 *	@return ip00060aDeFirstSubfldRedefined
	 */
   public char[] getIp00060aDeFirstSubfldRedefined() throws CFException{
     if (isIp00060aDeFirstSubfldRedefinedModified()) { 
        ip00060aDeFirstSubfldRedefined = refreshIp00060aDeFirstSubfldRedefined();
     }
   		return ip00060aDeFirstSubfldRedefined;
   }

  
	/**
	*  set variable ip00060aDeFirstSubfldRedefined
	*  Corresponding COBOL Variable is IP00060A-DE-FIRST-SUBFLD-REDEFINED
	*  @param value
	**/
   public void setIp00060aDeFirstSubfldRedefined(char[] value) {
      ip00060aDeFirstSubfldRedefined = checkIp00060aDeFirstSubfldRedefinedConstraints(value);
      serializeIp00060aDeFirstSubfldRedefined(ip00060aDeFirstSubfldRedefined);
   } 

     /**
	 * 	Update Ip00060aDeFirstSubfldRedefined 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00060aDeFirstSubfldRedefined(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00060aDeFirstSubfldRedefined,ip00060aDeFirstSubfldRedefined.length);
   	
   }
   
   public void setIp00060aDeFirstSubfldRedefined(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00060aDeFirstSubfldRedefined,ip00060aDeFirstSubfldRedefined.length);
   	
   }
   
     /**
	 * 	Update Ip00060aDeFirstSubfldRedefined 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00060aDeFirstSubfldRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00060aDeFirstSubfldRedefined+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00060aDeFirstSubfldRedefined with another Field
	 *	@param value
	 */
   public void setIp00060aDeFirstSubfldRedefined(Field source) {
       replace(source,0,source.length(),beginIp00060aDeFirstSubfldRedefined,IP_00060A_DE_FIRST_SUBFLD_REDEFINED_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00060aDeFirstSubfldRedefined 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00060aDeFirstSubfldRedefined(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00060aDeFirstSubfldRedefined,IP_00060A_DE_FIRST_SUBFLD_REDEFINED_LEN);
   	
   }
   
     /**
	 * 	Update Ip00060aDeFirstSubfldRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00060aDeFirstSubfldRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00060aDeFirstSubfldRedefined+targetIndex,targetLen);
    
   }
	char[] ip00060aNoDeSubflds8888Value = fillHighValue(4);
	/**
	 *	Test condition new byte[] {(byte)0xFF} for isIp00060aNoDeSubflds88()
	 *	@return  Returns true if isIp00060aNoDeSubflds88() is new byte[] {(byte)0xFF}
	 */
   public boolean isIp00060aNoDeSubflds88() throws CFException {
      return (  compareChars( getIp00060aDeFirstSubfldRedefined() , ip00060aNoDeSubflds8888Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setIp00060aNoDeSubflds88True() {  			
    	setIp00060aDeFirstSubfldRedefined( ip00060aNoDeSubflds8888Value);
   	}

	
	
	
	/**
	 * 	initializes Ip00060aDeAttrRow
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00060aDeAb(CONSTANTS.SPACE_3);
                     setIp00060aDeNo(0);
         setIp00060aDeName(CONSTANTS.SPACE_57);
         setIp00060aDeFormat(CONSTANTS.SPACE_3);
         	setIp00060aDeMinLngth((short)0);
         	setIp00060aDeMcMaxLngth((short)0);
         	setIp00060aDeIsoMaxLngth((short)0);
         	setIp00060aDeLllSize((short)0);
         	setIp00060aDeSubflds((short)0);
                     setIp00060aDeFirstSubfld(0);
   }

		public static int getIp00060aDeAttrRowFieldLength() {
			return IP_00060A_DE_ATTR_ROW_LENGTH;
		}

}
  
