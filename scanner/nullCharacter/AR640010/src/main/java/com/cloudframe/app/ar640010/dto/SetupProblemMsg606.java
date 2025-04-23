package com.cloudframe.app.ar640010.dto;

/**
*  The class SetupProblemMsg606 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SetupProblemMsg606 extends SetupProblemMsg606Serialized {
   


							private char[] setupProblemMsg606ConditionGroup2 = new char[40];
						
	
	/**
	* Constructor for SetupProblemMsg606
	**/
    public SetupProblemMsg606() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0060-ENDPOINT SETUP PROBLEM - ").toCharArray()
             , getStartOffset() + 0
             ,30
             );
       replaceValue( // serialize and save the value
             fillSpace(40)
             , getStartOffset() + 30
             ,40
             );
    }


 

	/**
	 *	Returns the value of setupProblemMsg606ConditionGroup2
	 *	@return setupProblemMsg606ConditionGroup2
	 */
   public char[] getSetupProblemMsg606ConditionGroup2() throws CFException{
     if (isSetupProblemMsg606ConditionGroup2Modified()) { 
        setupProblemMsg606ConditionGroup2 = refreshSetupProblemMsg606ConditionGroup2();
     }
   		return setupProblemMsg606ConditionGroup2;
   }

  
	/**
	*  set variable setupProblemMsg606ConditionGroup2
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setSetupProblemMsg606ConditionGroup2(char[] value) {
      setupProblemMsg606ConditionGroup2 = checkSetupProblemMsg606ConditionGroup2Constraints(value);
      serializeSetupProblemMsg606ConditionGroup2(setupProblemMsg606ConditionGroup2);
   } 

     /**
	 * 	Update SetupProblemMsg606ConditionGroup2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSetupProblemMsg606ConditionGroup2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSetupProblemMsg606ConditionGroup2,setupProblemMsg606ConditionGroup2.length);
   	
   }
   
   public void setSetupProblemMsg606ConditionGroup2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSetupProblemMsg606ConditionGroup2,setupProblemMsg606ConditionGroup2.length);
   	
   }
   
     /**
	 * 	Update SetupProblemMsg606ConditionGroup2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSetupProblemMsg606ConditionGroup2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSetupProblemMsg606ConditionGroup2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SetupProblemMsg606ConditionGroup2 with another Field
	 *	@param value
	 */
   public void setSetupProblemMsg606ConditionGroup2(Field source) {
       replace(source,0,source.length(),beginSetupProblemMsg606ConditionGroup2,SETUP_PROBLEM_MSG_606_CONDITION_GROUP_2_LEN);
   	
   }  
   
     /**
	 * 	Update SetupProblemMsg606ConditionGroup2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSetupProblemMsg606ConditionGroup2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSetupProblemMsg606ConditionGroup2,SETUP_PROBLEM_MSG_606_CONDITION_GROUP_2_LEN);
   	
   }
   
     /**
	 * 	Update SetupProblemMsg606ConditionGroup2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSetupProblemMsg606ConditionGroup2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSetupProblemMsg606ConditionGroup2+targetIndex,targetLen);
    
   }
	char[] setupEptMissing8860688Value = "ORIGINAL ENDPOINT TARAEPT ROW IS MISSING".toCharArray();
	/**
	 *	Test condition "ORIGINAL ENDPOINT TARAEPT ROW IS MISSING" for isSetupEptMissing88606()
	 *	@return  Returns true if isSetupEptMissing88606() is "ORIGINAL ENDPOINT TARAEPT ROW IS MISSING"
	 */
   public boolean isSetupEptMissing88606() throws CFException {
      return (  compareChars( getSetupProblemMsg606ConditionGroup2() , setupEptMissing8860688Value)  == 0  );
   }


	/**
	*  set values "ORIGINAL ENDPOINT TARAEPT ROW IS MISSING"
	*/
   	public void setSetupEptMissing88606True() {  			
    	setSetupProblemMsg606ConditionGroup2( setupEptMissing8860688Value);
   	}
	char[] setupEptBackup8860688Value = "BACKUP ENDPOINT TARAEPT ROW IS MISSING  ".toCharArray();
	/**
	 *	Test condition "BACKUP ENDPOINT TARAEPT ROW IS MISSING  " for isSetupEptBackup88606()
	 *	@return  Returns true if isSetupEptBackup88606() is "BACKUP ENDPOINT TARAEPT ROW IS MISSING  "
	 */
   public boolean isSetupEptBackup88606() throws CFException {
      return (  compareChars( getSetupProblemMsg606ConditionGroup2() , setupEptBackup8860688Value)  == 0  );
   }


	/**
	*  set values "BACKUP ENDPOINT TARAEPT ROW IS MISSING  "
	*/
   	public void setSetupEptBackup88606True() {  			
    	setSetupProblemMsg606ConditionGroup2( setupEptBackup8860688Value);
   	}
	char[] setupEptBroken8860688Value = "BACKUP ENDPOINT TARAEPT CHAIN IS BROKEN ".toCharArray();
	/**
	 *	Test condition "BACKUP ENDPOINT TARAEPT CHAIN IS BROKEN " for isSetupEptBroken88606()
	 *	@return  Returns true if isSetupEptBroken88606() is "BACKUP ENDPOINT TARAEPT CHAIN IS BROKEN "
	 */
   public boolean isSetupEptBroken88606() throws CFException {
      return (  compareChars( getSetupProblemMsg606ConditionGroup2() , setupEptBroken8860688Value)  == 0  );
   }


	/**
	*  set values "BACKUP ENDPOINT TARAEPT CHAIN IS BROKEN "
	*/
   	public void setSetupEptBroken88606True() {  			
    	setSetupProblemMsg606ConditionGroup2( setupEptBroken8860688Value);
   	}
	char[] setupEptLoops8860688Value = "BACKUP ENDPOINT TARAEPT CHAIN HAS A LOOP".toCharArray();
	/**
	 *	Test condition "BACKUP ENDPOINT TARAEPT CHAIN HAS A LOOP" for isSetupEptLoops88606()
	 *	@return  Returns true if isSetupEptLoops88606() is "BACKUP ENDPOINT TARAEPT CHAIN HAS A LOOP"
	 */
   public boolean isSetupEptLoops88606() throws CFException {
      return (  compareChars( getSetupProblemMsg606ConditionGroup2() , setupEptLoops8860688Value)  == 0  );
   }


	/**
	*  set values "BACKUP ENDPOINT TARAEPT CHAIN HAS A LOOP"
	*/
   	public void setSetupEptLoops88606True() {  			
    	setSetupProblemMsg606ConditionGroup2( setupEptLoops8860688Value);
   	}
	char[] setupEptNonFtss8860688Value = "ENDPOINT IS NOT AN FTSS ENDOINT         ".toCharArray();
	/**
	 *	Test condition "ENDPOINT IS NOT AN FTSS ENDOINT         " for isSetupEptNonFtss88606()
	 *	@return  Returns true if isSetupEptNonFtss88606() is "ENDPOINT IS NOT AN FTSS ENDOINT         "
	 */
   public boolean isSetupEptNonFtss88606() throws CFException {
      return (  compareChars( getSetupProblemMsg606ConditionGroup2() , setupEptNonFtss8860688Value)  == 0  );
   }


	/**
	*  set values "ENDPOINT IS NOT AN FTSS ENDOINT         "
	*/
   	public void setSetupEptNonFtss88606True() {  			
    	setSetupProblemMsg606ConditionGroup2( setupEptNonFtss8860688Value);
   	}
	char[] setupEfpMissing8860688Value = "ORIGINAL ENDPOINT TARAEFP ROW IS MISSING".toCharArray();
	/**
	 *	Test condition "ORIGINAL ENDPOINT TARAEFP ROW IS MISSING" for isSetupEfpMissing88606()
	 *	@return  Returns true if isSetupEfpMissing88606() is "ORIGINAL ENDPOINT TARAEFP ROW IS MISSING"
	 */
   public boolean isSetupEfpMissing88606() throws CFException {
      return (  compareChars( getSetupProblemMsg606ConditionGroup2() , setupEfpMissing8860688Value)  == 0  );
   }


	/**
	*  set values "ORIGINAL ENDPOINT TARAEFP ROW IS MISSING"
	*/
   	public void setSetupEfpMissing88606True() {  			
    	setSetupProblemMsg606ConditionGroup2( setupEfpMissing8860688Value);
   	}
	char[] setupEfpBackup8860688Value = "BACKUP ENDPOINT TARAEFP ROW IS MISSING  ".toCharArray();
	/**
	 *	Test condition "BACKUP ENDPOINT TARAEFP ROW IS MISSING  " for isSetupEfpBackup88606()
	 *	@return  Returns true if isSetupEfpBackup88606() is "BACKUP ENDPOINT TARAEFP ROW IS MISSING  "
	 */
   public boolean isSetupEfpBackup88606() throws CFException {
      return (  compareChars( getSetupProblemMsg606ConditionGroup2() , setupEfpBackup8860688Value)  == 0  );
   }


	/**
	*  set values "BACKUP ENDPOINT TARAEFP ROW IS MISSING  "
	*/
   	public void setSetupEfpBackup88606True() {  			
    	setSetupProblemMsg606ConditionGroup2( setupEfpBackup8860688Value);
   	}
	char[] setupUnkProblem8860688Value = "** NOTIFY GFT - UNKNOWN SETUP PROBLEM **".toCharArray();
	/**
	 *	Test condition "** NOTIFY GFT - UNKNOWN SETUP PROBLEM **" for isSetupUnkProblem88606()
	 *	@return  Returns true if isSetupUnkProblem88606() is "** NOTIFY GFT - UNKNOWN SETUP PROBLEM **"
	 */
   public boolean isSetupUnkProblem88606() throws CFException {
      return (  compareChars( getSetupProblemMsg606ConditionGroup2() , setupUnkProblem8860688Value)  == 0  );
   }


	/**
	*  set values "** NOTIFY GFT - UNKNOWN SETUP PROBLEM **"
	*/
   	public void setSetupUnkProblem88606True() {  			
    	setSetupProblemMsg606ConditionGroup2( setupUnkProblem8860688Value);
   	}

	
	
	

		public static int getSetupProblemMsg606FieldLength() {
			return SETUP_PROBLEM_MSG_606_LENGTH;
		}

}
  
