package com.cloudframe.app.ar640010.dto;

/**
*  The class GftdsnWorkAreas820 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class GftdsnWorkAreas820 extends GftdsnWorkAreas820Serialized {
   
				private GftdsnHlqid820 gftdsnHlqid820 = new GftdsnHlqid820();
				private GftdsnBuild820 gftdsnBuild820 = new GftdsnBuild820();
				private GftdsnBuild820Redefined gftdsnBuild820Redefined = new GftdsnBuild820Redefined();
	
	/**
	* Constructor for GftdsnWorkAreas820
	**/
    public GftdsnWorkAreas820() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			gftdsnHlqid820.setParent(this,getStartOffset() + 0);
	       			gftdsnBuild820.setParent(this,getStartOffset() + 4);
	       			gftdsnBuild820Redefined.setParent(this,getStartOffset() + 4);
	   	/*  end of offset */
								gftdsnHlqid820.setString(fillSpace(4));
    }


 

	/**
	 *	Returns the value of gftdsnHlqid820
	 *	@return gftdsnHlqid820
	 */   
	 public GftdsnHlqid820 getGftdsnHlqid820() {
   	return gftdsnHlqid820;
   }
   /**
	* 	Update GftdsnHlqid820 with the passed value
	*   Corresponding COBOL Variable is 820-GFTDSN-HLQID
	*	@param value
	*/
   public void setGftdsnHlqid820(char[] value) {
      gftdsnHlqid820.setString(value); 
   }   
    
     /**
	 * 	Update GftdsnHlqid820 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setGftdsnHlqid820(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,gftdsnHlqid820.begin,gftdsnHlqid820.length());
   }
   
     /**
	 * 	Update GftdsnHlqid820 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnHlqid820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,gftdsnHlqid820.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update GftdsnHlqid820 with another Field
	 *	@param value
	 */
   public void setGftdsnHlqid820(Field source) {
   	replace(source,0,source.length(),gftdsnHlqid820.begin,gftdsnHlqid820.length());
   }  
   
     /**
	 * 	Update GftdsnHlqid820 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setGftdsnHlqid820(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,gftdsnHlqid820.begin,gftdsnHlqid820.length());
   }
   
     /**
	 * 	Update GftdsnHlqid820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnHlqid820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,gftdsnHlqid820.begin+targetIndex,targetLen);
   }
	char[] gftdsnHlqidTest8882088Value = "TEST".toCharArray();
	/**
	 *	Test condition "TEST" for isGftdsnHlqidTest88820()
	 *	@return  Returns true if isGftdsnHlqidTest88820() is "TEST"
	 */
   public boolean isGftdsnHlqidTest88820() throws CFException {
      return (  compareChars( getGftdsnHlqid820().toCharArray() , gftdsnHlqidTest8882088Value)  == 0  );
   }


	/**
	*  set values "TEST"
	*/
   	public void setGftdsnHlqidTest88820True() {  			
    	setString(gftdsnHlqidTest8882088Value);
   	}
	/**
	 *	Returns the value of gftdsnBuild820
	 *	@return gftdsnBuild820
	 */   
	 public GftdsnBuild820 getGftdsnBuild820() {
   	return gftdsnBuild820;
   }
   /**
	* 	Update GftdsnBuild820 with the passed value
	*   Corresponding COBOL Variable is 820-GFTDSN-BUILD
	*	@param value
	*/
   public void setGftdsnBuild820(char[] value) {
      gftdsnBuild820.setString(value); 
   }   
    
     /**
	 * 	Update GftdsnBuild820 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setGftdsnBuild820(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,gftdsnBuild820.begin,gftdsnBuild820.length());
   }
   
     /**
	 * 	Update GftdsnBuild820 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnBuild820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,gftdsnBuild820.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update GftdsnBuild820 with another Field
	 *	@param value
	 */
   public void setGftdsnBuild820(Field source) {
   	replace(source,0,source.length(),gftdsnBuild820.begin,gftdsnBuild820.length());
   }  
   
     /**
	 * 	Update GftdsnBuild820 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setGftdsnBuild820(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,gftdsnBuild820.begin,gftdsnBuild820.length());
   }
   
     /**
	 * 	Update GftdsnBuild820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnBuild820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,gftdsnBuild820.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of gftdsnBuild820Redefined
	 *	@return gftdsnBuild820Redefined
	 */   
	 public GftdsnBuild820Redefined getGftdsnBuild820Redefined() {
   	return gftdsnBuild820Redefined;
   }
   /**
	* 	Update GftdsnBuild820Redefined with the passed value
	*   Corresponding COBOL Variable is 820-GFTDSN-BUILD-REDEFINED
	*	@param value
	*/
   public void setGftdsnBuild820Redefined(char[] value) {
      gftdsnBuild820Redefined.setString(value); 
   }   
    
     /**
	 * 	Update GftdsnBuild820Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setGftdsnBuild820Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,gftdsnBuild820Redefined.begin,gftdsnBuild820Redefined.length());
   }
   
     /**
	 * 	Update GftdsnBuild820Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnBuild820Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,gftdsnBuild820Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update GftdsnBuild820Redefined with another Field
	 *	@param value
	 */
   public void setGftdsnBuild820Redefined(Field source) {
   	replace(source,0,source.length(),gftdsnBuild820Redefined.begin,gftdsnBuild820Redefined.length());
   }  
   
     /**
	 * 	Update GftdsnBuild820Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setGftdsnBuild820Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,gftdsnBuild820Redefined.begin,gftdsnBuild820Redefined.length());
   }
   
     /**
	 * 	Update GftdsnBuild820Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnBuild820Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,gftdsnBuild820Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getGftdsnWorkAreas820FieldLength() {
			return GFTDSN_WORK_AREAS_820_LENGTH;
		}

}
  
