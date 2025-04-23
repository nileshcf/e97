package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000904PdsSubAttrRow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip000904PdsSubAttrRow extends Ip000904PdsSubAttrRowSerialized { 
   

								private short ip000904PdsNo;

								private short ip000904PdsSubNo;

						private char[] ip000904PdsSubName = Field.fillLowValue(57);

						private char[] ip000904PdsSubFormat = Field.fillLowValue(3);

								private short ip000904PdsSubStart;

								private short ip000904PdsSubMinLngth;

								private short ip000904PdsSubMaxLngth;
	
	/**
	* Constructor for Ip000904PdsSubAttrRow
	**/
    public Ip000904PdsSubAttrRow() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip000904PdsSubAttrRow. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip000904PdsSubAttrRow(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip000904PdsNo
	 *	@return ip000904PdsNo
	 */
	public short getIp000904PdsNo() throws CFException {
        if (isIp000904PdsNoModified()) { 
           ip000904PdsNo = refreshIp000904PdsNo();
        }
   		return ip000904PdsNo;
	}
	
	/**
	 * 	Update Ip000904PdsNo with the passed value
	 *  Corresponding COBOL Variable is IP000904-PDS-NO
	 *	@param number
	 */
	public void setIp000904PdsNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000904PdsNo = checkIp000904PdsNoMaxLimit(number); 
		serializeIp000904PdsNo(ip000904PdsNo);
	}

	public void setIp000904PdsNo(int number) {
	    number = checkIp000904PdsNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000904PdsNo((short)number);
	}
	public void setIp000904PdsNo(long number) {
	    number = checkIp000904PdsNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000904PdsNo((short)number);
	}
	

	/**
	 *	Returns the value of ip000904PdsSubNo
	 *	@return ip000904PdsSubNo
	 */
	public short getIp000904PdsSubNo() throws CFException {
        if (isIp000904PdsSubNoModified()) { 
           ip000904PdsSubNo = refreshIp000904PdsSubNo();
        }
   		return ip000904PdsSubNo;
	}
	
	/**
	 * 	Update Ip000904PdsSubNo with the passed value
	 *  Corresponding COBOL Variable is IP000904-PDS-SUB-NO
	 *	@param number
	 */
	public void setIp000904PdsSubNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000904PdsSubNo = checkIp000904PdsSubNoMaxLimit(number); 
		serializeIp000904PdsSubNo(ip000904PdsSubNo);
	}

	public void setIp000904PdsSubNo(int number) {
	    number = checkIp000904PdsSubNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000904PdsSubNo((short)number);
	}
	public void setIp000904PdsSubNo(long number) {
	    number = checkIp000904PdsSubNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000904PdsSubNo((short)number);
	}
	

	/**
	 *	Returns the value of ip000904PdsSubName
	 *	@return ip000904PdsSubName
	 */
   public char[] getIp000904PdsSubName() throws CFException{
     if (isIp000904PdsSubNameModified()) { 
        ip000904PdsSubName = refreshIp000904PdsSubName();
     }
   		return ip000904PdsSubName;
   }

  
	/**
	*  set variable ip000904PdsSubName
	*  Corresponding COBOL Variable is IP000904-PDS-SUB-NAME
	*  @param value
	**/
   public void setIp000904PdsSubName(char[] value) {
      ip000904PdsSubName = checkIp000904PdsSubNameConstraints(value);
      serializeIp000904PdsSubName(ip000904PdsSubName);
   } 

     /**
	 * 	Update Ip000904PdsSubName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000904PdsSubName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp000904PdsSubName,ip000904PdsSubName.length);
   	
   }
   
   public void setIp000904PdsSubName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp000904PdsSubName,ip000904PdsSubName.length);
   	
   }
   
     /**
	 * 	Update Ip000904PdsSubName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000904PdsSubName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000904PdsSubName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip000904PdsSubName with another Field
	 *	@param value
	 */
   public void setIp000904PdsSubName(Field source) {
       replace(source,0,source.length(),beginIp000904PdsSubName,IP_000904_PDS_SUB_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip000904PdsSubName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000904PdsSubName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp000904PdsSubName,IP_000904_PDS_SUB_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip000904PdsSubName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000904PdsSubName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000904PdsSubName+targetIndex,targetLen);
    
   }
	char[] ip000904UndefinedPdsSubfld88Value = fillHighValue(57);
	/**
	 *	Test condition new byte[] {(byte)0xFF} for isIp000904UndefinedPdsSubfld()
	 *	@return  Returns true if isIp000904UndefinedPdsSubfld() is new byte[] {(byte)0xFF}
	 */
   public boolean isIp000904UndefinedPdsSubfld() throws CFException {
      return (  compareChars( getIp000904PdsSubName() , ip000904UndefinedPdsSubfld88Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setIp000904UndefinedPdsSubfldTrue() {  			
    	setIp000904PdsSubName( ip000904UndefinedPdsSubfld88Value);
   	}
	/**
	 *	Returns the value of ip000904PdsSubFormat
	 *	@return ip000904PdsSubFormat
	 */
   public char[] getIp000904PdsSubFormat() throws CFException{
     if (isIp000904PdsSubFormatModified()) { 
        ip000904PdsSubFormat = refreshIp000904PdsSubFormat();
     }
   		return ip000904PdsSubFormat;
   }

  
	/**
	*  set variable ip000904PdsSubFormat
	*  Corresponding COBOL Variable is IP000904-PDS-SUB-FORMAT
	*  @param value
	**/
   public void setIp000904PdsSubFormat(char[] value) {
      ip000904PdsSubFormat = checkIp000904PdsSubFormatConstraints(value);
      serializeIp000904PdsSubFormat(ip000904PdsSubFormat);
   } 

     /**
	 * 	Update Ip000904PdsSubFormat 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000904PdsSubFormat(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp000904PdsSubFormat,ip000904PdsSubFormat.length);
   	
   }
   
   public void setIp000904PdsSubFormat(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp000904PdsSubFormat,ip000904PdsSubFormat.length);
   	
   }
   
     /**
	 * 	Update Ip000904PdsSubFormat 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000904PdsSubFormat(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000904PdsSubFormat+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip000904PdsSubFormat with another Field
	 *	@param value
	 */
   public void setIp000904PdsSubFormat(Field source) {
       replace(source,0,source.length(),beginIp000904PdsSubFormat,IP_000904_PDS_SUB_FORMAT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip000904PdsSubFormat 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000904PdsSubFormat(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp000904PdsSubFormat,IP_000904_PDS_SUB_FORMAT_LEN);
   	
   }
   
     /**
	 * 	Update Ip000904PdsSubFormat 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000904PdsSubFormat(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000904PdsSubFormat+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip000904PdsSubStart
	 *	@return ip000904PdsSubStart
	 */
	public short getIp000904PdsSubStart() throws CFException {
        if (isIp000904PdsSubStartModified()) { 
           ip000904PdsSubStart = refreshIp000904PdsSubStart();
        }
   		return ip000904PdsSubStart;
	}
	
	/**
	 * 	Update Ip000904PdsSubStart with the passed value
	 *  Corresponding COBOL Variable is IP000904-PDS-SUB-START
	 *	@param number
	 */
	public void setIp000904PdsSubStart(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000904PdsSubStart = checkIp000904PdsSubStartMaxLimit(number); 
		serializeIp000904PdsSubStart(ip000904PdsSubStart);
	}

	public void setIp000904PdsSubStart(int number) {
	    number = checkIp000904PdsSubStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000904PdsSubStart((short)number);
	}
	public void setIp000904PdsSubStart(long number) {
	    number = checkIp000904PdsSubStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000904PdsSubStart((short)number);
	}
	

	/**
	 *	Returns the value of ip000904PdsSubMinLngth
	 *	@return ip000904PdsSubMinLngth
	 */
	public short getIp000904PdsSubMinLngth() throws CFException {
        if (isIp000904PdsSubMinLngthModified()) { 
           ip000904PdsSubMinLngth = refreshIp000904PdsSubMinLngth();
        }
   		return ip000904PdsSubMinLngth;
	}
	
	/**
	 * 	Update Ip000904PdsSubMinLngth with the passed value
	 *  Corresponding COBOL Variable is IP000904-PDS-SUB-MIN-LNGTH
	 *	@param number
	 */
	public void setIp000904PdsSubMinLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000904PdsSubMinLngth = checkIp000904PdsSubMinLngthMaxLimit(number); 
		serializeIp000904PdsSubMinLngth(ip000904PdsSubMinLngth);
	}

	public void setIp000904PdsSubMinLngth(int number) {
	    number = checkIp000904PdsSubMinLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000904PdsSubMinLngth((short)number);
	}
	public void setIp000904PdsSubMinLngth(long number) {
	    number = checkIp000904PdsSubMinLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000904PdsSubMinLngth((short)number);
	}
	

	/**
	 *	Returns the value of ip000904PdsSubMaxLngth
	 *	@return ip000904PdsSubMaxLngth
	 */
	public short getIp000904PdsSubMaxLngth() throws CFException {
        if (isIp000904PdsSubMaxLngthModified()) { 
           ip000904PdsSubMaxLngth = refreshIp000904PdsSubMaxLngth();
        }
   		return ip000904PdsSubMaxLngth;
	}
	
	/**
	 * 	Update Ip000904PdsSubMaxLngth with the passed value
	 *  Corresponding COBOL Variable is IP000904-PDS-SUB-MAX-LNGTH
	 *	@param number
	 */
	public void setIp000904PdsSubMaxLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000904PdsSubMaxLngth = checkIp000904PdsSubMaxLngthMaxLimit(number); 
		serializeIp000904PdsSubMaxLngth(ip000904PdsSubMaxLngth);
	}

	public void setIp000904PdsSubMaxLngth(int number) {
	    number = checkIp000904PdsSubMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000904PdsSubMaxLngth((short)number);
	}
	public void setIp000904PdsSubMaxLngth(long number) {
	    number = checkIp000904PdsSubMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000904PdsSubMaxLngth((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip000904PdsSubAttrRow
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp000904PdsNo((short)0);
         	setIp000904PdsSubNo((short)0);
         setIp000904PdsSubName(CONSTANTS.SPACE_57);
         setIp000904PdsSubFormat(CONSTANTS.SPACE_3);
         	setIp000904PdsSubStart((short)0);
         	setIp000904PdsSubMinLngth((short)0);
         	setIp000904PdsSubMaxLngth((short)0);
   }

		public static int getIp000904PdsSubAttrRowFieldLength() {
			return IP_000904_PDS_SUB_ATTR_ROW_LENGTH;
		}

}
  
