package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0007o4DeSubAttrRow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:19. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0007o4DeSubAttrRow extends Ip0007o4DeSubAttrRowSerialized { 
   

								private short ip0007o4DeNo;

								private short ip0007o4DeSubNo;

						private char[] ip0007o4DeSubName = Field.fillLowValue(57);

						private char[] ip0007o4DeSubFormat = Field.fillLowValue(3);

								private short ip0007o4DeSubStart;

								private short ip0007o4DeSubMinLngth;

								private short ip0007o4DeSubMaxLngth;
	
	/**
	* Constructor for Ip0007o4DeSubAttrRow
	**/
    public Ip0007o4DeSubAttrRow() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0007o4DeSubAttrRow. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0007o4DeSubAttrRow(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip0007o4DeNo
	 *	@return ip0007o4DeNo
	 */
	public short getIp0007o4DeNo() throws CFException {
        if (isIp0007o4DeNoModified()) { 
           ip0007o4DeNo = refreshIp0007o4DeNo();
        }
   		return ip0007o4DeNo;
	}
	
	/**
	 * 	Update Ip0007o4DeNo with the passed value
	 *  Corresponding COBOL Variable is IP0007O4-DE-NO
	 *	@param number
	 */
	public void setIp0007o4DeNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip0007o4DeNo = checkIp0007o4DeNoMaxLimit(number); 
		serializeIp0007o4DeNo(ip0007o4DeNo);
	}

	public void setIp0007o4DeNo(int number) {
	    number = checkIp0007o4DeNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0007o4DeNo((short)number);
	}
	public void setIp0007o4DeNo(long number) {
	    number = checkIp0007o4DeNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0007o4DeNo((short)number);
	}
	

	/**
	 *	Returns the value of ip0007o4DeSubNo
	 *	@return ip0007o4DeSubNo
	 */
	public short getIp0007o4DeSubNo() throws CFException {
        if (isIp0007o4DeSubNoModified()) { 
           ip0007o4DeSubNo = refreshIp0007o4DeSubNo();
        }
   		return ip0007o4DeSubNo;
	}
	
	/**
	 * 	Update Ip0007o4DeSubNo with the passed value
	 *  Corresponding COBOL Variable is IP0007O4-DE-SUB-NO
	 *	@param number
	 */
	public void setIp0007o4DeSubNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip0007o4DeSubNo = checkIp0007o4DeSubNoMaxLimit(number); 
		serializeIp0007o4DeSubNo(ip0007o4DeSubNo);
	}

	public void setIp0007o4DeSubNo(int number) {
	    number = checkIp0007o4DeSubNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0007o4DeSubNo((short)number);
	}
	public void setIp0007o4DeSubNo(long number) {
	    number = checkIp0007o4DeSubNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0007o4DeSubNo((short)number);
	}
	

	/**
	 *	Returns the value of ip0007o4DeSubName
	 *	@return ip0007o4DeSubName
	 */
   public char[] getIp0007o4DeSubName() throws CFException{
     if (isIp0007o4DeSubNameModified()) { 
        ip0007o4DeSubName = refreshIp0007o4DeSubName();
     }
   		return ip0007o4DeSubName;
   }

  
	/**
	*  set variable ip0007o4DeSubName
	*  Corresponding COBOL Variable is IP0007O4-DE-SUB-NAME
	*  @param value
	**/
   public void setIp0007o4DeSubName(char[] value) {
      ip0007o4DeSubName = checkIp0007o4DeSubNameConstraints(value);
      serializeIp0007o4DeSubName(ip0007o4DeSubName);
   } 

     /**
	 * 	Update Ip0007o4DeSubName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0007o4DeSubName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0007o4DeSubName,ip0007o4DeSubName.length);
   	
   }
   
   public void setIp0007o4DeSubName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0007o4DeSubName,ip0007o4DeSubName.length);
   	
   }
   
     /**
	 * 	Update Ip0007o4DeSubName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0007o4DeSubName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0007o4DeSubName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0007o4DeSubName with another Field
	 *	@param value
	 */
   public void setIp0007o4DeSubName(Field source) {
       replace(source,0,source.length(),beginIp0007o4DeSubName,IP_0007O_4_DE_SUB_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0007o4DeSubName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0007o4DeSubName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0007o4DeSubName,IP_0007O_4_DE_SUB_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip0007o4DeSubName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0007o4DeSubName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0007o4DeSubName+targetIndex,targetLen);
    
   }
	char[] ip0007o4UndefinedDeSubfld88Value = fillHighValue(57);
	/**
	 *	Test condition new byte[] {(byte)0xFF} for isIp0007o4UndefinedDeSubfld()
	 *	@return  Returns true if isIp0007o4UndefinedDeSubfld() is new byte[] {(byte)0xFF}
	 */
   public boolean isIp0007o4UndefinedDeSubfld() throws CFException {
      return (  compareChars( getIp0007o4DeSubName() , ip0007o4UndefinedDeSubfld88Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setIp0007o4UndefinedDeSubfldTrue() {  			
    	setIp0007o4DeSubName( ip0007o4UndefinedDeSubfld88Value);
   	}
	/**
	 *	Returns the value of ip0007o4DeSubFormat
	 *	@return ip0007o4DeSubFormat
	 */
   public char[] getIp0007o4DeSubFormat() throws CFException{
     if (isIp0007o4DeSubFormatModified()) { 
        ip0007o4DeSubFormat = refreshIp0007o4DeSubFormat();
     }
   		return ip0007o4DeSubFormat;
   }

  
	/**
	*  set variable ip0007o4DeSubFormat
	*  Corresponding COBOL Variable is IP0007O4-DE-SUB-FORMAT
	*  @param value
	**/
   public void setIp0007o4DeSubFormat(char[] value) {
      ip0007o4DeSubFormat = checkIp0007o4DeSubFormatConstraints(value);
      serializeIp0007o4DeSubFormat(ip0007o4DeSubFormat);
   } 

     /**
	 * 	Update Ip0007o4DeSubFormat 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0007o4DeSubFormat(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0007o4DeSubFormat,ip0007o4DeSubFormat.length);
   	
   }
   
   public void setIp0007o4DeSubFormat(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0007o4DeSubFormat,ip0007o4DeSubFormat.length);
   	
   }
   
     /**
	 * 	Update Ip0007o4DeSubFormat 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0007o4DeSubFormat(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0007o4DeSubFormat+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0007o4DeSubFormat with another Field
	 *	@param value
	 */
   public void setIp0007o4DeSubFormat(Field source) {
       replace(source,0,source.length(),beginIp0007o4DeSubFormat,IP_0007O_4_DE_SUB_FORMAT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0007o4DeSubFormat 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0007o4DeSubFormat(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0007o4DeSubFormat,IP_0007O_4_DE_SUB_FORMAT_LEN);
   	
   }
   
     /**
	 * 	Update Ip0007o4DeSubFormat 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0007o4DeSubFormat(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0007o4DeSubFormat+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0007o4DeSubStart
	 *	@return ip0007o4DeSubStart
	 */
	public short getIp0007o4DeSubStart() throws CFException {
        if (isIp0007o4DeSubStartModified()) { 
           ip0007o4DeSubStart = refreshIp0007o4DeSubStart();
        }
   		return ip0007o4DeSubStart;
	}
	
	/**
	 * 	Update Ip0007o4DeSubStart with the passed value
	 *  Corresponding COBOL Variable is IP0007O4-DE-SUB-START
	 *	@param number
	 */
	public void setIp0007o4DeSubStart(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip0007o4DeSubStart = checkIp0007o4DeSubStartMaxLimit(number); 
		serializeIp0007o4DeSubStart(ip0007o4DeSubStart);
	}

	public void setIp0007o4DeSubStart(int number) {
	    number = checkIp0007o4DeSubStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0007o4DeSubStart((short)number);
	}
	public void setIp0007o4DeSubStart(long number) {
	    number = checkIp0007o4DeSubStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0007o4DeSubStart((short)number);
	}
	

	/**
	 *	Returns the value of ip0007o4DeSubMinLngth
	 *	@return ip0007o4DeSubMinLngth
	 */
	public short getIp0007o4DeSubMinLngth() throws CFException {
        if (isIp0007o4DeSubMinLngthModified()) { 
           ip0007o4DeSubMinLngth = refreshIp0007o4DeSubMinLngth();
        }
   		return ip0007o4DeSubMinLngth;
	}
	
	/**
	 * 	Update Ip0007o4DeSubMinLngth with the passed value
	 *  Corresponding COBOL Variable is IP0007O4-DE-SUB-MIN-LNGTH
	 *	@param number
	 */
	public void setIp0007o4DeSubMinLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip0007o4DeSubMinLngth = checkIp0007o4DeSubMinLngthMaxLimit(number); 
		serializeIp0007o4DeSubMinLngth(ip0007o4DeSubMinLngth);
	}

	public void setIp0007o4DeSubMinLngth(int number) {
	    number = checkIp0007o4DeSubMinLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0007o4DeSubMinLngth((short)number);
	}
	public void setIp0007o4DeSubMinLngth(long number) {
	    number = checkIp0007o4DeSubMinLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0007o4DeSubMinLngth((short)number);
	}
	

	/**
	 *	Returns the value of ip0007o4DeSubMaxLngth
	 *	@return ip0007o4DeSubMaxLngth
	 */
	public short getIp0007o4DeSubMaxLngth() throws CFException {
        if (isIp0007o4DeSubMaxLngthModified()) { 
           ip0007o4DeSubMaxLngth = refreshIp0007o4DeSubMaxLngth();
        }
   		return ip0007o4DeSubMaxLngth;
	}
	
	/**
	 * 	Update Ip0007o4DeSubMaxLngth with the passed value
	 *  Corresponding COBOL Variable is IP0007O4-DE-SUB-MAX-LNGTH
	 *	@param number
	 */
	public void setIp0007o4DeSubMaxLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip0007o4DeSubMaxLngth = checkIp0007o4DeSubMaxLngthMaxLimit(number); 
		serializeIp0007o4DeSubMaxLngth(ip0007o4DeSubMaxLngth);
	}

	public void setIp0007o4DeSubMaxLngth(int number) {
	    number = checkIp0007o4DeSubMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0007o4DeSubMaxLngth((short)number);
	}
	public void setIp0007o4DeSubMaxLngth(long number) {
	    number = checkIp0007o4DeSubMaxLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp0007o4DeSubMaxLngth((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip0007o4DeSubAttrRow
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp0007o4DeNo((short)0);
         	setIp0007o4DeSubNo((short)0);
         setIp0007o4DeSubName(CONSTANTS.SPACE_57);
         setIp0007o4DeSubFormat(CONSTANTS.SPACE_3);
         	setIp0007o4DeSubStart((short)0);
         	setIp0007o4DeSubMinLngth((short)0);
         	setIp0007o4DeSubMaxLngth((short)0);
   }

		public static int getIp0007o4DeSubAttrRowFieldLength() {
			return IP_0007O_4_DE_SUB_ATTR_ROW_LENGTH;
		}

}
  
