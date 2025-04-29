package com.cloudframe.app.ip313010.dto;

/**
*  The class Ip002103TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ip313010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip002103TableData extends Ip002103TableDataSerialized {
   

								private int ip002103OldElementType;

								private int ip002103OldElementNo;

								private int ip002103OldSubfldNo;

								private int ip002103NewElementType;

								private int ip002103NewElementNo;

								private int ip002103NewSubfldNo;

						private char[] ip002103Justified = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip002103TableData
	**/
    public Ip002103TableData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip002103OldElementType
	 *	@return ip002103OldElementType
	 */
	public int getIp002103OldElementType() throws CFException {
       if (isIp002103OldElementTypeModified()) { 
           ip002103OldElementType = refreshIp002103OldElementType();
        }
   		return ip002103OldElementType;
	}
	

	
	   
	/**
	 * 	Update Ip002103OldElementType with the passed value
	 *  Corresponding COBOL Variable is IP002103-OLD-ELEMENT-TYPE
	 *	@param number
	 */
	public void setIp002103OldElementType(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip002103OldElementType = checkIp002103OldElementTypeMaxLimit(number); 
		serializeIp002103OldElementType(ip002103OldElementType);
	}
	

	public void setIp002103OldElementType(long number) {
	    number = checkIp002103OldElementTypeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp002103OldElementType((int)number);
	}
	
	/**
	 * 	Update Ip002103OldElementType with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp002103OldElementType(char[] value) throws CFException {
		 ip002103OldElementType = serializeIp002103OldElementType(value);
	}
	/**
	 * 	Update Ip002103OldElementType with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp002103OldElementTypeString(char[] value) throws CFException {
		 setIp002103OldElementType(value);
	}
	/**
	 *	Returns the value of ip002103OldElementNo
	 *	@return ip002103OldElementNo
	 */
	public int getIp002103OldElementNo() throws CFException {
       if (isIp002103OldElementNoModified()) { 
           ip002103OldElementNo = refreshIp002103OldElementNo();
        }
   		return ip002103OldElementNo;
	}
	

	
	   
	/**
	 * 	Update Ip002103OldElementNo with the passed value
	 *  Corresponding COBOL Variable is IP002103-OLD-ELEMENT-NO
	 *	@param number
	 */
	public void setIp002103OldElementNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip002103OldElementNo = checkIp002103OldElementNoMaxLimit(number); 
		serializeIp002103OldElementNo(ip002103OldElementNo);
	}
	

	public void setIp002103OldElementNo(long number) {
	    number = checkIp002103OldElementNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp002103OldElementNo((int)number);
	}
	
	/**
	 * 	Update Ip002103OldElementNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp002103OldElementNo(char[] value) throws CFException {
		 ip002103OldElementNo = serializeIp002103OldElementNo(value);
	}
	/**
	 * 	Update Ip002103OldElementNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp002103OldElementNoString(char[] value) throws CFException {
		 setIp002103OldElementNo(value);
	}
	/**
	 *	Returns the value of ip002103OldSubfldNo
	 *	@return ip002103OldSubfldNo
	 */
	public int getIp002103OldSubfldNo() throws CFException {
       if (isIp002103OldSubfldNoModified()) { 
           ip002103OldSubfldNo = refreshIp002103OldSubfldNo();
        }
   		return ip002103OldSubfldNo;
	}
	

	
	   
	/**
	 * 	Update Ip002103OldSubfldNo with the passed value
	 *  Corresponding COBOL Variable is IP002103-OLD-SUBFLD-NO
	 *	@param number
	 */
	public void setIp002103OldSubfldNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip002103OldSubfldNo = checkIp002103OldSubfldNoMaxLimit(number); 
		serializeIp002103OldSubfldNo(ip002103OldSubfldNo);
	}
	

	public void setIp002103OldSubfldNo(long number) {
	    number = checkIp002103OldSubfldNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp002103OldSubfldNo((int)number);
	}
	
	/**
	 * 	Update Ip002103OldSubfldNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp002103OldSubfldNo(char[] value) throws CFException {
		 ip002103OldSubfldNo = serializeIp002103OldSubfldNo(value);
	}
	/**
	 * 	Update Ip002103OldSubfldNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp002103OldSubfldNoString(char[] value) throws CFException {
		 setIp002103OldSubfldNo(value);
	}
	/**
	 *	Returns the value of ip002103NewElementType
	 *	@return ip002103NewElementType
	 */
	public int getIp002103NewElementType() throws CFException {
       if (isIp002103NewElementTypeModified()) { 
           ip002103NewElementType = refreshIp002103NewElementType();
        }
   		return ip002103NewElementType;
	}
	

	
	   
	/**
	 * 	Update Ip002103NewElementType with the passed value
	 *  Corresponding COBOL Variable is IP002103-NEW-ELEMENT-TYPE
	 *	@param number
	 */
	public void setIp002103NewElementType(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip002103NewElementType = checkIp002103NewElementTypeMaxLimit(number); 
		serializeIp002103NewElementType(ip002103NewElementType);
	}
	

	public void setIp002103NewElementType(long number) {
	    number = checkIp002103NewElementTypeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp002103NewElementType((int)number);
	}
	
	/**
	 * 	Update Ip002103NewElementType with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp002103NewElementType(char[] value) throws CFException {
		 ip002103NewElementType = serializeIp002103NewElementType(value);
	}
	/**
	 * 	Update Ip002103NewElementType with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp002103NewElementTypeString(char[] value) throws CFException {
		 setIp002103NewElementType(value);
	}
	/**
	 *	Returns the value of ip002103NewElementNo
	 *	@return ip002103NewElementNo
	 */
	public int getIp002103NewElementNo() throws CFException {
       if (isIp002103NewElementNoModified()) { 
           ip002103NewElementNo = refreshIp002103NewElementNo();
        }
   		return ip002103NewElementNo;
	}
	

	
	   
	/**
	 * 	Update Ip002103NewElementNo with the passed value
	 *  Corresponding COBOL Variable is IP002103-NEW-ELEMENT-NO
	 *	@param number
	 */
	public void setIp002103NewElementNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip002103NewElementNo = checkIp002103NewElementNoMaxLimit(number); 
		serializeIp002103NewElementNo(ip002103NewElementNo);
	}
	

	public void setIp002103NewElementNo(long number) {
	    number = checkIp002103NewElementNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp002103NewElementNo((int)number);
	}
	
	/**
	 * 	Update Ip002103NewElementNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp002103NewElementNo(char[] value) throws CFException {
		 ip002103NewElementNo = serializeIp002103NewElementNo(value);
	}
	/**
	 * 	Update Ip002103NewElementNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp002103NewElementNoString(char[] value) throws CFException {
		 setIp002103NewElementNo(value);
	}
	/**
	 *	Returns the value of ip002103NewSubfldNo
	 *	@return ip002103NewSubfldNo
	 */
	public int getIp002103NewSubfldNo() throws CFException {
       if (isIp002103NewSubfldNoModified()) { 
           ip002103NewSubfldNo = refreshIp002103NewSubfldNo();
        }
   		return ip002103NewSubfldNo;
	}
	

	
	   
	/**
	 * 	Update Ip002103NewSubfldNo with the passed value
	 *  Corresponding COBOL Variable is IP002103-NEW-SUBFLD-NO
	 *	@param number
	 */
	public void setIp002103NewSubfldNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip002103NewSubfldNo = checkIp002103NewSubfldNoMaxLimit(number); 
		serializeIp002103NewSubfldNo(ip002103NewSubfldNo);
	}
	

	public void setIp002103NewSubfldNo(long number) {
	    number = checkIp002103NewSubfldNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp002103NewSubfldNo((int)number);
	}
	
	/**
	 * 	Update Ip002103NewSubfldNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp002103NewSubfldNo(char[] value) throws CFException {
		 ip002103NewSubfldNo = serializeIp002103NewSubfldNo(value);
	}
	/**
	 * 	Update Ip002103NewSubfldNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp002103NewSubfldNoString(char[] value) throws CFException {
		 setIp002103NewSubfldNo(value);
	}
	/**
	 *	Returns the value of ip002103Justified
	 *	@return ip002103Justified
	 */
   public char[] getIp002103Justified() throws CFException{
     if (isIp002103JustifiedModified()) { 
        ip002103Justified = refreshIp002103Justified();
     }
   		return ip002103Justified;
   }

  
	/**
	*  set variable ip002103Justified
	*  Corresponding COBOL Variable is IP002103-JUSTIFIED
	*  @param value
	**/
   public void setIp002103Justified(char[] value) {
      ip002103Justified = checkIp002103JustifiedConstraints(value);
      serializeIp002103Justified(ip002103Justified);
   } 

     /**
	 * 	Update Ip002103Justified 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp002103Justified(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp002103Justified,ip002103Justified.length);
   	
   }
   
   public void setIp002103Justified(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp002103Justified,ip002103Justified.length);
   	
   }
   
     /**
	 * 	Update Ip002103Justified 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp002103Justified(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp002103Justified+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip002103Justified with another Field
	 *	@param value
	 */
   public void setIp002103Justified(Field source) {
       replace(source,0,source.length(),beginIp002103Justified,IP_002103_JUSTIFIED_LEN);
   	
   }  
   
     /**
	 * 	Update Ip002103Justified 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp002103Justified(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp002103Justified,IP_002103_JUSTIFIED_LEN);
   	
   }
   
     /**
	 * 	Update Ip002103Justified 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp002103Justified(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp002103Justified+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp002103TableDataFieldLength() {
			return IP_002103_TABLE_DATA_LENGTH;
		}

}
  
