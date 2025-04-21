package com.cloudframe.app.move0.dto;

/**
*  The class Rl7abTableInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class Rl7abTableInit extends Rl7abTableInitSerialized {
   











				private Rl7abTableInfo rl7abTableInfo = new Rl7abTableInfo();
	
	/**
	* Constructor for Rl7abTableInit
	**/
    public Rl7abTableInit() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			rl7abTableInfo.setParent(this,getStartOffset() + 128);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 0
             ,4
             );
       replace( // serialize and save the value
             getPackedString(0L,5,0,false)
             , 4
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(40)
             , getStartOffset() + 9
             ,40
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 49
             ,1
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 50
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 54
             ,2
             );
       replace( // serialize and save the value
             getPackedString(BigDecimal.ZERO,11,11,false)
             , 56
             ,11
             );
       replaceValue( // serialize and save the value
             fillSpace(15)
             , getStartOffset() + 67
             ,15
             );
       replace( // serialize and save the value
             getPackedString(BigDecimal.ZERO,11,11,false)
             , 82
             ,11
             );
       replaceValue( // serialize and save the value
             fillSpace(15)
             , getStartOffset() + 93
             ,15
             );
       replaceValue( // serialize and save the value
             fillSpace(20)
             , getStartOffset() + 108
             ,20
             );
    }


 

	/**
	 *	Returns the value of rl7abTableInfo
	 *	@return rl7abTableInfo
	 */   
	 public Rl7abTableInfo getRl7abTableInfo() {
   	return rl7abTableInfo;
   }
   /**
	* 	Update Rl7abTableInfo with the passed value
	*   Corresponding COBOL Variable is WS-RL7AB-TABLE-INFO
	*	@param value
	*/
   public void setRl7abTableInfo(char[] value) {
      rl7abTableInfo.setString(value); 
   }   
    
     /**
	 * 	Update Rl7abTableInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRl7abTableInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rl7abTableInfo.begin,rl7abTableInfo.length());
   }
   
     /**
	 * 	Update Rl7abTableInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRl7abTableInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rl7abTableInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Rl7abTableInfo with another Field
	 *	@param value
	 */
   public void setRl7abTableInfo(Field source) {
   	replace(source,0,source.length(),rl7abTableInfo.begin,rl7abTableInfo.length());
   }  
   
     /**
	 * 	Update Rl7abTableInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRl7abTableInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rl7abTableInfo.begin,rl7abTableInfo.length());
   }
   
     /**
	 * 	Update Rl7abTableInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRl7abTableInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rl7abTableInfo.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getRl7abTableInitFieldLength() {
			return RL_7AB_TABLE_INIT_LENGTH;
		}

}
  
