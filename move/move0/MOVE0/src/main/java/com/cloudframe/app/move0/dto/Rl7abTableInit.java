package com.cloudframe.app.move0.dto;

/**
*  The class Rl7abTableInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;


@Data
public class Rl7abTableInit extends Rl7abTableInitSerialized {
   











				@Getter @Setter private Rl7abTableInfo rl7abTableInfo = new Rl7abTableInfo();
	
	/**
	* Constructor for Rl7abTableInit
	**/
    public Rl7abTableInit() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getRl7abTableInfo().setParent(this,getStartOffset() + 128);
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





}
  
