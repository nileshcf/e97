package com.cloudframe.app.ar640010.dto;

/**
*  The class Messages600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Messages600 extends Messages600Serialized {
   
				private MsgPrefix600 msgPrefix600 = new MsgPrefix600();
				private XtkDefaultMsg600 xtkDefaultMsg600 = new XtkDefaultMsg600();
				private XtkAssignMsg600 xtkAssignMsg600 = new XtkAssignMsg600();
				private XtkMsg1600 xtkMsg1600 = new XtkMsg1600();
				private XtkMsg2600 xtkMsg2600 = new XtkMsg2600();
				private ProgramMsg600 programMsg600 = new ProgramMsg600();
				private CompileMsg600 compileMsg600 = new CompileMsg600();
				private CurrentMsg600 currentMsg600 = new CurrentMsg600();
				private TsSuffix600 tsSuffix600 = new TsSuffix600();
	
	/**
	* Constructor for Messages600
	**/
    public Messages600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			msgPrefix600.setParent(this,getStartOffset() + 0);
	       			xtkDefaultMsg600.setParent(this,getStartOffset() + 9);
	       			xtkAssignMsg600.setParent(this,getStartOffset() + 66);
	       			xtkMsg1600.setParent(this,getStartOffset() + 123);
	       			xtkMsg2600.setParent(this,getStartOffset() + 184);
	       			programMsg600.setParent(this,getStartOffset() + 241);
	       			compileMsg600.setParent(this,getStartOffset() + 277);
	       			currentMsg600.setParent(this,getStartOffset() + 322);
	       			tsSuffix600.setParent(this,getStartOffset() + 367);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of msgPrefix600
	 *	@return msgPrefix600
	 */   
	 public MsgPrefix600 getMsgPrefix600() {
   	return msgPrefix600;
   }
   /**
	* 	Update MsgPrefix600 with the passed value
	*   Corresponding COBOL Variable is 600-MSG-PREFIX
	*	@param value
	*/
   public void setMsgPrefix600(char[] value) {
      msgPrefix600.setString(value); 
   }   
    
     /**
	 * 	Update MsgPrefix600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsgPrefix600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msgPrefix600.begin,msgPrefix600.length());
   }
   
     /**
	 * 	Update MsgPrefix600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgPrefix600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msgPrefix600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsgPrefix600 with another Field
	 *	@param value
	 */
   public void setMsgPrefix600(Field source) {
   	replace(source,0,source.length(),msgPrefix600.begin,msgPrefix600.length());
   }  
   
     /**
	 * 	Update MsgPrefix600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsgPrefix600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msgPrefix600.begin,msgPrefix600.length());
   }
   
     /**
	 * 	Update MsgPrefix600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgPrefix600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msgPrefix600.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of xtkDefaultMsg600
	 *	@return xtkDefaultMsg600
	 */   
	 public XtkDefaultMsg600 getXtkDefaultMsg600() {
   	return xtkDefaultMsg600;
   }
   /**
	* 	Update XtkDefaultMsg600 with the passed value
	*   Corresponding COBOL Variable is 600-XTK-DEFAULT-MSG
	*	@param value
	*/
   public void setXtkDefaultMsg600(char[] value) {
      xtkDefaultMsg600.setString(value); 
   }   
    
     /**
	 * 	Update XtkDefaultMsg600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setXtkDefaultMsg600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xtkDefaultMsg600.begin,xtkDefaultMsg600.length());
   }
   
     /**
	 * 	Update XtkDefaultMsg600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXtkDefaultMsg600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xtkDefaultMsg600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update XtkDefaultMsg600 with another Field
	 *	@param value
	 */
   public void setXtkDefaultMsg600(Field source) {
   	replace(source,0,source.length(),xtkDefaultMsg600.begin,xtkDefaultMsg600.length());
   }  
   
     /**
	 * 	Update XtkDefaultMsg600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setXtkDefaultMsg600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xtkDefaultMsg600.begin,xtkDefaultMsg600.length());
   }
   
     /**
	 * 	Update XtkDefaultMsg600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXtkDefaultMsg600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xtkDefaultMsg600.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of xtkAssignMsg600
	 *	@return xtkAssignMsg600
	 */   
	 public XtkAssignMsg600 getXtkAssignMsg600() {
   	return xtkAssignMsg600;
   }
   /**
	* 	Update XtkAssignMsg600 with the passed value
	*   Corresponding COBOL Variable is 600-XTK-ASSIGN-MSG
	*	@param value
	*/
   public void setXtkAssignMsg600(char[] value) {
      xtkAssignMsg600.setString(value); 
   }   
    
     /**
	 * 	Update XtkAssignMsg600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setXtkAssignMsg600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xtkAssignMsg600.begin,xtkAssignMsg600.length());
   }
   
     /**
	 * 	Update XtkAssignMsg600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXtkAssignMsg600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xtkAssignMsg600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update XtkAssignMsg600 with another Field
	 *	@param value
	 */
   public void setXtkAssignMsg600(Field source) {
   	replace(source,0,source.length(),xtkAssignMsg600.begin,xtkAssignMsg600.length());
   }  
   
     /**
	 * 	Update XtkAssignMsg600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setXtkAssignMsg600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xtkAssignMsg600.begin,xtkAssignMsg600.length());
   }
   
     /**
	 * 	Update XtkAssignMsg600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXtkAssignMsg600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xtkAssignMsg600.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of xtkMsg1600
	 *	@return xtkMsg1600
	 */   
	 public XtkMsg1600 getXtkMsg1600() {
   	return xtkMsg1600;
   }
   /**
	* 	Update XtkMsg1600 with the passed value
	*   Corresponding COBOL Variable is 600-XTK-MSG1
	*	@param value
	*/
   public void setXtkMsg1600(char[] value) {
      xtkMsg1600.setString(value); 
   }   
    
     /**
	 * 	Update XtkMsg1600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setXtkMsg1600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xtkMsg1600.begin,xtkMsg1600.length());
   }
   
     /**
	 * 	Update XtkMsg1600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXtkMsg1600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xtkMsg1600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update XtkMsg1600 with another Field
	 *	@param value
	 */
   public void setXtkMsg1600(Field source) {
   	replace(source,0,source.length(),xtkMsg1600.begin,xtkMsg1600.length());
   }  
   
     /**
	 * 	Update XtkMsg1600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setXtkMsg1600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xtkMsg1600.begin,xtkMsg1600.length());
   }
   
     /**
	 * 	Update XtkMsg1600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXtkMsg1600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xtkMsg1600.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of xtkMsg2600
	 *	@return xtkMsg2600
	 */   
	 public XtkMsg2600 getXtkMsg2600() {
   	return xtkMsg2600;
   }
   /**
	* 	Update XtkMsg2600 with the passed value
	*   Corresponding COBOL Variable is 600-XTK-MSG2
	*	@param value
	*/
   public void setXtkMsg2600(char[] value) {
      xtkMsg2600.setString(value); 
   }   
    
     /**
	 * 	Update XtkMsg2600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setXtkMsg2600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xtkMsg2600.begin,xtkMsg2600.length());
   }
   
     /**
	 * 	Update XtkMsg2600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXtkMsg2600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xtkMsg2600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update XtkMsg2600 with another Field
	 *	@param value
	 */
   public void setXtkMsg2600(Field source) {
   	replace(source,0,source.length(),xtkMsg2600.begin,xtkMsg2600.length());
   }  
   
     /**
	 * 	Update XtkMsg2600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setXtkMsg2600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xtkMsg2600.begin,xtkMsg2600.length());
   }
   
     /**
	 * 	Update XtkMsg2600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXtkMsg2600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xtkMsg2600.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of programMsg600
	 *	@return programMsg600
	 */   
	 public ProgramMsg600 getProgramMsg600() {
   	return programMsg600;
   }
   /**
	* 	Update ProgramMsg600 with the passed value
	*   Corresponding COBOL Variable is 600-PROGRAM-MSG
	*	@param value
	*/
   public void setProgramMsg600(char[] value) {
      programMsg600.setString(value); 
   }   
    
     /**
	 * 	Update ProgramMsg600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setProgramMsg600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,programMsg600.begin,programMsg600.length());
   }
   
     /**
	 * 	Update ProgramMsg600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProgramMsg600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,programMsg600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ProgramMsg600 with another Field
	 *	@param value
	 */
   public void setProgramMsg600(Field source) {
   	replace(source,0,source.length(),programMsg600.begin,programMsg600.length());
   }  
   
     /**
	 * 	Update ProgramMsg600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setProgramMsg600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,programMsg600.begin,programMsg600.length());
   }
   
     /**
	 * 	Update ProgramMsg600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProgramMsg600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,programMsg600.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of compileMsg600
	 *	@return compileMsg600
	 */   
	 public CompileMsg600 getCompileMsg600() {
   	return compileMsg600;
   }
   /**
	* 	Update CompileMsg600 with the passed value
	*   Corresponding COBOL Variable is 600-COMPILE-MSG
	*	@param value
	*/
   public void setCompileMsg600(char[] value) {
      compileMsg600.setString(value); 
   }   
    
     /**
	 * 	Update CompileMsg600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCompileMsg600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,compileMsg600.begin,compileMsg600.length());
   }
   
     /**
	 * 	Update CompileMsg600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompileMsg600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,compileMsg600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CompileMsg600 with another Field
	 *	@param value
	 */
   public void setCompileMsg600(Field source) {
   	replace(source,0,source.length(),compileMsg600.begin,compileMsg600.length());
   }  
   
     /**
	 * 	Update CompileMsg600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCompileMsg600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,compileMsg600.begin,compileMsg600.length());
   }
   
     /**
	 * 	Update CompileMsg600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompileMsg600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,compileMsg600.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of currentMsg600
	 *	@return currentMsg600
	 */   
	 public CurrentMsg600 getCurrentMsg600() {
   	return currentMsg600;
   }
   /**
	* 	Update CurrentMsg600 with the passed value
	*   Corresponding COBOL Variable is 600-CURRENT-MSG
	*	@param value
	*/
   public void setCurrentMsg600(char[] value) {
      currentMsg600.setString(value); 
   }   
    
     /**
	 * 	Update CurrentMsg600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCurrentMsg600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,currentMsg600.begin,currentMsg600.length());
   }
   
     /**
	 * 	Update CurrentMsg600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentMsg600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,currentMsg600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CurrentMsg600 with another Field
	 *	@param value
	 */
   public void setCurrentMsg600(Field source) {
   	replace(source,0,source.length(),currentMsg600.begin,currentMsg600.length());
   }  
   
     /**
	 * 	Update CurrentMsg600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCurrentMsg600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,currentMsg600.begin,currentMsg600.length());
   }
   
     /**
	 * 	Update CurrentMsg600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentMsg600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,currentMsg600.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of tsSuffix600
	 *	@return tsSuffix600
	 */   
	 public TsSuffix600 getTsSuffix600() {
   	return tsSuffix600;
   }
   /**
	* 	Update TsSuffix600 with the passed value
	*   Corresponding COBOL Variable is 600-TS-SUFFIX
	*	@param value
	*/
   public void setTsSuffix600(char[] value) {
      tsSuffix600.setString(value); 
   }   
    
     /**
	 * 	Update TsSuffix600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTsSuffix600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tsSuffix600.begin,tsSuffix600.length());
   }
   
     /**
	 * 	Update TsSuffix600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTsSuffix600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tsSuffix600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TsSuffix600 with another Field
	 *	@param value
	 */
   public void setTsSuffix600(Field source) {
   	replace(source,0,source.length(),tsSuffix600.begin,tsSuffix600.length());
   }  
   
     /**
	 * 	Update TsSuffix600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTsSuffix600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tsSuffix600.begin,tsSuffix600.length());
   }
   
     /**
	 * 	Update TsSuffix600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTsSuffix600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tsSuffix600.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getMessages600FieldLength() {
			return MESSAGES_600_LENGTH;
		}

}
  
