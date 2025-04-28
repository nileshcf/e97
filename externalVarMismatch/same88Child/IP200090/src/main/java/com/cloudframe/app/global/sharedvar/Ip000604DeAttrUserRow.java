package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000604DeAttrUserRow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:00. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip000604DeAttrUserRow extends Ip000604DeAttrUserRowSerialized { 
   

						private char[] ip000604DeAb = Field.fillLowValue(3);

								private int ip000604DeNo;

						private char[] ip000604DeName = Field.fillLowValue(57);

						private char[] ip000604DeFormat = Field.fillLowValue(3);

								private short ip000604DeMinLngth;

								private short ip000604DeMcMaxLngth;

								private short ip000604DeIsoMaxLngth;

								private short ip000604DeLllSize;

								private short ip000604DeSubflds;

								private int ip000604DeFirstSubfld;

						private char[] ip000604DeFirstSubfldRedefined = Field.fillLowValue(4);
	
	/**
	* Constructor for Ip000604DeAttrUserRow
	**/
    public Ip000604DeAttrUserRow() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip000604DeAttrUserRow. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip000604DeAttrUserRow(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip000604DeAb
	 *	@return ip000604DeAb
	 */
   public char[] getIp000604DeAb() throws CFException{
     if (isIp000604DeAbModified()) { 
        ip000604DeAb = refreshIp000604DeAb();
     }
   		return ip000604DeAb;
   }

  
	/**
	*  set variable ip000604DeAb
	*  Corresponding COBOL Variable is IP000604-DE-AB
	*  @param value
	**/
   public void setIp000604DeAb(char[] value) {
      ip000604DeAb = checkIp000604DeAbConstraints(value);
      serializeIp000604DeAb(ip000604DeAb);
   } 

     /**
	 * 	Update Ip000604DeAb 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000604DeAb(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp000604DeAb,ip000604DeAb.length);
   	
   }
   
   public void setIp000604DeAb(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp000604DeAb,ip000604DeAb.length);
   	
   }
   
     /**
	 * 	Update Ip000604DeAb 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000604DeAb(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000604DeAb+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip000604DeAb with another Field
	 *	@param value
	 */
   public void setIp000604DeAb(Field source) {
       replace(source,0,source.length(),beginIp000604DeAb,IP_000604_DE_AB_LEN);
   	
   }  
   
     /**
	 * 	Update Ip000604DeAb 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000604DeAb(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp000604DeAb,IP_000604_DE_AB_LEN);
   	
   }
   
     /**
	 * 	Update Ip000604DeAb 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000604DeAb(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000604DeAb+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip000604DeNo
	 *	@return ip000604DeNo
	 */
	public int getIp000604DeNo() throws CFException {
       if (isIp000604DeNoModified()) { 
           ip000604DeNo = refreshIp000604DeNo();
        }
   		return ip000604DeNo;
	}
	

	
	   
	/**
	 * 	Update Ip000604DeNo with the passed value
	 *  Corresponding COBOL Variable is IP000604-DE-NO
	 *	@param number
	 */
	public void setIp000604DeNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip000604DeNo = checkIp000604DeNoMaxLimit(number); 
		serializeIp000604DeNo(ip000604DeNo);
	}
	

	public void setIp000604DeNo(long number) {
	    number = checkIp000604DeNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp000604DeNo((int)number);
	}
	
	/**
	 * 	Update Ip000604DeNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp000604DeNo(char[] value) throws CFException {
		 ip000604DeNo = serializeIp000604DeNo(value);
	}
	/**
	 * 	Update Ip000604DeNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp000604DeNoString(char[] value) throws CFException {
		 setIp000604DeNo(value);
	}
	/**
	 *	Returns the value of ip000604DeName
	 *	@return ip000604DeName
	 */
   public char[] getIp000604DeName() throws CFException{
     if (isIp000604DeNameModified()) { 
        ip000604DeName = refreshIp000604DeName();
     }
   		return ip000604DeName;
   }

  
	/**
	*  set variable ip000604DeName
	*  Corresponding COBOL Variable is IP000604-DE-NAME
	*  @param value
	**/
   public void setIp000604DeName(char[] value) {
      ip000604DeName = checkIp000604DeNameConstraints(value);
      serializeIp000604DeName(ip000604DeName);
   } 

     /**
	 * 	Update Ip000604DeName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000604DeName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp000604DeName,ip000604DeName.length);
   	
   }
   
   public void setIp000604DeName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp000604DeName,ip000604DeName.length);
   	
   }
   
     /**
	 * 	Update Ip000604DeName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000604DeName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000604DeName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip000604DeName with another Field
	 *	@param value
	 */
   public void setIp000604DeName(Field source) {
       replace(source,0,source.length(),beginIp000604DeName,IP_000604_DE_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip000604DeName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000604DeName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp000604DeName,IP_000604_DE_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip000604DeName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000604DeName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000604DeName+targetIndex,targetLen);
    
   }
	char[] ip000604UndefinedDe88Value1 = fillHighValue(57);
char[] ip000604UndefinedDe88Value2 = "                                                         ".toCharArray();

	/**
	 *	Test condition new byte[] {(byte)0xFF} " " for isIp000604UndefinedDe()
	 *	@return  Returns true if isIp000604UndefinedDe() is new byte[] {(byte)0xFF} " "
	 */
   public boolean isIp000604UndefinedDe() throws CFException {
      return (  compareChars( getIp000604DeName() , ip000604UndefinedDe88Value1)  == 0  ||  compareChars( getIp000604DeName() , ip000604UndefinedDe88Value2)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFF} " "
	*/
   	public void setIp000604UndefinedDeTrue() {  			
    	setIp000604DeName( ip000604UndefinedDe88Value1);
   	}
	/**
	 *	Returns the value of ip000604DeFormat
	 *	@return ip000604DeFormat
	 */
   public char[] getIp000604DeFormat() throws CFException{
     if (isIp000604DeFormatModified()) { 
        ip000604DeFormat = refreshIp000604DeFormat();
     }
   		return ip000604DeFormat;
   }

  
	/**
	*  set variable ip000604DeFormat
	*  Corresponding COBOL Variable is IP000604-DE-FORMAT
	*  @param value
	**/
   public void setIp000604DeFormat(char[] value) {
      ip000604DeFormat = checkIp000604DeFormatConstraints(value);
      serializeIp000604DeFormat(ip000604DeFormat);
   } 

     /**
	 * 	Update Ip000604DeFormat 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000604DeFormat(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp000604DeFormat,ip000604DeFormat.length);
   	
   }
   
   public void setIp000604DeFormat(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp000604DeFormat,ip000604DeFormat.length);
   	
   }
   
     /**
	 * 	Update Ip000604DeFormat 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000604DeFormat(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000604DeFormat+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip000604DeFormat with another Field
	 *	@param value
	 */
   public void setIp000604DeFormat(Field source) {
       replace(source,0,source.length(),beginIp000604DeFormat,IP_000604_DE_FORMAT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip000604DeFormat 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000604DeFormat(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp000604DeFormat,IP_000604_DE_FORMAT_LEN);
   	
   }
   
     /**
	 * 	Update Ip000604DeFormat 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000604DeFormat(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000604DeFormat+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip000604DeMinLngth
	 *	@return ip000604DeMinLngth
	 */
	public short getIp000604DeMinLngth() throws CFException {
        if (isIp000604DeMinLngthModified()) { 
           ip000604DeMinLngth = refreshIp000604DeMinLngth();
        }
   		return ip000604DeMinLngth;
	}
	
	/**
	 * 	Update Ip000604DeMinLngth with the passed value
	 *  Corresponding COBOL Variable is IP000604-DE-MIN-LNGTH
	 *	@param number
	 */
	public void setIp000604DeMinLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000604DeMinLngth = checkIp000604DeMinLngthMaxLimit(number); 
		serializeIp000604DeMinLngth(ip000604DeMinLngth);
	}

	public void setIp000604DeMinLngth(int number) {
	    number = checkIp000604DeMinLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000604DeMinLngth((short)number);
	}
	public void setIp000604DeMinLngth(long number) {
	    number = checkIp000604DeMinLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000604DeMinLngth((short)number);
	}
	

	/**
	 *	Returns the value of ip000604DeMcMaxLngth
	 *	@return ip000604DeMcMaxLngth
	 */
	public short getIp000604DeMcMaxLngth() throws CFException {
        if (isIp000604DeMcMaxLngthModified()) { 
           ip000604DeMcMaxLngth = refreshIp000604DeMcMaxLngth();
        }
   		return ip000604DeMcMaxLngth;
	}
	
	/**
	 * 	Update Ip000604DeMcMaxLngth with the passed value
	 *  Corresponding COBOL Variable is IP000604-DE-MC-MAX-LNGTH
	 *	@param number
	 */
	public void setIp000604DeMcMaxLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000604DeMcMaxLngth = checkIp000604DeMcMaxLngthMaxLimit(number); 
		serializeIp000604DeMcMaxLngth(ip000604DeMcMaxLngth);
	}

	public void setIp000604DeMcMaxLngth(int number) {
	    number = checkIp000604DeMcMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000604DeMcMaxLngth((short)number);
	}
	public void setIp000604DeMcMaxLngth(long number) {
	    number = checkIp000604DeMcMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000604DeMcMaxLngth((short)number);
	}
	

	/**
	 *	Returns the value of ip000604DeIsoMaxLngth
	 *	@return ip000604DeIsoMaxLngth
	 */
	public short getIp000604DeIsoMaxLngth() throws CFException {
        if (isIp000604DeIsoMaxLngthModified()) { 
           ip000604DeIsoMaxLngth = refreshIp000604DeIsoMaxLngth();
        }
   		return ip000604DeIsoMaxLngth;
	}
	
	/**
	 * 	Update Ip000604DeIsoMaxLngth with the passed value
	 *  Corresponding COBOL Variable is IP000604-DE-ISO-MAX-LNGTH
	 *	@param number
	 */
	public void setIp000604DeIsoMaxLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000604DeIsoMaxLngth = checkIp000604DeIsoMaxLngthMaxLimit(number); 
		serializeIp000604DeIsoMaxLngth(ip000604DeIsoMaxLngth);
	}

	public void setIp000604DeIsoMaxLngth(int number) {
	    number = checkIp000604DeIsoMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000604DeIsoMaxLngth((short)number);
	}
	public void setIp000604DeIsoMaxLngth(long number) {
	    number = checkIp000604DeIsoMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000604DeIsoMaxLngth((short)number);
	}
	

	/**
	 *	Returns the value of ip000604DeLllSize
	 *	@return ip000604DeLllSize
	 */
	public short getIp000604DeLllSize() throws CFException {
        if (isIp000604DeLllSizeModified()) { 
           ip000604DeLllSize = refreshIp000604DeLllSize();
        }
   		return ip000604DeLllSize;
	}
	
	/**
	 * 	Update Ip000604DeLllSize with the passed value
	 *  Corresponding COBOL Variable is IP000604-DE-LLL-SIZE
	 *	@param number
	 */
	public void setIp000604DeLllSize(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000604DeLllSize = checkIp000604DeLllSizeMaxLimit(number); 
		serializeIp000604DeLllSize(ip000604DeLllSize);
	}

	public void setIp000604DeLllSize(int number) {
	    number = checkIp000604DeLllSizeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000604DeLllSize((short)number);
	}
	public void setIp000604DeLllSize(long number) {
	    number = checkIp000604DeLllSizeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000604DeLllSize((short)number);
	}
	

	/**
	 *	Returns the value of ip000604DeSubflds
	 *	@return ip000604DeSubflds
	 */
	public short getIp000604DeSubflds() throws CFException {
        if (isIp000604DeSubfldsModified()) { 
           ip000604DeSubflds = refreshIp000604DeSubflds();
        }
   		return ip000604DeSubflds;
	}
	
	/**
	 * 	Update Ip000604DeSubflds with the passed value
	 *  Corresponding COBOL Variable is IP000604-DE-SUBFLDS
	 *	@param number
	 */
	public void setIp000604DeSubflds(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000604DeSubflds = checkIp000604DeSubfldsMaxLimit(number); 
		serializeIp000604DeSubflds(ip000604DeSubflds);
	}

	public void setIp000604DeSubflds(int number) {
	    number = checkIp000604DeSubfldsMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000604DeSubflds((short)number);
	}
	public void setIp000604DeSubflds(long number) {
	    number = checkIp000604DeSubfldsMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000604DeSubflds((short)number);
	}
	

	/**
	 *	Returns the value of ip000604DeFirstSubfld
	 *	@return ip000604DeFirstSubfld
	 */
	public int getIp000604DeFirstSubfld() throws CFException {
        if (isIp000604DeFirstSubfldModified()) { 
           ip000604DeFirstSubfld = refreshIp000604DeFirstSubfld();
        }
   		return ip000604DeFirstSubfld;
	}
	
	/**
	 * 	Update Ip000604DeFirstSubfld with the passed value
	 *  Corresponding COBOL Variable is IP000604-DE-FIRST-SUBFLD
	 *	@param number
	 */
	public void setIp000604DeFirstSubfld(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000604DeFirstSubfld = checkIp000604DeFirstSubfldMaxLimit(number); 
		serializeIp000604DeFirstSubfld(ip000604DeFirstSubfld);
	}


	public void setIp000604DeFirstSubfld(long number) {
	    number = checkIp000604DeFirstSubfldMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp000604DeFirstSubfld((int)number);
	}
	
	/**
	 *	Returns the value of ip000604DeFirstSubfldRedefined
	 *	@return ip000604DeFirstSubfldRedefined
	 */
   public char[] getIp000604DeFirstSubfldRedefined() throws CFException{
     if (isIp000604DeFirstSubfldRedefinedModified()) { 
        ip000604DeFirstSubfldRedefined = refreshIp000604DeFirstSubfldRedefined();
     }
   		return ip000604DeFirstSubfldRedefined;
   }

  
	/**
	*  set variable ip000604DeFirstSubfldRedefined
	*  Corresponding COBOL Variable is IP000604-DE-FIRST-SUBFLD-REDEFINED
	*  @param value
	**/
   public void setIp000604DeFirstSubfldRedefined(char[] value) {
      ip000604DeFirstSubfldRedefined = checkIp000604DeFirstSubfldRedefinedConstraints(value);
      serializeIp000604DeFirstSubfldRedefined(ip000604DeFirstSubfldRedefined);
   } 

     /**
	 * 	Update Ip000604DeFirstSubfldRedefined 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000604DeFirstSubfldRedefined(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp000604DeFirstSubfldRedefined,ip000604DeFirstSubfldRedefined.length);
   	
   }
   
   public void setIp000604DeFirstSubfldRedefined(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp000604DeFirstSubfldRedefined,ip000604DeFirstSubfldRedefined.length);
   	
   }
   
     /**
	 * 	Update Ip000604DeFirstSubfldRedefined 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000604DeFirstSubfldRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000604DeFirstSubfldRedefined+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip000604DeFirstSubfldRedefined with another Field
	 *	@param value
	 */
   public void setIp000604DeFirstSubfldRedefined(Field source) {
       replace(source,0,source.length(),beginIp000604DeFirstSubfldRedefined,IP_000604_DE_FIRST_SUBFLD_REDEFINED_LEN);
   	
   }  
   
     /**
	 * 	Update Ip000604DeFirstSubfldRedefined 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000604DeFirstSubfldRedefined(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp000604DeFirstSubfldRedefined,IP_000604_DE_FIRST_SUBFLD_REDEFINED_LEN);
   	
   }
   
     /**
	 * 	Update Ip000604DeFirstSubfldRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000604DeFirstSubfldRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000604DeFirstSubfldRedefined+targetIndex,targetLen);
    
   }
	char[] ip000604NoDeSubflds8888Value = fillHighValue(4);
	/**
	 *	Test condition new byte[] {(byte)0xFF} for isIp000604NoDeSubflds88()
	 *	@return  Returns true if isIp000604NoDeSubflds88() is new byte[] {(byte)0xFF}
	 */
   public boolean isIp000604NoDeSubflds88() throws CFException {
      return (  compareChars( getIp000604DeFirstSubfldRedefined() , ip000604NoDeSubflds8888Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setIp000604NoDeSubflds88True() {  			
    	setIp000604DeFirstSubfldRedefined( ip000604NoDeSubflds8888Value);
   	}

	
	
	
	/**
	 * 	initializes Ip000604DeAttrUserRow
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp000604DeAb(CONSTANTS.SPACE_3);
                     setIp000604DeNo(0);
         setIp000604DeName(CONSTANTS.SPACE_57);
         setIp000604DeFormat(CONSTANTS.SPACE_3);
         	setIp000604DeMinLngth((short)0);
         	setIp000604DeMcMaxLngth((short)0);
         	setIp000604DeIsoMaxLngth((short)0);
         	setIp000604DeLllSize((short)0);
         	setIp000604DeSubflds((short)0);
                     setIp000604DeFirstSubfld(0);
   }

		public static int getIp000604DeAttrUserRowFieldLength() {
			return IP_000604_DE_ATTR_USER_ROW_LENGTH;
		}

}
  
