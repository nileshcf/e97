package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup82Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup82Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup82Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_82_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2512S;
            protected  int beginIp65504P2512L;
            protected  int beginIp65504P2513S;
            protected  int beginIp65504P2513L;
            protected  int beginIp65504P2514S;
            protected  int beginIp65504P2514L;
            protected  int beginIp65504P2515S;
            protected  int beginIp65504P2515L;
            protected  int beginIp65504P2516S;
            protected  int beginIp65504P2516L;
            protected  int beginIp65504P2517S;
            protected  int beginIp65504P2517L;
            protected  int beginIp65504P2518S;
            protected  int beginIp65504P2518L;
            protected  int beginIp65504P2519S;
            protected  int beginIp65504P2519L;
            protected  int beginIp65504P2520S;
            protected  int beginIp65504P2520L;
            protected  int beginIp65504P2521S;
            protected  int beginIp65504P2521L;
            protected  int beginIp65504P2522S;
            protected  int beginIp65504P2522L;
            protected  int beginIp65504P2523S;
            protected  int beginIp65504P2523L;
            protected  int beginIp65504P2524S;
            protected  int beginIp65504P2524L;
            protected  int beginIp65504P2525S;
            protected  int beginIp65504P2525L;
            protected  int beginIp65504P2526S;
            protected  int beginIp65504P2526L;
            protected  int beginIp65504P2527S;
            protected  int beginIp65504P2527L;
            protected  int beginIp65504P2528S;
            protected  int beginIp65504P2528L;
            protected  int beginIp65504P2529S;
            protected  int beginIp65504P2529L;
            protected  int beginIp65504P2530S;
            protected  int beginIp65504P2530L;
            protected  int beginIp65504P2531S;
            protected  int beginIp65504P2531L;
            protected  int beginIp65504P2532S;
            protected  int beginIp65504P2532L;
            protected  int beginIp65504P2533S;
            protected  int beginIp65504P2533L;
            protected  int beginIp65504P2534S;
            protected  int beginIp65504P2534L;
            protected  int beginIp65504P2535S;
            protected  int beginIp65504P2535L;
            protected  int beginIp65504P2536S;
            protected  int beginIp65504P2536L;
            protected  int beginIp65504P2537S;
            protected  int beginIp65504P2537L;
            protected  int beginIp65504P2538S;
            protected  int beginIp65504P2538L;
            protected  int beginIp65504P2539S;
            protected  int beginIp65504P2539L;
            protected  int beginIp65504P2540S;
            protected  int beginIp65504P2540L;
            protected  int beginIp65504P2541S;
            protected  int beginIp65504P2541L;
            protected  int beginIp65504P2542S;
            protected  int beginIp65504P2542L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup82Serialized
	**/
    public Ip65504PdsNamesLargeGroup82Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup82Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup82Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup82Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,20084); // serialize this field at offset 20084 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup82Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 20084 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup82Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_82_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2512S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2512L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2513S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2513L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2514S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2514L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2515S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2515L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2516S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2516L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2517S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2517L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2518S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2518L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2519S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2519L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2520S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2520L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2521S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2521L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2522S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2522L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2523S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2523L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2524S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2524L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2525S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2525L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2526S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2526L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2527S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2527L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2528S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2528L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2529S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2529L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2530S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2530L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2531S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2531L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2532S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2532L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2533S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2533L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2534S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2534L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2535S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2535L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2536S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2536L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2537S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2537L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2538S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2538L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2539S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2539L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2540S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2540L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2541S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2541L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2542S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2542L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2512SCounter = -1;
         public boolean isIp65504P2512SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2512SCounter != sharedCounter;
            localIp65504P2512SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2512_S_LEN = 2;
  	/**
	 * serializeIp65504P2512S
	 */
	protected void serializeIp65504P2512S(short ip65504P2512S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2512S,IP_65504_P_2512_S_LEN)
                  ,beginIp65504P2512S
                  ,IP_65504_P_2512_S_LEN
                 );
            localIp65504P2512SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2512SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2512S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2512S() {	 
			return (getShort(beginIp65504P2512S));
   	}
         int localIp65504P2512LCounter = -1;
         public boolean isIp65504P2512LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2512LCounter != sharedCounter;
            localIp65504P2512LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2512_L_LEN = 2;
  	/**
	 * serializeIp65504P2512L
	 */
	protected void serializeIp65504P2512L(short ip65504P2512L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2512L,IP_65504_P_2512_L_LEN)
                  ,beginIp65504P2512L
                  ,IP_65504_P_2512_L_LEN
                 );
            localIp65504P2512LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2512LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2512L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2512L() {	 
			return (getShort(beginIp65504P2512L));
   	}
         int localIp65504P2513SCounter = -1;
         public boolean isIp65504P2513SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2513SCounter != sharedCounter;
            localIp65504P2513SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2513_S_LEN = 2;
  	/**
	 * serializeIp65504P2513S
	 */
	protected void serializeIp65504P2513S(short ip65504P2513S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2513S,IP_65504_P_2513_S_LEN)
                  ,beginIp65504P2513S
                  ,IP_65504_P_2513_S_LEN
                 );
            localIp65504P2513SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2513SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2513S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2513S() {	 
			return (getShort(beginIp65504P2513S));
   	}
         int localIp65504P2513LCounter = -1;
         public boolean isIp65504P2513LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2513LCounter != sharedCounter;
            localIp65504P2513LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2513_L_LEN = 2;
  	/**
	 * serializeIp65504P2513L
	 */
	protected void serializeIp65504P2513L(short ip65504P2513L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2513L,IP_65504_P_2513_L_LEN)
                  ,beginIp65504P2513L
                  ,IP_65504_P_2513_L_LEN
                 );
            localIp65504P2513LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2513LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2513L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2513L() {	 
			return (getShort(beginIp65504P2513L));
   	}
         int localIp65504P2514SCounter = -1;
         public boolean isIp65504P2514SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2514SCounter != sharedCounter;
            localIp65504P2514SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2514_S_LEN = 2;
  	/**
	 * serializeIp65504P2514S
	 */
	protected void serializeIp65504P2514S(short ip65504P2514S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2514S,IP_65504_P_2514_S_LEN)
                  ,beginIp65504P2514S
                  ,IP_65504_P_2514_S_LEN
                 );
            localIp65504P2514SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2514SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2514S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2514S() {	 
			return (getShort(beginIp65504P2514S));
   	}
         int localIp65504P2514LCounter = -1;
         public boolean isIp65504P2514LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2514LCounter != sharedCounter;
            localIp65504P2514LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2514_L_LEN = 2;
  	/**
	 * serializeIp65504P2514L
	 */
	protected void serializeIp65504P2514L(short ip65504P2514L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2514L,IP_65504_P_2514_L_LEN)
                  ,beginIp65504P2514L
                  ,IP_65504_P_2514_L_LEN
                 );
            localIp65504P2514LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2514LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2514L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2514L() {	 
			return (getShort(beginIp65504P2514L));
   	}
         int localIp65504P2515SCounter = -1;
         public boolean isIp65504P2515SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2515SCounter != sharedCounter;
            localIp65504P2515SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2515_S_LEN = 2;
  	/**
	 * serializeIp65504P2515S
	 */
	protected void serializeIp65504P2515S(short ip65504P2515S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2515S,IP_65504_P_2515_S_LEN)
                  ,beginIp65504P2515S
                  ,IP_65504_P_2515_S_LEN
                 );
            localIp65504P2515SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2515SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2515S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2515S() {	 
			return (getShort(beginIp65504P2515S));
   	}
         int localIp65504P2515LCounter = -1;
         public boolean isIp65504P2515LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2515LCounter != sharedCounter;
            localIp65504P2515LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2515_L_LEN = 2;
  	/**
	 * serializeIp65504P2515L
	 */
	protected void serializeIp65504P2515L(short ip65504P2515L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2515L,IP_65504_P_2515_L_LEN)
                  ,beginIp65504P2515L
                  ,IP_65504_P_2515_L_LEN
                 );
            localIp65504P2515LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2515LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2515L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2515L() {	 
			return (getShort(beginIp65504P2515L));
   	}
         int localIp65504P2516SCounter = -1;
         public boolean isIp65504P2516SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2516SCounter != sharedCounter;
            localIp65504P2516SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2516_S_LEN = 2;
  	/**
	 * serializeIp65504P2516S
	 */
	protected void serializeIp65504P2516S(short ip65504P2516S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2516S,IP_65504_P_2516_S_LEN)
                  ,beginIp65504P2516S
                  ,IP_65504_P_2516_S_LEN
                 );
            localIp65504P2516SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2516SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2516S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2516S() {	 
			return (getShort(beginIp65504P2516S));
   	}
         int localIp65504P2516LCounter = -1;
         public boolean isIp65504P2516LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2516LCounter != sharedCounter;
            localIp65504P2516LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2516_L_LEN = 2;
  	/**
	 * serializeIp65504P2516L
	 */
	protected void serializeIp65504P2516L(short ip65504P2516L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2516L,IP_65504_P_2516_L_LEN)
                  ,beginIp65504P2516L
                  ,IP_65504_P_2516_L_LEN
                 );
            localIp65504P2516LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2516LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2516L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2516L() {	 
			return (getShort(beginIp65504P2516L));
   	}
         int localIp65504P2517SCounter = -1;
         public boolean isIp65504P2517SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2517SCounter != sharedCounter;
            localIp65504P2517SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2517_S_LEN = 2;
  	/**
	 * serializeIp65504P2517S
	 */
	protected void serializeIp65504P2517S(short ip65504P2517S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2517S,IP_65504_P_2517_S_LEN)
                  ,beginIp65504P2517S
                  ,IP_65504_P_2517_S_LEN
                 );
            localIp65504P2517SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2517SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2517S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2517S() {	 
			return (getShort(beginIp65504P2517S));
   	}
         int localIp65504P2517LCounter = -1;
         public boolean isIp65504P2517LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2517LCounter != sharedCounter;
            localIp65504P2517LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2517_L_LEN = 2;
  	/**
	 * serializeIp65504P2517L
	 */
	protected void serializeIp65504P2517L(short ip65504P2517L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2517L,IP_65504_P_2517_L_LEN)
                  ,beginIp65504P2517L
                  ,IP_65504_P_2517_L_LEN
                 );
            localIp65504P2517LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2517LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2517L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2517L() {	 
			return (getShort(beginIp65504P2517L));
   	}
         int localIp65504P2518SCounter = -1;
         public boolean isIp65504P2518SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2518SCounter != sharedCounter;
            localIp65504P2518SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2518_S_LEN = 2;
  	/**
	 * serializeIp65504P2518S
	 */
	protected void serializeIp65504P2518S(short ip65504P2518S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2518S,IP_65504_P_2518_S_LEN)
                  ,beginIp65504P2518S
                  ,IP_65504_P_2518_S_LEN
                 );
            localIp65504P2518SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2518SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2518S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2518S() {	 
			return (getShort(beginIp65504P2518S));
   	}
         int localIp65504P2518LCounter = -1;
         public boolean isIp65504P2518LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2518LCounter != sharedCounter;
            localIp65504P2518LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2518_L_LEN = 2;
  	/**
	 * serializeIp65504P2518L
	 */
	protected void serializeIp65504P2518L(short ip65504P2518L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2518L,IP_65504_P_2518_L_LEN)
                  ,beginIp65504P2518L
                  ,IP_65504_P_2518_L_LEN
                 );
            localIp65504P2518LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2518LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2518L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2518L() {	 
			return (getShort(beginIp65504P2518L));
   	}
         int localIp65504P2519SCounter = -1;
         public boolean isIp65504P2519SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2519SCounter != sharedCounter;
            localIp65504P2519SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2519_S_LEN = 2;
  	/**
	 * serializeIp65504P2519S
	 */
	protected void serializeIp65504P2519S(short ip65504P2519S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2519S,IP_65504_P_2519_S_LEN)
                  ,beginIp65504P2519S
                  ,IP_65504_P_2519_S_LEN
                 );
            localIp65504P2519SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2519SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2519S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2519S() {	 
			return (getShort(beginIp65504P2519S));
   	}
         int localIp65504P2519LCounter = -1;
         public boolean isIp65504P2519LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2519LCounter != sharedCounter;
            localIp65504P2519LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2519_L_LEN = 2;
  	/**
	 * serializeIp65504P2519L
	 */
	protected void serializeIp65504P2519L(short ip65504P2519L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2519L,IP_65504_P_2519_L_LEN)
                  ,beginIp65504P2519L
                  ,IP_65504_P_2519_L_LEN
                 );
            localIp65504P2519LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2519LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2519L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2519L() {	 
			return (getShort(beginIp65504P2519L));
   	}
         int localIp65504P2520SCounter = -1;
         public boolean isIp65504P2520SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2520SCounter != sharedCounter;
            localIp65504P2520SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2520_S_LEN = 2;
  	/**
	 * serializeIp65504P2520S
	 */
	protected void serializeIp65504P2520S(short ip65504P2520S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2520S,IP_65504_P_2520_S_LEN)
                  ,beginIp65504P2520S
                  ,IP_65504_P_2520_S_LEN
                 );
            localIp65504P2520SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2520SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2520S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2520S() {	 
			return (getShort(beginIp65504P2520S));
   	}
         int localIp65504P2520LCounter = -1;
         public boolean isIp65504P2520LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2520LCounter != sharedCounter;
            localIp65504P2520LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2520_L_LEN = 2;
  	/**
	 * serializeIp65504P2520L
	 */
	protected void serializeIp65504P2520L(short ip65504P2520L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2520L,IP_65504_P_2520_L_LEN)
                  ,beginIp65504P2520L
                  ,IP_65504_P_2520_L_LEN
                 );
            localIp65504P2520LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2520LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2520L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2520L() {	 
			return (getShort(beginIp65504P2520L));
   	}
         int localIp65504P2521SCounter = -1;
         public boolean isIp65504P2521SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2521SCounter != sharedCounter;
            localIp65504P2521SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2521_S_LEN = 2;
  	/**
	 * serializeIp65504P2521S
	 */
	protected void serializeIp65504P2521S(short ip65504P2521S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2521S,IP_65504_P_2521_S_LEN)
                  ,beginIp65504P2521S
                  ,IP_65504_P_2521_S_LEN
                 );
            localIp65504P2521SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2521SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2521S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2521S() {	 
			return (getShort(beginIp65504P2521S));
   	}
         int localIp65504P2521LCounter = -1;
         public boolean isIp65504P2521LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2521LCounter != sharedCounter;
            localIp65504P2521LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2521_L_LEN = 2;
  	/**
	 * serializeIp65504P2521L
	 */
	protected void serializeIp65504P2521L(short ip65504P2521L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2521L,IP_65504_P_2521_L_LEN)
                  ,beginIp65504P2521L
                  ,IP_65504_P_2521_L_LEN
                 );
            localIp65504P2521LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2521LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2521L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2521L() {	 
			return (getShort(beginIp65504P2521L));
   	}
         int localIp65504P2522SCounter = -1;
         public boolean isIp65504P2522SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2522SCounter != sharedCounter;
            localIp65504P2522SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2522_S_LEN = 2;
  	/**
	 * serializeIp65504P2522S
	 */
	protected void serializeIp65504P2522S(short ip65504P2522S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2522S,IP_65504_P_2522_S_LEN)
                  ,beginIp65504P2522S
                  ,IP_65504_P_2522_S_LEN
                 );
            localIp65504P2522SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2522SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2522S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2522S() {	 
			return (getShort(beginIp65504P2522S));
   	}
         int localIp65504P2522LCounter = -1;
         public boolean isIp65504P2522LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2522LCounter != sharedCounter;
            localIp65504P2522LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2522_L_LEN = 2;
  	/**
	 * serializeIp65504P2522L
	 */
	protected void serializeIp65504P2522L(short ip65504P2522L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2522L,IP_65504_P_2522_L_LEN)
                  ,beginIp65504P2522L
                  ,IP_65504_P_2522_L_LEN
                 );
            localIp65504P2522LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2522LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2522L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2522L() {	 
			return (getShort(beginIp65504P2522L));
   	}
         int localIp65504P2523SCounter = -1;
         public boolean isIp65504P2523SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2523SCounter != sharedCounter;
            localIp65504P2523SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2523_S_LEN = 2;
  	/**
	 * serializeIp65504P2523S
	 */
	protected void serializeIp65504P2523S(short ip65504P2523S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2523S,IP_65504_P_2523_S_LEN)
                  ,beginIp65504P2523S
                  ,IP_65504_P_2523_S_LEN
                 );
            localIp65504P2523SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2523SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2523S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2523S() {	 
			return (getShort(beginIp65504P2523S));
   	}
         int localIp65504P2523LCounter = -1;
         public boolean isIp65504P2523LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2523LCounter != sharedCounter;
            localIp65504P2523LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2523_L_LEN = 2;
  	/**
	 * serializeIp65504P2523L
	 */
	protected void serializeIp65504P2523L(short ip65504P2523L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2523L,IP_65504_P_2523_L_LEN)
                  ,beginIp65504P2523L
                  ,IP_65504_P_2523_L_LEN
                 );
            localIp65504P2523LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2523LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2523L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2523L() {	 
			return (getShort(beginIp65504P2523L));
   	}
         int localIp65504P2524SCounter = -1;
         public boolean isIp65504P2524SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2524SCounter != sharedCounter;
            localIp65504P2524SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2524_S_LEN = 2;
  	/**
	 * serializeIp65504P2524S
	 */
	protected void serializeIp65504P2524S(short ip65504P2524S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2524S,IP_65504_P_2524_S_LEN)
                  ,beginIp65504P2524S
                  ,IP_65504_P_2524_S_LEN
                 );
            localIp65504P2524SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2524SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2524S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2524S() {	 
			return (getShort(beginIp65504P2524S));
   	}
         int localIp65504P2524LCounter = -1;
         public boolean isIp65504P2524LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2524LCounter != sharedCounter;
            localIp65504P2524LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2524_L_LEN = 2;
  	/**
	 * serializeIp65504P2524L
	 */
	protected void serializeIp65504P2524L(short ip65504P2524L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2524L,IP_65504_P_2524_L_LEN)
                  ,beginIp65504P2524L
                  ,IP_65504_P_2524_L_LEN
                 );
            localIp65504P2524LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2524LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2524L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2524L() {	 
			return (getShort(beginIp65504P2524L));
   	}
         int localIp65504P2525SCounter = -1;
         public boolean isIp65504P2525SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2525SCounter != sharedCounter;
            localIp65504P2525SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2525_S_LEN = 2;
  	/**
	 * serializeIp65504P2525S
	 */
	protected void serializeIp65504P2525S(short ip65504P2525S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2525S,IP_65504_P_2525_S_LEN)
                  ,beginIp65504P2525S
                  ,IP_65504_P_2525_S_LEN
                 );
            localIp65504P2525SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2525SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2525S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2525S() {	 
			return (getShort(beginIp65504P2525S));
   	}
         int localIp65504P2525LCounter = -1;
         public boolean isIp65504P2525LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2525LCounter != sharedCounter;
            localIp65504P2525LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2525_L_LEN = 2;
  	/**
	 * serializeIp65504P2525L
	 */
	protected void serializeIp65504P2525L(short ip65504P2525L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2525L,IP_65504_P_2525_L_LEN)
                  ,beginIp65504P2525L
                  ,IP_65504_P_2525_L_LEN
                 );
            localIp65504P2525LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2525LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2525L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2525L() {	 
			return (getShort(beginIp65504P2525L));
   	}
         int localIp65504P2526SCounter = -1;
         public boolean isIp65504P2526SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2526SCounter != sharedCounter;
            localIp65504P2526SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2526_S_LEN = 2;
  	/**
	 * serializeIp65504P2526S
	 */
	protected void serializeIp65504P2526S(short ip65504P2526S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2526S,IP_65504_P_2526_S_LEN)
                  ,beginIp65504P2526S
                  ,IP_65504_P_2526_S_LEN
                 );
            localIp65504P2526SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2526SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2526S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2526S() {	 
			return (getShort(beginIp65504P2526S));
   	}
         int localIp65504P2526LCounter = -1;
         public boolean isIp65504P2526LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2526LCounter != sharedCounter;
            localIp65504P2526LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2526_L_LEN = 2;
  	/**
	 * serializeIp65504P2526L
	 */
	protected void serializeIp65504P2526L(short ip65504P2526L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2526L,IP_65504_P_2526_L_LEN)
                  ,beginIp65504P2526L
                  ,IP_65504_P_2526_L_LEN
                 );
            localIp65504P2526LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2526LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2526L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2526L() {	 
			return (getShort(beginIp65504P2526L));
   	}
         int localIp65504P2527SCounter = -1;
         public boolean isIp65504P2527SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2527SCounter != sharedCounter;
            localIp65504P2527SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2527_S_LEN = 2;
  	/**
	 * serializeIp65504P2527S
	 */
	protected void serializeIp65504P2527S(short ip65504P2527S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2527S,IP_65504_P_2527_S_LEN)
                  ,beginIp65504P2527S
                  ,IP_65504_P_2527_S_LEN
                 );
            localIp65504P2527SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2527SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2527S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2527S() {	 
			return (getShort(beginIp65504P2527S));
   	}
         int localIp65504P2527LCounter = -1;
         public boolean isIp65504P2527LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2527LCounter != sharedCounter;
            localIp65504P2527LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2527_L_LEN = 2;
  	/**
	 * serializeIp65504P2527L
	 */
	protected void serializeIp65504P2527L(short ip65504P2527L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2527L,IP_65504_P_2527_L_LEN)
                  ,beginIp65504P2527L
                  ,IP_65504_P_2527_L_LEN
                 );
            localIp65504P2527LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2527LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2527L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2527L() {	 
			return (getShort(beginIp65504P2527L));
   	}
         int localIp65504P2528SCounter = -1;
         public boolean isIp65504P2528SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2528SCounter != sharedCounter;
            localIp65504P2528SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2528_S_LEN = 2;
  	/**
	 * serializeIp65504P2528S
	 */
	protected void serializeIp65504P2528S(short ip65504P2528S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2528S,IP_65504_P_2528_S_LEN)
                  ,beginIp65504P2528S
                  ,IP_65504_P_2528_S_LEN
                 );
            localIp65504P2528SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2528SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2528S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2528S() {	 
			return (getShort(beginIp65504P2528S));
   	}
         int localIp65504P2528LCounter = -1;
         public boolean isIp65504P2528LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2528LCounter != sharedCounter;
            localIp65504P2528LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2528_L_LEN = 2;
  	/**
	 * serializeIp65504P2528L
	 */
	protected void serializeIp65504P2528L(short ip65504P2528L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2528L,IP_65504_P_2528_L_LEN)
                  ,beginIp65504P2528L
                  ,IP_65504_P_2528_L_LEN
                 );
            localIp65504P2528LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2528LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2528L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2528L() {	 
			return (getShort(beginIp65504P2528L));
   	}
         int localIp65504P2529SCounter = -1;
         public boolean isIp65504P2529SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2529SCounter != sharedCounter;
            localIp65504P2529SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2529_S_LEN = 2;
  	/**
	 * serializeIp65504P2529S
	 */
	protected void serializeIp65504P2529S(short ip65504P2529S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2529S,IP_65504_P_2529_S_LEN)
                  ,beginIp65504P2529S
                  ,IP_65504_P_2529_S_LEN
                 );
            localIp65504P2529SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2529SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2529S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2529S() {	 
			return (getShort(beginIp65504P2529S));
   	}
         int localIp65504P2529LCounter = -1;
         public boolean isIp65504P2529LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2529LCounter != sharedCounter;
            localIp65504P2529LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2529_L_LEN = 2;
  	/**
	 * serializeIp65504P2529L
	 */
	protected void serializeIp65504P2529L(short ip65504P2529L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2529L,IP_65504_P_2529_L_LEN)
                  ,beginIp65504P2529L
                  ,IP_65504_P_2529_L_LEN
                 );
            localIp65504P2529LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2529LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2529L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2529L() {	 
			return (getShort(beginIp65504P2529L));
   	}
         int localIp65504P2530SCounter = -1;
         public boolean isIp65504P2530SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2530SCounter != sharedCounter;
            localIp65504P2530SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2530_S_LEN = 2;
  	/**
	 * serializeIp65504P2530S
	 */
	protected void serializeIp65504P2530S(short ip65504P2530S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2530S,IP_65504_P_2530_S_LEN)
                  ,beginIp65504P2530S
                  ,IP_65504_P_2530_S_LEN
                 );
            localIp65504P2530SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2530SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2530S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2530S() {	 
			return (getShort(beginIp65504P2530S));
   	}
         int localIp65504P2530LCounter = -1;
         public boolean isIp65504P2530LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2530LCounter != sharedCounter;
            localIp65504P2530LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2530_L_LEN = 2;
  	/**
	 * serializeIp65504P2530L
	 */
	protected void serializeIp65504P2530L(short ip65504P2530L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2530L,IP_65504_P_2530_L_LEN)
                  ,beginIp65504P2530L
                  ,IP_65504_P_2530_L_LEN
                 );
            localIp65504P2530LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2530LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2530L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2530L() {	 
			return (getShort(beginIp65504P2530L));
   	}
         int localIp65504P2531SCounter = -1;
         public boolean isIp65504P2531SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2531SCounter != sharedCounter;
            localIp65504P2531SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2531_S_LEN = 2;
  	/**
	 * serializeIp65504P2531S
	 */
	protected void serializeIp65504P2531S(short ip65504P2531S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2531S,IP_65504_P_2531_S_LEN)
                  ,beginIp65504P2531S
                  ,IP_65504_P_2531_S_LEN
                 );
            localIp65504P2531SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2531SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2531S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2531S() {	 
			return (getShort(beginIp65504P2531S));
   	}
         int localIp65504P2531LCounter = -1;
         public boolean isIp65504P2531LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2531LCounter != sharedCounter;
            localIp65504P2531LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2531_L_LEN = 2;
  	/**
	 * serializeIp65504P2531L
	 */
	protected void serializeIp65504P2531L(short ip65504P2531L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2531L,IP_65504_P_2531_L_LEN)
                  ,beginIp65504P2531L
                  ,IP_65504_P_2531_L_LEN
                 );
            localIp65504P2531LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2531LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2531L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2531L() {	 
			return (getShort(beginIp65504P2531L));
   	}
         int localIp65504P2532SCounter = -1;
         public boolean isIp65504P2532SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2532SCounter != sharedCounter;
            localIp65504P2532SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2532_S_LEN = 2;
  	/**
	 * serializeIp65504P2532S
	 */
	protected void serializeIp65504P2532S(short ip65504P2532S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2532S,IP_65504_P_2532_S_LEN)
                  ,beginIp65504P2532S
                  ,IP_65504_P_2532_S_LEN
                 );
            localIp65504P2532SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2532SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2532S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2532S() {	 
			return (getShort(beginIp65504P2532S));
   	}
         int localIp65504P2532LCounter = -1;
         public boolean isIp65504P2532LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2532LCounter != sharedCounter;
            localIp65504P2532LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2532_L_LEN = 2;
  	/**
	 * serializeIp65504P2532L
	 */
	protected void serializeIp65504P2532L(short ip65504P2532L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2532L,IP_65504_P_2532_L_LEN)
                  ,beginIp65504P2532L
                  ,IP_65504_P_2532_L_LEN
                 );
            localIp65504P2532LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2532LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2532L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2532L() {	 
			return (getShort(beginIp65504P2532L));
   	}
         int localIp65504P2533SCounter = -1;
         public boolean isIp65504P2533SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2533SCounter != sharedCounter;
            localIp65504P2533SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2533_S_LEN = 2;
  	/**
	 * serializeIp65504P2533S
	 */
	protected void serializeIp65504P2533S(short ip65504P2533S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2533S,IP_65504_P_2533_S_LEN)
                  ,beginIp65504P2533S
                  ,IP_65504_P_2533_S_LEN
                 );
            localIp65504P2533SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2533SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2533S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2533S() {	 
			return (getShort(beginIp65504P2533S));
   	}
         int localIp65504P2533LCounter = -1;
         public boolean isIp65504P2533LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2533LCounter != sharedCounter;
            localIp65504P2533LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2533_L_LEN = 2;
  	/**
	 * serializeIp65504P2533L
	 */
	protected void serializeIp65504P2533L(short ip65504P2533L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2533L,IP_65504_P_2533_L_LEN)
                  ,beginIp65504P2533L
                  ,IP_65504_P_2533_L_LEN
                 );
            localIp65504P2533LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2533LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2533L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2533L() {	 
			return (getShort(beginIp65504P2533L));
   	}
         int localIp65504P2534SCounter = -1;
         public boolean isIp65504P2534SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2534SCounter != sharedCounter;
            localIp65504P2534SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2534_S_LEN = 2;
  	/**
	 * serializeIp65504P2534S
	 */
	protected void serializeIp65504P2534S(short ip65504P2534S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2534S,IP_65504_P_2534_S_LEN)
                  ,beginIp65504P2534S
                  ,IP_65504_P_2534_S_LEN
                 );
            localIp65504P2534SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2534SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2534S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2534S() {	 
			return (getShort(beginIp65504P2534S));
   	}
         int localIp65504P2534LCounter = -1;
         public boolean isIp65504P2534LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2534LCounter != sharedCounter;
            localIp65504P2534LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2534_L_LEN = 2;
  	/**
	 * serializeIp65504P2534L
	 */
	protected void serializeIp65504P2534L(short ip65504P2534L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2534L,IP_65504_P_2534_L_LEN)
                  ,beginIp65504P2534L
                  ,IP_65504_P_2534_L_LEN
                 );
            localIp65504P2534LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2534LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2534L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2534L() {	 
			return (getShort(beginIp65504P2534L));
   	}
         int localIp65504P2535SCounter = -1;
         public boolean isIp65504P2535SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2535SCounter != sharedCounter;
            localIp65504P2535SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2535_S_LEN = 2;
  	/**
	 * serializeIp65504P2535S
	 */
	protected void serializeIp65504P2535S(short ip65504P2535S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2535S,IP_65504_P_2535_S_LEN)
                  ,beginIp65504P2535S
                  ,IP_65504_P_2535_S_LEN
                 );
            localIp65504P2535SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2535SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2535S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2535S() {	 
			return (getShort(beginIp65504P2535S));
   	}
         int localIp65504P2535LCounter = -1;
         public boolean isIp65504P2535LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2535LCounter != sharedCounter;
            localIp65504P2535LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2535_L_LEN = 2;
  	/**
	 * serializeIp65504P2535L
	 */
	protected void serializeIp65504P2535L(short ip65504P2535L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2535L,IP_65504_P_2535_L_LEN)
                  ,beginIp65504P2535L
                  ,IP_65504_P_2535_L_LEN
                 );
            localIp65504P2535LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2535LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2535L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2535L() {	 
			return (getShort(beginIp65504P2535L));
   	}
         int localIp65504P2536SCounter = -1;
         public boolean isIp65504P2536SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2536SCounter != sharedCounter;
            localIp65504P2536SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2536_S_LEN = 2;
  	/**
	 * serializeIp65504P2536S
	 */
	protected void serializeIp65504P2536S(short ip65504P2536S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2536S,IP_65504_P_2536_S_LEN)
                  ,beginIp65504P2536S
                  ,IP_65504_P_2536_S_LEN
                 );
            localIp65504P2536SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2536SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2536S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2536S() {	 
			return (getShort(beginIp65504P2536S));
   	}
         int localIp65504P2536LCounter = -1;
         public boolean isIp65504P2536LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2536LCounter != sharedCounter;
            localIp65504P2536LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2536_L_LEN = 2;
  	/**
	 * serializeIp65504P2536L
	 */
	protected void serializeIp65504P2536L(short ip65504P2536L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2536L,IP_65504_P_2536_L_LEN)
                  ,beginIp65504P2536L
                  ,IP_65504_P_2536_L_LEN
                 );
            localIp65504P2536LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2536LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2536L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2536L() {	 
			return (getShort(beginIp65504P2536L));
   	}
         int localIp65504P2537SCounter = -1;
         public boolean isIp65504P2537SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2537SCounter != sharedCounter;
            localIp65504P2537SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2537_S_LEN = 2;
  	/**
	 * serializeIp65504P2537S
	 */
	protected void serializeIp65504P2537S(short ip65504P2537S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2537S,IP_65504_P_2537_S_LEN)
                  ,beginIp65504P2537S
                  ,IP_65504_P_2537_S_LEN
                 );
            localIp65504P2537SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2537SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2537S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2537S() {	 
			return (getShort(beginIp65504P2537S));
   	}
         int localIp65504P2537LCounter = -1;
         public boolean isIp65504P2537LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2537LCounter != sharedCounter;
            localIp65504P2537LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2537_L_LEN = 2;
  	/**
	 * serializeIp65504P2537L
	 */
	protected void serializeIp65504P2537L(short ip65504P2537L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2537L,IP_65504_P_2537_L_LEN)
                  ,beginIp65504P2537L
                  ,IP_65504_P_2537_L_LEN
                 );
            localIp65504P2537LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2537LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2537L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2537L() {	 
			return (getShort(beginIp65504P2537L));
   	}
         int localIp65504P2538SCounter = -1;
         public boolean isIp65504P2538SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2538SCounter != sharedCounter;
            localIp65504P2538SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2538_S_LEN = 2;
  	/**
	 * serializeIp65504P2538S
	 */
	protected void serializeIp65504P2538S(short ip65504P2538S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2538S,IP_65504_P_2538_S_LEN)
                  ,beginIp65504P2538S
                  ,IP_65504_P_2538_S_LEN
                 );
            localIp65504P2538SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2538SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2538S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2538S() {	 
			return (getShort(beginIp65504P2538S));
   	}
         int localIp65504P2538LCounter = -1;
         public boolean isIp65504P2538LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2538LCounter != sharedCounter;
            localIp65504P2538LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2538_L_LEN = 2;
  	/**
	 * serializeIp65504P2538L
	 */
	protected void serializeIp65504P2538L(short ip65504P2538L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2538L,IP_65504_P_2538_L_LEN)
                  ,beginIp65504P2538L
                  ,IP_65504_P_2538_L_LEN
                 );
            localIp65504P2538LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2538LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2538L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2538L() {	 
			return (getShort(beginIp65504P2538L));
   	}
         int localIp65504P2539SCounter = -1;
         public boolean isIp65504P2539SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2539SCounter != sharedCounter;
            localIp65504P2539SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2539_S_LEN = 2;
  	/**
	 * serializeIp65504P2539S
	 */
	protected void serializeIp65504P2539S(short ip65504P2539S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2539S,IP_65504_P_2539_S_LEN)
                  ,beginIp65504P2539S
                  ,IP_65504_P_2539_S_LEN
                 );
            localIp65504P2539SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2539SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2539S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2539S() {	 
			return (getShort(beginIp65504P2539S));
   	}
         int localIp65504P2539LCounter = -1;
         public boolean isIp65504P2539LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2539LCounter != sharedCounter;
            localIp65504P2539LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2539_L_LEN = 2;
  	/**
	 * serializeIp65504P2539L
	 */
	protected void serializeIp65504P2539L(short ip65504P2539L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2539L,IP_65504_P_2539_L_LEN)
                  ,beginIp65504P2539L
                  ,IP_65504_P_2539_L_LEN
                 );
            localIp65504P2539LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2539LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2539L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2539L() {	 
			return (getShort(beginIp65504P2539L));
   	}
         int localIp65504P2540SCounter = -1;
         public boolean isIp65504P2540SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2540SCounter != sharedCounter;
            localIp65504P2540SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2540_S_LEN = 2;
  	/**
	 * serializeIp65504P2540S
	 */
	protected void serializeIp65504P2540S(short ip65504P2540S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2540S,IP_65504_P_2540_S_LEN)
                  ,beginIp65504P2540S
                  ,IP_65504_P_2540_S_LEN
                 );
            localIp65504P2540SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2540SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2540S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2540S() {	 
			return (getShort(beginIp65504P2540S));
   	}
         int localIp65504P2540LCounter = -1;
         public boolean isIp65504P2540LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2540LCounter != sharedCounter;
            localIp65504P2540LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2540_L_LEN = 2;
  	/**
	 * serializeIp65504P2540L
	 */
	protected void serializeIp65504P2540L(short ip65504P2540L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2540L,IP_65504_P_2540_L_LEN)
                  ,beginIp65504P2540L
                  ,IP_65504_P_2540_L_LEN
                 );
            localIp65504P2540LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2540LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2540L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2540L() {	 
			return (getShort(beginIp65504P2540L));
   	}
         int localIp65504P2541SCounter = -1;
         public boolean isIp65504P2541SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2541SCounter != sharedCounter;
            localIp65504P2541SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2541_S_LEN = 2;
  	/**
	 * serializeIp65504P2541S
	 */
	protected void serializeIp65504P2541S(short ip65504P2541S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2541S,IP_65504_P_2541_S_LEN)
                  ,beginIp65504P2541S
                  ,IP_65504_P_2541_S_LEN
                 );
            localIp65504P2541SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2541SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2541S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2541S() {	 
			return (getShort(beginIp65504P2541S));
   	}
         int localIp65504P2541LCounter = -1;
         public boolean isIp65504P2541LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2541LCounter != sharedCounter;
            localIp65504P2541LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2541_L_LEN = 2;
  	/**
	 * serializeIp65504P2541L
	 */
	protected void serializeIp65504P2541L(short ip65504P2541L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2541L,IP_65504_P_2541_L_LEN)
                  ,beginIp65504P2541L
                  ,IP_65504_P_2541_L_LEN
                 );
            localIp65504P2541LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2541LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2541L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2541L() {	 
			return (getShort(beginIp65504P2541L));
   	}
         int localIp65504P2542SCounter = -1;
         public boolean isIp65504P2542SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2542SCounter != sharedCounter;
            localIp65504P2542SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2542_S_LEN = 2;
  	/**
	 * serializeIp65504P2542S
	 */
	protected void serializeIp65504P2542S(short ip65504P2542S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2542S,IP_65504_P_2542_S_LEN)
                  ,beginIp65504P2542S
                  ,IP_65504_P_2542_S_LEN
                 );
            localIp65504P2542SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2542SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2542S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2542S() {	 
			return (getShort(beginIp65504P2542S));
   	}
         int localIp65504P2542LCounter = -1;
         public boolean isIp65504P2542LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2542LCounter != sharedCounter;
            localIp65504P2542LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2542_L_LEN = 2;
  	/**
	 * serializeIp65504P2542L
	 */
	protected void serializeIp65504P2542L(short ip65504P2542L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2542L,IP_65504_P_2542_L_LEN)
                  ,beginIp65504P2542L
                  ,IP_65504_P_2542_L_LEN
                 );
            localIp65504P2542LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2542LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2542L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2542L() {	 
			return (getShort(beginIp65504P2542L));
   	}




}
  
