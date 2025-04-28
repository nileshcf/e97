package com.cloudframe.app.mcindex.dto;

/**
*  The class Ip3oo8o1EditsPerfTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/


import com.cloudframe.app.mcindex.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip3oo8o1EditsPerfTbl extends Ip3oo8o1EditsPerfTblSerialized {
   

						private char[] ip3oo8o1EditsHolder = Field.fillLowValue(4000);

						private char[] ip3oo8o1EditsPerfEntry = Field.fillLowValue(4000);
	
	/**
	* Constructor for Ip3oo8o1EditsPerfTbl
	**/
    public Ip3oo8o1EditsPerfTbl() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip3oo8o1EditsHolder
	 *	@return ip3oo8o1EditsHolder
	 */
   public char[] getIp3oo8o1EditsHolder() throws CFException{
     if (isIp3oo8o1EditsHolderModified()) { 
        ip3oo8o1EditsHolder = refreshIp3oo8o1EditsHolder();
     }
   		return ip3oo8o1EditsHolder;
   }

  
	/**
	*  set variable ip3oo8o1EditsHolder
	*  Corresponding COBOL Variable is IP3OO8O1-EDITS-HOLDER
	*  @param value
	**/
   public void setIp3oo8o1EditsHolder(char[] value) {
      ip3oo8o1EditsHolder = checkIp3oo8o1EditsHolderConstraints(value);
      serializeIp3oo8o1EditsHolder(ip3oo8o1EditsHolder);
   } 

     /**
	 * 	Update Ip3oo8o1EditsHolder 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp3oo8o1EditsHolder(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp3oo8o1EditsHolder,ip3oo8o1EditsHolder.length);
   	
   }
   
   public void setIp3oo8o1EditsHolder(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp3oo8o1EditsHolder,ip3oo8o1EditsHolder.length);
   	
   }
   
     /**
	 * 	Update Ip3oo8o1EditsHolder 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp3oo8o1EditsHolder(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp3oo8o1EditsHolder+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip3oo8o1EditsHolder with another Field
	 *	@param value
	 */
   public void setIp3oo8o1EditsHolder(Field source) {
       replace(source,0,source.length(),beginIp3oo8o1EditsHolder,IP_3OO_8O_1_EDITS_HOLDER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip3oo8o1EditsHolder 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp3oo8o1EditsHolder(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp3oo8o1EditsHolder,IP_3OO_8O_1_EDITS_HOLDER_LEN);
   	
   }
   
     /**
	 * 	Update Ip3oo8o1EditsHolder 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp3oo8o1EditsHolder(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp3oo8o1EditsHolder+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip3oo8o1EditsPerfEntry
	 *	@return ip3oo8o1EditsPerfEntry
	 */
   public char[] getIp3oo8o1EditsPerfEntry() throws CFException{
     if (isIp3oo8o1EditsPerfEntryModified()) { 
        ip3oo8o1EditsPerfEntry = refreshIp3oo8o1EditsPerfEntry();
     }
   		return ip3oo8o1EditsPerfEntry;
   }

  
	/**
	*  set variable ip3oo8o1EditsPerfEntry
	*  Corresponding COBOL Variable is IP3OO8O1-EDITS-PERF-ENTRY
	*  @param value
	**/
   public void setIp3oo8o1EditsPerfEntry(char[] value) {
      ip3oo8o1EditsPerfEntry = checkIp3oo8o1EditsPerfEntryConstraints(value);
      serializeIp3oo8o1EditsPerfEntry(ip3oo8o1EditsPerfEntry);
   } 

     /**
	 * 	Update Ip3oo8o1EditsPerfEntry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp3oo8o1EditsPerfEntry(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp3oo8o1EditsPerfEntry,ip3oo8o1EditsPerfEntry.length);
   	
   }
   
   public void setIp3oo8o1EditsPerfEntry(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp3oo8o1EditsPerfEntry,ip3oo8o1EditsPerfEntry.length);
   	
   }
   
     /**
	 * 	Update Ip3oo8o1EditsPerfEntry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp3oo8o1EditsPerfEntry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp3oo8o1EditsPerfEntry+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip3oo8o1EditsPerfEntry with another Field
	 *	@param value
	 */
   public void setIp3oo8o1EditsPerfEntry(Field source) {
       replace(source,0,source.length(),beginIp3oo8o1EditsPerfEntry,IP_3OO_8O_1_EDITS_PERF_ENTRY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip3oo8o1EditsPerfEntry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp3oo8o1EditsPerfEntry(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp3oo8o1EditsPerfEntry,IP_3OO_8O_1_EDITS_PERF_ENTRY_LEN);
   	
   }
   
     /**
	 * 	Update Ip3oo8o1EditsPerfEntry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp3oo8o1EditsPerfEntry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp3oo8o1EditsPerfEntry+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp3oo8o1EditsPerfTblFieldLength() {
			return IP_3OO_8O_1_EDITS_PERF_TBL_LENGTH;
		}

}
  
