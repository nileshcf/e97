package com.cloudframe.app.ip989010.dto;

/**
*  The class ErrorMsg6003006 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorMsg6003006 extends ErrorMsg6003006Serialized {
   


						private char[] fileDd6003006 = new char[6];


								private long recNum6003006;
	
	/**
	* Constructor for ErrorMsg6003006
	**/
    public ErrorMsg6003006() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("INVALID FIELD READ IN ").toCharArray()
             , getStartOffset() + 0
             ,22
             );
								setFileDd6003006(fillSpace(6));
       replaceValue( // serialize and save the value
             (" RECORD # ").toCharArray()
             , getStartOffset() + 28
             ,10
             );
								setRecNum6003006(0L);
    }


 

	/**
	 *	Returns the value of fileDd6003006
	 *	@return fileDd6003006
	 */
   public char[] getFileDd6003006() throws CFException{
     if (isFileDd6003006Modified()) { 
        fileDd6003006 = refreshFileDd6003006();
     }
   		return fileDd6003006;
   }

  
	/**
	*  set variable fileDd6003006
	*  Corresponding COBOL Variable is 600-3006-FILE-DD
	*  @param value
	**/
   public void setFileDd6003006(char[] value) {
      fileDd6003006 = checkFileDd6003006Constraints(value);
      serializeFileDd6003006(fileDd6003006);
   } 

     /**
	 * 	Update FileDd6003006 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileDd6003006(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileDd6003006,fileDd6003006.length);
   	
   }
   
   public void setFileDd6003006(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003006,fileDd6003006.length);
   	
   }
   
     /**
	 * 	Update FileDd6003006 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003006(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003006+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileDd6003006 with another Field
	 *	@param value
	 */
   public void setFileDd6003006(Field source) {
       replace(source,0,source.length(),beginFileDd6003006,FILE_DD_6003006_LEN);
   	
   }  
   
     /**
	 * 	Update FileDd6003006 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileDd6003006(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileDd6003006,FILE_DD_6003006_LEN);
   	
   }
   
     /**
	 * 	Update FileDd6003006 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003006(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003006+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of recNum6003006
	 *	@return recNum6003006
	 */
	public long getRecNum6003006() throws CFException {
       if (isRecNum6003006Modified()) { 
           recNum6003006 = refreshRecNum6003006();
        }
   		return recNum6003006;
	}
	

	
	   
	/**
	 * 	Update RecNum6003006 with the passed value
	 *  Corresponding COBOL Variable is 600-3006-REC-NUM
	 *	@param number
	 */
	public void setRecNum6003006(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    recNum6003006 = checkRecNum6003006MaxLimit(number); 
		serializeRecNum6003006(recNum6003006);
	}
	

	/**
	 * 	Update RecNum6003006 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRecNum6003006(char[] value) throws CFException {
		 recNum6003006 = serializeRecNum6003006(value);
	}
	/**
	 * 	Update RecNum6003006 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRecNum6003006String(char[] value) throws CFException {
		 setRecNum6003006(value);
	}

	
	
	

		public static int getErrorMsg6003006FieldLength() {
			return ERROR_MSG_6003006_LENGTH;
		}

}
  
