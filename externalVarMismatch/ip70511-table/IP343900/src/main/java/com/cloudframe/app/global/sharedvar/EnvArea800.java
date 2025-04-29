package com.cloudframe.app.global.sharedvar;

/**
*  The class EnvArea800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_envArea800")

public class EnvArea800 extends EnvArea800Serialized  implements InitializingBean {
   

						private char[] environmentInd800 = Field.fillLowValue(3);

						private char[] filler800 = Field.fillLowValue(77);
	
	/**
	* Constructor for EnvArea800
	**/
    public EnvArea800() {
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
	 *	Returns the value of environmentInd800
	 *	@return environmentInd800
	 */
   public char[] getEnvironmentInd800() throws CFException{
     if (isEnvironmentInd800Modified()) { 
        environmentInd800 = refreshEnvironmentInd800();
     }
   		return environmentInd800;
   }

  
	/**
	*  set variable environmentInd800
	*  Corresponding COBOL Variable is 800-ENVIRONMENT-IND
	*  @param value
	**/
   public void setEnvironmentInd800(char[] value) {
      environmentInd800 = checkEnvironmentInd800Constraints(value);
      serializeEnvironmentInd800(environmentInd800);
   } 

     /**
	 * 	Update EnvironmentInd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEnvironmentInd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEnvironmentInd800,environmentInd800.length);
   	
   }
   
   public void setEnvironmentInd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEnvironmentInd800,environmentInd800.length);
   	
   }
   
     /**
	 * 	Update EnvironmentInd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEnvironmentInd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEnvironmentInd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EnvironmentInd800 with another Field
	 *	@param value
	 */
   public void setEnvironmentInd800(Field source) {
       replace(source,0,source.length(),beginEnvironmentInd800,ENVIRONMENT_IND_800_LEN);
   	
   }  
   
     /**
	 * 	Update EnvironmentInd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEnvironmentInd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEnvironmentInd800,ENVIRONMENT_IND_800_LEN);
   	
   }
   
     /**
	 * 	Update EnvironmentInd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEnvironmentInd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEnvironmentInd800+targetIndex,targetLen);
    
   }
	char[] itIsTestEnv8880088Value = "TST".toCharArray();
	/**
	 *	Test condition "TST" for isItIsTestEnv88800()
	 *	@return  Returns true if isItIsTestEnv88800() is "TST"
	 */
   public boolean isItIsTestEnv88800() throws CFException {
      return (  compareChars( getEnvironmentInd800() , itIsTestEnv8880088Value)  == 0  );
   }


	/**
	*  set values "TST"
	*/
   	public void setItIsTestEnv88800True() {  			
    	setEnvironmentInd800( itIsTestEnv8880088Value);
   	}
	static java.util.Set<String> envIndValid8880088Value = new java.util.HashSet<>();
static { 
	envIndValid8880088Value.add( "TST");
	envIndValid8880088Value.add( "PRD");
	envIndValid8880088Value.add( "DTF");
	envIndValid8880088Value.add( "ITF");
	envIndValid8880088Value.add( "MTF");
	envIndValid8880088Value.add( "YTF");
	envIndValid8880088Value.add( "MCI");
	envIndValid8880088Value.add( "FTF");
} 

	/**
	 *	Test condition "TST" "PRD" "DTF" "ITF" "MTF" "YTF" "MCI" "FTF" for isEnvIndValid88800()
	 *	@return  Returns true if isEnvIndValid88800() is "TST" "PRD" "DTF" "ITF" "MTF" "YTF" "MCI" "FTF"
	 */
   public boolean isEnvIndValid88800() throws CFException {
      return   envIndValid8880088Value.contains(String.valueOf(getEnvironmentInd800()));
   }


	/**
	*  set values "TST" "PRD" "DTF" "ITF" "MTF" "YTF" "MCI" "FTF"
	*/
   	public void setEnvIndValid88800True() {  			
    	  setEnvironmentInd800(envIndValid8880088Value.iterator().next().toCharArray());
   	}
	/**
	 *	Returns the value of filler800
	 *	@return filler800
	 */
   public char[] getFiller800() throws CFException{
     if (isFiller800Modified()) { 
        filler800 = refreshFiller800();
     }
   		return filler800;
   }

  
	/**
	*  set variable filler800
	*  Corresponding COBOL Variable is 800-FILLER
	*  @param value
	**/
   public void setFiller800(char[] value) {
      filler800 = checkFiller800Constraints(value);
      serializeFiller800(filler800);
   } 

     /**
	 * 	Update Filler800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller800,filler800.length);
   	
   }
   
   public void setFiller800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller800,filler800.length);
   	
   }
   
     /**
	 * 	Update Filler800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler800 with another Field
	 *	@param value
	 */
   public void setFiller800(Field source) {
       replace(source,0,source.length(),beginFiller800,FILLER_800_LEN);
   	
   }  
   
     /**
	 * 	Update Filler800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller800,FILLER_800_LEN);
   	
   }
   
     /**
	 * 	Update Filler800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller800+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes EnvArea800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setEnvironmentInd800(CONSTANTS.SPACE_3);
         setFiller800(CONSTANTS.SPACE_77);
   }

		public static int getEnvArea800FieldLength() {
			return ENV_AREA_800_LENGTH;
		}

}
  
