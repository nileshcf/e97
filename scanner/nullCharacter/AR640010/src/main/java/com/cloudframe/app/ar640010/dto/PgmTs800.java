package com.cloudframe.app.ar640010.dto;

/**
*  The class PgmTs800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PgmTs800 extends PgmTs800Serialized { 
   
				private PgmDate800 pgmDate800 = new PgmDate800();

				private PgmTime800 pgmTime800 = new PgmTime800();
	
	/**
	* Constructor for PgmTs800
	**/
    public PgmTs800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PgmTs800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PgmTs800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			pgmDate800.setParent(this,getStartOffset() + 0);
	       			pgmTime800.setParent(this,getStartOffset() + 11);
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 10
             ,1
             );
    } 

	/**
	 *	Returns the value of pgmDate800
	 *	@return pgmDate800
	 */   
	 public PgmDate800 getPgmDate800() {
   	return pgmDate800;
   }
   /**
	* 	Update PgmDate800 with the passed value
	*   Corresponding COBOL Variable is 800-PGM-DATE
	*	@param value
	*/
   public void setPgmDate800(char[] value) {
      pgmDate800.setString(value); 
   }   
    
     /**
	 * 	Update PgmDate800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPgmDate800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgmDate800.begin,pgmDate800.length());
   }
   
     /**
	 * 	Update PgmDate800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmDate800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgmDate800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update PgmDate800 with another Field
	 *	@param value
	 */
   public void setPgmDate800(Field source) {
   	replace(source,0,source.length(),pgmDate800.begin,pgmDate800.length());
   }  
   
     /**
	 * 	Update PgmDate800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPgmDate800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgmDate800.begin,pgmDate800.length());
   }
   
     /**
	 * 	Update PgmDate800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmDate800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgmDate800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of pgmTime800
	 *	@return pgmTime800
	 */   
	 public PgmTime800 getPgmTime800() {
   	return pgmTime800;
   }
   /**
	* 	Update PgmTime800 with the passed value
	*   Corresponding COBOL Variable is 800-PGM-TIME
	*	@param value
	*/
   public void setPgmTime800(char[] value) {
      pgmTime800.setString(value); 
   }   
    
     /**
	 * 	Update PgmTime800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPgmTime800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgmTime800.begin,pgmTime800.length());
   }
   
     /**
	 * 	Update PgmTime800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmTime800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgmTime800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update PgmTime800 with another Field
	 *	@param value
	 */
   public void setPgmTime800(Field source) {
   	replace(source,0,source.length(),pgmTime800.begin,pgmTime800.length());
   }  
   
     /**
	 * 	Update PgmTime800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPgmTime800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgmTime800.begin,pgmTime800.length());
   }
   
     /**
	 * 	Update PgmTime800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmTime800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgmTime800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getPgmTs800FieldLength() {
			return PGM_TS_800_LENGTH;
		}

}
  
