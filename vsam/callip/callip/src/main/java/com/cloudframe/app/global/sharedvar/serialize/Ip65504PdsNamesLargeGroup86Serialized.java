package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup86Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup86Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup86Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_86_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2636S;
            protected  int beginIp65504P2636L;
            protected  int beginIp65504P2637S;
            protected  int beginIp65504P2637L;
            protected  int beginIp65504P2638S;
            protected  int beginIp65504P2638L;
            protected  int beginIp65504P2639S;
            protected  int beginIp65504P2639L;
            protected  int beginIp65504P2640S;
            protected  int beginIp65504P2640L;
            protected  int beginIp65504P2641S;
            protected  int beginIp65504P2641L;
            protected  int beginIp65504P2642S;
            protected  int beginIp65504P2642L;
            protected  int beginIp65504P2643S;
            protected  int beginIp65504P2643L;
            protected  int beginIp65504P2644S;
            protected  int beginIp65504P2644L;
            protected  int beginIp65504P2645S;
            protected  int beginIp65504P2645L;
            protected  int beginIp65504P2646S;
            protected  int beginIp65504P2646L;
            protected  int beginIp65504P2647S;
            protected  int beginIp65504P2647L;
            protected  int beginIp65504P2648S;
            protected  int beginIp65504P2648L;
            protected  int beginIp65504P2649S;
            protected  int beginIp65504P2649L;
            protected  int beginIp65504P2650S;
            protected  int beginIp65504P2650L;
            protected  int beginIp65504P2651S;
            protected  int beginIp65504P2651L;
            protected  int beginIp65504P2652S;
            protected  int beginIp65504P2652L;
            protected  int beginIp65504P2653S;
            protected  int beginIp65504P2653L;
            protected  int beginIp65504P2654S;
            protected  int beginIp65504P2654L;
            protected  int beginIp65504P2655S;
            protected  int beginIp65504P2655L;
            protected  int beginIp65504P2656S;
            protected  int beginIp65504P2656L;
            protected  int beginIp65504P2657S;
            protected  int beginIp65504P2657L;
            protected  int beginIp65504P2658S;
            protected  int beginIp65504P2658L;
            protected  int beginIp65504P2659S;
            protected  int beginIp65504P2659L;
            protected  int beginIp65504P2660S;
            protected  int beginIp65504P2660L;
            protected  int beginIp65504P2661S;
            protected  int beginIp65504P2661L;
            protected  int beginIp65504P2662S;
            protected  int beginIp65504P2662L;
            protected  int beginIp65504P2663S;
            protected  int beginIp65504P2663L;
            protected  int beginIp65504P2664S;
            protected  int beginIp65504P2664L;
            protected  int beginIp65504P2665S;
            protected  int beginIp65504P2665L;
            protected  int beginIp65504P2666S;
            protected  int beginIp65504P2666L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup86Serialized
	**/
    public Ip65504PdsNamesLargeGroup86Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup86Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup86Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup86Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,21076); // serialize this field at offset 21076 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup86Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 21076 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup86Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_86_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2636S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2636L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2637S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2637L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2638S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2638L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2639S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2639L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2640S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2640L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2641S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2641L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2642S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2642L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2643S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2643L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2644S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2644L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2645S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2645L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2646S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2646L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2647S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2647L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2648S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2648L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2649S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2649L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2650S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2650L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2651S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2651L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2652S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2652L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2653S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2653L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2654S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2654L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2655S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2655L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2656S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2656L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2657S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2657L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2658S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2658L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2659S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2659L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2660S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2660L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2661S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2661L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2662S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2662L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2663S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2663L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2664S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2664L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2665S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2665L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2666S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2666L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2636SCounter = -1;
         public boolean isIp65504P2636SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2636SCounter != sharedCounter;
            localIp65504P2636SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2636_S_LEN = 2;
  	/**
	 * serializeIp65504P2636S
	 */
	protected void serializeIp65504P2636S(short ip65504P2636S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2636S,IP_65504_P_2636_S_LEN)
                  ,beginIp65504P2636S
                  ,IP_65504_P_2636_S_LEN
                 );
            localIp65504P2636SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2636SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2636S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2636S() {	 
			return (getShort(beginIp65504P2636S));
   	}
         int localIp65504P2636LCounter = -1;
         public boolean isIp65504P2636LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2636LCounter != sharedCounter;
            localIp65504P2636LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2636_L_LEN = 2;
  	/**
	 * serializeIp65504P2636L
	 */
	protected void serializeIp65504P2636L(short ip65504P2636L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2636L,IP_65504_P_2636_L_LEN)
                  ,beginIp65504P2636L
                  ,IP_65504_P_2636_L_LEN
                 );
            localIp65504P2636LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2636LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2636L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2636L() {	 
			return (getShort(beginIp65504P2636L));
   	}
         int localIp65504P2637SCounter = -1;
         public boolean isIp65504P2637SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2637SCounter != sharedCounter;
            localIp65504P2637SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2637_S_LEN = 2;
  	/**
	 * serializeIp65504P2637S
	 */
	protected void serializeIp65504P2637S(short ip65504P2637S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2637S,IP_65504_P_2637_S_LEN)
                  ,beginIp65504P2637S
                  ,IP_65504_P_2637_S_LEN
                 );
            localIp65504P2637SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2637SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2637S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2637S() {	 
			return (getShort(beginIp65504P2637S));
   	}
         int localIp65504P2637LCounter = -1;
         public boolean isIp65504P2637LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2637LCounter != sharedCounter;
            localIp65504P2637LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2637_L_LEN = 2;
  	/**
	 * serializeIp65504P2637L
	 */
	protected void serializeIp65504P2637L(short ip65504P2637L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2637L,IP_65504_P_2637_L_LEN)
                  ,beginIp65504P2637L
                  ,IP_65504_P_2637_L_LEN
                 );
            localIp65504P2637LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2637LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2637L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2637L() {	 
			return (getShort(beginIp65504P2637L));
   	}
         int localIp65504P2638SCounter = -1;
         public boolean isIp65504P2638SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2638SCounter != sharedCounter;
            localIp65504P2638SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2638_S_LEN = 2;
  	/**
	 * serializeIp65504P2638S
	 */
	protected void serializeIp65504P2638S(short ip65504P2638S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2638S,IP_65504_P_2638_S_LEN)
                  ,beginIp65504P2638S
                  ,IP_65504_P_2638_S_LEN
                 );
            localIp65504P2638SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2638SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2638S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2638S() {	 
			return (getShort(beginIp65504P2638S));
   	}
         int localIp65504P2638LCounter = -1;
         public boolean isIp65504P2638LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2638LCounter != sharedCounter;
            localIp65504P2638LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2638_L_LEN = 2;
  	/**
	 * serializeIp65504P2638L
	 */
	protected void serializeIp65504P2638L(short ip65504P2638L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2638L,IP_65504_P_2638_L_LEN)
                  ,beginIp65504P2638L
                  ,IP_65504_P_2638_L_LEN
                 );
            localIp65504P2638LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2638LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2638L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2638L() {	 
			return (getShort(beginIp65504P2638L));
   	}
         int localIp65504P2639SCounter = -1;
         public boolean isIp65504P2639SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2639SCounter != sharedCounter;
            localIp65504P2639SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2639_S_LEN = 2;
  	/**
	 * serializeIp65504P2639S
	 */
	protected void serializeIp65504P2639S(short ip65504P2639S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2639S,IP_65504_P_2639_S_LEN)
                  ,beginIp65504P2639S
                  ,IP_65504_P_2639_S_LEN
                 );
            localIp65504P2639SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2639SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2639S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2639S() {	 
			return (getShort(beginIp65504P2639S));
   	}
         int localIp65504P2639LCounter = -1;
         public boolean isIp65504P2639LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2639LCounter != sharedCounter;
            localIp65504P2639LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2639_L_LEN = 2;
  	/**
	 * serializeIp65504P2639L
	 */
	protected void serializeIp65504P2639L(short ip65504P2639L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2639L,IP_65504_P_2639_L_LEN)
                  ,beginIp65504P2639L
                  ,IP_65504_P_2639_L_LEN
                 );
            localIp65504P2639LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2639LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2639L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2639L() {	 
			return (getShort(beginIp65504P2639L));
   	}
         int localIp65504P2640SCounter = -1;
         public boolean isIp65504P2640SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2640SCounter != sharedCounter;
            localIp65504P2640SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2640_S_LEN = 2;
  	/**
	 * serializeIp65504P2640S
	 */
	protected void serializeIp65504P2640S(short ip65504P2640S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2640S,IP_65504_P_2640_S_LEN)
                  ,beginIp65504P2640S
                  ,IP_65504_P_2640_S_LEN
                 );
            localIp65504P2640SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2640SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2640S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2640S() {	 
			return (getShort(beginIp65504P2640S));
   	}
         int localIp65504P2640LCounter = -1;
         public boolean isIp65504P2640LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2640LCounter != sharedCounter;
            localIp65504P2640LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2640_L_LEN = 2;
  	/**
	 * serializeIp65504P2640L
	 */
	protected void serializeIp65504P2640L(short ip65504P2640L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2640L,IP_65504_P_2640_L_LEN)
                  ,beginIp65504P2640L
                  ,IP_65504_P_2640_L_LEN
                 );
            localIp65504P2640LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2640LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2640L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2640L() {	 
			return (getShort(beginIp65504P2640L));
   	}
         int localIp65504P2641SCounter = -1;
         public boolean isIp65504P2641SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2641SCounter != sharedCounter;
            localIp65504P2641SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2641_S_LEN = 2;
  	/**
	 * serializeIp65504P2641S
	 */
	protected void serializeIp65504P2641S(short ip65504P2641S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2641S,IP_65504_P_2641_S_LEN)
                  ,beginIp65504P2641S
                  ,IP_65504_P_2641_S_LEN
                 );
            localIp65504P2641SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2641SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2641S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2641S() {	 
			return (getShort(beginIp65504P2641S));
   	}
         int localIp65504P2641LCounter = -1;
         public boolean isIp65504P2641LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2641LCounter != sharedCounter;
            localIp65504P2641LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2641_L_LEN = 2;
  	/**
	 * serializeIp65504P2641L
	 */
	protected void serializeIp65504P2641L(short ip65504P2641L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2641L,IP_65504_P_2641_L_LEN)
                  ,beginIp65504P2641L
                  ,IP_65504_P_2641_L_LEN
                 );
            localIp65504P2641LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2641LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2641L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2641L() {	 
			return (getShort(beginIp65504P2641L));
   	}
         int localIp65504P2642SCounter = -1;
         public boolean isIp65504P2642SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2642SCounter != sharedCounter;
            localIp65504P2642SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2642_S_LEN = 2;
  	/**
	 * serializeIp65504P2642S
	 */
	protected void serializeIp65504P2642S(short ip65504P2642S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2642S,IP_65504_P_2642_S_LEN)
                  ,beginIp65504P2642S
                  ,IP_65504_P_2642_S_LEN
                 );
            localIp65504P2642SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2642SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2642S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2642S() {	 
			return (getShort(beginIp65504P2642S));
   	}
         int localIp65504P2642LCounter = -1;
         public boolean isIp65504P2642LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2642LCounter != sharedCounter;
            localIp65504P2642LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2642_L_LEN = 2;
  	/**
	 * serializeIp65504P2642L
	 */
	protected void serializeIp65504P2642L(short ip65504P2642L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2642L,IP_65504_P_2642_L_LEN)
                  ,beginIp65504P2642L
                  ,IP_65504_P_2642_L_LEN
                 );
            localIp65504P2642LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2642LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2642L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2642L() {	 
			return (getShort(beginIp65504P2642L));
   	}
         int localIp65504P2643SCounter = -1;
         public boolean isIp65504P2643SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2643SCounter != sharedCounter;
            localIp65504P2643SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2643_S_LEN = 2;
  	/**
	 * serializeIp65504P2643S
	 */
	protected void serializeIp65504P2643S(short ip65504P2643S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2643S,IP_65504_P_2643_S_LEN)
                  ,beginIp65504P2643S
                  ,IP_65504_P_2643_S_LEN
                 );
            localIp65504P2643SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2643SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2643S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2643S() {	 
			return (getShort(beginIp65504P2643S));
   	}
         int localIp65504P2643LCounter = -1;
         public boolean isIp65504P2643LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2643LCounter != sharedCounter;
            localIp65504P2643LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2643_L_LEN = 2;
  	/**
	 * serializeIp65504P2643L
	 */
	protected void serializeIp65504P2643L(short ip65504P2643L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2643L,IP_65504_P_2643_L_LEN)
                  ,beginIp65504P2643L
                  ,IP_65504_P_2643_L_LEN
                 );
            localIp65504P2643LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2643LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2643L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2643L() {	 
			return (getShort(beginIp65504P2643L));
   	}
         int localIp65504P2644SCounter = -1;
         public boolean isIp65504P2644SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2644SCounter != sharedCounter;
            localIp65504P2644SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2644_S_LEN = 2;
  	/**
	 * serializeIp65504P2644S
	 */
	protected void serializeIp65504P2644S(short ip65504P2644S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2644S,IP_65504_P_2644_S_LEN)
                  ,beginIp65504P2644S
                  ,IP_65504_P_2644_S_LEN
                 );
            localIp65504P2644SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2644SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2644S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2644S() {	 
			return (getShort(beginIp65504P2644S));
   	}
         int localIp65504P2644LCounter = -1;
         public boolean isIp65504P2644LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2644LCounter != sharedCounter;
            localIp65504P2644LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2644_L_LEN = 2;
  	/**
	 * serializeIp65504P2644L
	 */
	protected void serializeIp65504P2644L(short ip65504P2644L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2644L,IP_65504_P_2644_L_LEN)
                  ,beginIp65504P2644L
                  ,IP_65504_P_2644_L_LEN
                 );
            localIp65504P2644LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2644LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2644L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2644L() {	 
			return (getShort(beginIp65504P2644L));
   	}
         int localIp65504P2645SCounter = -1;
         public boolean isIp65504P2645SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2645SCounter != sharedCounter;
            localIp65504P2645SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2645_S_LEN = 2;
  	/**
	 * serializeIp65504P2645S
	 */
	protected void serializeIp65504P2645S(short ip65504P2645S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2645S,IP_65504_P_2645_S_LEN)
                  ,beginIp65504P2645S
                  ,IP_65504_P_2645_S_LEN
                 );
            localIp65504P2645SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2645SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2645S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2645S() {	 
			return (getShort(beginIp65504P2645S));
   	}
         int localIp65504P2645LCounter = -1;
         public boolean isIp65504P2645LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2645LCounter != sharedCounter;
            localIp65504P2645LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2645_L_LEN = 2;
  	/**
	 * serializeIp65504P2645L
	 */
	protected void serializeIp65504P2645L(short ip65504P2645L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2645L,IP_65504_P_2645_L_LEN)
                  ,beginIp65504P2645L
                  ,IP_65504_P_2645_L_LEN
                 );
            localIp65504P2645LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2645LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2645L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2645L() {	 
			return (getShort(beginIp65504P2645L));
   	}
         int localIp65504P2646SCounter = -1;
         public boolean isIp65504P2646SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2646SCounter != sharedCounter;
            localIp65504P2646SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2646_S_LEN = 2;
  	/**
	 * serializeIp65504P2646S
	 */
	protected void serializeIp65504P2646S(short ip65504P2646S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2646S,IP_65504_P_2646_S_LEN)
                  ,beginIp65504P2646S
                  ,IP_65504_P_2646_S_LEN
                 );
            localIp65504P2646SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2646SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2646S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2646S() {	 
			return (getShort(beginIp65504P2646S));
   	}
         int localIp65504P2646LCounter = -1;
         public boolean isIp65504P2646LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2646LCounter != sharedCounter;
            localIp65504P2646LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2646_L_LEN = 2;
  	/**
	 * serializeIp65504P2646L
	 */
	protected void serializeIp65504P2646L(short ip65504P2646L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2646L,IP_65504_P_2646_L_LEN)
                  ,beginIp65504P2646L
                  ,IP_65504_P_2646_L_LEN
                 );
            localIp65504P2646LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2646LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2646L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2646L() {	 
			return (getShort(beginIp65504P2646L));
   	}
         int localIp65504P2647SCounter = -1;
         public boolean isIp65504P2647SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2647SCounter != sharedCounter;
            localIp65504P2647SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2647_S_LEN = 2;
  	/**
	 * serializeIp65504P2647S
	 */
	protected void serializeIp65504P2647S(short ip65504P2647S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2647S,IP_65504_P_2647_S_LEN)
                  ,beginIp65504P2647S
                  ,IP_65504_P_2647_S_LEN
                 );
            localIp65504P2647SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2647SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2647S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2647S() {	 
			return (getShort(beginIp65504P2647S));
   	}
         int localIp65504P2647LCounter = -1;
         public boolean isIp65504P2647LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2647LCounter != sharedCounter;
            localIp65504P2647LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2647_L_LEN = 2;
  	/**
	 * serializeIp65504P2647L
	 */
	protected void serializeIp65504P2647L(short ip65504P2647L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2647L,IP_65504_P_2647_L_LEN)
                  ,beginIp65504P2647L
                  ,IP_65504_P_2647_L_LEN
                 );
            localIp65504P2647LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2647LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2647L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2647L() {	 
			return (getShort(beginIp65504P2647L));
   	}
         int localIp65504P2648SCounter = -1;
         public boolean isIp65504P2648SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2648SCounter != sharedCounter;
            localIp65504P2648SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2648_S_LEN = 2;
  	/**
	 * serializeIp65504P2648S
	 */
	protected void serializeIp65504P2648S(short ip65504P2648S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2648S,IP_65504_P_2648_S_LEN)
                  ,beginIp65504P2648S
                  ,IP_65504_P_2648_S_LEN
                 );
            localIp65504P2648SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2648SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2648S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2648S() {	 
			return (getShort(beginIp65504P2648S));
   	}
         int localIp65504P2648LCounter = -1;
         public boolean isIp65504P2648LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2648LCounter != sharedCounter;
            localIp65504P2648LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2648_L_LEN = 2;
  	/**
	 * serializeIp65504P2648L
	 */
	protected void serializeIp65504P2648L(short ip65504P2648L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2648L,IP_65504_P_2648_L_LEN)
                  ,beginIp65504P2648L
                  ,IP_65504_P_2648_L_LEN
                 );
            localIp65504P2648LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2648LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2648L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2648L() {	 
			return (getShort(beginIp65504P2648L));
   	}
         int localIp65504P2649SCounter = -1;
         public boolean isIp65504P2649SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2649SCounter != sharedCounter;
            localIp65504P2649SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2649_S_LEN = 2;
  	/**
	 * serializeIp65504P2649S
	 */
	protected void serializeIp65504P2649S(short ip65504P2649S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2649S,IP_65504_P_2649_S_LEN)
                  ,beginIp65504P2649S
                  ,IP_65504_P_2649_S_LEN
                 );
            localIp65504P2649SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2649SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2649S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2649S() {	 
			return (getShort(beginIp65504P2649S));
   	}
         int localIp65504P2649LCounter = -1;
         public boolean isIp65504P2649LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2649LCounter != sharedCounter;
            localIp65504P2649LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2649_L_LEN = 2;
  	/**
	 * serializeIp65504P2649L
	 */
	protected void serializeIp65504P2649L(short ip65504P2649L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2649L,IP_65504_P_2649_L_LEN)
                  ,beginIp65504P2649L
                  ,IP_65504_P_2649_L_LEN
                 );
            localIp65504P2649LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2649LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2649L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2649L() {	 
			return (getShort(beginIp65504P2649L));
   	}
         int localIp65504P2650SCounter = -1;
         public boolean isIp65504P2650SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2650SCounter != sharedCounter;
            localIp65504P2650SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2650_S_LEN = 2;
  	/**
	 * serializeIp65504P2650S
	 */
	protected void serializeIp65504P2650S(short ip65504P2650S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2650S,IP_65504_P_2650_S_LEN)
                  ,beginIp65504P2650S
                  ,IP_65504_P_2650_S_LEN
                 );
            localIp65504P2650SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2650SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2650S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2650S() {	 
			return (getShort(beginIp65504P2650S));
   	}
         int localIp65504P2650LCounter = -1;
         public boolean isIp65504P2650LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2650LCounter != sharedCounter;
            localIp65504P2650LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2650_L_LEN = 2;
  	/**
	 * serializeIp65504P2650L
	 */
	protected void serializeIp65504P2650L(short ip65504P2650L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2650L,IP_65504_P_2650_L_LEN)
                  ,beginIp65504P2650L
                  ,IP_65504_P_2650_L_LEN
                 );
            localIp65504P2650LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2650LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2650L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2650L() {	 
			return (getShort(beginIp65504P2650L));
   	}
         int localIp65504P2651SCounter = -1;
         public boolean isIp65504P2651SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2651SCounter != sharedCounter;
            localIp65504P2651SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2651_S_LEN = 2;
  	/**
	 * serializeIp65504P2651S
	 */
	protected void serializeIp65504P2651S(short ip65504P2651S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2651S,IP_65504_P_2651_S_LEN)
                  ,beginIp65504P2651S
                  ,IP_65504_P_2651_S_LEN
                 );
            localIp65504P2651SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2651SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2651S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2651S() {	 
			return (getShort(beginIp65504P2651S));
   	}
         int localIp65504P2651LCounter = -1;
         public boolean isIp65504P2651LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2651LCounter != sharedCounter;
            localIp65504P2651LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2651_L_LEN = 2;
  	/**
	 * serializeIp65504P2651L
	 */
	protected void serializeIp65504P2651L(short ip65504P2651L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2651L,IP_65504_P_2651_L_LEN)
                  ,beginIp65504P2651L
                  ,IP_65504_P_2651_L_LEN
                 );
            localIp65504P2651LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2651LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2651L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2651L() {	 
			return (getShort(beginIp65504P2651L));
   	}
         int localIp65504P2652SCounter = -1;
         public boolean isIp65504P2652SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2652SCounter != sharedCounter;
            localIp65504P2652SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2652_S_LEN = 2;
  	/**
	 * serializeIp65504P2652S
	 */
	protected void serializeIp65504P2652S(short ip65504P2652S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2652S,IP_65504_P_2652_S_LEN)
                  ,beginIp65504P2652S
                  ,IP_65504_P_2652_S_LEN
                 );
            localIp65504P2652SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2652SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2652S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2652S() {	 
			return (getShort(beginIp65504P2652S));
   	}
         int localIp65504P2652LCounter = -1;
         public boolean isIp65504P2652LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2652LCounter != sharedCounter;
            localIp65504P2652LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2652_L_LEN = 2;
  	/**
	 * serializeIp65504P2652L
	 */
	protected void serializeIp65504P2652L(short ip65504P2652L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2652L,IP_65504_P_2652_L_LEN)
                  ,beginIp65504P2652L
                  ,IP_65504_P_2652_L_LEN
                 );
            localIp65504P2652LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2652LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2652L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2652L() {	 
			return (getShort(beginIp65504P2652L));
   	}
         int localIp65504P2653SCounter = -1;
         public boolean isIp65504P2653SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2653SCounter != sharedCounter;
            localIp65504P2653SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2653_S_LEN = 2;
  	/**
	 * serializeIp65504P2653S
	 */
	protected void serializeIp65504P2653S(short ip65504P2653S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2653S,IP_65504_P_2653_S_LEN)
                  ,beginIp65504P2653S
                  ,IP_65504_P_2653_S_LEN
                 );
            localIp65504P2653SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2653SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2653S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2653S() {	 
			return (getShort(beginIp65504P2653S));
   	}
         int localIp65504P2653LCounter = -1;
         public boolean isIp65504P2653LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2653LCounter != sharedCounter;
            localIp65504P2653LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2653_L_LEN = 2;
  	/**
	 * serializeIp65504P2653L
	 */
	protected void serializeIp65504P2653L(short ip65504P2653L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2653L,IP_65504_P_2653_L_LEN)
                  ,beginIp65504P2653L
                  ,IP_65504_P_2653_L_LEN
                 );
            localIp65504P2653LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2653LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2653L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2653L() {	 
			return (getShort(beginIp65504P2653L));
   	}
         int localIp65504P2654SCounter = -1;
         public boolean isIp65504P2654SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2654SCounter != sharedCounter;
            localIp65504P2654SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2654_S_LEN = 2;
  	/**
	 * serializeIp65504P2654S
	 */
	protected void serializeIp65504P2654S(short ip65504P2654S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2654S,IP_65504_P_2654_S_LEN)
                  ,beginIp65504P2654S
                  ,IP_65504_P_2654_S_LEN
                 );
            localIp65504P2654SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2654SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2654S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2654S() {	 
			return (getShort(beginIp65504P2654S));
   	}
         int localIp65504P2654LCounter = -1;
         public boolean isIp65504P2654LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2654LCounter != sharedCounter;
            localIp65504P2654LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2654_L_LEN = 2;
  	/**
	 * serializeIp65504P2654L
	 */
	protected void serializeIp65504P2654L(short ip65504P2654L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2654L,IP_65504_P_2654_L_LEN)
                  ,beginIp65504P2654L
                  ,IP_65504_P_2654_L_LEN
                 );
            localIp65504P2654LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2654LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2654L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2654L() {	 
			return (getShort(beginIp65504P2654L));
   	}
         int localIp65504P2655SCounter = -1;
         public boolean isIp65504P2655SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2655SCounter != sharedCounter;
            localIp65504P2655SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2655_S_LEN = 2;
  	/**
	 * serializeIp65504P2655S
	 */
	protected void serializeIp65504P2655S(short ip65504P2655S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2655S,IP_65504_P_2655_S_LEN)
                  ,beginIp65504P2655S
                  ,IP_65504_P_2655_S_LEN
                 );
            localIp65504P2655SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2655SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2655S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2655S() {	 
			return (getShort(beginIp65504P2655S));
   	}
         int localIp65504P2655LCounter = -1;
         public boolean isIp65504P2655LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2655LCounter != sharedCounter;
            localIp65504P2655LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2655_L_LEN = 2;
  	/**
	 * serializeIp65504P2655L
	 */
	protected void serializeIp65504P2655L(short ip65504P2655L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2655L,IP_65504_P_2655_L_LEN)
                  ,beginIp65504P2655L
                  ,IP_65504_P_2655_L_LEN
                 );
            localIp65504P2655LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2655LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2655L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2655L() {	 
			return (getShort(beginIp65504P2655L));
   	}
         int localIp65504P2656SCounter = -1;
         public boolean isIp65504P2656SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2656SCounter != sharedCounter;
            localIp65504P2656SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2656_S_LEN = 2;
  	/**
	 * serializeIp65504P2656S
	 */
	protected void serializeIp65504P2656S(short ip65504P2656S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2656S,IP_65504_P_2656_S_LEN)
                  ,beginIp65504P2656S
                  ,IP_65504_P_2656_S_LEN
                 );
            localIp65504P2656SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2656SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2656S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2656S() {	 
			return (getShort(beginIp65504P2656S));
   	}
         int localIp65504P2656LCounter = -1;
         public boolean isIp65504P2656LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2656LCounter != sharedCounter;
            localIp65504P2656LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2656_L_LEN = 2;
  	/**
	 * serializeIp65504P2656L
	 */
	protected void serializeIp65504P2656L(short ip65504P2656L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2656L,IP_65504_P_2656_L_LEN)
                  ,beginIp65504P2656L
                  ,IP_65504_P_2656_L_LEN
                 );
            localIp65504P2656LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2656LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2656L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2656L() {	 
			return (getShort(beginIp65504P2656L));
   	}
         int localIp65504P2657SCounter = -1;
         public boolean isIp65504P2657SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2657SCounter != sharedCounter;
            localIp65504P2657SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2657_S_LEN = 2;
  	/**
	 * serializeIp65504P2657S
	 */
	protected void serializeIp65504P2657S(short ip65504P2657S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2657S,IP_65504_P_2657_S_LEN)
                  ,beginIp65504P2657S
                  ,IP_65504_P_2657_S_LEN
                 );
            localIp65504P2657SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2657SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2657S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2657S() {	 
			return (getShort(beginIp65504P2657S));
   	}
         int localIp65504P2657LCounter = -1;
         public boolean isIp65504P2657LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2657LCounter != sharedCounter;
            localIp65504P2657LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2657_L_LEN = 2;
  	/**
	 * serializeIp65504P2657L
	 */
	protected void serializeIp65504P2657L(short ip65504P2657L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2657L,IP_65504_P_2657_L_LEN)
                  ,beginIp65504P2657L
                  ,IP_65504_P_2657_L_LEN
                 );
            localIp65504P2657LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2657LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2657L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2657L() {	 
			return (getShort(beginIp65504P2657L));
   	}
         int localIp65504P2658SCounter = -1;
         public boolean isIp65504P2658SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2658SCounter != sharedCounter;
            localIp65504P2658SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2658_S_LEN = 2;
  	/**
	 * serializeIp65504P2658S
	 */
	protected void serializeIp65504P2658S(short ip65504P2658S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2658S,IP_65504_P_2658_S_LEN)
                  ,beginIp65504P2658S
                  ,IP_65504_P_2658_S_LEN
                 );
            localIp65504P2658SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2658SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2658S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2658S() {	 
			return (getShort(beginIp65504P2658S));
   	}
         int localIp65504P2658LCounter = -1;
         public boolean isIp65504P2658LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2658LCounter != sharedCounter;
            localIp65504P2658LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2658_L_LEN = 2;
  	/**
	 * serializeIp65504P2658L
	 */
	protected void serializeIp65504P2658L(short ip65504P2658L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2658L,IP_65504_P_2658_L_LEN)
                  ,beginIp65504P2658L
                  ,IP_65504_P_2658_L_LEN
                 );
            localIp65504P2658LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2658LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2658L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2658L() {	 
			return (getShort(beginIp65504P2658L));
   	}
         int localIp65504P2659SCounter = -1;
         public boolean isIp65504P2659SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2659SCounter != sharedCounter;
            localIp65504P2659SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2659_S_LEN = 2;
  	/**
	 * serializeIp65504P2659S
	 */
	protected void serializeIp65504P2659S(short ip65504P2659S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2659S,IP_65504_P_2659_S_LEN)
                  ,beginIp65504P2659S
                  ,IP_65504_P_2659_S_LEN
                 );
            localIp65504P2659SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2659SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2659S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2659S() {	 
			return (getShort(beginIp65504P2659S));
   	}
         int localIp65504P2659LCounter = -1;
         public boolean isIp65504P2659LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2659LCounter != sharedCounter;
            localIp65504P2659LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2659_L_LEN = 2;
  	/**
	 * serializeIp65504P2659L
	 */
	protected void serializeIp65504P2659L(short ip65504P2659L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2659L,IP_65504_P_2659_L_LEN)
                  ,beginIp65504P2659L
                  ,IP_65504_P_2659_L_LEN
                 );
            localIp65504P2659LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2659LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2659L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2659L() {	 
			return (getShort(beginIp65504P2659L));
   	}
         int localIp65504P2660SCounter = -1;
         public boolean isIp65504P2660SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2660SCounter != sharedCounter;
            localIp65504P2660SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2660_S_LEN = 2;
  	/**
	 * serializeIp65504P2660S
	 */
	protected void serializeIp65504P2660S(short ip65504P2660S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2660S,IP_65504_P_2660_S_LEN)
                  ,beginIp65504P2660S
                  ,IP_65504_P_2660_S_LEN
                 );
            localIp65504P2660SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2660SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2660S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2660S() {	 
			return (getShort(beginIp65504P2660S));
   	}
         int localIp65504P2660LCounter = -1;
         public boolean isIp65504P2660LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2660LCounter != sharedCounter;
            localIp65504P2660LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2660_L_LEN = 2;
  	/**
	 * serializeIp65504P2660L
	 */
	protected void serializeIp65504P2660L(short ip65504P2660L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2660L,IP_65504_P_2660_L_LEN)
                  ,beginIp65504P2660L
                  ,IP_65504_P_2660_L_LEN
                 );
            localIp65504P2660LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2660LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2660L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2660L() {	 
			return (getShort(beginIp65504P2660L));
   	}
         int localIp65504P2661SCounter = -1;
         public boolean isIp65504P2661SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2661SCounter != sharedCounter;
            localIp65504P2661SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2661_S_LEN = 2;
  	/**
	 * serializeIp65504P2661S
	 */
	protected void serializeIp65504P2661S(short ip65504P2661S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2661S,IP_65504_P_2661_S_LEN)
                  ,beginIp65504P2661S
                  ,IP_65504_P_2661_S_LEN
                 );
            localIp65504P2661SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2661SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2661S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2661S() {	 
			return (getShort(beginIp65504P2661S));
   	}
         int localIp65504P2661LCounter = -1;
         public boolean isIp65504P2661LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2661LCounter != sharedCounter;
            localIp65504P2661LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2661_L_LEN = 2;
  	/**
	 * serializeIp65504P2661L
	 */
	protected void serializeIp65504P2661L(short ip65504P2661L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2661L,IP_65504_P_2661_L_LEN)
                  ,beginIp65504P2661L
                  ,IP_65504_P_2661_L_LEN
                 );
            localIp65504P2661LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2661LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2661L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2661L() {	 
			return (getShort(beginIp65504P2661L));
   	}
         int localIp65504P2662SCounter = -1;
         public boolean isIp65504P2662SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2662SCounter != sharedCounter;
            localIp65504P2662SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2662_S_LEN = 2;
  	/**
	 * serializeIp65504P2662S
	 */
	protected void serializeIp65504P2662S(short ip65504P2662S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2662S,IP_65504_P_2662_S_LEN)
                  ,beginIp65504P2662S
                  ,IP_65504_P_2662_S_LEN
                 );
            localIp65504P2662SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2662SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2662S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2662S() {	 
			return (getShort(beginIp65504P2662S));
   	}
         int localIp65504P2662LCounter = -1;
         public boolean isIp65504P2662LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2662LCounter != sharedCounter;
            localIp65504P2662LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2662_L_LEN = 2;
  	/**
	 * serializeIp65504P2662L
	 */
	protected void serializeIp65504P2662L(short ip65504P2662L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2662L,IP_65504_P_2662_L_LEN)
                  ,beginIp65504P2662L
                  ,IP_65504_P_2662_L_LEN
                 );
            localIp65504P2662LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2662LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2662L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2662L() {	 
			return (getShort(beginIp65504P2662L));
   	}
         int localIp65504P2663SCounter = -1;
         public boolean isIp65504P2663SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2663SCounter != sharedCounter;
            localIp65504P2663SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2663_S_LEN = 2;
  	/**
	 * serializeIp65504P2663S
	 */
	protected void serializeIp65504P2663S(short ip65504P2663S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2663S,IP_65504_P_2663_S_LEN)
                  ,beginIp65504P2663S
                  ,IP_65504_P_2663_S_LEN
                 );
            localIp65504P2663SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2663SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2663S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2663S() {	 
			return (getShort(beginIp65504P2663S));
   	}
         int localIp65504P2663LCounter = -1;
         public boolean isIp65504P2663LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2663LCounter != sharedCounter;
            localIp65504P2663LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2663_L_LEN = 2;
  	/**
	 * serializeIp65504P2663L
	 */
	protected void serializeIp65504P2663L(short ip65504P2663L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2663L,IP_65504_P_2663_L_LEN)
                  ,beginIp65504P2663L
                  ,IP_65504_P_2663_L_LEN
                 );
            localIp65504P2663LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2663LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2663L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2663L() {	 
			return (getShort(beginIp65504P2663L));
   	}
         int localIp65504P2664SCounter = -1;
         public boolean isIp65504P2664SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2664SCounter != sharedCounter;
            localIp65504P2664SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2664_S_LEN = 2;
  	/**
	 * serializeIp65504P2664S
	 */
	protected void serializeIp65504P2664S(short ip65504P2664S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2664S,IP_65504_P_2664_S_LEN)
                  ,beginIp65504P2664S
                  ,IP_65504_P_2664_S_LEN
                 );
            localIp65504P2664SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2664SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2664S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2664S() {	 
			return (getShort(beginIp65504P2664S));
   	}
         int localIp65504P2664LCounter = -1;
         public boolean isIp65504P2664LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2664LCounter != sharedCounter;
            localIp65504P2664LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2664_L_LEN = 2;
  	/**
	 * serializeIp65504P2664L
	 */
	protected void serializeIp65504P2664L(short ip65504P2664L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2664L,IP_65504_P_2664_L_LEN)
                  ,beginIp65504P2664L
                  ,IP_65504_P_2664_L_LEN
                 );
            localIp65504P2664LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2664LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2664L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2664L() {	 
			return (getShort(beginIp65504P2664L));
   	}
         int localIp65504P2665SCounter = -1;
         public boolean isIp65504P2665SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2665SCounter != sharedCounter;
            localIp65504P2665SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2665_S_LEN = 2;
  	/**
	 * serializeIp65504P2665S
	 */
	protected void serializeIp65504P2665S(short ip65504P2665S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2665S,IP_65504_P_2665_S_LEN)
                  ,beginIp65504P2665S
                  ,IP_65504_P_2665_S_LEN
                 );
            localIp65504P2665SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2665SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2665S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2665S() {	 
			return (getShort(beginIp65504P2665S));
   	}
         int localIp65504P2665LCounter = -1;
         public boolean isIp65504P2665LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2665LCounter != sharedCounter;
            localIp65504P2665LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2665_L_LEN = 2;
  	/**
	 * serializeIp65504P2665L
	 */
	protected void serializeIp65504P2665L(short ip65504P2665L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2665L,IP_65504_P_2665_L_LEN)
                  ,beginIp65504P2665L
                  ,IP_65504_P_2665_L_LEN
                 );
            localIp65504P2665LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2665LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2665L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2665L() {	 
			return (getShort(beginIp65504P2665L));
   	}
         int localIp65504P2666SCounter = -1;
         public boolean isIp65504P2666SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2666SCounter != sharedCounter;
            localIp65504P2666SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2666_S_LEN = 2;
  	/**
	 * serializeIp65504P2666S
	 */
	protected void serializeIp65504P2666S(short ip65504P2666S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2666S,IP_65504_P_2666_S_LEN)
                  ,beginIp65504P2666S
                  ,IP_65504_P_2666_S_LEN
                 );
            localIp65504P2666SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2666SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2666S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2666S() {	 
			return (getShort(beginIp65504P2666S));
   	}
         int localIp65504P2666LCounter = -1;
         public boolean isIp65504P2666LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2666LCounter != sharedCounter;
            localIp65504P2666LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2666_L_LEN = 2;
  	/**
	 * serializeIp65504P2666L
	 */
	protected void serializeIp65504P2666L(short ip65504P2666L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2666L,IP_65504_P_2666_L_LEN)
                  ,beginIp65504P2666L
                  ,IP_65504_P_2666_L_LEN
                 );
            localIp65504P2666LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2666LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2666L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2666L() {	 
			return (getShort(beginIp65504P2666L));
   	}




}
  
