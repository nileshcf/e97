package com.cloudframe.app.iovb32k.file.records;

/**
*  The class OutRecMax is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/


import com.cloudframe.app.iovb32k.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OutRecMax extends OutRecMaxSerialized { 
   

						private char[] outRecMaxString = Field.fillLowValue(32752);
	
	/**
	* Constructor for OutRecMax
	**/
    public OutRecMax() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of outRecMaxString
	 *	@return outRecMaxString
	 */
   public char[] getOutRecMaxString() throws CFException{
     if (isOutRecMaxStringModified()) { 
        outRecMaxString = refreshOutRecMaxString();
     }
   		return outRecMaxString;
   }

  
	/**
	*  set variable outRecMaxString
	*  Corresponding COBOL Variable is OUT-REC-MAX-STRING
	*  @param value
	**/
   public void setOutRecMaxString(char[] value) {
      outRecMaxString = checkOutRecMaxStringConstraints(value);
      serializeOutRecMaxString(outRecMaxString);
   } 

     /**
	 * 	Update OutRecMaxString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOutRecMaxString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOutRecMaxString,outRecMaxString.length);
   	
   }
   
   public void setOutRecMaxString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOutRecMaxString,outRecMaxString.length);
   	
   }
   
     /**
	 * 	Update OutRecMaxString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOutRecMaxString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOutRecMaxString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OutRecMaxString with another Field
	 *	@param value
	 */
   public void setOutRecMaxString(Field source) {
       replace(source,0,source.length(),beginOutRecMaxString,OUT_REC_MAX_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update OutRecMaxString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOutRecMaxString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOutRecMaxString,OUT_REC_MAX_STRING_LEN);
   	
   }
   
     /**
	 * 	Update OutRecMaxString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOutRecMaxString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOutRecMaxString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getOutRecMaxFieldLength() {
			return OUT_REC_MAX_LENGTH;
		}

}
  
