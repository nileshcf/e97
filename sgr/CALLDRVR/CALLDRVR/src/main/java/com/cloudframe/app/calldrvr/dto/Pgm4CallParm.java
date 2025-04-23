package com.cloudframe.app.calldrvr.dto;

/**
*  The class Pgm4CallParm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:13. using version 5.0.0.254
**/


import com.cloudframe.app.calldrvr.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Pgm4CallParm extends Pgm4CallParmSerialized {
   

						private char[] pgm4Parm1 = Field.fillLowValue(8);
				private Pgm4Parm2Group pgm4Parm2Group = new Pgm4Parm2Group();
				private Pgm4Parm3Group pgm4Parm3Group = new Pgm4Parm3Group();
				private Pgm4Parm4Group pgm4Parm4Group = new Pgm4Parm4Group();
				private Pgm4Parm5Group pgm4Parm5Group = new Pgm4Parm5Group();
				private Pgm4Parm6Group pgm4Parm6Group = new Pgm4Parm6Group();
	
	/**
	* Constructor for Pgm4CallParm
	**/
    public Pgm4CallParm() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			pgm4Parm2Group.setParent(this,getStartOffset() + 8);
	       			pgm4Parm3Group.setParent(this,getStartOffset() + 10);
	       			pgm4Parm4Group.setParent(this,getStartOffset() + 13);
	       			pgm4Parm5Group.setParent(this,getStartOffset() + 21);
	       			pgm4Parm6Group.setParent(this,getStartOffset() + 23);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of pgm4Parm1
	 *	@return pgm4Parm1
	 */
   public char[] getPgm4Parm1() throws CFException{
     if (isPgm4Parm1Modified()) { 
        pgm4Parm1 = refreshPgm4Parm1();
     }
   		return pgm4Parm1;
   }

  
	/**
	*  set variable pgm4Parm1
	*  Corresponding COBOL Variable is WS-PGM4-PARM1
	*  @param value
	**/
   public void setPgm4Parm1(char[] value) {
      pgm4Parm1 = checkPgm4Parm1Constraints(value);
      serializePgm4Parm1(pgm4Parm1);
   } 

     /**
	 * 	Update Pgm4Parm1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgm4Parm1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPgm4Parm1,pgm4Parm1.length);
   	
   }
   
   public void setPgm4Parm1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPgm4Parm1,pgm4Parm1.length);
   	
   }
   
     /**
	 * 	Update Pgm4Parm1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgm4Parm1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgm4Parm1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Pgm4Parm1 with another Field
	 *	@param value
	 */
   public void setPgm4Parm1(Field source) {
       replace(source,0,source.length(),beginPgm4Parm1,PGM_4_PARM_1_LEN);
   	
   }  
   
     /**
	 * 	Update Pgm4Parm1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgm4Parm1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPgm4Parm1,PGM_4_PARM_1_LEN);
   	
   }
   
     /**
	 * 	Update Pgm4Parm1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgm4Parm1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgm4Parm1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pgm4Parm2Group
	 *	@return pgm4Parm2Group
	 */   
	 public Pgm4Parm2Group getPgm4Parm2Group() {
   	return pgm4Parm2Group;
   }
   /**
	* 	Update Pgm4Parm2Group with the passed value
	*   Corresponding COBOL Variable is WS-PGM4-PARM2-GROUP
	*	@param value
	*/
   public void setPgm4Parm2Group(char[] value) {
      pgm4Parm2Group.setString(value); 
   }   
    
     /**
	 * 	Update Pgm4Parm2Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPgm4Parm2Group(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm2Group.begin,pgm4Parm2Group.length());
   }
   
     /**
	 * 	Update Pgm4Parm2Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgm4Parm2Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm2Group.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Pgm4Parm2Group with another Field
	 *	@param value
	 */
   public void setPgm4Parm2Group(Field source) {
   	replace(source,0,source.length(),pgm4Parm2Group.begin,pgm4Parm2Group.length());
   }  
   
     /**
	 * 	Update Pgm4Parm2Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPgm4Parm2Group(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm2Group.begin,pgm4Parm2Group.length());
   }
   
     /**
	 * 	Update Pgm4Parm2Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgm4Parm2Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm2Group.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of pgm4Parm3Group
	 *	@return pgm4Parm3Group
	 */   
	 public Pgm4Parm3Group getPgm4Parm3Group() {
   	return pgm4Parm3Group;
   }
   /**
	* 	Update Pgm4Parm3Group with the passed value
	*   Corresponding COBOL Variable is WS-PGM4-PARM3-GROUP
	*	@param value
	*/
   public void setPgm4Parm3Group(char[] value) {
      pgm4Parm3Group.setString(value); 
   }   
    
     /**
	 * 	Update Pgm4Parm3Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPgm4Parm3Group(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm3Group.begin,pgm4Parm3Group.length());
   }
   
     /**
	 * 	Update Pgm4Parm3Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgm4Parm3Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm3Group.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Pgm4Parm3Group with another Field
	 *	@param value
	 */
   public void setPgm4Parm3Group(Field source) {
   	replace(source,0,source.length(),pgm4Parm3Group.begin,pgm4Parm3Group.length());
   }  
   
     /**
	 * 	Update Pgm4Parm3Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPgm4Parm3Group(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm3Group.begin,pgm4Parm3Group.length());
   }
   
     /**
	 * 	Update Pgm4Parm3Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgm4Parm3Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm3Group.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of pgm4Parm4Group
	 *	@return pgm4Parm4Group
	 */   
	 public Pgm4Parm4Group getPgm4Parm4Group() {
   	return pgm4Parm4Group;
   }
   /**
	* 	Update Pgm4Parm4Group with the passed value
	*   Corresponding COBOL Variable is WS-PGM4-PARM4-GROUP
	*	@param value
	*/
   public void setPgm4Parm4Group(char[] value) {
      pgm4Parm4Group.setString(value); 
   }   
    
     /**
	 * 	Update Pgm4Parm4Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPgm4Parm4Group(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm4Group.begin,pgm4Parm4Group.length());
   }
   
     /**
	 * 	Update Pgm4Parm4Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgm4Parm4Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm4Group.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Pgm4Parm4Group with another Field
	 *	@param value
	 */
   public void setPgm4Parm4Group(Field source) {
   	replace(source,0,source.length(),pgm4Parm4Group.begin,pgm4Parm4Group.length());
   }  
   
     /**
	 * 	Update Pgm4Parm4Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPgm4Parm4Group(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm4Group.begin,pgm4Parm4Group.length());
   }
   
     /**
	 * 	Update Pgm4Parm4Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgm4Parm4Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm4Group.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of pgm4Parm5Group
	 *	@return pgm4Parm5Group
	 */   
	 public Pgm4Parm5Group getPgm4Parm5Group() {
   	return pgm4Parm5Group;
   }
   /**
	* 	Update Pgm4Parm5Group with the passed value
	*   Corresponding COBOL Variable is WS-PGM4-PARM5-GROUP
	*	@param value
	*/
   public void setPgm4Parm5Group(char[] value) {
      pgm4Parm5Group.setString(value); 
   }   
    
     /**
	 * 	Update Pgm4Parm5Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPgm4Parm5Group(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm5Group.begin,pgm4Parm5Group.length());
   }
   
     /**
	 * 	Update Pgm4Parm5Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgm4Parm5Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm5Group.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Pgm4Parm5Group with another Field
	 *	@param value
	 */
   public void setPgm4Parm5Group(Field source) {
   	replace(source,0,source.length(),pgm4Parm5Group.begin,pgm4Parm5Group.length());
   }  
   
     /**
	 * 	Update Pgm4Parm5Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPgm4Parm5Group(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm5Group.begin,pgm4Parm5Group.length());
   }
   
     /**
	 * 	Update Pgm4Parm5Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgm4Parm5Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm5Group.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of pgm4Parm6Group
	 *	@return pgm4Parm6Group
	 */   
	 public Pgm4Parm6Group getPgm4Parm6Group() {
   	return pgm4Parm6Group;
   }
   /**
	* 	Update Pgm4Parm6Group with the passed value
	*   Corresponding COBOL Variable is WS-PGM4-PARM6-GROUP
	*	@param value
	*/
   public void setPgm4Parm6Group(char[] value) {
      pgm4Parm6Group.setString(value); 
   }   
    
     /**
	 * 	Update Pgm4Parm6Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPgm4Parm6Group(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm6Group.begin,pgm4Parm6Group.length());
   }
   
     /**
	 * 	Update Pgm4Parm6Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgm4Parm6Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm6Group.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Pgm4Parm6Group with another Field
	 *	@param value
	 */
   public void setPgm4Parm6Group(Field source) {
   	replace(source,0,source.length(),pgm4Parm6Group.begin,pgm4Parm6Group.length());
   }  
   
     /**
	 * 	Update Pgm4Parm6Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPgm4Parm6Group(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm6Group.begin,pgm4Parm6Group.length());
   }
   
     /**
	 * 	Update Pgm4Parm6Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgm4Parm6Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgm4Parm6Group.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getPgm4CallParmFieldLength() {
			return PGM_4_CALL_PARM_LENGTH;
		}

}
  
