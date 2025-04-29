package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000804PdsAttrRow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip000804PdsAttrRow extends Ip000804PdsAttrRowSerialized { 
   

						private char[] ip000804PdsName = Field.fillLowValue(57);

						private char[] ip000804PdsFormat = Field.fillLowValue(3);

								private short ip000804PdsMinLngth;

								private short ip000804PdsMaxLngth;

								private short ip000804PdsSubflds;

								private int ip000804PdsFirstSubfld;

						private char[] ip000804PdsFirstSubfldRedefined = Field.fillLowValue(4);
	
	/**
	* Constructor for Ip000804PdsAttrRow
	**/
    public Ip000804PdsAttrRow() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip000804PdsAttrRow. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip000804PdsAttrRow(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip000804PdsName
	 *	@return ip000804PdsName
	 */
   public char[] getIp000804PdsName() throws CFException{
     if (isIp000804PdsNameModified()) { 
        ip000804PdsName = refreshIp000804PdsName();
     }
   		return ip000804PdsName;
   }

  
	/**
	*  set variable ip000804PdsName
	*  Corresponding COBOL Variable is IP000804-PDS-NAME
	*  @param value
	**/
   public void setIp000804PdsName(char[] value) {
      ip000804PdsName = checkIp000804PdsNameConstraints(value);
      serializeIp000804PdsName(ip000804PdsName);
   } 

     /**
	 * 	Update Ip000804PdsName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000804PdsName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp000804PdsName,ip000804PdsName.length);
   	
   }
   
   public void setIp000804PdsName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp000804PdsName,ip000804PdsName.length);
   	
   }
   
     /**
	 * 	Update Ip000804PdsName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000804PdsName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000804PdsName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip000804PdsName with another Field
	 *	@param value
	 */
   public void setIp000804PdsName(Field source) {
       replace(source,0,source.length(),beginIp000804PdsName,IP_000804_PDS_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip000804PdsName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000804PdsName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp000804PdsName,IP_000804_PDS_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip000804PdsName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000804PdsName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000804PdsName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip000804PdsFormat
	 *	@return ip000804PdsFormat
	 */
   public char[] getIp000804PdsFormat() throws CFException{
     if (isIp000804PdsFormatModified()) { 
        ip000804PdsFormat = refreshIp000804PdsFormat();
     }
   		return ip000804PdsFormat;
   }

  
	/**
	*  set variable ip000804PdsFormat
	*  Corresponding COBOL Variable is IP000804-PDS-FORMAT
	*  @param value
	**/
   public void setIp000804PdsFormat(char[] value) {
      ip000804PdsFormat = checkIp000804PdsFormatConstraints(value);
      serializeIp000804PdsFormat(ip000804PdsFormat);
   } 

     /**
	 * 	Update Ip000804PdsFormat 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000804PdsFormat(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp000804PdsFormat,ip000804PdsFormat.length);
   	
   }
   
   public void setIp000804PdsFormat(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp000804PdsFormat,ip000804PdsFormat.length);
   	
   }
   
     /**
	 * 	Update Ip000804PdsFormat 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000804PdsFormat(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000804PdsFormat+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip000804PdsFormat with another Field
	 *	@param value
	 */
   public void setIp000804PdsFormat(Field source) {
       replace(source,0,source.length(),beginIp000804PdsFormat,IP_000804_PDS_FORMAT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip000804PdsFormat 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000804PdsFormat(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp000804PdsFormat,IP_000804_PDS_FORMAT_LEN);
   	
   }
   
     /**
	 * 	Update Ip000804PdsFormat 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000804PdsFormat(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000804PdsFormat+targetIndex,targetLen);
    
   }
	char[] ip000804UnusedPdsEntry88Value = fillHighValue(3);
	/**
	 *	Test condition new byte[] {(byte)0xFF} for isIp000804UnusedPdsEntry()
	 *	@return  Returns true if isIp000804UnusedPdsEntry() is new byte[] {(byte)0xFF}
	 */
   public boolean isIp000804UnusedPdsEntry() throws CFException {
      return (  compareChars( getIp000804PdsFormat() , ip000804UnusedPdsEntry88Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setIp000804UnusedPdsEntryTrue() {  			
    	setIp000804PdsFormat( ip000804UnusedPdsEntry88Value);
   	}
	/**
	 *	Returns the value of ip000804PdsMinLngth
	 *	@return ip000804PdsMinLngth
	 */
	public short getIp000804PdsMinLngth() throws CFException {
        if (isIp000804PdsMinLngthModified()) { 
           ip000804PdsMinLngth = refreshIp000804PdsMinLngth();
        }
   		return ip000804PdsMinLngth;
	}
	
	/**
	 * 	Update Ip000804PdsMinLngth with the passed value
	 *  Corresponding COBOL Variable is IP000804-PDS-MIN-LNGTH
	 *	@param number
	 */
	public void setIp000804PdsMinLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000804PdsMinLngth = checkIp000804PdsMinLngthMaxLimit(number); 
		serializeIp000804PdsMinLngth(ip000804PdsMinLngth);
	}

	public void setIp000804PdsMinLngth(int number) {
	    number = checkIp000804PdsMinLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000804PdsMinLngth((short)number);
	}
	public void setIp000804PdsMinLngth(long number) {
	    number = checkIp000804PdsMinLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000804PdsMinLngth((short)number);
	}
	

	/**
	 *	Returns the value of ip000804PdsMaxLngth
	 *	@return ip000804PdsMaxLngth
	 */
	public short getIp000804PdsMaxLngth() throws CFException {
        if (isIp000804PdsMaxLngthModified()) { 
           ip000804PdsMaxLngth = refreshIp000804PdsMaxLngth();
        }
   		return ip000804PdsMaxLngth;
	}
	
	/**
	 * 	Update Ip000804PdsMaxLngth with the passed value
	 *  Corresponding COBOL Variable is IP000804-PDS-MAX-LNGTH
	 *	@param number
	 */
	public void setIp000804PdsMaxLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000804PdsMaxLngth = checkIp000804PdsMaxLngthMaxLimit(number); 
		serializeIp000804PdsMaxLngth(ip000804PdsMaxLngth);
	}

	public void setIp000804PdsMaxLngth(int number) {
	    number = checkIp000804PdsMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000804PdsMaxLngth((short)number);
	}
	public void setIp000804PdsMaxLngth(long number) {
	    number = checkIp000804PdsMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000804PdsMaxLngth((short)number);
	}
	

	
	/**
	 *	Test condition 0 -1 for isIp000804UndefinedPds()
	 *	@return  Returns true if isIp000804UndefinedPds() is 0 -1
	 */
   public boolean isIp000804UndefinedPds() throws CFException {
      return (  getIp000804PdsMaxLngth()  ==  0  ||  getIp000804PdsMaxLngth()  ==  -1  );
   }


	/**
	*  set values 0 -1
	*/
   	public void setIp000804UndefinedPdsTrue() {  			
    	setIp000804PdsMaxLngth( (short)0);
   	}
	/**
	 *	Returns the value of ip000804PdsSubflds
	 *	@return ip000804PdsSubflds
	 */
	public short getIp000804PdsSubflds() throws CFException {
        if (isIp000804PdsSubfldsModified()) { 
           ip000804PdsSubflds = refreshIp000804PdsSubflds();
        }
   		return ip000804PdsSubflds;
	}
	
	/**
	 * 	Update Ip000804PdsSubflds with the passed value
	 *  Corresponding COBOL Variable is IP000804-PDS-SUBFLDS
	 *	@param number
	 */
	public void setIp000804PdsSubflds(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000804PdsSubflds = checkIp000804PdsSubfldsMaxLimit(number); 
		serializeIp000804PdsSubflds(ip000804PdsSubflds);
	}

	public void setIp000804PdsSubflds(int number) {
	    number = checkIp000804PdsSubfldsMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000804PdsSubflds((short)number);
	}
	public void setIp000804PdsSubflds(long number) {
	    number = checkIp000804PdsSubfldsMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000804PdsSubflds((short)number);
	}
	

	/**
	 *	Returns the value of ip000804PdsFirstSubfld
	 *	@return ip000804PdsFirstSubfld
	 */
	public int getIp000804PdsFirstSubfld() throws CFException {
        if (isIp000804PdsFirstSubfldModified()) { 
           ip000804PdsFirstSubfld = refreshIp000804PdsFirstSubfld();
        }
   		return ip000804PdsFirstSubfld;
	}
	
	/**
	 * 	Update Ip000804PdsFirstSubfld with the passed value
	 *  Corresponding COBOL Variable is IP000804-PDS-FIRST-SUBFLD
	 *	@param number
	 */
	public void setIp000804PdsFirstSubfld(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000804PdsFirstSubfld = checkIp000804PdsFirstSubfldMaxLimit(number); 
		serializeIp000804PdsFirstSubfld(ip000804PdsFirstSubfld);
	}


	public void setIp000804PdsFirstSubfld(long number) {
	    number = checkIp000804PdsFirstSubfldMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp000804PdsFirstSubfld((int)number);
	}
	
	/**
	 *	Returns the value of ip000804PdsFirstSubfldRedefined
	 *	@return ip000804PdsFirstSubfldRedefined
	 */
   public char[] getIp000804PdsFirstSubfldRedefined() throws CFException{
     if (isIp000804PdsFirstSubfldRedefinedModified()) { 
        ip000804PdsFirstSubfldRedefined = refreshIp000804PdsFirstSubfldRedefined();
     }
   		return ip000804PdsFirstSubfldRedefined;
   }

  
	/**
	*  set variable ip000804PdsFirstSubfldRedefined
	*  Corresponding COBOL Variable is IP000804-PDS-FIRST-SUBFLD-REDEFINED
	*  @param value
	**/
   public void setIp000804PdsFirstSubfldRedefined(char[] value) {
      ip000804PdsFirstSubfldRedefined = checkIp000804PdsFirstSubfldRedefinedConstraints(value);
      serializeIp000804PdsFirstSubfldRedefined(ip000804PdsFirstSubfldRedefined);
   } 

     /**
	 * 	Update Ip000804PdsFirstSubfldRedefined 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000804PdsFirstSubfldRedefined(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp000804PdsFirstSubfldRedefined,ip000804PdsFirstSubfldRedefined.length);
   	
   }
   
   public void setIp000804PdsFirstSubfldRedefined(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp000804PdsFirstSubfldRedefined,ip000804PdsFirstSubfldRedefined.length);
   	
   }
   
     /**
	 * 	Update Ip000804PdsFirstSubfldRedefined 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000804PdsFirstSubfldRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000804PdsFirstSubfldRedefined+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip000804PdsFirstSubfldRedefined with another Field
	 *	@param value
	 */
   public void setIp000804PdsFirstSubfldRedefined(Field source) {
       replace(source,0,source.length(),beginIp000804PdsFirstSubfldRedefined,IP_000804_PDS_FIRST_SUBFLD_REDEFINED_LEN);
   	
   }  
   
     /**
	 * 	Update Ip000804PdsFirstSubfldRedefined 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000804PdsFirstSubfldRedefined(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp000804PdsFirstSubfldRedefined,IP_000804_PDS_FIRST_SUBFLD_REDEFINED_LEN);
   	
   }
   
     /**
	 * 	Update Ip000804PdsFirstSubfldRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000804PdsFirstSubfldRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000804PdsFirstSubfldRedefined+targetIndex,targetLen);
    
   }
	char[] ip000804NoPdsSubflds8888Value = fillHighValue(4);
	/**
	 *	Test condition new byte[] {(byte)0xFF} for isIp000804NoPdsSubflds88()
	 *	@return  Returns true if isIp000804NoPdsSubflds88() is new byte[] {(byte)0xFF}
	 */
   public boolean isIp000804NoPdsSubflds88() throws CFException {
      return (  compareChars( getIp000804PdsFirstSubfldRedefined() , ip000804NoPdsSubflds8888Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setIp000804NoPdsSubflds88True() {  			
    	setIp000804PdsFirstSubfldRedefined( ip000804NoPdsSubflds8888Value);
   	}

	
	
	
	/**
	 * 	initializes Ip000804PdsAttrRow
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp000804PdsName(CONSTANTS.SPACE_57);
         setIp000804PdsFormat(CONSTANTS.SPACE_3);
         	setIp000804PdsMinLngth((short)0);
         	setIp000804PdsMaxLngth((short)0);
         	setIp000804PdsSubflds((short)0);
                     setIp000804PdsFirstSubfld(0);
   }

		public static int getIp000804PdsAttrRowFieldLength() {
			return IP_000804_PDS_ATTR_ROW_LENGTH;
		}

}
  
