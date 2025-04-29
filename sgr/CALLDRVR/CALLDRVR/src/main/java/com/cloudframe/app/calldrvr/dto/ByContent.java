package com.cloudframe.app.calldrvr.dto;

/**
*  The class ByContent is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:38. using version 5.0.0.254
**/


import com.cloudframe.app.calldrvr.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ByContent extends ByContentSerialized { 
   

						private char[] parm1 = Field.fillLowValue(8);
				private Parm2Group parm2Group = new Parm2Group();
				private Parm3Group parm3Group = new Parm3Group();
	
	/**
	* Constructor for ByContent
	**/
    public ByContent() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ByContent. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ByContent(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			parm2Group.setParent(this,getStartOffset() + 8);
	       			parm3Group.setParent(this,getStartOffset() + 10);
    } 

	/**
	 *	Returns the value of parm1
	 *	@return parm1
	 */
   public char[] getParm1() throws CFException{
     if (isParm1Modified()) { 
        parm1 = refreshParm1();
     }
   		return parm1;
   }

  
	/**
	*  set variable parm1
	*  Corresponding COBOL Variable is WS-PARM1
	*  @param value
	**/
   public void setParm1(char[] value) {
      parm1 = checkParm1Constraints(value);
      serializeParm1(parm1);
   } 

     /**
	 * 	Update Parm1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParm1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParm1,parm1.length);
   	
   }
   
   public void setParm1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParm1,parm1.length);
   	
   }
   
     /**
	 * 	Update Parm1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParm1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParm1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Parm1 with another Field
	 *	@param value
	 */
   public void setParm1(Field source) {
       replace(source,0,source.length(),beginParm1,PARM_1_LEN);
   	
   }  
   
     /**
	 * 	Update Parm1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParm1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParm1,PARM_1_LEN);
   	
   }
   
     /**
	 * 	Update Parm1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParm1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParm1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of parm2Group
	 *	@return parm2Group
	 */   
	 public Parm2Group getParm2Group() {
   	return parm2Group;
   }
   /**
	* 	Update Parm2Group with the passed value
	*   Corresponding COBOL Variable is WS-PARM2-GROUP
	*	@param value
	*/
   public void setParm2Group(char[] value) {
      parm2Group.setString(value); 
   }   
    
     /**
	 * 	Update Parm2Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setParm2Group(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parm2Group.begin,parm2Group.length());
   }
   
     /**
	 * 	Update Parm2Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParm2Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parm2Group.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Parm2Group with another Field
	 *	@param value
	 */
   public void setParm2Group(Field source) {
   	replace(source,0,source.length(),parm2Group.begin,parm2Group.length());
   }  
   
     /**
	 * 	Update Parm2Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setParm2Group(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parm2Group.begin,parm2Group.length());
   }
   
     /**
	 * 	Update Parm2Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParm2Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parm2Group.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of parm3Group
	 *	@return parm3Group
	 */   
	 public Parm3Group getParm3Group() {
   	return parm3Group;
   }
   /**
	* 	Update Parm3Group with the passed value
	*   Corresponding COBOL Variable is WS-PARM3-GROUP
	*	@param value
	*/
   public void setParm3Group(char[] value) {
      parm3Group.setString(value); 
   }   
    
     /**
	 * 	Update Parm3Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setParm3Group(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parm3Group.begin,parm3Group.length());
   }
   
     /**
	 * 	Update Parm3Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParm3Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parm3Group.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Parm3Group with another Field
	 *	@param value
	 */
   public void setParm3Group(Field source) {
   	replace(source,0,source.length(),parm3Group.begin,parm3Group.length());
   }  
   
     /**
	 * 	Update Parm3Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setParm3Group(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parm3Group.begin,parm3Group.length());
   }
   
     /**
	 * 	Update Parm3Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParm3Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parm3Group.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getByContentFieldLength() {
			return BY_CONTENT_LENGTH;
		}

}
  
