package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000704DeSubAttrRow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip000704DeSubAttrRow extends Ip000704DeSubAttrRowSerialized { 
   

								private short ip000704DeNo;

								private short ip000704DeSubNo;

						private char[] ip000704DeSubName = Field.fillLowValue(57);

						private char[] ip000704DeSubFormat = Field.fillLowValue(3);

								private short ip000704DeSubStart;

								private short ip000704DeSubMinLngth;

								private short ip000704DeSubMaxLngth;
	
	/**
	* Constructor for Ip000704DeSubAttrRow
	**/
    public Ip000704DeSubAttrRow() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip000704DeSubAttrRow. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip000704DeSubAttrRow(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip000704DeNo
	 *	@return ip000704DeNo
	 */
	public short getIp000704DeNo() throws CFException {
        if (isIp000704DeNoModified()) { 
           ip000704DeNo = refreshIp000704DeNo();
        }
   		return ip000704DeNo;
	}
	
	/**
	 * 	Update Ip000704DeNo with the passed value
	 *  Corresponding COBOL Variable is IP000704-DE-NO
	 *	@param number
	 */
	public void setIp000704DeNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000704DeNo = checkIp000704DeNoMaxLimit(number); 
		serializeIp000704DeNo(ip000704DeNo);
	}

	public void setIp000704DeNo(int number) {
	    number = checkIp000704DeNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000704DeNo((short)number);
	}
	public void setIp000704DeNo(long number) {
	    number = checkIp000704DeNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000704DeNo((short)number);
	}
	

	/**
	 *	Returns the value of ip000704DeSubNo
	 *	@return ip000704DeSubNo
	 */
	public short getIp000704DeSubNo() throws CFException {
        if (isIp000704DeSubNoModified()) { 
           ip000704DeSubNo = refreshIp000704DeSubNo();
        }
   		return ip000704DeSubNo;
	}
	
	/**
	 * 	Update Ip000704DeSubNo with the passed value
	 *  Corresponding COBOL Variable is IP000704-DE-SUB-NO
	 *	@param number
	 */
	public void setIp000704DeSubNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000704DeSubNo = checkIp000704DeSubNoMaxLimit(number); 
		serializeIp000704DeSubNo(ip000704DeSubNo);
	}

	public void setIp000704DeSubNo(int number) {
	    number = checkIp000704DeSubNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000704DeSubNo((short)number);
	}
	public void setIp000704DeSubNo(long number) {
	    number = checkIp000704DeSubNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000704DeSubNo((short)number);
	}
	

	/**
	 *	Returns the value of ip000704DeSubName
	 *	@return ip000704DeSubName
	 */
   public char[] getIp000704DeSubName() throws CFException{
     if (isIp000704DeSubNameModified()) { 
        ip000704DeSubName = refreshIp000704DeSubName();
     }
   		return ip000704DeSubName;
   }

  
	/**
	*  set variable ip000704DeSubName
	*  Corresponding COBOL Variable is IP000704-DE-SUB-NAME
	*  @param value
	**/
   public void setIp000704DeSubName(char[] value) {
      ip000704DeSubName = checkIp000704DeSubNameConstraints(value);
      serializeIp000704DeSubName(ip000704DeSubName);
   } 

     /**
	 * 	Update Ip000704DeSubName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000704DeSubName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp000704DeSubName,ip000704DeSubName.length);
   	
   }
   
   public void setIp000704DeSubName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp000704DeSubName,ip000704DeSubName.length);
   	
   }
   
     /**
	 * 	Update Ip000704DeSubName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000704DeSubName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000704DeSubName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip000704DeSubName with another Field
	 *	@param value
	 */
   public void setIp000704DeSubName(Field source) {
       replace(source,0,source.length(),beginIp000704DeSubName,IP_000704_DE_SUB_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip000704DeSubName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000704DeSubName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp000704DeSubName,IP_000704_DE_SUB_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip000704DeSubName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000704DeSubName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000704DeSubName+targetIndex,targetLen);
    
   }
	char[] ip000704UndefinedDeSubfld88Value = fillHighValue(57);
	/**
	 *	Test condition new byte[] {(byte)0xFF} for isIp000704UndefinedDeSubfld()
	 *	@return  Returns true if isIp000704UndefinedDeSubfld() is new byte[] {(byte)0xFF}
	 */
   public boolean isIp000704UndefinedDeSubfld() throws CFException {
      return (  compareChars( getIp000704DeSubName() , ip000704UndefinedDeSubfld88Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setIp000704UndefinedDeSubfldTrue() {  			
    	setIp000704DeSubName( ip000704UndefinedDeSubfld88Value);
   	}
	/**
	 *	Returns the value of ip000704DeSubFormat
	 *	@return ip000704DeSubFormat
	 */
   public char[] getIp000704DeSubFormat() throws CFException{
     if (isIp000704DeSubFormatModified()) { 
        ip000704DeSubFormat = refreshIp000704DeSubFormat();
     }
   		return ip000704DeSubFormat;
   }

  
	/**
	*  set variable ip000704DeSubFormat
	*  Corresponding COBOL Variable is IP000704-DE-SUB-FORMAT
	*  @param value
	**/
   public void setIp000704DeSubFormat(char[] value) {
      ip000704DeSubFormat = checkIp000704DeSubFormatConstraints(value);
      serializeIp000704DeSubFormat(ip000704DeSubFormat);
   } 

     /**
	 * 	Update Ip000704DeSubFormat 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000704DeSubFormat(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp000704DeSubFormat,ip000704DeSubFormat.length);
   	
   }
   
   public void setIp000704DeSubFormat(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp000704DeSubFormat,ip000704DeSubFormat.length);
   	
   }
   
     /**
	 * 	Update Ip000704DeSubFormat 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000704DeSubFormat(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000704DeSubFormat+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip000704DeSubFormat with another Field
	 *	@param value
	 */
   public void setIp000704DeSubFormat(Field source) {
       replace(source,0,source.length(),beginIp000704DeSubFormat,IP_000704_DE_SUB_FORMAT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip000704DeSubFormat 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000704DeSubFormat(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp000704DeSubFormat,IP_000704_DE_SUB_FORMAT_LEN);
   	
   }
   
     /**
	 * 	Update Ip000704DeSubFormat 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000704DeSubFormat(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000704DeSubFormat+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip000704DeSubStart
	 *	@return ip000704DeSubStart
	 */
	public short getIp000704DeSubStart() throws CFException {
        if (isIp000704DeSubStartModified()) { 
           ip000704DeSubStart = refreshIp000704DeSubStart();
        }
   		return ip000704DeSubStart;
	}
	
	/**
	 * 	Update Ip000704DeSubStart with the passed value
	 *  Corresponding COBOL Variable is IP000704-DE-SUB-START
	 *	@param number
	 */
	public void setIp000704DeSubStart(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000704DeSubStart = checkIp000704DeSubStartMaxLimit(number); 
		serializeIp000704DeSubStart(ip000704DeSubStart);
	}

	public void setIp000704DeSubStart(int number) {
	    number = checkIp000704DeSubStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000704DeSubStart((short)number);
	}
	public void setIp000704DeSubStart(long number) {
	    number = checkIp000704DeSubStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000704DeSubStart((short)number);
	}
	

	/**
	 *	Returns the value of ip000704DeSubMinLngth
	 *	@return ip000704DeSubMinLngth
	 */
	public short getIp000704DeSubMinLngth() throws CFException {
        if (isIp000704DeSubMinLngthModified()) { 
           ip000704DeSubMinLngth = refreshIp000704DeSubMinLngth();
        }
   		return ip000704DeSubMinLngth;
	}
	
	/**
	 * 	Update Ip000704DeSubMinLngth with the passed value
	 *  Corresponding COBOL Variable is IP000704-DE-SUB-MIN-LNGTH
	 *	@param number
	 */
	public void setIp000704DeSubMinLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000704DeSubMinLngth = checkIp000704DeSubMinLngthMaxLimit(number); 
		serializeIp000704DeSubMinLngth(ip000704DeSubMinLngth);
	}

	public void setIp000704DeSubMinLngth(int number) {
	    number = checkIp000704DeSubMinLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000704DeSubMinLngth((short)number);
	}
	public void setIp000704DeSubMinLngth(long number) {
	    number = checkIp000704DeSubMinLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000704DeSubMinLngth((short)number);
	}
	

	/**
	 *	Returns the value of ip000704DeSubMaxLngth
	 *	@return ip000704DeSubMaxLngth
	 */
	public short getIp000704DeSubMaxLngth() throws CFException {
        if (isIp000704DeSubMaxLngthModified()) { 
           ip000704DeSubMaxLngth = refreshIp000704DeSubMaxLngth();
        }
   		return ip000704DeSubMaxLngth;
	}
	
	/**
	 * 	Update Ip000704DeSubMaxLngth with the passed value
	 *  Corresponding COBOL Variable is IP000704-DE-SUB-MAX-LNGTH
	 *	@param number
	 */
	public void setIp000704DeSubMaxLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000704DeSubMaxLngth = checkIp000704DeSubMaxLngthMaxLimit(number); 
		serializeIp000704DeSubMaxLngth(ip000704DeSubMaxLngth);
	}

	public void setIp000704DeSubMaxLngth(int number) {
	    number = checkIp000704DeSubMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000704DeSubMaxLngth((short)number);
	}
	public void setIp000704DeSubMaxLngth(long number) {
	    number = checkIp000704DeSubMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000704DeSubMaxLngth((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip000704DeSubAttrRow
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp000704DeNo((short)0);
         	setIp000704DeSubNo((short)0);
         setIp000704DeSubName(CONSTANTS.SPACE_57);
         setIp000704DeSubFormat(CONSTANTS.SPACE_3);
         	setIp000704DeSubStart((short)0);
         	setIp000704DeSubMinLngth((short)0);
         	setIp000704DeSubMaxLngth((short)0);
   }

		public static int getIp000704DeSubAttrRowFieldLength() {
			return IP_000704_DE_SUB_ATTR_ROW_LENGTH;
		}

}
  
