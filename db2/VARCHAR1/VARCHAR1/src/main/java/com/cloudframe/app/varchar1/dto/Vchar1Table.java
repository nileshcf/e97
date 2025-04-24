package com.cloudframe.app.varchar1.dto;

/**
*  The class Vchar1Table is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:41. using version 5.0.0.254
**/


import com.cloudframe.app.varchar1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Vchar1Table extends Vchar1TableSerialized { 
   

								private short vchar1Id;
				private Vchar1FirstName vchar1FirstName = new Vchar1FirstName();

						private char[] vchar1LastName = Field.fillLowValue(15);
				private Vchar1NickName vchar1NickName = new Vchar1NickName();
	
	/**
	* Constructor for Vchar1Table
	**/
    public Vchar1Table() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			vchar1FirstName.setParent(this,getStartOffset() + 2);
	       			vchar1NickName.setParent(this,getStartOffset() + 34);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of vchar1Id
	 *	@return vchar1Id
	 */
	public short getVchar1Id() throws CFException {
        if (isVchar1IdModified()) { 
           vchar1Id = refreshVchar1Id();
        }
   		return vchar1Id;
	}
	
	/**
	 * 	Update Vchar1Id with the passed value
	 *  Corresponding COBOL Variable is VCHAR1-ID
	 *	@param number
	 */
	public void setVchar1Id(short number) {
	     // Truncate if the number is beyond +/- Max range
	    vchar1Id = checkVchar1IdMaxLimit(number); 
		serializeVchar1Id(vchar1Id);
	}

	public void setVchar1Id(int number) {
	    number = checkVchar1IdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setVchar1Id((short)number);
	}
	public void setVchar1Id(long number) {
	    number = checkVchar1IdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setVchar1Id((short)number);
	}
	

	/**
	 *	Returns the value of vchar1FirstName
	 *	@return vchar1FirstName
	 */   
	 public Vchar1FirstName getVchar1FirstName() {
   	return vchar1FirstName;
   }
   /**
	* 	Update Vchar1FirstName with the passed value
	*   Corresponding COBOL Variable is VCHAR1-FIRST-NAME
	*	@param value
	*/
   public void setVchar1FirstName(char[] value) {
      vchar1FirstName.setString(value); 
   }   
    
     /**
	 * 	Update Vchar1FirstName 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setVchar1FirstName(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,vchar1FirstName.begin,vchar1FirstName.length());
   }
   
     /**
	 * 	Update Vchar1FirstName 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVchar1FirstName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,vchar1FirstName.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Vchar1FirstName with another Field
	 *	@param value
	 */
   public void setVchar1FirstName(Field source) {
   	replace(source,0,source.length(),vchar1FirstName.begin,vchar1FirstName.length());
   }  
   
     /**
	 * 	Update Vchar1FirstName 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setVchar1FirstName(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,vchar1FirstName.begin,vchar1FirstName.length());
   }
   
     /**
	 * 	Update Vchar1FirstName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVchar1FirstName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,vchar1FirstName.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of vchar1LastName
	 *	@return vchar1LastName
	 */
   public char[] getVchar1LastName() throws CFException{
     if (isVchar1LastNameModified()) { 
        vchar1LastName = refreshVchar1LastName();
     }
   		return vchar1LastName;
   }

  
	/**
	*  set variable vchar1LastName
	*  Corresponding COBOL Variable is VCHAR1-LAST-NAME
	*  @param value
	**/
   public void setVchar1LastName(char[] value) {
      vchar1LastName = checkVchar1LastNameConstraints(value);
      serializeVchar1LastName(vchar1LastName);
   } 

     /**
	 * 	Update Vchar1LastName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVchar1LastName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVchar1LastName,vchar1LastName.length);
   	
   }
   
   public void setVchar1LastName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVchar1LastName,vchar1LastName.length);
   	
   }
   
     /**
	 * 	Update Vchar1LastName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVchar1LastName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVchar1LastName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Vchar1LastName with another Field
	 *	@param value
	 */
   public void setVchar1LastName(Field source) {
       replace(source,0,source.length(),beginVchar1LastName,VCHAR_1_LAST_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Vchar1LastName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVchar1LastName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVchar1LastName,VCHAR_1_LAST_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Vchar1LastName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVchar1LastName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVchar1LastName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of vchar1NickName
	 *	@return vchar1NickName
	 */   
	 public Vchar1NickName getVchar1NickName() {
   	return vchar1NickName;
   }
   /**
	* 	Update Vchar1NickName with the passed value
	*   Corresponding COBOL Variable is VCHAR1-NICK-NAME
	*	@param value
	*/
   public void setVchar1NickName(char[] value) {
      vchar1NickName.setString(value); 
   }   
    
     /**
	 * 	Update Vchar1NickName 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setVchar1NickName(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,vchar1NickName.begin,vchar1NickName.length());
   }
   
     /**
	 * 	Update Vchar1NickName 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVchar1NickName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,vchar1NickName.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Vchar1NickName with another Field
	 *	@param value
	 */
   public void setVchar1NickName(Field source) {
   	replace(source,0,source.length(),vchar1NickName.begin,vchar1NickName.length());
   }  
   
     /**
	 * 	Update Vchar1NickName 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setVchar1NickName(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,vchar1NickName.begin,vchar1NickName.length());
   }
   
     /**
	 * 	Update Vchar1NickName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVchar1NickName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,vchar1NickName.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getVchar1TableFieldLength() {
			return VCHAR_1_TABLE_LENGTH;
		}

}
  
