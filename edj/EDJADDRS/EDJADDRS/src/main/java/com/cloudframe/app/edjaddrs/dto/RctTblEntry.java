package com.cloudframe.app.edjaddrs.dto;

/**
*  The class RctTblEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:58. using version 5.0.0.256
**/


import com.cloudframe.app.edjaddrs.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RctTblEntry extends RctTblEntrySerialized { 
   
				private RctHdrOrTrlAkaHotInfo rctHdrOrTrlAkaHotInfo = new RctHdrOrTrlAkaHotInfo();
	
	/**
	* Constructor for RctTblEntry
	**/
    public RctTblEntry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RctTblEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RctTblEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			rctHdrOrTrlAkaHotInfo.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of rctHdrOrTrlAkaHotInfo
	 *	@return rctHdrOrTrlAkaHotInfo
	 */   
	 public RctHdrOrTrlAkaHotInfo getRctHdrOrTrlAkaHotInfo() {
   	return rctHdrOrTrlAkaHotInfo;
   }
   /**
	* 	Update RctHdrOrTrlAkaHotInfo with the passed value
	*   Corresponding COBOL Variable is RCT-HDR-OR-TRL-AKA-HOT-INFO
	*	@param value
	*/
   public void setRctHdrOrTrlAkaHotInfo(char[] value) {
      rctHdrOrTrlAkaHotInfo.setString(value); 
   }   
    
     /**
	 * 	Update RctHdrOrTrlAkaHotInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRctHdrOrTrlAkaHotInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rctHdrOrTrlAkaHotInfo.begin,rctHdrOrTrlAkaHotInfo.length());
   }
   
     /**
	 * 	Update RctHdrOrTrlAkaHotInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRctHdrOrTrlAkaHotInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rctHdrOrTrlAkaHotInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RctHdrOrTrlAkaHotInfo with another Field
	 *	@param value
	 */
   public void setRctHdrOrTrlAkaHotInfo(Field source) {
   	replace(source,0,source.length(),rctHdrOrTrlAkaHotInfo.begin,rctHdrOrTrlAkaHotInfo.length());
   }  
   
     /**
	 * 	Update RctHdrOrTrlAkaHotInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRctHdrOrTrlAkaHotInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rctHdrOrTrlAkaHotInfo.begin,rctHdrOrTrlAkaHotInfo.length());
   }
   
     /**
	 * 	Update RctHdrOrTrlAkaHotInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRctHdrOrTrlAkaHotInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rctHdrOrTrlAkaHotInfo.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getRctTblEntryFieldLength() {
			return RCT_TBL_ENTRY_LENGTH;
		}

}
  
