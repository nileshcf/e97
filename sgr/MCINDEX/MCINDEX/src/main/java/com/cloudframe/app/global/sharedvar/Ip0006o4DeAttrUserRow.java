package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0006o4DeAttrUserRow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0006o4DeAttrUserRow extends Ip0006o4DeAttrUserRowSerialized { 
   

						private char[] ip0006o4DeAb = Field.fillLowValue(3);

								private int ip0006o4DeNo;

						private char[] ip0006o4DeName = Field.fillLowValue(57);

						private char[] ip0006o4DeFormat = Field.fillLowValue(3);

								private short ip0006o4DeMinLngth;

								private short ip0006o4DeMcMaxLngth;

								private short ip0006o4DeIsoMaxLngth;

								private short ip0006o4DeLllSize;

								private short ip0006o4DeSubflds;

								private int ip0006o4DeFirstSubfld;

						private char[] ip0006o4DeFirstSubfldRedefined = Field.fillLowValue(4);
	
	/**
	* Constructor for Ip0006o4DeAttrUserRow
	**/
    public Ip0006o4DeAttrUserRow() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0006o4DeAttrUserRow. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0006o4DeAttrUserRow(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip0006o4DeAb
	 *	@return ip0006o4DeAb
	 */
   public char[] getIp0006o4DeAb() throws CFException{
     if (isIp0006o4DeAbModified()) { 
        ip0006o4DeAb = refreshIp0006o4DeAb();
     }
   		return ip0006o4DeAb;
   }

  
	/**
	*  set variable ip0006o4DeAb
	*  Corresponding COBOL Variable is IP0006O4-DE-AB
	*  @param value
	**/
   public void setIp0006o4DeAb(char[] value) {
      ip0006o4DeAb = checkIp0006o4DeAbConstraints(value);
      serializeIp0006o4DeAb(ip0006o4DeAb);
   } 

     /**
	 * 	Update Ip0006o4DeAb 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0006o4DeAb(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0006o4DeAb,ip0006o4DeAb.length);
   	
   }
   
   public void setIp0006o4DeAb(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0006o4DeAb,ip0006o4DeAb.length);
   	
   }
   
     /**
	 * 	Update Ip0006o4DeAb 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0006o4DeAb(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0006o4DeAb+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0006o4DeAb with another Field
	 *	@param value
	 */
   public void setIp0006o4DeAb(Field source) {
       replace(source,0,source.length(),beginIp0006o4DeAb,IP_0006O_4_DE_AB_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0006o4DeAb 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0006o4DeAb(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0006o4DeAb,IP_0006O_4_DE_AB_LEN);
   	
   }
   
     /**
	 * 	Update Ip0006o4DeAb 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0006o4DeAb(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0006o4DeAb+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0006o4DeNo
	 *	@return ip0006o4DeNo
	 */
	public int getIp0006o4DeNo() throws CFException {
       if (isIp0006o4DeNoModified()) { 
           ip0006o4DeNo = refreshIp0006o4DeNo();
        }
   		return ip0006o4DeNo;
	}
	

	
	   
	/**
	 * 	Update Ip0006o4DeNo with the passed value
	 *  Corresponding COBOL Variable is IP0006O4-DE-NO
	 *	@param number
	 */
	public void setIp0006o4DeNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0006o4DeNo = checkIp0006o4DeNoMaxLimit(number); 
		serializeIp0006o4DeNo(ip0006o4DeNo);
	}
	

	public void setIp0006o4DeNo(long number) {
	    number = checkIp0006o4DeNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0006o4DeNo((int)number);
	}
	
	/**
	 * 	Update Ip0006o4DeNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0006o4DeNo(char[] value) throws CFException {
		 ip0006o4DeNo = serializeIp0006o4DeNo(value);
	}
	/**
	 * 	Update Ip0006o4DeNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0006o4DeNoString(char[] value) throws CFException {
		 setIp0006o4DeNo(value);
	}
	/**
	 *	Returns the value of ip0006o4DeName
	 *	@return ip0006o4DeName
	 */
   public char[] getIp0006o4DeName() throws CFException{
     if (isIp0006o4DeNameModified()) { 
        ip0006o4DeName = refreshIp0006o4DeName();
     }
   		return ip0006o4DeName;
   }

  
	/**
	*  set variable ip0006o4DeName
	*  Corresponding COBOL Variable is IP0006O4-DE-NAME
	*  @param value
	**/
   public void setIp0006o4DeName(char[] value) {
      ip0006o4DeName = checkIp0006o4DeNameConstraints(value);
      serializeIp0006o4DeName(ip0006o4DeName);
   } 

     /**
	 * 	Update Ip0006o4DeName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0006o4DeName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0006o4DeName,ip0006o4DeName.length);
   	
   }
   
   public void setIp0006o4DeName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0006o4DeName,ip0006o4DeName.length);
   	
   }
   
     /**
	 * 	Update Ip0006o4DeName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0006o4DeName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0006o4DeName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0006o4DeName with another Field
	 *	@param value
	 */
   public void setIp0006o4DeName(Field source) {
       replace(source,0,source.length(),beginIp0006o4DeName,IP_0006O_4_DE_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0006o4DeName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0006o4DeName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0006o4DeName,IP_0006O_4_DE_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip0006o4DeName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0006o4DeName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0006o4DeName+targetIndex,targetLen);
    
   }
	char[] ip0006o4UndefinedDe88Value1 = fillHighValue(57);
char[] ip0006o4UndefinedDe88Value2 = "                                                         ".toCharArray();

	/**
	 *	Test condition new byte[] {(byte)0xFF} " " for isIp0006o4UndefinedDe()
	 *	@return  Returns true if isIp0006o4UndefinedDe() is new byte[] {(byte)0xFF} " "
	 */
   public boolean isIp0006o4UndefinedDe() throws CFException {
      return (  compareChars( getIp0006o4DeName() , ip0006o4UndefinedDe88Value1)  == 0  ||  compareChars( getIp0006o4DeName() , ip0006o4UndefinedDe88Value2)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFF} " "
	*/
   	public void setIp0006o4UndefinedDeTrue() {  			
    	setIp0006o4DeName( ip0006o4UndefinedDe88Value1);
   	}
	/**
	 *	Returns the value of ip0006o4DeFormat
	 *	@return ip0006o4DeFormat
	 */
   public char[] getIp0006o4DeFormat() throws CFException{
     if (isIp0006o4DeFormatModified()) { 
        ip0006o4DeFormat = refreshIp0006o4DeFormat();
     }
   		return ip0006o4DeFormat;
   }

  
	/**
	*  set variable ip0006o4DeFormat
	*  Corresponding COBOL Variable is IP0006O4-DE-FORMAT
	*  @param value
	**/
   public void setIp0006o4DeFormat(char[] value) {
      ip0006o4DeFormat = checkIp0006o4DeFormatConstraints(value);
      serializeIp0006o4DeFormat(ip0006o4DeFormat);
   } 

     /**
	 * 	Update Ip0006o4DeFormat 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0006o4DeFormat(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0006o4DeFormat,ip0006o4DeFormat.length);
   	
   }
   
   public void setIp0006o4DeFormat(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0006o4DeFormat,ip0006o4DeFormat.length);
   	
   }
   
     /**
	 * 	Update Ip0006o4DeFormat 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0006o4DeFormat(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0006o4DeFormat+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0006o4DeFormat with another Field
	 *	@param value
	 */
   public void setIp0006o4DeFormat(Field source) {
       replace(source,0,source.length(),beginIp0006o4DeFormat,IP_0006O_4_DE_FORMAT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0006o4DeFormat 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0006o4DeFormat(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0006o4DeFormat,IP_0006O_4_DE_FORMAT_LEN);
   	
   }
   
     /**
	 * 	Update Ip0006o4DeFormat 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0006o4DeFormat(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0006o4DeFormat+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0006o4DeMinLngth
	 *	@return ip0006o4DeMinLngth
	 */
	public short getIp0006o4DeMinLngth() throws CFException {
        if (isIp0006o4DeMinLngthModified()) { 
           ip0006o4DeMinLngth = refreshIp0006o4DeMinLngth();
        }
   		return ip0006o4DeMinLngth;
	}
	
	/**
	 * 	Update Ip0006o4DeMinLngth with the passed value
	 *  Corresponding COBOL Variable is IP0006O4-DE-MIN-LNGTH
	 *	@param number
	 */
	public void setIp0006o4DeMinLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip0006o4DeMinLngth = checkIp0006o4DeMinLngthMaxLimit(number); 
		serializeIp0006o4DeMinLngth(ip0006o4DeMinLngth);
	}

	public void setIp0006o4DeMinLngth(int number) {
	    number = checkIp0006o4DeMinLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0006o4DeMinLngth((short)number);
	}
	public void setIp0006o4DeMinLngth(long number) {
	    number = checkIp0006o4DeMinLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0006o4DeMinLngth((short)number);
	}
	

	/**
	 *	Returns the value of ip0006o4DeMcMaxLngth
	 *	@return ip0006o4DeMcMaxLngth
	 */
	public short getIp0006o4DeMcMaxLngth() throws CFException {
        if (isIp0006o4DeMcMaxLngthModified()) { 
           ip0006o4DeMcMaxLngth = refreshIp0006o4DeMcMaxLngth();
        }
   		return ip0006o4DeMcMaxLngth;
	}
	
	/**
	 * 	Update Ip0006o4DeMcMaxLngth with the passed value
	 *  Corresponding COBOL Variable is IP0006O4-DE-MC-MAX-LNGTH
	 *	@param number
	 */
	public void setIp0006o4DeMcMaxLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip0006o4DeMcMaxLngth = checkIp0006o4DeMcMaxLngthMaxLimit(number); 
		serializeIp0006o4DeMcMaxLngth(ip0006o4DeMcMaxLngth);
	}

	public void setIp0006o4DeMcMaxLngth(int number) {
	    number = checkIp0006o4DeMcMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0006o4DeMcMaxLngth((short)number);
	}
	public void setIp0006o4DeMcMaxLngth(long number) {
	    number = checkIp0006o4DeMcMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0006o4DeMcMaxLngth((short)number);
	}
	

	/**
	 *	Returns the value of ip0006o4DeIsoMaxLngth
	 *	@return ip0006o4DeIsoMaxLngth
	 */
	public short getIp0006o4DeIsoMaxLngth() throws CFException {
        if (isIp0006o4DeIsoMaxLngthModified()) { 
           ip0006o4DeIsoMaxLngth = refreshIp0006o4DeIsoMaxLngth();
        }
   		return ip0006o4DeIsoMaxLngth;
	}
	
	/**
	 * 	Update Ip0006o4DeIsoMaxLngth with the passed value
	 *  Corresponding COBOL Variable is IP0006O4-DE-ISO-MAX-LNGTH
	 *	@param number
	 */
	public void setIp0006o4DeIsoMaxLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip0006o4DeIsoMaxLngth = checkIp0006o4DeIsoMaxLngthMaxLimit(number); 
		serializeIp0006o4DeIsoMaxLngth(ip0006o4DeIsoMaxLngth);
	}

	public void setIp0006o4DeIsoMaxLngth(int number) {
	    number = checkIp0006o4DeIsoMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0006o4DeIsoMaxLngth((short)number);
	}
	public void setIp0006o4DeIsoMaxLngth(long number) {
	    number = checkIp0006o4DeIsoMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0006o4DeIsoMaxLngth((short)number);
	}
	

	/**
	 *	Returns the value of ip0006o4DeLllSize
	 *	@return ip0006o4DeLllSize
	 */
	public short getIp0006o4DeLllSize() throws CFException {
        if (isIp0006o4DeLllSizeModified()) { 
           ip0006o4DeLllSize = refreshIp0006o4DeLllSize();
        }
   		return ip0006o4DeLllSize;
	}
	
	/**
	 * 	Update Ip0006o4DeLllSize with the passed value
	 *  Corresponding COBOL Variable is IP0006O4-DE-LLL-SIZE
	 *	@param number
	 */
	public void setIp0006o4DeLllSize(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip0006o4DeLllSize = checkIp0006o4DeLllSizeMaxLimit(number); 
		serializeIp0006o4DeLllSize(ip0006o4DeLllSize);
	}

	public void setIp0006o4DeLllSize(int number) {
	    number = checkIp0006o4DeLllSizeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0006o4DeLllSize((short)number);
	}
	public void setIp0006o4DeLllSize(long number) {
	    number = checkIp0006o4DeLllSizeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0006o4DeLllSize((short)number);
	}
	

	/**
	 *	Returns the value of ip0006o4DeSubflds
	 *	@return ip0006o4DeSubflds
	 */
	public short getIp0006o4DeSubflds() throws CFException {
        if (isIp0006o4DeSubfldsModified()) { 
           ip0006o4DeSubflds = refreshIp0006o4DeSubflds();
        }
   		return ip0006o4DeSubflds;
	}
	
	/**
	 * 	Update Ip0006o4DeSubflds with the passed value
	 *  Corresponding COBOL Variable is IP0006O4-DE-SUBFLDS
	 *	@param number
	 */
	public void setIp0006o4DeSubflds(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip0006o4DeSubflds = checkIp0006o4DeSubfldsMaxLimit(number); 
		serializeIp0006o4DeSubflds(ip0006o4DeSubflds);
	}

	public void setIp0006o4DeSubflds(int number) {
	    number = checkIp0006o4DeSubfldsMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0006o4DeSubflds((short)number);
	}
	public void setIp0006o4DeSubflds(long number) {
	    number = checkIp0006o4DeSubfldsMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0006o4DeSubflds((short)number);
	}
	

	/**
	 *	Returns the value of ip0006o4DeFirstSubfld
	 *	@return ip0006o4DeFirstSubfld
	 */
	public int getIp0006o4DeFirstSubfld() throws CFException {
        if (isIp0006o4DeFirstSubfldModified()) { 
           ip0006o4DeFirstSubfld = refreshIp0006o4DeFirstSubfld();
        }
   		return ip0006o4DeFirstSubfld;
	}
	
	/**
	 * 	Update Ip0006o4DeFirstSubfld with the passed value
	 *  Corresponding COBOL Variable is IP0006O4-DE-FIRST-SUBFLD
	 *	@param number
	 */
	public void setIp0006o4DeFirstSubfld(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip0006o4DeFirstSubfld = checkIp0006o4DeFirstSubfldMaxLimit(number); 
		serializeIp0006o4DeFirstSubfld(ip0006o4DeFirstSubfld);
	}


	public void setIp0006o4DeFirstSubfld(long number) {
	    number = checkIp0006o4DeFirstSubfldMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0006o4DeFirstSubfld((int)number);
	}
	
	/**
	 *	Returns the value of ip0006o4DeFirstSubfldRedefined
	 *	@return ip0006o4DeFirstSubfldRedefined
	 */
   public char[] getIp0006o4DeFirstSubfldRedefined() throws CFException{
     if (isIp0006o4DeFirstSubfldRedefinedModified()) { 
        ip0006o4DeFirstSubfldRedefined = refreshIp0006o4DeFirstSubfldRedefined();
     }
   		return ip0006o4DeFirstSubfldRedefined;
   }

  
	/**
	*  set variable ip0006o4DeFirstSubfldRedefined
	*  Corresponding COBOL Variable is IP0006O4-DE-FIRST-SUBFLD-REDEFINED
	*  @param value
	**/
   public void setIp0006o4DeFirstSubfldRedefined(char[] value) {
      ip0006o4DeFirstSubfldRedefined = checkIp0006o4DeFirstSubfldRedefinedConstraints(value);
      serializeIp0006o4DeFirstSubfldRedefined(ip0006o4DeFirstSubfldRedefined);
   } 

     /**
	 * 	Update Ip0006o4DeFirstSubfldRedefined 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0006o4DeFirstSubfldRedefined(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0006o4DeFirstSubfldRedefined,ip0006o4DeFirstSubfldRedefined.length);
   	
   }
   
   public void setIp0006o4DeFirstSubfldRedefined(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0006o4DeFirstSubfldRedefined,ip0006o4DeFirstSubfldRedefined.length);
   	
   }
   
     /**
	 * 	Update Ip0006o4DeFirstSubfldRedefined 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0006o4DeFirstSubfldRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0006o4DeFirstSubfldRedefined+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0006o4DeFirstSubfldRedefined with another Field
	 *	@param value
	 */
   public void setIp0006o4DeFirstSubfldRedefined(Field source) {
       replace(source,0,source.length(),beginIp0006o4DeFirstSubfldRedefined,IP_0006O_4_DE_FIRST_SUBFLD_REDEFINED_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0006o4DeFirstSubfldRedefined 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0006o4DeFirstSubfldRedefined(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0006o4DeFirstSubfldRedefined,IP_0006O_4_DE_FIRST_SUBFLD_REDEFINED_LEN);
   	
   }
   
     /**
	 * 	Update Ip0006o4DeFirstSubfldRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0006o4DeFirstSubfldRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0006o4DeFirstSubfldRedefined+targetIndex,targetLen);
    
   }
	char[] ip0006o4NoDeSubflds8888Value = fillHighValue(4);
	/**
	 *	Test condition new byte[] {(byte)0xFF} for isIp0006o4NoDeSubflds88()
	 *	@return  Returns true if isIp0006o4NoDeSubflds88() is new byte[] {(byte)0xFF}
	 */
   public boolean isIp0006o4NoDeSubflds88() throws CFException {
      return (  compareChars( getIp0006o4DeFirstSubfldRedefined() , ip0006o4NoDeSubflds8888Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setIp0006o4NoDeSubflds88True() {  			
    	setIp0006o4DeFirstSubfldRedefined( ip0006o4NoDeSubflds8888Value);
   	}

	
	
	
	/**
	 * 	initializes Ip0006o4DeAttrUserRow
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0006o4DeAb(CONSTANTS.SPACE_3);
                     setIp0006o4DeNo(0);
         setIp0006o4DeName(CONSTANTS.SPACE_57);
         setIp0006o4DeFormat(CONSTANTS.SPACE_3);
         	setIp0006o4DeMinLngth((short)0);
         	setIp0006o4DeMcMaxLngth((short)0);
         	setIp0006o4DeIsoMaxLngth((short)0);
         	setIp0006o4DeLllSize((short)0);
         	setIp0006o4DeSubflds((short)0);
                     setIp0006o4DeFirstSubfld(0);
   }

		public static int getIp0006o4DeAttrUserRowFieldLength() {
			return IP_0006O_4_DE_ATTR_USER_ROW_LENGTH;
		}

}
  
