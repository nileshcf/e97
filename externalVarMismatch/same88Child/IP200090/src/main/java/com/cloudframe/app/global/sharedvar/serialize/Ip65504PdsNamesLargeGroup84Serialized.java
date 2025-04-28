package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup84Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup84Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup84Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_84_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2574S;
            protected  int beginIp65504P2574L;
            protected  int beginIp65504P2575S;
            protected  int beginIp65504P2575L;
            protected  int beginIp65504P2576S;
            protected  int beginIp65504P2576L;
            protected  int beginIp65504P2577S;
            protected  int beginIp65504P2577L;
            protected  int beginIp65504P2578S;
            protected  int beginIp65504P2578L;
            protected  int beginIp65504P2579S;
            protected  int beginIp65504P2579L;
            protected  int beginIp65504P2580S;
            protected  int beginIp65504P2580L;
            protected  int beginIp65504P2581S;
            protected  int beginIp65504P2581L;
            protected  int beginIp65504P2582S;
            protected  int beginIp65504P2582L;
            protected  int beginIp65504P2583S;
            protected  int beginIp65504P2583L;
            protected  int beginIp65504P2584S;
            protected  int beginIp65504P2584L;
            protected  int beginIp65504P2585S;
            protected  int beginIp65504P2585L;
            protected  int beginIp65504P2586S;
            protected  int beginIp65504P2586L;
            protected  int beginIp65504P2587S;
            protected  int beginIp65504P2587L;
            protected  int beginIp65504P2588S;
            protected  int beginIp65504P2588L;
            protected  int beginIp65504P2589S;
            protected  int beginIp65504P2589L;
            protected  int beginIp65504P2590S;
            protected  int beginIp65504P2590L;
            protected  int beginIp65504P2591S;
            protected  int beginIp65504P2591L;
            protected  int beginIp65504P2592S;
            protected  int beginIp65504P2592L;
            protected  int beginIp65504P2593S;
            protected  int beginIp65504P2593L;
            protected  int beginIp65504P2594S;
            protected  int beginIp65504P2594L;
            protected  int beginIp65504P2595S;
            protected  int beginIp65504P2595L;
            protected  int beginIp65504P2596S;
            protected  int beginIp65504P2596L;
            protected  int beginIp65504P2597S;
            protected  int beginIp65504P2597L;
            protected  int beginIp65504P2598S;
            protected  int beginIp65504P2598L;
            protected  int beginIp65504P2599S;
            protected  int beginIp65504P2599L;
            protected  int beginIp65504P2600S;
            protected  int beginIp65504P2600L;
            protected  int beginIp65504P2601S;
            protected  int beginIp65504P2601L;
            protected  int beginIp65504P2602S;
            protected  int beginIp65504P2602L;
            protected  int beginIp65504P2603S;
            protected  int beginIp65504P2603L;
            protected  int beginIp65504P2604S;
            protected  int beginIp65504P2604L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup84Serialized
	**/
    public Ip65504PdsNamesLargeGroup84Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup84Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup84Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup84Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,20580); // serialize this field at offset 20580 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup84Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 20580 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup84Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_84_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2574S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2574L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2575S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2575L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2576S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2576L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2577S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2577L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2578S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2578L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2579S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2579L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2580S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2580L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2581S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2581L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2582S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2582L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2583S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2583L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2584S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2584L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2585S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2585L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2586S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2586L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2587S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2587L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2588S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2588L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2589S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2589L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2590S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2590L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2591S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2591L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2592S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2592L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2593S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2593L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2594S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2594L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2595S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2595L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2596S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2596L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2597S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2597L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2598S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2598L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2599S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2599L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2600S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2600L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2601S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2601L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2602S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2602L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2603S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2603L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2604S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2604L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2574SCounter = -1;
         public boolean isIp65504P2574SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2574SCounter != sharedCounter;
            localIp65504P2574SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2574_S_LEN = 2;
  	/**
	 * serializeIp65504P2574S
	 */
	protected void serializeIp65504P2574S(short ip65504P2574S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2574S,IP_65504_P_2574_S_LEN)
                  ,beginIp65504P2574S
                  ,IP_65504_P_2574_S_LEN
                 );
            localIp65504P2574SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2574SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2574S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2574S() {	 
			return (getShort(beginIp65504P2574S));
   	}
         int localIp65504P2574LCounter = -1;
         public boolean isIp65504P2574LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2574LCounter != sharedCounter;
            localIp65504P2574LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2574_L_LEN = 2;
  	/**
	 * serializeIp65504P2574L
	 */
	protected void serializeIp65504P2574L(short ip65504P2574L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2574L,IP_65504_P_2574_L_LEN)
                  ,beginIp65504P2574L
                  ,IP_65504_P_2574_L_LEN
                 );
            localIp65504P2574LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2574LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2574L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2574L() {	 
			return (getShort(beginIp65504P2574L));
   	}
         int localIp65504P2575SCounter = -1;
         public boolean isIp65504P2575SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2575SCounter != sharedCounter;
            localIp65504P2575SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2575_S_LEN = 2;
  	/**
	 * serializeIp65504P2575S
	 */
	protected void serializeIp65504P2575S(short ip65504P2575S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2575S,IP_65504_P_2575_S_LEN)
                  ,beginIp65504P2575S
                  ,IP_65504_P_2575_S_LEN
                 );
            localIp65504P2575SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2575SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2575S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2575S() {	 
			return (getShort(beginIp65504P2575S));
   	}
         int localIp65504P2575LCounter = -1;
         public boolean isIp65504P2575LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2575LCounter != sharedCounter;
            localIp65504P2575LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2575_L_LEN = 2;
  	/**
	 * serializeIp65504P2575L
	 */
	protected void serializeIp65504P2575L(short ip65504P2575L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2575L,IP_65504_P_2575_L_LEN)
                  ,beginIp65504P2575L
                  ,IP_65504_P_2575_L_LEN
                 );
            localIp65504P2575LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2575LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2575L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2575L() {	 
			return (getShort(beginIp65504P2575L));
   	}
         int localIp65504P2576SCounter = -1;
         public boolean isIp65504P2576SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2576SCounter != sharedCounter;
            localIp65504P2576SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2576_S_LEN = 2;
  	/**
	 * serializeIp65504P2576S
	 */
	protected void serializeIp65504P2576S(short ip65504P2576S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2576S,IP_65504_P_2576_S_LEN)
                  ,beginIp65504P2576S
                  ,IP_65504_P_2576_S_LEN
                 );
            localIp65504P2576SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2576SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2576S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2576S() {	 
			return (getShort(beginIp65504P2576S));
   	}
         int localIp65504P2576LCounter = -1;
         public boolean isIp65504P2576LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2576LCounter != sharedCounter;
            localIp65504P2576LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2576_L_LEN = 2;
  	/**
	 * serializeIp65504P2576L
	 */
	protected void serializeIp65504P2576L(short ip65504P2576L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2576L,IP_65504_P_2576_L_LEN)
                  ,beginIp65504P2576L
                  ,IP_65504_P_2576_L_LEN
                 );
            localIp65504P2576LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2576LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2576L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2576L() {	 
			return (getShort(beginIp65504P2576L));
   	}
         int localIp65504P2577SCounter = -1;
         public boolean isIp65504P2577SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2577SCounter != sharedCounter;
            localIp65504P2577SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2577_S_LEN = 2;
  	/**
	 * serializeIp65504P2577S
	 */
	protected void serializeIp65504P2577S(short ip65504P2577S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2577S,IP_65504_P_2577_S_LEN)
                  ,beginIp65504P2577S
                  ,IP_65504_P_2577_S_LEN
                 );
            localIp65504P2577SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2577SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2577S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2577S() {	 
			return (getShort(beginIp65504P2577S));
   	}
         int localIp65504P2577LCounter = -1;
         public boolean isIp65504P2577LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2577LCounter != sharedCounter;
            localIp65504P2577LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2577_L_LEN = 2;
  	/**
	 * serializeIp65504P2577L
	 */
	protected void serializeIp65504P2577L(short ip65504P2577L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2577L,IP_65504_P_2577_L_LEN)
                  ,beginIp65504P2577L
                  ,IP_65504_P_2577_L_LEN
                 );
            localIp65504P2577LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2577LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2577L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2577L() {	 
			return (getShort(beginIp65504P2577L));
   	}
         int localIp65504P2578SCounter = -1;
         public boolean isIp65504P2578SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2578SCounter != sharedCounter;
            localIp65504P2578SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2578_S_LEN = 2;
  	/**
	 * serializeIp65504P2578S
	 */
	protected void serializeIp65504P2578S(short ip65504P2578S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2578S,IP_65504_P_2578_S_LEN)
                  ,beginIp65504P2578S
                  ,IP_65504_P_2578_S_LEN
                 );
            localIp65504P2578SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2578SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2578S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2578S() {	 
			return (getShort(beginIp65504P2578S));
   	}
         int localIp65504P2578LCounter = -1;
         public boolean isIp65504P2578LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2578LCounter != sharedCounter;
            localIp65504P2578LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2578_L_LEN = 2;
  	/**
	 * serializeIp65504P2578L
	 */
	protected void serializeIp65504P2578L(short ip65504P2578L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2578L,IP_65504_P_2578_L_LEN)
                  ,beginIp65504P2578L
                  ,IP_65504_P_2578_L_LEN
                 );
            localIp65504P2578LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2578LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2578L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2578L() {	 
			return (getShort(beginIp65504P2578L));
   	}
         int localIp65504P2579SCounter = -1;
         public boolean isIp65504P2579SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2579SCounter != sharedCounter;
            localIp65504P2579SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2579_S_LEN = 2;
  	/**
	 * serializeIp65504P2579S
	 */
	protected void serializeIp65504P2579S(short ip65504P2579S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2579S,IP_65504_P_2579_S_LEN)
                  ,beginIp65504P2579S
                  ,IP_65504_P_2579_S_LEN
                 );
            localIp65504P2579SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2579SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2579S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2579S() {	 
			return (getShort(beginIp65504P2579S));
   	}
         int localIp65504P2579LCounter = -1;
         public boolean isIp65504P2579LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2579LCounter != sharedCounter;
            localIp65504P2579LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2579_L_LEN = 2;
  	/**
	 * serializeIp65504P2579L
	 */
	protected void serializeIp65504P2579L(short ip65504P2579L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2579L,IP_65504_P_2579_L_LEN)
                  ,beginIp65504P2579L
                  ,IP_65504_P_2579_L_LEN
                 );
            localIp65504P2579LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2579LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2579L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2579L() {	 
			return (getShort(beginIp65504P2579L));
   	}
         int localIp65504P2580SCounter = -1;
         public boolean isIp65504P2580SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2580SCounter != sharedCounter;
            localIp65504P2580SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2580_S_LEN = 2;
  	/**
	 * serializeIp65504P2580S
	 */
	protected void serializeIp65504P2580S(short ip65504P2580S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2580S,IP_65504_P_2580_S_LEN)
                  ,beginIp65504P2580S
                  ,IP_65504_P_2580_S_LEN
                 );
            localIp65504P2580SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2580SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2580S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2580S() {	 
			return (getShort(beginIp65504P2580S));
   	}
         int localIp65504P2580LCounter = -1;
         public boolean isIp65504P2580LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2580LCounter != sharedCounter;
            localIp65504P2580LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2580_L_LEN = 2;
  	/**
	 * serializeIp65504P2580L
	 */
	protected void serializeIp65504P2580L(short ip65504P2580L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2580L,IP_65504_P_2580_L_LEN)
                  ,beginIp65504P2580L
                  ,IP_65504_P_2580_L_LEN
                 );
            localIp65504P2580LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2580LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2580L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2580L() {	 
			return (getShort(beginIp65504P2580L));
   	}
         int localIp65504P2581SCounter = -1;
         public boolean isIp65504P2581SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2581SCounter != sharedCounter;
            localIp65504P2581SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2581_S_LEN = 2;
  	/**
	 * serializeIp65504P2581S
	 */
	protected void serializeIp65504P2581S(short ip65504P2581S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2581S,IP_65504_P_2581_S_LEN)
                  ,beginIp65504P2581S
                  ,IP_65504_P_2581_S_LEN
                 );
            localIp65504P2581SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2581SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2581S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2581S() {	 
			return (getShort(beginIp65504P2581S));
   	}
         int localIp65504P2581LCounter = -1;
         public boolean isIp65504P2581LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2581LCounter != sharedCounter;
            localIp65504P2581LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2581_L_LEN = 2;
  	/**
	 * serializeIp65504P2581L
	 */
	protected void serializeIp65504P2581L(short ip65504P2581L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2581L,IP_65504_P_2581_L_LEN)
                  ,beginIp65504P2581L
                  ,IP_65504_P_2581_L_LEN
                 );
            localIp65504P2581LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2581LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2581L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2581L() {	 
			return (getShort(beginIp65504P2581L));
   	}
         int localIp65504P2582SCounter = -1;
         public boolean isIp65504P2582SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2582SCounter != sharedCounter;
            localIp65504P2582SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2582_S_LEN = 2;
  	/**
	 * serializeIp65504P2582S
	 */
	protected void serializeIp65504P2582S(short ip65504P2582S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2582S,IP_65504_P_2582_S_LEN)
                  ,beginIp65504P2582S
                  ,IP_65504_P_2582_S_LEN
                 );
            localIp65504P2582SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2582SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2582S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2582S() {	 
			return (getShort(beginIp65504P2582S));
   	}
         int localIp65504P2582LCounter = -1;
         public boolean isIp65504P2582LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2582LCounter != sharedCounter;
            localIp65504P2582LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2582_L_LEN = 2;
  	/**
	 * serializeIp65504P2582L
	 */
	protected void serializeIp65504P2582L(short ip65504P2582L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2582L,IP_65504_P_2582_L_LEN)
                  ,beginIp65504P2582L
                  ,IP_65504_P_2582_L_LEN
                 );
            localIp65504P2582LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2582LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2582L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2582L() {	 
			return (getShort(beginIp65504P2582L));
   	}
         int localIp65504P2583SCounter = -1;
         public boolean isIp65504P2583SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2583SCounter != sharedCounter;
            localIp65504P2583SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2583_S_LEN = 2;
  	/**
	 * serializeIp65504P2583S
	 */
	protected void serializeIp65504P2583S(short ip65504P2583S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2583S,IP_65504_P_2583_S_LEN)
                  ,beginIp65504P2583S
                  ,IP_65504_P_2583_S_LEN
                 );
            localIp65504P2583SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2583SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2583S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2583S() {	 
			return (getShort(beginIp65504P2583S));
   	}
         int localIp65504P2583LCounter = -1;
         public boolean isIp65504P2583LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2583LCounter != sharedCounter;
            localIp65504P2583LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2583_L_LEN = 2;
  	/**
	 * serializeIp65504P2583L
	 */
	protected void serializeIp65504P2583L(short ip65504P2583L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2583L,IP_65504_P_2583_L_LEN)
                  ,beginIp65504P2583L
                  ,IP_65504_P_2583_L_LEN
                 );
            localIp65504P2583LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2583LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2583L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2583L() {	 
			return (getShort(beginIp65504P2583L));
   	}
         int localIp65504P2584SCounter = -1;
         public boolean isIp65504P2584SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2584SCounter != sharedCounter;
            localIp65504P2584SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2584_S_LEN = 2;
  	/**
	 * serializeIp65504P2584S
	 */
	protected void serializeIp65504P2584S(short ip65504P2584S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2584S,IP_65504_P_2584_S_LEN)
                  ,beginIp65504P2584S
                  ,IP_65504_P_2584_S_LEN
                 );
            localIp65504P2584SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2584SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2584S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2584S() {	 
			return (getShort(beginIp65504P2584S));
   	}
         int localIp65504P2584LCounter = -1;
         public boolean isIp65504P2584LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2584LCounter != sharedCounter;
            localIp65504P2584LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2584_L_LEN = 2;
  	/**
	 * serializeIp65504P2584L
	 */
	protected void serializeIp65504P2584L(short ip65504P2584L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2584L,IP_65504_P_2584_L_LEN)
                  ,beginIp65504P2584L
                  ,IP_65504_P_2584_L_LEN
                 );
            localIp65504P2584LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2584LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2584L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2584L() {	 
			return (getShort(beginIp65504P2584L));
   	}
         int localIp65504P2585SCounter = -1;
         public boolean isIp65504P2585SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2585SCounter != sharedCounter;
            localIp65504P2585SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2585_S_LEN = 2;
  	/**
	 * serializeIp65504P2585S
	 */
	protected void serializeIp65504P2585S(short ip65504P2585S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2585S,IP_65504_P_2585_S_LEN)
                  ,beginIp65504P2585S
                  ,IP_65504_P_2585_S_LEN
                 );
            localIp65504P2585SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2585SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2585S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2585S() {	 
			return (getShort(beginIp65504P2585S));
   	}
         int localIp65504P2585LCounter = -1;
         public boolean isIp65504P2585LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2585LCounter != sharedCounter;
            localIp65504P2585LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2585_L_LEN = 2;
  	/**
	 * serializeIp65504P2585L
	 */
	protected void serializeIp65504P2585L(short ip65504P2585L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2585L,IP_65504_P_2585_L_LEN)
                  ,beginIp65504P2585L
                  ,IP_65504_P_2585_L_LEN
                 );
            localIp65504P2585LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2585LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2585L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2585L() {	 
			return (getShort(beginIp65504P2585L));
   	}
         int localIp65504P2586SCounter = -1;
         public boolean isIp65504P2586SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2586SCounter != sharedCounter;
            localIp65504P2586SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2586_S_LEN = 2;
  	/**
	 * serializeIp65504P2586S
	 */
	protected void serializeIp65504P2586S(short ip65504P2586S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2586S,IP_65504_P_2586_S_LEN)
                  ,beginIp65504P2586S
                  ,IP_65504_P_2586_S_LEN
                 );
            localIp65504P2586SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2586SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2586S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2586S() {	 
			return (getShort(beginIp65504P2586S));
   	}
         int localIp65504P2586LCounter = -1;
         public boolean isIp65504P2586LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2586LCounter != sharedCounter;
            localIp65504P2586LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2586_L_LEN = 2;
  	/**
	 * serializeIp65504P2586L
	 */
	protected void serializeIp65504P2586L(short ip65504P2586L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2586L,IP_65504_P_2586_L_LEN)
                  ,beginIp65504P2586L
                  ,IP_65504_P_2586_L_LEN
                 );
            localIp65504P2586LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2586LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2586L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2586L() {	 
			return (getShort(beginIp65504P2586L));
   	}
         int localIp65504P2587SCounter = -1;
         public boolean isIp65504P2587SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2587SCounter != sharedCounter;
            localIp65504P2587SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2587_S_LEN = 2;
  	/**
	 * serializeIp65504P2587S
	 */
	protected void serializeIp65504P2587S(short ip65504P2587S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2587S,IP_65504_P_2587_S_LEN)
                  ,beginIp65504P2587S
                  ,IP_65504_P_2587_S_LEN
                 );
            localIp65504P2587SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2587SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2587S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2587S() {	 
			return (getShort(beginIp65504P2587S));
   	}
         int localIp65504P2587LCounter = -1;
         public boolean isIp65504P2587LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2587LCounter != sharedCounter;
            localIp65504P2587LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2587_L_LEN = 2;
  	/**
	 * serializeIp65504P2587L
	 */
	protected void serializeIp65504P2587L(short ip65504P2587L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2587L,IP_65504_P_2587_L_LEN)
                  ,beginIp65504P2587L
                  ,IP_65504_P_2587_L_LEN
                 );
            localIp65504P2587LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2587LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2587L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2587L() {	 
			return (getShort(beginIp65504P2587L));
   	}
         int localIp65504P2588SCounter = -1;
         public boolean isIp65504P2588SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2588SCounter != sharedCounter;
            localIp65504P2588SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2588_S_LEN = 2;
  	/**
	 * serializeIp65504P2588S
	 */
	protected void serializeIp65504P2588S(short ip65504P2588S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2588S,IP_65504_P_2588_S_LEN)
                  ,beginIp65504P2588S
                  ,IP_65504_P_2588_S_LEN
                 );
            localIp65504P2588SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2588SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2588S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2588S() {	 
			return (getShort(beginIp65504P2588S));
   	}
         int localIp65504P2588LCounter = -1;
         public boolean isIp65504P2588LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2588LCounter != sharedCounter;
            localIp65504P2588LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2588_L_LEN = 2;
  	/**
	 * serializeIp65504P2588L
	 */
	protected void serializeIp65504P2588L(short ip65504P2588L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2588L,IP_65504_P_2588_L_LEN)
                  ,beginIp65504P2588L
                  ,IP_65504_P_2588_L_LEN
                 );
            localIp65504P2588LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2588LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2588L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2588L() {	 
			return (getShort(beginIp65504P2588L));
   	}
         int localIp65504P2589SCounter = -1;
         public boolean isIp65504P2589SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2589SCounter != sharedCounter;
            localIp65504P2589SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2589_S_LEN = 2;
  	/**
	 * serializeIp65504P2589S
	 */
	protected void serializeIp65504P2589S(short ip65504P2589S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2589S,IP_65504_P_2589_S_LEN)
                  ,beginIp65504P2589S
                  ,IP_65504_P_2589_S_LEN
                 );
            localIp65504P2589SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2589SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2589S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2589S() {	 
			return (getShort(beginIp65504P2589S));
   	}
         int localIp65504P2589LCounter = -1;
         public boolean isIp65504P2589LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2589LCounter != sharedCounter;
            localIp65504P2589LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2589_L_LEN = 2;
  	/**
	 * serializeIp65504P2589L
	 */
	protected void serializeIp65504P2589L(short ip65504P2589L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2589L,IP_65504_P_2589_L_LEN)
                  ,beginIp65504P2589L
                  ,IP_65504_P_2589_L_LEN
                 );
            localIp65504P2589LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2589LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2589L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2589L() {	 
			return (getShort(beginIp65504P2589L));
   	}
         int localIp65504P2590SCounter = -1;
         public boolean isIp65504P2590SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2590SCounter != sharedCounter;
            localIp65504P2590SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2590_S_LEN = 2;
  	/**
	 * serializeIp65504P2590S
	 */
	protected void serializeIp65504P2590S(short ip65504P2590S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2590S,IP_65504_P_2590_S_LEN)
                  ,beginIp65504P2590S
                  ,IP_65504_P_2590_S_LEN
                 );
            localIp65504P2590SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2590SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2590S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2590S() {	 
			return (getShort(beginIp65504P2590S));
   	}
         int localIp65504P2590LCounter = -1;
         public boolean isIp65504P2590LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2590LCounter != sharedCounter;
            localIp65504P2590LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2590_L_LEN = 2;
  	/**
	 * serializeIp65504P2590L
	 */
	protected void serializeIp65504P2590L(short ip65504P2590L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2590L,IP_65504_P_2590_L_LEN)
                  ,beginIp65504P2590L
                  ,IP_65504_P_2590_L_LEN
                 );
            localIp65504P2590LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2590LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2590L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2590L() {	 
			return (getShort(beginIp65504P2590L));
   	}
         int localIp65504P2591SCounter = -1;
         public boolean isIp65504P2591SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2591SCounter != sharedCounter;
            localIp65504P2591SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2591_S_LEN = 2;
  	/**
	 * serializeIp65504P2591S
	 */
	protected void serializeIp65504P2591S(short ip65504P2591S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2591S,IP_65504_P_2591_S_LEN)
                  ,beginIp65504P2591S
                  ,IP_65504_P_2591_S_LEN
                 );
            localIp65504P2591SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2591SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2591S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2591S() {	 
			return (getShort(beginIp65504P2591S));
   	}
         int localIp65504P2591LCounter = -1;
         public boolean isIp65504P2591LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2591LCounter != sharedCounter;
            localIp65504P2591LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2591_L_LEN = 2;
  	/**
	 * serializeIp65504P2591L
	 */
	protected void serializeIp65504P2591L(short ip65504P2591L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2591L,IP_65504_P_2591_L_LEN)
                  ,beginIp65504P2591L
                  ,IP_65504_P_2591_L_LEN
                 );
            localIp65504P2591LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2591LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2591L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2591L() {	 
			return (getShort(beginIp65504P2591L));
   	}
         int localIp65504P2592SCounter = -1;
         public boolean isIp65504P2592SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2592SCounter != sharedCounter;
            localIp65504P2592SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2592_S_LEN = 2;
  	/**
	 * serializeIp65504P2592S
	 */
	protected void serializeIp65504P2592S(short ip65504P2592S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2592S,IP_65504_P_2592_S_LEN)
                  ,beginIp65504P2592S
                  ,IP_65504_P_2592_S_LEN
                 );
            localIp65504P2592SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2592SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2592S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2592S() {	 
			return (getShort(beginIp65504P2592S));
   	}
         int localIp65504P2592LCounter = -1;
         public boolean isIp65504P2592LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2592LCounter != sharedCounter;
            localIp65504P2592LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2592_L_LEN = 2;
  	/**
	 * serializeIp65504P2592L
	 */
	protected void serializeIp65504P2592L(short ip65504P2592L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2592L,IP_65504_P_2592_L_LEN)
                  ,beginIp65504P2592L
                  ,IP_65504_P_2592_L_LEN
                 );
            localIp65504P2592LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2592LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2592L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2592L() {	 
			return (getShort(beginIp65504P2592L));
   	}
         int localIp65504P2593SCounter = -1;
         public boolean isIp65504P2593SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2593SCounter != sharedCounter;
            localIp65504P2593SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2593_S_LEN = 2;
  	/**
	 * serializeIp65504P2593S
	 */
	protected void serializeIp65504P2593S(short ip65504P2593S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2593S,IP_65504_P_2593_S_LEN)
                  ,beginIp65504P2593S
                  ,IP_65504_P_2593_S_LEN
                 );
            localIp65504P2593SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2593SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2593S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2593S() {	 
			return (getShort(beginIp65504P2593S));
   	}
         int localIp65504P2593LCounter = -1;
         public boolean isIp65504P2593LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2593LCounter != sharedCounter;
            localIp65504P2593LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2593_L_LEN = 2;
  	/**
	 * serializeIp65504P2593L
	 */
	protected void serializeIp65504P2593L(short ip65504P2593L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2593L,IP_65504_P_2593_L_LEN)
                  ,beginIp65504P2593L
                  ,IP_65504_P_2593_L_LEN
                 );
            localIp65504P2593LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2593LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2593L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2593L() {	 
			return (getShort(beginIp65504P2593L));
   	}
         int localIp65504P2594SCounter = -1;
         public boolean isIp65504P2594SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2594SCounter != sharedCounter;
            localIp65504P2594SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2594_S_LEN = 2;
  	/**
	 * serializeIp65504P2594S
	 */
	protected void serializeIp65504P2594S(short ip65504P2594S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2594S,IP_65504_P_2594_S_LEN)
                  ,beginIp65504P2594S
                  ,IP_65504_P_2594_S_LEN
                 );
            localIp65504P2594SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2594SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2594S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2594S() {	 
			return (getShort(beginIp65504P2594S));
   	}
         int localIp65504P2594LCounter = -1;
         public boolean isIp65504P2594LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2594LCounter != sharedCounter;
            localIp65504P2594LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2594_L_LEN = 2;
  	/**
	 * serializeIp65504P2594L
	 */
	protected void serializeIp65504P2594L(short ip65504P2594L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2594L,IP_65504_P_2594_L_LEN)
                  ,beginIp65504P2594L
                  ,IP_65504_P_2594_L_LEN
                 );
            localIp65504P2594LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2594LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2594L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2594L() {	 
			return (getShort(beginIp65504P2594L));
   	}
         int localIp65504P2595SCounter = -1;
         public boolean isIp65504P2595SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2595SCounter != sharedCounter;
            localIp65504P2595SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2595_S_LEN = 2;
  	/**
	 * serializeIp65504P2595S
	 */
	protected void serializeIp65504P2595S(short ip65504P2595S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2595S,IP_65504_P_2595_S_LEN)
                  ,beginIp65504P2595S
                  ,IP_65504_P_2595_S_LEN
                 );
            localIp65504P2595SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2595SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2595S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2595S() {	 
			return (getShort(beginIp65504P2595S));
   	}
         int localIp65504P2595LCounter = -1;
         public boolean isIp65504P2595LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2595LCounter != sharedCounter;
            localIp65504P2595LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2595_L_LEN = 2;
  	/**
	 * serializeIp65504P2595L
	 */
	protected void serializeIp65504P2595L(short ip65504P2595L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2595L,IP_65504_P_2595_L_LEN)
                  ,beginIp65504P2595L
                  ,IP_65504_P_2595_L_LEN
                 );
            localIp65504P2595LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2595LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2595L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2595L() {	 
			return (getShort(beginIp65504P2595L));
   	}
         int localIp65504P2596SCounter = -1;
         public boolean isIp65504P2596SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2596SCounter != sharedCounter;
            localIp65504P2596SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2596_S_LEN = 2;
  	/**
	 * serializeIp65504P2596S
	 */
	protected void serializeIp65504P2596S(short ip65504P2596S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2596S,IP_65504_P_2596_S_LEN)
                  ,beginIp65504P2596S
                  ,IP_65504_P_2596_S_LEN
                 );
            localIp65504P2596SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2596SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2596S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2596S() {	 
			return (getShort(beginIp65504P2596S));
   	}
         int localIp65504P2596LCounter = -1;
         public boolean isIp65504P2596LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2596LCounter != sharedCounter;
            localIp65504P2596LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2596_L_LEN = 2;
  	/**
	 * serializeIp65504P2596L
	 */
	protected void serializeIp65504P2596L(short ip65504P2596L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2596L,IP_65504_P_2596_L_LEN)
                  ,beginIp65504P2596L
                  ,IP_65504_P_2596_L_LEN
                 );
            localIp65504P2596LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2596LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2596L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2596L() {	 
			return (getShort(beginIp65504P2596L));
   	}
         int localIp65504P2597SCounter = -1;
         public boolean isIp65504P2597SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2597SCounter != sharedCounter;
            localIp65504P2597SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2597_S_LEN = 2;
  	/**
	 * serializeIp65504P2597S
	 */
	protected void serializeIp65504P2597S(short ip65504P2597S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2597S,IP_65504_P_2597_S_LEN)
                  ,beginIp65504P2597S
                  ,IP_65504_P_2597_S_LEN
                 );
            localIp65504P2597SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2597SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2597S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2597S() {	 
			return (getShort(beginIp65504P2597S));
   	}
         int localIp65504P2597LCounter = -1;
         public boolean isIp65504P2597LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2597LCounter != sharedCounter;
            localIp65504P2597LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2597_L_LEN = 2;
  	/**
	 * serializeIp65504P2597L
	 */
	protected void serializeIp65504P2597L(short ip65504P2597L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2597L,IP_65504_P_2597_L_LEN)
                  ,beginIp65504P2597L
                  ,IP_65504_P_2597_L_LEN
                 );
            localIp65504P2597LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2597LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2597L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2597L() {	 
			return (getShort(beginIp65504P2597L));
   	}
         int localIp65504P2598SCounter = -1;
         public boolean isIp65504P2598SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2598SCounter != sharedCounter;
            localIp65504P2598SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2598_S_LEN = 2;
  	/**
	 * serializeIp65504P2598S
	 */
	protected void serializeIp65504P2598S(short ip65504P2598S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2598S,IP_65504_P_2598_S_LEN)
                  ,beginIp65504P2598S
                  ,IP_65504_P_2598_S_LEN
                 );
            localIp65504P2598SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2598SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2598S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2598S() {	 
			return (getShort(beginIp65504P2598S));
   	}
         int localIp65504P2598LCounter = -1;
         public boolean isIp65504P2598LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2598LCounter != sharedCounter;
            localIp65504P2598LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2598_L_LEN = 2;
  	/**
	 * serializeIp65504P2598L
	 */
	protected void serializeIp65504P2598L(short ip65504P2598L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2598L,IP_65504_P_2598_L_LEN)
                  ,beginIp65504P2598L
                  ,IP_65504_P_2598_L_LEN
                 );
            localIp65504P2598LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2598LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2598L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2598L() {	 
			return (getShort(beginIp65504P2598L));
   	}
         int localIp65504P2599SCounter = -1;
         public boolean isIp65504P2599SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2599SCounter != sharedCounter;
            localIp65504P2599SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2599_S_LEN = 2;
  	/**
	 * serializeIp65504P2599S
	 */
	protected void serializeIp65504P2599S(short ip65504P2599S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2599S,IP_65504_P_2599_S_LEN)
                  ,beginIp65504P2599S
                  ,IP_65504_P_2599_S_LEN
                 );
            localIp65504P2599SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2599SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2599S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2599S() {	 
			return (getShort(beginIp65504P2599S));
   	}
         int localIp65504P2599LCounter = -1;
         public boolean isIp65504P2599LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2599LCounter != sharedCounter;
            localIp65504P2599LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2599_L_LEN = 2;
  	/**
	 * serializeIp65504P2599L
	 */
	protected void serializeIp65504P2599L(short ip65504P2599L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2599L,IP_65504_P_2599_L_LEN)
                  ,beginIp65504P2599L
                  ,IP_65504_P_2599_L_LEN
                 );
            localIp65504P2599LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2599LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2599L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2599L() {	 
			return (getShort(beginIp65504P2599L));
   	}
         int localIp65504P2600SCounter = -1;
         public boolean isIp65504P2600SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2600SCounter != sharedCounter;
            localIp65504P2600SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2600_S_LEN = 2;
  	/**
	 * serializeIp65504P2600S
	 */
	protected void serializeIp65504P2600S(short ip65504P2600S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2600S,IP_65504_P_2600_S_LEN)
                  ,beginIp65504P2600S
                  ,IP_65504_P_2600_S_LEN
                 );
            localIp65504P2600SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2600SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2600S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2600S() {	 
			return (getShort(beginIp65504P2600S));
   	}
         int localIp65504P2600LCounter = -1;
         public boolean isIp65504P2600LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2600LCounter != sharedCounter;
            localIp65504P2600LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2600_L_LEN = 2;
  	/**
	 * serializeIp65504P2600L
	 */
	protected void serializeIp65504P2600L(short ip65504P2600L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2600L,IP_65504_P_2600_L_LEN)
                  ,beginIp65504P2600L
                  ,IP_65504_P_2600_L_LEN
                 );
            localIp65504P2600LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2600LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2600L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2600L() {	 
			return (getShort(beginIp65504P2600L));
   	}
         int localIp65504P2601SCounter = -1;
         public boolean isIp65504P2601SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2601SCounter != sharedCounter;
            localIp65504P2601SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2601_S_LEN = 2;
  	/**
	 * serializeIp65504P2601S
	 */
	protected void serializeIp65504P2601S(short ip65504P2601S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2601S,IP_65504_P_2601_S_LEN)
                  ,beginIp65504P2601S
                  ,IP_65504_P_2601_S_LEN
                 );
            localIp65504P2601SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2601SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2601S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2601S() {	 
			return (getShort(beginIp65504P2601S));
   	}
         int localIp65504P2601LCounter = -1;
         public boolean isIp65504P2601LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2601LCounter != sharedCounter;
            localIp65504P2601LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2601_L_LEN = 2;
  	/**
	 * serializeIp65504P2601L
	 */
	protected void serializeIp65504P2601L(short ip65504P2601L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2601L,IP_65504_P_2601_L_LEN)
                  ,beginIp65504P2601L
                  ,IP_65504_P_2601_L_LEN
                 );
            localIp65504P2601LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2601LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2601L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2601L() {	 
			return (getShort(beginIp65504P2601L));
   	}
         int localIp65504P2602SCounter = -1;
         public boolean isIp65504P2602SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2602SCounter != sharedCounter;
            localIp65504P2602SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2602_S_LEN = 2;
  	/**
	 * serializeIp65504P2602S
	 */
	protected void serializeIp65504P2602S(short ip65504P2602S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2602S,IP_65504_P_2602_S_LEN)
                  ,beginIp65504P2602S
                  ,IP_65504_P_2602_S_LEN
                 );
            localIp65504P2602SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2602SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2602S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2602S() {	 
			return (getShort(beginIp65504P2602S));
   	}
         int localIp65504P2602LCounter = -1;
         public boolean isIp65504P2602LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2602LCounter != sharedCounter;
            localIp65504P2602LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2602_L_LEN = 2;
  	/**
	 * serializeIp65504P2602L
	 */
	protected void serializeIp65504P2602L(short ip65504P2602L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2602L,IP_65504_P_2602_L_LEN)
                  ,beginIp65504P2602L
                  ,IP_65504_P_2602_L_LEN
                 );
            localIp65504P2602LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2602LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2602L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2602L() {	 
			return (getShort(beginIp65504P2602L));
   	}
         int localIp65504P2603SCounter = -1;
         public boolean isIp65504P2603SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2603SCounter != sharedCounter;
            localIp65504P2603SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2603_S_LEN = 2;
  	/**
	 * serializeIp65504P2603S
	 */
	protected void serializeIp65504P2603S(short ip65504P2603S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2603S,IP_65504_P_2603_S_LEN)
                  ,beginIp65504P2603S
                  ,IP_65504_P_2603_S_LEN
                 );
            localIp65504P2603SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2603SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2603S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2603S() {	 
			return (getShort(beginIp65504P2603S));
   	}
         int localIp65504P2603LCounter = -1;
         public boolean isIp65504P2603LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2603LCounter != sharedCounter;
            localIp65504P2603LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2603_L_LEN = 2;
  	/**
	 * serializeIp65504P2603L
	 */
	protected void serializeIp65504P2603L(short ip65504P2603L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2603L,IP_65504_P_2603_L_LEN)
                  ,beginIp65504P2603L
                  ,IP_65504_P_2603_L_LEN
                 );
            localIp65504P2603LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2603LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2603L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2603L() {	 
			return (getShort(beginIp65504P2603L));
   	}
         int localIp65504P2604SCounter = -1;
         public boolean isIp65504P2604SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2604SCounter != sharedCounter;
            localIp65504P2604SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2604_S_LEN = 2;
  	/**
	 * serializeIp65504P2604S
	 */
	protected void serializeIp65504P2604S(short ip65504P2604S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2604S,IP_65504_P_2604_S_LEN)
                  ,beginIp65504P2604S
                  ,IP_65504_P_2604_S_LEN
                 );
            localIp65504P2604SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2604SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2604S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2604S() {	 
			return (getShort(beginIp65504P2604S));
   	}
         int localIp65504P2604LCounter = -1;
         public boolean isIp65504P2604LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2604LCounter != sharedCounter;
            localIp65504P2604LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2604_L_LEN = 2;
  	/**
	 * serializeIp65504P2604L
	 */
	protected void serializeIp65504P2604L(short ip65504P2604L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2604L,IP_65504_P_2604_L_LEN)
                  ,beginIp65504P2604L
                  ,IP_65504_P_2604_L_LEN
                 );
            localIp65504P2604LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2604LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2604L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2604L() {	 
			return (getShort(beginIp65504P2604L));
   	}




}
  
