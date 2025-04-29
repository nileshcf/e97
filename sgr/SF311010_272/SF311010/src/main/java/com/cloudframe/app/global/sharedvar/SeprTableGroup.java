package com.cloudframe.app.global.sharedvar;

/**
*  The class SeprTableGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_seprTableGroup")

public class SeprTableGroup extends SeprTableGroupSerialized  implements InitializingBean {
   

						private char[] seprTable = Field.fillLowValue(600);
					private SeprTableRedefined seprTableRedefined = new SeprTableRedefined();
	
	/**
	* Constructor for SeprTableGroup
	**/
    public SeprTableGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			seprTableRedefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of seprTable
	 *	@return seprTable
	 */
   public char[] getSeprTable() throws CFException{
     if (isSeprTableModified()) { 
        seprTable = refreshSeprTable();
     }
   		return seprTable;
   }

  
	/**
	*  set variable seprTable
	*  Corresponding COBOL Variable is SEPR-TABLE
	*  @param value
	**/
   public void setSeprTable(char[] value) {
      seprTable = checkSeprTableConstraints(value);
      serializeSeprTable(seprTable);
   } 

     /**
	 * 	Update SeprTable 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSeprTable(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSeprTable,seprTable.length);
   	
   }
   
   public void setSeprTable(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSeprTable,seprTable.length);
   	
   }
   
     /**
	 * 	Update SeprTable 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSeprTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSeprTable+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SeprTable with another Field
	 *	@param value
	 */
   public void setSeprTable(Field source) {
       replace(source,0,source.length(),beginSeprTable,SEPR_TABLE_LEN);
   	
   }  
   
     /**
	 * 	Update SeprTable 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSeprTable(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSeprTable,SEPR_TABLE_LEN);
   	
   }
   
     /**
	 * 	Update SeprTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSeprTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSeprTable+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of seprTableRedefined
	 *	@return seprTableRedefined
	 */   
	 public SeprTableRedefined getSeprTableRedefined() {
   	return seprTableRedefined;
   }
   /**
	* 	Update SeprTableRedefined with the passed value
	*   Corresponding COBOL Variable is SEPR-TABLE-REDEFINED
	*	@param value
	*/
   public void setSeprTableRedefined(char[] value) {
      seprTableRedefined.setString(value); 
   }   
    
     /**
	 * 	Update SeprTableRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSeprTableRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,seprTableRedefined.begin,seprTableRedefined.length());
   }
   
     /**
	 * 	Update SeprTableRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSeprTableRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,seprTableRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SeprTableRedefined with another Field
	 *	@param value
	 */
   public void setSeprTableRedefined(Field source) {
   	replace(source,0,source.length(),seprTableRedefined.begin,seprTableRedefined.length());
   }  
   
     /**
	 * 	Update SeprTableRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSeprTableRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,seprTableRedefined.begin,seprTableRedefined.length());
   }
   
     /**
	 * 	Update SeprTableRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSeprTableRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,seprTableRedefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSeprTableGroupFieldLength() {
			return SEPR_TABLE_GROUP_LENGTH;
		}

}
  
