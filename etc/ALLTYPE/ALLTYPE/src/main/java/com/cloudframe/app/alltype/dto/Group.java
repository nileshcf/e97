package com.cloudframe.app.alltype.dto;

/**
*  The class Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:03. using version 5.0.0.256
**/


import com.cloudframe.app.alltype.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Group extends GroupSerialized {
   
				private GroupWithoutValue groupWithoutValue = new GroupWithoutValue();
				private AGroupWithArray aGroupWithArray = new AGroupWithArray();
				private GroupWithValue groupWithValue = new GroupWithValue();
				private GroupWith88 groupWith88 = new GroupWith88();
	
	/**
	* Constructor for Group
	**/
    public Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			groupWithoutValue.setParent(this,getStartOffset() + 0);
	       			aGroupWithArray.setParent(this,getStartOffset() + 209);
	       			groupWithValue.setParent(this,getStartOffset() + 627);
	       			groupWith88.setParent(this,getStartOffset() + 836);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of groupWithoutValue
	 *	@return groupWithoutValue
	 */   
	 public GroupWithoutValue getGroupWithoutValue() {
   	return groupWithoutValue;
   }
   /**
	* 	Update GroupWithoutValue with the passed value
	*   Corresponding COBOL Variable is WS-GROUP-WITHOUT-VALUE
	*	@param value
	*/
   public void setGroupWithoutValue(char[] value) {
      groupWithoutValue.setString(value); 
   }   
    
     /**
	 * 	Update GroupWithoutValue 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setGroupWithoutValue(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,groupWithoutValue.begin,groupWithoutValue.length());
   }
   
     /**
	 * 	Update GroupWithoutValue 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGroupWithoutValue(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,groupWithoutValue.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update GroupWithoutValue with another Field
	 *	@param value
	 */
   public void setGroupWithoutValue(Field source) {
   	replace(source,0,source.length(),groupWithoutValue.begin,groupWithoutValue.length());
   }  
   
     /**
	 * 	Update GroupWithoutValue 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setGroupWithoutValue(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,groupWithoutValue.begin,groupWithoutValue.length());
   }
   
     /**
	 * 	Update GroupWithoutValue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGroupWithoutValue(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,groupWithoutValue.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aGroupWithArray
	 *	@return aGroupWithArray
	 */   
	 public AGroupWithArray getAGroupWithArray() {
   	return aGroupWithArray;
   }
   /**
	* 	Update AGroupWithArray with the passed value
	*   Corresponding COBOL Variable is WS-A-GROUP-WITH-ARRAY
	*	@param value
	*/
   public void setAGroupWithArray(char[] value) {
      aGroupWithArray.setString(value); 
   }   
    
     /**
	 * 	Update AGroupWithArray 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAGroupWithArray(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aGroupWithArray.begin,aGroupWithArray.length());
   }
   
     /**
	 * 	Update AGroupWithArray 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAGroupWithArray(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aGroupWithArray.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AGroupWithArray with another Field
	 *	@param value
	 */
   public void setAGroupWithArray(Field source) {
   	replace(source,0,source.length(),aGroupWithArray.begin,aGroupWithArray.length());
   }  
   
     /**
	 * 	Update AGroupWithArray 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAGroupWithArray(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aGroupWithArray.begin,aGroupWithArray.length());
   }
   
     /**
	 * 	Update AGroupWithArray 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAGroupWithArray(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aGroupWithArray.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of groupWithValue
	 *	@return groupWithValue
	 */   
	 public GroupWithValue getGroupWithValue() {
   	return groupWithValue;
   }
   /**
	* 	Update GroupWithValue with the passed value
	*   Corresponding COBOL Variable is WS-GROUP-WITH-VALUE
	*	@param value
	*/
   public void setGroupWithValue(char[] value) {
      groupWithValue.setString(value); 
   }   
    
     /**
	 * 	Update GroupWithValue 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setGroupWithValue(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,groupWithValue.begin,groupWithValue.length());
   }
   
     /**
	 * 	Update GroupWithValue 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGroupWithValue(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,groupWithValue.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update GroupWithValue with another Field
	 *	@param value
	 */
   public void setGroupWithValue(Field source) {
   	replace(source,0,source.length(),groupWithValue.begin,groupWithValue.length());
   }  
   
     /**
	 * 	Update GroupWithValue 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setGroupWithValue(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,groupWithValue.begin,groupWithValue.length());
   }
   
     /**
	 * 	Update GroupWithValue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGroupWithValue(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,groupWithValue.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of groupWith88
	 *	@return groupWith88
	 */   
	 public GroupWith88 getGroupWith88() {
   	return groupWith88;
   }
   /**
	* 	Update GroupWith88 with the passed value
	*   Corresponding COBOL Variable is WS-GROUP-WITH-88
	*	@param value
	*/
   public void setGroupWith88(char[] value) {
      groupWith88.setString(value); 
   }   
    
     /**
	 * 	Update GroupWith88 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setGroupWith88(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,groupWith88.begin,groupWith88.length());
   }
   
     /**
	 * 	Update GroupWith88 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGroupWith88(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,groupWith88.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update GroupWith88 with another Field
	 *	@param value
	 */
   public void setGroupWith88(Field source) {
   	replace(source,0,source.length(),groupWith88.begin,groupWith88.length());
   }  
   
     /**
	 * 	Update GroupWith88 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setGroupWith88(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,groupWith88.begin,groupWith88.length());
   }
   
     /**
	 * 	Update GroupWith88 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGroupWith88(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,groupWith88.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Group
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          groupWithoutValue.initialize();
     
          aGroupWithArray.initialize();
     
          groupWithValue.initialize();
     
          groupWith88.initialize();
     
   }

		public static int getGroupFieldLength() {
			return GROUP_LENGTH;
		}

}
  
