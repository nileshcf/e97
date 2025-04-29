package com.cloudframe.app.global.sharedvar;

/**
*  The class Tab204KeyFoundGroup100 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_tab204KeyFoundGroup100")

public class Tab204KeyFoundGroup100 extends Tab204KeyFoundGroup100Serialized  implements InitializingBean {
   

						private char[] tab204KeyFound100 = Field.fillLowValue(1);
	
	/**
	* Constructor for Tab204KeyFoundGroup100
	**/
    public Tab204KeyFoundGroup100() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of tab204KeyFound100
	 *	@return tab204KeyFound100
	 */
   public char[] getTab204KeyFound100() throws CFException{
     if (isTab204KeyFound100Modified()) { 
        tab204KeyFound100 = refreshTab204KeyFound100();
     }
   		return tab204KeyFound100;
   }

  
	/**
	*  set variable tab204KeyFound100
	*  Corresponding COBOL Variable is 100-TAB204-KEY-FOUND
	*  @param value
	**/
   public void setTab204KeyFound100(char[] value) {
      tab204KeyFound100 = checkTab204KeyFound100Constraints(value);
      serializeTab204KeyFound100(tab204KeyFound100);
   } 

     /**
	 * 	Update Tab204KeyFound100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTab204KeyFound100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTab204KeyFound100,tab204KeyFound100.length);
   	
   }
   
   public void setTab204KeyFound100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTab204KeyFound100,tab204KeyFound100.length);
   	
   }
   
     /**
	 * 	Update Tab204KeyFound100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTab204KeyFound100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTab204KeyFound100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tab204KeyFound100 with another Field
	 *	@param value
	 */
   public void setTab204KeyFound100(Field source) {
       replace(source,0,source.length(),beginTab204KeyFound100,TAB_204_KEY_FOUND_100_LEN);
   	
   }  
   
     /**
	 * 	Update Tab204KeyFound100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTab204KeyFound100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTab204KeyFound100,TAB_204_KEY_FOUND_100_LEN);
   	
   }
   
     /**
	 * 	Update Tab204KeyFound100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTab204KeyFound100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTab204KeyFound100+targetIndex,targetLen);
    
   }
	char[] entryFoundN8810020488Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isEntryFoundN88100204()
	 *	@return  Returns true if isEntryFoundN88100204() is "N"
	 */
   public boolean isEntryFoundN88100204() throws CFException {
      return (  compareChars( getTab204KeyFound100() , entryFoundN8810020488Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setEntryFoundN88100204True() {  			
    	setTab204KeyFound100( entryFoundN8810020488Value);
   	}
	char[] entryFoundY8810020488Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEntryFoundY88100204()
	 *	@return  Returns true if isEntryFoundY88100204() is "Y"
	 */
   public boolean isEntryFoundY88100204() throws CFException {
      return (  compareChars( getTab204KeyFound100() , entryFoundY8810020488Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEntryFoundY88100204True() {  			
    	setTab204KeyFound100( entryFoundY8810020488Value);
   	}

	
	
	

		public static int getTab204KeyFoundGroup100FieldLength() {
			return TAB_204_KEY_FOUND_GROUP_100_LENGTH;
		}

}
  
