package com.cloudframe.app.sf320010.dto;

/**
*  The class MciabendParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MciabendParms extends MciabendParmsSerialized {
   

						private char[] mciabendModule = new char[8];

						private char[] mcabendModule = new char[8];
				private MciabendParm1 mciabendParm1 = new MciabendParm1();
	
	/**
	* Constructor for MciabendParms
	**/
    public MciabendParms() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			mciabendParm1.setParent(this,getStartOffset() + 16);
	   	/*  end of offset */
								setMciabendModule(("MCIABEND").toCharArray());
								setMcabendModule(("MCABEND ").toCharArray());
    }


 

	/**
	 *	Returns the value of mciabendModule
	 *	@return mciabendModule
	 */
   public char[] getMciabendModule() throws CFException{
     if (isMciabendModuleModified()) { 
        mciabendModule = refreshMciabendModule();
     }
   		return mciabendModule;
   }

  
	/**
	*  set variable mciabendModule
	*  Corresponding COBOL Variable is MCIABEND-MODULE
	*  @param value
	**/
   public void setMciabendModule(char[] value) {
      mciabendModule = checkMciabendModuleConstraints(value);
      serializeMciabendModule(mciabendModule);
   } 

     /**
	 * 	Update MciabendModule 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciabendModule(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciabendModule,mciabendModule.length);
   	
   }
   
   public void setMciabendModule(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciabendModule,mciabendModule.length);
   	
   }
   
     /**
	 * 	Update MciabendModule 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciabendModule(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciabendModule+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciabendModule with another Field
	 *	@param value
	 */
   public void setMciabendModule(Field source) {
       replace(source,0,source.length(),beginMciabendModule,MCIABEND_MODULE_LEN);
   	
   }  
   
     /**
	 * 	Update MciabendModule 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciabendModule(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciabendModule,MCIABEND_MODULE_LEN);
   	
   }
   
     /**
	 * 	Update MciabendModule 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciabendModule(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciabendModule+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mcabendModule
	 *	@return mcabendModule
	 */
   public char[] getMcabendModule() throws CFException{
     if (isMcabendModuleModified()) { 
        mcabendModule = refreshMcabendModule();
     }
   		return mcabendModule;
   }

  
	/**
	*  set variable mcabendModule
	*  Corresponding COBOL Variable is MCABEND-MODULE
	*  @param value
	**/
   public void setMcabendModule(char[] value) {
      mcabendModule = checkMcabendModuleConstraints(value);
      serializeMcabendModule(mcabendModule);
   } 

     /**
	 * 	Update McabendModule 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcabendModule(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMcabendModule,mcabendModule.length);
   	
   }
   
   public void setMcabendModule(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMcabendModule,mcabendModule.length);
   	
   }
   
     /**
	 * 	Update McabendModule 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcabendModule(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcabendModule+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update McabendModule with another Field
	 *	@param value
	 */
   public void setMcabendModule(Field source) {
       replace(source,0,source.length(),beginMcabendModule,MCABEND_MODULE_LEN);
   	
   }  
   
     /**
	 * 	Update McabendModule 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcabendModule(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMcabendModule,MCABEND_MODULE_LEN);
   	
   }
   
     /**
	 * 	Update McabendModule 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcabendModule(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcabendModule+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciabendParm1
	 *	@return mciabendParm1
	 */   
	 public MciabendParm1 getMciabendParm1() {
   	return mciabendParm1;
   }
   /**
	* 	Update MciabendParm1 with the passed value
	*   Corresponding COBOL Variable is MCIABEND-PARM1
	*	@param value
	*/
   public void setMciabendParm1(char[] value) {
      mciabendParm1.setString(value); 
   }   
    
     /**
	 * 	Update MciabendParm1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMciabendParm1(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciabendParm1.begin,mciabendParm1.length());
   }
   
     /**
	 * 	Update MciabendParm1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciabendParm1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciabendParm1.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MciabendParm1 with another Field
	 *	@param value
	 */
   public void setMciabendParm1(Field source) {
   	replace(source,0,source.length(),mciabendParm1.begin,mciabendParm1.length());
   }  
   
     /**
	 * 	Update MciabendParm1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMciabendParm1(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciabendParm1.begin,mciabendParm1.length());
   }
   
     /**
	 * 	Update MciabendParm1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciabendParm1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciabendParm1.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getMciabendParmsFieldLength() {
			return MCIABEND_PARMS_LENGTH;
		}

}
  
