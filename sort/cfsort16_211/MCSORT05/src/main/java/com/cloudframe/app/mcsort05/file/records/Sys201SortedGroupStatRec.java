package com.cloudframe.app.mcsort05.file.records;

/**
*  The class Sys201SortedGroupStatRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.mcsort05.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys201SortedGroupStatRec extends Sys201SortedGroupStatRecSerialized {
   

						private char[] sys201SortedGroupStatRecString = Field.fillLowValue(2000);
	
	/**
	* Constructor for Sys201SortedGroupStatRec
	**/
    public Sys201SortedGroupStatRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys201SortedGroupStatRecString
	 *	@return sys201SortedGroupStatRecString
	 */
   public char[] getSys201SortedGroupStatRecString() throws CFException{
     if (isSys201SortedGroupStatRecStringModified()) { 
        sys201SortedGroupStatRecString = refreshSys201SortedGroupStatRecString();
     }
   		return sys201SortedGroupStatRecString;
   }

  
	/**
	*  set variable sys201SortedGroupStatRecString
	*  Corresponding COBOL Variable is SYS201-SORTED-GROUP-STAT-REC-STRING
	*  @param value
	**/
   public void setSys201SortedGroupStatRecString(char[] value) {
      sys201SortedGroupStatRecString = checkSys201SortedGroupStatRecStringConstraints(value);
      serializeSys201SortedGroupStatRecString(sys201SortedGroupStatRecString);
   } 

     /**
	 * 	Update Sys201SortedGroupStatRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201SortedGroupStatRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys201SortedGroupStatRecString,sys201SortedGroupStatRecString.length);
   	
   }
   
   public void setSys201SortedGroupStatRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys201SortedGroupStatRecString,sys201SortedGroupStatRecString.length);
   	
   }
   
     /**
	 * 	Update Sys201SortedGroupStatRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201SortedGroupStatRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201SortedGroupStatRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys201SortedGroupStatRecString with another Field
	 *	@param value
	 */
   public void setSys201SortedGroupStatRecString(Field source) {
       replace(source,0,source.length(),beginSys201SortedGroupStatRecString,SYS_201_SORTED_GROUP_STAT_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys201SortedGroupStatRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201SortedGroupStatRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys201SortedGroupStatRecString,SYS_201_SORTED_GROUP_STAT_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys201SortedGroupStatRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201SortedGroupStatRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201SortedGroupStatRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys201SortedGroupStatRecFieldLength() {
			return SYS_201_SORTED_GROUP_STAT_REC_LENGTH;
		}

}
  
