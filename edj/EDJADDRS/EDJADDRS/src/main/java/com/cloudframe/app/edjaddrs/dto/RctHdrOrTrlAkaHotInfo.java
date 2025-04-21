package com.cloudframe.app.edjaddrs.dto;

/**
*  The class RctHdrOrTrlAkaHotInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.edjaddrs.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RctHdrOrTrlAkaHotInfo extends RctHdrOrTrlAkaHotInfoSerialized { 
   
				private RctMinComp3Group rctMinComp3Group = new RctMinComp3Group();
	
	/**
	* Constructor for RctHdrOrTrlAkaHotInfo
	**/
    public RctHdrOrTrlAkaHotInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RctHdrOrTrlAkaHotInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RctHdrOrTrlAkaHotInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			rctMinComp3Group.setParent(this,getStartOffset() + 208);
    } 

	/**
	 *	Returns the value of rctMinComp3Group
	 *	@return rctMinComp3Group
	 */   
	 public RctMinComp3Group getRctMinComp3Group() {
   	return rctMinComp3Group;
   }
   /**
	* 	Update RctMinComp3Group with the passed value
	*   Corresponding COBOL Variable is RCT-MIN-COMP-3-GROUP
	*	@param value
	*/
   public void setRctMinComp3Group(char[] value) {
      rctMinComp3Group.setString(value); 
   }   
    
     /**
	 * 	Update RctMinComp3Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRctMinComp3Group(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rctMinComp3Group.begin,rctMinComp3Group.length());
   }
   
     /**
	 * 	Update RctMinComp3Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRctMinComp3Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rctMinComp3Group.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RctMinComp3Group with another Field
	 *	@param value
	 */
   public void setRctMinComp3Group(Field source) {
   	replace(source,0,source.length(),rctMinComp3Group.begin,rctMinComp3Group.length());
   }  
   
     /**
	 * 	Update RctMinComp3Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRctMinComp3Group(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rctMinComp3Group.begin,rctMinComp3Group.length());
   }
   
     /**
	 * 	Update RctMinComp3Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRctMinComp3Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rctMinComp3Group.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getRctHdrOrTrlAkaHotInfoFieldLength() {
			return RCT_HDR_OR_TRL_AKA_HOT_INFO_LENGTH;
		}

}
  
