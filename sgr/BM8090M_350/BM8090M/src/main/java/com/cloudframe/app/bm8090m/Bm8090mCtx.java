package com.cloudframe.app.bm8090m;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.bm8090m.dto.WRespuestaGroup;
import com.cloudframe.app.bm8090m.dto.WMcat3aPe8090m;
import com.cloudframe.app.bm8090m.dto.WMcat3bPe8090m;
import com.cloudframe.app.bm8090m.dto.WtabPartGroup;
import com.cloudframe.app.bm8090m.dto.WMcas3Pe8090m;
import com.cloudframe.app.bm8090m.dto.WTipPerGroup;
import com.cloudframe.app.bm8090m.dto.IoPe8090p;
import com.cloudframe.app.bm8090m.dto.WPartesGroup;
import com.cloudframe.app.bm8090m.dto.Section;
import com.cloudframe.app.bm8090m.dto.WMcas7bPe8090m;
import com.cloudframe.app.bm8090m.dto.WMcas6bPe8090m;
import com.cloudframe.app.bm8090m.dto.WMcas6aPe8090m;
import com.cloudframe.app.bm8090m.dto.Work;
import com.cloudframe.app.bm8090m.dto.WMcas7aPe8090m;
import com.cloudframe.app.bm8090m.dto.WPrimLetra;
import com.cloudframe.app.bm8090m.dto.WRespuestaMrGroup;
import com.cloudframe.app.bm8090m.dto.WMcas3bPe8090m;
import com.cloudframe.app.bm8090m.dto.WRespuestaRGroup;
import com.cloudframe.app.bm8090m.dto.WIniNomaPe8090m;
import com.cloudframe.app.bm8090m.dto.WMcas3aPe8090m;
import com.cloudframe.app.bm8090m.dto.WMcat7bPe8090m;
import com.cloudframe.app.bm8090m.dto.WMcas6Pe8090m;
import com.cloudframe.app.bm8090m.dto.WMcat7aPe8090m;
import com.cloudframe.app.bm8090m.dto.WMcas7Pe8090m;
import com.cloudframe.app.bm8090m.dto.WMcat6Pe8090m;
import com.cloudframe.app.bm8090m.dto.WMcat6bPe8090m;
import com.cloudframe.app.bm8090m.dto.WMcat3Pe8090m;
import com.cloudframe.app.bm8090m.dto.WMcat6aPe8090m;
import com.cloudframe.app.bm8090m.dto.WDatVarPe8090m;
import com.cloudframe.app.bm8090m.dto.WMcat7Pe8090m;


@Context
public class Bm8090mCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    WtabPartGroup wtabPartGroup;
    IoPe8090p ioPe8090p;
    WRespuestaGroup wRespuestaGroup;
    Section section;
    WPartesGroup wPartesGroup;
    WTipPerGroup wTipPerGroup;
    Work work;
    WRespuestaRGroup wRespuestaRGroup;
    WPrimLetra wPrimLetra;
    WRespuestaMrGroup wRespuestaMrGroup;

    int wInoPe8090m;
    int wInpPe8090m;
    int wPartIndex;

    private int rc;

    public GlobalExecutorCtx getGlobalCtx() {
            return globalCtx;
    }

    public void setGlobalCtx(GlobalExecutorCtx globalCtx) {
        this.globalCtx = globalCtx;
    }

    public int getRc() {
        return this.rc;
    }

    public void setRc(int rc) {
        this.rc = rc;
    }



    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }

    boolean doNotSkipUnoUnoUnoPe8090m = true;

    public boolean getDoNotSkipUnoUnoUnoPe8090m() {
        return this.doNotSkipUnoUnoUnoPe8090m;
    }

    public void setDoNotSkipUnoUnoUnoPe8090m(boolean doNotSkipUnoUnoUnoPe8090m) {
            this.doNotSkipUnoUnoUnoPe8090m = doNotSkipUnoUnoUnoPe8090m;
        }
    boolean doNotSkipInvPerActPe8090m = true;

    public boolean getDoNotSkipInvPerActPe8090m() {
        return this.doNotSkipInvPerActPe8090m;
    }

    public void setDoNotSkipInvPerActPe8090m(boolean doNotSkipInvPerActPe8090m) {
            this.doNotSkipInvPerActPe8090m = doNotSkipInvPerActPe8090m;
        }
    boolean doNotSkipStringGuiTrePe8090m = true;

    public boolean getDoNotSkipStringGuiTrePe8090m() {
        return this.doNotSkipStringGuiTrePe8090m;
    }

    public void setDoNotSkipStringGuiTrePe8090m(boolean doNotSkipStringGuiTrePe8090m) {
            this.doNotSkipStringGuiTrePe8090m = doNotSkipStringGuiTrePe8090m;
        }
    boolean doNotSkipStringGuiUnoPe8090m = true;

    public boolean getDoNotSkipStringGuiUnoPe8090m() {
        return this.doNotSkipStringGuiUnoPe8090m;
    }

    public void setDoNotSkipStringGuiUnoPe8090m(boolean doNotSkipStringGuiUnoPe8090m) {
            this.doNotSkipStringGuiUnoPe8090m = doNotSkipStringGuiUnoPe8090m;
        }
    boolean doNotSkipSepGuiPe8090m = true;

    public boolean getDoNotSkipSepGuiPe8090m() {
        return this.doNotSkipSepGuiPe8090m;
    }

    public void setDoNotSkipSepGuiPe8090m(boolean doNotSkipSepGuiPe8090m) {
            this.doNotSkipSepGuiPe8090m = doNotSkipSepGuiPe8090m;
        }
    boolean doNotSkipNomMasPe8090m = true;

    public boolean getDoNotSkipNomMasPe8090m() {
        return this.doNotSkipNomMasPe8090m;
    }

    public void setDoNotSkipNomMasPe8090m(boolean doNotSkipNomMasPe8090m) {
            this.doNotSkipNomMasPe8090m = doNotSkipNomMasPe8090m;
        }
    boolean doNotSkipStringGioUnoPe8090m = true;

    public boolean getDoNotSkipStringGioUnoPe8090m() {
        return this.doNotSkipStringGioUnoPe8090m;
    }

    public void setDoNotSkipStringGioUnoPe8090m(boolean doNotSkipStringGioUnoPe8090m) {
            this.doNotSkipStringGioUnoPe8090m = doNotSkipStringGioUnoPe8090m;
        }
    boolean doNotSkipSepGioPe8090m = true;

    public boolean getDoNotSkipSepGioPe8090m() {
        return this.doNotSkipSepGioPe8090m;
    }

    public void setDoNotSkipSepGioPe8090m(boolean doNotSkipSepGioPe8090m) {
            this.doNotSkipSepGioPe8090m = doNotSkipSepGioPe8090m;
        }
    boolean doNotSkipStringGioTrePe8090m = true;

    public boolean getDoNotSkipStringGioTrePe8090m() {
        return this.doNotSkipStringGioTrePe8090m;
    }

    public void setDoNotSkipStringGioTrePe8090m(boolean doNotSkipStringGioTrePe8090m) {
            this.doNotSkipStringGioTrePe8090m = doNotSkipStringGioTrePe8090m;
        }
    boolean doNotSkipNomOblPe8090m = true;

    public boolean getDoNotSkipNomOblPe8090m() {
        return this.doNotSkipNomOblPe8090m;
    }

    public void setDoNotSkipNomOblPe8090m(boolean doNotSkipNomOblPe8090m) {
            this.doNotSkipNomOblPe8090m = doNotSkipNomOblPe8090m;
        }
    boolean doNotSkipRedGuiPe8090m = true;

    public boolean getDoNotSkipRedGuiPe8090m() {
        return this.doNotSkipRedGuiPe8090m;
    }

    public void setDoNotSkipRedGuiPe8090m(boolean doNotSkipRedGuiPe8090m) {
            this.doNotSkipRedGuiPe8090m = doNotSkipRedGuiPe8090m;
        }
    boolean doNotSkipRedSegApePe8090m = true;

    public boolean getDoNotSkipRedSegApePe8090m() {
        return this.doNotSkipRedSegApePe8090m;
    }

    public void setDoNotSkipRedSegApePe8090m(boolean doNotSkipRedSegApePe8090m) {
            this.doNotSkipRedSegApePe8090m = doNotSkipRedSegApePe8090m;
        }
    boolean doNotSkipRestInpUnoPe8090m = true;

    public boolean getDoNotSkipRestInpUnoPe8090m() {
        return this.doNotSkipRestInpUnoPe8090m;
    }

    public void setDoNotSkipRestInpUnoPe8090m(boolean doNotSkipRestInpUnoPe8090m) {
            this.doNotSkipRestInpUnoPe8090m = doNotSkipRestInpUnoPe8090m;
        }
    boolean doNotSkipRedNomIniPe8090m = true;

    public boolean getDoNotSkipRedNomIniPe8090m() {
        return this.doNotSkipRedNomIniPe8090m;
    }

    public void setDoNotSkipRedNomIniPe8090m(boolean doNotSkipRedNomIniPe8090m) {
            this.doNotSkipRedNomIniPe8090m = doNotSkipRedNomIniPe8090m;
        }
    boolean doNotSkipRestInpDosPe8090m = true;

    public boolean getDoNotSkipRestInpDosPe8090m() {
        return this.doNotSkipRestInpDosPe8090m;
    }

    public void setDoNotSkipRestInpDosPe8090m(boolean doNotSkipRestInpDosPe8090m) {
            this.doNotSkipRestInpDosPe8090m = doNotSkipRestInpDosPe8090m;
        }
    boolean doNotSkipRedPersoPe8090m = true;

    public boolean getDoNotSkipRedPersoPe8090m() {
        return this.doNotSkipRedPersoPe8090m;
    }

    public void setDoNotSkipRedPersoPe8090m(boolean doNotSkipRedPersoPe8090m) {
            this.doNotSkipRedPersoPe8090m = doNotSkipRedPersoPe8090m;
        }
    boolean doNotSkipRestInpTresPe8090m = true;

    public boolean getDoNotSkipRestInpTresPe8090m() {
        return this.doNotSkipRestInpTresPe8090m;
    }

    public void setDoNotSkipRestInpTresPe8090m(boolean doNotSkipRestInpTresPe8090m) {
            this.doNotSkipRestInpTresPe8090m = doNotSkipRestInpTresPe8090m;
        }
    boolean doNotSkipElimPriPerPe8090m = true;

    public boolean getDoNotSkipElimPriPerPe8090m() {
        return this.doNotSkipElimPriPerPe8090m;
    }

    public void setDoNotSkipElimPriPerPe8090m(boolean doNotSkipElimPriPerPe8090m) {
            this.doNotSkipElimPriPerPe8090m = doNotSkipElimPriPerPe8090m;
        }
    boolean doNotSkipSelTratoPe8090m = true;

    public boolean getDoNotSkipSelTratoPe8090m() {
        return this.doNotSkipSelTratoPe8090m;
    }

    public void setDoNotSkipSelTratoPe8090m(boolean doNotSkipSelTratoPe8090m) {
            this.doNotSkipSelTratoPe8090m = doNotSkipSelTratoPe8090m;
        }
    boolean doNotSkipTratoPriPe8090m = true;

    public boolean getDoNotSkipTratoPriPe8090m() {
        return this.doNotSkipTratoPriPe8090m;
    }

    public void setDoNotSkipTratoPriPe8090m(boolean doNotSkipTratoPriPe8090m) {
            this.doNotSkipTratoPriPe8090m = doNotSkipTratoPriPe8090m;
        }
    boolean doNotSkipVerWtipPe8090m = true;

    public boolean getDoNotSkipVerWtipPe8090m() {
        return this.doNotSkipVerWtipPe8090m;
    }

    public void setDoNotSkipVerWtipPe8090m(boolean doNotSkipVerWtipPe8090m) {
            this.doNotSkipVerWtipPe8090m = doNotSkipVerWtipPe8090m;
        }
    boolean doNotSkipSelJurPe8090m = true;

    public boolean getDoNotSkipSelJurPe8090m() {
        return this.doNotSkipSelJurPe8090m;
    }

    public void setDoNotSkipSelJurPe8090m(boolean doNotSkipSelJurPe8090m) {
            this.doNotSkipSelJurPe8090m = doNotSkipSelJurPe8090m;
        }
    boolean doNotSkipPe8090m = true;

    public boolean getDoNotSkipPe8090m() {
        return this.doNotSkipPe8090m;
    }

    public void setDoNotSkipPe8090m(boolean doNotSkipPe8090m) {
            this.doNotSkipPe8090m = doNotSkipPe8090m;
        }
    boolean doNotSkipUnoUnoDosPe8090m = true;

    public boolean getDoNotSkipUnoUnoDosPe8090m() {
        return this.doNotSkipUnoUnoDosPe8090m;
    }

    public void setDoNotSkipUnoUnoDosPe8090m(boolean doNotSkipUnoUnoDosPe8090m) {
            this.doNotSkipUnoUnoDosPe8090m = doNotSkipUnoUnoDosPe8090m;
        }
    boolean doNotSkipPe8090mTRATO2 = true;

    public boolean getDoNotSkipPe8090mTRATO2() {
        return this.doNotSkipPe8090mTRATO2;
    }

    public void setDoNotSkipPe8090mTRATO2(boolean doNotSkipPe8090mTRATO2) {
            this.doNotSkipPe8090mTRATO2 = doNotSkipPe8090mTRATO2;
        }
    boolean doNotSkipUnoDosUnoPe8090m = true;

    public boolean getDoNotSkipUnoDosUnoPe8090m() {
        return this.doNotSkipUnoDosUnoPe8090m;
    }

    public void setDoNotSkipUnoDosUnoPe8090m(boolean doNotSkipUnoDosUnoPe8090m) {
            this.doNotSkipUnoDosUnoPe8090m = doNotSkipUnoDosUnoPe8090m;
        }
    boolean doNotSkipUnoDosDosPe8090m = true;

    public boolean getDoNotSkipUnoDosDosPe8090m() {
        return this.doNotSkipUnoDosDosPe8090m;
    }

    public void setDoNotSkipUnoDosDosPe8090m(boolean doNotSkipUnoDosDosPe8090m) {
            this.doNotSkipUnoDosDosPe8090m = doNotSkipUnoDosDosPe8090m;
        }
    boolean doNotSkipPe8090mTRATO3 = true;

    public boolean getDoNotSkipPe8090mTRATO3() {
        return this.doNotSkipPe8090mTRATO3;
    }

    public void setDoNotSkipPe8090mTRATO3(boolean doNotSkipPe8090mTRATO3) {
            this.doNotSkipPe8090mTRATO3 = doNotSkipPe8090mTRATO3;
        }
    boolean doNotSkipPe8090mTRATO4 = true;

    public boolean getDoNotSkipPe8090mTRATO4() {
        return this.doNotSkipPe8090mTRATO4;
    }

    public void setDoNotSkipPe8090mTRATO4(boolean doNotSkipPe8090mTRATO4) {
            this.doNotSkipPe8090mTRATO4 = doNotSkipPe8090mTRATO4;
        }
    boolean doNotSkipPe8090mTRATO5 = true;

    public boolean getDoNotSkipPe8090mTRATO5() {
        return this.doNotSkipPe8090mTRATO5;
    }

    public void setDoNotSkipPe8090mTRATO5(boolean doNotSkipPe8090mTRATO5) {
            this.doNotSkipPe8090mTRATO5 = doNotSkipPe8090mTRATO5;
        }
    boolean doNotSkipPe8090mTRATO6 = true;

    public boolean getDoNotSkipPe8090mTRATO6() {
        return this.doNotSkipPe8090mTRATO6;
    }

    public void setDoNotSkipPe8090mTRATO6(boolean doNotSkipPe8090mTRATO6) {
            this.doNotSkipPe8090mTRATO6 = doNotSkipPe8090mTRATO6;
        }
    boolean doNotSkipPe8090mTRATO7 = true;

    public boolean getDoNotSkipPe8090mTRATO7() {
        return this.doNotSkipPe8090mTRATO7;
    }

    public void setDoNotSkipPe8090mTRATO7(boolean doNotSkipPe8090mTRATO7) {
            this.doNotSkipPe8090mTRATO7 = doNotSkipPe8090mTRATO7;
        }
    boolean doNotSkipEsFisAlmPe8090m = true;

    public boolean getDoNotSkipEsFisAlmPe8090m() {
        return this.doNotSkipEsFisAlmPe8090m;
    }

    public void setDoNotSkipEsFisAlmPe8090m(boolean doNotSkipEsFisAlmPe8090m) {
            this.doNotSkipEsFisAlmPe8090m = doNotSkipEsFisAlmPe8090m;
        }
    boolean doNotSkipEsJurAlmPe8090m = true;

    public boolean getDoNotSkipEsJurAlmPe8090m() {
        return this.doNotSkipEsJurAlmPe8090m;
    }

    public void setDoNotSkipEsJurAlmPe8090m(boolean doNotSkipEsJurAlmPe8090m) {
            this.doNotSkipEsJurAlmPe8090m = doNotSkipEsJurAlmPe8090m;
        }
    boolean doNotSkipCatPe8090m = true;

    public boolean getDoNotSkipCatPe8090m() {
        return this.doNotSkipCatPe8090m;
    }

    public void setDoNotSkipCatPe8090m(boolean doNotSkipCatPe8090m) {
            this.doNotSkipCatPe8090m = doNotSkipCatPe8090m;
        }
    boolean doNotSkipCasPe8090m = true;

    public boolean getDoNotSkipCasPe8090m() {
        return this.doNotSkipCasPe8090m;
    }

    public void setDoNotSkipCasPe8090m(boolean doNotSkipCasPe8090m) {
            this.doNotSkipCasPe8090m = doNotSkipCasPe8090m;
        }
    boolean doNotSkipCatPe8090mMAS3 = true;

    public boolean getDoNotSkipCatPe8090mMAS3() {
        return this.doNotSkipCatPe8090mMAS3;
    }

    public void setDoNotSkipCatPe8090mMAS3(boolean doNotSkipCatPe8090mMAS3) {
            this.doNotSkipCatPe8090mMAS3 = doNotSkipCatPe8090mMAS3;
        }
    boolean doNotSkipCasPe8090mMAS3 = true;

    public boolean getDoNotSkipCasPe8090mMAS3() {
        return this.doNotSkipCasPe8090mMAS3;
    }

    public void setDoNotSkipCasPe8090mMAS3(boolean doNotSkipCasPe8090mMAS3) {
            this.doNotSkipCasPe8090mMAS3 = doNotSkipCasPe8090mMAS3;
        }
    boolean doNotSkipCatPe8090mMAS6 = true;

    public boolean getDoNotSkipCatPe8090mMAS6() {
        return this.doNotSkipCatPe8090mMAS6;
    }

    public void setDoNotSkipCatPe8090mMAS6(boolean doNotSkipCatPe8090mMAS6) {
            this.doNotSkipCatPe8090mMAS6 = doNotSkipCatPe8090mMAS6;
        }
    boolean doNotSkipCasPe8090mMAS6 = true;

    public boolean getDoNotSkipCasPe8090mMAS6() {
        return this.doNotSkipCasPe8090mMAS6;
    }

    public void setDoNotSkipCasPe8090mMAS6(boolean doNotSkipCasPe8090mMAS6) {
            this.doNotSkipCasPe8090mMAS6 = doNotSkipCasPe8090mMAS6;
        }
    boolean doNotSkipMonitora = true;

    public boolean getDoNotSkipMonitora() {
        return this.doNotSkipMonitora;
    }

    public void setDoNotSkipMonitora(boolean doNotSkipMonitora) {
            this.doNotSkipMonitora = doNotSkipMonitora;
        }
    boolean doNotSkipParticion = true;

    public boolean getDoNotSkipParticion() {
        return this.doNotSkipParticion;
    }

    public void setDoNotSkipParticion(boolean doNotSkipParticion) {
            this.doNotSkipParticion = doNotSkipParticion;
        }
    boolean doNotSkipParticionEntrada = true;

    public boolean getDoNotSkipParticionEntrada() {
        return this.doNotSkipParticionEntrada;
    }

    public void setDoNotSkipParticionEntrada(boolean doNotSkipParticionEntrada) {
            this.doNotSkipParticionEntrada = doNotSkipParticionEntrada;
        }
    boolean doNotSkipParticion01 = true;

    public boolean getDoNotSkipParticion01() {
        return this.doNotSkipParticion01;
    }

    public void setDoNotSkipParticion01(boolean doNotSkipParticion01) {
            this.doNotSkipParticion01 = doNotSkipParticion01;
        }
    boolean doNotSkipParticion02 = true;

    public boolean getDoNotSkipParticion02() {
        return this.doNotSkipParticion02;
    }

    public void setDoNotSkipParticion02(boolean doNotSkipParticion02) {
            this.doNotSkipParticion02 = doNotSkipParticion02;
        }
    boolean doNotSkipParticionSalida = true;

    public boolean getDoNotSkipParticionSalida() {
        return this.doNotSkipParticionSalida;
    }

    public void setDoNotSkipParticionSalida(boolean doNotSkipParticionSalida) {
            this.doNotSkipParticionSalida = doNotSkipParticionSalida;
        }
    boolean doNotSkipBusCaracter = true;

    public boolean getDoNotSkipBusCaracter() {
        return this.doNotSkipBusCaracter;
    }

    public void setDoNotSkipBusCaracter(boolean doNotSkipBusCaracter) {
            this.doNotSkipBusCaracter = doNotSkipBusCaracter;
        }
    boolean doNotSkipBusCaracterEntrada = true;

    public boolean getDoNotSkipBusCaracterEntrada() {
        return this.doNotSkipBusCaracterEntrada;
    }

    public void setDoNotSkipBusCaracterEntrada(boolean doNotSkipBusCaracterEntrada) {
            this.doNotSkipBusCaracterEntrada = doNotSkipBusCaracterEntrada;
        }
    boolean doNotSkipBusCaracterSalida = true;

    public boolean getDoNotSkipBusCaracterSalida() {
        return this.doNotSkipBusCaracterSalida;
    }

    public void setDoNotSkipBusCaracterSalida(boolean doNotSkipBusCaracterSalida) {
            this.doNotSkipBusCaracterSalida = doNotSkipBusCaracterSalida;
        }
    boolean doNotSkipRespuesta = true;

    public boolean getDoNotSkipRespuesta() {
        return this.doNotSkipRespuesta;
    }

    public void setDoNotSkipRespuesta(boolean doNotSkipRespuesta) {
            this.doNotSkipRespuesta = doNotSkipRespuesta;
        }
    boolean doNotSkipRespuestaEntrada = true;

    public boolean getDoNotSkipRespuestaEntrada() {
        return this.doNotSkipRespuestaEntrada;
    }

    public void setDoNotSkipRespuestaEntrada(boolean doNotSkipRespuestaEntrada) {
            this.doNotSkipRespuestaEntrada = doNotSkipRespuestaEntrada;
        }
    boolean loopReponTpe1200 = true;

    public boolean getLoopReponTpe1200() {
        return this.loopReponTpe1200;
    }

    public void setLoopReponTpe1200(boolean loopReponTpe1200) {
            this.loopReponTpe1200 = loopReponTpe1200;
        }
    boolean loopRestInpUnoPe8090m = true;

    public boolean getLoopRestInpUnoPe8090m() {
        return this.loopRestInpUnoPe8090m;
    }

    public void setLoopRestInpUnoPe8090m(boolean loopRestInpUnoPe8090m) {
            this.loopRestInpUnoPe8090m = loopRestInpUnoPe8090m;
        }
    boolean loopRestInpDosPe8090m = true;

    public boolean getLoopRestInpDosPe8090m() {
        return this.loopRestInpDosPe8090m;
    }

    public void setLoopRestInpDosPe8090m(boolean loopRestInpDosPe8090m) {
            this.loopRestInpDosPe8090m = loopRestInpDosPe8090m;
        }
    boolean loopRestInpTresPe8090m = true;

    public boolean getLoopRestInpTresPe8090m() {
        return this.loopRestInpTresPe8090m;
    }

    public void setLoopRestInpTresPe8090m(boolean loopRestInpTresPe8090m) {
            this.loopRestInpTresPe8090m = loopRestInpTresPe8090m;
        }
    boolean loopTraPerOptPe8090m = true;

    public boolean getLoopTraPerOptPe8090m() {
        return this.loopTraPerOptPe8090m;
    }

    public void setLoopTraPerOptPe8090m(boolean loopTraPerOptPe8090m) {
            this.loopTraPerOptPe8090m = loopTraPerOptPe8090m;
        }
    boolean loopTabOblPe8090m = true;

    public boolean getLoopTabOblPe8090m() {
        return this.loopTabOblPe8090m;
    }

    public void setLoopTabOblPe8090m(boolean loopTabOblPe8090m) {
            this.loopTabOblPe8090m = loopTabOblPe8090m;
        }
    boolean loopSepGuiPe8090m = true;

    public boolean getLoopSepGuiPe8090m() {
        return this.loopSepGuiPe8090m;
    }

    public void setLoopSepGuiPe8090m(boolean loopSepGuiPe8090m) {
            this.loopSepGuiPe8090m = loopSepGuiPe8090m;
        }
    boolean loopNomMasPe8090m = true;

    public boolean getLoopNomMasPe8090m() {
        return this.loopNomMasPe8090m;
    }

    public void setLoopNomMasPe8090m(boolean loopNomMasPe8090m) {
            this.loopNomMasPe8090m = loopNomMasPe8090m;
        }
    boolean loopStringGuiTrePe8090m = true;

    public boolean getLoopStringGuiTrePe8090m() {
        return this.loopStringGuiTrePe8090m;
    }

    public void setLoopStringGuiTrePe8090m(boolean loopStringGuiTrePe8090m) {
            this.loopStringGuiTrePe8090m = loopStringGuiTrePe8090m;
        }
    boolean loopSepGioPe8090m = true;

    public boolean getLoopSepGioPe8090m() {
        return this.loopSepGioPe8090m;
    }

    public void setLoopSepGioPe8090m(boolean loopSepGioPe8090m) {
            this.loopSepGioPe8090m = loopSepGioPe8090m;
        }
    boolean loopNomOblPe8090m = true;

    public boolean getLoopNomOblPe8090m() {
        return this.loopNomOblPe8090m;
    }

    public void setLoopNomOblPe8090m(boolean loopNomOblPe8090m) {
            this.loopNomOblPe8090m = loopNomOblPe8090m;
        }
    boolean loopStringGioTrePe8090m = true;

    public boolean getLoopStringGioTrePe8090m() {
        return this.loopStringGioTrePe8090m;
    }

    public void setLoopStringGioTrePe8090m(boolean loopStringGioTrePe8090m) {
            this.loopStringGioTrePe8090m = loopStringGioTrePe8090m;
        }

    public WtabPartGroup getWtabPartGroup() {
        if (wtabPartGroup == null) {
            wtabPartGroup = new WtabPartGroup();
        }

        return wtabPartGroup;
    }

    public void setWtabPartGroup(WtabPartGroup wtabPartGroup) {
        this.wtabPartGroup = wtabPartGroup;
    }
    public IoPe8090p getIoPe8090p() {
        if (ioPe8090p == null) {
            ioPe8090p = new IoPe8090p();
        }

        return ioPe8090p;
    }

    public void setIoPe8090p(IoPe8090p ioPe8090p) {
        this.ioPe8090p = ioPe8090p;
    }
    public WRespuestaGroup getWRespuestaGroup() {
        if (wRespuestaGroup == null) {
            wRespuestaGroup = new WRespuestaGroup();
        }

        return wRespuestaGroup;
    }

    public void setWRespuestaGroup(WRespuestaGroup wRespuestaGroup) {
        this.wRespuestaGroup = wRespuestaGroup;
    }
    public Section getSection() {
        if (section == null) {
            section = new Section();
        }

        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }
    public WPartesGroup getWPartesGroup() {
        if (wPartesGroup == null) {
            wPartesGroup = new WPartesGroup();
        }

        return wPartesGroup;
    }

    public void setWPartesGroup(WPartesGroup wPartesGroup) {
        this.wPartesGroup = wPartesGroup;
    }
    public WTipPerGroup getWTipPerGroup() {
        if (wTipPerGroup == null) {
            wTipPerGroup = new WTipPerGroup();
        }

        return wTipPerGroup;
    }

    public void setWTipPerGroup(WTipPerGroup wTipPerGroup) {
        this.wTipPerGroup = wTipPerGroup;
    }
    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
    public WRespuestaRGroup getWRespuestaRGroup() {
        if (wRespuestaRGroup == null) {
            wRespuestaRGroup = new WRespuestaRGroup();
        }

        return wRespuestaRGroup;
    }

    public void setWRespuestaRGroup(WRespuestaRGroup wRespuestaRGroup) {
        this.wRespuestaRGroup = wRespuestaRGroup;
    }
    public WPrimLetra getWPrimLetra() {
        if (wPrimLetra == null) {
            wPrimLetra = new WPrimLetra();
        }

        return wPrimLetra;
    }

    public void setWPrimLetra(WPrimLetra wPrimLetra) {
        this.wPrimLetra = wPrimLetra;
    }
    public WRespuestaMrGroup getWRespuestaMrGroup() {
        if (wRespuestaMrGroup == null) {
            wRespuestaMrGroup = new WRespuestaMrGroup();
        }

        return wRespuestaMrGroup;
    }

    public void setWRespuestaMrGroup(WRespuestaMrGroup wRespuestaMrGroup) {
        this.wRespuestaMrGroup = wRespuestaMrGroup;
    }

    public int getWInoPe8090m() {
        return wInoPe8090m;
    }

    public void setWInoPe8090m(int wInoPe8090m) {
        this.wInoPe8090m = wInoPe8090m;
    }
    public int getWInpPe8090m() {
        return wInpPe8090m;
    }

    public void setWInpPe8090m(int wInpPe8090m) {
        this.wInpPe8090m = wInpPe8090m;
    }
    public int getWPartIndex() {
        return wPartIndex;
    }

    public void setWPartIndex(int wPartIndex) {
        this.wPartIndex = wPartIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wtabPartGroup.hashCode();
        str += ioPe8090p.hashCode();
        str += wRespuestaGroup.hashCode();
        str += section.hashCode();
        str += wPartesGroup.hashCode();
        str += wTipPerGroup.hashCode();
        str += work.hashCode();
        str += wRespuestaRGroup.hashCode();
        str += wPrimLetra.hashCode();
        str += wRespuestaMrGroup.hashCode();
       return str.hashCode();
    }

    public Bm8090mCtx clone() {
        Bm8090mCtx cloneObj = new Bm8090mCtx();
        cloneObj.wtabPartGroup = new WtabPartGroup();
        cloneObj.wtabPartGroup.set(wtabPartGroup.getClonedField());
        cloneObj.ioPe8090p = new IoPe8090p();
        cloneObj.ioPe8090p.set(ioPe8090p.getClonedField());
        cloneObj.wRespuestaGroup = new WRespuestaGroup();
        cloneObj.wRespuestaGroup.set(wRespuestaGroup.getClonedField());
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.wPartesGroup = new WPartesGroup();
        cloneObj.wPartesGroup.set(wPartesGroup.getClonedField());
        cloneObj.wTipPerGroup = new WTipPerGroup();
        cloneObj.wTipPerGroup.set(wTipPerGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wRespuestaRGroup = new WRespuestaRGroup();
        cloneObj.wRespuestaRGroup.set(wRespuestaRGroup.getClonedField());
        cloneObj.wPrimLetra = new WPrimLetra();
        cloneObj.wPrimLetra.set(wPrimLetra.getClonedField());
        cloneObj.wRespuestaMrGroup = new WRespuestaMrGroup();
        cloneObj.wRespuestaMrGroup.set(wRespuestaMrGroup.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class InicioOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of section
	 *	@return section
	 */   
	 public Section getSection() {
   	return section;
   }


	/**
	 *	Returns the value of wTitCtaPe8090m
	 *	@return wTitCtaPe8090m
	 */
   public char[] getWTitCtaPe8090m() throws CFException  {              
   		return section.getWTitCtaPe8090m();
   }

  
	/**
	*  set variable wTitCtaPe8090m
	*  @param value
	**/
   public void setWTitCtaPe8090m(char[] value) throws CFException {
      section.setWTitCtaPe8090m(value);
   } 

     /**
	 * 	Update WTitCtaPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitCtaPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWTitCtaPe8090m(source, sourceIndex);
   	
   }
   
   public void setWTitCtaPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitCtaPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WTitCtaPe8090m with another Field
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source) {
      section.setWTitCtaPe8090m(source);
   }  
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wTitulPe8090m
	 *	@return wTitulPe8090m
	 */
   public char[] getWTitulPe8090m() throws CFException  {              
   		return section.getWTitulPe8090m();
   }

  
	/**
	*  set variable wTitulPe8090m
	*  @param value
	**/
   public void setWTitulPe8090m(char[] value) throws CFException {
      section.setWTitulPe8090m(value);
   } 

     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWTitulPe8090m(source, sourceIndex);
   	
   }
   
   public void setWTitulPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WTitulPe8090m with another Field
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source) {
      section.setWTitulPe8090m(source);
   }  
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "S" for isInpUp1vez()
	 *	@return  Returns true if isInpUp1vez() is "S"
	 */
   public boolean isInpUp1vez() throws CFException {
      return work.isInpUp1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpUp1vezTrue()  throws CFException{  			
    	work.setInpUp1vezTrue();
   	}

public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}

        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InicioOutCtx clone() {
        InicioOutCtx cloneObj = new InicioOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InicioOutCtx getInicioOutCtx() {
            return new InicioOutCtx();
    }
     public class ReponTpe1200InCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Test condition "S" for isInpUp1vez()
	 *	@return  Returns true if isInpUp1vez() is "S"
	 */
   public boolean isInpUp1vez() throws CFException {
      return work.isInpUp1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpUp1vezTrue()  throws CFException{  			
    	work.setInpUp1vezTrue();
   	}

public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}

        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public ReponTpe1200OutCtx getReponTpe1200OutCtx() {
            return new ReponTpe1200OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReponTpe1200InCtx clone() {
        ReponTpe1200InCtx cloneObj = new ReponTpe1200InCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReponTpe1200InCtx getReponTpe1200InCtx() {
            return new ReponTpe1200InCtx();
    }
     public class ReponTpe1200OutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wTipPe8090m
	 *	@return wTipPe8090m
	 */
	public int getWTipPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTipPe8090m();
	}
	
	/**
	 * 	Update WTipPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m(number);
	}


	public void setWTipPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m((int)number);
	}



public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wTpeNrePe8090m
	 *	@return wTpeNrePe8090m
	 */
	public int getWTpeNrePe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTpeNrePe8090m();
	}
	
	/**
	 * 	Update WTpeNrePe8090m with the passed value
	 *	@param number
	 */
	public void setWTpeNrePe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTpeNrePe8090m(number);
	}


	public void setWTpeNrePe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTpeNrePe8090m((int)number);
	}


	/**
	 *	Returns the value of wNsePerPe8090m
	 *	@return wNsePerPe8090m
	 */
	public int getWNsePerPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNsePerPe8090m();
	}
	
	/**
	 * 	Update WNsePerPe8090m with the passed value
	 *	@param number
	 */
	public void setWNsePerPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNsePerPe8090m(number);
	}


	public void setWNsePerPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNsePerPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcaNomPe8090m
	 *	@return wNcaNomPe8090m
	 */
	public int getWNcaNomPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNomPe8090m();
	}
	
	/**
	 * 	Update WNcaNomPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNomPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m(number);
	}


	public void setWNcaNomPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcaNo1Pe8090m
	 *	@return wNcaNo1Pe8090m
	 */
	public int getWNcaNo1Pe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNo1Pe8090m();
	}
	
	/**
	 * 	Update WNcaNo1Pe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNo1Pe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNo1Pe8090m(number);
	}


	public void setWNcaNo1Pe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNo1Pe8090m((int)number);
	}


	/**
	 *	Returns the value of wSeaNrePe8090m
	 *	@return wSeaNrePe8090m
	 */
   public char[] getWSeaNrePe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWSeaNrePe8090m();
   }

  
	/**
	*  set variable wSeaNrePe8090m
	*  @param value
	**/
   public void setWSeaNrePe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWSeaNrePe8090m(value);
   } 

     /**
	 * 	Update WSeaNrePe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWSeaNrePe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWSeaNrePe8090m(source, sourceIndex);
   	
   }
   
   public void setWSeaNrePe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWSeaNrePe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WSeaNrePe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWSeaNrePe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWSeaNrePe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WSeaNrePe8090m with another Field
	 *	@param value
	 */
   public void setWSeaNrePe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWSeaNrePe8090m(source);
   }  
   
     /**
	 * 	Update WSeaNrePe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWSeaNrePe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWSeaNrePe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WSeaNrePe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWSeaNrePe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWSeaNrePe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNo2Pe8090m
	 *	@return wNo2Pe8090m
	 */
   public char[] getWNo2Pe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNo2Pe8090m();
   }

  
	/**
	*  set variable wNo2Pe8090m
	*  @param value
	**/
   public void setWNo2Pe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(value);
   } 

     /**
	 * 	Update WNo2Pe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex);
   	
   }
   
   public void setWNo2Pe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNo2Pe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNo2Pe8090m with another Field
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source);
   }  
   
     /**
	 * 	Update WNo2Pe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNo2Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPerGruPe8090m
	 *	@return wPerGruPe8090m
	 */
	public int getWPerGruPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWPerGruPe8090m();
	}
	
	/**
	 * 	Update WPerGruPe8090m with the passed value
	 *	@param number
	 */
	public void setWPerGruPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m(number);
	}


	public void setWPerGruPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNmaSepPe8090m
	 *	@return wNmaSepPe8090m
	 */
	public int getWNmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNmaSepPe8090m();
	}
	
	/**
	 * 	Update WNmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWNmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m(number);
	}


	public void setWNmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m((int)number);
	}


	/**
	 *	Returns the value of wIeqPe8090m
	 *	@return wIeqPe8090m
	 */
	public int getWIeqPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWIeqPe8090m();
	}
	
	/**
	 * 	Update WIeqPe8090m with the passed value
	 *	@param number
	 */
	public void setWIeqPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWIeqPe8090m(number);
	}


	public void setWIeqPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWIeqPe8090m((int)number);
	}


	/**
	 *	Returns the value of wIsePe8090m
	 *	@return wIsePe8090m
	 */
	public int getWIsePe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWIsePe8090m();
	}
	
	/**
	 * 	Update WIsePe8090m with the passed value
	 *	@param number
	 */
	public void setWIsePe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWIsePe8090m(number);
	}


	public void setWIsePe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWIsePe8090m((int)number);
	}


	/**
	 *	Returns the value of wNomPe8090m
	 *	@return wNomPe8090m
	 */
   public char[] getWNomPe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNomPe8090m();
   }

  
	/**
	*  set variable wNomPe8090m
	*  @param value
	**/
   public void setWNomPe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(value);
   } 

     /**
	 * 	Update WNomPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNomPe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNomPe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNomPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNomPe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNomPe8090m with another Field
	 *	@param value
	 */
   public void setWNomPe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source);
   }  
   
     /**
	 * 	Update WNomPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNomPe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNomPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNomPe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNomNrePe8090m
	 *	@return wNomNrePe8090m
	 */
   public char[] getWNomNrePe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNomNrePe8090m();
   }

  
	/**
	*  set variable wNomNrePe8090m
	*  @param value
	**/
   public void setWNomNrePe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomNrePe8090m(value);
   } 

     /**
	 * 	Update WNomNrePe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNomNrePe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomNrePe8090m(source, sourceIndex);
   	
   }
   
   public void setWNomNrePe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomNrePe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNomNrePe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNomNrePe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomNrePe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNomNrePe8090m with another Field
	 *	@param value
	 */
   public void setWNomNrePe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomNrePe8090m(source);
   }  
   
     /**
	 * 	Update WNomNrePe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNomNrePe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomNrePe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNomNrePe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNomNrePe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomNrePe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPraNrePe8090m
	 *	@return wPraNrePe8090m
	 */
   public char[] getWPraNrePe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWPraNrePe8090m();
   }

  
	/**
	*  set variable wPraNrePe8090m
	*  @param value
	**/
   public void setWPraNrePe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWPraNrePe8090m(value);
   } 

     /**
	 * 	Update WPraNrePe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPraNrePe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWPraNrePe8090m(source, sourceIndex);
   	
   }
   
   public void setWPraNrePe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWPraNrePe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WPraNrePe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPraNrePe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWPraNrePe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WPraNrePe8090m with another Field
	 *	@param value
	 */
   public void setWPraNrePe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWPraNrePe8090m(source);
   }  
   
     /**
	 * 	Update WPraNrePe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPraNrePe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWPraNrePe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WPraNrePe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPraNrePe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWPraNrePe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wTmaSepPe8090m
	 *	@return wTmaSepPe8090m
	 */
	public int getWTmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTmaSepPe8090m();
	}
	
	/**
	 * 	Update WTmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTmaSepPe8090m(number);
	}


	public void setWTmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTmaSepPe8090m((int)number);
	}


	/**
	 *	Test condition "N" for isNoInpUp1vez()
	 *	@return  Returns true if isNoInpUp1vez() is "N"
	 */
   public boolean isNoInpUp1vez() throws CFException {
      return work.isNoInpUp1vez();
   }

	/**
	*  set values "N"
	*/
   	public void setNoInpUp1vezTrue()  throws CFException{  			
    	work.setNoInpUp1vezTrue();
   	}
	/**
	 *	Returns the value of wCpeNomPe8090m
	 *	@return wCpeNomPe8090m
	 */
	public int getWCpeNomPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWCpeNomPe8090m();
	}
	
	/**
	 * 	Update WCpeNomPe8090m with the passed value
	 *	@param number
	 */
	public void setWCpeNomPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWCpeNomPe8090m(number);
	}


	public void setWCpeNomPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWCpeNomPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNo1Pe8090m
	 *	@return wNo1Pe8090m
	 */
   public char[] getWNo1Pe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNo1Pe8090m();
   }

  
	/**
	*  set variable wNo1Pe8090m
	*  @param value
	**/
   public void setWNo1Pe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(value);
   } 

     /**
	 * 	Update WNo1Pe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex);
   	
   }
   
   public void setWNo1Pe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNo1Pe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNo1Pe8090m with another Field
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source);
   }  
   
     /**
	 * 	Update WNo1Pe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNo1Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMasSepPe8090m
	 *	@return wMasSepPe8090m
	 */
   public char[] getWMasSepPe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWMasSepPe8090m();
   }

  
	/**
	*  set variable wMasSepPe8090m
	*  @param value
	**/
   public void setWMasSepPe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(value);
   } 

     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasSepPe8090m with another Field
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source);
   }  
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReponTpe1200OutCtx clone() {
        ReponTpe1200OutCtx cloneObj = new ReponTpe1200OutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReponTpe1200OutCtx getReponTpe1200OutCtx() {
            return new ReponTpe1200OutCtx();
    }
     public class ReponTob1200InCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();


public void setWInoPe8090m(int wInoPe8090m) { 
    Bm8090mCtx.this.wInoPe8090m = wInoPe8090m;
}

public int getWInoPe8090m() { 
    return Bm8090mCtx.this.wInoPe8090m;
}
	/**
	 *	Returns the value of wDatVarPe8090m
	 *	@return wDatVarPe8090m
	 */   
	 public WDatVarPe8090m getWDatVarPe8090m() {
   	return section.getWDatVarPe8090m();
   }

   /**
	* 	Update WDatVarPe8090m with the passed value
	*	@param value
	*/
   public void setWDatVarPe8090m(char[] value) throws CFException {
      section.setWDatVarPe8090m(value);
   }   

     /**
	 * 	Update WDatVarPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWDatVarPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWDatVarPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WDatVarPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWDatVarPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWDatVarPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WDatVarPe8090m with another Field
	 *	@param value
	 */
   public void setWDatVarPe8090m(Field source) {
   	section.setWDatVarPe8090m(source);
   }  
   
     /**
	 * 	Update WDatVarPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWDatVarPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWDatVarPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WDatVarPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWDatVarPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWDatVarPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public ReponTob1200OutCtx getReponTob1200OutCtx() {
            return new ReponTob1200OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReponTob1200InCtx clone() {
        ReponTob1200InCtx cloneObj = new ReponTob1200InCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReponTob1200InCtx getReponTob1200InCtx() {
            return new ReponTob1200InCtx();
    }
     public class ReponTob1200OutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wNobPe8090m
	 *	@return wNobPe8090m
	 */
   public char[] getWNobPe8090m(int index) throws CFException  {              
   		return section.getWTobPe8090m().getWEloPe8090m(index).getWNobPe8090m();
   }

  
	/**
	*  set variable wNobPe8090m
	*  @param value
	**/
   public void setWNobPe8090m(int index,char[] value) throws CFException {
      section.getWTobPe8090m().getWEloPe8090m(index).setWNobPe8090m(value);
   } 

     /**
	 * 	Update WNobPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNobPe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTobPe8090m().getWEloPe8090m(index).setWNobPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNobPe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTobPe8090m().getWEloPe8090m(index).setWNobPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNobPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNobPe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTobPe8090m().getWEloPe8090m(index).setWNobPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNobPe8090m with another Field
	 *	@param value
	 */
   public void setWNobPe8090m(int index,Field source) {
      section.getWTobPe8090m().getWEloPe8090m(index).setWNobPe8090m(source);
   }  
   
     /**
	 * 	Update WNobPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNobPe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTobPe8090m().getWEloPe8090m(index).setWNobPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNobPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNobPe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTobPe8090m().getWEloPe8090m(index).setWNobPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNcoPe8090m
	 *	@return wNcoPe8090m
	 */
	public int getWNcoPe8090m(int index) throws CFException {        
   		return section.getWTobPe8090m().getWEloPe8090m(index).getWNcoPe8090m();
	}
	
	/**
	 * 	Update WNcoPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcoPe8090m(int index,int number)  throws CFException{
		section.getWTobPe8090m().getWEloPe8090m(index).setWNcoPe8090m(number);
	}


	public void setWNcoPe8090m(int index,long number)  throws CFException{
		section.getWTobPe8090m().getWEloPe8090m(index).setWNcoPe8090m((int)number);
	}


	/**
	 *	Returns the value of wInrPe8090m
	 *	@return wInrPe8090m
	 */
	public int getWInrPe8090m(int index) throws CFException {        
   		return section.getWTobPe8090m().getWEloPe8090m(index).getWInrPe8090m();
	}
	
	/**
	 * 	Update WInrPe8090m with the passed value
	 *	@param number
	 */
	public void setWInrPe8090m(int index,int number)  throws CFException{
		section.getWTobPe8090m().getWEloPe8090m(index).setWInrPe8090m(number);
	}


	public void setWInrPe8090m(int index,long number)  throws CFException{
		section.getWTobPe8090m().getWEloPe8090m(index).setWInrPe8090m((int)number);
	}


	/**
	 *	Returns the value of wIsoPe8090m
	 *	@return wIsoPe8090m
	 */
	public int getWIsoPe8090m(int index) throws CFException {        
   		return section.getWTobPe8090m().getWEloPe8090m(index).getWIsoPe8090m();
	}
	
	/**
	 * 	Update WIsoPe8090m with the passed value
	 *	@param number
	 */
	public void setWIsoPe8090m(int index,int number)  throws CFException{
		section.getWTobPe8090m().getWEloPe8090m(index).setWIsoPe8090m(number);
	}


	public void setWIsoPe8090m(int index,long number)  throws CFException{
		section.getWTobPe8090m().getWEloPe8090m(index).setWIsoPe8090m((int)number);
	}


	/**
	 *	Test condition "S" for isInpUp1vez()
	 *	@return  Returns true if isInpUp1vez() is "S"
	 */
   public boolean isInpUp1vez() throws CFException {
      return work.isInpUp1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpUp1vezTrue()  throws CFException{  			
    	work.setInpUp1vezTrue();
   	}

public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}

public void setWInoPe8090m(int wInoPe8090m) { 
    Bm8090mCtx.this.wInoPe8090m = wInoPe8090m;
}

public int getWInoPe8090m() { 
    return Bm8090mCtx.this.wInoPe8090m;
}
	/**
	 *	Returns the value of wDatVarPe8090m
	 *	@return wDatVarPe8090m
	 */   
	 public WDatVarPe8090m getWDatVarPe8090m() {
   	return section.getWDatVarPe8090m();
   }

   /**
	* 	Update WDatVarPe8090m with the passed value
	*	@param value
	*/
   public void setWDatVarPe8090m(char[] value) throws CFException {
      section.setWDatVarPe8090m(value);
   }   

     /**
	 * 	Update WDatVarPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWDatVarPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWDatVarPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WDatVarPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWDatVarPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWDatVarPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WDatVarPe8090m with another Field
	 *	@param value
	 */
   public void setWDatVarPe8090m(Field source) {
   	section.setWDatVarPe8090m(source);
   }  
   
     /**
	 * 	Update WDatVarPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWDatVarPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWDatVarPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WDatVarPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWDatVarPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWDatVarPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wIeoPe8090m
	 *	@return wIeoPe8090m
	 */
	public int getWIeoPe8090m(int index) throws CFException {        
   		return section.getWTobPe8090m().getWEloPe8090m(index).getWIeoPe8090m();
	}
	
	/**
	 * 	Update WIeoPe8090m with the passed value
	 *	@param number
	 */
	public void setWIeoPe8090m(int index,int number)  throws CFException{
		section.getWTobPe8090m().getWEloPe8090m(index).setWIeoPe8090m(number);
	}


	public void setWIeoPe8090m(int index,long number)  throws CFException{
		section.getWTobPe8090m().getWEloPe8090m(index).setWIeoPe8090m((int)number);
	}


	/**
	 *	Test condition "S" for isInoUp1vez()
	 *	@return  Returns true if isInoUp1vez() is "S"
	 */
   public boolean isInoUp1vez() throws CFException {
      return work.isInoUp1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInoUp1vezTrue()  throws CFException{  			
    	work.setInoUp1vezTrue();
   	}
	/**
	 *	Returns the value of wTioPe8090m
	 *	@return wTioPe8090m
	 */
	public int getWTioPe8090m(int index) throws CFException {        
   		return section.getWTobPe8090m().getWEloPe8090m(index).getWTioPe8090m();
	}
	
	/**
	 * 	Update WTioPe8090m with the passed value
	 *	@param number
	 */
	public void setWTioPe8090m(int index,int number)  throws CFException{
		section.getWTobPe8090m().getWEloPe8090m(index).setWTioPe8090m(number);
	}


	public void setWTioPe8090m(int index,long number)  throws CFException{
		section.getWTobPe8090m().getWEloPe8090m(index).setWTioPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReponTob1200OutCtx clone() {
        ReponTob1200OutCtx cloneObj = new ReponTob1200OutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReponTob1200OutCtx getReponTob1200OutCtx() {
            return new ReponTob1200OutCtx();
    }
     public class AveLonTitPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wMaxTitPe8090m
	 *	@return wMaxTitPe8090m
	 */
	public int getWMaxTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWMaxTitPe8090m();
	}
	
	/**
	 * 	Update WMaxTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWMaxTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m(number);
	}


	public void setWMaxTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public AveLonTitPe8090mOutCtx clone() {
        AveLonTitPe8090mOutCtx cloneObj = new AveLonTitPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public AveLonTitPe8090mOutCtx getAveLonTitPe8090mOutCtx() {
            return new AveLonTitPe8090mOutCtx();
    }
     public class TratamientoInCtx implements Cloneable {
     IoPe8090p ioPe8090p = Bm8090mCtx.this.getIoPe8090p();
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of despriapel
	 *	@return despriapel
	 */
   public char[] getDespriapel(int index) throws CFException  {              
   		return ioPe8090p.getPe8090p().getPe8090r(index).getDespriapel();
   }

  
	/**
	*  set variable despriapel
	*  @param value
	**/
   public void setDespriapel(int index,char[] value) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(value);
   } 

     /**
	 * 	Update Despriapel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDespriapel(int index,char[] source, int sourceIndex) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(source, sourceIndex);
   	
   }
   
   public void setDespriapel(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Despriapel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDespriapel(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Despriapel with another Field
	 *	@param value
	 */
   public void setDespriapel(int index,Field source) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(source);
   }  
   
     /**
	 * 	Update Despriapel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDespriapel(int index,Field source, int sourceIndex,int sourceLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Despriapel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDespriapel(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wIndxTitular
	 *	@return wIndxTitular
	 */
	public int getWIndxTitular() throws CFException {        
   		return section.getWIndxTitular();
	}
	
	/**
	 * 	Update WIndxTitular with the passed value
	 *	@param number
	 */
	public void setWIndxTitular(int number)  throws CFException{
		section.setWIndxTitular(number);
	}


	public void setWIndxTitular(long number)  throws CFException{
		section.setWIndxTitular((int)number);
	}


	/**
	 *	Returns the value of desnombre
	 *	@return desnombre
	 */
   public char[] getDesnombre(int index) throws CFException  {              
   		return ioPe8090p.getPe8090p().getPe8090r(index).getDesnombre();
   }

  
	/**
	*  set variable desnombre
	*  @param value
	**/
   public void setDesnombre(int index,char[] value) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(value);
   } 

     /**
	 * 	Update Desnombre 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDesnombre(int index,char[] source, int sourceIndex) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(source, sourceIndex);
   	
   }
   
   public void setDesnombre(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Desnombre 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDesnombre(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Desnombre with another Field
	 *	@param value
	 */
   public void setDesnombre(int index,Field source) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(source);
   }  
   
     /**
	 * 	Update Desnombre 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDesnombre(int index,Field source, int sourceIndex,int sourceLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Desnombre 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDesnombre(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dessegapel
	 *	@return dessegapel
	 */
   public char[] getDessegapel(int index) throws CFException  {              
   		return ioPe8090p.getPe8090p().getPe8090r(index).getDessegapel();
   }

  
	/**
	*  set variable dessegapel
	*  @param value
	**/
   public void setDessegapel(int index,char[] value) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(value);
   } 

     /**
	 * 	Update Dessegapel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDessegapel(int index,char[] source, int sourceIndex) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(source, sourceIndex);
   	
   }
   
   public void setDessegapel(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Dessegapel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDessegapel(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Dessegapel with another Field
	 *	@param value
	 */
   public void setDessegapel(int index,Field source) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(source);
   }  
   
     /**
	 * 	Update Dessegapel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDessegapel(int index,Field source, int sourceIndex,int sourceLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Dessegapel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDessegapel(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public TratamientoOutCtx getTratamientoOutCtx() {
            return new TratamientoOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ioPe8090p.hashCode();
        str += section.hashCode();
       return str.hashCode();
    }

    public TratamientoInCtx clone() {
        TratamientoInCtx cloneObj = new TratamientoInCtx();
        cloneObj.ioPe8090p = new IoPe8090p();
        cloneObj.ioPe8090p.set(ioPe8090p.getClonedField());
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public TratamientoInCtx getTratamientoInCtx() {
            return new TratamientoInCtx();
    }
     public class TratamientoOutCtx implements Cloneable {
     IoPe8090p ioPe8090p = Bm8090mCtx.this.getIoPe8090p();
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wIndxTitular
	 *	@return wIndxTitular
	 */
	public int getWIndxTitular() throws CFException {        
   		return section.getWIndxTitular();
	}
	
	/**
	 * 	Update WIndxTitular with the passed value
	 *	@param number
	 */
	public void setWIndxTitular(int number)  throws CFException{
		section.setWIndxTitular(number);
	}


	public void setWIndxTitular(long number)  throws CFException{
		section.setWIndxTitular((int)number);
	}


	/**
	 *	Returns the value of wTotTit
	 *	@return wTotTit
	 */
	public int getWTotTit() throws CFException {        
   		return section.getWTotTit();
	}
	
	/**
	 * 	Update WTotTit with the passed value
	 *	@param number
	 */
	public void setWTotTit(int number)  throws CFException{
		section.setWTotTit(number);
	}


	public void setWTotTit(long number)  throws CFException{
		section.setWTotTit((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ioPe8090p.hashCode();
        str += section.hashCode();
       return str.hashCode();
    }

    public TratamientoOutCtx clone() {
        TratamientoOutCtx cloneObj = new TratamientoOutCtx();
        cloneObj.ioPe8090p = new IoPe8090p();
        cloneObj.ioPe8090p.set(ioPe8090p.getClonedField());
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public TratamientoOutCtx getTratamientoOutCtx() {
            return new TratamientoOutCtx();
    }
     public class TratDeDatosInCtx implements Cloneable {
     IoPe8090p ioPe8090p = Bm8090mCtx.this.getIoPe8090p();
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of despriapel
	 *	@return despriapel
	 */
   public char[] getDespriapel(int index) throws CFException  {              
   		return ioPe8090p.getPe8090p().getPe8090r(index).getDespriapel();
   }

  
	/**
	*  set variable despriapel
	*  @param value
	**/
   public void setDespriapel(int index,char[] value) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(value);
   } 

     /**
	 * 	Update Despriapel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDespriapel(int index,char[] source, int sourceIndex) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(source, sourceIndex);
   	
   }
   
   public void setDespriapel(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Despriapel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDespriapel(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Despriapel with another Field
	 *	@param value
	 */
   public void setDespriapel(int index,Field source) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(source);
   }  
   
     /**
	 * 	Update Despriapel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDespriapel(int index,Field source, int sourceIndex,int sourceLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Despriapel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDespriapel(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wIndxTitular
	 *	@return wIndxTitular
	 */
	public int getWIndxTitular() throws CFException {        
   		return section.getWIndxTitular();
	}
	
	/**
	 * 	Update WIndxTitular with the passed value
	 *	@param number
	 */
	public void setWIndxTitular(int number)  throws CFException{
		section.setWIndxTitular(number);
	}


	public void setWIndxTitular(long number)  throws CFException{
		section.setWIndxTitular((int)number);
	}


	/**
	 *	Returns the value of sepapell
	 *	@return sepapell
	 */
   public char[] getSepapell(int index) throws CFException  {              
   		return ioPe8090p.getPe8090p().getPe8090r(index).getSepapell();
   }

  
	/**
	*  set variable sepapell
	*  @param value
	**/
   public void setSepapell(int index,char[] value) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setSepapell(value);
   } 

     /**
	 * 	Update Sepapell 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSepapell(int index,char[] source, int sourceIndex) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setSepapell(source, sourceIndex);
   	
   }
   
   public void setSepapell(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ioPe8090p.getPe8090p().getPe8090r(index).setSepapell(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sepapell 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSepapell(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setSepapell(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sepapell with another Field
	 *	@param value
	 */
   public void setSepapell(int index,Field source) {
      ioPe8090p.getPe8090p().getPe8090r(index).setSepapell(source);
   }  
   
     /**
	 * 	Update Sepapell 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSepapell(int index,Field source, int sourceIndex,int sourceLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setSepapell(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sepapell 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSepapell(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setSepapell(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of indidioma
	 *	@return indidioma
	 */
   public char[] getIndidioma(int index) throws CFException  {              
   		return ioPe8090p.getPe8090p().getPe8090r(index).getIndidioma();
   }

  
	/**
	*  set variable indidioma
	*  @param value
	**/
   public void setIndidioma(int index,char[] value) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setIndidioma(value);
   } 

     /**
	 * 	Update Indidioma 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndidioma(int index,char[] source, int sourceIndex) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setIndidioma(source, sourceIndex);
   	
   }
   
   public void setIndidioma(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ioPe8090p.getPe8090p().getPe8090r(index).setIndidioma(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Indidioma 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndidioma(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setIndidioma(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Indidioma with another Field
	 *	@param value
	 */
   public void setIndidioma(int index,Field source) {
      ioPe8090p.getPe8090p().getPe8090r(index).setIndidioma(source);
   }  
   
     /**
	 * 	Update Indidioma 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndidioma(int index,Field source, int sourceIndex,int sourceLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setIndidioma(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Indidioma 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndidioma(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setIndidioma(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of desnombre
	 *	@return desnombre
	 */
   public char[] getDesnombre(int index) throws CFException  {              
   		return ioPe8090p.getPe8090p().getPe8090r(index).getDesnombre();
   }

  
	/**
	*  set variable desnombre
	*  @param value
	**/
   public void setDesnombre(int index,char[] value) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(value);
   } 

     /**
	 * 	Update Desnombre 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDesnombre(int index,char[] source, int sourceIndex) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(source, sourceIndex);
   	
   }
   
   public void setDesnombre(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Desnombre 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDesnombre(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Desnombre with another Field
	 *	@param value
	 */
   public void setDesnombre(int index,Field source) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(source);
   }  
   
     /**
	 * 	Update Desnombre 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDesnombre(int index,Field source, int sourceIndex,int sourceLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Desnombre 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDesnombre(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public short getIndtipidef(int index) throws CFException {  
        return ioPe8090p.getPe8090p().getPe8090r(index).getIndtipidef();
}
	/**
	 * 	Update Indtipidef with the passed value
	 *	@param number
	 */
	public void setIndtipidef(int index,short number)  throws CFException{
		ioPe8090p.getPe8090p().getPe8090r(index).setIndtipidef(number);
	}

	public void setIndtipidef(int index,int number)  throws CFException{
	   ioPe8090p.getPe8090p().getPe8090r(index).setIndtipidef(number);
	}
	public void setIndtipidef(int index,long number)  throws CFException {
	    ioPe8090p.getPe8090p().getPe8090r(index).setIndtipidef(number);
	}
	


	/**
	 *	Returns the value of dessegapel
	 *	@return dessegapel
	 */
   public char[] getDessegapel(int index) throws CFException  {              
   		return ioPe8090p.getPe8090p().getPe8090r(index).getDessegapel();
   }

  
	/**
	*  set variable dessegapel
	*  @param value
	**/
   public void setDessegapel(int index,char[] value) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(value);
   } 

     /**
	 * 	Update Dessegapel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDessegapel(int index,char[] source, int sourceIndex) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(source, sourceIndex);
   	
   }
   
   public void setDessegapel(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Dessegapel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDessegapel(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Dessegapel with another Field
	 *	@param value
	 */
   public void setDessegapel(int index,Field source) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(source);
   }  
   
     /**
	 * 	Update Dessegapel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDessegapel(int index,Field source, int sourceIndex,int sourceLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Dessegapel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDessegapel(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public TratDeDatosOutCtx getTratDeDatosOutCtx() {
            return new TratDeDatosOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ioPe8090p.hashCode();
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public TratDeDatosInCtx clone() {
        TratDeDatosInCtx cloneObj = new TratDeDatosInCtx();
        cloneObj.ioPe8090p = new IoPe8090p();
        cloneObj.ioPe8090p.set(ioPe8090p.getClonedField());
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TratDeDatosInCtx getTratDeDatosInCtx() {
            return new TratDeDatosInCtx();
    }
     public class TratDeDatosOutCtx implements Cloneable {
     IoPe8090p ioPe8090p = Bm8090mCtx.this.getIoPe8090p();
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of despriapel
	 *	@return despriapel
	 */
   public char[] getDespriapel(int index) throws CFException  {              
   		return ioPe8090p.getPe8090p().getPe8090r(index).getDespriapel();
   }

  
	/**
	*  set variable despriapel
	*  @param value
	**/
   public void setDespriapel(int index,char[] value) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(value);
   } 

     /**
	 * 	Update Despriapel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDespriapel(int index,char[] source, int sourceIndex) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(source, sourceIndex);
   	
   }
   
   public void setDespriapel(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Despriapel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDespriapel(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Despriapel with another Field
	 *	@param value
	 */
   public void setDespriapel(int index,Field source) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(source);
   }  
   
     /**
	 * 	Update Despriapel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDespriapel(int index,Field source, int sourceIndex,int sourceLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Despriapel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDespriapel(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDespriapel(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wSepApe
	 *	@return wSepApe
	 */
   public char[] getWSepApe() throws CFException  {              
   		return work.getWSepApe();
   }

  
	/**
	*  set variable wSepApe
	*  @param value
	**/
   public void setWSepApe(char[] value) throws CFException {
      work.setWSepApe(value);
   } 

	/**
	 *	Returns the value of wSapPer
	 *	@return wSapPer
	 */
   public char[] getWSapPer() throws CFException  {              
   		return work.getWSapPer();
   }

  
	/**
	*  set variable wSapPer
	*  @param value
	**/
   public void setWSapPer(char[] value) throws CFException {
      work.setWSapPer(value);
   } 

	/**
	 *	Returns the value of wNomPer
	 *	@return wNomPer
	 */
   public char[] getWNomPer() throws CFException  {              
   		return work.getWNomPer();
   }

  
	/**
	*  set variable wNomPer
	*  @param value
	**/
   public void setWNomPer(char[] value) throws CFException {
      work.setWNomPer(value);
   } 

	/**
	 *	Returns the value of sepapell
	 *	@return sepapell
	 */
   public char[] getSepapell(int index) throws CFException  {              
   		return ioPe8090p.getPe8090p().getPe8090r(index).getSepapell();
   }

  
	/**
	*  set variable sepapell
	*  @param value
	**/
   public void setSepapell(int index,char[] value) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setSepapell(value);
   } 

     /**
	 * 	Update Sepapell 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSepapell(int index,char[] source, int sourceIndex) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setSepapell(source, sourceIndex);
   	
   }
   
   public void setSepapell(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ioPe8090p.getPe8090p().getPe8090r(index).setSepapell(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sepapell 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSepapell(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setSepapell(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sepapell with another Field
	 *	@param value
	 */
   public void setSepapell(int index,Field source) {
      ioPe8090p.getPe8090p().getPe8090r(index).setSepapell(source);
   }  
   
     /**
	 * 	Update Sepapell 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSepapell(int index,Field source, int sourceIndex,int sourceLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setSepapell(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sepapell 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSepapell(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setSepapell(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wIdiApe
	 *	@return wIdiApe
	 */
   public char[] getWIdiApe() throws CFException  {              
   		return section.getWDatVarPe8090m().getWIdiApe();
   }

  
	/**
	*  set variable wIdiApe
	*  @param value
	**/
   public void setWIdiApe(char[] value) throws CFException {
      section.getWDatVarPe8090m().setWIdiApe(value);
   } 

     /**
	 * 	Update WIdiApe 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWIdiApe(char[] source, int sourceIndex) throws CFException {
      section.getWDatVarPe8090m().setWIdiApe(source, sourceIndex);
   	
   }
   
   public void setWIdiApe(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWDatVarPe8090m().setWIdiApe(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WIdiApe 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWIdiApe(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWDatVarPe8090m().setWIdiApe(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WIdiApe with another Field
	 *	@param value
	 */
   public void setWIdiApe(Field source) {
      section.getWDatVarPe8090m().setWIdiApe(source);
   }  
   
     /**
	 * 	Update WIdiApe 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWIdiApe(Field source, int sourceIndex,int sourceLen) {
      section.getWDatVarPe8090m().setWIdiApe(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WIdiApe 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWIdiApe(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWDatVarPe8090m().setWIdiApe(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of indidioma
	 *	@return indidioma
	 */
   public char[] getIndidioma(int index) throws CFException  {              
   		return ioPe8090p.getPe8090p().getPe8090r(index).getIndidioma();
   }

  
	/**
	*  set variable indidioma
	*  @param value
	**/
   public void setIndidioma(int index,char[] value) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setIndidioma(value);
   } 

     /**
	 * 	Update Indidioma 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndidioma(int index,char[] source, int sourceIndex) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setIndidioma(source, sourceIndex);
   	
   }
   
   public void setIndidioma(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ioPe8090p.getPe8090p().getPe8090r(index).setIndidioma(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Indidioma 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndidioma(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setIndidioma(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Indidioma with another Field
	 *	@param value
	 */
   public void setIndidioma(int index,Field source) {
      ioPe8090p.getPe8090p().getPe8090r(index).setIndidioma(source);
   }  
   
     /**
	 * 	Update Indidioma 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndidioma(int index,Field source, int sourceIndex,int sourceLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setIndidioma(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Indidioma 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndidioma(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setIndidioma(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of desnombre
	 *	@return desnombre
	 */
   public char[] getDesnombre(int index) throws CFException  {              
   		return ioPe8090p.getPe8090p().getPe8090r(index).getDesnombre();
   }

  
	/**
	*  set variable desnombre
	*  @param value
	**/
   public void setDesnombre(int index,char[] value) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(value);
   } 

     /**
	 * 	Update Desnombre 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDesnombre(int index,char[] source, int sourceIndex) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(source, sourceIndex);
   	
   }
   
   public void setDesnombre(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Desnombre 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDesnombre(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Desnombre with another Field
	 *	@param value
	 */
   public void setDesnombre(int index,Field source) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(source);
   }  
   
     /**
	 * 	Update Desnombre 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDesnombre(int index,Field source, int sourceIndex,int sourceLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Desnombre 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDesnombre(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDesnombre(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public short getIndtipidef(int index) throws CFException {  
        return ioPe8090p.getPe8090p().getPe8090r(index).getIndtipidef();
}
	/**
	 * 	Update Indtipidef with the passed value
	 *	@param number
	 */
	public void setIndtipidef(int index,short number)  throws CFException{
		ioPe8090p.getPe8090p().getPe8090r(index).setIndtipidef(number);
	}

	public void setIndtipidef(int index,int number)  throws CFException{
	   ioPe8090p.getPe8090p().getPe8090r(index).setIndtipidef(number);
	}
	public void setIndtipidef(int index,long number)  throws CFException {
	    ioPe8090p.getPe8090p().getPe8090r(index).setIndtipidef(number);
	}
	


	/**
	 *	Returns the value of wPapPer
	 *	@return wPapPer
	 */
   public char[] getWPapPer() throws CFException  {              
   		return work.getWPapPer();
   }

  
	/**
	*  set variable wPapPer
	*  @param value
	**/
   public void setWPapPer(char[] value) throws CFException {
      work.setWPapPer(value);
   } 

	/**
	 *	Returns the value of dessegapel
	 *	@return dessegapel
	 */
   public char[] getDessegapel(int index) throws CFException  {              
   		return ioPe8090p.getPe8090p().getPe8090r(index).getDessegapel();
   }

  
	/**
	*  set variable dessegapel
	*  @param value
	**/
   public void setDessegapel(int index,char[] value) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(value);
   } 

     /**
	 * 	Update Dessegapel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDessegapel(int index,char[] source, int sourceIndex) throws CFException {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(source, sourceIndex);
   	
   }
   
   public void setDessegapel(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Dessegapel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDessegapel(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Dessegapel with another Field
	 *	@param value
	 */
   public void setDessegapel(int index,Field source) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(source);
   }  
   
     /**
	 * 	Update Dessegapel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDessegapel(int index,Field source, int sourceIndex,int sourceLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Dessegapel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDessegapel(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().getPe8090r(index).setDessegapel(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ioPe8090p.hashCode();
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public TratDeDatosOutCtx clone() {
        TratDeDatosOutCtx cloneObj = new TratDeDatosOutCtx();
        cloneObj.ioPe8090p = new IoPe8090p();
        cloneObj.ioPe8090p.set(ioPe8090p.getClonedField());
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TratDeDatosOutCtx getTratDeDatosOutCtx() {
            return new TratDeDatosOutCtx();
    }
     public class TraPerFisPe8090mInCtx implements Cloneable {
     WRespuestaGroup wRespuestaGroup = Bm8090mCtx.this.getWRespuestaGroup();
     Section section = Bm8090mCtx.this.getSection();
     WTipPerGroup wTipPerGroup = Bm8090mCtx.this.getWTipPerGroup();
     Work work = Bm8090mCtx.this.getWork();
     WRespuestaRGroup wRespuestaRGroup = Bm8090mCtx.this.getWRespuestaRGroup();
     WRespuestaMrGroup wRespuestaMrGroup = Bm8090mCtx.this.getWRespuestaMrGroup();

	/**
	 *	Returns the value of wResp1
	 *	@return wResp1
	 */
   public char[] getWResp1() throws CFException  {              
   		return wRespuestaGroup.getWRespu().getWResp1();
   }

  
	/**
	*  set variable wResp1
	*  @param value
	**/
   public void setWResp1(char[] value) throws CFException {
      wRespuestaGroup.getWRespu().setWResp1(value);
   } 

     /**
	 * 	Update WResp1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWResp1(char[] source, int sourceIndex) throws CFException {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex);
   	
   }
   
   public void setWResp1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WResp1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWResp1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WResp1 with another Field
	 *	@param value
	 */
   public void setWResp1(Field source) {
      wRespuestaGroup.getWRespu().setWResp1(source);
   }  
   
     /**
	 * 	Update WResp1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWResp1(Field source, int sourceIndex,int sourceLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WResp1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWResp1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getWcntNcar() throws CFException {  
        return work.getWcntNcar();
}
	/**
	 * 	Update WcntNcar with the passed value
	 *	@param number
	 */
	public void setWcntNcar(int number)  throws CFException{
		work.setWcntNcar(number);
	}


	public void setWcntNcar(long number)  throws CFException{
	    work.setWcntNcar(number);
	}
	

	/**
	 *	Returns the value of wIndxTitular
	 *	@return wIndxTitular
	 */
	public int getWIndxTitular() throws CFException {        
   		return section.getWIndxTitular();
	}
	
	/**
	 * 	Update WIndxTitular with the passed value
	 *	@param number
	 */
	public void setWIndxTitular(int number)  throws CFException{
		section.setWIndxTitular(number);
	}


	public void setWIndxTitular(long number)  throws CFException{
		section.setWIndxTitular((int)number);
	}


	/**
	 *	Returns the value of wRespR1
	 *	@return wRespR1
	 */
   public char[] getWRespR1() throws CFException  {              
   		return wRespuestaRGroup.getWRespuR().getWRespR1();
   }

  
	/**
	*  set variable wRespR1
	*  @param value
	**/
   public void setWRespR1(char[] value) throws CFException {
      wRespuestaRGroup.getWRespuR().setWRespR1(value);
   } 

     /**
	 * 	Update WRespR1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespR1(char[] source, int sourceIndex) throws CFException {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex);
   	
   }
   
   public void setWRespR1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WRespR1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespR1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WRespR1 with another Field
	 *	@param value
	 */
   public void setWRespR1(Field source) {
      wRespuestaRGroup.getWRespuR().setWRespR1(source);
   }  
   
     /**
	 * 	Update WRespR1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespR1(Field source, int sourceIndex,int sourceLen) {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WRespR1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespR1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wRespMr1
	 *	@return wRespMr1
	 */
   public char[] getWRespMr1() throws CFException  {              
   		return wRespuestaMrGroup.getWRespuMr().getWRespMr1();
   }

  
	/**
	*  set variable wRespMr1
	*  @param value
	**/
   public void setWRespMr1(char[] value) throws CFException {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(value);
   } 

     /**
	 * 	Update WRespMr1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespMr1(char[] source, int sourceIndex) throws CFException {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex);
   	
   }
   
   public void setWRespMr1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WRespMr1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespMr1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WRespMr1 with another Field
	 *	@param value
	 */
   public void setWRespMr1(Field source) {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source);
   }  
   
     /**
	 * 	Update WRespMr1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespMr1(Field source, int sourceIndex,int sourceLen) {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WRespMr1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespMr1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public TraPerFisPe8090mOutCtx getTraPerFisPe8090mOutCtx() {
            return new TraPerFisPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wRespuestaGroup.hashCode();
        str += section.hashCode();
        str += wTipPerGroup.hashCode();
        str += work.hashCode();
        str += wRespuestaRGroup.hashCode();
        str += wRespuestaMrGroup.hashCode();
       return str.hashCode();
    }

    public TraPerFisPe8090mInCtx clone() {
        TraPerFisPe8090mInCtx cloneObj = new TraPerFisPe8090mInCtx();
        cloneObj.wRespuestaGroup = new WRespuestaGroup();
        cloneObj.wRespuestaGroup.set(wRespuestaGroup.getClonedField());
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.wTipPerGroup = new WTipPerGroup();
        cloneObj.wTipPerGroup.set(wTipPerGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wRespuestaRGroup = new WRespuestaRGroup();
        cloneObj.wRespuestaRGroup.set(wRespuestaRGroup.getClonedField());
        cloneObj.wRespuestaMrGroup = new WRespuestaMrGroup();
        cloneObj.wRespuestaMrGroup.set(wRespuestaMrGroup.getClonedField());
        return cloneObj;
    }

    }

    public TraPerFisPe8090mInCtx getTraPerFisPe8090mInCtx() {
            return new TraPerFisPe8090mInCtx();
    }
     public class TraPerFisPe8090mOutCtx implements Cloneable {
     WRespuestaGroup wRespuestaGroup = Bm8090mCtx.this.getWRespuestaGroup();
     Section section = Bm8090mCtx.this.getSection();
     WTipPerGroup wTipPerGroup = Bm8090mCtx.this.getWTipPerGroup();
     Work work = Bm8090mCtx.this.getWork();
     WRespuestaRGroup wRespuestaRGroup = Bm8090mCtx.this.getWRespuestaRGroup();
     WRespuestaMrGroup wRespuestaMrGroup = Bm8090mCtx.this.getWRespuestaMrGroup();

	/**
	 *	Returns the value of wTipAlmPe8090m
	 *	@return wTipAlmPe8090m
	 */
	public int getWTipAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWTipAlmPe8090m();
	}
	
	/**
	 * 	Update WTipAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWTipAlmPe8090m(number);
	}


	public void setWTipAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWTipAlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wResp1
	 *	@return wResp1
	 */
   public char[] getWResp1() throws CFException  {              
   		return wRespuestaGroup.getWRespu().getWResp1();
   }

  
	/**
	*  set variable wResp1
	*  @param value
	**/
   public void setWResp1(char[] value) throws CFException {
      wRespuestaGroup.getWRespu().setWResp1(value);
   } 

     /**
	 * 	Update WResp1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWResp1(char[] source, int sourceIndex) throws CFException {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex);
   	
   }
   
   public void setWResp1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WResp1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWResp1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WResp1 with another Field
	 *	@param value
	 */
   public void setWResp1(Field source) {
      wRespuestaGroup.getWRespu().setWResp1(source);
   }  
   
     /**
	 * 	Update WResp1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWResp1(Field source, int sourceIndex,int sourceLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WResp1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWResp1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getWcntNcar() throws CFException {  
        return work.getWcntNcar();
}
	/**
	 * 	Update WcntNcar with the passed value
	 *	@param number
	 */
	public void setWcntNcar(int number)  throws CFException{
		work.setWcntNcar(number);
	}


	public void setWcntNcar(long number)  throws CFException{
	    work.setWcntNcar(number);
	}
	

	/**
	 *	Returns the value of wNomPer
	 *	@return wNomPer
	 */
   public char[] getWNomPer() throws CFException  {              
   		return work.getWNomPer();
   }

  
	/**
	*  set variable wNomPer
	*  @param value
	**/
   public void setWNomPer(char[] value) throws CFException {
      work.setWNomPer(value);
   } 

	/**
	 *	Returns the value of wLonSegTitu
	 *	@return wLonSegTitu
	 */
	public int getWLonSegTitu() throws CFException {        
   		return section.getWLonSegTitu();
	}
	
	/**
	 * 	Update WLonSegTitu with the passed value
	 *	@param number
	 */
	public void setWLonSegTitu(int number)  throws CFException{
		section.setWLonSegTitu(number);
	}


	public void setWLonSegTitu(long number)  throws CFException{
		section.setWLonSegTitu((int)number);
	}


	/**
	 *	Returns the value of wNc2AlmPe8090m
	 *	@return wNc2AlmPe8090m
	 */
	public int getWNc2AlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWNc2AlmPe8090m();
	}
	
	/**
	 * 	Update WNc2AlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWNc2AlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWNc2AlmPe8090m(number);
	}


	public void setWNc2AlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWNc2AlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wLonPriTitu
	 *	@return wLonPriTitu
	 */
	public int getWLonPriTitu() throws CFException {        
   		return section.getWLonPriTitu();
	}
	
	/**
	 * 	Update WLonPriTitu with the passed value
	 *	@param number
	 */
	public void setWLonPriTitu(int number)  throws CFException{
		section.setWLonPriTitu(number);
	}


	public void setWLonPriTitu(long number)  throws CFException{
		section.setWLonPriTitu((int)number);
	}


	/**
	 *	Returns the value of wSegTitu
	 *	@return wSegTitu
	 */
   public char[] getWSegTitu() throws CFException  {              
   		return section.getWSegTitu();
   }

  
	/**
	*  set variable wSegTitu
	*  @param value
	**/
   public void setWSegTitu(char[] value) throws CFException {
      section.setWSegTitu(value);
   } 

     /**
	 * 	Update WSegTitu 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWSegTitu(char[] source, int sourceIndex) throws CFException {
      section.setWSegTitu(source, sourceIndex);
   	
   }
   
   public void setWSegTitu(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWSegTitu(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WSegTitu 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWSegTitu(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWSegTitu(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WSegTitu with another Field
	 *	@param value
	 */
   public void setWSegTitu(Field source) {
      section.setWSegTitu(source);
   }  
   
     /**
	 * 	Update WSegTitu 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWSegTitu(Field source, int sourceIndex,int sourceLen) {
      section.setWSegTitu(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WSegTitu 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWSegTitu(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWSegTitu(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNo1AlmPe8090m
	 *	@return wNo1AlmPe8090m
	 */
   public char[] getWNo1AlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWNo1AlmPe8090m();
   }

  
	/**
	*  set variable wNo1AlmPe8090m
	*  @param value
	**/
   public void setWNo1AlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(value);
   } 

     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNo1AlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNo1AlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source);
   }  
   
     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNo2AlmPe8090m
	 *	@return wNo2AlmPe8090m
	 */
   public char[] getWNo2AlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWNo2AlmPe8090m();
   }

  
	/**
	*  set variable wNo2AlmPe8090m
	*  @param value
	**/
   public void setWNo2AlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(value);
   } 

     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNo2AlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNo2AlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source);
   }  
   
     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wTipPer01
	 *	@return wTipPer01
	 */
	public int getWTipPer01() throws CFException {
   		return wTipPerGroup.getWTipPer01();
	}


	/**
	 *	Returns String value of wTipPer01
	 *	@return wTipPer01
	 */
	public char[]  getWTipPer01String() throws CFException {
	     return String.valueOf(wTipPerGroup.getWTipPer01String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wTipPer01IsNumeric()  throws CFException{
	    return wTipPerGroup.wTipPer01IsNumeric();
	}

	/**
	 * 	Update WTipPer01 with the passed value
	 *	@param number
	 */
	public void setWTipPer01(int number)  throws CFException{
		wTipPerGroup.setWTipPer01(number);
	}
	

	public void setWTipPer01(long number)  throws CFException{
	    wTipPerGroup.setWTipPer01(number);
	}
	
	
	/**
	 * 	Update WTipPer01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWTipPer01(char[] value)  throws CFException {
		wTipPerGroup.setWTipPer01(value);
	}
	
	/**
	 * 	Update WTipPer01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWTipPer01String(char[] value)  throws CFException{
		wTipPerGroup.setWTipPer01(value);
	}	

	/**
	 *	Returns the value of wNcnAlmPe8090m
	 *	@return wNcnAlmPe8090m
	 */
	public int getWNcnAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWNcnAlmPe8090m();
	}
	
	/**
	 * 	Update WNcnAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcnAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWNcnAlmPe8090m(number);
	}


	public void setWNcnAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWNcnAlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wPriTitu
	 *	@return wPriTitu
	 */
   public char[] getWPriTitu() throws CFException  {              
   		return section.getWPriTitu();
   }

  
	/**
	*  set variable wPriTitu
	*  @param value
	**/
   public void setWPriTitu(char[] value) throws CFException {
      section.setWPriTitu(value);
   } 

     /**
	 * 	Update WPriTitu 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPriTitu(char[] source, int sourceIndex) throws CFException {
      section.setWPriTitu(source, sourceIndex);
   	
   }
   
   public void setWPriTitu(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWPriTitu(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WPriTitu 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPriTitu(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWPriTitu(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WPriTitu with another Field
	 *	@param value
	 */
   public void setWPriTitu(Field source) {
      section.setWPriTitu(source);
   }  
   
     /**
	 * 	Update WPriTitu 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPriTitu(Field source, int sourceIndex,int sourceLen) {
      section.setWPriTitu(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WPriTitu 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPriTitu(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWPriTitu(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wRespMr1
	 *	@return wRespMr1
	 */
   public char[] getWRespMr1() throws CFException  {              
   		return wRespuestaMrGroup.getWRespuMr().getWRespMr1();
   }

  
	/**
	*  set variable wRespMr1
	*  @param value
	**/
   public void setWRespMr1(char[] value) throws CFException {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(value);
   } 

     /**
	 * 	Update WRespMr1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespMr1(char[] source, int sourceIndex) throws CFException {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex);
   	
   }
   
   public void setWRespMr1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WRespMr1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespMr1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WRespMr1 with another Field
	 *	@param value
	 */
   public void setWRespMr1(Field source) {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source);
   }  
   
     /**
	 * 	Update WRespMr1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespMr1(Field source, int sourceIndex,int sourceLen) {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WRespMr1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespMr1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wIndOpc
	 *	@return wIndOpc
	 */
	public int getWIndOpc() throws CFException {
   		return work.getWIndOpc();
	}


	/**
	 *	Returns String value of wIndOpc
	 *	@return wIndOpc
	 */
	public char[]  getWIndOpcString() throws CFException {
	     return String.valueOf(work.getWIndOpcString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wIndOpcIsNumeric()  throws CFException{
	    return work.wIndOpcIsNumeric();
	}

	/**
	 * 	Update WIndOpc with the passed value
	 *	@param number
	 */
	public void setWIndOpc(int number)  throws CFException{
		work.setWIndOpc(number);
	}
	

	public void setWIndOpc(long number)  throws CFException{
	    work.setWIndOpc(number);
	}
	
	
	/**
	 * 	Update WIndOpc with the passed value
	 *	@param value (String or char[])
	 */
	public void setWIndOpc(char[] value)  throws CFException {
		work.setWIndOpc(value);
	}
	
	/**
	 * 	Update WIndOpc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWIndOpcString(char[] value)  throws CFException{
		work.setWIndOpc(value);
	}	

	/**
	 *	Returns the value of wIeqAlmPe8090m
	 *	@return wIeqAlmPe8090m
	 */
	public int getWIeqAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWIeqAlmPe8090m();
	}
	
	/**
	 * 	Update WIeqAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWIeqAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWIeqAlmPe8090m(number);
	}


	public void setWIeqAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWIeqAlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNc1AlmPe8090m
	 *	@return wNc1AlmPe8090m
	 */
	public int getWNc1AlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWNc1AlmPe8090m();
	}
	
	/**
	 * 	Update WNc1AlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWNc1AlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWNc1AlmPe8090m(number);
	}


	public void setWNc1AlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWNc1AlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wSepApe
	 *	@return wSepApe
	 */
   public char[] getWSepApe() throws CFException  {              
   		return work.getWSepApe();
   }

  
	/**
	*  set variable wSepApe
	*  @param value
	**/
   public void setWSepApe(char[] value) throws CFException {
      work.setWSepApe(value);
   } 

	/**
	 *	Returns the value of wSapPer
	 *	@return wSapPer
	 */
   public char[] getWSapPer() throws CFException  {              
   		return work.getWSapPer();
   }

  
	/**
	*  set variable wSapPer
	*  @param value
	**/
   public void setWSapPer(char[] value) throws CFException {
      work.setWSapPer(value);
   } 

	/**
	 *	Returns the value of wNomAlmPe8090m
	 *	@return wNomAlmPe8090m
	 */
   public char[] getWNomAlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWNomAlmPe8090m();
   }

  
	/**
	*  set variable wNomAlmPe8090m
	*  @param value
	**/
   public void setWNomAlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(value);
   } 

     /**
	 * 	Update WNomAlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNomAlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNomAlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNomAlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNomAlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source);
   }  
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPapPer
	 *	@return wPapPer
	 */
   public char[] getWPapPer() throws CFException  {              
   		return work.getWPapPer();
   }

  
	/**
	*  set variable wPapPer
	*  @param value
	**/
   public void setWPapPer(char[] value) throws CFException {
      work.setWPapPer(value);
   } 

	/**
	 *	Returns the value of wRespR1
	 *	@return wRespR1
	 */
   public char[] getWRespR1() throws CFException  {              
   		return wRespuestaRGroup.getWRespuR().getWRespR1();
   }

  
	/**
	*  set variable wRespR1
	*  @param value
	**/
   public void setWRespR1(char[] value) throws CFException {
      wRespuestaRGroup.getWRespuR().setWRespR1(value);
   } 

     /**
	 * 	Update WRespR1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespR1(char[] source, int sourceIndex) throws CFException {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex);
   	
   }
   
   public void setWRespR1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WRespR1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespR1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WRespR1 with another Field
	 *	@param value
	 */
   public void setWRespR1(Field source) {
      wRespuestaRGroup.getWRespuR().setWRespR1(source);
   }  
   
     /**
	 * 	Update WRespR1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespR1(Field source, int sourceIndex,int sourceLen) {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WRespR1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespR1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wRespuestaGroup.hashCode();
        str += section.hashCode();
        str += wTipPerGroup.hashCode();
        str += work.hashCode();
        str += wRespuestaRGroup.hashCode();
        str += wRespuestaMrGroup.hashCode();
       return str.hashCode();
    }

    public TraPerFisPe8090mOutCtx clone() {
        TraPerFisPe8090mOutCtx cloneObj = new TraPerFisPe8090mOutCtx();
        cloneObj.wRespuestaGroup = new WRespuestaGroup();
        cloneObj.wRespuestaGroup.set(wRespuestaGroup.getClonedField());
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.wTipPerGroup = new WTipPerGroup();
        cloneObj.wTipPerGroup.set(wTipPerGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wRespuestaRGroup = new WRespuestaRGroup();
        cloneObj.wRespuestaRGroup.set(wRespuestaRGroup.getClonedField());
        cloneObj.wRespuestaMrGroup = new WRespuestaMrGroup();
        cloneObj.wRespuestaMrGroup.set(wRespuestaMrGroup.getClonedField());
        return cloneObj;
    }

    }

    public TraPerFisPe8090mOutCtx getTraPerFisPe8090mOutCtx() {
            return new TraPerFisPe8090mOutCtx();
    }
     public class TraPerJurPe8090mInCtx implements Cloneable {
     WRespuestaGroup wRespuestaGroup = Bm8090mCtx.this.getWRespuestaGroup();
     Section section = Bm8090mCtx.this.getSection();
     WTipPerGroup wTipPerGroup = Bm8090mCtx.this.getWTipPerGroup();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wResp1
	 *	@return wResp1
	 */
   public char[] getWResp1() throws CFException  {              
   		return wRespuestaGroup.getWRespu().getWResp1();
   }

  
	/**
	*  set variable wResp1
	*  @param value
	**/
   public void setWResp1(char[] value) throws CFException {
      wRespuestaGroup.getWRespu().setWResp1(value);
   } 

     /**
	 * 	Update WResp1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWResp1(char[] source, int sourceIndex) throws CFException {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex);
   	
   }
   
   public void setWResp1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WResp1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWResp1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WResp1 with another Field
	 *	@param value
	 */
   public void setWResp1(Field source) {
      wRespuestaGroup.getWRespu().setWResp1(source);
   }  
   
     /**
	 * 	Update WResp1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWResp1(Field source, int sourceIndex,int sourceLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WResp1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWResp1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getWcntNcar() throws CFException {  
        return work.getWcntNcar();
}
	/**
	 * 	Update WcntNcar with the passed value
	 *	@param number
	 */
	public void setWcntNcar(int number)  throws CFException{
		work.setWcntNcar(number);
	}


	public void setWcntNcar(long number)  throws CFException{
	    work.setWcntNcar(number);
	}
	

	/**
	 *	Returns the value of wIndxTitular
	 *	@return wIndxTitular
	 */
	public int getWIndxTitular() throws CFException {        
   		return section.getWIndxTitular();
	}
	
	/**
	 * 	Update WIndxTitular with the passed value
	 *	@param number
	 */
	public void setWIndxTitular(int number)  throws CFException{
		section.setWIndxTitular(number);
	}


	public void setWIndxTitular(long number)  throws CFException{
		section.setWIndxTitular((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public TraPerJurPe8090mOutCtx getTraPerJurPe8090mOutCtx() {
            return new TraPerJurPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wRespuestaGroup.hashCode();
        str += section.hashCode();
        str += wTipPerGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public TraPerJurPe8090mInCtx clone() {
        TraPerJurPe8090mInCtx cloneObj = new TraPerJurPe8090mInCtx();
        cloneObj.wRespuestaGroup = new WRespuestaGroup();
        cloneObj.wRespuestaGroup.set(wRespuestaGroup.getClonedField());
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.wTipPerGroup = new WTipPerGroup();
        cloneObj.wTipPerGroup.set(wTipPerGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TraPerJurPe8090mInCtx getTraPerJurPe8090mInCtx() {
            return new TraPerJurPe8090mInCtx();
    }
     public class TraPerJurPe8090mOutCtx implements Cloneable {
     WRespuestaGroup wRespuestaGroup = Bm8090mCtx.this.getWRespuestaGroup();
     Section section = Bm8090mCtx.this.getSection();
     WTipPerGroup wTipPerGroup = Bm8090mCtx.this.getWTipPerGroup();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wTipAlmPe8090m
	 *	@return wTipAlmPe8090m
	 */
	public int getWTipAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWTipAlmPe8090m();
	}
	
	/**
	 * 	Update WTipAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWTipAlmPe8090m(number);
	}


	public void setWTipAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWTipAlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wResp1
	 *	@return wResp1
	 */
   public char[] getWResp1() throws CFException  {              
   		return wRespuestaGroup.getWRespu().getWResp1();
   }

  
	/**
	*  set variable wResp1
	*  @param value
	**/
   public void setWResp1(char[] value) throws CFException {
      wRespuestaGroup.getWRespu().setWResp1(value);
   } 

     /**
	 * 	Update WResp1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWResp1(char[] source, int sourceIndex) throws CFException {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex);
   	
   }
   
   public void setWResp1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WResp1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWResp1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WResp1 with another Field
	 *	@param value
	 */
   public void setWResp1(Field source) {
      wRespuestaGroup.getWRespu().setWResp1(source);
   }  
   
     /**
	 * 	Update WResp1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWResp1(Field source, int sourceIndex,int sourceLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WResp1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWResp1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getWcntNcar() throws CFException {  
        return work.getWcntNcar();
}
	/**
	 * 	Update WcntNcar with the passed value
	 *	@param number
	 */
	public void setWcntNcar(int number)  throws CFException{
		work.setWcntNcar(number);
	}


	public void setWcntNcar(long number)  throws CFException{
	    work.setWcntNcar(number);
	}
	

	/**
	 *	Returns the value of wNomPer
	 *	@return wNomPer
	 */
   public char[] getWNomPer() throws CFException  {              
   		return work.getWNomPer();
   }

  
	/**
	*  set variable wNomPer
	*  @param value
	**/
   public void setWNomPer(char[] value) throws CFException {
      work.setWNomPer(value);
   } 

	/**
	 *	Returns the value of wLonSegTitu
	 *	@return wLonSegTitu
	 */
	public int getWLonSegTitu() throws CFException {        
   		return section.getWLonSegTitu();
	}
	
	/**
	 * 	Update WLonSegTitu with the passed value
	 *	@param number
	 */
	public void setWLonSegTitu(int number)  throws CFException{
		section.setWLonSegTitu(number);
	}


	public void setWLonSegTitu(long number)  throws CFException{
		section.setWLonSegTitu((int)number);
	}


	/**
	 *	Returns the value of wLonPriTitu
	 *	@return wLonPriTitu
	 */
	public int getWLonPriTitu() throws CFException {        
   		return section.getWLonPriTitu();
	}
	
	/**
	 * 	Update WLonPriTitu with the passed value
	 *	@param number
	 */
	public void setWLonPriTitu(int number)  throws CFException{
		section.setWLonPriTitu(number);
	}


	public void setWLonPriTitu(long number)  throws CFException{
		section.setWLonPriTitu((int)number);
	}


	/**
	 *	Returns the value of wSegTitu
	 *	@return wSegTitu
	 */
   public char[] getWSegTitu() throws CFException  {              
   		return section.getWSegTitu();
   }

  
	/**
	*  set variable wSegTitu
	*  @param value
	**/
   public void setWSegTitu(char[] value) throws CFException {
      section.setWSegTitu(value);
   } 

     /**
	 * 	Update WSegTitu 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWSegTitu(char[] source, int sourceIndex) throws CFException {
      section.setWSegTitu(source, sourceIndex);
   	
   }
   
   public void setWSegTitu(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWSegTitu(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WSegTitu 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWSegTitu(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWSegTitu(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WSegTitu with another Field
	 *	@param value
	 */
   public void setWSegTitu(Field source) {
      section.setWSegTitu(source);
   }  
   
     /**
	 * 	Update WSegTitu 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWSegTitu(Field source, int sourceIndex,int sourceLen) {
      section.setWSegTitu(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WSegTitu 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWSegTitu(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWSegTitu(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wTipPer01
	 *	@return wTipPer01
	 */
	public int getWTipPer01() throws CFException {
   		return wTipPerGroup.getWTipPer01();
	}


	/**
	 *	Returns String value of wTipPer01
	 *	@return wTipPer01
	 */
	public char[]  getWTipPer01String() throws CFException {
	     return String.valueOf(wTipPerGroup.getWTipPer01String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wTipPer01IsNumeric()  throws CFException{
	    return wTipPerGroup.wTipPer01IsNumeric();
	}

	/**
	 * 	Update WTipPer01 with the passed value
	 *	@param number
	 */
	public void setWTipPer01(int number)  throws CFException{
		wTipPerGroup.setWTipPer01(number);
	}
	

	public void setWTipPer01(long number)  throws CFException{
	    wTipPerGroup.setWTipPer01(number);
	}
	
	
	/**
	 * 	Update WTipPer01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWTipPer01(char[] value)  throws CFException {
		wTipPerGroup.setWTipPer01(value);
	}
	
	/**
	 * 	Update WTipPer01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWTipPer01String(char[] value)  throws CFException{
		wTipPerGroup.setWTipPer01(value);
	}	

	/**
	 *	Returns the value of wNcnAlmPe8090m
	 *	@return wNcnAlmPe8090m
	 */
	public int getWNcnAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWNcnAlmPe8090m();
	}
	
	/**
	 * 	Update WNcnAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcnAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWNcnAlmPe8090m(number);
	}


	public void setWNcnAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWNcnAlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wPriTitu
	 *	@return wPriTitu
	 */
   public char[] getWPriTitu() throws CFException  {              
   		return section.getWPriTitu();
   }

  
	/**
	*  set variable wPriTitu
	*  @param value
	**/
   public void setWPriTitu(char[] value) throws CFException {
      section.setWPriTitu(value);
   } 

     /**
	 * 	Update WPriTitu 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPriTitu(char[] source, int sourceIndex) throws CFException {
      section.setWPriTitu(source, sourceIndex);
   	
   }
   
   public void setWPriTitu(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWPriTitu(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WPriTitu 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPriTitu(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWPriTitu(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WPriTitu with another Field
	 *	@param value
	 */
   public void setWPriTitu(Field source) {
      section.setWPriTitu(source);
   }  
   
     /**
	 * 	Update WPriTitu 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPriTitu(Field source, int sourceIndex,int sourceLen) {
      section.setWPriTitu(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WPriTitu 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPriTitu(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWPriTitu(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wIndOpc
	 *	@return wIndOpc
	 */
	public int getWIndOpc() throws CFException {
   		return work.getWIndOpc();
	}


	/**
	 *	Returns String value of wIndOpc
	 *	@return wIndOpc
	 */
	public char[]  getWIndOpcString() throws CFException {
	     return String.valueOf(work.getWIndOpcString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wIndOpcIsNumeric()  throws CFException{
	    return work.wIndOpcIsNumeric();
	}

	/**
	 * 	Update WIndOpc with the passed value
	 *	@param number
	 */
	public void setWIndOpc(int number)  throws CFException{
		work.setWIndOpc(number);
	}
	

	public void setWIndOpc(long number)  throws CFException{
	    work.setWIndOpc(number);
	}
	
	
	/**
	 * 	Update WIndOpc with the passed value
	 *	@param value (String or char[])
	 */
	public void setWIndOpc(char[] value)  throws CFException {
		work.setWIndOpc(value);
	}
	
	/**
	 * 	Update WIndOpc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWIndOpcString(char[] value)  throws CFException{
		work.setWIndOpc(value);
	}	

	/**
	 *	Returns the value of wSepApe
	 *	@return wSepApe
	 */
   public char[] getWSepApe() throws CFException  {              
   		return work.getWSepApe();
   }

  
	/**
	*  set variable wSepApe
	*  @param value
	**/
   public void setWSepApe(char[] value) throws CFException {
      work.setWSepApe(value);
   } 

	/**
	 *	Returns the value of wSapPer
	 *	@return wSapPer
	 */
   public char[] getWSapPer() throws CFException  {              
   		return work.getWSapPer();
   }

  
	/**
	*  set variable wSapPer
	*  @param value
	**/
   public void setWSapPer(char[] value) throws CFException {
      work.setWSapPer(value);
   } 

	/**
	 *	Returns the value of wNomAlmPe8090m
	 *	@return wNomAlmPe8090m
	 */
   public char[] getWNomAlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWNomAlmPe8090m();
   }

  
	/**
	*  set variable wNomAlmPe8090m
	*  @param value
	**/
   public void setWNomAlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(value);
   } 

     /**
	 * 	Update WNomAlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNomAlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNomAlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNomAlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNomAlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source);
   }  
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPapPer
	 *	@return wPapPer
	 */
   public char[] getWPapPer() throws CFException  {              
   		return work.getWPapPer();
   }

  
	/**
	*  set variable wPapPer
	*  @param value
	**/
   public void setWPapPer(char[] value) throws CFException {
      work.setWPapPer(value);
   } 


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wRespuestaGroup.hashCode();
        str += section.hashCode();
        str += wTipPerGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public TraPerJurPe8090mOutCtx clone() {
        TraPerJurPe8090mOutCtx cloneObj = new TraPerJurPe8090mOutCtx();
        cloneObj.wRespuestaGroup = new WRespuestaGroup();
        cloneObj.wRespuestaGroup.set(wRespuestaGroup.getClonedField());
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.wTipPerGroup = new WTipPerGroup();
        cloneObj.wTipPerGroup.set(wTipPerGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TraPerJurPe8090mOutCtx getTraPerJurPe8090mOutCtx() {
            return new TraPerJurPe8090mOutCtx();
    }
     public class MontarTituloOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wTipAlmPe8090m
	 *	@return wTipAlmPe8090m
	 */
	public int getWTipAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWTipAlmPe8090m();
	}
	
	/**
	 * 	Update WTipAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWTipAlmPe8090m(number);
	}


	public void setWTipAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWTipAlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNc1AlmPe8090m
	 *	@return wNc1AlmPe8090m
	 */
	public int getWNc1AlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWNc1AlmPe8090m();
	}
	
	/**
	 * 	Update WNc1AlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWNc1AlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWNc1AlmPe8090m(number);
	}


	public void setWNc1AlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWNc1AlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNomAlmPe8090m
	 *	@return wNomAlmPe8090m
	 */
   public char[] getWNomAlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWNomAlmPe8090m();
   }

  
	/**
	*  set variable wNomAlmPe8090m
	*  @param value
	**/
   public void setWNomAlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(value);
   } 

     /**
	 * 	Update WNomAlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNomAlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNomAlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNomAlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNomAlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source);
   }  
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNc2AlmPe8090m
	 *	@return wNc2AlmPe8090m
	 */
	public int getWNc2AlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWNc2AlmPe8090m();
	}
	
	/**
	 * 	Update WNc2AlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWNc2AlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWNc2AlmPe8090m(number);
	}


	public void setWNc2AlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWNc2AlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNo1AlmPe8090m
	 *	@return wNo1AlmPe8090m
	 */
   public char[] getWNo1AlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWNo1AlmPe8090m();
   }

  
	/**
	*  set variable wNo1AlmPe8090m
	*  @param value
	**/
   public void setWNo1AlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(value);
   } 

     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNo1AlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNo1AlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source);
   }  
   
     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNo2AlmPe8090m
	 *	@return wNo2AlmPe8090m
	 */
   public char[] getWNo2AlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWNo2AlmPe8090m();
   }

  
	/**
	*  set variable wNo2AlmPe8090m
	*  @param value
	**/
   public void setWNo2AlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(value);
   } 

     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNo2AlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNo2AlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source);
   }  
   
     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNcnAlmPe8090m
	 *	@return wNcnAlmPe8090m
	 */
	public int getWNcnAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWNcnAlmPe8090m();
	}
	
	/**
	 * 	Update WNcnAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcnAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWNcnAlmPe8090m(number);
	}


	public void setWNcnAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWNcnAlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wIeqAlmPe8090m
	 *	@return wIeqAlmPe8090m
	 */
	public int getWIeqAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWIeqAlmPe8090m();
	}
	
	/**
	 * 	Update WIeqAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWIeqAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWIeqAlmPe8090m(number);
	}


	public void setWIeqAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWIeqAlmPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public MontarTituloOutCtx clone() {
        MontarTituloOutCtx cloneObj = new MontarTituloOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public MontarTituloOutCtx getMontarTituloOutCtx() {
            return new MontarTituloOutCtx();
    }
     public class EstruTitPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMaxTitPe8090m
	 *	@return wMaxTitPe8090m
	 */
	public int getWMaxTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWMaxTitPe8090m();
	}
	
	/**
	 * 	Update WMaxTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWMaxTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m(number);
	}


	public void setWMaxTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public EstruTitPe8090mInCtx clone() {
        EstruTitPe8090mInCtx cloneObj = new EstruTitPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public EstruTitPe8090mInCtx getEstruTitPe8090mInCtx() {
            return new EstruTitPe8090mInCtx();
    }
     public class RedGuiPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wOblTitPe8090m
	 *	@return wOblTitPe8090m
	 */
	public int getWOblTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOblTitPe8090m();
	}
	
	/**
	 * 	Update WOblTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOblTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOblTitPe8090m(number);
	}


	public void setWOblTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOblTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wCntOblPe8090m
	 *	@return wCntOblPe8090m
	 */
	public int getWCntOblPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntOblPe8090m();
	}
	
	/**
	 * 	Update WCntOblPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntOblPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntOblPe8090m(number);
	}


	public void setWCntOblPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntOblPe8090m((int)number);
	}


	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMaxTitPe8090m
	 *	@return wMaxTitPe8090m
	 */
	public int getWMaxTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWMaxTitPe8090m();
	}
	
	/**
	 * 	Update WMaxTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWMaxTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m(number);
	}


	public void setWMaxTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public RedGuiPe8090mOutCtx getRedGuiPe8090mOutCtx() {
            return new RedGuiPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public RedGuiPe8090mInCtx clone() {
        RedGuiPe8090mInCtx cloneObj = new RedGuiPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public RedGuiPe8090mInCtx getRedGuiPe8090mInCtx() {
            return new RedGuiPe8090mInCtx();
    }
     public class RedGuiPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wCntGioPe8090m
	 *	@return wCntGioPe8090m
	 */
	public int getWCntGioPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntGioPe8090m();
	}
	
	/**
	 * 	Update WCntGioPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntGioPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntGioPe8090m(number);
	}


	public void setWCntGioPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntGioPe8090m((int)number);
	}


	/**
	 *	Returns the value of wOblTitPe8090m
	 *	@return wOblTitPe8090m
	 */
	public int getWOblTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOblTitPe8090m();
	}
	
	/**
	 * 	Update WOblTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOblTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOblTitPe8090m(number);
	}


	public void setWOblTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOblTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wCntOblPe8090m
	 *	@return wCntOblPe8090m
	 */
	public int getWCntOblPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntOblPe8090m();
	}
	
	/**
	 * 	Update WCntOblPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntOblPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntOblPe8090m(number);
	}


	public void setWCntOblPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntOblPe8090m((int)number);
	}


	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMaxTitPe8090m
	 *	@return wMaxTitPe8090m
	 */
	public int getWMaxTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWMaxTitPe8090m();
	}
	
	/**
	 * 	Update WMaxTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWMaxTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m(number);
	}


	public void setWMaxTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wIndGioPe8090m
	 *	@return wIndGioPe8090m
	 */
	public int getWIndGioPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWIndGioPe8090m();
	}
	
	/**
	 * 	Update WIndGioPe8090m with the passed value
	 *	@param number
	 */
	public void setWIndGioPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWIndGioPe8090m(number);
	}


	public void setWIndGioPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWIndGioPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public RedGuiPe8090mOutCtx clone() {
        RedGuiPe8090mOutCtx cloneObj = new RedGuiPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public RedGuiPe8090mOutCtx getRedGuiPe8090mOutCtx() {
            return new RedGuiPe8090mOutCtx();
    }
     public class RedSegApePe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();


public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}

        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public RedSegApePe8090mOutCtx getRedSegApePe8090mOutCtx() {
            return new RedSegApePe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public RedSegApePe8090mInCtx clone() {
        RedSegApePe8090mInCtx cloneObj = new RedSegApePe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public RedSegApePe8090mInCtx getRedSegApePe8090mInCtx() {
            return new RedSegApePe8090mInCtx();
    }
     public class RedSegApePe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wPerGruPe8090m
	 *	@return wPerGruPe8090m
	 */
	public int getWPerGruPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWPerGruPe8090m();
	}
	
	/**
	 * 	Update WPerGruPe8090m with the passed value
	 *	@param number
	 */
	public void setWPerGruPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m(number);
	}


	public void setWPerGruPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTipPe8090m
	 *	@return wTipPe8090m
	 */
	public int getWTipPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTipPe8090m();
	}
	
	/**
	 * 	Update WTipPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m(number);
	}


	public void setWTipPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m((int)number);
	}



public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Test condition "S" for isInpDown1vez()
	 *	@return  Returns true if isInpDown1vez() is "S"
	 */
   public boolean isInpDown1vez() throws CFException {
      return work.isInpDown1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpDown1vezTrue()  throws CFException{  			
    	work.setInpDown1vezTrue();
   	}
	/**
	 *	Returns the value of wNcaNo1Pe8090m
	 *	@return wNcaNo1Pe8090m
	 */
	public int getWNcaNo1Pe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNo1Pe8090m();
	}
	
	/**
	 * 	Update WNcaNo1Pe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNo1Pe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNo1Pe8090m(number);
	}


	public void setWNcaNo1Pe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNo1Pe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcaNomPe8090m
	 *	@return wNcaNomPe8090m
	 */
	public int getWNcaNomPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNomPe8090m();
	}
	
	/**
	 * 	Update WNcaNomPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNomPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m(number);
	}


	public void setWNcaNomPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m((int)number);
	}


	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMaxTitPe8090m
	 *	@return wMaxTitPe8090m
	 */
	public int getWMaxTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWMaxTitPe8090m();
	}
	
	/**
	 * 	Update WMaxTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWMaxTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m(number);
	}


	public void setWMaxTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcaNo2Pe8090m
	 *	@return wNcaNo2Pe8090m
	 */
	public int getWNcaNo2Pe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNo2Pe8090m();
	}
	
	/**
	 * 	Update WNcaNo2Pe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNo2Pe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNo2Pe8090m(number);
	}


	public void setWNcaNo2Pe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNo2Pe8090m((int)number);
	}


	/**
	 *	Returns the value of wNo1Pe8090m
	 *	@return wNo1Pe8090m
	 */
   public char[] getWNo1Pe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNo1Pe8090m();
   }

  
	/**
	*  set variable wNo1Pe8090m
	*  @param value
	**/
   public void setWNo1Pe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(value);
   } 

     /**
	 * 	Update WNo1Pe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex);
   	
   }
   
   public void setWNo1Pe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNo1Pe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNo1Pe8090m with another Field
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source);
   }  
   
     /**
	 * 	Update WNo1Pe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNo1Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public RedSegApePe8090mOutCtx clone() {
        RedSegApePe8090mOutCtx cloneObj = new RedSegApePe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public RedSegApePe8090mOutCtx getRedSegApePe8090mOutCtx() {
            return new RedSegApePe8090mOutCtx();
    }
     public class RestInpUnoPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wTipPe8090m
	 *	@return wTipPe8090m
	 */
	public int getWTipPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTipPe8090m();
	}
	
	/**
	 * 	Update WTipPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m(number);
	}


	public void setWTipPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m((int)number);
	}



public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Test condition "S" for isInpDown1vez()
	 *	@return  Returns true if isInpDown1vez() is "S"
	 */
   public boolean isInpDown1vez() throws CFException {
      return work.isInpDown1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpDown1vezTrue()  throws CFException{  			
    	work.setInpDown1vezTrue();
   	}
	/**
	 *	Returns the value of wNcaNomPe8090m
	 *	@return wNcaNomPe8090m
	 */
	public int getWNcaNomPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNomPe8090m();
	}
	
	/**
	 * 	Update WNcaNomPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNomPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m(number);
	}


	public void setWNcaNomPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcaNo1Pe8090m
	 *	@return wNcaNo1Pe8090m
	 */
	public int getWNcaNo1Pe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNo1Pe8090m();
	}
	
	/**
	 * 	Update WNcaNo1Pe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNo1Pe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNo1Pe8090m(number);
	}


	public void setWNcaNo1Pe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNo1Pe8090m((int)number);
	}


	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMaxTitPe8090m
	 *	@return wMaxTitPe8090m
	 */
	public int getWMaxTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWMaxTitPe8090m();
	}
	
	/**
	 * 	Update WMaxTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWMaxTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m(number);
	}


	public void setWMaxTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNo1Pe8090m
	 *	@return wNo1Pe8090m
	 */
   public char[] getWNo1Pe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNo1Pe8090m();
   }

  
	/**
	*  set variable wNo1Pe8090m
	*  @param value
	**/
   public void setWNo1Pe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(value);
   } 

     /**
	 * 	Update WNo1Pe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex);
   	
   }
   
   public void setWNo1Pe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNo1Pe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNo1Pe8090m with another Field
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source);
   }  
   
     /**
	 * 	Update WNo1Pe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNo1Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public RestInpUnoPe8090mOutCtx getRestInpUnoPe8090mOutCtx() {
            return new RestInpUnoPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public RestInpUnoPe8090mInCtx clone() {
        RestInpUnoPe8090mInCtx cloneObj = new RestInpUnoPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public RestInpUnoPe8090mInCtx getRestInpUnoPe8090mInCtx() {
            return new RestInpUnoPe8090mInCtx();
    }
     public class RestInpUnoPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Test condition "N" for isNoInpDown1vez()
	 *	@return  Returns true if isNoInpDown1vez() is "N"
	 */
   public boolean isNoInpDown1vez() throws CFException {
      return work.isNoInpDown1vez();
   }

	/**
	*  set values "N"
	*/
   	public void setNoInpDown1vezTrue()  throws CFException{  			
    	work.setNoInpDown1vezTrue();
   	}
	/**
	 *	Returns the value of wTipPe8090m
	 *	@return wTipPe8090m
	 */
	public int getWTipPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTipPe8090m();
	}
	
	/**
	 * 	Update WTipPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m(number);
	}


	public void setWTipPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m((int)number);
	}



public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wImpPe8090m
	 *	@return wImpPe8090m
	 */
	public int getWImpPe8090m() throws CFException {        
   		return section.getWImpPe8090m();
	}
	
	/**
	 * 	Update WImpPe8090m with the passed value
	 *	@param number
	 */
	public void setWImpPe8090m(int number)  throws CFException{
		section.setWImpPe8090m(number);
	}


	public void setWImpPe8090m(long number)  throws CFException{
		section.setWImpPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcaNomPe8090m
	 *	@return wNcaNomPe8090m
	 */
	public int getWNcaNomPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNomPe8090m();
	}
	
	/**
	 * 	Update WNcaNomPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNomPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m(number);
	}


	public void setWNcaNomPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcaNo1Pe8090m
	 *	@return wNcaNo1Pe8090m
	 */
	public int getWNcaNo1Pe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNo1Pe8090m();
	}
	
	/**
	 * 	Update WNcaNo1Pe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNo1Pe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNo1Pe8090m(number);
	}


	public void setWNcaNo1Pe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNo1Pe8090m((int)number);
	}


	/**
	 *	Returns the value of wNomPe8090m
	 *	@return wNomPe8090m
	 */
   public char[] getWNomPe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNomPe8090m();
   }

  
	/**
	*  set variable wNomPe8090m
	*  @param value
	**/
   public void setWNomPe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(value);
   } 

     /**
	 * 	Update WNomPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNomPe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNomPe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNomPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNomPe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNomPe8090m with another Field
	 *	@param value
	 */
   public void setWNomPe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source);
   }  
   
     /**
	 * 	Update WNomPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNomPe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNomPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNomPe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNo1Pe8090m
	 *	@return wNo1Pe8090m
	 */
   public char[] getWNo1Pe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNo1Pe8090m();
   }

  
	/**
	*  set variable wNo1Pe8090m
	*  @param value
	**/
   public void setWNo1Pe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(value);
   } 

     /**
	 * 	Update WNo1Pe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex);
   	
   }
   
   public void setWNo1Pe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNo1Pe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNo1Pe8090m with another Field
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source);
   }  
   
     /**
	 * 	Update WNo1Pe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNo1Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public RestInpUnoPe8090mOutCtx clone() {
        RestInpUnoPe8090mOutCtx cloneObj = new RestInpUnoPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public RestInpUnoPe8090mOutCtx getRestInpUnoPe8090mOutCtx() {
            return new RestInpUnoPe8090mOutCtx();
    }
     public class RedNomIniPe8090mOutCtx implements Cloneable {
     Work work = Bm8090mCtx.this.getWork();


public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Test condition "S" for isInpDown1vez()
	 *	@return  Returns true if isInpDown1vez() is "S"
	 */
   public boolean isInpDown1vez() throws CFException {
      return work.isInpDown1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpDown1vezTrue()  throws CFException{  			
    	work.setInpDown1vezTrue();
   	}

        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public RedNomIniPe8090mOutCtx clone() {
        RedNomIniPe8090mOutCtx cloneObj = new RedNomIniPe8090mOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public RedNomIniPe8090mOutCtx getRedNomIniPe8090mOutCtx() {
            return new RedNomIniPe8090mOutCtx();
    }
     public class RestInpDosPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wTipPe8090m
	 *	@return wTipPe8090m
	 */
	public int getWTipPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTipPe8090m();
	}
	
	/**
	 * 	Update WTipPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m(number);
	}


	public void setWTipPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m((int)number);
	}



public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Test condition "S" for isInpDown1vez()
	 *	@return  Returns true if isInpDown1vez() is "S"
	 */
   public boolean isInpDown1vez() throws CFException {
      return work.isInpDown1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpDown1vezTrue()  throws CFException{  			
    	work.setInpDown1vezTrue();
   	}
	/**
	 *	Returns the value of wNcaNomPe8090m
	 *	@return wNcaNomPe8090m
	 */
	public int getWNcaNomPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNomPe8090m();
	}
	
	/**
	 * 	Update WNcaNomPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNomPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m(number);
	}


	public void setWNcaNomPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m((int)number);
	}


	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMaxTitPe8090m
	 *	@return wMaxTitPe8090m
	 */
	public int getWMaxTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWMaxTitPe8090m();
	}
	
	/**
	 * 	Update WMaxTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWMaxTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m(number);
	}


	public void setWMaxTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcaNo2Pe8090m
	 *	@return wNcaNo2Pe8090m
	 */
	public int getWNcaNo2Pe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNo2Pe8090m();
	}
	
	/**
	 * 	Update WNcaNo2Pe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNo2Pe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNo2Pe8090m(number);
	}


	public void setWNcaNo2Pe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNo2Pe8090m((int)number);
	}


	/**
	 *	Returns the value of wNo2Pe8090m
	 *	@return wNo2Pe8090m
	 */
   public char[] getWNo2Pe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNo2Pe8090m();
   }

  
	/**
	*  set variable wNo2Pe8090m
	*  @param value
	**/
   public void setWNo2Pe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(value);
   } 

     /**
	 * 	Update WNo2Pe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex);
   	
   }
   
   public void setWNo2Pe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNo2Pe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNo2Pe8090m with another Field
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source);
   }  
   
     /**
	 * 	Update WNo2Pe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNo2Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public RestInpDosPe8090mOutCtx getRestInpDosPe8090mOutCtx() {
            return new RestInpDosPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public RestInpDosPe8090mInCtx clone() {
        RestInpDosPe8090mInCtx cloneObj = new RestInpDosPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public RestInpDosPe8090mInCtx getRestInpDosPe8090mInCtx() {
            return new RestInpDosPe8090mInCtx();
    }
     public class RestInpDosPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Test condition "N" for isNoInpDown1vez()
	 *	@return  Returns true if isNoInpDown1vez() is "N"
	 */
   public boolean isNoInpDown1vez() throws CFException {
      return work.isNoInpDown1vez();
   }

	/**
	*  set values "N"
	*/
   	public void setNoInpDown1vezTrue()  throws CFException{  			
    	work.setNoInpDown1vezTrue();
   	}

public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wImpPe8090m
	 *	@return wImpPe8090m
	 */
	public int getWImpPe8090m() throws CFException {        
   		return section.getWImpPe8090m();
	}
	
	/**
	 * 	Update WImpPe8090m with the passed value
	 *	@param number
	 */
	public void setWImpPe8090m(int number)  throws CFException{
		section.setWImpPe8090m(number);
	}


	public void setWImpPe8090m(long number)  throws CFException{
		section.setWImpPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcaNomPe8090m
	 *	@return wNcaNomPe8090m
	 */
	public int getWNcaNomPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNomPe8090m();
	}
	
	/**
	 * 	Update WNcaNomPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNomPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m(number);
	}


	public void setWNcaNomPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNomPe8090m
	 *	@return wNomPe8090m
	 */
   public char[] getWNomPe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNomPe8090m();
   }

  
	/**
	*  set variable wNomPe8090m
	*  @param value
	**/
   public void setWNomPe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(value);
   } 

     /**
	 * 	Update WNomPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNomPe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNomPe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNomPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNomPe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNomPe8090m with another Field
	 *	@param value
	 */
   public void setWNomPe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source);
   }  
   
     /**
	 * 	Update WNomPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNomPe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNomPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNomPe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcaNo2Pe8090m
	 *	@return wNcaNo2Pe8090m
	 */
	public int getWNcaNo2Pe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNo2Pe8090m();
	}
	
	/**
	 * 	Update WNcaNo2Pe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNo2Pe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNo2Pe8090m(number);
	}


	public void setWNcaNo2Pe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNo2Pe8090m((int)number);
	}


	/**
	 *	Returns the value of wNo2Pe8090m
	 *	@return wNo2Pe8090m
	 */
   public char[] getWNo2Pe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNo2Pe8090m();
   }

  
	/**
	*  set variable wNo2Pe8090m
	*  @param value
	**/
   public void setWNo2Pe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(value);
   } 

     /**
	 * 	Update WNo2Pe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex);
   	
   }
   
   public void setWNo2Pe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNo2Pe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNo2Pe8090m with another Field
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source);
   }  
   
     /**
	 * 	Update WNo2Pe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNo2Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public RestInpDosPe8090mOutCtx clone() {
        RestInpDosPe8090mOutCtx cloneObj = new RestInpDosPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public RestInpDosPe8090mOutCtx getRestInpDosPe8090mOutCtx() {
            return new RestInpDosPe8090mOutCtx();
    }
     public class RedPersoPe8090mOutCtx implements Cloneable {
     Work work = Bm8090mCtx.this.getWork();


public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Test condition "S" for isInpDown1vez()
	 *	@return  Returns true if isInpDown1vez() is "S"
	 */
   public boolean isInpDown1vez() throws CFException {
      return work.isInpDown1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpDown1vezTrue()  throws CFException{  			
    	work.setInpDown1vezTrue();
   	}

        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public RedPersoPe8090mOutCtx clone() {
        RedPersoPe8090mOutCtx cloneObj = new RedPersoPe8090mOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public RedPersoPe8090mOutCtx getRedPersoPe8090mOutCtx() {
            return new RedPersoPe8090mOutCtx();
    }
     public class RestInpTresPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wPerGruPe8090m
	 *	@return wPerGruPe8090m
	 */
	public int getWPerGruPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWPerGruPe8090m();
	}
	
	/**
	 * 	Update WPerGruPe8090m with the passed value
	 *	@param number
	 */
	public void setWPerGruPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m(number);
	}


	public void setWPerGruPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNmaSepPe8090m
	 *	@return wNmaSepPe8090m
	 */
	public int getWNmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNmaSepPe8090m();
	}
	
	/**
	 * 	Update WNmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWNmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m(number);
	}


	public void setWNmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTipPe8090m
	 *	@return wTipPe8090m
	 */
	public int getWTipPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTipPe8090m();
	}
	
	/**
	 * 	Update WTipPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m(number);
	}


	public void setWTipPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m((int)number);
	}



public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Test condition "S" for isInpDown1vez()
	 *	@return  Returns true if isInpDown1vez() is "S"
	 */
   public boolean isInpDown1vez() throws CFException {
      return work.isInpDown1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpDown1vezTrue()  throws CFException{  			
    	work.setInpDown1vezTrue();
   	}
	/**
	 *	Returns the value of wNcaNomPe8090m
	 *	@return wNcaNomPe8090m
	 */
	public int getWNcaNomPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNomPe8090m();
	}
	
	/**
	 * 	Update WNcaNomPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNomPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m(number);
	}


	public void setWNcaNomPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m((int)number);
	}


	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public RestInpTresPe8090mOutCtx getRestInpTresPe8090mOutCtx() {
            return new RestInpTresPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public RestInpTresPe8090mInCtx clone() {
        RestInpTresPe8090mInCtx cloneObj = new RestInpTresPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public RestInpTresPe8090mInCtx getRestInpTresPe8090mInCtx() {
            return new RestInpTresPe8090mInCtx();
    }
     public class RestInpTresPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wPerGruPe8090m
	 *	@return wPerGruPe8090m
	 */
	public int getWPerGruPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWPerGruPe8090m();
	}
	
	/**
	 * 	Update WPerGruPe8090m with the passed value
	 *	@param number
	 */
	public void setWPerGruPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m(number);
	}


	public void setWPerGruPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNmaSepPe8090m
	 *	@return wNmaSepPe8090m
	 */
	public int getWNmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNmaSepPe8090m();
	}
	
	/**
	 * 	Update WNmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWNmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m(number);
	}


	public void setWNmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m((int)number);
	}


	/**
	 *	Test condition "N" for isNoInpDown1vez()
	 *	@return  Returns true if isNoInpDown1vez() is "N"
	 */
   public boolean isNoInpDown1vez() throws CFException {
      return work.isNoInpDown1vez();
   }

	/**
	*  set values "N"
	*/
   	public void setNoInpDown1vezTrue()  throws CFException{  			
    	work.setNoInpDown1vezTrue();
   	}

public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wNcaNomPe8090m
	 *	@return wNcaNomPe8090m
	 */
	public int getWNcaNomPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNomPe8090m();
	}
	
	/**
	 * 	Update WNcaNomPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNomPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m(number);
	}


	public void setWNcaNomPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNomPe8090m
	 *	@return wNomPe8090m
	 */
   public char[] getWNomPe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNomPe8090m();
   }

  
	/**
	*  set variable wNomPe8090m
	*  @param value
	**/
   public void setWNomPe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(value);
   } 

     /**
	 * 	Update WNomPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNomPe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNomPe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNomPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNomPe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNomPe8090m with another Field
	 *	@param value
	 */
   public void setWNomPe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source);
   }  
   
     /**
	 * 	Update WNomPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNomPe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNomPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNomPe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public RestInpTresPe8090mOutCtx clone() {
        RestInpTresPe8090mOutCtx cloneObj = new RestInpTresPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public RestInpTresPe8090mOutCtx getRestInpTresPe8090mOutCtx() {
            return new RestInpTresPe8090mOutCtx();
    }
     public class InvPerActPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wPerGruPe8090m
	 *	@return wPerGruPe8090m
	 */
	public int getWPerGruPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWPerGruPe8090m();
	}
	
	/**
	 * 	Update WPerGruPe8090m with the passed value
	 *	@param number
	 */
	public void setWPerGruPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m(number);
	}


	public void setWPerGruPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNmaSepPe8090m
	 *	@return wNmaSepPe8090m
	 */
	public int getWNmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNmaSepPe8090m();
	}
	
	/**
	 * 	Update WNmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWNmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m(number);
	}


	public void setWNmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m((int)number);
	}


	/**
	 *	Test condition "S" for isInpUp1vez()
	 *	@return  Returns true if isInpUp1vez() is "S"
	 */
   public boolean isInpUp1vez() throws CFException {
      return work.isInpUp1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpUp1vezTrue()  throws CFException{  			
    	work.setInpUp1vezTrue();
   	}

public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wMasFpfPe8090m
	 *	@return wMasFpfPe8090m
	 */
   public char[] getWMasFpfPe8090m() throws CFException  {              
   		return section.getWZonFpfPe8090m().getWMasFpfPe8090m();
   }

  
	/**
	*  set variable wMasFpfPe8090m
	*  @param value
	**/
   public void setWMasFpfPe8090m(char[] value) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(value);
   } 

     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasFpfPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasFpfPe8090m with another Field
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source);
   }  
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "S" for isInpDown1vez()
	 *	@return  Returns true if isInpDown1vez() is "S"
	 */
   public boolean isInpDown1vez() throws CFException {
      return work.isInpDown1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpDown1vezTrue()  throws CFException{  			
    	work.setInpDown1vezTrue();
   	}
	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTmaFpfPe8090m
	 *	@return wTmaFpfPe8090m
	 */
	public int getWTmaFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTmaFpfPe8090m();
	}
	
	/**
	 * 	Update WTmaFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m(number);
	}


	public void setWTmaFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcmFpfPe8090m
	 *	@return wNcmFpfPe8090m
	 */
	public int getWNcmFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNcmFpfPe8090m();
	}
	
	/**
	 * 	Update WNcmFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcmFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m(number);
	}


	public void setWNcmFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMaxTitPe8090m
	 *	@return wMaxTitPe8090m
	 */
	public int getWMaxTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWMaxTitPe8090m();
	}
	
	/**
	 * 	Update WMaxTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWMaxTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m(number);
	}


	public void setWMaxTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public InvPerActPe8090mOutCtx getInvPerActPe8090mOutCtx() {
            return new InvPerActPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InvPerActPe8090mInCtx clone() {
        InvPerActPe8090mInCtx cloneObj = new InvPerActPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InvPerActPe8090mInCtx getInvPerActPe8090mInCtx() {
            return new InvPerActPe8090mInCtx();
    }
     public class InvPerActPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wTipPe8090m
	 *	@return wTipPe8090m
	 */
	public int getWTipPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTipPe8090m();
	}
	
	/**
	 * 	Update WTipPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m(number);
	}


	public void setWTipPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m((int)number);
	}



public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wTipFpfPe8090m
	 *	@return wTipFpfPe8090m
	 */
	public int getWTipFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTipFpfPe8090m();
	}
	
	/**
	 * 	Update WTipFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTipFpfPe8090m(number);
	}


	public void setWTipFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTipFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcmFpfPe8090m
	 *	@return wNcmFpfPe8090m
	 */
	public int getWNcmFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNcmFpfPe8090m();
	}
	
	/**
	 * 	Update WNcmFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcmFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m(number);
	}


	public void setWNcmFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wPerGruPe8090m
	 *	@return wPerGruPe8090m
	 */
	public int getWPerGruPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWPerGruPe8090m();
	}
	
	/**
	 * 	Update WPerGruPe8090m with the passed value
	 *	@param number
	 */
	public void setWPerGruPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m(number);
	}


	public void setWPerGruPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNmaSepPe8090m
	 *	@return wNmaSepPe8090m
	 */
	public int getWNmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNmaSepPe8090m();
	}
	
	/**
	 * 	Update WNmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWNmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m(number);
	}


	public void setWNmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m((int)number);
	}


	/**
	 *	Test condition "N" for isNoInpDown1vez()
	 *	@return  Returns true if isNoInpDown1vez() is "N"
	 */
   public boolean isNoInpDown1vez() throws CFException {
      return work.isNoInpDown1vez();
   }

	/**
	*  set values "N"
	*/
   	public void setNoInpDown1vezTrue()  throws CFException{  			
    	work.setNoInpDown1vezTrue();
   	}
	/**
	 *	Returns the value of wMasFpfPe8090m
	 *	@return wMasFpfPe8090m
	 */
   public char[] getWMasFpfPe8090m() throws CFException  {              
   		return section.getWZonFpfPe8090m().getWMasFpfPe8090m();
   }

  
	/**
	*  set variable wMasFpfPe8090m
	*  @param value
	**/
   public void setWMasFpfPe8090m(char[] value) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(value);
   } 

     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasFpfPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasFpfPe8090m with another Field
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source);
   }  
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wCntFisPe8090m
	 *	@return wCntFisPe8090m
	 */
	public int getWCntFisPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntFisPe8090m();
	}
	
	/**
	 * 	Update WCntFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntFisPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m(number);
	}


	public void setWCntFisPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m((int)number);
	}


	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTmaFpfPe8090m
	 *	@return wTmaFpfPe8090m
	 */
	public int getWTmaFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTmaFpfPe8090m();
	}
	
	/**
	 * 	Update WTmaFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m(number);
	}


	public void setWTmaFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTmaSepPe8090m
	 *	@return wTmaSepPe8090m
	 */
	public int getWTmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTmaSepPe8090m();
	}
	
	/**
	 * 	Update WTmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTmaSepPe8090m(number);
	}


	public void setWTmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTmaSepPe8090m((int)number);
	}


	/**
	 *	Test condition "N" for isNoInpUp1vez()
	 *	@return  Returns true if isNoInpUp1vez() is "N"
	 */
   public boolean isNoInpUp1vez() throws CFException {
      return work.isNoInpUp1vez();
   }

	/**
	*  set values "N"
	*/
   	public void setNoInpUp1vezTrue()  throws CFException{  			
    	work.setNoInpUp1vezTrue();
   	}
	/**
	 *	Returns the value of wNupFpfPe8090m
	 *	@return wNupFpfPe8090m
	 */
	public int getWNupFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNupFpfPe8090m();
	}
	
	/**
	 * 	Update WNupFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNupFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m(number);
	}


	public void setWNupFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMasSepPe8090m
	 *	@return wMasSepPe8090m
	 */
   public char[] getWMasSepPe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWMasSepPe8090m();
   }

  
	/**
	*  set variable wMasSepPe8090m
	*  @param value
	**/
   public void setWMasSepPe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(value);
   } 

     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasSepPe8090m with another Field
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source);
   }  
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InvPerActPe8090mOutCtx clone() {
        InvPerActPe8090mOutCtx cloneObj = new InvPerActPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InvPerActPe8090mOutCtx getInvPerActPe8090mOutCtx() {
            return new InvPerActPe8090mOutCtx();
    }
     public class ElimPriPerPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wPerGruPe8090m
	 *	@return wPerGruPe8090m
	 */
	public int getWPerGruPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWPerGruPe8090m();
	}
	
	/**
	 * 	Update WPerGruPe8090m with the passed value
	 *	@param number
	 */
	public void setWPerGruPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m(number);
	}


	public void setWPerGruPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m((int)number);
	}



public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wMasFpfPe8090m
	 *	@return wMasFpfPe8090m
	 */
   public char[] getWMasFpfPe8090m() throws CFException  {              
   		return section.getWZonFpfPe8090m().getWMasFpfPe8090m();
   }

  
	/**
	*  set variable wMasFpfPe8090m
	*  @param value
	**/
   public void setWMasFpfPe8090m(char[] value) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(value);
   } 

     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasFpfPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasFpfPe8090m with another Field
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source);
   }  
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTmaFpfPe8090m
	 *	@return wTmaFpfPe8090m
	 */
	public int getWTmaFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTmaFpfPe8090m();
	}
	
	/**
	 * 	Update WTmaFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m(number);
	}


	public void setWTmaFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcmFpfPe8090m
	 *	@return wNcmFpfPe8090m
	 */
	public int getWNcmFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNcmFpfPe8090m();
	}
	
	/**
	 * 	Update WNcmFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcmFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m(number);
	}


	public void setWNcmFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public ElimPriPerPe8090mOutCtx getElimPriPerPe8090mOutCtx() {
            return new ElimPriPerPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public ElimPriPerPe8090mInCtx clone() {
        ElimPriPerPe8090mInCtx cloneObj = new ElimPriPerPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public ElimPriPerPe8090mInCtx getElimPriPerPe8090mInCtx() {
            return new ElimPriPerPe8090mInCtx();
    }
     public class ElimPriPerPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wPerGruPe8090m
	 *	@return wPerGruPe8090m
	 */
	public int getWPerGruPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWPerGruPe8090m();
	}
	
	/**
	 * 	Update WPerGruPe8090m with the passed value
	 *	@param number
	 */
	public void setWPerGruPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m(number);
	}


	public void setWPerGruPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNmaSepPe8090m
	 *	@return wNmaSepPe8090m
	 */
	public int getWNmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNmaSepPe8090m();
	}
	
	/**
	 * 	Update WNmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWNmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m(number);
	}


	public void setWNmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMasFpfPe8090m
	 *	@return wMasFpfPe8090m
	 */
   public char[] getWMasFpfPe8090m() throws CFException  {              
   		return section.getWZonFpfPe8090m().getWMasFpfPe8090m();
   }

  
	/**
	*  set variable wMasFpfPe8090m
	*  @param value
	**/
   public void setWMasFpfPe8090m(char[] value) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(value);
   } 

     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasFpfPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasFpfPe8090m with another Field
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source);
   }  
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTmaFpfPe8090m
	 *	@return wTmaFpfPe8090m
	 */
	public int getWTmaFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTmaFpfPe8090m();
	}
	
	/**
	 * 	Update WTmaFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m(number);
	}


	public void setWTmaFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTipFpfPe8090m
	 *	@return wTipFpfPe8090m
	 */
	public int getWTipFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTipFpfPe8090m();
	}
	
	/**
	 * 	Update WTipFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTipFpfPe8090m(number);
	}


	public void setWTipFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTipFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTmaSepPe8090m
	 *	@return wTmaSepPe8090m
	 */
	public int getWTmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTmaSepPe8090m();
	}
	
	/**
	 * 	Update WTmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTmaSepPe8090m(number);
	}


	public void setWTmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTmaSepPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcmFpfPe8090m
	 *	@return wNcmFpfPe8090m
	 */
	public int getWNcmFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNcmFpfPe8090m();
	}
	
	/**
	 * 	Update WNcmFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcmFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m(number);
	}


	public void setWNcmFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNupFpfPe8090m
	 *	@return wNupFpfPe8090m
	 */
	public int getWNupFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNupFpfPe8090m();
	}
	
	/**
	 * 	Update WNupFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNupFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m(number);
	}


	public void setWNupFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMasSepPe8090m
	 *	@return wMasSepPe8090m
	 */
   public char[] getWMasSepPe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWMasSepPe8090m();
   }

  
	/**
	*  set variable wMasSepPe8090m
	*  @param value
	**/
   public void setWMasSepPe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(value);
   } 

     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasSepPe8090m with another Field
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source);
   }  
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public ElimPriPerPe8090mOutCtx clone() {
        ElimPriPerPe8090mOutCtx cloneObj = new ElimPriPerPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public ElimPriPerPe8090mOutCtx getElimPriPerPe8090mOutCtx() {
            return new ElimPriPerPe8090mOutCtx();
    }
     public class ConfecTitPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Test condition "S" for isInpUp1vez()
	 *	@return  Returns true if isInpUp1vez() is "S"
	 */
   public boolean isInpUp1vez() throws CFException {
      return work.isInpUp1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpUp1vezTrue()  throws CFException{  			
    	work.setInpUp1vezTrue();
   	}

public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wPoiGuaPe8090m
	 *	@return wPoiGuaPe8090m
	 */
	public int getWPoiGuaPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiGuaPe8090m();
	}
	
	/**
	 * 	Update WPoiGuaPe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiGuaPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m(number);
	}


	public void setWPoiGuaPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m((int)number);
	}


	/**
	 *	Returns the value of wPoiNtePe8090m
	 *	@return wPoiNtePe8090m
	 */
	public int getWPoiNtePe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiNtePe8090m();
	}
	
	/**
	 * 	Update WPoiNtePe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiNtePe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiNtePe8090m(number);
	}


	public void setWPoiNtePe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiNtePe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ConfecTitPe8090mOutCtx clone() {
        ConfecTitPe8090mOutCtx cloneObj = new ConfecTitPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ConfecTitPe8090mOutCtx getConfecTitPe8090mOutCtx() {
            return new ConfecTitPe8090mOutCtx();
    }
     public class TraPerOptPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Test condition "S" for isInpUp1vez()
	 *	@return  Returns true if isInpUp1vez() is "S"
	 */
   public boolean isInpUp1vez() throws CFException {
      return work.isInpUp1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpUp1vezTrue()  throws CFException{  			
    	work.setInpUp1vezTrue();
   	}
	/**
	 *	Returns the value of wTipPe8090m
	 *	@return wTipPe8090m
	 */
	public int getWTipPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTipPe8090m();
	}
	
	/**
	 * 	Update WTipPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m(number);
	}


	public void setWTipPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m((int)number);
	}



public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wIsePe8090m
	 *	@return wIsePe8090m
	 */
	public int getWIsePe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWIsePe8090m();
	}
	
	/**
	 * 	Update WIsePe8090m with the passed value
	 *	@param number
	 */
	public void setWIsePe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWIsePe8090m(number);
	}


	public void setWIsePe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWIsePe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public TraPerOptPe8090mOutCtx getTraPerOptPe8090mOutCtx() {
            return new TraPerOptPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public TraPerOptPe8090mInCtx clone() {
        TraPerOptPe8090mInCtx cloneObj = new TraPerOptPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TraPerOptPe8090mInCtx getTraPerOptPe8090mInCtx() {
            return new TraPerOptPe8090mInCtx();
    }
     public class TraPerOptPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();


public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Test condition "N" for isNoInpUp1vez()
	 *	@return  Returns true if isNoInpUp1vez() is "N"
	 */
   public boolean isNoInpUp1vez() throws CFException {
      return work.isNoInpUp1vez();
   }

	/**
	*  set values "N"
	*/
   	public void setNoInpUp1vezTrue()  throws CFException{  			
    	work.setNoInpUp1vezTrue();
   	}

        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public TraPerOptPe8090mOutCtx clone() {
        TraPerOptPe8090mOutCtx cloneObj = new TraPerOptPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TraPerOptPe8090mOutCtx getTraPerOptPe8090mOutCtx() {
            return new TraPerOptPe8090mOutCtx();
    }
     public class SepGuiPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wIndGioPe8090m
	 *	@return wIndGioPe8090m
	 */
	public int getWIndGioPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWIndGioPe8090m();
	}
	
	/**
	 * 	Update WIndGioPe8090m with the passed value
	 *	@param number
	 */
	public void setWIndGioPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWIndGioPe8090m(number);
	}


	public void setWIndGioPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWIndGioPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public SepGuiPe8090mInCtx clone() {
        SepGuiPe8090mInCtx cloneObj = new SepGuiPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public SepGuiPe8090mInCtx getSepGuiPe8090mInCtx() {
            return new SepGuiPe8090mInCtx();
    }
     public class StringGuiUnoPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wPoiGuaPe8090m
	 *	@return wPoiGuaPe8090m
	 */
	public int getWPoiGuaPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiGuaPe8090m();
	}
	
	/**
	 * 	Update WPoiGuaPe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiGuaPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m(number);
	}


	public void setWPoiGuaPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public StringGuiUnoPe8090mOutCtx getStringGuiUnoPe8090mOutCtx() {
            return new StringGuiUnoPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public StringGuiUnoPe8090mInCtx clone() {
        StringGuiUnoPe8090mInCtx cloneObj = new StringGuiUnoPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public StringGuiUnoPe8090mInCtx getStringGuiUnoPe8090mInCtx() {
            return new StringGuiUnoPe8090mInCtx();
    }
     public class StringGuiUnoPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wTitulPe8090m
	 *	@return wTitulPe8090m
	 */
   public char[] getWTitulPe8090m() throws CFException  {              
   		return section.getWTitulPe8090m();
   }

  
	/**
	*  set variable wTitulPe8090m
	*  @param value
	**/
   public void setWTitulPe8090m(char[] value) throws CFException {
      section.setWTitulPe8090m(value);
   } 

     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWTitulPe8090m(source, sourceIndex);
   	
   }
   
   public void setWTitulPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WTitulPe8090m with another Field
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source) {
      section.setWTitulPe8090m(source);
   }  
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPoiGuaPe8090m
	 *	@return wPoiGuaPe8090m
	 */
	public int getWPoiGuaPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiGuaPe8090m();
	}
	
	/**
	 * 	Update WPoiGuaPe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiGuaPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m(number);
	}


	public void setWPoiGuaPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m((int)number);
	}


	/**
	 *	Returns the value of wPoiNtePe8090m
	 *	@return wPoiNtePe8090m
	 */
	public int getWPoiNtePe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiNtePe8090m();
	}
	
	/**
	 * 	Update WPoiNtePe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiNtePe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiNtePe8090m(number);
	}


	public void setWPoiNtePe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiNtePe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public StringGuiUnoPe8090mOutCtx clone() {
        StringGuiUnoPe8090mOutCtx cloneObj = new StringGuiUnoPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public StringGuiUnoPe8090mOutCtx getStringGuiUnoPe8090mOutCtx() {
            return new StringGuiUnoPe8090mOutCtx();
    }
     public class StringGuiTrePe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wPoiGuaPe8090m
	 *	@return wPoiGuaPe8090m
	 */
	public int getWPoiGuaPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiGuaPe8090m();
	}
	
	/**
	 * 	Update WPoiGuaPe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiGuaPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m(number);
	}


	public void setWPoiGuaPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public StringGuiTrePe8090mOutCtx getStringGuiTrePe8090mOutCtx() {
            return new StringGuiTrePe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public StringGuiTrePe8090mInCtx clone() {
        StringGuiTrePe8090mInCtx cloneObj = new StringGuiTrePe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public StringGuiTrePe8090mInCtx getStringGuiTrePe8090mInCtx() {
            return new StringGuiTrePe8090mInCtx();
    }
     public class StringGuiTrePe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wTitulPe8090m
	 *	@return wTitulPe8090m
	 */
   public char[] getWTitulPe8090m() throws CFException  {              
   		return section.getWTitulPe8090m();
   }

  
	/**
	*  set variable wTitulPe8090m
	*  @param value
	**/
   public void setWTitulPe8090m(char[] value) throws CFException {
      section.setWTitulPe8090m(value);
   } 

     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWTitulPe8090m(source, sourceIndex);
   	
   }
   
   public void setWTitulPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WTitulPe8090m with another Field
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source) {
      section.setWTitulPe8090m(source);
   }  
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPoiGuaPe8090m
	 *	@return wPoiGuaPe8090m
	 */
	public int getWPoiGuaPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiGuaPe8090m();
	}
	
	/**
	 * 	Update WPoiGuaPe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiGuaPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m(number);
	}


	public void setWPoiGuaPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m((int)number);
	}


	/**
	 *	Returns the value of wPoiNtePe8090m
	 *	@return wPoiNtePe8090m
	 */
	public int getWPoiNtePe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiNtePe8090m();
	}
	
	/**
	 * 	Update WPoiNtePe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiNtePe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiNtePe8090m(number);
	}


	public void setWPoiNtePe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiNtePe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public StringGuiTrePe8090mOutCtx clone() {
        StringGuiTrePe8090mOutCtx cloneObj = new StringGuiTrePe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public StringGuiTrePe8090mOutCtx getStringGuiTrePe8090mOutCtx() {
            return new StringGuiTrePe8090mOutCtx();
    }
     public class NomMasPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wNmaSepPe8090m
	 *	@return wNmaSepPe8090m
	 */
	public int getWNmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNmaSepPe8090m();
	}
	
	/**
	 * 	Update WNmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWNmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m(number);
	}


	public void setWNmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m((int)number);
	}



public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wNomPe8090m
	 *	@return wNomPe8090m
	 */
   public char[] getWNomPe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNomPe8090m();
   }

  
	/**
	*  set variable wNomPe8090m
	*  @param value
	**/
   public void setWNomPe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(value);
   } 

     /**
	 * 	Update WNomPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNomPe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNomPe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNomPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNomPe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNomPe8090m with another Field
	 *	@param value
	 */
   public void setWNomPe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source);
   }  
   
     /**
	 * 	Update WNomPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNomPe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNomPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNomPe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNcaNomPe8090m
	 *	@return wNcaNomPe8090m
	 */
	public int getWNcaNomPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNomPe8090m();
	}
	
	/**
	 * 	Update WNcaNomPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNomPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m(number);
	}


	public void setWNcaNomPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m((int)number);
	}


	/**
	 *	Returns the value of wPoiGuaPe8090m
	 *	@return wPoiGuaPe8090m
	 */
	public int getWPoiGuaPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiGuaPe8090m();
	}
	
	/**
	 * 	Update WPoiGuaPe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiGuaPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m(number);
	}


	public void setWPoiGuaPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m((int)number);
	}


	/**
	 *	Returns the value of wPoiNtePe8090m
	 *	@return wPoiNtePe8090m
	 */
	public int getWPoiNtePe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiNtePe8090m();
	}
	
	/**
	 * 	Update WPoiNtePe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiNtePe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiNtePe8090m(number);
	}


	public void setWPoiNtePe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiNtePe8090m((int)number);
	}


	/**
	 *	Returns the value of wMaxTitPe8090m
	 *	@return wMaxTitPe8090m
	 */
	public int getWMaxTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWMaxTitPe8090m();
	}
	
	/**
	 * 	Update WMaxTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWMaxTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m(number);
	}


	public void setWMaxTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMasSepPe8090m
	 *	@return wMasSepPe8090m
	 */
   public char[] getWMasSepPe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWMasSepPe8090m();
   }

  
	/**
	*  set variable wMasSepPe8090m
	*  @param value
	**/
   public void setWMasSepPe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(value);
   } 

     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasSepPe8090m with another Field
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source);
   }  
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public NomMasPe8090mOutCtx getNomMasPe8090mOutCtx() {
            return new NomMasPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public NomMasPe8090mInCtx clone() {
        NomMasPe8090mInCtx cloneObj = new NomMasPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public NomMasPe8090mInCtx getNomMasPe8090mInCtx() {
            return new NomMasPe8090mInCtx();
    }
     public class NomMasPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wTitulPe8090m
	 *	@return wTitulPe8090m
	 */
   public char[] getWTitulPe8090m() throws CFException  {              
   		return section.getWTitulPe8090m();
   }

  
	/**
	*  set variable wTitulPe8090m
	*  @param value
	**/
   public void setWTitulPe8090m(char[] value) throws CFException {
      section.setWTitulPe8090m(value);
   } 

     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWTitulPe8090m(source, sourceIndex);
   	
   }
   
   public void setWTitulPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WTitulPe8090m with another Field
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source) {
      section.setWTitulPe8090m(source);
   }  
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPoiGuaPe8090m
	 *	@return wPoiGuaPe8090m
	 */
	public int getWPoiGuaPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiGuaPe8090m();
	}
	
	/**
	 * 	Update WPoiGuaPe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiGuaPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m(number);
	}


	public void setWPoiGuaPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m((int)number);
	}


	/**
	 *	Returns the value of wPoiNtePe8090m
	 *	@return wPoiNtePe8090m
	 */
	public int getWPoiNtePe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiNtePe8090m();
	}
	
	/**
	 * 	Update WPoiNtePe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiNtePe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiNtePe8090m(number);
	}


	public void setWPoiNtePe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiNtePe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public NomMasPe8090mOutCtx clone() {
        NomMasPe8090mOutCtx cloneObj = new NomMasPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public NomMasPe8090mOutCtx getNomMasPe8090mOutCtx() {
            return new NomMasPe8090mOutCtx();
    }
     public class TraPerOblPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wOblTitPe8090m
	 *	@return wOblTitPe8090m
	 */
	public int getWOblTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOblTitPe8090m();
	}
	
	/**
	 * 	Update WOblTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOblTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOblTitPe8090m(number);
	}


	public void setWOblTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOblTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wImpPe8090m
	 *	@return wImpPe8090m
	 */
	public int getWImpPe8090m() throws CFException {        
   		return section.getWImpPe8090m();
	}
	
	/**
	 * 	Update WImpPe8090m with the passed value
	 *	@param number
	 */
	public void setWImpPe8090m(int number)  throws CFException{
		section.setWImpPe8090m(number);
	}


	public void setWImpPe8090m(long number)  throws CFException{
		section.setWImpPe8090m((int)number);
	}


	/**
	 *	Returns the value of wPoiGuaPe8090m
	 *	@return wPoiGuaPe8090m
	 */
	public int getWPoiGuaPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiGuaPe8090m();
	}
	
	/**
	 * 	Update WPoiGuaPe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiGuaPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m(number);
	}


	public void setWPoiGuaPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMaxTitPe8090m
	 *	@return wMaxTitPe8090m
	 */
	public int getWMaxTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWMaxTitPe8090m();
	}
	
	/**
	 * 	Update WMaxTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWMaxTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m(number);
	}


	public void setWMaxTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public TraPerOblPe8090mOutCtx getTraPerOblPe8090mOutCtx() {
            return new TraPerOblPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public TraPerOblPe8090mInCtx clone() {
        TraPerOblPe8090mInCtx cloneObj = new TraPerOblPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TraPerOblPe8090mInCtx getTraPerOblPe8090mInCtx() {
            return new TraPerOblPe8090mInCtx();
    }
     public class TraPerOblPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wOblTitPe8090m
	 *	@return wOblTitPe8090m
	 */
	public int getWOblTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOblTitPe8090m();
	}
	
	/**
	 * 	Update WOblTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOblTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOblTitPe8090m(number);
	}


	public void setWOblTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOblTitPe8090m((int)number);
	}



public void setWInoPe8090m(int wInoPe8090m) { 
    Bm8090mCtx.this.wInoPe8090m = wInoPe8090m;
}

public int getWInoPe8090m() { 
    return Bm8090mCtx.this.wInoPe8090m;
}
	/**
	 *	Returns the value of wImpPe8090m
	 *	@return wImpPe8090m
	 */
	public int getWImpPe8090m() throws CFException {        
   		return section.getWImpPe8090m();
	}
	
	/**
	 * 	Update WImpPe8090m with the passed value
	 *	@param number
	 */
	public void setWImpPe8090m(int number)  throws CFException{
		section.setWImpPe8090m(number);
	}


	public void setWImpPe8090m(long number)  throws CFException{
		section.setWImpPe8090m((int)number);
	}


	/**
	 *	Returns the value of wPoiGuaPe8090m
	 *	@return wPoiGuaPe8090m
	 */
	public int getWPoiGuaPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiGuaPe8090m();
	}
	
	/**
	 * 	Update WPoiGuaPe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiGuaPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m(number);
	}


	public void setWPoiGuaPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m((int)number);
	}


	/**
	 *	Returns the value of wPoiNtePe8090m
	 *	@return wPoiNtePe8090m
	 */
	public int getWPoiNtePe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiNtePe8090m();
	}
	
	/**
	 * 	Update WPoiNtePe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiNtePe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiNtePe8090m(number);
	}


	public void setWPoiNtePe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiNtePe8090m((int)number);
	}


	/**
	 *	Test condition "S" for isInoUp1vez()
	 *	@return  Returns true if isInoUp1vez() is "S"
	 */
   public boolean isInoUp1vez() throws CFException {
      return work.isInoUp1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInoUp1vezTrue()  throws CFException{  			
    	work.setInoUp1vezTrue();
   	}

        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public TraPerOblPe8090mOutCtx clone() {
        TraPerOblPe8090mOutCtx cloneObj = new TraPerOblPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TraPerOblPe8090mOutCtx getTraPerOblPe8090mOutCtx() {
            return new TraPerOblPe8090mOutCtx();
    }
     public class TabOblPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wIsoPe8090m
	 *	@return wIsoPe8090m
	 */
	public int getWIsoPe8090m(int index) throws CFException {        
   		return section.getWTobPe8090m().getWEloPe8090m(index).getWIsoPe8090m();
	}
	
	/**
	 * 	Update WIsoPe8090m with the passed value
	 *	@param number
	 */
	public void setWIsoPe8090m(int index,int number)  throws CFException{
		section.getWTobPe8090m().getWEloPe8090m(index).setWIsoPe8090m(number);
	}


	public void setWIsoPe8090m(int index,long number)  throws CFException{
		section.getWTobPe8090m().getWEloPe8090m(index).setWIsoPe8090m((int)number);
	}



public void setWInoPe8090m(int wInoPe8090m) { 
    Bm8090mCtx.this.wInoPe8090m = wInoPe8090m;
}

public int getWInoPe8090m() { 
    return Bm8090mCtx.this.wInoPe8090m;
}
	/**
	 *	Test condition "S" for isInoUp1vez()
	 *	@return  Returns true if isInoUp1vez() is "S"
	 */
   public boolean isInoUp1vez() throws CFException {
      return work.isInoUp1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInoUp1vezTrue()  throws CFException{  			
    	work.setInoUp1vezTrue();
   	}
	/**
	 *	Returns the value of wTioPe8090m
	 *	@return wTioPe8090m
	 */
	public int getWTioPe8090m(int index) throws CFException {        
   		return section.getWTobPe8090m().getWEloPe8090m(index).getWTioPe8090m();
	}
	
	/**
	 * 	Update WTioPe8090m with the passed value
	 *	@param number
	 */
	public void setWTioPe8090m(int index,int number)  throws CFException{
		section.getWTobPe8090m().getWEloPe8090m(index).setWTioPe8090m(number);
	}


	public void setWTioPe8090m(int index,long number)  throws CFException{
		section.getWTobPe8090m().getWEloPe8090m(index).setWTioPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public TabOblPe8090mOutCtx getTabOblPe8090mOutCtx() {
            return new TabOblPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public TabOblPe8090mInCtx clone() {
        TabOblPe8090mInCtx cloneObj = new TabOblPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TabOblPe8090mInCtx getTabOblPe8090mInCtx() {
            return new TabOblPe8090mInCtx();
    }
     public class TabOblPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Test condition "N" for isNoInoUp1vez()
	 *	@return  Returns true if isNoInoUp1vez() is "N"
	 */
   public boolean isNoInoUp1vez() throws CFException {
      return work.isNoInoUp1vez();
   }

	/**
	*  set values "N"
	*/
   	public void setNoInoUp1vezTrue()  throws CFException{  			
    	work.setNoInoUp1vezTrue();
   	}

public void setWInoPe8090m(int wInoPe8090m) { 
    Bm8090mCtx.this.wInoPe8090m = wInoPe8090m;
}

public int getWInoPe8090m() { 
    return Bm8090mCtx.this.wInoPe8090m;
}

        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public TabOblPe8090mOutCtx clone() {
        TabOblPe8090mOutCtx cloneObj = new TabOblPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TabOblPe8090mOutCtx getTabOblPe8090mOutCtx() {
            return new TabOblPe8090mOutCtx();
    }
     public class SepGioPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wIndGioPe8090m
	 *	@return wIndGioPe8090m
	 */
	public int getWIndGioPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWIndGioPe8090m();
	}
	
	/**
	 * 	Update WIndGioPe8090m with the passed value
	 *	@param number
	 */
	public void setWIndGioPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWIndGioPe8090m(number);
	}


	public void setWIndGioPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWIndGioPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public SepGioPe8090mInCtx clone() {
        SepGioPe8090mInCtx cloneObj = new SepGioPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public SepGioPe8090mInCtx getSepGioPe8090mInCtx() {
            return new SepGioPe8090mInCtx();
    }
     public class StringGioUnoPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wPoiGuaPe8090m
	 *	@return wPoiGuaPe8090m
	 */
	public int getWPoiGuaPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiGuaPe8090m();
	}
	
	/**
	 * 	Update WPoiGuaPe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiGuaPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m(number);
	}


	public void setWPoiGuaPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public StringGioUnoPe8090mOutCtx getStringGioUnoPe8090mOutCtx() {
            return new StringGioUnoPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public StringGioUnoPe8090mInCtx clone() {
        StringGioUnoPe8090mInCtx cloneObj = new StringGioUnoPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public StringGioUnoPe8090mInCtx getStringGioUnoPe8090mInCtx() {
            return new StringGioUnoPe8090mInCtx();
    }
     public class StringGioUnoPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wTitulPe8090m
	 *	@return wTitulPe8090m
	 */
   public char[] getWTitulPe8090m() throws CFException  {              
   		return section.getWTitulPe8090m();
   }

  
	/**
	*  set variable wTitulPe8090m
	*  @param value
	**/
   public void setWTitulPe8090m(char[] value) throws CFException {
      section.setWTitulPe8090m(value);
   } 

     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWTitulPe8090m(source, sourceIndex);
   	
   }
   
   public void setWTitulPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WTitulPe8090m with another Field
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source) {
      section.setWTitulPe8090m(source);
   }  
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPoiGuaPe8090m
	 *	@return wPoiGuaPe8090m
	 */
	public int getWPoiGuaPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiGuaPe8090m();
	}
	
	/**
	 * 	Update WPoiGuaPe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiGuaPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m(number);
	}


	public void setWPoiGuaPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m((int)number);
	}


	/**
	 *	Returns the value of wPoiNtePe8090m
	 *	@return wPoiNtePe8090m
	 */
	public int getWPoiNtePe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiNtePe8090m();
	}
	
	/**
	 * 	Update WPoiNtePe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiNtePe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiNtePe8090m(number);
	}


	public void setWPoiNtePe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiNtePe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public StringGioUnoPe8090mOutCtx clone() {
        StringGioUnoPe8090mOutCtx cloneObj = new StringGioUnoPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public StringGioUnoPe8090mOutCtx getStringGioUnoPe8090mOutCtx() {
            return new StringGioUnoPe8090mOutCtx();
    }
     public class StringGioTrePe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wPoiGuaPe8090m
	 *	@return wPoiGuaPe8090m
	 */
	public int getWPoiGuaPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiGuaPe8090m();
	}
	
	/**
	 * 	Update WPoiGuaPe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiGuaPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m(number);
	}


	public void setWPoiGuaPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public StringGioTrePe8090mOutCtx getStringGioTrePe8090mOutCtx() {
            return new StringGioTrePe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public StringGioTrePe8090mInCtx clone() {
        StringGioTrePe8090mInCtx cloneObj = new StringGioTrePe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public StringGioTrePe8090mInCtx getStringGioTrePe8090mInCtx() {
            return new StringGioTrePe8090mInCtx();
    }
     public class StringGioTrePe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wTitulPe8090m
	 *	@return wTitulPe8090m
	 */
   public char[] getWTitulPe8090m() throws CFException  {              
   		return section.getWTitulPe8090m();
   }

  
	/**
	*  set variable wTitulPe8090m
	*  @param value
	**/
   public void setWTitulPe8090m(char[] value) throws CFException {
      section.setWTitulPe8090m(value);
   } 

     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWTitulPe8090m(source, sourceIndex);
   	
   }
   
   public void setWTitulPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WTitulPe8090m with another Field
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source) {
      section.setWTitulPe8090m(source);
   }  
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPoiGuaPe8090m
	 *	@return wPoiGuaPe8090m
	 */
	public int getWPoiGuaPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiGuaPe8090m();
	}
	
	/**
	 * 	Update WPoiGuaPe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiGuaPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m(number);
	}


	public void setWPoiGuaPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m((int)number);
	}


	/**
	 *	Returns the value of wPoiNtePe8090m
	 *	@return wPoiNtePe8090m
	 */
	public int getWPoiNtePe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiNtePe8090m();
	}
	
	/**
	 * 	Update WPoiNtePe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiNtePe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiNtePe8090m(number);
	}


	public void setWPoiNtePe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiNtePe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public StringGioTrePe8090mOutCtx clone() {
        StringGioTrePe8090mOutCtx cloneObj = new StringGioTrePe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public StringGioTrePe8090mOutCtx getStringGioTrePe8090mOutCtx() {
            return new StringGioTrePe8090mOutCtx();
    }
     public class NomOblPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wNobPe8090m
	 *	@return wNobPe8090m
	 */
   public char[] getWNobPe8090m(int index) throws CFException  {              
   		return section.getWTobPe8090m().getWEloPe8090m(index).getWNobPe8090m();
   }

  
	/**
	*  set variable wNobPe8090m
	*  @param value
	**/
   public void setWNobPe8090m(int index,char[] value) throws CFException {
      section.getWTobPe8090m().getWEloPe8090m(index).setWNobPe8090m(value);
   } 

     /**
	 * 	Update WNobPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNobPe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTobPe8090m().getWEloPe8090m(index).setWNobPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNobPe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTobPe8090m().getWEloPe8090m(index).setWNobPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNobPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNobPe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTobPe8090m().getWEloPe8090m(index).setWNobPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNobPe8090m with another Field
	 *	@param value
	 */
   public void setWNobPe8090m(int index,Field source) {
      section.getWTobPe8090m().getWEloPe8090m(index).setWNobPe8090m(source);
   }  
   
     /**
	 * 	Update WNobPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNobPe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTobPe8090m().getWEloPe8090m(index).setWNobPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNobPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNobPe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTobPe8090m().getWEloPe8090m(index).setWNobPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNcoPe8090m
	 *	@return wNcoPe8090m
	 */
	public int getWNcoPe8090m(int index) throws CFException {        
   		return section.getWTobPe8090m().getWEloPe8090m(index).getWNcoPe8090m();
	}
	
	/**
	 * 	Update WNcoPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcoPe8090m(int index,int number)  throws CFException{
		section.getWTobPe8090m().getWEloPe8090m(index).setWNcoPe8090m(number);
	}


	public void setWNcoPe8090m(int index,long number)  throws CFException{
		section.getWTobPe8090m().getWEloPe8090m(index).setWNcoPe8090m((int)number);
	}



public void setWInoPe8090m(int wInoPe8090m) { 
    Bm8090mCtx.this.wInoPe8090m = wInoPe8090m;
}

public int getWInoPe8090m() { 
    return Bm8090mCtx.this.wInoPe8090m;
}
	/**
	 *	Returns the value of wPoiGuaPe8090m
	 *	@return wPoiGuaPe8090m
	 */
	public int getWPoiGuaPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiGuaPe8090m();
	}
	
	/**
	 * 	Update WPoiGuaPe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiGuaPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m(number);
	}


	public void setWPoiGuaPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public NomOblPe8090mOutCtx getNomOblPe8090mOutCtx() {
            return new NomOblPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public NomOblPe8090mInCtx clone() {
        NomOblPe8090mInCtx cloneObj = new NomOblPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public NomOblPe8090mInCtx getNomOblPe8090mInCtx() {
            return new NomOblPe8090mInCtx();
    }
     public class NomOblPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wTitulPe8090m
	 *	@return wTitulPe8090m
	 */
   public char[] getWTitulPe8090m() throws CFException  {              
   		return section.getWTitulPe8090m();
   }

  
	/**
	*  set variable wTitulPe8090m
	*  @param value
	**/
   public void setWTitulPe8090m(char[] value) throws CFException {
      section.setWTitulPe8090m(value);
   } 

     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWTitulPe8090m(source, sourceIndex);
   	
   }
   
   public void setWTitulPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WTitulPe8090m with another Field
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source) {
      section.setWTitulPe8090m(source);
   }  
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPoiGuaPe8090m
	 *	@return wPoiGuaPe8090m
	 */
	public int getWPoiGuaPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiGuaPe8090m();
	}
	
	/**
	 * 	Update WPoiGuaPe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiGuaPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m(number);
	}


	public void setWPoiGuaPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiGuaPe8090m((int)number);
	}


	/**
	 *	Returns the value of wPoiNtePe8090m
	 *	@return wPoiNtePe8090m
	 */
	public int getWPoiNtePe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWPoiNtePe8090m();
	}
	
	/**
	 * 	Update WPoiNtePe8090m with the passed value
	 *	@param number
	 */
	public void setWPoiNtePe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiNtePe8090m(number);
	}


	public void setWPoiNtePe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWPoiNtePe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public NomOblPe8090mOutCtx clone() {
        NomOblPe8090mOutCtx cloneObj = new NomOblPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public NomOblPe8090mOutCtx getNomOblPe8090mOutCtx() {
            return new NomOblPe8090mOutCtx();
    }
     public class NombreTitPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wTitulPe8090m
	 *	@return wTitulPe8090m
	 */
   public char[] getWTitulPe8090m() throws CFException  {              
   		return section.getWTitulPe8090m();
   }

  
	/**
	*  set variable wTitulPe8090m
	*  @param value
	**/
   public void setWTitulPe8090m(char[] value) throws CFException {
      section.setWTitulPe8090m(value);
   } 

     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWTitulPe8090m(source, sourceIndex);
   	
   }
   
   public void setWTitulPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WTitulPe8090m with another Field
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source) {
      section.setWTitulPe8090m(source);
   }  
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public NombreTitPe8090mOutCtx getNombreTitPe8090mOutCtx() {
            return new NombreTitPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public NombreTitPe8090mInCtx clone() {
        NombreTitPe8090mInCtx cloneObj = new NombreTitPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public NombreTitPe8090mInCtx getNombreTitPe8090mInCtx() {
            return new NombreTitPe8090mInCtx();
    }
     public class NombreTitPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wTitCtaPe8090m
	 *	@return wTitCtaPe8090m
	 */
   public char[] getWTitCtaPe8090m() throws CFException  {              
   		return section.getWTitCtaPe8090m();
   }

  
	/**
	*  set variable wTitCtaPe8090m
	*  @param value
	**/
   public void setWTitCtaPe8090m(char[] value) throws CFException {
      section.setWTitCtaPe8090m(value);
   } 

     /**
	 * 	Update WTitCtaPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitCtaPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWTitCtaPe8090m(source, sourceIndex);
   	
   }
   
   public void setWTitCtaPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitCtaPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WTitCtaPe8090m with another Field
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source) {
      section.setWTitCtaPe8090m(source);
   }  
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wTitulPe8090m
	 *	@return wTitulPe8090m
	 */
   public char[] getWTitulPe8090m() throws CFException  {              
   		return section.getWTitulPe8090m();
   }

  
	/**
	*  set variable wTitulPe8090m
	*  @param value
	**/
   public void setWTitulPe8090m(char[] value) throws CFException {
      section.setWTitulPe8090m(value);
   } 

     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWTitulPe8090m(source, sourceIndex);
   	
   }
   
   public void setWTitulPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WTitulPe8090m with another Field
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source) {
      section.setWTitulPe8090m(source);
   }  
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitulPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public NombreTitPe8090mOutCtx clone() {
        NombreTitPe8090mOutCtx cloneObj = new NombreTitPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public NombreTitPe8090mOutCtx getNombreTitPe8090mOutCtx() {
            return new NombreTitPe8090mOutCtx();
    }
     public class AlmacenarPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wTipAlmPe8090m
	 *	@return wTipAlmPe8090m
	 */
	public int getWTipAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWTipAlmPe8090m();
	}
	
	/**
	 * 	Update WTipAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWTipAlmPe8090m(number);
	}


	public void setWTipAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWTipAlmPe8090m((int)number);
	}



public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wCntFisPe8090m
	 *	@return wCntFisPe8090m
	 */
	public int getWCntFisPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntFisPe8090m();
	}
	
	/**
	 * 	Update WCntFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntFisPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m(number);
	}


	public void setWCntFisPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m((int)number);
	}


	/**
	 *	Returns the value of wCntRelPe8090m
	 *	@return wCntRelPe8090m
	 */
	public int getWCntRelPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntRelPe8090m();
	}
	
	/**
	 * 	Update WCntRelPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntRelPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntRelPe8090m(number);
	}


	public void setWCntRelPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntRelPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public AlmacenarPe8090mOutCtx getAlmacenarPe8090mOutCtx() {
            return new AlmacenarPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public AlmacenarPe8090mInCtx clone() {
        AlmacenarPe8090mInCtx cloneObj = new AlmacenarPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public AlmacenarPe8090mInCtx getAlmacenarPe8090mInCtx() {
            return new AlmacenarPe8090mInCtx();
    }
     public class AlmacenarPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wCntFisPe8090m
	 *	@return wCntFisPe8090m
	 */
	public int getWCntFisPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntFisPe8090m();
	}
	
	/**
	 * 	Update WCntFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntFisPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m(number);
	}


	public void setWCntFisPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m((int)number);
	}


	/**
	 *	Returns the value of wCntRelPe8090m
	 *	@return wCntRelPe8090m
	 */
	public int getWCntRelPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntRelPe8090m();
	}
	
	/**
	 * 	Update WCntRelPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntRelPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntRelPe8090m(number);
	}


	public void setWCntRelPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntRelPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public AlmacenarPe8090mOutCtx clone() {
        AlmacenarPe8090mOutCtx cloneObj = new AlmacenarPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public AlmacenarPe8090mOutCtx getAlmacenarPe8090mOutCtx() {
            return new AlmacenarPe8090mOutCtx();
    }
     public class SelTratoPe8090mInCtx implements Cloneable {
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Test condition "S" for isInpUp1vez()
	 *	@return  Returns true if isInpUp1vez() is "S"
	 */
   public boolean isInpUp1vez() throws CFException {
      return work.isInpUp1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpUp1vezTrue()  throws CFException{  			
    	work.setInpUp1vezTrue();
   	}

public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}

        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public SelTratoPe8090mInCtx clone() {
        SelTratoPe8090mInCtx cloneObj = new SelTratoPe8090mInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SelTratoPe8090mInCtx getSelTratoPe8090mInCtx() {
            return new SelTratoPe8090mInCtx();
    }
     public class TratoPriPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wTipAlmPe8090m
	 *	@return wTipAlmPe8090m
	 */
	public int getWTipAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWTipAlmPe8090m();
	}
	
	/**
	 * 	Update WTipAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWTipAlmPe8090m(number);
	}


	public void setWTipAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWTipAlmPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public TratoPriPe8090mOutCtx getTratoPriPe8090mOutCtx() {
            return new TratoPriPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public TratoPriPe8090mInCtx clone() {
        TratoPriPe8090mInCtx cloneObj = new TratoPriPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public TratoPriPe8090mInCtx getTratoPriPe8090mInCtx() {
            return new TratoPriPe8090mInCtx();
    }
     public class TratoPriPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wCntFisPe8090m
	 *	@return wCntFisPe8090m
	 */
	public int getWCntFisPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntFisPe8090m();
	}
	
	/**
	 * 	Update WCntFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntFisPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m(number);
	}


	public void setWCntFisPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m((int)number);
	}


	/**
	 *	Returns the value of wCntPerPe8090m
	 *	@return wCntPerPe8090m
	 */
	public int getWCntPerPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntPerPe8090m();
	}
	
	/**
	 * 	Update WCntPerPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntPerPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntPerPe8090m(number);
	}


	public void setWCntPerPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntPerPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public TratoPriPe8090mOutCtx clone() {
        TratoPriPe8090mOutCtx cloneObj = new TratoPriPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public TratoPriPe8090mOutCtx getTratoPriPe8090mOutCtx() {
            return new TratoPriPe8090mOutCtx();
    }
     public class VerWtipPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wTipAlmPe8090m
	 *	@return wTipAlmPe8090m
	 */
	public int getWTipAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWTipAlmPe8090m();
	}
	
	/**
	 * 	Update WTipAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWTipAlmPe8090m(number);
	}


	public void setWTipAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWTipAlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTipPe8090m
	 *	@return wTipPe8090m
	 */
	public int getWTipPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTipPe8090m();
	}
	
	/**
	 * 	Update WTipPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m(number);
	}


	public void setWTipPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m((int)number);
	}



public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}

        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public VerWtipPe8090mInCtx clone() {
        VerWtipPe8090mInCtx cloneObj = new VerWtipPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public VerWtipPe8090mInCtx getVerWtipPe8090mInCtx() {
            return new VerWtipPe8090mInCtx();
    }
     public class SelJurPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wTipAlmPe8090m
	 *	@return wTipAlmPe8090m
	 */
	public int getWTipAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWTipAlmPe8090m();
	}
	
	/**
	 * 	Update WTipAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWTipAlmPe8090m(number);
	}


	public void setWTipAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWTipAlmPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public SelJurPe8090mInCtx clone() {
        SelJurPe8090mInCtx cloneObj = new SelJurPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public SelJurPe8090mInCtx getSelJurPe8090mInCtx() {
            return new SelJurPe8090mInCtx();
    }
     public class Pe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();


public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wNsePerPe8090m
	 *	@return wNsePerPe8090m
	 */
	public int getWNsePerPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNsePerPe8090m();
	}
	
	/**
	 * 	Update WNsePerPe8090m with the passed value
	 *	@param number
	 */
	public void setWNsePerPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNsePerPe8090m(number);
	}


	public void setWNsePerPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNsePerPe8090m((int)number);
	}


	/**
	 *	Returns the value of wCntFisPe8090m
	 *	@return wCntFisPe8090m
	 */
	public int getWCntFisPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntFisPe8090m();
	}
	
	/**
	 * 	Update WCntFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntFisPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m(number);
	}


	public void setWCntFisPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNumPerFisPe8090m
	 *	@return wNumPerFisPe8090m
	 */
	public int getWNumPerFisPe8090m() throws CFException {        
   		return section.getWNumPerFisPe8090m();
	}
	
	/**
	 * 	Update WNumPerFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWNumPerFisPe8090m(int number)  throws CFException{
		section.setWNumPerFisPe8090m(number);
	}


	public void setWNumPerFisPe8090m(long number)  throws CFException{
		section.setWNumPerFisPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public Pe8090mOutCtx getPe8090mOutCtx() {
            return new Pe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public Pe8090mInCtx clone() {
        Pe8090mInCtx cloneObj = new Pe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public Pe8090mInCtx getPe8090mInCtx() {
            return new Pe8090mInCtx();
    }
     public class Pe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wNumPerFisPe8090m
	 *	@return wNumPerFisPe8090m
	 */
	public int getWNumPerFisPe8090m() throws CFException {        
   		return section.getWNumPerFisPe8090m();
	}
	
	/**
	 * 	Update WNumPerFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWNumPerFisPe8090m(int number)  throws CFException{
		section.setWNumPerFisPe8090m(number);
	}


	public void setWNumPerFisPe8090m(long number)  throws CFException{
		section.setWNumPerFisPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public Pe8090mOutCtx clone() {
        Pe8090mOutCtx cloneObj = new Pe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public Pe8090mOutCtx getPe8090mOutCtx() {
            return new Pe8090mOutCtx();
    }
     public class UnoUnoUnoPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wNmaSepPe8090m
	 *	@return wNmaSepPe8090m
	 */
	public int getWNmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNmaSepPe8090m();
	}
	
	/**
	 * 	Update WNmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWNmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m(number);
	}


	public void setWNmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m((int)number);
	}


	/**
	 *	Test condition "S" for isInpUp1vez()
	 *	@return  Returns true if isInpUp1vez() is "S"
	 */
   public boolean isInpUp1vez() throws CFException {
      return work.isInpUp1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpUp1vezTrue()  throws CFException{  			
    	work.setInpUp1vezTrue();
   	}

public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Test condition "S" for isInpDown1vez()
	 *	@return  Returns true if isInpDown1vez() is "S"
	 */
   public boolean isInpDown1vez() throws CFException {
      return work.isInpDown1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpDown1vezTrue()  throws CFException{  			
    	work.setInpDown1vezTrue();
   	}
	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public UnoUnoUnoPe8090mOutCtx getUnoUnoUnoPe8090mOutCtx() {
            return new UnoUnoUnoPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public UnoUnoUnoPe8090mInCtx clone() {
        UnoUnoUnoPe8090mInCtx cloneObj = new UnoUnoUnoPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public UnoUnoUnoPe8090mInCtx getUnoUnoUnoPe8090mInCtx() {
            return new UnoUnoUnoPe8090mInCtx();
    }
     public class UnoUnoUnoPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wNmaSepPe8090m
	 *	@return wNmaSepPe8090m
	 */
	public int getWNmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNmaSepPe8090m();
	}
	
	/**
	 * 	Update WNmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWNmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m(number);
	}


	public void setWNmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m((int)number);
	}


	/**
	 *	Test condition "N" for isNoInpDown1vez()
	 *	@return  Returns true if isNoInpDown1vez() is "N"
	 */
   public boolean isNoInpDown1vez() throws CFException {
      return work.isNoInpDown1vez();
   }

	/**
	*  set values "N"
	*/
   	public void setNoInpDown1vezTrue()  throws CFException{  			
    	work.setNoInpDown1vezTrue();
   	}

public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTmaSepPe8090m
	 *	@return wTmaSepPe8090m
	 */
	public int getWTmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTmaSepPe8090m();
	}
	
	/**
	 * 	Update WTmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTmaSepPe8090m(number);
	}


	public void setWTmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTmaSepPe8090m((int)number);
	}


	/**
	 *	Test condition "N" for isNoInpUp1vez()
	 *	@return  Returns true if isNoInpUp1vez() is "N"
	 */
   public boolean isNoInpUp1vez() throws CFException {
      return work.isNoInpUp1vez();
   }

	/**
	*  set values "N"
	*/
   	public void setNoInpUp1vezTrue()  throws CFException{  			
    	work.setNoInpUp1vezTrue();
   	}
	/**
	 *	Returns the value of wMasSepPe8090m
	 *	@return wMasSepPe8090m
	 */
   public char[] getWMasSepPe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWMasSepPe8090m();
   }

  
	/**
	*  set variable wMasSepPe8090m
	*  @param value
	**/
   public void setWMasSepPe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(value);
   } 

     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasSepPe8090m with another Field
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source);
   }  
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public UnoUnoUnoPe8090mOutCtx clone() {
        UnoUnoUnoPe8090mOutCtx cloneObj = new UnoUnoUnoPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public UnoUnoUnoPe8090mOutCtx getUnoUnoUnoPe8090mOutCtx() {
            return new UnoUnoUnoPe8090mOutCtx();
    }
     public class UnoUnoDosPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();


public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wMasFpfPe8090m
	 *	@return wMasFpfPe8090m
	 */
   public char[] getWMasFpfPe8090m() throws CFException  {              
   		return section.getWZonFpfPe8090m().getWMasFpfPe8090m();
   }

  
	/**
	*  set variable wMasFpfPe8090m
	*  @param value
	**/
   public void setWMasFpfPe8090m(char[] value) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(value);
   } 

     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasFpfPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasFpfPe8090m with another Field
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source);
   }  
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTmaFpfPe8090m
	 *	@return wTmaFpfPe8090m
	 */
	public int getWTmaFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTmaFpfPe8090m();
	}
	
	/**
	 * 	Update WTmaFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m(number);
	}


	public void setWTmaFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcmFpfPe8090m
	 *	@return wNcmFpfPe8090m
	 */
	public int getWNcmFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNcmFpfPe8090m();
	}
	
	/**
	 * 	Update WNcmFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcmFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m(number);
	}


	public void setWNcmFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNumPerFisPe8090m
	 *	@return wNumPerFisPe8090m
	 */
	public int getWNumPerFisPe8090m() throws CFException {        
   		return section.getWNumPerFisPe8090m();
	}
	
	/**
	 * 	Update WNumPerFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWNumPerFisPe8090m(int number)  throws CFException{
		section.setWNumPerFisPe8090m(number);
	}


	public void setWNumPerFisPe8090m(long number)  throws CFException{
		section.setWNumPerFisPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public UnoUnoDosPe8090mOutCtx getUnoUnoDosPe8090mOutCtx() {
            return new UnoUnoDosPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public UnoUnoDosPe8090mInCtx clone() {
        UnoUnoDosPe8090mInCtx cloneObj = new UnoUnoDosPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public UnoUnoDosPe8090mInCtx getUnoUnoDosPe8090mInCtx() {
            return new UnoUnoDosPe8090mInCtx();
    }
     public class UnoUnoDosPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wPerGruPe8090m
	 *	@return wPerGruPe8090m
	 */
	public int getWPerGruPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWPerGruPe8090m();
	}
	
	/**
	 * 	Update WPerGruPe8090m with the passed value
	 *	@param number
	 */
	public void setWPerGruPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m(number);
	}


	public void setWPerGruPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNmaSepPe8090m
	 *	@return wNmaSepPe8090m
	 */
	public int getWNmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNmaSepPe8090m();
	}
	
	/**
	 * 	Update WNmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWNmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m(number);
	}


	public void setWNmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMasFpfPe8090m
	 *	@return wMasFpfPe8090m
	 */
   public char[] getWMasFpfPe8090m() throws CFException  {              
   		return section.getWZonFpfPe8090m().getWMasFpfPe8090m();
   }

  
	/**
	*  set variable wMasFpfPe8090m
	*  @param value
	**/
   public void setWMasFpfPe8090m(char[] value) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(value);
   } 

     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasFpfPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasFpfPe8090m with another Field
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source);
   }  
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTmaFpfPe8090m
	 *	@return wTmaFpfPe8090m
	 */
	public int getWTmaFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTmaFpfPe8090m();
	}
	
	/**
	 * 	Update WTmaFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m(number);
	}


	public void setWTmaFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTipFpfPe8090m
	 *	@return wTipFpfPe8090m
	 */
	public int getWTipFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTipFpfPe8090m();
	}
	
	/**
	 * 	Update WTipFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTipFpfPe8090m(number);
	}


	public void setWTipFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTipFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTmaSepPe8090m
	 *	@return wTmaSepPe8090m
	 */
	public int getWTmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTmaSepPe8090m();
	}
	
	/**
	 * 	Update WTmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTmaSepPe8090m(number);
	}


	public void setWTmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTmaSepPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcmFpfPe8090m
	 *	@return wNcmFpfPe8090m
	 */
	public int getWNcmFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNcmFpfPe8090m();
	}
	
	/**
	 * 	Update WNcmFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcmFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m(number);
	}


	public void setWNcmFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNumPerFisPe8090m
	 *	@return wNumPerFisPe8090m
	 */
	public int getWNumPerFisPe8090m() throws CFException {        
   		return section.getWNumPerFisPe8090m();
	}
	
	/**
	 * 	Update WNumPerFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWNumPerFisPe8090m(int number)  throws CFException{
		section.setWNumPerFisPe8090m(number);
	}


	public void setWNumPerFisPe8090m(long number)  throws CFException{
		section.setWNumPerFisPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNupFpfPe8090m
	 *	@return wNupFpfPe8090m
	 */
	public int getWNupFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNupFpfPe8090m();
	}
	
	/**
	 * 	Update WNupFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNupFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m(number);
	}


	public void setWNupFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMasSepPe8090m
	 *	@return wMasSepPe8090m
	 */
   public char[] getWMasSepPe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWMasSepPe8090m();
   }

  
	/**
	*  set variable wMasSepPe8090m
	*  @param value
	**/
   public void setWMasSepPe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(value);
   } 

     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasSepPe8090m with another Field
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source);
   }  
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public UnoUnoDosPe8090mOutCtx clone() {
        UnoUnoDosPe8090mOutCtx cloneObj = new UnoUnoDosPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public UnoUnoDosPe8090mOutCtx getUnoUnoDosPe8090mOutCtx() {
            return new UnoUnoDosPe8090mOutCtx();
    }
     public class Pe8090mTRATO2InCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();


public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wNsePerPe8090m
	 *	@return wNsePerPe8090m
	 */
	public int getWNsePerPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNsePerPe8090m();
	}
	
	/**
	 * 	Update WNsePerPe8090m with the passed value
	 *	@param number
	 */
	public void setWNsePerPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNsePerPe8090m(number);
	}


	public void setWNsePerPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNsePerPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public Pe8090mTRATO2InCtx clone() {
        Pe8090mTRATO2InCtx cloneObj = new Pe8090mTRATO2InCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public Pe8090mTRATO2InCtx getPe8090mTRATO2InCtx() {
            return new Pe8090mTRATO2InCtx();
    }
     public class UnoDosUnoPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wNmaSepPe8090m
	 *	@return wNmaSepPe8090m
	 */
	public int getWNmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNmaSepPe8090m();
	}
	
	/**
	 * 	Update WNmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWNmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m(number);
	}


	public void setWNmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m((int)number);
	}


	/**
	 *	Test condition "S" for isInpUp1vez()
	 *	@return  Returns true if isInpUp1vez() is "S"
	 */
   public boolean isInpUp1vez() throws CFException {
      return work.isInpUp1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpUp1vezTrue()  throws CFException{  			
    	work.setInpUp1vezTrue();
   	}

public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Test condition "S" for isInpDown1vez()
	 *	@return  Returns true if isInpDown1vez() is "S"
	 */
   public boolean isInpDown1vez() throws CFException {
      return work.isInpDown1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpDown1vezTrue()  throws CFException{  			
    	work.setInpDown1vezTrue();
   	}
	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public UnoDosUnoPe8090mOutCtx getUnoDosUnoPe8090mOutCtx() {
            return new UnoDosUnoPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public UnoDosUnoPe8090mInCtx clone() {
        UnoDosUnoPe8090mInCtx cloneObj = new UnoDosUnoPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public UnoDosUnoPe8090mInCtx getUnoDosUnoPe8090mInCtx() {
            return new UnoDosUnoPe8090mInCtx();
    }
     public class UnoDosUnoPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wNmaSepPe8090m
	 *	@return wNmaSepPe8090m
	 */
	public int getWNmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNmaSepPe8090m();
	}
	
	/**
	 * 	Update WNmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWNmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m(number);
	}


	public void setWNmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m((int)number);
	}


	/**
	 *	Test condition "N" for isNoInpDown1vez()
	 *	@return  Returns true if isNoInpDown1vez() is "N"
	 */
   public boolean isNoInpDown1vez() throws CFException {
      return work.isNoInpDown1vez();
   }

	/**
	*  set values "N"
	*/
   	public void setNoInpDown1vezTrue()  throws CFException{  			
    	work.setNoInpDown1vezTrue();
   	}

public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTmaSepPe8090m
	 *	@return wTmaSepPe8090m
	 */
	public int getWTmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTmaSepPe8090m();
	}
	
	/**
	 * 	Update WTmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTmaSepPe8090m(number);
	}


	public void setWTmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTmaSepPe8090m((int)number);
	}


	/**
	 *	Test condition "N" for isNoInpUp1vez()
	 *	@return  Returns true if isNoInpUp1vez() is "N"
	 */
   public boolean isNoInpUp1vez() throws CFException {
      return work.isNoInpUp1vez();
   }

	/**
	*  set values "N"
	*/
   	public void setNoInpUp1vezTrue()  throws CFException{  			
    	work.setNoInpUp1vezTrue();
   	}
	/**
	 *	Returns the value of wMasSepPe8090m
	 *	@return wMasSepPe8090m
	 */
   public char[] getWMasSepPe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWMasSepPe8090m();
   }

  
	/**
	*  set variable wMasSepPe8090m
	*  @param value
	**/
   public void setWMasSepPe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(value);
   } 

     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasSepPe8090m with another Field
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source);
   }  
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public UnoDosUnoPe8090mOutCtx clone() {
        UnoDosUnoPe8090mOutCtx cloneObj = new UnoDosUnoPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public UnoDosUnoPe8090mOutCtx getUnoDosUnoPe8090mOutCtx() {
            return new UnoDosUnoPe8090mOutCtx();
    }
     public class UnoDosDosPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wIni2NomPe8090m
	 *	@return wIni2NomPe8090m
	 */
   public char[] getWIni2NomPe8090m() throws CFException  {              
   		return section.getWIniNomrPe8090m().getWIni2NomPe8090m();
   }

  
	/**
	*  set variable wIni2NomPe8090m
	*  @param value
	**/
   public void setWIni2NomPe8090m(char[] value) throws CFException {
      section.getWIniNomrPe8090m().setWIni2NomPe8090m(value);
   } 

     /**
	 * 	Update WIni2NomPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWIni2NomPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWIniNomrPe8090m().setWIni2NomPe8090m(source, sourceIndex);
   	
   }
   
   public void setWIni2NomPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWIniNomrPe8090m().setWIni2NomPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WIni2NomPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWIni2NomPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWIniNomrPe8090m().setWIni2NomPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WIni2NomPe8090m with another Field
	 *	@param value
	 */
   public void setWIni2NomPe8090m(Field source) {
      section.getWIniNomrPe8090m().setWIni2NomPe8090m(source);
   }  
   
     /**
	 * 	Update WIni2NomPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWIni2NomPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWIniNomrPe8090m().setWIni2NomPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WIni2NomPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWIni2NomPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWIniNomrPe8090m().setWIni2NomPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNomAlmPe8090m
	 *	@return wNomAlmPe8090m
	 */
   public char[] getWNomAlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWNomAlmPe8090m();
   }

  
	/**
	*  set variable wNomAlmPe8090m
	*  @param value
	**/
   public void setWNomAlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(value);
   } 

     /**
	 * 	Update WNomAlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNomAlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNomAlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNomAlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNomAlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source);
   }  
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wCntFisPe8090m
	 *	@return wCntFisPe8090m
	 */
	public int getWCntFisPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntFisPe8090m();
	}
	
	/**
	 * 	Update WCntFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntFisPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m(number);
	}


	public void setWCntFisPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m((int)number);
	}


	/**
	 *	Returns the value of wIdiApe
	 *	@return wIdiApe
	 */
   public char[] getWIdiApe() throws CFException  {              
   		return section.getWDatVarPe8090m().getWIdiApe();
   }

  
	/**
	*  set variable wIdiApe
	*  @param value
	**/
   public void setWIdiApe(char[] value) throws CFException {
      section.getWDatVarPe8090m().setWIdiApe(value);
   } 

     /**
	 * 	Update WIdiApe 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWIdiApe(char[] source, int sourceIndex) throws CFException {
      section.getWDatVarPe8090m().setWIdiApe(source, sourceIndex);
   	
   }
   
   public void setWIdiApe(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWDatVarPe8090m().setWIdiApe(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WIdiApe 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWIdiApe(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWDatVarPe8090m().setWIdiApe(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WIdiApe with another Field
	 *	@param value
	 */
   public void setWIdiApe(Field source) {
      section.getWDatVarPe8090m().setWIdiApe(source);
   }  
   
     /**
	 * 	Update WIdiApe 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWIdiApe(Field source, int sourceIndex,int sourceLen) {
      section.getWDatVarPe8090m().setWIdiApe(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WIdiApe 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWIdiApe(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWDatVarPe8090m().setWIdiApe(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wCntPerPe8090m
	 *	@return wCntPerPe8090m
	 */
	public int getWCntPerPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntPerPe8090m();
	}
	
	/**
	 * 	Update WCntPerPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntPerPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntPerPe8090m(number);
	}


	public void setWCntPerPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntPerPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public UnoDosDosPe8090mOutCtx getUnoDosDosPe8090mOutCtx() {
            return new UnoDosDosPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public UnoDosDosPe8090mInCtx clone() {
        UnoDosDosPe8090mInCtx cloneObj = new UnoDosDosPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public UnoDosDosPe8090mInCtx getUnoDosDosPe8090mInCtx() {
            return new UnoDosDosPe8090mInCtx();
    }
     public class UnoDosDosPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wIniNomaPe8090m
	 *	@return wIniNomaPe8090m
	 */   
	 public WIniNomaPe8090m getWIniNomaPe8090m() {
   	return section.getWIniNomaPe8090m();
   }

   /**
	* 	Update WIniNomaPe8090m with the passed value
	*	@param value
	*/
   public void setWIniNomaPe8090m(char[] value) throws CFException {
      section.setWIniNomaPe8090m(value);
   }   

     /**
	 * 	Update WIniNomaPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWIniNomaPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWIniNomaPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WIniNomaPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWIniNomaPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWIniNomaPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WIniNomaPe8090m with another Field
	 *	@param value
	 */
   public void setWIniNomaPe8090m(Field source) {
   	section.setWIniNomaPe8090m(source);
   }  
   
     /**
	 * 	Update WIniNomaPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWIniNomaPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWIniNomaPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WIniNomaPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWIniNomaPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWIniNomaPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNmaSepPe8090m
	 *	@return wNmaSepPe8090m
	 */
	public int getWNmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNmaSepPe8090m();
	}
	
	/**
	 * 	Update WNmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWNmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m(number);
	}


	public void setWNmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m((int)number);
	}


	/**
	 *	Returns the value of wIni1NomPe8090m
	 *	@return wIni1NomPe8090m
	 */
   public char[] getWIni1NomPe8090m() throws CFException  {              
   		return section.getWIniNomaPe8090m().getWIni1NomPe8090m();
   }

  
	/**
	*  set variable wIni1NomPe8090m
	*  @param value
	**/
   public void setWIni1NomPe8090m(char[] value) throws CFException {
      section.getWIniNomaPe8090m().setWIni1NomPe8090m(value);
   } 

     /**
	 * 	Update WIni1NomPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWIni1NomPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWIniNomaPe8090m().setWIni1NomPe8090m(source, sourceIndex);
   	
   }
   
   public void setWIni1NomPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWIniNomaPe8090m().setWIni1NomPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WIni1NomPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWIni1NomPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWIniNomaPe8090m().setWIni1NomPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WIni1NomPe8090m with another Field
	 *	@param value
	 */
   public void setWIni1NomPe8090m(Field source) {
      section.getWIniNomaPe8090m().setWIni1NomPe8090m(source);
   }  
   
     /**
	 * 	Update WIni1NomPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWIni1NomPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWIniNomaPe8090m().setWIni1NomPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WIni1NomPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWIni1NomPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWIniNomaPe8090m().setWIni1NomPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNomAlmPe8090m
	 *	@return wNomAlmPe8090m
	 */
   public char[] getWNomAlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWNomAlmPe8090m();
   }

  
	/**
	*  set variable wNomAlmPe8090m
	*  @param value
	**/
   public void setWNomAlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(value);
   } 

     /**
	 * 	Update WNomAlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNomAlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNomAlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNomAlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNomAlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source);
   }  
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wCntFisPe8090m
	 *	@return wCntFisPe8090m
	 */
	public int getWCntFisPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntFisPe8090m();
	}
	
	/**
	 * 	Update WCntFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntFisPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m(number);
	}


	public void setWCntFisPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m((int)number);
	}


	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTmaSepPe8090m
	 *	@return wTmaSepPe8090m
	 */
	public int getWTmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTmaSepPe8090m();
	}
	
	/**
	 * 	Update WTmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTmaSepPe8090m(number);
	}


	public void setWTmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTmaSepPe8090m((int)number);
	}


	/**
	 *	Returns the value of wCntPerPe8090m
	 *	@return wCntPerPe8090m
	 */
	public int getWCntPerPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntPerPe8090m();
	}
	
	/**
	 * 	Update WCntPerPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntPerPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntPerPe8090m(number);
	}


	public void setWCntPerPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntPerPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMasSepPe8090m
	 *	@return wMasSepPe8090m
	 */
   public char[] getWMasSepPe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWMasSepPe8090m();
   }

  
	/**
	*  set variable wMasSepPe8090m
	*  @param value
	**/
   public void setWMasSepPe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(value);
   } 

     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasSepPe8090m with another Field
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source);
   }  
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public UnoDosDosPe8090mOutCtx clone() {
        UnoDosDosPe8090mOutCtx cloneObj = new UnoDosDosPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public UnoDosDosPe8090mOutCtx getUnoDosDosPe8090mOutCtx() {
            return new UnoDosDosPe8090mOutCtx();
    }
     public class Pe8090mTRATO3OutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wCntFisPe8090m
	 *	@return wCntFisPe8090m
	 */
	public int getWCntFisPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntFisPe8090m();
	}
	
	/**
	 * 	Update WCntFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntFisPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m(number);
	}


	public void setWCntFisPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public Pe8090mTRATO3OutCtx clone() {
        Pe8090mTRATO3OutCtx cloneObj = new Pe8090mTRATO3OutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public Pe8090mTRATO3OutCtx getPe8090mTRATO3OutCtx() {
            return new Pe8090mTRATO3OutCtx();
    }
     public class Pe8090mTRATO4InCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();


public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wMasFpfPe8090m
	 *	@return wMasFpfPe8090m
	 */
   public char[] getWMasFpfPe8090m() throws CFException  {              
   		return section.getWZonFpfPe8090m().getWMasFpfPe8090m();
   }

  
	/**
	*  set variable wMasFpfPe8090m
	*  @param value
	**/
   public void setWMasFpfPe8090m(char[] value) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(value);
   } 

     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasFpfPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasFpfPe8090m with another Field
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source);
   }  
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wCntFisPe8090m
	 *	@return wCntFisPe8090m
	 */
	public int getWCntFisPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntFisPe8090m();
	}
	
	/**
	 * 	Update WCntFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntFisPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m(number);
	}


	public void setWCntFisPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m((int)number);
	}


	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTmaFpfPe8090m
	 *	@return wTmaFpfPe8090m
	 */
	public int getWTmaFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTmaFpfPe8090m();
	}
	
	/**
	 * 	Update WTmaFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m(number);
	}


	public void setWTmaFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcmFpfPe8090m
	 *	@return wNcmFpfPe8090m
	 */
	public int getWNcmFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNcmFpfPe8090m();
	}
	
	/**
	 * 	Update WNcmFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcmFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m(number);
	}


	public void setWNcmFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public Pe8090mTRATO4OutCtx getPe8090mTRATO4OutCtx() {
            return new Pe8090mTRATO4OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public Pe8090mTRATO4InCtx clone() {
        Pe8090mTRATO4InCtx cloneObj = new Pe8090mTRATO4InCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public Pe8090mTRATO4InCtx getPe8090mTRATO4InCtx() {
            return new Pe8090mTRATO4InCtx();
    }
     public class Pe8090mTRATO4OutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wPerGruPe8090m
	 *	@return wPerGruPe8090m
	 */
	public int getWPerGruPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWPerGruPe8090m();
	}
	
	/**
	 * 	Update WPerGruPe8090m with the passed value
	 *	@param number
	 */
	public void setWPerGruPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m(number);
	}


	public void setWPerGruPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWPerGruPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNmaSepPe8090m
	 *	@return wNmaSepPe8090m
	 */
	public int getWNmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNmaSepPe8090m();
	}
	
	/**
	 * 	Update WNmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWNmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m(number);
	}


	public void setWNmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMasFpfPe8090m
	 *	@return wMasFpfPe8090m
	 */
   public char[] getWMasFpfPe8090m() throws CFException  {              
   		return section.getWZonFpfPe8090m().getWMasFpfPe8090m();
   }

  
	/**
	*  set variable wMasFpfPe8090m
	*  @param value
	**/
   public void setWMasFpfPe8090m(char[] value) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(value);
   } 

     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasFpfPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasFpfPe8090m with another Field
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source);
   }  
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wCntFisPe8090m
	 *	@return wCntFisPe8090m
	 */
	public int getWCntFisPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntFisPe8090m();
	}
	
	/**
	 * 	Update WCntFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntFisPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m(number);
	}


	public void setWCntFisPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m((int)number);
	}


	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTmaFpfPe8090m
	 *	@return wTmaFpfPe8090m
	 */
	public int getWTmaFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTmaFpfPe8090m();
	}
	
	/**
	 * 	Update WTmaFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m(number);
	}


	public void setWTmaFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTipFpfPe8090m
	 *	@return wTipFpfPe8090m
	 */
	public int getWTipFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTipFpfPe8090m();
	}
	
	/**
	 * 	Update WTipFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTipFpfPe8090m(number);
	}


	public void setWTipFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTipFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTmaSepPe8090m
	 *	@return wTmaSepPe8090m
	 */
	public int getWTmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTmaSepPe8090m();
	}
	
	/**
	 * 	Update WTmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTmaSepPe8090m(number);
	}


	public void setWTmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTmaSepPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcmFpfPe8090m
	 *	@return wNcmFpfPe8090m
	 */
	public int getWNcmFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNcmFpfPe8090m();
	}
	
	/**
	 * 	Update WNcmFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcmFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m(number);
	}


	public void setWNcmFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNupFpfPe8090m
	 *	@return wNupFpfPe8090m
	 */
	public int getWNupFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNupFpfPe8090m();
	}
	
	/**
	 * 	Update WNupFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNupFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m(number);
	}


	public void setWNupFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMasSepPe8090m
	 *	@return wMasSepPe8090m
	 */
   public char[] getWMasSepPe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWMasSepPe8090m();
   }

  
	/**
	*  set variable wMasSepPe8090m
	*  @param value
	**/
   public void setWMasSepPe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(value);
   } 

     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasSepPe8090m with another Field
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source);
   }  
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public Pe8090mTRATO4OutCtx clone() {
        Pe8090mTRATO4OutCtx cloneObj = new Pe8090mTRATO4OutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public Pe8090mTRATO4OutCtx getPe8090mTRATO4OutCtx() {
            return new Pe8090mTRATO4OutCtx();
    }
     public class Pe8090mTRATO5InCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();


public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wCntFisPe8090m
	 *	@return wCntFisPe8090m
	 */
	public int getWCntFisPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntFisPe8090m();
	}
	
	/**
	 * 	Update WCntFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntFisPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m(number);
	}


	public void setWCntFisPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m((int)number);
	}


	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wCntPerPe8090m
	 *	@return wCntPerPe8090m
	 */
	public int getWCntPerPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntPerPe8090m();
	}
	
	/**
	 * 	Update WCntPerPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntPerPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntPerPe8090m(number);
	}


	public void setWCntPerPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntPerPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public Pe8090mTRATO5OutCtx getPe8090mTRATO5OutCtx() {
            return new Pe8090mTRATO5OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public Pe8090mTRATO5InCtx clone() {
        Pe8090mTRATO5InCtx cloneObj = new Pe8090mTRATO5InCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public Pe8090mTRATO5InCtx getPe8090mTRATO5InCtx() {
            return new Pe8090mTRATO5InCtx();
    }
     public class Pe8090mTRATO5OutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wNmaSepPe8090m
	 *	@return wNmaSepPe8090m
	 */
	public int getWNmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNmaSepPe8090m();
	}
	
	/**
	 * 	Update WNmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWNmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m(number);
	}


	public void setWNmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNmaSepPe8090m((int)number);
	}


	/**
	 *	Returns the value of wCntFisPe8090m
	 *	@return wCntFisPe8090m
	 */
	public int getWCntFisPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntFisPe8090m();
	}
	
	/**
	 * 	Update WCntFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntFisPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m(number);
	}


	public void setWCntFisPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m((int)number);
	}


	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTmaSepPe8090m
	 *	@return wTmaSepPe8090m
	 */
	public int getWTmaSepPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTmaSepPe8090m();
	}
	
	/**
	 * 	Update WTmaSepPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaSepPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTmaSepPe8090m(number);
	}


	public void setWTmaSepPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTmaSepPe8090m((int)number);
	}


	/**
	 *	Returns the value of wCntPerPe8090m
	 *	@return wCntPerPe8090m
	 */
	public int getWCntPerPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntPerPe8090m();
	}
	
	/**
	 * 	Update WCntPerPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntPerPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntPerPe8090m(number);
	}


	public void setWCntPerPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntPerPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMasSepPe8090m
	 *	@return wMasSepPe8090m
	 */
   public char[] getWMasSepPe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWMasSepPe8090m();
   }

  
	/**
	*  set variable wMasSepPe8090m
	*  @param value
	**/
   public void setWMasSepPe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(value);
   } 

     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasSepPe8090m with another Field
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source);
   }  
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWMasSepPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public Pe8090mTRATO5OutCtx clone() {
        Pe8090mTRATO5OutCtx cloneObj = new Pe8090mTRATO5OutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public Pe8090mTRATO5OutCtx getPe8090mTRATO5OutCtx() {
            return new Pe8090mTRATO5OutCtx();
    }
     public class Pe8090mTRATO6OutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wCntFisPe8090m
	 *	@return wCntFisPe8090m
	 */
	public int getWCntFisPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntFisPe8090m();
	}
	
	/**
	 * 	Update WCntFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntFisPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m(number);
	}


	public void setWCntFisPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public Pe8090mTRATO6OutCtx clone() {
        Pe8090mTRATO6OutCtx cloneObj = new Pe8090mTRATO6OutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public Pe8090mTRATO6OutCtx getPe8090mTRATO6OutCtx() {
            return new Pe8090mTRATO6OutCtx();
    }
     public class Pe8090mTRATO7InCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wTipAlmPe8090m
	 *	@return wTipAlmPe8090m
	 */
	public int getWTipAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWTipAlmPe8090m();
	}
	
	/**
	 * 	Update WTipAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWTipAlmPe8090m(number);
	}


	public void setWTipAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWTipAlmPe8090m((int)number);
	}


	/**
	 *	Test condition "S" for isInpUp1vez()
	 *	@return  Returns true if isInpUp1vez() is "S"
	 */
   public boolean isInpUp1vez() throws CFException {
      return work.isInpUp1vez();
   }

	/**
	*  set values "S"
	*/
   	public void setInpUp1vezTrue()  throws CFException{  			
    	work.setInpUp1vezTrue();
   	}

public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wNomAlmPe8090m
	 *	@return wNomAlmPe8090m
	 */
   public char[] getWNomAlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWNomAlmPe8090m();
   }

  
	/**
	*  set variable wNomAlmPe8090m
	*  @param value
	**/
   public void setWNomAlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(value);
   } 

     /**
	 * 	Update WNomAlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNomAlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNomAlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNomAlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNomAlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source);
   }  
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcnAlmPe8090m
	 *	@return wNcnAlmPe8090m
	 */
	public int getWNcnAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWNcnAlmPe8090m();
	}
	
	/**
	 * 	Update WNcnAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcnAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWNcnAlmPe8090m(number);
	}


	public void setWNcnAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWNcnAlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wIeqAlmPe8090m
	 *	@return wIeqAlmPe8090m
	 */
	public int getWIeqAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWIeqAlmPe8090m();
	}
	
	/**
	 * 	Update WIeqAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWIeqAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWIeqAlmPe8090m(number);
	}


	public void setWIeqAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWIeqAlmPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public Pe8090mTRATO7OutCtx getPe8090mTRATO7OutCtx() {
            return new Pe8090mTRATO7OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Pe8090mTRATO7InCtx clone() {
        Pe8090mTRATO7InCtx cloneObj = new Pe8090mTRATO7InCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Pe8090mTRATO7InCtx getPe8090mTRATO7InCtx() {
            return new Pe8090mTRATO7InCtx();
    }
     public class Pe8090mTRATO7OutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wTipAlmPe8090m
	 *	@return wTipAlmPe8090m
	 */
	public int getWTipAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWTipAlmPe8090m();
	}
	
	/**
	 * 	Update WTipAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWTipAlmPe8090m(number);
	}


	public void setWTipAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWTipAlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wTipPe8090m
	 *	@return wTipPe8090m
	 */
	public int getWTipPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTipPe8090m();
	}
	
	/**
	 * 	Update WTipPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m(number);
	}


	public void setWTipPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTipPe8090m((int)number);
	}



public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wTpeNrePe8090m
	 *	@return wTpeNrePe8090m
	 */
	public int getWTpeNrePe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWTpeNrePe8090m();
	}
	
	/**
	 * 	Update WTpeNrePe8090m with the passed value
	 *	@param number
	 */
	public void setWTpeNrePe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTpeNrePe8090m(number);
	}


	public void setWTpeNrePe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWTpeNrePe8090m((int)number);
	}


	/**
	 *	Returns the value of wNomAlmPe8090m
	 *	@return wNomAlmPe8090m
	 */
   public char[] getWNomAlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWNomAlmPe8090m();
   }

  
	/**
	*  set variable wNomAlmPe8090m
	*  @param value
	**/
   public void setWNomAlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(value);
   } 

     /**
	 * 	Update WNomAlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNomAlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNomAlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNomAlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNomAlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source);
   }  
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNomAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wIeqPe8090m
	 *	@return wIeqPe8090m
	 */
	public int getWIeqPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWIeqPe8090m();
	}
	
	/**
	 * 	Update WIeqPe8090m with the passed value
	 *	@param number
	 */
	public void setWIeqPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWIeqPe8090m(number);
	}


	public void setWIeqPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWIeqPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNomPe8090m
	 *	@return wNomPe8090m
	 */
   public char[] getWNomPe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNomPe8090m();
   }

  
	/**
	*  set variable wNomPe8090m
	*  @param value
	**/
   public void setWNomPe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(value);
   } 

     /**
	 * 	Update WNomPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNomPe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNomPe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNomPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNomPe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNomPe8090m with another Field
	 *	@param value
	 */
   public void setWNomPe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source);
   }  
   
     /**
	 * 	Update WNomPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNomPe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNomPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNomPe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNcaNomPe8090m
	 *	@return wNcaNomPe8090m
	 */
	public int getWNcaNomPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNomPe8090m();
	}
	
	/**
	 * 	Update WNcaNomPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNomPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m(number);
	}


	public void setWNcaNomPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNomPe8090m((int)number);
	}


	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcnAlmPe8090m
	 *	@return wNcnAlmPe8090m
	 */
	public int getWNcnAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWNcnAlmPe8090m();
	}
	
	/**
	 * 	Update WNcnAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcnAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWNcnAlmPe8090m(number);
	}


	public void setWNcnAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWNcnAlmPe8090m((int)number);
	}


	/**
	 *	Test condition "N" for isNoInpUp1vez()
	 *	@return  Returns true if isNoInpUp1vez() is "N"
	 */
   public boolean isNoInpUp1vez() throws CFException {
      return work.isNoInpUp1vez();
   }

	/**
	*  set values "N"
	*/
   	public void setNoInpUp1vezTrue()  throws CFException{  			
    	work.setNoInpUp1vezTrue();
   	}
	/**
	 *	Returns the value of wIeqAlmPe8090m
	 *	@return wIeqAlmPe8090m
	 */
	public int getWIeqAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWIeqAlmPe8090m();
	}
	
	/**
	 * 	Update WIeqAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWIeqAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWIeqAlmPe8090m(number);
	}


	public void setWIeqAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWIeqAlmPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Pe8090mTRATO7OutCtx clone() {
        Pe8090mTRATO7OutCtx cloneObj = new Pe8090mTRATO7OutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Pe8090mTRATO7OutCtx getPe8090mTRATO7OutCtx() {
            return new Pe8090mTRATO7OutCtx();
    }
     public class EsFisAlmPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wCpeAlmPe8090m
	 *	@return wCpeAlmPe8090m
	 */
	public int getWCpeAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWCpeAlmPe8090m();
	}
	
	/**
	 * 	Update WCpeAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWCpeAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWCpeAlmPe8090m(number);
	}


	public void setWCpeAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWCpeAlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNc1AlmPe8090m
	 *	@return wNc1AlmPe8090m
	 */
	public int getWNc1AlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWNc1AlmPe8090m();
	}
	
	/**
	 * 	Update WNc1AlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWNc1AlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWNc1AlmPe8090m(number);
	}


	public void setWNc1AlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWNc1AlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wSeaAlmPe8090m
	 *	@return wSeaAlmPe8090m
	 */
   public char[] getWSeaAlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWSeaAlmPe8090m();
   }

  
	/**
	*  set variable wSeaAlmPe8090m
	*  @param value
	**/
   public void setWSeaAlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWSeaAlmPe8090m(value);
   } 

     /**
	 * 	Update WSeaAlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWSeaAlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWSeaAlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWSeaAlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWSeaAlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WSeaAlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWSeaAlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWSeaAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WSeaAlmPe8090m with another Field
	 *	@param value
	 */
   public void setWSeaAlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWSeaAlmPe8090m(source);
   }  
   
     /**
	 * 	Update WSeaAlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWSeaAlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWSeaAlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WSeaAlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWSeaAlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWSeaAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wPraAlmPe8090m
	 *	@return wPraAlmPe8090m
	 */
   public char[] getWPraAlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWPraAlmPe8090m();
   }

  
	/**
	*  set variable wPraAlmPe8090m
	*  @param value
	**/
   public void setWPraAlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWPraAlmPe8090m(value);
   } 

     /**
	 * 	Update WPraAlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPraAlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWPraAlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWPraAlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWPraAlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WPraAlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPraAlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWPraAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WPraAlmPe8090m with another Field
	 *	@param value
	 */
   public void setWPraAlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWPraAlmPe8090m(source);
   }  
   
     /**
	 * 	Update WPraAlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPraAlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWPraAlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WPraAlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPraAlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWPraAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNc2AlmPe8090m
	 *	@return wNc2AlmPe8090m
	 */
	public int getWNc2AlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWNc2AlmPe8090m();
	}
	
	/**
	 * 	Update WNc2AlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWNc2AlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWNc2AlmPe8090m(number);
	}


	public void setWNc2AlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWNc2AlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wCntFisPe8090m
	 *	@return wCntFisPe8090m
	 */
	public int getWCntFisPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntFisPe8090m();
	}
	
	/**
	 * 	Update WCntFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntFisPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m(number);
	}


	public void setWCntFisPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNreAlmPe8090m
	 *	@return wNreAlmPe8090m
	 */
   public char[] getWNreAlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWNreAlmPe8090m();
   }

  
	/**
	*  set variable wNreAlmPe8090m
	*  @param value
	**/
   public void setWNreAlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWNreAlmPe8090m(value);
   } 

     /**
	 * 	Update WNreAlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNreAlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWNreAlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNreAlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWNreAlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNreAlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNreAlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNreAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNreAlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNreAlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWNreAlmPe8090m(source);
   }  
   
     /**
	 * 	Update WNreAlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNreAlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWNreAlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNreAlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNreAlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNreAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNo1AlmPe8090m
	 *	@return wNo1AlmPe8090m
	 */
   public char[] getWNo1AlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWNo1AlmPe8090m();
   }

  
	/**
	*  set variable wNo1AlmPe8090m
	*  @param value
	**/
   public void setWNo1AlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(value);
   } 

     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNo1AlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNo1AlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source);
   }  
   
     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNo2AlmPe8090m
	 *	@return wNo2AlmPe8090m
	 */
   public char[] getWNo2AlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWNo2AlmPe8090m();
   }

  
	/**
	*  set variable wNo2AlmPe8090m
	*  @param value
	**/
   public void setWNo2AlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(value);
   } 

     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNo2AlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNo2AlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source);
   }  
   
     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public EsFisAlmPe8090mOutCtx getEsFisAlmPe8090mOutCtx() {
            return new EsFisAlmPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public EsFisAlmPe8090mInCtx clone() {
        EsFisAlmPe8090mInCtx cloneObj = new EsFisAlmPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public EsFisAlmPe8090mInCtx getEsFisAlmPe8090mInCtx() {
            return new EsFisAlmPe8090mInCtx();
    }
     public class EsFisAlmPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wPraAlmPe8090m
	 *	@return wPraAlmPe8090m
	 */
   public char[] getWPraAlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWPraAlmPe8090m();
   }

  
	/**
	*  set variable wPraAlmPe8090m
	*  @param value
	**/
   public void setWPraAlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWPraAlmPe8090m(value);
   } 

     /**
	 * 	Update WPraAlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPraAlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWPraAlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWPraAlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWPraAlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WPraAlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPraAlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWPraAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WPraAlmPe8090m with another Field
	 *	@param value
	 */
   public void setWPraAlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWPraAlmPe8090m(source);
   }  
   
     /**
	 * 	Update WPraAlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPraAlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWPraAlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WPraAlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPraAlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWPraAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNc2AlmPe8090m
	 *	@return wNc2AlmPe8090m
	 */
	public int getWNc2AlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWNc2AlmPe8090m();
	}
	
	/**
	 * 	Update WNc2AlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWNc2AlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWNc2AlmPe8090m(number);
	}


	public void setWNc2AlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWNc2AlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNsePerPe8090m
	 *	@return wNsePerPe8090m
	 */
	public int getWNsePerPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNsePerPe8090m();
	}
	
	/**
	 * 	Update WNsePerPe8090m with the passed value
	 *	@param number
	 */
	public void setWNsePerPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNsePerPe8090m(number);
	}


	public void setWNsePerPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNsePerPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNreAlmPe8090m
	 *	@return wNreAlmPe8090m
	 */
   public char[] getWNreAlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWNreAlmPe8090m();
   }

  
	/**
	*  set variable wNreAlmPe8090m
	*  @param value
	**/
   public void setWNreAlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWNreAlmPe8090m(value);
   } 

     /**
	 * 	Update WNreAlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNreAlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWNreAlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNreAlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWNreAlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNreAlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNreAlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNreAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNreAlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNreAlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWNreAlmPe8090m(source);
   }  
   
     /**
	 * 	Update WNreAlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNreAlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWNreAlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNreAlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNreAlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNreAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNcaNo1Pe8090m
	 *	@return wNcaNo1Pe8090m
	 */
	public int getWNcaNo1Pe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNo1Pe8090m();
	}
	
	/**
	 * 	Update WNcaNo1Pe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNo1Pe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNo1Pe8090m(number);
	}


	public void setWNcaNo1Pe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNo1Pe8090m((int)number);
	}


	/**
	 *	Returns the value of wSeaNrePe8090m
	 *	@return wSeaNrePe8090m
	 */
   public char[] getWSeaNrePe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWSeaNrePe8090m();
   }

  
	/**
	*  set variable wSeaNrePe8090m
	*  @param value
	**/
   public void setWSeaNrePe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWSeaNrePe8090m(value);
   } 

     /**
	 * 	Update WSeaNrePe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWSeaNrePe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWSeaNrePe8090m(source, sourceIndex);
   	
   }
   
   public void setWSeaNrePe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWSeaNrePe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WSeaNrePe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWSeaNrePe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWSeaNrePe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WSeaNrePe8090m with another Field
	 *	@param value
	 */
   public void setWSeaNrePe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWSeaNrePe8090m(source);
   }  
   
     /**
	 * 	Update WSeaNrePe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWSeaNrePe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWSeaNrePe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WSeaNrePe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWSeaNrePe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWSeaNrePe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNo1AlmPe8090m
	 *	@return wNo1AlmPe8090m
	 */
   public char[] getWNo1AlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWNo1AlmPe8090m();
   }

  
	/**
	*  set variable wNo1AlmPe8090m
	*  @param value
	**/
   public void setWNo1AlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(value);
   } 

     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNo1AlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNo1AlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source);
   }  
   
     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNo1AlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNo2AlmPe8090m
	 *	@return wNo2AlmPe8090m
	 */
   public char[] getWNo2AlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWNo2AlmPe8090m();
   }

  
	/**
	*  set variable wNo2AlmPe8090m
	*  @param value
	**/
   public void setWNo2AlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(value);
   } 

     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWNo2AlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNo2AlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source);
   }  
   
     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWNo2AlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNo2Pe8090m
	 *	@return wNo2Pe8090m
	 */
   public char[] getWNo2Pe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNo2Pe8090m();
   }

  
	/**
	*  set variable wNo2Pe8090m
	*  @param value
	**/
   public void setWNo2Pe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(value);
   } 

     /**
	 * 	Update WNo2Pe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex);
   	
   }
   
   public void setWNo2Pe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNo2Pe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNo2Pe8090m with another Field
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source);
   }  
   
     /**
	 * 	Update WNo2Pe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNo2Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo2Pe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo2Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wCpeAlmPe8090m
	 *	@return wCpeAlmPe8090m
	 */
	public int getWCpeAlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWCpeAlmPe8090m();
	}
	
	/**
	 * 	Update WCpeAlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWCpeAlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWCpeAlmPe8090m(number);
	}


	public void setWCpeAlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWCpeAlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNc1AlmPe8090m
	 *	@return wNc1AlmPe8090m
	 */
	public int getWNc1AlmPe8090m() throws CFException {        
   		return section.getWZonAlmPe8090m().getWNc1AlmPe8090m();
	}
	
	/**
	 * 	Update WNc1AlmPe8090m with the passed value
	 *	@param number
	 */
	public void setWNc1AlmPe8090m(int number)  throws CFException{
		section.getWZonAlmPe8090m().setWNc1AlmPe8090m(number);
	}


	public void setWNc1AlmPe8090m(long number)  throws CFException{
		section.getWZonAlmPe8090m().setWNc1AlmPe8090m((int)number);
	}


	/**
	 *	Returns the value of wSeaAlmPe8090m
	 *	@return wSeaAlmPe8090m
	 */
   public char[] getWSeaAlmPe8090m() throws CFException  {              
   		return section.getWZonAlmPe8090m().getWSeaAlmPe8090m();
   }

  
	/**
	*  set variable wSeaAlmPe8090m
	*  @param value
	**/
   public void setWSeaAlmPe8090m(char[] value) throws CFException {
      section.getWZonAlmPe8090m().setWSeaAlmPe8090m(value);
   } 

     /**
	 * 	Update WSeaAlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWSeaAlmPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonAlmPe8090m().setWSeaAlmPe8090m(source, sourceIndex);
   	
   }
   
   public void setWSeaAlmPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonAlmPe8090m().setWSeaAlmPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WSeaAlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWSeaAlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWSeaAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WSeaAlmPe8090m with another Field
	 *	@param value
	 */
   public void setWSeaAlmPe8090m(Field source) {
      section.getWZonAlmPe8090m().setWSeaAlmPe8090m(source);
   }  
   
     /**
	 * 	Update WSeaAlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWSeaAlmPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonAlmPe8090m().setWSeaAlmPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WSeaAlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWSeaAlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonAlmPe8090m().setWSeaAlmPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wCntFisPe8090m
	 *	@return wCntFisPe8090m
	 */
	public int getWCntFisPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntFisPe8090m();
	}
	
	/**
	 * 	Update WCntFisPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntFisPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m(number);
	}


	public void setWCntFisPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntFisPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNomNrePe8090m
	 *	@return wNomNrePe8090m
	 */
   public char[] getWNomNrePe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNomNrePe8090m();
   }

  
	/**
	*  set variable wNomNrePe8090m
	*  @param value
	**/
   public void setWNomNrePe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomNrePe8090m(value);
   } 

     /**
	 * 	Update WNomNrePe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNomNrePe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomNrePe8090m(source, sourceIndex);
   	
   }
   
   public void setWNomNrePe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomNrePe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNomNrePe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNomNrePe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomNrePe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNomNrePe8090m with another Field
	 *	@param value
	 */
   public void setWNomNrePe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomNrePe8090m(source);
   }  
   
     /**
	 * 	Update WNomNrePe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNomNrePe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomNrePe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNomNrePe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNomNrePe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNomNrePe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPraNrePe8090m
	 *	@return wPraNrePe8090m
	 */
   public char[] getWPraNrePe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWPraNrePe8090m();
   }

  
	/**
	*  set variable wPraNrePe8090m
	*  @param value
	**/
   public void setWPraNrePe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWPraNrePe8090m(value);
   } 

     /**
	 * 	Update WPraNrePe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPraNrePe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWPraNrePe8090m(source, sourceIndex);
   	
   }
   
   public void setWPraNrePe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWPraNrePe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WPraNrePe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPraNrePe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWPraNrePe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WPraNrePe8090m with another Field
	 *	@param value
	 */
   public void setWPraNrePe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWPraNrePe8090m(source);
   }  
   
     /**
	 * 	Update WPraNrePe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPraNrePe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWPraNrePe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WPraNrePe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPraNrePe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWPraNrePe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNcaNo2Pe8090m
	 *	@return wNcaNo2Pe8090m
	 */
	public int getWNcaNo2Pe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNcaNo2Pe8090m();
	}
	
	/**
	 * 	Update WNcaNo2Pe8090m with the passed value
	 *	@param number
	 */
	public void setWNcaNo2Pe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNo2Pe8090m(number);
	}


	public void setWNcaNo2Pe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWNcaNo2Pe8090m((int)number);
	}


	/**
	 *	Returns the value of wCpeNomPe8090m
	 *	@return wCpeNomPe8090m
	 */
	public int getWCpeNomPe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWCpeNomPe8090m();
	}
	
	/**
	 * 	Update WCpeNomPe8090m with the passed value
	 *	@param number
	 */
	public void setWCpeNomPe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWCpeNomPe8090m(number);
	}


	public void setWCpeNomPe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWCpeNomPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNo1Pe8090m
	 *	@return wNo1Pe8090m
	 */
   public char[] getWNo1Pe8090m(int index) throws CFException  {              
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWNo1Pe8090m();
   }

  
	/**
	*  set variable wNo1Pe8090m
	*  @param value
	**/
   public void setWNo1Pe8090m(int index,char[] value) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(value);
   } 

     /**
	 * 	Update WNo1Pe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,char[] source, int sourceIndex) throws CFException {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex);
   	
   }
   
   public void setWNo1Pe8090m(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WNo1Pe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WNo1Pe8090m with another Field
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,Field source) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source);
   }  
   
     /**
	 * 	Update WNo1Pe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,Field source, int sourceIndex,int sourceLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WNo1Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo1Pe8090m(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWTpePe8090m().getWElpPe8090m(index).setWNo1Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public EsFisAlmPe8090mOutCtx clone() {
        EsFisAlmPe8090mOutCtx cloneObj = new EsFisAlmPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public EsFisAlmPe8090mOutCtx getEsFisAlmPe8090mOutCtx() {
            return new EsFisAlmPe8090mOutCtx();
    }
     public class EsJurAlmPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();


public void setWInpPe8090m(int wInpPe8090m) { 
    Bm8090mCtx.this.wInpPe8090m = wInpPe8090m;
}

public int getWInpPe8090m() { 
    return Bm8090mCtx.this.wInpPe8090m;
}
	/**
	 *	Returns the value of wCntGioPe8090m
	 *	@return wCntGioPe8090m
	 */
	public int getWCntGioPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntGioPe8090m();
	}
	
	/**
	 * 	Update WCntGioPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntGioPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntGioPe8090m(number);
	}


	public void setWCntGioPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntGioPe8090m((int)number);
	}


	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public EsJurAlmPe8090mOutCtx getEsJurAlmPe8090mOutCtx() {
            return new EsJurAlmPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public EsJurAlmPe8090mInCtx clone() {
        EsJurAlmPe8090mInCtx cloneObj = new EsJurAlmPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public EsJurAlmPe8090mInCtx getEsJurAlmPe8090mInCtx() {
            return new EsJurAlmPe8090mInCtx();
    }
     public class EsJurAlmPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wCntGioPe8090m
	 *	@return wCntGioPe8090m
	 */
	public int getWCntGioPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWCntGioPe8090m();
	}
	
	/**
	 * 	Update WCntGioPe8090m with the passed value
	 *	@param number
	 */
	public void setWCntGioPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWCntGioPe8090m(number);
	}


	public void setWCntGioPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWCntGioPe8090m((int)number);
	}


	/**
	 *	Returns the value of wIsePe8090m
	 *	@return wIsePe8090m
	 */
	public int getWIsePe8090m(int index) throws CFException {        
   		return section.getWTpePe8090m().getWElpPe8090m(index).getWIsePe8090m();
	}
	
	/**
	 * 	Update WIsePe8090m with the passed value
	 *	@param number
	 */
	public void setWIsePe8090m(int index,int number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWIsePe8090m(number);
	}


	public void setWIsePe8090m(int index,long number)  throws CFException{
		section.getWTpePe8090m().getWElpPe8090m(index).setWIsePe8090m((int)number);
	}


	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public EsJurAlmPe8090mOutCtx clone() {
        EsJurAlmPe8090mOutCtx cloneObj = new EsJurAlmPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public EsJurAlmPe8090mOutCtx getEsJurAlmPe8090mOutCtx() {
            return new EsJurAlmPe8090mOutCtx();
    }
     public class FinPerFisPe8090mEntradaInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wIdiApe
	 *	@return wIdiApe
	 */
   public char[] getWIdiApe() throws CFException  {              
   		return section.getWDatVarPe8090m().getWIdiApe();
   }

  
	/**
	*  set variable wIdiApe
	*  @param value
	**/
   public void setWIdiApe(char[] value) throws CFException {
      section.getWDatVarPe8090m().setWIdiApe(value);
   } 

     /**
	 * 	Update WIdiApe 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWIdiApe(char[] source, int sourceIndex) throws CFException {
      section.getWDatVarPe8090m().setWIdiApe(source, sourceIndex);
   	
   }
   
   public void setWIdiApe(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWDatVarPe8090m().setWIdiApe(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WIdiApe 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWIdiApe(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWDatVarPe8090m().setWIdiApe(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WIdiApe with another Field
	 *	@param value
	 */
   public void setWIdiApe(Field source) {
      section.getWDatVarPe8090m().setWIdiApe(source);
   }  
   
     /**
	 * 	Update WIdiApe 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWIdiApe(Field source, int sourceIndex,int sourceLen) {
      section.getWDatVarPe8090m().setWIdiApe(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WIdiApe 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWIdiApe(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWDatVarPe8090m().setWIdiApe(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wTipFpfPe8090m
	 *	@return wTipFpfPe8090m
	 */
	public int getWTipFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTipFpfPe8090m();
	}
	
	/**
	 * 	Update WTipFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTipFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTipFpfPe8090m(number);
	}


	public void setWTipFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTipFpfPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public FinPerFisPe8090mEntradaInCtx clone() {
        FinPerFisPe8090mEntradaInCtx cloneObj = new FinPerFisPe8090mEntradaInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public FinPerFisPe8090mEntradaInCtx getFinPerFisPe8090mEntradaInCtx() {
            return new FinPerFisPe8090mEntradaInCtx();
    }
     public class CatPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wMcat7aPe8090m
	 *	@return wMcat7aPe8090m
	 */   
	 public WMcat7aPe8090m getWMcat7aPe8090m() {
   	return section.getWMcat7aPe8090m();
   }

   /**
	* 	Update WMcat7aPe8090m with the passed value
	*	@param value
	*/
   public void setWMcat7aPe8090m(char[] value) throws CFException {
      section.setWMcat7aPe8090m(value);
   }   

     /**
	 * 	Update WMcat7aPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat7aPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcat7aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat7aPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7aPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat7aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat7aPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat7aPe8090m(Field source) {
   	section.setWMcat7aPe8090m(source);
   }  
   
     /**
	 * 	Update WMcat7aPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat7aPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcat7aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat7aPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7aPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat7aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcat7bPe8090m
	 *	@return wMcat7bPe8090m
	 */   
	 public WMcat7bPe8090m getWMcat7bPe8090m() {
   	return section.getWMcat7bPe8090m();
   }

   /**
	* 	Update WMcat7bPe8090m with the passed value
	*	@param value
	*/
   public void setWMcat7bPe8090m(char[] value) throws CFException {
      section.setWMcat7bPe8090m(value);
   }   

     /**
	 * 	Update WMcat7bPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat7bPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcat7bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat7bPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7bPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat7bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat7bPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat7bPe8090m(Field source) {
   	section.setWMcat7bPe8090m(source);
   }  
   
     /**
	 * 	Update WMcat7bPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat7bPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcat7bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat7bPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7bPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat7bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNupFpfPe8090m
	 *	@return wNupFpfPe8090m
	 */
	public int getWNupFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNupFpfPe8090m();
	}
	
	/**
	 * 	Update WNupFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNupFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m(number);
	}


	public void setWNupFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMcat7Pe8090m
	 *	@return wMcat7Pe8090m
	 */   
	 public WMcat7Pe8090m getWMcat7Pe8090m() {
   	return section.getWMcat7Pe8090m();
   }

   /**
	* 	Update WMcat7Pe8090m with the passed value
	*	@param value
	*/
   public void setWMcat7Pe8090m(char[] value) throws CFException {
      section.setWMcat7Pe8090m(value);
   }   

     /**
	 * 	Update WMcat7Pe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat7Pe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcat7Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat7Pe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat7Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat7Pe8090m with another Field
	 *	@param value
	 */
   public void setWMcat7Pe8090m(Field source) {
   	section.setWMcat7Pe8090m(source);
   }  
   
     /**
	 * 	Update WMcat7Pe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat7Pe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcat7Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat7Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat7Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public CatPe8090mOutCtx getCatPe8090mOutCtx() {
            return new CatPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public CatPe8090mInCtx clone() {
        CatPe8090mInCtx cloneObj = new CatPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public CatPe8090mInCtx getCatPe8090mInCtx() {
            return new CatPe8090mInCtx();
    }
     public class CatPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wMcat7aPe8090m
	 *	@return wMcat7aPe8090m
	 */   
	 public WMcat7aPe8090m getWMcat7aPe8090m() {
   	return section.getWMcat7aPe8090m();
   }

   /**
	* 	Update WMcat7aPe8090m with the passed value
	*	@param value
	*/
   public void setWMcat7aPe8090m(char[] value) throws CFException {
      section.setWMcat7aPe8090m(value);
   }   

     /**
	 * 	Update WMcat7aPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat7aPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcat7aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat7aPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7aPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat7aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat7aPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat7aPe8090m(Field source) {
   	section.setWMcat7aPe8090m(source);
   }  
   
     /**
	 * 	Update WMcat7aPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat7aPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcat7aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat7aPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7aPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat7aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcat71Pe8090m
	 *	@return wMcat71Pe8090m
	 */
	public int getWMcat71Pe8090m() throws CFException {
   		return section.getWMcat7Pe8090m().getWMcat71Pe8090m();
	}


	/**
	 *	Returns String value of wMcat71Pe8090m
	 *	@return wMcat71Pe8090m
	 */
	public char[]  getWMcat71Pe8090mString() throws CFException {
	     return String.valueOf(section.getWMcat7Pe8090m().getWMcat71Pe8090mString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcat71Pe8090mIsNumeric()  throws CFException{
	    return section.getWMcat7Pe8090m().wMcat71Pe8090mIsNumeric();
	}

	/**
	 * 	Update WMcat71Pe8090m with the passed value
	 *	@param number
	 */
	public void setWMcat71Pe8090m(int number)  throws CFException{
		section.getWMcat7Pe8090m().setWMcat71Pe8090m(number);
	}
	

	public void setWMcat71Pe8090m(long number)  throws CFException{
	    section.getWMcat7Pe8090m().setWMcat71Pe8090m(number);
	}
	
	
	/**
	 * 	Update WMcat71Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcat71Pe8090m(char[] value)  throws CFException {
		section.getWMcat7Pe8090m().setWMcat71Pe8090m(value);
	}
	
	/**
	 * 	Update WMcat71Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcat71Pe8090mString(char[] value)  throws CFException{
		section.getWMcat7Pe8090m().setWMcat71Pe8090m(value);
	}	

	/**
	 *	Returns the value of wMcat7pPe8090m
	 *	@return wMcat7pPe8090m
	 */
   public char[] getWMcat7pPe8090m() throws CFException  {              
   		return section.getWMcat7Pe8090m().getWMcat7pPe8090m();
   }

  
	/**
	*  set variable wMcat7pPe8090m
	*  @param value
	**/
   public void setWMcat7pPe8090m(char[] value) throws CFException {
      section.getWMcat7Pe8090m().setWMcat7pPe8090m(value);
   } 

     /**
	 * 	Update WMcat7pPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMcat7pPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWMcat7Pe8090m().setWMcat7pPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMcat7pPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWMcat7Pe8090m().setWMcat7pPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat7pPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7pPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWMcat7Pe8090m().setWMcat7pPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat7pPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat7pPe8090m(Field source) {
      section.getWMcat7Pe8090m().setWMcat7pPe8090m(source);
   }  
   
     /**
	 * 	Update WMcat7pPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMcat7pPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWMcat7Pe8090m().setWMcat7pPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMcat7pPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7pPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWMcat7Pe8090m().setWMcat7pPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMasFpfPe8090m
	 *	@return wMasFpfPe8090m
	 */
   public char[] getWMasFpfPe8090m() throws CFException  {              
   		return section.getWZonFpfPe8090m().getWMasFpfPe8090m();
   }

  
	/**
	*  set variable wMasFpfPe8090m
	*  @param value
	**/
   public void setWMasFpfPe8090m(char[] value) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(value);
   } 

     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasFpfPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasFpfPe8090m with another Field
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source);
   }  
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcat73Pe8090m
	 *	@return wMcat73Pe8090m
	 */
	public int getWMcat73Pe8090m() throws CFException {
   		return section.getWMcat7bPe8090m().getWMcat73Pe8090m();
	}


	/**
	 *	Returns String value of wMcat73Pe8090m
	 *	@return wMcat73Pe8090m
	 */
	public char[]  getWMcat73Pe8090mString() throws CFException {
	     return String.valueOf(section.getWMcat7bPe8090m().getWMcat73Pe8090mString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcat73Pe8090mIsNumeric()  throws CFException{
	    return section.getWMcat7bPe8090m().wMcat73Pe8090mIsNumeric();
	}

	/**
	 * 	Update WMcat73Pe8090m with the passed value
	 *	@param number
	 */
	public void setWMcat73Pe8090m(int number)  throws CFException{
		section.getWMcat7bPe8090m().setWMcat73Pe8090m(number);
	}
	

	public void setWMcat73Pe8090m(long number)  throws CFException{
	    section.getWMcat7bPe8090m().setWMcat73Pe8090m(number);
	}
	
	
	/**
	 * 	Update WMcat73Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcat73Pe8090m(char[] value)  throws CFException {
		section.getWMcat7bPe8090m().setWMcat73Pe8090m(value);
	}
	
	/**
	 * 	Update WMcat73Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcat73Pe8090mString(char[] value)  throws CFException{
		section.getWMcat7bPe8090m().setWMcat73Pe8090m(value);
	}	

	/**
	 *	Returns the value of wMcat7bPe8090m
	 *	@return wMcat7bPe8090m
	 */   
	 public WMcat7bPe8090m getWMcat7bPe8090m() {
   	return section.getWMcat7bPe8090m();
   }

   /**
	* 	Update WMcat7bPe8090m with the passed value
	*	@param value
	*/
   public void setWMcat7bPe8090m(char[] value) throws CFException {
      section.setWMcat7bPe8090m(value);
   }   

     /**
	 * 	Update WMcat7bPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat7bPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcat7bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat7bPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7bPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat7bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat7bPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat7bPe8090m(Field source) {
   	section.setWMcat7bPe8090m(source);
   }  
   
     /**
	 * 	Update WMcat7bPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat7bPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcat7bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat7bPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7bPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat7bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wTmaFpfPe8090m
	 *	@return wTmaFpfPe8090m
	 */
	public int getWTmaFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTmaFpfPe8090m();
	}
	
	/**
	 * 	Update WTmaFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m(number);
	}


	public void setWTmaFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcmFpfPe8090m
	 *	@return wNcmFpfPe8090m
	 */
	public int getWNcmFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNcmFpfPe8090m();
	}
	
	/**
	 * 	Update WNcmFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcmFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m(number);
	}


	public void setWNcmFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNupFpfPe8090m
	 *	@return wNupFpfPe8090m
	 */
	public int getWNupFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNupFpfPe8090m();
	}
	
	/**
	 * 	Update WNupFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNupFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m(number);
	}


	public void setWNupFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMcat7Pe8090m
	 *	@return wMcat7Pe8090m
	 */   
	 public WMcat7Pe8090m getWMcat7Pe8090m() {
   	return section.getWMcat7Pe8090m();
   }

   /**
	* 	Update WMcat7Pe8090m with the passed value
	*	@param value
	*/
   public void setWMcat7Pe8090m(char[] value) throws CFException {
      section.setWMcat7Pe8090m(value);
   }   

     /**
	 * 	Update WMcat7Pe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat7Pe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcat7Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat7Pe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat7Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat7Pe8090m with another Field
	 *	@param value
	 */
   public void setWMcat7Pe8090m(Field source) {
   	section.setWMcat7Pe8090m(source);
   }  
   
     /**
	 * 	Update WMcat7Pe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat7Pe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcat7Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat7Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat7Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcat72Pe8090m
	 *	@return wMcat72Pe8090m
	 */
	public int getWMcat72Pe8090m() throws CFException {
   		return section.getWMcat7aPe8090m().getWMcat72Pe8090m();
	}


	/**
	 *	Returns String value of wMcat72Pe8090m
	 *	@return wMcat72Pe8090m
	 */
	public char[]  getWMcat72Pe8090mString() throws CFException {
	     return String.valueOf(section.getWMcat7aPe8090m().getWMcat72Pe8090mString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcat72Pe8090mIsNumeric()  throws CFException{
	    return section.getWMcat7aPe8090m().wMcat72Pe8090mIsNumeric();
	}

	/**
	 * 	Update WMcat72Pe8090m with the passed value
	 *	@param number
	 */
	public void setWMcat72Pe8090m(int number)  throws CFException{
		section.getWMcat7aPe8090m().setWMcat72Pe8090m(number);
	}
	

	public void setWMcat72Pe8090m(long number)  throws CFException{
	    section.getWMcat7aPe8090m().setWMcat72Pe8090m(number);
	}
	
	
	/**
	 * 	Update WMcat72Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcat72Pe8090m(char[] value)  throws CFException {
		section.getWMcat7aPe8090m().setWMcat72Pe8090m(value);
	}
	
	/**
	 * 	Update WMcat72Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcat72Pe8090mString(char[] value)  throws CFException{
		section.getWMcat7aPe8090m().setWMcat72Pe8090m(value);
	}	


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public CatPe8090mOutCtx clone() {
        CatPe8090mOutCtx cloneObj = new CatPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public CatPe8090mOutCtx getCatPe8090mOutCtx() {
            return new CatPe8090mOutCtx();
    }
     public class CasPe8090mInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wMcas7aPe8090m
	 *	@return wMcas7aPe8090m
	 */   
	 public WMcas7aPe8090m getWMcas7aPe8090m() {
   	return section.getWMcas7aPe8090m();
   }

   /**
	* 	Update WMcas7aPe8090m with the passed value
	*	@param value
	*/
   public void setWMcas7aPe8090m(char[] value) throws CFException {
      section.setWMcas7aPe8090m(value);
   }   

     /**
	 * 	Update WMcas7aPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas7aPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcas7aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas7aPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7aPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas7aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas7aPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas7aPe8090m(Field source) {
   	section.setWMcas7aPe8090m(source);
   }  
   
     /**
	 * 	Update WMcas7aPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas7aPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcas7aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas7aPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7aPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas7aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcas7Pe8090m
	 *	@return wMcas7Pe8090m
	 */   
	 public WMcas7Pe8090m getWMcas7Pe8090m() {
   	return section.getWMcas7Pe8090m();
   }

   /**
	* 	Update WMcas7Pe8090m with the passed value
	*	@param value
	*/
   public void setWMcas7Pe8090m(char[] value) throws CFException {
      section.setWMcas7Pe8090m(value);
   }   

     /**
	 * 	Update WMcas7Pe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas7Pe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcas7Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas7Pe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas7Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas7Pe8090m with another Field
	 *	@param value
	 */
   public void setWMcas7Pe8090m(Field source) {
   	section.setWMcas7Pe8090m(source);
   }  
   
     /**
	 * 	Update WMcas7Pe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas7Pe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcas7Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas7Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas7Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcas7bPe8090m
	 *	@return wMcas7bPe8090m
	 */   
	 public WMcas7bPe8090m getWMcas7bPe8090m() {
   	return section.getWMcas7bPe8090m();
   }

   /**
	* 	Update WMcas7bPe8090m with the passed value
	*	@param value
	*/
   public void setWMcas7bPe8090m(char[] value) throws CFException {
      section.setWMcas7bPe8090m(value);
   }   

     /**
	 * 	Update WMcas7bPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas7bPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcas7bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas7bPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7bPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas7bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas7bPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas7bPe8090m(Field source) {
   	section.setWMcas7bPe8090m(source);
   }  
   
     /**
	 * 	Update WMcas7bPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas7bPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcas7bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas7bPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7bPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas7bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNupFpfPe8090m
	 *	@return wNupFpfPe8090m
	 */
	public int getWNupFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNupFpfPe8090m();
	}
	
	/**
	 * 	Update WNupFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNupFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m(number);
	}


	public void setWNupFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public CasPe8090mOutCtx getCasPe8090mOutCtx() {
            return new CasPe8090mOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public CasPe8090mInCtx clone() {
        CasPe8090mInCtx cloneObj = new CasPe8090mInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public CasPe8090mInCtx getCasPe8090mInCtx() {
            return new CasPe8090mInCtx();
    }
     public class CasPe8090mOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wMcas7pPe8090m
	 *	@return wMcas7pPe8090m
	 */
   public char[] getWMcas7pPe8090m() throws CFException  {              
   		return section.getWMcas7Pe8090m().getWMcas7pPe8090m();
   }

  
	/**
	*  set variable wMcas7pPe8090m
	*  @param value
	**/
   public void setWMcas7pPe8090m(char[] value) throws CFException {
      section.getWMcas7Pe8090m().setWMcas7pPe8090m(value);
   } 

     /**
	 * 	Update WMcas7pPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMcas7pPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWMcas7Pe8090m().setWMcas7pPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMcas7pPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWMcas7Pe8090m().setWMcas7pPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas7pPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7pPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWMcas7Pe8090m().setWMcas7pPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas7pPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas7pPe8090m(Field source) {
      section.getWMcas7Pe8090m().setWMcas7pPe8090m(source);
   }  
   
     /**
	 * 	Update WMcas7pPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMcas7pPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWMcas7Pe8090m().setWMcas7pPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMcas7pPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7pPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWMcas7Pe8090m().setWMcas7pPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMasFpfPe8090m
	 *	@return wMasFpfPe8090m
	 */
   public char[] getWMasFpfPe8090m() throws CFException  {              
   		return section.getWZonFpfPe8090m().getWMasFpfPe8090m();
   }

  
	/**
	*  set variable wMasFpfPe8090m
	*  @param value
	**/
   public void setWMasFpfPe8090m(char[] value) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(value);
   } 

     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasFpfPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasFpfPe8090m with another Field
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source);
   }  
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcas72Pe8090m
	 *	@return wMcas72Pe8090m
	 */
	public int getWMcas72Pe8090m() throws CFException {
   		return section.getWMcas7aPe8090m().getWMcas72Pe8090m();
	}


	/**
	 *	Returns String value of wMcas72Pe8090m
	 *	@return wMcas72Pe8090m
	 */
	public char[]  getWMcas72Pe8090mString() throws CFException {
	     return String.valueOf(section.getWMcas7aPe8090m().getWMcas72Pe8090mString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcas72Pe8090mIsNumeric()  throws CFException{
	    return section.getWMcas7aPe8090m().wMcas72Pe8090mIsNumeric();
	}

	/**
	 * 	Update WMcas72Pe8090m with the passed value
	 *	@param number
	 */
	public void setWMcas72Pe8090m(int number)  throws CFException{
		section.getWMcas7aPe8090m().setWMcas72Pe8090m(number);
	}
	

	public void setWMcas72Pe8090m(long number)  throws CFException{
	    section.getWMcas7aPe8090m().setWMcas72Pe8090m(number);
	}
	
	
	/**
	 * 	Update WMcas72Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcas72Pe8090m(char[] value)  throws CFException {
		section.getWMcas7aPe8090m().setWMcas72Pe8090m(value);
	}
	
	/**
	 * 	Update WMcas72Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcas72Pe8090mString(char[] value)  throws CFException{
		section.getWMcas7aPe8090m().setWMcas72Pe8090m(value);
	}	

	/**
	 *	Returns the value of wTmaFpfPe8090m
	 *	@return wTmaFpfPe8090m
	 */
	public int getWTmaFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTmaFpfPe8090m();
	}
	
	/**
	 * 	Update WTmaFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m(number);
	}


	public void setWTmaFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMcas71Pe8090m
	 *	@return wMcas71Pe8090m
	 */
	public int getWMcas71Pe8090m() throws CFException {
   		return section.getWMcas7Pe8090m().getWMcas71Pe8090m();
	}


	/**
	 *	Returns String value of wMcas71Pe8090m
	 *	@return wMcas71Pe8090m
	 */
	public char[]  getWMcas71Pe8090mString() throws CFException {
	     return String.valueOf(section.getWMcas7Pe8090m().getWMcas71Pe8090mString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcas71Pe8090mIsNumeric()  throws CFException{
	    return section.getWMcas7Pe8090m().wMcas71Pe8090mIsNumeric();
	}

	/**
	 * 	Update WMcas71Pe8090m with the passed value
	 *	@param number
	 */
	public void setWMcas71Pe8090m(int number)  throws CFException{
		section.getWMcas7Pe8090m().setWMcas71Pe8090m(number);
	}
	

	public void setWMcas71Pe8090m(long number)  throws CFException{
	    section.getWMcas7Pe8090m().setWMcas71Pe8090m(number);
	}
	
	
	/**
	 * 	Update WMcas71Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcas71Pe8090m(char[] value)  throws CFException {
		section.getWMcas7Pe8090m().setWMcas71Pe8090m(value);
	}
	
	/**
	 * 	Update WMcas71Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcas71Pe8090mString(char[] value)  throws CFException{
		section.getWMcas7Pe8090m().setWMcas71Pe8090m(value);
	}	

	/**
	 *	Returns the value of wNcmFpfPe8090m
	 *	@return wNcmFpfPe8090m
	 */
	public int getWNcmFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNcmFpfPe8090m();
	}
	
	/**
	 * 	Update WNcmFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcmFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m(number);
	}


	public void setWNcmFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMcas7aPe8090m
	 *	@return wMcas7aPe8090m
	 */   
	 public WMcas7aPe8090m getWMcas7aPe8090m() {
   	return section.getWMcas7aPe8090m();
   }

   /**
	* 	Update WMcas7aPe8090m with the passed value
	*	@param value
	*/
   public void setWMcas7aPe8090m(char[] value) throws CFException {
      section.setWMcas7aPe8090m(value);
   }   

     /**
	 * 	Update WMcas7aPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas7aPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcas7aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas7aPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7aPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas7aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas7aPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas7aPe8090m(Field source) {
   	section.setWMcas7aPe8090m(source);
   }  
   
     /**
	 * 	Update WMcas7aPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas7aPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcas7aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas7aPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7aPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas7aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcas7Pe8090m
	 *	@return wMcas7Pe8090m
	 */   
	 public WMcas7Pe8090m getWMcas7Pe8090m() {
   	return section.getWMcas7Pe8090m();
   }

   /**
	* 	Update WMcas7Pe8090m with the passed value
	*	@param value
	*/
   public void setWMcas7Pe8090m(char[] value) throws CFException {
      section.setWMcas7Pe8090m(value);
   }   

     /**
	 * 	Update WMcas7Pe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas7Pe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcas7Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas7Pe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas7Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas7Pe8090m with another Field
	 *	@param value
	 */
   public void setWMcas7Pe8090m(Field source) {
   	section.setWMcas7Pe8090m(source);
   }  
   
     /**
	 * 	Update WMcas7Pe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas7Pe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcas7Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas7Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas7Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcas7bPe8090m
	 *	@return wMcas7bPe8090m
	 */   
	 public WMcas7bPe8090m getWMcas7bPe8090m() {
   	return section.getWMcas7bPe8090m();
   }

   /**
	* 	Update WMcas7bPe8090m with the passed value
	*	@param value
	*/
   public void setWMcas7bPe8090m(char[] value) throws CFException {
      section.setWMcas7bPe8090m(value);
   }   

     /**
	 * 	Update WMcas7bPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas7bPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcas7bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas7bPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7bPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas7bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas7bPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas7bPe8090m(Field source) {
   	section.setWMcas7bPe8090m(source);
   }  
   
     /**
	 * 	Update WMcas7bPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas7bPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcas7bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas7bPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7bPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas7bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNupFpfPe8090m
	 *	@return wNupFpfPe8090m
	 */
	public int getWNupFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNupFpfPe8090m();
	}
	
	/**
	 * 	Update WNupFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNupFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m(number);
	}


	public void setWNupFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMcas73Pe8090m
	 *	@return wMcas73Pe8090m
	 */
	public int getWMcas73Pe8090m() throws CFException {
   		return section.getWMcas7bPe8090m().getWMcas73Pe8090m();
	}


	/**
	 *	Returns String value of wMcas73Pe8090m
	 *	@return wMcas73Pe8090m
	 */
	public char[]  getWMcas73Pe8090mString() throws CFException {
	     return String.valueOf(section.getWMcas7bPe8090m().getWMcas73Pe8090mString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcas73Pe8090mIsNumeric()  throws CFException{
	    return section.getWMcas7bPe8090m().wMcas73Pe8090mIsNumeric();
	}

	/**
	 * 	Update WMcas73Pe8090m with the passed value
	 *	@param number
	 */
	public void setWMcas73Pe8090m(int number)  throws CFException{
		section.getWMcas7bPe8090m().setWMcas73Pe8090m(number);
	}
	

	public void setWMcas73Pe8090m(long number)  throws CFException{
	    section.getWMcas7bPe8090m().setWMcas73Pe8090m(number);
	}
	
	
	/**
	 * 	Update WMcas73Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcas73Pe8090m(char[] value)  throws CFException {
		section.getWMcas7bPe8090m().setWMcas73Pe8090m(value);
	}
	
	/**
	 * 	Update WMcas73Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcas73Pe8090mString(char[] value)  throws CFException{
		section.getWMcas7bPe8090m().setWMcas73Pe8090m(value);
	}	


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public CasPe8090mOutCtx clone() {
        CasPe8090mOutCtx cloneObj = new CasPe8090mOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public CasPe8090mOutCtx getCasPe8090mOutCtx() {
            return new CasPe8090mOutCtx();
    }
     public class CatPe8090mMAS3InCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wMcat3Pe8090m
	 *	@return wMcat3Pe8090m
	 */   
	 public WMcat3Pe8090m getWMcat3Pe8090m() {
   	return section.getWMcat3Pe8090m();
   }

   /**
	* 	Update WMcat3Pe8090m with the passed value
	*	@param value
	*/
   public void setWMcat3Pe8090m(char[] value) throws CFException {
      section.setWMcat3Pe8090m(value);
   }   

     /**
	 * 	Update WMcat3Pe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat3Pe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcat3Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat3Pe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat3Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat3Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat3Pe8090m with another Field
	 *	@param value
	 */
   public void setWMcat3Pe8090m(Field source) {
   	section.setWMcat3Pe8090m(source);
   }  
   
     /**
	 * 	Update WMcat3Pe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat3Pe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcat3Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat3Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat3Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat3Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcat3bPe8090m
	 *	@return wMcat3bPe8090m
	 */   
	 public WMcat3bPe8090m getWMcat3bPe8090m() {
   	return section.getWMcat3bPe8090m();
   }

   /**
	* 	Update WMcat3bPe8090m with the passed value
	*	@param value
	*/
   public void setWMcat3bPe8090m(char[] value) throws CFException {
      section.setWMcat3bPe8090m(value);
   }   

     /**
	 * 	Update WMcat3bPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat3bPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcat3bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat3bPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat3bPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat3bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat3bPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat3bPe8090m(Field source) {
   	section.setWMcat3bPe8090m(source);
   }  
   
     /**
	 * 	Update WMcat3bPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat3bPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcat3bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat3bPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat3bPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat3bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNupFpfPe8090m
	 *	@return wNupFpfPe8090m
	 */
	public int getWNupFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNupFpfPe8090m();
	}
	
	/**
	 * 	Update WNupFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNupFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m(number);
	}


	public void setWNupFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMcat3aPe8090m
	 *	@return wMcat3aPe8090m
	 */   
	 public WMcat3aPe8090m getWMcat3aPe8090m() {
   	return section.getWMcat3aPe8090m();
   }

   /**
	* 	Update WMcat3aPe8090m with the passed value
	*	@param value
	*/
   public void setWMcat3aPe8090m(char[] value) throws CFException {
      section.setWMcat3aPe8090m(value);
   }   

     /**
	 * 	Update WMcat3aPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat3aPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcat3aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat3aPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat3aPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat3aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat3aPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat3aPe8090m(Field source) {
   	section.setWMcat3aPe8090m(source);
   }  
   
     /**
	 * 	Update WMcat3aPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat3aPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcat3aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat3aPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat3aPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat3aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public CatPe8090mMAS3OutCtx getCatPe8090mMAS3OutCtx() {
            return new CatPe8090mMAS3OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public CatPe8090mMAS3InCtx clone() {
        CatPe8090mMAS3InCtx cloneObj = new CatPe8090mMAS3InCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public CatPe8090mMAS3InCtx getCatPe8090mMAS3InCtx() {
            return new CatPe8090mMAS3InCtx();
    }
     public class CatPe8090mMAS3OutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wMcat32Pe8090m
	 *	@return wMcat32Pe8090m
	 */
	public int getWMcat32Pe8090m() throws CFException {
   		return section.getWMcat3aPe8090m().getWMcat32Pe8090m();
	}


	/**
	 *	Returns String value of wMcat32Pe8090m
	 *	@return wMcat32Pe8090m
	 */
	public char[]  getWMcat32Pe8090mString() throws CFException {
	     return String.valueOf(section.getWMcat3aPe8090m().getWMcat32Pe8090mString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcat32Pe8090mIsNumeric()  throws CFException{
	    return section.getWMcat3aPe8090m().wMcat32Pe8090mIsNumeric();
	}

	/**
	 * 	Update WMcat32Pe8090m with the passed value
	 *	@param number
	 */
	public void setWMcat32Pe8090m(int number)  throws CFException{
		section.getWMcat3aPe8090m().setWMcat32Pe8090m(number);
	}
	

	public void setWMcat32Pe8090m(long number)  throws CFException{
	    section.getWMcat3aPe8090m().setWMcat32Pe8090m(number);
	}
	
	
	/**
	 * 	Update WMcat32Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcat32Pe8090m(char[] value)  throws CFException {
		section.getWMcat3aPe8090m().setWMcat32Pe8090m(value);
	}
	
	/**
	 * 	Update WMcat32Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcat32Pe8090mString(char[] value)  throws CFException{
		section.getWMcat3aPe8090m().setWMcat32Pe8090m(value);
	}	

	/**
	 *	Returns the value of wMasFpfPe8090m
	 *	@return wMasFpfPe8090m
	 */
   public char[] getWMasFpfPe8090m() throws CFException  {              
   		return section.getWZonFpfPe8090m().getWMasFpfPe8090m();
   }

  
	/**
	*  set variable wMasFpfPe8090m
	*  @param value
	**/
   public void setWMasFpfPe8090m(char[] value) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(value);
   } 

     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasFpfPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasFpfPe8090m with another Field
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source);
   }  
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcat33Pe8090m
	 *	@return wMcat33Pe8090m
	 */
	public int getWMcat33Pe8090m() throws CFException {
   		return section.getWMcat3bPe8090m().getWMcat33Pe8090m();
	}


	/**
	 *	Returns String value of wMcat33Pe8090m
	 *	@return wMcat33Pe8090m
	 */
	public char[]  getWMcat33Pe8090mString() throws CFException {
	     return String.valueOf(section.getWMcat3bPe8090m().getWMcat33Pe8090mString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcat33Pe8090mIsNumeric()  throws CFException{
	    return section.getWMcat3bPe8090m().wMcat33Pe8090mIsNumeric();
	}

	/**
	 * 	Update WMcat33Pe8090m with the passed value
	 *	@param number
	 */
	public void setWMcat33Pe8090m(int number)  throws CFException{
		section.getWMcat3bPe8090m().setWMcat33Pe8090m(number);
	}
	

	public void setWMcat33Pe8090m(long number)  throws CFException{
	    section.getWMcat3bPe8090m().setWMcat33Pe8090m(number);
	}
	
	
	/**
	 * 	Update WMcat33Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcat33Pe8090m(char[] value)  throws CFException {
		section.getWMcat3bPe8090m().setWMcat33Pe8090m(value);
	}
	
	/**
	 * 	Update WMcat33Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcat33Pe8090mString(char[] value)  throws CFException{
		section.getWMcat3bPe8090m().setWMcat33Pe8090m(value);
	}	

	/**
	 *	Returns the value of wTmaFpfPe8090m
	 *	@return wTmaFpfPe8090m
	 */
	public int getWTmaFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTmaFpfPe8090m();
	}
	
	/**
	 * 	Update WTmaFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m(number);
	}


	public void setWTmaFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMcat31Pe8090m
	 *	@return wMcat31Pe8090m
	 */
	public int getWMcat31Pe8090m() throws CFException {
   		return section.getWMcat3Pe8090m().getWMcat31Pe8090m();
	}


	/**
	 *	Returns String value of wMcat31Pe8090m
	 *	@return wMcat31Pe8090m
	 */
	public char[]  getWMcat31Pe8090mString() throws CFException {
	     return String.valueOf(section.getWMcat3Pe8090m().getWMcat31Pe8090mString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcat31Pe8090mIsNumeric()  throws CFException{
	    return section.getWMcat3Pe8090m().wMcat31Pe8090mIsNumeric();
	}

	/**
	 * 	Update WMcat31Pe8090m with the passed value
	 *	@param number
	 */
	public void setWMcat31Pe8090m(int number)  throws CFException{
		section.getWMcat3Pe8090m().setWMcat31Pe8090m(number);
	}
	

	public void setWMcat31Pe8090m(long number)  throws CFException{
	    section.getWMcat3Pe8090m().setWMcat31Pe8090m(number);
	}
	
	
	/**
	 * 	Update WMcat31Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcat31Pe8090m(char[] value)  throws CFException {
		section.getWMcat3Pe8090m().setWMcat31Pe8090m(value);
	}
	
	/**
	 * 	Update WMcat31Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcat31Pe8090mString(char[] value)  throws CFException{
		section.getWMcat3Pe8090m().setWMcat31Pe8090m(value);
	}	

	/**
	 *	Returns the value of wMcat3Pe8090m
	 *	@return wMcat3Pe8090m
	 */   
	 public WMcat3Pe8090m getWMcat3Pe8090m() {
   	return section.getWMcat3Pe8090m();
   }

   /**
	* 	Update WMcat3Pe8090m with the passed value
	*	@param value
	*/
   public void setWMcat3Pe8090m(char[] value) throws CFException {
      section.setWMcat3Pe8090m(value);
   }   

     /**
	 * 	Update WMcat3Pe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat3Pe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcat3Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat3Pe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat3Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat3Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat3Pe8090m with another Field
	 *	@param value
	 */
   public void setWMcat3Pe8090m(Field source) {
   	section.setWMcat3Pe8090m(source);
   }  
   
     /**
	 * 	Update WMcat3Pe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat3Pe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcat3Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat3Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat3Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat3Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNcmFpfPe8090m
	 *	@return wNcmFpfPe8090m
	 */
	public int getWNcmFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNcmFpfPe8090m();
	}
	
	/**
	 * 	Update WNcmFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcmFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m(number);
	}


	public void setWNcmFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMcat3bPe8090m
	 *	@return wMcat3bPe8090m
	 */   
	 public WMcat3bPe8090m getWMcat3bPe8090m() {
   	return section.getWMcat3bPe8090m();
   }

   /**
	* 	Update WMcat3bPe8090m with the passed value
	*	@param value
	*/
   public void setWMcat3bPe8090m(char[] value) throws CFException {
      section.setWMcat3bPe8090m(value);
   }   

     /**
	 * 	Update WMcat3bPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat3bPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcat3bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat3bPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat3bPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat3bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat3bPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat3bPe8090m(Field source) {
   	section.setWMcat3bPe8090m(source);
   }  
   
     /**
	 * 	Update WMcat3bPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat3bPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcat3bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat3bPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat3bPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat3bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNupFpfPe8090m
	 *	@return wNupFpfPe8090m
	 */
	public int getWNupFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNupFpfPe8090m();
	}
	
	/**
	 * 	Update WNupFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNupFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m(number);
	}


	public void setWNupFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMcat3aPe8090m
	 *	@return wMcat3aPe8090m
	 */   
	 public WMcat3aPe8090m getWMcat3aPe8090m() {
   	return section.getWMcat3aPe8090m();
   }

   /**
	* 	Update WMcat3aPe8090m with the passed value
	*	@param value
	*/
   public void setWMcat3aPe8090m(char[] value) throws CFException {
      section.setWMcat3aPe8090m(value);
   }   

     /**
	 * 	Update WMcat3aPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat3aPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcat3aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat3aPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat3aPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat3aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat3aPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat3aPe8090m(Field source) {
   	section.setWMcat3aPe8090m(source);
   }  
   
     /**
	 * 	Update WMcat3aPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat3aPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcat3aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat3aPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat3aPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat3aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public CatPe8090mMAS3OutCtx clone() {
        CatPe8090mMAS3OutCtx cloneObj = new CatPe8090mMAS3OutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public CatPe8090mMAS3OutCtx getCatPe8090mMAS3OutCtx() {
            return new CatPe8090mMAS3OutCtx();
    }
     public class CasPe8090mMAS3InCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wMcas3Pe8090m
	 *	@return wMcas3Pe8090m
	 */   
	 public WMcas3Pe8090m getWMcas3Pe8090m() {
   	return section.getWMcas3Pe8090m();
   }

   /**
	* 	Update WMcas3Pe8090m with the passed value
	*	@param value
	*/
   public void setWMcas3Pe8090m(char[] value) throws CFException {
      section.setWMcas3Pe8090m(value);
   }   

     /**
	 * 	Update WMcas3Pe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas3Pe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcas3Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas3Pe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas3Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas3Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas3Pe8090m with another Field
	 *	@param value
	 */
   public void setWMcas3Pe8090m(Field source) {
   	section.setWMcas3Pe8090m(source);
   }  
   
     /**
	 * 	Update WMcas3Pe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas3Pe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcas3Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas3Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas3Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas3Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcas3aPe8090m
	 *	@return wMcas3aPe8090m
	 */   
	 public WMcas3aPe8090m getWMcas3aPe8090m() {
   	return section.getWMcas3aPe8090m();
   }

   /**
	* 	Update WMcas3aPe8090m with the passed value
	*	@param value
	*/
   public void setWMcas3aPe8090m(char[] value) throws CFException {
      section.setWMcas3aPe8090m(value);
   }   

     /**
	 * 	Update WMcas3aPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas3aPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcas3aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas3aPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas3aPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas3aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas3aPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas3aPe8090m(Field source) {
   	section.setWMcas3aPe8090m(source);
   }  
   
     /**
	 * 	Update WMcas3aPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas3aPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcas3aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas3aPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas3aPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas3aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcas3bPe8090m
	 *	@return wMcas3bPe8090m
	 */   
	 public WMcas3bPe8090m getWMcas3bPe8090m() {
   	return section.getWMcas3bPe8090m();
   }

   /**
	* 	Update WMcas3bPe8090m with the passed value
	*	@param value
	*/
   public void setWMcas3bPe8090m(char[] value) throws CFException {
      section.setWMcas3bPe8090m(value);
   }   

     /**
	 * 	Update WMcas3bPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas3bPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcas3bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas3bPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas3bPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas3bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas3bPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas3bPe8090m(Field source) {
   	section.setWMcas3bPe8090m(source);
   }  
   
     /**
	 * 	Update WMcas3bPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas3bPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcas3bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas3bPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas3bPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas3bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNupFpfPe8090m
	 *	@return wNupFpfPe8090m
	 */
	public int getWNupFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNupFpfPe8090m();
	}
	
	/**
	 * 	Update WNupFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNupFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m(number);
	}


	public void setWNupFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public CasPe8090mMAS3OutCtx getCasPe8090mMAS3OutCtx() {
            return new CasPe8090mMAS3OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public CasPe8090mMAS3InCtx clone() {
        CasPe8090mMAS3InCtx cloneObj = new CasPe8090mMAS3InCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public CasPe8090mMAS3InCtx getCasPe8090mMAS3InCtx() {
            return new CasPe8090mMAS3InCtx();
    }
     public class CasPe8090mMAS3OutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wMcas33Pe8090m
	 *	@return wMcas33Pe8090m
	 */
	public int getWMcas33Pe8090m() throws CFException {
   		return section.getWMcas3bPe8090m().getWMcas33Pe8090m();
	}


	/**
	 *	Returns String value of wMcas33Pe8090m
	 *	@return wMcas33Pe8090m
	 */
	public char[]  getWMcas33Pe8090mString() throws CFException {
	     return String.valueOf(section.getWMcas3bPe8090m().getWMcas33Pe8090mString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcas33Pe8090mIsNumeric()  throws CFException{
	    return section.getWMcas3bPe8090m().wMcas33Pe8090mIsNumeric();
	}

	/**
	 * 	Update WMcas33Pe8090m with the passed value
	 *	@param number
	 */
	public void setWMcas33Pe8090m(int number)  throws CFException{
		section.getWMcas3bPe8090m().setWMcas33Pe8090m(number);
	}
	

	public void setWMcas33Pe8090m(long number)  throws CFException{
	    section.getWMcas3bPe8090m().setWMcas33Pe8090m(number);
	}
	
	
	/**
	 * 	Update WMcas33Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcas33Pe8090m(char[] value)  throws CFException {
		section.getWMcas3bPe8090m().setWMcas33Pe8090m(value);
	}
	
	/**
	 * 	Update WMcas33Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcas33Pe8090mString(char[] value)  throws CFException{
		section.getWMcas3bPe8090m().setWMcas33Pe8090m(value);
	}	

	/**
	 *	Returns the value of wMasFpfPe8090m
	 *	@return wMasFpfPe8090m
	 */
   public char[] getWMasFpfPe8090m() throws CFException  {              
   		return section.getWZonFpfPe8090m().getWMasFpfPe8090m();
   }

  
	/**
	*  set variable wMasFpfPe8090m
	*  @param value
	**/
   public void setWMasFpfPe8090m(char[] value) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(value);
   } 

     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasFpfPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasFpfPe8090m with another Field
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source);
   }  
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcas31Pe8090m
	 *	@return wMcas31Pe8090m
	 */
	public int getWMcas31Pe8090m() throws CFException {
   		return section.getWMcas3Pe8090m().getWMcas31Pe8090m();
	}


	/**
	 *	Returns String value of wMcas31Pe8090m
	 *	@return wMcas31Pe8090m
	 */
	public char[]  getWMcas31Pe8090mString() throws CFException {
	     return String.valueOf(section.getWMcas3Pe8090m().getWMcas31Pe8090mString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcas31Pe8090mIsNumeric()  throws CFException{
	    return section.getWMcas3Pe8090m().wMcas31Pe8090mIsNumeric();
	}

	/**
	 * 	Update WMcas31Pe8090m with the passed value
	 *	@param number
	 */
	public void setWMcas31Pe8090m(int number)  throws CFException{
		section.getWMcas3Pe8090m().setWMcas31Pe8090m(number);
	}
	

	public void setWMcas31Pe8090m(long number)  throws CFException{
	    section.getWMcas3Pe8090m().setWMcas31Pe8090m(number);
	}
	
	
	/**
	 * 	Update WMcas31Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcas31Pe8090m(char[] value)  throws CFException {
		section.getWMcas3Pe8090m().setWMcas31Pe8090m(value);
	}
	
	/**
	 * 	Update WMcas31Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcas31Pe8090mString(char[] value)  throws CFException{
		section.getWMcas3Pe8090m().setWMcas31Pe8090m(value);
	}	

	/**
	 *	Returns the value of wMcas3Pe8090m
	 *	@return wMcas3Pe8090m
	 */   
	 public WMcas3Pe8090m getWMcas3Pe8090m() {
   	return section.getWMcas3Pe8090m();
   }

   /**
	* 	Update WMcas3Pe8090m with the passed value
	*	@param value
	*/
   public void setWMcas3Pe8090m(char[] value) throws CFException {
      section.setWMcas3Pe8090m(value);
   }   

     /**
	 * 	Update WMcas3Pe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas3Pe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcas3Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas3Pe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas3Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas3Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas3Pe8090m with another Field
	 *	@param value
	 */
   public void setWMcas3Pe8090m(Field source) {
   	section.setWMcas3Pe8090m(source);
   }  
   
     /**
	 * 	Update WMcas3Pe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas3Pe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcas3Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas3Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas3Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas3Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wTmaFpfPe8090m
	 *	@return wTmaFpfPe8090m
	 */
	public int getWTmaFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTmaFpfPe8090m();
	}
	
	/**
	 * 	Update WTmaFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m(number);
	}


	public void setWTmaFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcmFpfPe8090m
	 *	@return wNcmFpfPe8090m
	 */
	public int getWNcmFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNcmFpfPe8090m();
	}
	
	/**
	 * 	Update WNcmFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcmFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m(number);
	}


	public void setWNcmFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMcas32Pe8090m
	 *	@return wMcas32Pe8090m
	 */
	public int getWMcas32Pe8090m() throws CFException {
   		return section.getWMcas3aPe8090m().getWMcas32Pe8090m();
	}


	/**
	 *	Returns String value of wMcas32Pe8090m
	 *	@return wMcas32Pe8090m
	 */
	public char[]  getWMcas32Pe8090mString() throws CFException {
	     return String.valueOf(section.getWMcas3aPe8090m().getWMcas32Pe8090mString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcas32Pe8090mIsNumeric()  throws CFException{
	    return section.getWMcas3aPe8090m().wMcas32Pe8090mIsNumeric();
	}

	/**
	 * 	Update WMcas32Pe8090m with the passed value
	 *	@param number
	 */
	public void setWMcas32Pe8090m(int number)  throws CFException{
		section.getWMcas3aPe8090m().setWMcas32Pe8090m(number);
	}
	

	public void setWMcas32Pe8090m(long number)  throws CFException{
	    section.getWMcas3aPe8090m().setWMcas32Pe8090m(number);
	}
	
	
	/**
	 * 	Update WMcas32Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcas32Pe8090m(char[] value)  throws CFException {
		section.getWMcas3aPe8090m().setWMcas32Pe8090m(value);
	}
	
	/**
	 * 	Update WMcas32Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcas32Pe8090mString(char[] value)  throws CFException{
		section.getWMcas3aPe8090m().setWMcas32Pe8090m(value);
	}	

	/**
	 *	Returns the value of wMcas3aPe8090m
	 *	@return wMcas3aPe8090m
	 */   
	 public WMcas3aPe8090m getWMcas3aPe8090m() {
   	return section.getWMcas3aPe8090m();
   }

   /**
	* 	Update WMcas3aPe8090m with the passed value
	*	@param value
	*/
   public void setWMcas3aPe8090m(char[] value) throws CFException {
      section.setWMcas3aPe8090m(value);
   }   

     /**
	 * 	Update WMcas3aPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas3aPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcas3aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas3aPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas3aPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas3aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas3aPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas3aPe8090m(Field source) {
   	section.setWMcas3aPe8090m(source);
   }  
   
     /**
	 * 	Update WMcas3aPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas3aPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcas3aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas3aPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas3aPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas3aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcas3bPe8090m
	 *	@return wMcas3bPe8090m
	 */   
	 public WMcas3bPe8090m getWMcas3bPe8090m() {
   	return section.getWMcas3bPe8090m();
   }

   /**
	* 	Update WMcas3bPe8090m with the passed value
	*	@param value
	*/
   public void setWMcas3bPe8090m(char[] value) throws CFException {
      section.setWMcas3bPe8090m(value);
   }   

     /**
	 * 	Update WMcas3bPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas3bPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcas3bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas3bPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas3bPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas3bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas3bPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas3bPe8090m(Field source) {
   	section.setWMcas3bPe8090m(source);
   }  
   
     /**
	 * 	Update WMcas3bPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas3bPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcas3bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas3bPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas3bPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas3bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNupFpfPe8090m
	 *	@return wNupFpfPe8090m
	 */
	public int getWNupFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNupFpfPe8090m();
	}
	
	/**
	 * 	Update WNupFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNupFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m(number);
	}


	public void setWNupFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public CasPe8090mMAS3OutCtx clone() {
        CasPe8090mMAS3OutCtx cloneObj = new CasPe8090mMAS3OutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public CasPe8090mMAS3OutCtx getCasPe8090mMAS3OutCtx() {
            return new CasPe8090mMAS3OutCtx();
    }
     public class CatPe8090mMAS6InCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wMcat6aPe8090m
	 *	@return wMcat6aPe8090m
	 */   
	 public WMcat6aPe8090m getWMcat6aPe8090m() {
   	return section.getWMcat6aPe8090m();
   }

   /**
	* 	Update WMcat6aPe8090m with the passed value
	*	@param value
	*/
   public void setWMcat6aPe8090m(char[] value) throws CFException {
      section.setWMcat6aPe8090m(value);
   }   

     /**
	 * 	Update WMcat6aPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat6aPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcat6aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat6aPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6aPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat6aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat6aPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat6aPe8090m(Field source) {
   	section.setWMcat6aPe8090m(source);
   }  
   
     /**
	 * 	Update WMcat6aPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat6aPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcat6aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat6aPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6aPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat6aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcat6Pe8090m
	 *	@return wMcat6Pe8090m
	 */   
	 public WMcat6Pe8090m getWMcat6Pe8090m() {
   	return section.getWMcat6Pe8090m();
   }

   /**
	* 	Update WMcat6Pe8090m with the passed value
	*	@param value
	*/
   public void setWMcat6Pe8090m(char[] value) throws CFException {
      section.setWMcat6Pe8090m(value);
   }   

     /**
	 * 	Update WMcat6Pe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat6Pe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcat6Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat6Pe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat6Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat6Pe8090m with another Field
	 *	@param value
	 */
   public void setWMcat6Pe8090m(Field source) {
   	section.setWMcat6Pe8090m(source);
   }  
   
     /**
	 * 	Update WMcat6Pe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat6Pe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcat6Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat6Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat6Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcat6bPe8090m
	 *	@return wMcat6bPe8090m
	 */   
	 public WMcat6bPe8090m getWMcat6bPe8090m() {
   	return section.getWMcat6bPe8090m();
   }

   /**
	* 	Update WMcat6bPe8090m with the passed value
	*	@param value
	*/
   public void setWMcat6bPe8090m(char[] value) throws CFException {
      section.setWMcat6bPe8090m(value);
   }   

     /**
	 * 	Update WMcat6bPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat6bPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcat6bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat6bPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6bPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat6bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat6bPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat6bPe8090m(Field source) {
   	section.setWMcat6bPe8090m(source);
   }  
   
     /**
	 * 	Update WMcat6bPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat6bPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcat6bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat6bPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6bPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat6bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNupFpfPe8090m
	 *	@return wNupFpfPe8090m
	 */
	public int getWNupFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNupFpfPe8090m();
	}
	
	/**
	 * 	Update WNupFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNupFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m(number);
	}


	public void setWNupFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public CatPe8090mMAS6OutCtx getCatPe8090mMAS6OutCtx() {
            return new CatPe8090mMAS6OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public CatPe8090mMAS6InCtx clone() {
        CatPe8090mMAS6InCtx cloneObj = new CatPe8090mMAS6InCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public CatPe8090mMAS6InCtx getCatPe8090mMAS6InCtx() {
            return new CatPe8090mMAS6InCtx();
    }
     public class CatPe8090mMAS6OutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wMcat62Pe8090m
	 *	@return wMcat62Pe8090m
	 */
	public int getWMcat62Pe8090m() throws CFException {
   		return section.getWMcat6aPe8090m().getWMcat62Pe8090m();
	}


	/**
	 *	Returns String value of wMcat62Pe8090m
	 *	@return wMcat62Pe8090m
	 */
	public char[]  getWMcat62Pe8090mString() throws CFException {
	     return String.valueOf(section.getWMcat6aPe8090m().getWMcat62Pe8090mString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcat62Pe8090mIsNumeric()  throws CFException{
	    return section.getWMcat6aPe8090m().wMcat62Pe8090mIsNumeric();
	}

	/**
	 * 	Update WMcat62Pe8090m with the passed value
	 *	@param number
	 */
	public void setWMcat62Pe8090m(int number)  throws CFException{
		section.getWMcat6aPe8090m().setWMcat62Pe8090m(number);
	}
	

	public void setWMcat62Pe8090m(long number)  throws CFException{
	    section.getWMcat6aPe8090m().setWMcat62Pe8090m(number);
	}
	
	
	/**
	 * 	Update WMcat62Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcat62Pe8090m(char[] value)  throws CFException {
		section.getWMcat6aPe8090m().setWMcat62Pe8090m(value);
	}
	
	/**
	 * 	Update WMcat62Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcat62Pe8090mString(char[] value)  throws CFException{
		section.getWMcat6aPe8090m().setWMcat62Pe8090m(value);
	}	

	/**
	 *	Returns the value of wMasFpfPe8090m
	 *	@return wMasFpfPe8090m
	 */
   public char[] getWMasFpfPe8090m() throws CFException  {              
   		return section.getWZonFpfPe8090m().getWMasFpfPe8090m();
   }

  
	/**
	*  set variable wMasFpfPe8090m
	*  @param value
	**/
   public void setWMasFpfPe8090m(char[] value) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(value);
   } 

     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasFpfPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasFpfPe8090m with another Field
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source);
   }  
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcat6aPe8090m
	 *	@return wMcat6aPe8090m
	 */   
	 public WMcat6aPe8090m getWMcat6aPe8090m() {
   	return section.getWMcat6aPe8090m();
   }

   /**
	* 	Update WMcat6aPe8090m with the passed value
	*	@param value
	*/
   public void setWMcat6aPe8090m(char[] value) throws CFException {
      section.setWMcat6aPe8090m(value);
   }   

     /**
	 * 	Update WMcat6aPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat6aPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcat6aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat6aPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6aPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat6aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat6aPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat6aPe8090m(Field source) {
   	section.setWMcat6aPe8090m(source);
   }  
   
     /**
	 * 	Update WMcat6aPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat6aPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcat6aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat6aPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6aPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat6aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcat61Pe8090m
	 *	@return wMcat61Pe8090m
	 */
	public int getWMcat61Pe8090m() throws CFException {
   		return section.getWMcat6Pe8090m().getWMcat61Pe8090m();
	}


	/**
	 *	Returns String value of wMcat61Pe8090m
	 *	@return wMcat61Pe8090m
	 */
	public char[]  getWMcat61Pe8090mString() throws CFException {
	     return String.valueOf(section.getWMcat6Pe8090m().getWMcat61Pe8090mString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcat61Pe8090mIsNumeric()  throws CFException{
	    return section.getWMcat6Pe8090m().wMcat61Pe8090mIsNumeric();
	}

	/**
	 * 	Update WMcat61Pe8090m with the passed value
	 *	@param number
	 */
	public void setWMcat61Pe8090m(int number)  throws CFException{
		section.getWMcat6Pe8090m().setWMcat61Pe8090m(number);
	}
	

	public void setWMcat61Pe8090m(long number)  throws CFException{
	    section.getWMcat6Pe8090m().setWMcat61Pe8090m(number);
	}
	
	
	/**
	 * 	Update WMcat61Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcat61Pe8090m(char[] value)  throws CFException {
		section.getWMcat6Pe8090m().setWMcat61Pe8090m(value);
	}
	
	/**
	 * 	Update WMcat61Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcat61Pe8090mString(char[] value)  throws CFException{
		section.getWMcat6Pe8090m().setWMcat61Pe8090m(value);
	}	

	/**
	 *	Returns the value of wMcat6Pe8090m
	 *	@return wMcat6Pe8090m
	 */   
	 public WMcat6Pe8090m getWMcat6Pe8090m() {
   	return section.getWMcat6Pe8090m();
   }

   /**
	* 	Update WMcat6Pe8090m with the passed value
	*	@param value
	*/
   public void setWMcat6Pe8090m(char[] value) throws CFException {
      section.setWMcat6Pe8090m(value);
   }   

     /**
	 * 	Update WMcat6Pe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat6Pe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcat6Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat6Pe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat6Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat6Pe8090m with another Field
	 *	@param value
	 */
   public void setWMcat6Pe8090m(Field source) {
   	section.setWMcat6Pe8090m(source);
   }  
   
     /**
	 * 	Update WMcat6Pe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat6Pe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcat6Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat6Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat6Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcat6pPe8090m
	 *	@return wMcat6pPe8090m
	 */
   public char[] getWMcat6pPe8090m() throws CFException  {              
   		return section.getWMcat6Pe8090m().getWMcat6pPe8090m();
   }

  
	/**
	*  set variable wMcat6pPe8090m
	*  @param value
	**/
   public void setWMcat6pPe8090m(char[] value) throws CFException {
      section.getWMcat6Pe8090m().setWMcat6pPe8090m(value);
   } 

     /**
	 * 	Update WMcat6pPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMcat6pPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWMcat6Pe8090m().setWMcat6pPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMcat6pPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWMcat6Pe8090m().setWMcat6pPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat6pPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6pPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWMcat6Pe8090m().setWMcat6pPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat6pPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat6pPe8090m(Field source) {
      section.getWMcat6Pe8090m().setWMcat6pPe8090m(source);
   }  
   
     /**
	 * 	Update WMcat6pPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMcat6pPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWMcat6Pe8090m().setWMcat6pPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMcat6pPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6pPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWMcat6Pe8090m().setWMcat6pPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wTmaFpfPe8090m
	 *	@return wTmaFpfPe8090m
	 */
	public int getWTmaFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTmaFpfPe8090m();
	}
	
	/**
	 * 	Update WTmaFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m(number);
	}


	public void setWTmaFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMcat63Pe8090m
	 *	@return wMcat63Pe8090m
	 */
	public int getWMcat63Pe8090m() throws CFException {
   		return section.getWMcat6bPe8090m().getWMcat63Pe8090m();
	}


	/**
	 *	Returns String value of wMcat63Pe8090m
	 *	@return wMcat63Pe8090m
	 */
	public char[]  getWMcat63Pe8090mString() throws CFException {
	     return String.valueOf(section.getWMcat6bPe8090m().getWMcat63Pe8090mString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcat63Pe8090mIsNumeric()  throws CFException{
	    return section.getWMcat6bPe8090m().wMcat63Pe8090mIsNumeric();
	}

	/**
	 * 	Update WMcat63Pe8090m with the passed value
	 *	@param number
	 */
	public void setWMcat63Pe8090m(int number)  throws CFException{
		section.getWMcat6bPe8090m().setWMcat63Pe8090m(number);
	}
	

	public void setWMcat63Pe8090m(long number)  throws CFException{
	    section.getWMcat6bPe8090m().setWMcat63Pe8090m(number);
	}
	
	
	/**
	 * 	Update WMcat63Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcat63Pe8090m(char[] value)  throws CFException {
		section.getWMcat6bPe8090m().setWMcat63Pe8090m(value);
	}
	
	/**
	 * 	Update WMcat63Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcat63Pe8090mString(char[] value)  throws CFException{
		section.getWMcat6bPe8090m().setWMcat63Pe8090m(value);
	}	

	/**
	 *	Returns the value of wNcmFpfPe8090m
	 *	@return wNcmFpfPe8090m
	 */
	public int getWNcmFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNcmFpfPe8090m();
	}
	
	/**
	 * 	Update WNcmFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcmFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m(number);
	}


	public void setWNcmFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMcat6bPe8090m
	 *	@return wMcat6bPe8090m
	 */   
	 public WMcat6bPe8090m getWMcat6bPe8090m() {
   	return section.getWMcat6bPe8090m();
   }

   /**
	* 	Update WMcat6bPe8090m with the passed value
	*	@param value
	*/
   public void setWMcat6bPe8090m(char[] value) throws CFException {
      section.setWMcat6bPe8090m(value);
   }   

     /**
	 * 	Update WMcat6bPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat6bPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcat6bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat6bPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6bPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat6bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcat6bPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat6bPe8090m(Field source) {
   	section.setWMcat6bPe8090m(source);
   }  
   
     /**
	 * 	Update WMcat6bPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat6bPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcat6bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcat6bPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6bPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcat6bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNupFpfPe8090m
	 *	@return wNupFpfPe8090m
	 */
	public int getWNupFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNupFpfPe8090m();
	}
	
	/**
	 * 	Update WNupFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNupFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m(number);
	}


	public void setWNupFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m((int)number);
	}



        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public CatPe8090mMAS6OutCtx clone() {
        CatPe8090mMAS6OutCtx cloneObj = new CatPe8090mMAS6OutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public CatPe8090mMAS6OutCtx getCatPe8090mMAS6OutCtx() {
            return new CatPe8090mMAS6OutCtx();
    }
     public class CasPe8090mMAS6InCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wMcas6aPe8090m
	 *	@return wMcas6aPe8090m
	 */   
	 public WMcas6aPe8090m getWMcas6aPe8090m() {
   	return section.getWMcas6aPe8090m();
   }

   /**
	* 	Update WMcas6aPe8090m with the passed value
	*	@param value
	*/
   public void setWMcas6aPe8090m(char[] value) throws CFException {
      section.setWMcas6aPe8090m(value);
   }   

     /**
	 * 	Update WMcas6aPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas6aPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcas6aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas6aPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6aPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas6aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas6aPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas6aPe8090m(Field source) {
   	section.setWMcas6aPe8090m(source);
   }  
   
     /**
	 * 	Update WMcas6aPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas6aPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcas6aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas6aPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6aPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas6aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcas6Pe8090m
	 *	@return wMcas6Pe8090m
	 */   
	 public WMcas6Pe8090m getWMcas6Pe8090m() {
   	return section.getWMcas6Pe8090m();
   }

   /**
	* 	Update WMcas6Pe8090m with the passed value
	*	@param value
	*/
   public void setWMcas6Pe8090m(char[] value) throws CFException {
      section.setWMcas6Pe8090m(value);
   }   

     /**
	 * 	Update WMcas6Pe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas6Pe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcas6Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas6Pe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas6Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas6Pe8090m with another Field
	 *	@param value
	 */
   public void setWMcas6Pe8090m(Field source) {
   	section.setWMcas6Pe8090m(source);
   }  
   
     /**
	 * 	Update WMcas6Pe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas6Pe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcas6Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas6Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas6Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wNupFpfPe8090m
	 *	@return wNupFpfPe8090m
	 */
	public int getWNupFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNupFpfPe8090m();
	}
	
	/**
	 * 	Update WNupFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNupFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m(number);
	}


	public void setWNupFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMcas6bPe8090m
	 *	@return wMcas6bPe8090m
	 */   
	 public WMcas6bPe8090m getWMcas6bPe8090m() {
   	return section.getWMcas6bPe8090m();
   }

   /**
	* 	Update WMcas6bPe8090m with the passed value
	*	@param value
	*/
   public void setWMcas6bPe8090m(char[] value) throws CFException {
      section.setWMcas6bPe8090m(value);
   }   

     /**
	 * 	Update WMcas6bPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas6bPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcas6bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas6bPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6bPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas6bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas6bPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas6bPe8090m(Field source) {
   	section.setWMcas6bPe8090m(source);
   }  
   
     /**
	 * 	Update WMcas6bPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas6bPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcas6bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas6bPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6bPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas6bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public CasPe8090mMAS6OutCtx getCasPe8090mMAS6OutCtx() {
            return new CasPe8090mMAS6OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public CasPe8090mMAS6InCtx clone() {
        CasPe8090mMAS6InCtx cloneObj = new CasPe8090mMAS6InCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public CasPe8090mMAS6InCtx getCasPe8090mMAS6InCtx() {
            return new CasPe8090mMAS6InCtx();
    }
     public class CasPe8090mMAS6OutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wMcas63Pe8090m
	 *	@return wMcas63Pe8090m
	 */
	public int getWMcas63Pe8090m() throws CFException {
   		return section.getWMcas6bPe8090m().getWMcas63Pe8090m();
	}


	/**
	 *	Returns String value of wMcas63Pe8090m
	 *	@return wMcas63Pe8090m
	 */
	public char[]  getWMcas63Pe8090mString() throws CFException {
	     return String.valueOf(section.getWMcas6bPe8090m().getWMcas63Pe8090mString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcas63Pe8090mIsNumeric()  throws CFException{
	    return section.getWMcas6bPe8090m().wMcas63Pe8090mIsNumeric();
	}

	/**
	 * 	Update WMcas63Pe8090m with the passed value
	 *	@param number
	 */
	public void setWMcas63Pe8090m(int number)  throws CFException{
		section.getWMcas6bPe8090m().setWMcas63Pe8090m(number);
	}
	

	public void setWMcas63Pe8090m(long number)  throws CFException{
	    section.getWMcas6bPe8090m().setWMcas63Pe8090m(number);
	}
	
	
	/**
	 * 	Update WMcas63Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcas63Pe8090m(char[] value)  throws CFException {
		section.getWMcas6bPe8090m().setWMcas63Pe8090m(value);
	}
	
	/**
	 * 	Update WMcas63Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcas63Pe8090mString(char[] value)  throws CFException{
		section.getWMcas6bPe8090m().setWMcas63Pe8090m(value);
	}	

	/**
	 *	Returns the value of wMcas6pPe8090m
	 *	@return wMcas6pPe8090m
	 */
   public char[] getWMcas6pPe8090m() throws CFException  {              
   		return section.getWMcas6Pe8090m().getWMcas6pPe8090m();
   }

  
	/**
	*  set variable wMcas6pPe8090m
	*  @param value
	**/
   public void setWMcas6pPe8090m(char[] value) throws CFException {
      section.getWMcas6Pe8090m().setWMcas6pPe8090m(value);
   } 

     /**
	 * 	Update WMcas6pPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMcas6pPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWMcas6Pe8090m().setWMcas6pPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMcas6pPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWMcas6Pe8090m().setWMcas6pPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas6pPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6pPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWMcas6Pe8090m().setWMcas6pPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas6pPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas6pPe8090m(Field source) {
      section.getWMcas6Pe8090m().setWMcas6pPe8090m(source);
   }  
   
     /**
	 * 	Update WMcas6pPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMcas6pPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWMcas6Pe8090m().setWMcas6pPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMcas6pPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6pPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWMcas6Pe8090m().setWMcas6pPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcas62Pe8090m
	 *	@return wMcas62Pe8090m
	 */
	public int getWMcas62Pe8090m() throws CFException {
   		return section.getWMcas6aPe8090m().getWMcas62Pe8090m();
	}


	/**
	 *	Returns String value of wMcas62Pe8090m
	 *	@return wMcas62Pe8090m
	 */
	public char[]  getWMcas62Pe8090mString() throws CFException {
	     return String.valueOf(section.getWMcas6aPe8090m().getWMcas62Pe8090mString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcas62Pe8090mIsNumeric()  throws CFException{
	    return section.getWMcas6aPe8090m().wMcas62Pe8090mIsNumeric();
	}

	/**
	 * 	Update WMcas62Pe8090m with the passed value
	 *	@param number
	 */
	public void setWMcas62Pe8090m(int number)  throws CFException{
		section.getWMcas6aPe8090m().setWMcas62Pe8090m(number);
	}
	

	public void setWMcas62Pe8090m(long number)  throws CFException{
	    section.getWMcas6aPe8090m().setWMcas62Pe8090m(number);
	}
	
	
	/**
	 * 	Update WMcas62Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcas62Pe8090m(char[] value)  throws CFException {
		section.getWMcas6aPe8090m().setWMcas62Pe8090m(value);
	}
	
	/**
	 * 	Update WMcas62Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcas62Pe8090mString(char[] value)  throws CFException{
		section.getWMcas6aPe8090m().setWMcas62Pe8090m(value);
	}	

	/**
	 *	Returns the value of wMasFpfPe8090m
	 *	@return wMasFpfPe8090m
	 */
   public char[] getWMasFpfPe8090m() throws CFException  {              
   		return section.getWZonFpfPe8090m().getWMasFpfPe8090m();
   }

  
	/**
	*  set variable wMasFpfPe8090m
	*  @param value
	**/
   public void setWMasFpfPe8090m(char[] value) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(value);
   } 

     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex) throws CFException {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex);
   	
   }
   
   public void setWMasFpfPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMasFpfPe8090m with another Field
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source);
   }  
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.getWZonFpfPe8090m().setWMasFpfPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcas6aPe8090m
	 *	@return wMcas6aPe8090m
	 */   
	 public WMcas6aPe8090m getWMcas6aPe8090m() {
   	return section.getWMcas6aPe8090m();
   }

   /**
	* 	Update WMcas6aPe8090m with the passed value
	*	@param value
	*/
   public void setWMcas6aPe8090m(char[] value) throws CFException {
      section.setWMcas6aPe8090m(value);
   }   

     /**
	 * 	Update WMcas6aPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas6aPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcas6aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas6aPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6aPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas6aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas6aPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas6aPe8090m(Field source) {
   	section.setWMcas6aPe8090m(source);
   }  
   
     /**
	 * 	Update WMcas6aPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas6aPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcas6aPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas6aPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6aPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas6aPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMcas6Pe8090m
	 *	@return wMcas6Pe8090m
	 */   
	 public WMcas6Pe8090m getWMcas6Pe8090m() {
   	return section.getWMcas6Pe8090m();
   }

   /**
	* 	Update WMcas6Pe8090m with the passed value
	*	@param value
	*/
   public void setWMcas6Pe8090m(char[] value) throws CFException {
      section.setWMcas6Pe8090m(value);
   }   

     /**
	 * 	Update WMcas6Pe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas6Pe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcas6Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas6Pe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas6Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas6Pe8090m with another Field
	 *	@param value
	 */
   public void setWMcas6Pe8090m(Field source) {
   	section.setWMcas6Pe8090m(source);
   }  
   
     /**
	 * 	Update WMcas6Pe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas6Pe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcas6Pe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas6Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas6Pe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wTmaFpfPe8090m
	 *	@return wTmaFpfPe8090m
	 */
	public int getWTmaFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWTmaFpfPe8090m();
	}
	
	/**
	 * 	Update WTmaFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWTmaFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m(number);
	}


	public void setWTmaFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWTmaFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wNcmFpfPe8090m
	 *	@return wNcmFpfPe8090m
	 */
	public int getWNcmFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNcmFpfPe8090m();
	}
	
	/**
	 * 	Update WNcmFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNcmFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m(number);
	}


	public void setWNcmFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNcmFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMcas61Pe8090m
	 *	@return wMcas61Pe8090m
	 */
	public int getWMcas61Pe8090m() throws CFException {
   		return section.getWMcas6Pe8090m().getWMcas61Pe8090m();
	}


	/**
	 *	Returns String value of wMcas61Pe8090m
	 *	@return wMcas61Pe8090m
	 */
	public char[]  getWMcas61Pe8090mString() throws CFException {
	     return String.valueOf(section.getWMcas6Pe8090m().getWMcas61Pe8090mString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcas61Pe8090mIsNumeric()  throws CFException{
	    return section.getWMcas6Pe8090m().wMcas61Pe8090mIsNumeric();
	}

	/**
	 * 	Update WMcas61Pe8090m with the passed value
	 *	@param number
	 */
	public void setWMcas61Pe8090m(int number)  throws CFException{
		section.getWMcas6Pe8090m().setWMcas61Pe8090m(number);
	}
	

	public void setWMcas61Pe8090m(long number)  throws CFException{
	    section.getWMcas6Pe8090m().setWMcas61Pe8090m(number);
	}
	
	
	/**
	 * 	Update WMcas61Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcas61Pe8090m(char[] value)  throws CFException {
		section.getWMcas6Pe8090m().setWMcas61Pe8090m(value);
	}
	
	/**
	 * 	Update WMcas61Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcas61Pe8090mString(char[] value)  throws CFException{
		section.getWMcas6Pe8090m().setWMcas61Pe8090m(value);
	}	

	/**
	 *	Returns the value of wNupFpfPe8090m
	 *	@return wNupFpfPe8090m
	 */
	public int getWNupFpfPe8090m() throws CFException {        
   		return section.getWZonFpfPe8090m().getWNupFpfPe8090m();
	}
	
	/**
	 * 	Update WNupFpfPe8090m with the passed value
	 *	@param number
	 */
	public void setWNupFpfPe8090m(int number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m(number);
	}


	public void setWNupFpfPe8090m(long number)  throws CFException{
		section.getWZonFpfPe8090m().setWNupFpfPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMcas6bPe8090m
	 *	@return wMcas6bPe8090m
	 */   
	 public WMcas6bPe8090m getWMcas6bPe8090m() {
   	return section.getWMcas6bPe8090m();
   }

   /**
	* 	Update WMcas6bPe8090m with the passed value
	*	@param value
	*/
   public void setWMcas6bPe8090m(char[] value) throws CFException {
      section.setWMcas6bPe8090m(value);
   }   

     /**
	 * 	Update WMcas6bPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas6bPe8090m(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	section.setWMcas6bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas6bPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6bPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas6bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WMcas6bPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas6bPe8090m(Field source) {
   	section.setWMcas6bPe8090m(source);
   }  
   
     /**
	 * 	Update WMcas6bPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas6bPe8090m(Field source, int sourceIndex,int sourceLen) {
   	section.setWMcas6bPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WMcas6bPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6bPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	section.setWMcas6bPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public CasPe8090mMAS6OutCtx clone() {
        CasPe8090mMAS6OutCtx cloneObj = new CasPe8090mMAS6OutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public CasPe8090mMAS6OutCtx getCasPe8090mMAS6OutCtx() {
            return new CasPe8090mMAS6OutCtx();
    }
     public class PartirTituloInCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wLonSegTitu
	 *	@return wLonSegTitu
	 */
	public int getWLonSegTitu() throws CFException {        
   		return section.getWLonSegTitu();
	}
	
	/**
	 * 	Update WLonSegTitu with the passed value
	 *	@param number
	 */
	public void setWLonSegTitu(int number)  throws CFException{
		section.setWLonSegTitu(number);
	}


	public void setWLonSegTitu(long number)  throws CFException{
		section.setWLonSegTitu((int)number);
	}


	/**
	 *	Returns the value of wLonPriTitu
	 *	@return wLonPriTitu
	 */
	public int getWLonPriTitu() throws CFException {        
   		return section.getWLonPriTitu();
	}
	
	/**
	 * 	Update WLonPriTitu with the passed value
	 *	@param number
	 */
	public void setWLonPriTitu(int number)  throws CFException{
		section.setWLonPriTitu(number);
	}


	public void setWLonPriTitu(long number)  throws CFException{
		section.setWLonPriTitu((int)number);
	}


	/**
	 *	Returns the value of wTotTit
	 *	@return wTotTit
	 */
	public int getWTotTit() throws CFException {        
   		return section.getWTotTit();
	}
	
	/**
	 * 	Update WTotTit with the passed value
	 *	@param number
	 */
	public void setWTotTit(int number)  throws CFException{
		section.setWTotTit(number);
	}


	public void setWTotTit(long number)  throws CFException{
		section.setWTotTit((int)number);
	}


	/**
	 *	Returns the value of wSegTitu
	 *	@return wSegTitu
	 */
   public char[] getWSegTitu() throws CFException  {              
   		return section.getWSegTitu();
   }

  
	/**
	*  set variable wSegTitu
	*  @param value
	**/
   public void setWSegTitu(char[] value) throws CFException {
      section.setWSegTitu(value);
   } 

     /**
	 * 	Update WSegTitu 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWSegTitu(char[] source, int sourceIndex) throws CFException {
      section.setWSegTitu(source, sourceIndex);
   	
   }
   
   public void setWSegTitu(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWSegTitu(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WSegTitu 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWSegTitu(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWSegTitu(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WSegTitu with another Field
	 *	@param value
	 */
   public void setWSegTitu(Field source) {
      section.setWSegTitu(source);
   }  
   
     /**
	 * 	Update WSegTitu 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWSegTitu(Field source, int sourceIndex,int sourceLen) {
      section.setWSegTitu(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WSegTitu 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWSegTitu(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWSegTitu(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPriTitu
	 *	@return wPriTitu
	 */
   public char[] getWPriTitu() throws CFException  {              
   		return section.getWPriTitu();
   }

  
	/**
	*  set variable wPriTitu
	*  @param value
	**/
   public void setWPriTitu(char[] value) throws CFException {
      section.setWPriTitu(value);
   } 

     /**
	 * 	Update WPriTitu 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPriTitu(char[] source, int sourceIndex) throws CFException {
      section.setWPriTitu(source, sourceIndex);
   	
   }
   
   public void setWPriTitu(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWPriTitu(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WPriTitu 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPriTitu(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWPriTitu(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WPriTitu with another Field
	 *	@param value
	 */
   public void setWPriTitu(Field source) {
      section.setWPriTitu(source);
   }  
   
     /**
	 * 	Update WPriTitu 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPriTitu(Field source, int sourceIndex,int sourceLen) {
      section.setWPriTitu(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WPriTitu 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPriTitu(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWPriTitu(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public PartirTituloOutCtx getPartirTituloOutCtx() {
            return new PartirTituloOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public PartirTituloInCtx clone() {
        PartirTituloInCtx cloneObj = new PartirTituloInCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public PartirTituloInCtx getPartirTituloInCtx() {
            return new PartirTituloInCtx();
    }
     public class PartirTituloOutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();

	/**
	 *	Returns the value of wSegTitu
	 *	@return wSegTitu
	 */
   public char[] getWSegTitu() throws CFException  {              
   		return section.getWSegTitu();
   }

  
	/**
	*  set variable wSegTitu
	*  @param value
	**/
   public void setWSegTitu(char[] value) throws CFException {
      section.setWSegTitu(value);
   } 

     /**
	 * 	Update WSegTitu 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWSegTitu(char[] source, int sourceIndex) throws CFException {
      section.setWSegTitu(source, sourceIndex);
   	
   }
   
   public void setWSegTitu(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWSegTitu(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WSegTitu 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWSegTitu(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWSegTitu(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WSegTitu with another Field
	 *	@param value
	 */
   public void setWSegTitu(Field source) {
      section.setWSegTitu(source);
   }  
   
     /**
	 * 	Update WSegTitu 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWSegTitu(Field source, int sourceIndex,int sourceLen) {
      section.setWSegTitu(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WSegTitu 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWSegTitu(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWSegTitu(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wSegTroPe8090m
	 *	@return wSegTroPe8090m
	 */
   public char[] getWSegTroPe8090m() throws CFException  {              
   		return section.getWSegTroPe8090m();
   }

  
	/**
	*  set variable wSegTroPe8090m
	*  @param value
	**/
   public void setWSegTroPe8090m(char[] value) throws CFException {
      section.setWSegTroPe8090m(value);
   } 

     /**
	 * 	Update WSegTroPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWSegTroPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWSegTroPe8090m(source, sourceIndex);
   	
   }
   
   public void setWSegTroPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWSegTroPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WSegTroPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWSegTroPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWSegTroPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WSegTroPe8090m with another Field
	 *	@param value
	 */
   public void setWSegTroPe8090m(Field source) {
      section.setWSegTroPe8090m(source);
   }  
   
     /**
	 * 	Update WSegTroPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWSegTroPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWSegTroPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WSegTroPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWSegTroPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWSegTroPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPriTitu
	 *	@return wPriTitu
	 */
   public char[] getWPriTitu() throws CFException  {              
   		return section.getWPriTitu();
   }

  
	/**
	*  set variable wPriTitu
	*  @param value
	**/
   public void setWPriTitu(char[] value) throws CFException {
      section.setWPriTitu(value);
   } 

     /**
	 * 	Update WPriTitu 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPriTitu(char[] source, int sourceIndex) throws CFException {
      section.setWPriTitu(source, sourceIndex);
   	
   }
   
   public void setWPriTitu(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWPriTitu(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WPriTitu 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPriTitu(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWPriTitu(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WPriTitu with another Field
	 *	@param value
	 */
   public void setWPriTitu(Field source) {
      section.setWPriTitu(source);
   }  
   
     /**
	 * 	Update WPriTitu 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPriTitu(Field source, int sourceIndex,int sourceLen) {
      section.setWPriTitu(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WPriTitu 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPriTitu(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWPriTitu(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPriTroPe8090m
	 *	@return wPriTroPe8090m
	 */
   public char[] getWPriTroPe8090m() throws CFException  {              
   		return section.getWPriTroPe8090m();
   }

  
	/**
	*  set variable wPriTroPe8090m
	*  @param value
	**/
   public void setWPriTroPe8090m(char[] value) throws CFException {
      section.setWPriTroPe8090m(value);
   } 

     /**
	 * 	Update WPriTroPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPriTroPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWPriTroPe8090m(source, sourceIndex);
   	
   }
   
   public void setWPriTroPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWPriTroPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WPriTroPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPriTroPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWPriTroPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WPriTroPe8090m with another Field
	 *	@param value
	 */
   public void setWPriTroPe8090m(Field source) {
      section.setWPriTroPe8090m(source);
   }  
   
     /**
	 * 	Update WPriTroPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPriTroPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWPriTroPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WPriTroPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPriTroPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWPriTroPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
       return str.hashCode();
    }

    public PartirTituloOutCtx clone() {
        PartirTituloOutCtx cloneObj = new PartirTituloOutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        return cloneObj;
    }

    }

    public PartirTituloOutCtx getPartirTituloOutCtx() {
            return new PartirTituloOutCtx();
    }
     public class MonitoraInCtx implements Cloneable {
     WtabPartGroup wtabPartGroup = Bm8090mCtx.this.getWtabPartGroup();
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wTitCtaPe8090m
	 *	@return wTitCtaPe8090m
	 */
   public char[] getWTitCtaPe8090m() throws CFException  {              
   		return section.getWTitCtaPe8090m();
   }

  
	/**
	*  set variable wTitCtaPe8090m
	*  @param value
	**/
   public void setWTitCtaPe8090m(char[] value) throws CFException {
      section.setWTitCtaPe8090m(value);
   } 

     /**
	 * 	Update WTitCtaPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitCtaPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWTitCtaPe8090m(source, sourceIndex);
   	
   }
   
   public void setWTitCtaPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitCtaPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WTitCtaPe8090m with another Field
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source) {
      section.setWTitCtaPe8090m(source);
   }  
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public MonitoraOutCtx getMonitoraOutCtx() {
            return new MonitoraOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wtabPartGroup.hashCode();
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MonitoraInCtx clone() {
        MonitoraInCtx cloneObj = new MonitoraInCtx();
        cloneObj.wtabPartGroup = new WtabPartGroup();
        cloneObj.wtabPartGroup.set(wtabPartGroup.getClonedField());
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MonitoraInCtx getMonitoraInCtx() {
            return new MonitoraInCtx();
    }
     public class MonitoraOutCtx implements Cloneable {
     WtabPartGroup wtabPartGroup = Bm8090mCtx.this.getWtabPartGroup();
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

public int getWcntNcar() throws CFException {  
        return work.getWcntNcar();
}
	/**
	 * 	Update WcntNcar with the passed value
	 *	@param number
	 */
	public void setWcntNcar(int number)  throws CFException{
		work.setWcntNcar(number);
	}


	public void setWcntNcar(long number)  throws CFException{
	    work.setWcntNcar(number);
	}
	

	/**
	 *	Returns the value of wTitCtaPe8090m
	 *	@return wTitCtaPe8090m
	 */
   public char[] getWTitCtaPe8090m() throws CFException  {              
   		return section.getWTitCtaPe8090m();
   }

  
	/**
	*  set variable wTitCtaPe8090m
	*  @param value
	**/
   public void setWTitCtaPe8090m(char[] value) throws CFException {
      section.setWTitCtaPe8090m(value);
   } 

     /**
	 * 	Update WTitCtaPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitCtaPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWTitCtaPe8090m(source, sourceIndex);
   	
   }
   
   public void setWTitCtaPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitCtaPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WTitCtaPe8090m with another Field
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source) {
      section.setWTitCtaPe8090m(source);
   }  
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getWpointAct() throws CFException {  
        return work.getWpointAct();
}
	/**
	 * 	Update WpointAct with the passed value
	 *	@param number
	 */
	public void setWpointAct(int number)  throws CFException{
		work.setWpointAct(number);
	}


	public void setWpointAct(long number)  throws CFException{
	    work.setWpointAct(number);
	}
	

public int getWguarCar() throws CFException {  
        return work.getWguarCar();
}
	/**
	 * 	Update WguarCar with the passed value
	 *	@param number
	 */
	public void setWguarCar(int number)  throws CFException{
		work.setWguarCar(number);
	}


	public void setWguarCar(long number)  throws CFException{
	    work.setWguarCar(number);
	}
	

	/**
	 *	Returns the value of nomP02Parti
	 *	@return nomP02Parti
	 */
   public char[] getNomP02Parti() throws CFException  {              
   		return work.getNomP02Parti();
   }

  
	/**
	*  set variable nomP02Parti
	*  @param value
	**/
   public void setNomP02Parti(char[] value) throws CFException {
      work.setNomP02Parti(value);
   } 

	/**
	 *	Returns the value of nomP01Parti
	 *	@return nomP01Parti
	 */
   public char[] getNomP01Parti() throws CFException  {              
   		return work.getNomP01Parti();
   }

  
	/**
	*  set variable nomP01Parti
	*  @param value
	**/
   public void setNomP01Parti(char[] value) throws CFException {
      work.setNomP01Parti(value);
   } 

public int getWswCarDiv() throws CFException {  
        return work.getWswCarDiv();
}
	/**
	 * 	Update WswCarDiv with the passed value
	 *	@param number
	 */
	public void setWswCarDiv(int number)  throws CFException{
		work.setWswCarDiv(number);
	}


	public void setWswCarDiv(long number)  throws CFException{
	    work.setWswCarDiv(number);
	}
	

public int getWpointAnt() throws CFException {  
        return work.getWpointAnt();
}
	/**
	 * 	Update WpointAnt with the passed value
	 *	@param number
	 */
	public void setWpointAnt(int number)  throws CFException{
		work.setWpointAnt(number);
	}


	public void setWpointAnt(long number)  throws CFException{
	    work.setWpointAnt(number);
	}
	

	/**
	 *	Returns the value of wresp
	 *	@return wresp
	 */
   public char[] getWresp() throws CFException  {              
   		return work.getWresp();
   }

  
	/**
	*  set variable wresp
	*  @param value
	**/
   public void setWresp(char[] value) throws CFException {
      work.setWresp(value);
   } 

public int getWcntString01() throws CFException {  
        return work.getWcntString01();
}
	/**
	 * 	Update WcntString01 with the passed value
	 *	@param number
	 */
	public void setWcntString01(int number)  throws CFException{
		work.setWcntString01(number);
	}


	public void setWcntString01(long number)  throws CFException{
	    work.setWcntString01(number);
	}
	

	/**
	 *	Returns the value of wtabPart
	 *	@return wtabPart
	 */
   public char[] getWtabPart() throws CFException  {              
   		return wtabPartGroup.getWtabPart();
   }

  
	/**
	*  set variable wtabPart
	*  @param value
	**/
   public void setWtabPart(char[] value) throws CFException {
      wtabPartGroup.setWtabPart(value);
   } 

     /**
	 * 	Update WtabPart 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWtabPart(char[] source, int sourceIndex) throws CFException {
      wtabPartGroup.setWtabPart(source, sourceIndex);
   	
   }
   
   public void setWtabPart(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wtabPartGroup.setWtabPart(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WtabPart 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWtabPart(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wtabPartGroup.setWtabPart(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WtabPart with another Field
	 *	@param value
	 */
   public void setWtabPart(Field source) {
      wtabPartGroup.setWtabPart(source);
   }  
   
     /**
	 * 	Update WtabPart 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWtabPart(Field source, int sourceIndex,int sourceLen) {
      wtabPartGroup.setWtabPart(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WtabPart 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWtabPart(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wtabPartGroup.setWtabPart(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getWcntNumTro() throws CFException {  
        return work.getWcntNumTro();
}
	/**
	 * 	Update WcntNumTro with the passed value
	 *	@param number
	 */
	public void setWcntNumTro(int number)  throws CFException{
		work.setWcntNumTro(number);
	}


	public void setWcntNumTro(long number)  throws CFException{
	    work.setWcntNumTro(number);
	}
	


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wtabPartGroup.hashCode();
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MonitoraOutCtx clone() {
        MonitoraOutCtx cloneObj = new MonitoraOutCtx();
        cloneObj.wtabPartGroup = new WtabPartGroup();
        cloneObj.wtabPartGroup.set(wtabPartGroup.getClonedField());
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MonitoraOutCtx getMonitoraOutCtx() {
            return new MonitoraOutCtx();
    }
     public class ParticionEntradaInCtx implements Cloneable {
     Work work = Bm8090mCtx.this.getWork();


public void setWPartIndex(int wPartIndex) { 
    Bm8090mCtx.this.wPartIndex = wPartIndex;
}

public int getWPartIndex() { 
    return Bm8090mCtx.this.wPartIndex;
}
public int getWguarCar() throws CFException {  
        return work.getWguarCar();
}
	/**
	 * 	Update WguarCar with the passed value
	 *	@param number
	 */
	public void setWguarCar(int number)  throws CFException{
		work.setWguarCar(number);
	}


	public void setWguarCar(long number)  throws CFException{
	    work.setWguarCar(number);
	}
	

	/**
	 *	Returns the value of llaTroParti
	 *	@return llaTroParti
	 */
	public int getLlaTroParti() throws CFException {
   		return work.getLlaTroParti();
	}


	/**
	 *	Returns String value of llaTroParti
	 *	@return llaTroParti
	 */
	public char[]  getLlaTroPartiString() throws CFException {
	     return String.valueOf(work.getLlaTroPartiString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean llaTroPartiIsNumeric()  throws CFException{
	    return work.llaTroPartiIsNumeric();
	}

	/**
	 * 	Update LlaTroParti with the passed value
	 *	@param number
	 */
	public void setLlaTroParti(int number)  throws CFException{
		work.setLlaTroParti(number);
	}
	

	public void setLlaTroParti(long number)  throws CFException{
	    work.setLlaTroParti(number);
	}
	
	
	/**
	 * 	Update LlaTroParti with the passed value
	 *	@param value (String or char[])
	 */
	public void setLlaTroParti(char[] value)  throws CFException {
		work.setLlaTroParti(value);
	}
	
	/**
	 * 	Update LlaTroParti with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLlaTroPartiString(char[] value)  throws CFException{
		work.setLlaTroParti(value);
	}	

public int getWswCarDiv() throws CFException {  
        return work.getWswCarDiv();
}
	/**
	 * 	Update WswCarDiv with the passed value
	 *	@param number
	 */
	public void setWswCarDiv(int number)  throws CFException{
		work.setWswCarDiv(number);
	}


	public void setWswCarDiv(long number)  throws CFException{
	    work.setWswCarDiv(number);
	}
	

public int getWpointAnt() throws CFException {  
        return work.getWpointAnt();
}
	/**
	 * 	Update WpointAnt with the passed value
	 *	@param number
	 */
	public void setWpointAnt(int number)  throws CFException{
		work.setWpointAnt(number);
	}


	public void setWpointAnt(long number)  throws CFException{
	    work.setWpointAnt(number);
	}
	


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public ParticionEntradaOutCtx getParticionEntradaOutCtx() {
            return new ParticionEntradaOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public ParticionEntradaInCtx clone() {
        ParticionEntradaInCtx cloneObj = new ParticionEntradaInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ParticionEntradaInCtx getParticionEntradaInCtx() {
            return new ParticionEntradaInCtx();
    }
     public class ParticionEntradaOutCtx implements Cloneable {
     Work work = Bm8090mCtx.this.getWork();

public int getWpointAct() throws CFException {  
        return work.getWpointAct();
}
	/**
	 * 	Update WpointAct with the passed value
	 *	@param number
	 */
	public void setWpointAct(int number)  throws CFException{
		work.setWpointAct(number);
	}


	public void setWpointAct(long number)  throws CFException{
	    work.setWpointAct(number);
	}
	


public void setWPartIndex(int wPartIndex) { 
    Bm8090mCtx.this.wPartIndex = wPartIndex;
}

public int getWPartIndex() { 
    return Bm8090mCtx.this.wPartIndex;
}
public int getWguarCar() throws CFException {  
        return work.getWguarCar();
}
	/**
	 * 	Update WguarCar with the passed value
	 *	@param number
	 */
	public void setWguarCar(int number)  throws CFException{
		work.setWguarCar(number);
	}


	public void setWguarCar(long number)  throws CFException{
	    work.setWguarCar(number);
	}
	

	/**
	 *	Returns the value of llaTroParti
	 *	@return llaTroParti
	 */
	public int getLlaTroParti() throws CFException {
   		return work.getLlaTroParti();
	}


	/**
	 *	Returns String value of llaTroParti
	 *	@return llaTroParti
	 */
	public char[]  getLlaTroPartiString() throws CFException {
	     return String.valueOf(work.getLlaTroPartiString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean llaTroPartiIsNumeric()  throws CFException{
	    return work.llaTroPartiIsNumeric();
	}

	/**
	 * 	Update LlaTroParti with the passed value
	 *	@param number
	 */
	public void setLlaTroParti(int number)  throws CFException{
		work.setLlaTroParti(number);
	}
	

	public void setLlaTroParti(long number)  throws CFException{
	    work.setLlaTroParti(number);
	}
	
	
	/**
	 * 	Update LlaTroParti with the passed value
	 *	@param value (String or char[])
	 */
	public void setLlaTroParti(char[] value)  throws CFException {
		work.setLlaTroParti(value);
	}
	
	/**
	 * 	Update LlaTroParti with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLlaTroPartiString(char[] value)  throws CFException{
		work.setLlaTroParti(value);
	}	

	/**
	 *	Returns the value of wresp
	 *	@return wresp
	 */
   public char[] getWresp() throws CFException  {              
   		return work.getWresp();
   }

  
	/**
	*  set variable wresp
	*  @param value
	**/
   public void setWresp(char[] value) throws CFException {
      work.setWresp(value);
   } 

public int getWcntString01() throws CFException {  
        return work.getWcntString01();
}
	/**
	 * 	Update WcntString01 with the passed value
	 *	@param number
	 */
	public void setWcntString01(int number)  throws CFException{
		work.setWcntString01(number);
	}


	public void setWcntString01(long number)  throws CFException{
	    work.setWcntString01(number);
	}
	


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public ParticionEntradaOutCtx clone() {
        ParticionEntradaOutCtx cloneObj = new ParticionEntradaOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ParticionEntradaOutCtx getParticionEntradaOutCtx() {
            return new ParticionEntradaOutCtx();
    }
     public class Particion01InCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wresp
	 *	@return wresp
	 */
   public char[] getWresp() throws CFException  {              
   		return work.getWresp();
   }

  
	/**
	*  set variable wresp
	*  @param value
	**/
   public void setWresp(char[] value) throws CFException {
      work.setWresp(value);
   } 


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public Particion01OutCtx getParticion01OutCtx() {
            return new Particion01OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Particion01InCtx clone() {
        Particion01InCtx cloneObj = new Particion01InCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Particion01InCtx getParticion01InCtx() {
            return new Particion01InCtx();
    }
     public class Particion01OutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of nomP01Parti
	 *	@return nomP01Parti
	 */
   public char[] getNomP01Parti() throws CFException  {              
   		return work.getNomP01Parti();
   }

  
	/**
	*  set variable nomP01Parti
	*  @param value
	**/
   public void setNomP01Parti(char[] value) throws CFException {
      work.setNomP01Parti(value);
   } 

	/**
	 *	Returns the value of wresp
	 *	@return wresp
	 */
   public char[] getWresp() throws CFException  {              
   		return work.getWresp();
   }

  
	/**
	*  set variable wresp
	*  @param value
	**/
   public void setWresp(char[] value) throws CFException {
      work.setWresp(value);
   } 

	/**
	 *	Returns the value of wPriTroPe8090m
	 *	@return wPriTroPe8090m
	 */
   public char[] getWPriTroPe8090m() throws CFException  {              
   		return section.getWPriTroPe8090m();
   }

  
	/**
	*  set variable wPriTroPe8090m
	*  @param value
	**/
   public void setWPriTroPe8090m(char[] value) throws CFException {
      section.setWPriTroPe8090m(value);
   } 

     /**
	 * 	Update WPriTroPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPriTroPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWPriTroPe8090m(source, sourceIndex);
   	
   }
   
   public void setWPriTroPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWPriTroPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WPriTroPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPriTroPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWPriTroPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WPriTroPe8090m with another Field
	 *	@param value
	 */
   public void setWPriTroPe8090m(Field source) {
      section.setWPriTroPe8090m(source);
   }  
   
     /**
	 * 	Update WPriTroPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPriTroPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWPriTroPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WPriTroPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPriTroPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWPriTroPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Particion01OutCtx clone() {
        Particion01OutCtx cloneObj = new Particion01OutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Particion01OutCtx getParticion01OutCtx() {
            return new Particion01OutCtx();
    }
     public class Particion02InCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();


public void setWPartIndex(int wPartIndex) { 
    Bm8090mCtx.this.wPartIndex = wPartIndex;
}

public int getWPartIndex() { 
    return Bm8090mCtx.this.wPartIndex;
}
public int getWguarCar() throws CFException {  
        return work.getWguarCar();
}
	/**
	 * 	Update WguarCar with the passed value
	 *	@param number
	 */
	public void setWguarCar(int number)  throws CFException{
		work.setWguarCar(number);
	}


	public void setWguarCar(long number)  throws CFException{
	    work.setWguarCar(number);
	}
	

	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wMaxTitPe8090m
	 *	@return wMaxTitPe8090m
	 */
	public int getWMaxTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWMaxTitPe8090m();
	}
	
	/**
	 * 	Update WMaxTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWMaxTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m(number);
	}


	public void setWMaxTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m((int)number);
	}


public int getWpointAnt() throws CFException {  
        return work.getWpointAnt();
}
	/**
	 * 	Update WpointAnt with the passed value
	 *	@param number
	 */
	public void setWpointAnt(int number)  throws CFException{
		work.setWpointAnt(number);
	}


	public void setWpointAnt(long number)  throws CFException{
	    work.setWpointAnt(number);
	}
	

	/**
	 *	Returns the value of wresp
	 *	@return wresp
	 */
   public char[] getWresp() throws CFException  {              
   		return work.getWresp();
   }

  
	/**
	*  set variable wresp
	*  @param value
	**/
   public void setWresp(char[] value) throws CFException {
      work.setWresp(value);
   } 


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public Particion02OutCtx getParticion02OutCtx() {
            return new Particion02OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Particion02InCtx clone() {
        Particion02InCtx cloneObj = new Particion02InCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Particion02InCtx getParticion02InCtx() {
            return new Particion02InCtx();
    }
     public class Particion02OutCtx implements Cloneable {
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();


public void setWPartIndex(int wPartIndex) { 
    Bm8090mCtx.this.wPartIndex = wPartIndex;
}

public int getWPartIndex() { 
    return Bm8090mCtx.this.wPartIndex;
}
	/**
	 *	Returns the value of nomP02Parti
	 *	@return nomP02Parti
	 */
   public char[] getNomP02Parti() throws CFException  {              
   		return work.getNomP02Parti();
   }

  
	/**
	*  set variable nomP02Parti
	*  @param value
	**/
   public void setNomP02Parti(char[] value) throws CFException {
      work.setNomP02Parti(value);
   } 

	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWOcuTitPe8090m();
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m(number);
	}


	public void setWOcuTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWOcuTitPe8090m((int)number);
	}


	/**
	 *	Returns the value of wSegTroPe8090m
	 *	@return wSegTroPe8090m
	 */
   public char[] getWSegTroPe8090m() throws CFException  {              
   		return section.getWSegTroPe8090m();
   }

  
	/**
	*  set variable wSegTroPe8090m
	*  @param value
	**/
   public void setWSegTroPe8090m(char[] value) throws CFException {
      section.setWSegTroPe8090m(value);
   } 

     /**
	 * 	Update WSegTroPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWSegTroPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWSegTroPe8090m(source, sourceIndex);
   	
   }
   
   public void setWSegTroPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWSegTroPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WSegTroPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWSegTroPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWSegTroPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WSegTroPe8090m with another Field
	 *	@param value
	 */
   public void setWSegTroPe8090m(Field source) {
      section.setWSegTroPe8090m(source);
   }  
   
     /**
	 * 	Update WSegTroPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWSegTroPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWSegTroPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WSegTroPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWSegTroPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWSegTroPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wMaxTitPe8090m
	 *	@return wMaxTitPe8090m
	 */
	public int getWMaxTitPe8090m() throws CFException {        
   		return section.getWDatVarPe8090m().getWMaxTitPe8090m();
	}
	
	/**
	 * 	Update WMaxTitPe8090m with the passed value
	 *	@param number
	 */
	public void setWMaxTitPe8090m(int number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m(number);
	}


	public void setWMaxTitPe8090m(long number)  throws CFException{
		section.getWDatVarPe8090m().setWMaxTitPe8090m((int)number);
	}


public int getWpointAnt() throws CFException {  
        return work.getWpointAnt();
}
	/**
	 * 	Update WpointAnt with the passed value
	 *	@param number
	 */
	public void setWpointAnt(int number)  throws CFException{
		work.setWpointAnt(number);
	}


	public void setWpointAnt(long number)  throws CFException{
	    work.setWpointAnt(number);
	}
	

	/**
	 *	Returns the value of wresp
	 *	@return wresp
	 */
   public char[] getWresp() throws CFException  {              
   		return work.getWresp();
   }

  
	/**
	*  set variable wresp
	*  @param value
	**/
   public void setWresp(char[] value) throws CFException {
      work.setWresp(value);
   } 

public int getWcntString01() throws CFException {  
        return work.getWcntString01();
}
	/**
	 * 	Update WcntString01 with the passed value
	 *	@param number
	 */
	public void setWcntString01(int number)  throws CFException{
		work.setWcntString01(number);
	}


	public void setWcntString01(long number)  throws CFException{
	    work.setWcntString01(number);
	}
	


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Particion02OutCtx clone() {
        Particion02OutCtx cloneObj = new Particion02OutCtx();
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Particion02OutCtx getParticion02OutCtx() {
            return new Particion02OutCtx();
    }
     public class BusCaracterEntradaInCtx implements Cloneable {
     WtabPartGroup wtabPartGroup = Bm8090mCtx.this.getWtabPartGroup();
     Work work = Bm8090mCtx.this.getWork();

public int getWcntNcar() throws CFException {  
        return work.getWcntNcar();
}
	/**
	 * 	Update WcntNcar with the passed value
	 *	@param number
	 */
	public void setWcntNcar(int number)  throws CFException{
		work.setWcntNcar(number);
	}


	public void setWcntNcar(long number)  throws CFException{
	    work.setWcntNcar(number);
	}
	

public int getWpointAct() throws CFException {  
        return work.getWpointAct();
}
	/**
	 * 	Update WpointAct with the passed value
	 *	@param number
	 */
	public void setWpointAct(int number)  throws CFException{
		work.setWpointAct(number);
	}


	public void setWpointAct(long number)  throws CFException{
	    work.setWpointAct(number);
	}
	


public void setWPartIndex(int wPartIndex) { 
    Bm8090mCtx.this.wPartIndex = wPartIndex;
}

public int getWPartIndex() { 
    return Bm8090mCtx.this.wPartIndex;
}
	/**
	 *	Returns the value of numCarParti
	 *	@return numCarParti
	 */
	public int getNumCarParti() throws CFException {
   		return work.getNumCarParti();
	}


	/**
	 *	Returns String value of numCarParti
	 *	@return numCarParti
	 */
	public char[]  getNumCarPartiString() throws CFException {
	     return String.valueOf(work.getNumCarPartiString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean numCarPartiIsNumeric()  throws CFException{
	    return work.numCarPartiIsNumeric();
	}

	/**
	 * 	Update NumCarParti with the passed value
	 *	@param number
	 */
	public void setNumCarParti(int number)  throws CFException{
		work.setNumCarParti(number);
	}
	

	public void setNumCarParti(long number)  throws CFException{
	    work.setNumCarParti(number);
	}
	
	
	/**
	 * 	Update NumCarParti with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumCarParti(char[] value)  throws CFException {
		work.setNumCarParti(value);
	}
	
	/**
	 * 	Update NumCarParti with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNumCarPartiString(char[] value)  throws CFException{
		work.setNumCarParti(value);
	}	

	/**
	 *	Returns the value of welem
	 *	@return welem
	 */
   public char[] getWelem(int index) throws CFException  {              
   		return wtabPartGroup.getWtabPartx().getWeleTab(index).getWelem();
   }

  
	/**
	*  set variable welem
	*  @param value
	**/
   public void setWelem(int index,char[] value) throws CFException {
      wtabPartGroup.getWtabPartx().getWeleTab(index).setWelem(value);
   } 

     /**
	 * 	Update Welem 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWelem(int index,char[] source, int sourceIndex) throws CFException {
      wtabPartGroup.getWtabPartx().getWeleTab(index).setWelem(source, sourceIndex);
   	
   }
   
   public void setWelem(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wtabPartGroup.getWtabPartx().getWeleTab(index).setWelem(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Welem 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWelem(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wtabPartGroup.getWtabPartx().getWeleTab(index).setWelem(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Welem with another Field
	 *	@param value
	 */
   public void setWelem(int index,Field source) {
      wtabPartGroup.getWtabPartx().getWeleTab(index).setWelem(source);
   }  
   
     /**
	 * 	Update Welem 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWelem(int index,Field source, int sourceIndex,int sourceLen) {
      wtabPartGroup.getWtabPartx().getWeleTab(index).setWelem(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Welem 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWelem(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wtabPartGroup.getWtabPartx().getWeleTab(index).setWelem(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public BusCaracterEntradaOutCtx getBusCaracterEntradaOutCtx() {
            return new BusCaracterEntradaOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wtabPartGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public BusCaracterEntradaInCtx clone() {
        BusCaracterEntradaInCtx cloneObj = new BusCaracterEntradaInCtx();
        cloneObj.wtabPartGroup = new WtabPartGroup();
        cloneObj.wtabPartGroup.set(wtabPartGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public BusCaracterEntradaInCtx getBusCaracterEntradaInCtx() {
            return new BusCaracterEntradaInCtx();
    }
     public class BusCaracterEntradaOutCtx implements Cloneable {
     WtabPartGroup wtabPartGroup = Bm8090mCtx.this.getWtabPartGroup();
     Work work = Bm8090mCtx.this.getWork();

public int getWcntNcar() throws CFException {  
        return work.getWcntNcar();
}
	/**
	 * 	Update WcntNcar with the passed value
	 *	@param number
	 */
	public void setWcntNcar(int number)  throws CFException{
		work.setWcntNcar(number);
	}


	public void setWcntNcar(long number)  throws CFException{
	    work.setWcntNcar(number);
	}
	


public void setWPartIndex(int wPartIndex) { 
    Bm8090mCtx.this.wPartIndex = wPartIndex;
}

public int getWPartIndex() { 
    return Bm8090mCtx.this.wPartIndex;
}
public int getWswCarDiv() throws CFException {  
        return work.getWswCarDiv();
}
	/**
	 * 	Update WswCarDiv with the passed value
	 *	@param number
	 */
	public void setWswCarDiv(int number)  throws CFException{
		work.setWswCarDiv(number);
	}


	public void setWswCarDiv(long number)  throws CFException{
	    work.setWswCarDiv(number);
	}
	


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wtabPartGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public BusCaracterEntradaOutCtx clone() {
        BusCaracterEntradaOutCtx cloneObj = new BusCaracterEntradaOutCtx();
        cloneObj.wtabPartGroup = new WtabPartGroup();
        cloneObj.wtabPartGroup.set(wtabPartGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public BusCaracterEntradaOutCtx getBusCaracterEntradaOutCtx() {
            return new BusCaracterEntradaOutCtx();
    }
     public class RespuestaEntradaInCtx implements Cloneable {
     WtabPartGroup wtabPartGroup = Bm8090mCtx.this.getWtabPartGroup();
     Work work = Bm8090mCtx.this.getWork();


public void setWPartIndex(int wPartIndex) { 
    Bm8090mCtx.this.wPartIndex = wPartIndex;
}

public int getWPartIndex() { 
    return Bm8090mCtx.this.wPartIndex;
}
	/**
	 *	Returns the value of welem
	 *	@return welem
	 */
   public char[] getWelem(int index) throws CFException  {              
   		return wtabPartGroup.getWtabPartx().getWeleTab(index).getWelem();
   }

  
	/**
	*  set variable welem
	*  @param value
	**/
   public void setWelem(int index,char[] value) throws CFException {
      wtabPartGroup.getWtabPartx().getWeleTab(index).setWelem(value);
   } 

     /**
	 * 	Update Welem 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWelem(int index,char[] source, int sourceIndex) throws CFException {
      wtabPartGroup.getWtabPartx().getWeleTab(index).setWelem(source, sourceIndex);
   	
   }
   
   public void setWelem(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wtabPartGroup.getWtabPartx().getWeleTab(index).setWelem(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Welem 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWelem(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wtabPartGroup.getWtabPartx().getWeleTab(index).setWelem(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Welem with another Field
	 *	@param value
	 */
   public void setWelem(int index,Field source) {
      wtabPartGroup.getWtabPartx().getWeleTab(index).setWelem(source);
   }  
   
     /**
	 * 	Update Welem 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWelem(int index,Field source, int sourceIndex,int sourceLen) {
      wtabPartGroup.getWtabPartx().getWeleTab(index).setWelem(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Welem 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWelem(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wtabPartGroup.getWtabPartx().getWeleTab(index).setWelem(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public RespuestaEntradaOutCtx getRespuestaEntradaOutCtx() {
            return new RespuestaEntradaOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wtabPartGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public RespuestaEntradaInCtx clone() {
        RespuestaEntradaInCtx cloneObj = new RespuestaEntradaInCtx();
        cloneObj.wtabPartGroup = new WtabPartGroup();
        cloneObj.wtabPartGroup.set(wtabPartGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public RespuestaEntradaInCtx getRespuestaEntradaInCtx() {
            return new RespuestaEntradaInCtx();
    }
     public class RespuestaEntradaOutCtx implements Cloneable {
     WtabPartGroup wtabPartGroup = Bm8090mCtx.this.getWtabPartGroup();
     Work work = Bm8090mCtx.this.getWork();


public void setWPartIndex(int wPartIndex) { 
    Bm8090mCtx.this.wPartIndex = wPartIndex;
}

public int getWPartIndex() { 
    return Bm8090mCtx.this.wPartIndex;
}
	/**
	 *	Returns the value of wresp
	 *	@return wresp
	 */
   public char[] getWresp() throws CFException  {              
   		return work.getWresp();
   }

  
	/**
	*  set variable wresp
	*  @param value
	**/
   public void setWresp(char[] value) throws CFException {
      work.setWresp(value);
   } 

public int getWcntString01() throws CFException {  
        return work.getWcntString01();
}
	/**
	 * 	Update WcntString01 with the passed value
	 *	@param number
	 */
	public void setWcntString01(int number)  throws CFException{
		work.setWcntString01(number);
	}


	public void setWcntString01(long number)  throws CFException{
	    work.setWcntString01(number);
	}
	


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wtabPartGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public RespuestaEntradaOutCtx clone() {
        RespuestaEntradaOutCtx cloneObj = new RespuestaEntradaOutCtx();
        cloneObj.wtabPartGroup = new WtabPartGroup();
        cloneObj.wtabPartGroup.set(wtabPartGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public RespuestaEntradaOutCtx getRespuestaEntradaOutCtx() {
            return new RespuestaEntradaOutCtx();
    }
     public class ComprimirNombreInCtx implements Cloneable {
     WRespuestaGroup wRespuestaGroup = Bm8090mCtx.this.getWRespuestaGroup();
     WPartesGroup wPartesGroup = Bm8090mCtx.this.getWPartesGroup();
     Work work = Bm8090mCtx.this.getWork();
     WTipPerGroup wTipPerGroup = Bm8090mCtx.this.getWTipPerGroup();
     WRespuestaRGroup wRespuestaRGroup = Bm8090mCtx.this.getWRespuestaRGroup();
     WRespuestaMrGroup wRespuestaMrGroup = Bm8090mCtx.this.getWRespuestaMrGroup();

	/**
	 *	Returns the value of wPer
	 *	@return wPer
	 */
	public int getWPer() throws CFException {
   		return wTipPerGroup.getWtipPer().getWPer();
	}


	/**
	 *	Returns String value of wPer
	 *	@return wPer
	 */
	public char[]  getWPerString() throws CFException {
	     return String.valueOf(wTipPerGroup.getWtipPer().getWPerString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wPerIsNumeric()  throws CFException{
	    return wTipPerGroup.getWtipPer().wPerIsNumeric();
	}

	/**
	 * 	Update WPer with the passed value
	 *	@param number
	 */
	public void setWPer(int number)  throws CFException{
		wTipPerGroup.getWtipPer().setWPer(number);
	}
	

	public void setWPer(long number)  throws CFException{
	    wTipPerGroup.getWtipPer().setWPer(number);
	}
	
	
	/**
	 * 	Update WPer with the passed value
	 *	@param value (String or char[])
	 */
	public void setWPer(char[] value)  throws CFException {
		wTipPerGroup.getWtipPer().setWPer(value);
	}
	
	/**
	 * 	Update WPer with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWPerString(char[] value)  throws CFException{
		wTipPerGroup.getWtipPer().setWPer(value);
	}	

	/**
	 *	Returns the value of wIndOpc
	 *	@return wIndOpc
	 */
	public int getWIndOpc() throws CFException {
   		return work.getWIndOpc();
	}


	/**
	 *	Returns String value of wIndOpc
	 *	@return wIndOpc
	 */
	public char[]  getWIndOpcString() throws CFException {
	     return String.valueOf(work.getWIndOpcString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wIndOpcIsNumeric()  throws CFException{
	    return work.wIndOpcIsNumeric();
	}

	/**
	 * 	Update WIndOpc with the passed value
	 *	@param number
	 */
	public void setWIndOpc(int number)  throws CFException{
		work.setWIndOpc(number);
	}
	

	public void setWIndOpc(long number)  throws CFException{
	    work.setWIndOpc(number);
	}
	
	
	/**
	 * 	Update WIndOpc with the passed value
	 *	@param value (String or char[])
	 */
	public void setWIndOpc(char[] value)  throws CFException {
		work.setWIndOpc(value);
	}
	
	/**
	 * 	Update WIndOpc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWIndOpcString(char[] value)  throws CFException{
		work.setWIndOpc(value);
	}	


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public ComprimirNombreOutCtx getComprimirNombreOutCtx() {
            return new ComprimirNombreOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wRespuestaGroup.hashCode();
        str += wPartesGroup.hashCode();
        str += work.hashCode();
        str += wTipPerGroup.hashCode();
        str += wRespuestaRGroup.hashCode();
        str += wRespuestaMrGroup.hashCode();
       return str.hashCode();
    }

    public ComprimirNombreInCtx clone() {
        ComprimirNombreInCtx cloneObj = new ComprimirNombreInCtx();
        cloneObj.wRespuestaGroup = new WRespuestaGroup();
        cloneObj.wRespuestaGroup.set(wRespuestaGroup.getClonedField());
        cloneObj.wPartesGroup = new WPartesGroup();
        cloneObj.wPartesGroup.set(wPartesGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wTipPerGroup = new WTipPerGroup();
        cloneObj.wTipPerGroup.set(wTipPerGroup.getClonedField());
        cloneObj.wRespuestaRGroup = new WRespuestaRGroup();
        cloneObj.wRespuestaRGroup.set(wRespuestaRGroup.getClonedField());
        cloneObj.wRespuestaMrGroup = new WRespuestaMrGroup();
        cloneObj.wRespuestaMrGroup.set(wRespuestaMrGroup.getClonedField());
        return cloneObj;
    }

    }

    public ComprimirNombreInCtx getComprimirNombreInCtx() {
            return new ComprimirNombreInCtx();
    }
     public class ComprimirNombreOutCtx implements Cloneable {
     WRespuestaGroup wRespuestaGroup = Bm8090mCtx.this.getWRespuestaGroup();
     WPartesGroup wPartesGroup = Bm8090mCtx.this.getWPartesGroup();
     Work work = Bm8090mCtx.this.getWork();
     WTipPerGroup wTipPerGroup = Bm8090mCtx.this.getWTipPerGroup();
     WRespuestaRGroup wRespuestaRGroup = Bm8090mCtx.this.getWRespuestaRGroup();
     WRespuestaMrGroup wRespuestaMrGroup = Bm8090mCtx.this.getWRespuestaMrGroup();

	/**
	 *	Returns the value of wRespuestaMr
	 *	@return wRespuestaMr
	 */
   public char[] getWRespuestaMr() throws CFException  {              
   		return wRespuestaMrGroup.getWRespuestaMr();
   }

  
	/**
	*  set variable wRespuestaMr
	*  @param value
	**/
   public void setWRespuestaMr(char[] value) throws CFException {
      wRespuestaMrGroup.setWRespuestaMr(value);
   } 

     /**
	 * 	Update WRespuestaMr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespuestaMr(char[] source, int sourceIndex) throws CFException {
      wRespuestaMrGroup.setWRespuestaMr(source, sourceIndex);
   	
   }
   
   public void setWRespuestaMr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaMrGroup.setWRespuestaMr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WRespuestaMr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespuestaMr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaMrGroup.setWRespuestaMr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WRespuestaMr with another Field
	 *	@param value
	 */
   public void setWRespuestaMr(Field source) {
      wRespuestaMrGroup.setWRespuestaMr(source);
   }  
   
     /**
	 * 	Update WRespuestaMr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespuestaMr(Field source, int sourceIndex,int sourceLen) {
      wRespuestaMrGroup.setWRespuestaMr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WRespuestaMr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespuestaMr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaMrGroup.setWRespuestaMr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wsapPer01
	 *	@return wsapPer01
	 */
   public char[] getWsapPer01() throws CFException  {              
   		return work.getWsapPer01();
   }

  
	/**
	*  set variable wsapPer01
	*  @param value
	**/
   public void setWsapPer01(char[] value) throws CFException {
      work.setWsapPer01(value);
   } 

	/**
	 *	Returns the value of wNomCom
	 *	@return wNomCom
	 */
   public char[] getWNomCom() throws CFException  {              
   		return work.getWNomCom();
   }

  
	/**
	*  set variable wNomCom
	*  @param value
	**/
   public void setWNomCom(char[] value) throws CFException {
      work.setWNomCom(value);
   } 

public int getWCntString() throws CFException {  
        return work.getWCntString();
}
	/**
	 * 	Update WCntString with the passed value
	 *	@param number
	 */
	public void setWCntString(int number)  throws CFException{
		work.setWCntString(number);
	}


	public void setWCntString(long number)  throws CFException{
	    work.setWCntString(number);
	}
	

	/**
	 *	Returns the value of wpapPer01
	 *	@return wpapPer01
	 */
   public char[] getWpapPer01() throws CFException  {              
   		return work.getWpapPer01();
   }

  
	/**
	*  set variable wpapPer01
	*  @param value
	**/
   public void setWpapPer01(char[] value) throws CFException {
      work.setWpapPer01(value);
   } 

	/**
	 *	Returns the value of wRespuesta
	 *	@return wRespuesta
	 */
   public char[] getWRespuesta() throws CFException  {              
   		return wRespuestaGroup.getWRespuesta();
   }

  
	/**
	*  set variable wRespuesta
	*  @param value
	**/
   public void setWRespuesta(char[] value) throws CFException {
      wRespuestaGroup.setWRespuesta(value);
   } 

     /**
	 * 	Update WRespuesta 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespuesta(char[] source, int sourceIndex) throws CFException {
      wRespuestaGroup.setWRespuesta(source, sourceIndex);
   	
   }
   
   public void setWRespuesta(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaGroup.setWRespuesta(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WRespuesta 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespuesta(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.setWRespuesta(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WRespuesta with another Field
	 *	@param value
	 */
   public void setWRespuesta(Field source) {
      wRespuestaGroup.setWRespuesta(source);
   }  
   
     /**
	 * 	Update WRespuesta 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespuesta(Field source, int sourceIndex,int sourceLen) {
      wRespuestaGroup.setWRespuesta(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WRespuesta 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespuesta(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.setWRespuesta(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPartes
	 *	@return wPartes
	 */
   public char[] getWPartes() throws CFException  {              
   		return wPartesGroup.getWPartes();
   }

  
	/**
	*  set variable wPartes
	*  @param value
	**/
   public void setWPartes(char[] value) throws CFException {
      wPartesGroup.setWPartes(value);
   } 

     /**
	 * 	Update WPartes 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPartes(char[] source, int sourceIndex) throws CFException {
      wPartesGroup.setWPartes(source, sourceIndex);
   	
   }
   
   public void setWPartes(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wPartesGroup.setWPartes(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WPartes 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPartes(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wPartesGroup.setWPartes(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WPartes with another Field
	 *	@param value
	 */
   public void setWPartes(Field source) {
      wPartesGroup.setWPartes(source);
   }  
   
     /**
	 * 	Update WPartes 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPartes(Field source, int sourceIndex,int sourceLen) {
      wPartesGroup.setWPartes(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WPartes 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPartes(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wPartesGroup.setWPartes(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wRespuestaR
	 *	@return wRespuestaR
	 */
   public char[] getWRespuestaR() throws CFException  {              
   		return wRespuestaRGroup.getWRespuestaR();
   }

  
	/**
	*  set variable wRespuestaR
	*  @param value
	**/
   public void setWRespuestaR(char[] value) throws CFException {
      wRespuestaRGroup.setWRespuestaR(value);
   } 

     /**
	 * 	Update WRespuestaR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespuestaR(char[] source, int sourceIndex) throws CFException {
      wRespuestaRGroup.setWRespuestaR(source, sourceIndex);
   	
   }
   
   public void setWRespuestaR(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaRGroup.setWRespuestaR(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WRespuestaR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespuestaR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaRGroup.setWRespuestaR(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WRespuestaR with another Field
	 *	@param value
	 */
   public void setWRespuestaR(Field source) {
      wRespuestaRGroup.setWRespuestaR(source);
   }  
   
     /**
	 * 	Update WRespuestaR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespuestaR(Field source, int sourceIndex,int sourceLen) {
      wRespuestaRGroup.setWRespuestaR(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WRespuestaR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespuestaR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaRGroup.setWRespuestaR(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wnomPer01
	 *	@return wnomPer01
	 */
   public char[] getWnomPer01() throws CFException  {              
   		return work.getWnomPer01();
   }

  
	/**
	*  set variable wnomPer01
	*  @param value
	**/
   public void setWnomPer01(char[] value) throws CFException {
      work.setWnomPer01(value);
   } 


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wRespuestaGroup.hashCode();
        str += wPartesGroup.hashCode();
        str += work.hashCode();
        str += wTipPerGroup.hashCode();
        str += wRespuestaRGroup.hashCode();
        str += wRespuestaMrGroup.hashCode();
       return str.hashCode();
    }

    public ComprimirNombreOutCtx clone() {
        ComprimirNombreOutCtx cloneObj = new ComprimirNombreOutCtx();
        cloneObj.wRespuestaGroup = new WRespuestaGroup();
        cloneObj.wRespuestaGroup.set(wRespuestaGroup.getClonedField());
        cloneObj.wPartesGroup = new WPartesGroup();
        cloneObj.wPartesGroup.set(wPartesGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wTipPerGroup = new WTipPerGroup();
        cloneObj.wTipPerGroup.set(wTipPerGroup.getClonedField());
        cloneObj.wRespuestaRGroup = new WRespuestaRGroup();
        cloneObj.wRespuestaRGroup.set(wRespuestaRGroup.getClonedField());
        cloneObj.wRespuestaMrGroup = new WRespuestaMrGroup();
        cloneObj.wRespuestaMrGroup.set(wRespuestaMrGroup.getClonedField());
        return cloneObj;
    }

    }

    public ComprimirNombreOutCtx getComprimirNombreOutCtx() {
            return new ComprimirNombreOutCtx();
    }
     public class PerInCtx implements Cloneable {
     WRespuestaGroup wRespuestaGroup = Bm8090mCtx.this.getWRespuestaGroup();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wSepApe
	 *	@return wSepApe
	 */
   public char[] getWSepApe() throws CFException  {              
   		return work.getWSepApe();
   }

  
	/**
	*  set variable wSepApe
	*  @param value
	**/
   public void setWSepApe(char[] value) throws CFException {
      work.setWSepApe(value);
   } 

	/**
	 *	Returns the value of wResp1
	 *	@return wResp1
	 */
   public char[] getWResp1() throws CFException  {              
   		return wRespuestaGroup.getWRespu().getWResp1();
   }

  
	/**
	*  set variable wResp1
	*  @param value
	**/
   public void setWResp1(char[] value) throws CFException {
      wRespuestaGroup.getWRespu().setWResp1(value);
   } 

     /**
	 * 	Update WResp1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWResp1(char[] source, int sourceIndex) throws CFException {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex);
   	
   }
   
   public void setWResp1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WResp1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWResp1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WResp1 with another Field
	 *	@param value
	 */
   public void setWResp1(Field source) {
      wRespuestaGroup.getWRespu().setWResp1(source);
   }  
   
     /**
	 * 	Update WResp1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWResp1(Field source, int sourceIndex,int sourceLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WResp1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWResp1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wSapPer
	 *	@return wSapPer
	 */
   public char[] getWSapPer() throws CFException  {              
   		return work.getWSapPer();
   }

  
	/**
	*  set variable wSapPer
	*  @param value
	**/
   public void setWSapPer(char[] value) throws CFException {
      work.setWSapPer(value);
   } 

	/**
	 *	Returns the value of wAster
	 *	@return wAster
	 */
   public char[] getWAster() throws CFException  {              
   		return work.getWAster();
   }

  
	/**
	*  set variable wAster
	*  @param value
	**/
   public void setWAster(char[] value) throws CFException {
      work.setWAster(value);
   } 

	/**
	 *	Returns the value of wEsp1
	 *	@return wEsp1
	 */
   public char[] getWEsp1() throws CFException  {              
   		return work.getWEsp1();
   }

  
	/**
	*  set variable wEsp1
	*  @param value
	**/
   public void setWEsp1(char[] value) throws CFException {
      work.setWEsp1(value);
   } 

	/**
	 *	Returns the value of wNomPer
	 *	@return wNomPer
	 */
   public char[] getWNomPer() throws CFException  {              
   		return work.getWNomPer();
   }

  
	/**
	*  set variable wNomPer
	*  @param value
	**/
   public void setWNomPer(char[] value) throws CFException {
      work.setWNomPer(value);
   } 

	/**
	 *	Returns the value of wPapPer
	 *	@return wPapPer
	 */
   public char[] getWPapPer() throws CFException  {              
   		return work.getWPapPer();
   }

  
	/**
	*  set variable wPapPer
	*  @param value
	**/
   public void setWPapPer(char[] value) throws CFException {
      work.setWPapPer(value);
   } 

	/**
	 *	Returns the value of wEsp2
	 *	@return wEsp2
	 */
   public char[] getWEsp2() throws CFException  {              
   		return work.getWEsp2();
   }

  
	/**
	*  set variable wEsp2
	*  @param value
	**/
   public void setWEsp2(char[] value) throws CFException {
      work.setWEsp2(value);
   } 


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public PerOutCtx getPerOutCtx() {
            return new PerOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wRespuestaGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PerInCtx clone() {
        PerInCtx cloneObj = new PerInCtx();
        cloneObj.wRespuestaGroup = new WRespuestaGroup();
        cloneObj.wRespuestaGroup.set(wRespuestaGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PerInCtx getPerInCtx() {
            return new PerInCtx();
    }
     public class PerOutCtx implements Cloneable {
     WRespuestaGroup wRespuestaGroup = Bm8090mCtx.this.getWRespuestaGroup();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wResp1
	 *	@return wResp1
	 */
   public char[] getWResp1() throws CFException  {              
   		return wRespuestaGroup.getWRespu().getWResp1();
   }

  
	/**
	*  set variable wResp1
	*  @param value
	**/
   public void setWResp1(char[] value) throws CFException {
      wRespuestaGroup.getWRespu().setWResp1(value);
   } 

     /**
	 * 	Update WResp1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWResp1(char[] source, int sourceIndex) throws CFException {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex);
   	
   }
   
   public void setWResp1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WResp1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWResp1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WResp1 with another Field
	 *	@param value
	 */
   public void setWResp1(Field source) {
      wRespuestaGroup.getWRespu().setWResp1(source);
   }  
   
     /**
	 * 	Update WResp1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWResp1(Field source, int sourceIndex,int sourceLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WResp1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWResp1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getWcntNcar() throws CFException {  
        return work.getWcntNcar();
}
	/**
	 * 	Update WcntNcar with the passed value
	 *	@param number
	 */
	public void setWcntNcar(int number)  throws CFException{
		work.setWcntNcar(number);
	}


	public void setWcntNcar(long number)  throws CFException{
	    work.setWcntNcar(number);
	}
	

	/**
	 *	Returns the value of wSapPer
	 *	@return wSapPer
	 */
   public char[] getWSapPer() throws CFException  {              
   		return work.getWSapPer();
   }

  
	/**
	*  set variable wSapPer
	*  @param value
	**/
   public void setWSapPer(char[] value) throws CFException {
      work.setWSapPer(value);
   } 

	/**
	 *	Returns the value of wNomPer
	 *	@return wNomPer
	 */
   public char[] getWNomPer() throws CFException  {              
   		return work.getWNomPer();
   }

  
	/**
	*  set variable wNomPer
	*  @param value
	**/
   public void setWNomPer(char[] value) throws CFException {
      work.setWNomPer(value);
   } 

	/**
	 *	Returns the value of wsapPer01
	 *	@return wsapPer01
	 */
   public char[] getWsapPer01() throws CFException  {              
   		return work.getWsapPer01();
   }

  
	/**
	*  set variable wsapPer01
	*  @param value
	**/
   public void setWsapPer01(char[] value) throws CFException {
      work.setWsapPer01(value);
   } 

	/**
	 *	Returns the value of wNomCom
	 *	@return wNomCom
	 */
   public char[] getWNomCom() throws CFException  {              
   		return work.getWNomCom();
   }

  
	/**
	*  set variable wNomCom
	*  @param value
	**/
   public void setWNomCom(char[] value) throws CFException {
      work.setWNomCom(value);
   } 

public int getWCntString() throws CFException {  
        return work.getWCntString();
}
	/**
	 * 	Update WCntString with the passed value
	 *	@param number
	 */
	public void setWCntString(int number)  throws CFException{
		work.setWCntString(number);
	}


	public void setWCntString(long number)  throws CFException{
	    work.setWCntString(number);
	}
	

	/**
	 *	Returns the value of wpapPer01
	 *	@return wpapPer01
	 */
   public char[] getWpapPer01() throws CFException  {              
   		return work.getWpapPer01();
   }

  
	/**
	*  set variable wpapPer01
	*  @param value
	**/
   public void setWpapPer01(char[] value) throws CFException {
      work.setWpapPer01(value);
   } 

	/**
	 *	Returns the value of wPapPer
	 *	@return wPapPer
	 */
   public char[] getWPapPer() throws CFException  {              
   		return work.getWPapPer();
   }

  
	/**
	*  set variable wPapPer
	*  @param value
	**/
   public void setWPapPer(char[] value) throws CFException {
      work.setWPapPer(value);
   } 

	/**
	 *	Returns the value of wRespuesta
	 *	@return wRespuesta
	 */
   public char[] getWRespuesta() throws CFException  {              
   		return wRespuestaGroup.getWRespuesta();
   }

  
	/**
	*  set variable wRespuesta
	*  @param value
	**/
   public void setWRespuesta(char[] value) throws CFException {
      wRespuestaGroup.setWRespuesta(value);
   } 

     /**
	 * 	Update WRespuesta 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespuesta(char[] source, int sourceIndex) throws CFException {
      wRespuestaGroup.setWRespuesta(source, sourceIndex);
   	
   }
   
   public void setWRespuesta(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaGroup.setWRespuesta(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WRespuesta 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespuesta(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.setWRespuesta(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WRespuesta with another Field
	 *	@param value
	 */
   public void setWRespuesta(Field source) {
      wRespuestaGroup.setWRespuesta(source);
   }  
   
     /**
	 * 	Update WRespuesta 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespuesta(Field source, int sourceIndex,int sourceLen) {
      wRespuestaGroup.setWRespuesta(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WRespuesta 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespuesta(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.setWRespuesta(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wnomPer01
	 *	@return wnomPer01
	 */
   public char[] getWnomPer01() throws CFException  {              
   		return work.getWnomPer01();
   }

  
	/**
	*  set variable wnomPer01
	*  @param value
	**/
   public void setWnomPer01(char[] value) throws CFException {
      work.setWnomPer01(value);
   } 


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wRespuestaGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PerOutCtx clone() {
        PerOutCtx cloneObj = new PerOutCtx();
        cloneObj.wRespuestaGroup = new WRespuestaGroup();
        cloneObj.wRespuestaGroup.set(wRespuestaGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PerOutCtx getPerOutCtx() {
            return new PerOutCtx();
    }
     public class ComInCtx implements Cloneable {
     WRespuestaGroup wRespuestaGroup = Bm8090mCtx.this.getWRespuestaGroup();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wResp1
	 *	@return wResp1
	 */
   public char[] getWResp1() throws CFException  {              
   		return wRespuestaGroup.getWRespu().getWResp1();
   }

  
	/**
	*  set variable wResp1
	*  @param value
	**/
   public void setWResp1(char[] value) throws CFException {
      wRespuestaGroup.getWRespu().setWResp1(value);
   } 

     /**
	 * 	Update WResp1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWResp1(char[] source, int sourceIndex) throws CFException {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex);
   	
   }
   
   public void setWResp1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WResp1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWResp1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WResp1 with another Field
	 *	@param value
	 */
   public void setWResp1(Field source) {
      wRespuestaGroup.getWRespu().setWResp1(source);
   }  
   
     /**
	 * 	Update WResp1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWResp1(Field source, int sourceIndex,int sourceLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WResp1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWResp1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wAster
	 *	@return wAster
	 */
   public char[] getWAster() throws CFException  {              
   		return work.getWAster();
   }

  
	/**
	*  set variable wAster
	*  @param value
	**/
   public void setWAster(char[] value) throws CFException {
      work.setWAster(value);
   } 

	/**
	 *	Returns the value of wPapPer
	 *	@return wPapPer
	 */
   public char[] getWPapPer() throws CFException  {              
   		return work.getWPapPer();
   }

  
	/**
	*  set variable wPapPer
	*  @param value
	**/
   public void setWPapPer(char[] value) throws CFException {
      work.setWPapPer(value);
   } 

	/**
	 *	Returns the value of wEsp2
	 *	@return wEsp2
	 */
   public char[] getWEsp2() throws CFException  {              
   		return work.getWEsp2();
   }

  
	/**
	*  set variable wEsp2
	*  @param value
	**/
   public void setWEsp2(char[] value) throws CFException {
      work.setWEsp2(value);
   } 


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public ComOutCtx getComOutCtx() {
            return new ComOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wRespuestaGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ComInCtx clone() {
        ComInCtx cloneObj = new ComInCtx();
        cloneObj.wRespuestaGroup = new WRespuestaGroup();
        cloneObj.wRespuestaGroup.set(wRespuestaGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ComInCtx getComInCtx() {
            return new ComInCtx();
    }
     public class ComOutCtx implements Cloneable {
     WRespuestaGroup wRespuestaGroup = Bm8090mCtx.this.getWRespuestaGroup();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wResp1
	 *	@return wResp1
	 */
   public char[] getWResp1() throws CFException  {              
   		return wRespuestaGroup.getWRespu().getWResp1();
   }

  
	/**
	*  set variable wResp1
	*  @param value
	**/
   public void setWResp1(char[] value) throws CFException {
      wRespuestaGroup.getWRespu().setWResp1(value);
   } 

     /**
	 * 	Update WResp1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWResp1(char[] source, int sourceIndex) throws CFException {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex);
   	
   }
   
   public void setWResp1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WResp1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWResp1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WResp1 with another Field
	 *	@param value
	 */
   public void setWResp1(Field source) {
      wRespuestaGroup.getWRespu().setWResp1(source);
   }  
   
     /**
	 * 	Update WResp1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWResp1(Field source, int sourceIndex,int sourceLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WResp1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWResp1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.getWRespu().setWResp1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getWcntNcar() throws CFException {  
        return work.getWcntNcar();
}
	/**
	 * 	Update WcntNcar with the passed value
	 *	@param number
	 */
	public void setWcntNcar(int number)  throws CFException{
		work.setWcntNcar(number);
	}


	public void setWcntNcar(long number)  throws CFException{
	    work.setWcntNcar(number);
	}
	

	/**
	 *	Returns the value of wNomCom
	 *	@return wNomCom
	 */
   public char[] getWNomCom() throws CFException  {              
   		return work.getWNomCom();
   }

  
	/**
	*  set variable wNomCom
	*  @param value
	**/
   public void setWNomCom(char[] value) throws CFException {
      work.setWNomCom(value);
   } 

public int getWCntString() throws CFException {  
        return work.getWCntString();
}
	/**
	 * 	Update WCntString with the passed value
	 *	@param number
	 */
	public void setWCntString(int number)  throws CFException{
		work.setWCntString(number);
	}


	public void setWCntString(long number)  throws CFException{
	    work.setWCntString(number);
	}
	

	/**
	 *	Returns the value of wRespuesta
	 *	@return wRespuesta
	 */
   public char[] getWRespuesta() throws CFException  {              
   		return wRespuestaGroup.getWRespuesta();
   }

  
	/**
	*  set variable wRespuesta
	*  @param value
	**/
   public void setWRespuesta(char[] value) throws CFException {
      wRespuestaGroup.setWRespuesta(value);
   } 

     /**
	 * 	Update WRespuesta 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespuesta(char[] source, int sourceIndex) throws CFException {
      wRespuestaGroup.setWRespuesta(source, sourceIndex);
   	
   }
   
   public void setWRespuesta(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaGroup.setWRespuesta(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WRespuesta 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespuesta(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.setWRespuesta(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WRespuesta with another Field
	 *	@param value
	 */
   public void setWRespuesta(Field source) {
      wRespuestaGroup.setWRespuesta(source);
   }  
   
     /**
	 * 	Update WRespuesta 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespuesta(Field source, int sourceIndex,int sourceLen) {
      wRespuestaGroup.setWRespuesta(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WRespuesta 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespuesta(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaGroup.setWRespuesta(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wRespuestaGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ComOutCtx clone() {
        ComOutCtx cloneObj = new ComOutCtx();
        cloneObj.wRespuestaGroup = new WRespuestaGroup();
        cloneObj.wRespuestaGroup.set(wRespuestaGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ComOutCtx getComOutCtx() {
            return new ComOutCtx();
    }
     public class PerOPC01InCtx implements Cloneable {
     WPartesGroup wPartesGroup = Bm8090mCtx.this.getWPartesGroup();
     Work work = Bm8090mCtx.this.getWork();
     WPrimLetra wPrimLetra = Bm8090mCtx.this.getWPrimLetra();
     WRespuestaMrGroup wRespuestaMrGroup = Bm8090mCtx.this.getWRespuestaMrGroup();

	/**
	 *	Returns the value of wAster
	 *	@return wAster
	 */
   public char[] getWAster() throws CFException  {              
   		return work.getWAster();
   }

  
	/**
	*  set variable wAster
	*  @param value
	**/
   public void setWAster(char[] value) throws CFException {
      work.setWAster(value);
   } 

	/**
	 *	Returns the value of wNomPer
	 *	@return wNomPer
	 */
   public char[] getWNomPer() throws CFException  {              
   		return work.getWNomPer();
   }

  
	/**
	*  set variable wNomPer
	*  @param value
	**/
   public void setWNomPer(char[] value) throws CFException {
      work.setWNomPer(value);
   } 

	/**
	 *	Returns the value of wPapPer
	 *	@return wPapPer
	 */
   public char[] getWPapPer() throws CFException  {              
   		return work.getWPapPer();
   }

  
	/**
	*  set variable wPapPer
	*  @param value
	**/
   public void setWPapPer(char[] value) throws CFException {
      work.setWPapPer(value);
   } 

	/**
	 *	Returns the value of wRespMr1
	 *	@return wRespMr1
	 */
   public char[] getWRespMr1() throws CFException  {              
   		return wRespuestaMrGroup.getWRespuMr().getWRespMr1();
   }

  
	/**
	*  set variable wRespMr1
	*  @param value
	**/
   public void setWRespMr1(char[] value) throws CFException {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(value);
   } 

     /**
	 * 	Update WRespMr1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespMr1(char[] source, int sourceIndex) throws CFException {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex);
   	
   }
   
   public void setWRespMr1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WRespMr1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespMr1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WRespMr1 with another Field
	 *	@param value
	 */
   public void setWRespMr1(Field source) {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source);
   }  
   
     /**
	 * 	Update WRespMr1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespMr1(Field source, int sourceIndex,int sourceLen) {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WRespMr1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespMr1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wEsp2
	 *	@return wEsp2
	 */
   public char[] getWEsp2() throws CFException  {              
   		return work.getWEsp2();
   }

  
	/**
	*  set variable wEsp2
	*  @param value
	**/
   public void setWEsp2(char[] value) throws CFException {
      work.setWEsp2(value);
   } 

	/**
	 *	Returns the value of wPunto
	 *	@return wPunto
	 */
   public char[] getWPunto() throws CFException  {              
   		return work.getWPunto();
   }

  
	/**
	*  set variable wPunto
	*  @param value
	**/
   public void setWPunto(char[] value) throws CFException {
      work.setWPunto(value);
   } 


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public PerOPC01OutCtx getPerOPC01OutCtx() {
            return new PerOPC01OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wPartesGroup.hashCode();
        str += work.hashCode();
        str += wPrimLetra.hashCode();
        str += wRespuestaMrGroup.hashCode();
       return str.hashCode();
    }

    public PerOPC01InCtx clone() {
        PerOPC01InCtx cloneObj = new PerOPC01InCtx();
        cloneObj.wPartesGroup = new WPartesGroup();
        cloneObj.wPartesGroup.set(wPartesGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wPrimLetra = new WPrimLetra();
        cloneObj.wPrimLetra.set(wPrimLetra.getClonedField());
        cloneObj.wRespuestaMrGroup = new WRespuestaMrGroup();
        cloneObj.wRespuestaMrGroup.set(wRespuestaMrGroup.getClonedField());
        return cloneObj;
    }

    }

    public PerOPC01InCtx getPerOPC01InCtx() {
            return new PerOPC01InCtx();
    }
     public class PerOPC01OutCtx implements Cloneable {
     WPartesGroup wPartesGroup = Bm8090mCtx.this.getWPartesGroup();
     Work work = Bm8090mCtx.this.getWork();
     WPrimLetra wPrimLetra = Bm8090mCtx.this.getWPrimLetra();
     WRespuestaMrGroup wRespuestaMrGroup = Bm8090mCtx.this.getWRespuestaMrGroup();

	/**
	 *	Returns the value of wRespuestaMr
	 *	@return wRespuestaMr
	 */
   public char[] getWRespuestaMr() throws CFException  {              
   		return wRespuestaMrGroup.getWRespuestaMr();
   }

  
	/**
	*  set variable wRespuestaMr
	*  @param value
	**/
   public void setWRespuestaMr(char[] value) throws CFException {
      wRespuestaMrGroup.setWRespuestaMr(value);
   } 

     /**
	 * 	Update WRespuestaMr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespuestaMr(char[] source, int sourceIndex) throws CFException {
      wRespuestaMrGroup.setWRespuestaMr(source, sourceIndex);
   	
   }
   
   public void setWRespuestaMr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaMrGroup.setWRespuestaMr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WRespuestaMr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespuestaMr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaMrGroup.setWRespuestaMr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WRespuestaMr with another Field
	 *	@param value
	 */
   public void setWRespuestaMr(Field source) {
      wRespuestaMrGroup.setWRespuestaMr(source);
   }  
   
     /**
	 * 	Update WRespuestaMr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespuestaMr(Field source, int sourceIndex,int sourceLen) {
      wRespuestaMrGroup.setWRespuestaMr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WRespuestaMr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespuestaMr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaMrGroup.setWRespuestaMr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getWcntNcar() throws CFException {  
        return work.getWcntNcar();
}
	/**
	 * 	Update WcntNcar with the passed value
	 *	@param number
	 */
	public void setWcntNcar(int number)  throws CFException{
		work.setWcntNcar(number);
	}


	public void setWcntNcar(long number)  throws CFException{
	    work.setWcntNcar(number);
	}
	

	/**
	 *	Returns the value of wNomPer
	 *	@return wNomPer
	 */
   public char[] getWNomPer() throws CFException  {              
   		return work.getWNomPer();
   }

  
	/**
	*  set variable wNomPer
	*  @param value
	**/
   public void setWNomPer(char[] value) throws CFException {
      work.setWNomPer(value);
   } 

public int getWCntString() throws CFException {  
        return work.getWCntString();
}
	/**
	 * 	Update WCntString with the passed value
	 *	@param number
	 */
	public void setWCntString(int number)  throws CFException{
		work.setWCntString(number);
	}


	public void setWCntString(long number)  throws CFException{
	    work.setWCntString(number);
	}
	

	/**
	 *	Returns the value of wpapPer01
	 *	@return wpapPer01
	 */
   public char[] getWpapPer01() throws CFException  {              
   		return work.getWpapPer01();
   }

  
	/**
	*  set variable wpapPer01
	*  @param value
	**/
   public void setWpapPer01(char[] value) throws CFException {
      work.setWpapPer01(value);
   } 

	/**
	 *	Returns the value of wPapPer
	 *	@return wPapPer
	 */
   public char[] getWPapPer() throws CFException  {              
   		return work.getWPapPer();
   }

  
	/**
	*  set variable wPapPer
	*  @param value
	**/
   public void setWPapPer(char[] value) throws CFException {
      work.setWPapPer(value);
   } 

	/**
	 *	Returns the value of wNomRed
	 *	@return wNomRed
	 */
   public char[] getWNomRed() throws CFException  {              
   		return work.getWNomRed();
   }

  
	/**
	*  set variable wNomRed
	*  @param value
	**/
   public void setWNomRed(char[] value) throws CFException {
      work.setWNomRed(value);
   } 

	/**
	 *	Returns the value of wPartes
	 *	@return wPartes
	 */
   public char[] getWPartes() throws CFException  {              
   		return wPartesGroup.getWPartes();
   }

  
	/**
	*  set variable wPartes
	*  @param value
	**/
   public void setWPartes(char[] value) throws CFException {
      wPartesGroup.setWPartes(value);
   } 

     /**
	 * 	Update WPartes 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPartes(char[] source, int sourceIndex) throws CFException {
      wPartesGroup.setWPartes(source, sourceIndex);
   	
   }
   
   public void setWPartes(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wPartesGroup.setWPartes(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WPartes 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPartes(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wPartesGroup.setWPartes(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WPartes with another Field
	 *	@param value
	 */
   public void setWPartes(Field source) {
      wPartesGroup.setWPartes(source);
   }  
   
     /**
	 * 	Update WPartes 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPartes(Field source, int sourceIndex,int sourceLen) {
      wPartesGroup.setWPartes(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WPartes 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPartes(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wPartesGroup.setWPartes(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPrimLetra
	 *	@return wPrimLetra
	 */   
	 public WPrimLetra getWPrimLetra() {
   	return wPrimLetra;
   }


	/**
	 *	Returns the value of wLetra
	 *	@return wLetra
	 */
   public char[] getWLetra() throws CFException  {              
   		return wPrimLetra.getWLetra();
   }

  
	/**
	*  set variable wLetra
	*  @param value
	**/
   public void setWLetra(char[] value) throws CFException {
      wPrimLetra.setWLetra(value);
   } 

     /**
	 * 	Update WLetra 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWLetra(char[] source, int sourceIndex) throws CFException {
      wPrimLetra.setWLetra(source, sourceIndex);
   	
   }
   
   public void setWLetra(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wPrimLetra.setWLetra(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WLetra 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWLetra(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wPrimLetra.setWLetra(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WLetra with another Field
	 *	@param value
	 */
   public void setWLetra(Field source) {
      wPrimLetra.setWLetra(source);
   }  
   
     /**
	 * 	Update WLetra 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWLetra(Field source, int sourceIndex,int sourceLen) {
      wPrimLetra.setWLetra(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WLetra 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWLetra(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wPrimLetra.setWLetra(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wRespMr1
	 *	@return wRespMr1
	 */
   public char[] getWRespMr1() throws CFException  {              
   		return wRespuestaMrGroup.getWRespuMr().getWRespMr1();
   }

  
	/**
	*  set variable wRespMr1
	*  @param value
	**/
   public void setWRespMr1(char[] value) throws CFException {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(value);
   } 

     /**
	 * 	Update WRespMr1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespMr1(char[] source, int sourceIndex) throws CFException {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex);
   	
   }
   
   public void setWRespMr1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WRespMr1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespMr1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WRespMr1 with another Field
	 *	@param value
	 */
   public void setWRespMr1(Field source) {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source);
   }  
   
     /**
	 * 	Update WRespMr1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespMr1(Field source, int sourceIndex,int sourceLen) {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WRespMr1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespMr1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaMrGroup.getWRespuMr().setWRespMr1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wPartesGroup.hashCode();
        str += work.hashCode();
        str += wPrimLetra.hashCode();
        str += wRespuestaMrGroup.hashCode();
       return str.hashCode();
    }

    public PerOPC01OutCtx clone() {
        PerOPC01OutCtx cloneObj = new PerOPC01OutCtx();
        cloneObj.wPartesGroup = new WPartesGroup();
        cloneObj.wPartesGroup.set(wPartesGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wPrimLetra = new WPrimLetra();
        cloneObj.wPrimLetra.set(wPrimLetra.getClonedField());
        cloneObj.wRespuestaMrGroup = new WRespuestaMrGroup();
        cloneObj.wRespuestaMrGroup.set(wRespuestaMrGroup.getClonedField());
        return cloneObj;
    }

    }

    public PerOPC01OutCtx getPerOPC01OutCtx() {
            return new PerOPC01OutCtx();
    }
     public class PerOPC02InCtx implements Cloneable {
     Work work = Bm8090mCtx.this.getWork();
     WRespuestaRGroup wRespuestaRGroup = Bm8090mCtx.this.getWRespuestaRGroup();

	/**
	 *	Returns the value of wAster
	 *	@return wAster
	 */
   public char[] getWAster() throws CFException  {              
   		return work.getWAster();
   }

  
	/**
	*  set variable wAster
	*  @param value
	**/
   public void setWAster(char[] value) throws CFException {
      work.setWAster(value);
   } 

	/**
	 *	Returns the value of wNomPer
	 *	@return wNomPer
	 */
   public char[] getWNomPer() throws CFException  {              
   		return work.getWNomPer();
   }

  
	/**
	*  set variable wNomPer
	*  @param value
	**/
   public void setWNomPer(char[] value) throws CFException {
      work.setWNomPer(value);
   } 

	/**
	 *	Returns the value of wPapPer
	 *	@return wPapPer
	 */
   public char[] getWPapPer() throws CFException  {              
   		return work.getWPapPer();
   }

  
	/**
	*  set variable wPapPer
	*  @param value
	**/
   public void setWPapPer(char[] value) throws CFException {
      work.setWPapPer(value);
   } 

	/**
	 *	Returns the value of wRespR1
	 *	@return wRespR1
	 */
   public char[] getWRespR1() throws CFException  {              
   		return wRespuestaRGroup.getWRespuR().getWRespR1();
   }

  
	/**
	*  set variable wRespR1
	*  @param value
	**/
   public void setWRespR1(char[] value) throws CFException {
      wRespuestaRGroup.getWRespuR().setWRespR1(value);
   } 

     /**
	 * 	Update WRespR1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespR1(char[] source, int sourceIndex) throws CFException {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex);
   	
   }
   
   public void setWRespR1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WRespR1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespR1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WRespR1 with another Field
	 *	@param value
	 */
   public void setWRespR1(Field source) {
      wRespuestaRGroup.getWRespuR().setWRespR1(source);
   }  
   
     /**
	 * 	Update WRespR1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespR1(Field source, int sourceIndex,int sourceLen) {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WRespR1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespR1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wEsp2
	 *	@return wEsp2
	 */
   public char[] getWEsp2() throws CFException  {              
   		return work.getWEsp2();
   }

  
	/**
	*  set variable wEsp2
	*  @param value
	**/
   public void setWEsp2(char[] value) throws CFException {
      work.setWEsp2(value);
   } 


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public PerOPC02OutCtx getPerOPC02OutCtx() {
            return new PerOPC02OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
        str += wRespuestaRGroup.hashCode();
       return str.hashCode();
    }

    public PerOPC02InCtx clone() {
        PerOPC02InCtx cloneObj = new PerOPC02InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wRespuestaRGroup = new WRespuestaRGroup();
        cloneObj.wRespuestaRGroup.set(wRespuestaRGroup.getClonedField());
        return cloneObj;
    }

    }

    public PerOPC02InCtx getPerOPC02InCtx() {
            return new PerOPC02InCtx();
    }
     public class PerOPC02OutCtx implements Cloneable {
     Work work = Bm8090mCtx.this.getWork();
     WRespuestaRGroup wRespuestaRGroup = Bm8090mCtx.this.getWRespuestaRGroup();

public int getWcntNcar() throws CFException {  
        return work.getWcntNcar();
}
	/**
	 * 	Update WcntNcar with the passed value
	 *	@param number
	 */
	public void setWcntNcar(int number)  throws CFException{
		work.setWcntNcar(number);
	}


	public void setWcntNcar(long number)  throws CFException{
	    work.setWcntNcar(number);
	}
	

	/**
	 *	Returns the value of wNomPer
	 *	@return wNomPer
	 */
   public char[] getWNomPer() throws CFException  {              
   		return work.getWNomPer();
   }

  
	/**
	*  set variable wNomPer
	*  @param value
	**/
   public void setWNomPer(char[] value) throws CFException {
      work.setWNomPer(value);
   } 

public int getWCntString() throws CFException {  
        return work.getWCntString();
}
	/**
	 * 	Update WCntString with the passed value
	 *	@param number
	 */
	public void setWCntString(int number)  throws CFException{
		work.setWCntString(number);
	}


	public void setWCntString(long number)  throws CFException{
	    work.setWCntString(number);
	}
	

	/**
	 *	Returns the value of wNomApe
	 *	@return wNomApe
	 */
   public char[] getWNomApe() throws CFException  {              
   		return work.getWNomApe();
   }

  
	/**
	*  set variable wNomApe
	*  @param value
	**/
   public void setWNomApe(char[] value) throws CFException {
      work.setWNomApe(value);
   } 

	/**
	 *	Returns the value of wpapPer01
	 *	@return wpapPer01
	 */
   public char[] getWpapPer01() throws CFException  {              
   		return work.getWpapPer01();
   }

  
	/**
	*  set variable wpapPer01
	*  @param value
	**/
   public void setWpapPer01(char[] value) throws CFException {
      work.setWpapPer01(value);
   } 

	/**
	 *	Returns the value of wPapPer
	 *	@return wPapPer
	 */
   public char[] getWPapPer() throws CFException  {              
   		return work.getWPapPer();
   }

  
	/**
	*  set variable wPapPer
	*  @param value
	**/
   public void setWPapPer(char[] value) throws CFException {
      work.setWPapPer(value);
   } 

	/**
	 *	Returns the value of wRespuestaR
	 *	@return wRespuestaR
	 */
   public char[] getWRespuestaR() throws CFException  {              
   		return wRespuestaRGroup.getWRespuestaR();
   }

  
	/**
	*  set variable wRespuestaR
	*  @param value
	**/
   public void setWRespuestaR(char[] value) throws CFException {
      wRespuestaRGroup.setWRespuestaR(value);
   } 

     /**
	 * 	Update WRespuestaR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespuestaR(char[] source, int sourceIndex) throws CFException {
      wRespuestaRGroup.setWRespuestaR(source, sourceIndex);
   	
   }
   
   public void setWRespuestaR(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaRGroup.setWRespuestaR(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WRespuestaR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespuestaR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaRGroup.setWRespuestaR(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WRespuestaR with another Field
	 *	@param value
	 */
   public void setWRespuestaR(Field source) {
      wRespuestaRGroup.setWRespuestaR(source);
   }  
   
     /**
	 * 	Update WRespuestaR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespuestaR(Field source, int sourceIndex,int sourceLen) {
      wRespuestaRGroup.setWRespuestaR(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WRespuestaR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespuestaR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaRGroup.setWRespuestaR(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wRespR1
	 *	@return wRespR1
	 */
   public char[] getWRespR1() throws CFException  {              
   		return wRespuestaRGroup.getWRespuR().getWRespR1();
   }

  
	/**
	*  set variable wRespR1
	*  @param value
	**/
   public void setWRespR1(char[] value) throws CFException {
      wRespuestaRGroup.getWRespuR().setWRespR1(value);
   } 

     /**
	 * 	Update WRespR1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespR1(char[] source, int sourceIndex) throws CFException {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex);
   	
   }
   
   public void setWRespR1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WRespR1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespR1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WRespR1 with another Field
	 *	@param value
	 */
   public void setWRespR1(Field source) {
      wRespuestaRGroup.getWRespuR().setWRespR1(source);
   }  
   
     /**
	 * 	Update WRespR1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespR1(Field source, int sourceIndex,int sourceLen) {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WRespR1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespR1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wRespuestaRGroup.getWRespuR().setWRespR1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wnomPer01
	 *	@return wnomPer01
	 */
   public char[] getWnomPer01() throws CFException  {              
   		return work.getWnomPer01();
   }

  
	/**
	*  set variable wnomPer01
	*  @param value
	**/
   public void setWnomPer01(char[] value) throws CFException {
      work.setWnomPer01(value);
   } 


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
        str += wRespuestaRGroup.hashCode();
       return str.hashCode();
    }

    public PerOPC02OutCtx clone() {
        PerOPC02OutCtx cloneObj = new PerOPC02OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wRespuestaRGroup = new WRespuestaRGroup();
        cloneObj.wRespuestaRGroup.set(wRespuestaRGroup.getClonedField());
        return cloneObj;
    }

    }

    public PerOPC02OutCtx getPerOPC02OutCtx() {
            return new PerOPC02OutCtx();
    }
     public class Final8000InCtx implements Cloneable {
     IoPe8090p ioPe8090p = Bm8090mCtx.this.getIoPe8090p();
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wTitCtaPe8090m
	 *	@return wTitCtaPe8090m
	 */
   public char[] getWTitCtaPe8090m() throws CFException  {              
   		return section.getWTitCtaPe8090m();
   }

  
	/**
	*  set variable wTitCtaPe8090m
	*  @param value
	**/
   public void setWTitCtaPe8090m(char[] value) throws CFException {
      section.setWTitCtaPe8090m(value);
   } 

     /**
	 * 	Update WTitCtaPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitCtaPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWTitCtaPe8090m(source, sourceIndex);
   	
   }
   
   public void setWTitCtaPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitCtaPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WTitCtaPe8090m with another Field
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source) {
      section.setWTitCtaPe8090m(source);
   }  
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of section
	 *	@return section
	 */   
	 public Section getSection() {
   	return section;
   }


	/**
	 *	Returns the value of wAster
	 *	@return wAster
	 */
   public char[] getWAster() throws CFException  {              
   		return work.getWAster();
   }

  
	/**
	*  set variable wAster
	*  @param value
	**/
   public void setWAster(char[] value) throws CFException {
      work.setWAster(value);
   } 

	/**
	 *	Returns the value of wSegTroPe8090m
	 *	@return wSegTroPe8090m
	 */
   public char[] getWSegTroPe8090m() throws CFException  {              
   		return section.getWSegTroPe8090m();
   }

  
	/**
	*  set variable wSegTroPe8090m
	*  @param value
	**/
   public void setWSegTroPe8090m(char[] value) throws CFException {
      section.setWSegTroPe8090m(value);
   } 

     /**
	 * 	Update WSegTroPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWSegTroPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWSegTroPe8090m(source, sourceIndex);
   	
   }
   
   public void setWSegTroPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWSegTroPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WSegTroPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWSegTroPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWSegTroPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WSegTroPe8090m with another Field
	 *	@param value
	 */
   public void setWSegTroPe8090m(Field source) {
      section.setWSegTroPe8090m(source);
   }  
   
     /**
	 * 	Update WSegTroPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWSegTroPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWSegTroPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WSegTroPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWSegTroPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWSegTroPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPriTroPe8090m
	 *	@return wPriTroPe8090m
	 */
   public char[] getWPriTroPe8090m() throws CFException  {              
   		return section.getWPriTroPe8090m();
   }

  
	/**
	*  set variable wPriTroPe8090m
	*  @param value
	**/
   public void setWPriTroPe8090m(char[] value) throws CFException {
      section.setWPriTroPe8090m(value);
   } 

     /**
	 * 	Update WPriTroPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPriTroPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWPriTroPe8090m(source, sourceIndex);
   	
   }
   
   public void setWPriTroPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWPriTroPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WPriTroPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPriTroPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWPriTroPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WPriTroPe8090m with another Field
	 *	@param value
	 */
   public void setWPriTroPe8090m(Field source) {
      section.setWPriTroPe8090m(source);
   }  
   
     /**
	 * 	Update WPriTroPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPriTroPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWPriTroPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WPriTroPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPriTroPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWPriTroPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }

        public Final8000OutCtx getFinal8000OutCtx() {
            return new Final8000OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ioPe8090p.hashCode();
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Final8000InCtx clone() {
        Final8000InCtx cloneObj = new Final8000InCtx();
        cloneObj.ioPe8090p = new IoPe8090p();
        cloneObj.ioPe8090p.set(ioPe8090p.getClonedField());
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Final8000InCtx getFinal8000InCtx() {
            return new Final8000InCtx();
    }
     public class Final8000OutCtx implements Cloneable {
     IoPe8090p ioPe8090p = Bm8090mCtx.this.getIoPe8090p();
     Section section = Bm8090mCtx.this.getSection();
     Work work = Bm8090mCtx.this.getWork();

	/**
	 *	Returns the value of wTitCtaPe8090m
	 *	@return wTitCtaPe8090m
	 */
   public char[] getWTitCtaPe8090m() throws CFException  {              
   		return section.getWTitCtaPe8090m();
   }

  
	/**
	*  set variable wTitCtaPe8090m
	*  @param value
	**/
   public void setWTitCtaPe8090m(char[] value) throws CFException {
      section.setWTitCtaPe8090m(value);
   } 

     /**
	 * 	Update WTitCtaPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitCtaPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWTitCtaPe8090m(source, sourceIndex);
   	
   }
   
   public void setWTitCtaPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitCtaPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WTitCtaPe8090m with another Field
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source) {
      section.setWTitCtaPe8090m(source);
   }  
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitCtaPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of section
	 *	@return section
	 */   
	 public Section getSection() {
   	return section;
   }


	/**
	 *	Returns the value of wSegTroAux
	 *	@return wSegTroAux
	 */
   public char[] getWSegTroAux() throws CFException  {              
   		return section.getWSegTroAux();
   }

  
	/**
	*  set variable wSegTroAux
	*  @param value
	**/
   public void setWSegTroAux(char[] value) throws CFException {
      section.setWSegTroAux(value);
   } 

     /**
	 * 	Update WSegTroAux 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWSegTroAux(char[] source, int sourceIndex) throws CFException {
      section.setWSegTroAux(source, sourceIndex);
   	
   }
   
   public void setWSegTroAux(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWSegTroAux(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WSegTroAux 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWSegTroAux(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWSegTroAux(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WSegTroAux with another Field
	 *	@param value
	 */
   public void setWSegTroAux(Field source) {
      section.setWSegTroAux(source);
   }  
   
     /**
	 * 	Update WSegTroAux 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWSegTroAux(Field source, int sourceIndex,int sourceLen) {
      section.setWSegTroAux(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WSegTroAux 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWSegTroAux(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWSegTroAux(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wTitCtaAux
	 *	@return wTitCtaAux
	 */
   public char[] getWTitCtaAux() throws CFException  {              
   		return section.getWTitCtaAux();
   }

  
	/**
	*  set variable wTitCtaAux
	*  @param value
	**/
   public void setWTitCtaAux(char[] value) throws CFException {
      section.setWTitCtaAux(value);
   } 

     /**
	 * 	Update WTitCtaAux 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitCtaAux(char[] source, int sourceIndex) throws CFException {
      section.setWTitCtaAux(source, sourceIndex);
   	
   }
   
   public void setWTitCtaAux(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWTitCtaAux(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WTitCtaAux 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitCtaAux(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitCtaAux(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WTitCtaAux with another Field
	 *	@param value
	 */
   public void setWTitCtaAux(Field source) {
      section.setWTitCtaAux(source);
   }  
   
     /**
	 * 	Update WTitCtaAux 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitCtaAux(Field source, int sourceIndex,int sourceLen) {
      section.setWTitCtaAux(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WTitCtaAux 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitCtaAux(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWTitCtaAux(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPriTroAux
	 *	@return wPriTroAux
	 */
   public char[] getWPriTroAux() throws CFException  {              
   		return section.getWPriTroAux();
   }

  
	/**
	*  set variable wPriTroAux
	*  @param value
	**/
   public void setWPriTroAux(char[] value) throws CFException {
      section.setWPriTroAux(value);
   } 

     /**
	 * 	Update WPriTroAux 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPriTroAux(char[] source, int sourceIndex) throws CFException {
      section.setWPriTroAux(source, sourceIndex);
   	
   }
   
   public void setWPriTroAux(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWPriTroAux(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WPriTroAux 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPriTroAux(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWPriTroAux(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WPriTroAux with another Field
	 *	@param value
	 */
   public void setWPriTroAux(Field source) {
      section.setWPriTroAux(source);
   }  
   
     /**
	 * 	Update WPriTroAux 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPriTroAux(Field source, int sourceIndex,int sourceLen) {
      section.setWPriTroAux(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WPriTroAux 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPriTroAux(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWPriTroAux(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wSegTroPe8090m
	 *	@return wSegTroPe8090m
	 */
   public char[] getWSegTroPe8090m() throws CFException  {              
   		return section.getWSegTroPe8090m();
   }

  
	/**
	*  set variable wSegTroPe8090m
	*  @param value
	**/
   public void setWSegTroPe8090m(char[] value) throws CFException {
      section.setWSegTroPe8090m(value);
   } 

     /**
	 * 	Update WSegTroPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWSegTroPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWSegTroPe8090m(source, sourceIndex);
   	
   }
   
   public void setWSegTroPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWSegTroPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WSegTroPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWSegTroPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWSegTroPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WSegTroPe8090m with another Field
	 *	@param value
	 */
   public void setWSegTroPe8090m(Field source) {
      section.setWSegTroPe8090m(source);
   }  
   
     /**
	 * 	Update WSegTroPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWSegTroPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWSegTroPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WSegTroPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWSegTroPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWSegTroPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pe00tc02
	 *	@return pe00tc02
	 */
   public char[] getPe00tc02() throws CFException  {              
   		return ioPe8090p.getPe8090p().getPe00tc02();
   }

  
	/**
	*  set variable pe00tc02
	*  @param value
	**/
   public void setPe00tc02(char[] value) throws CFException {
      ioPe8090p.getPe8090p().setPe00tc02(value);
   } 

     /**
	 * 	Update Pe00tc02 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPe00tc02(char[] source, int sourceIndex) throws CFException {
      ioPe8090p.getPe8090p().setPe00tc02(source, sourceIndex);
   	
   }
   
   public void setPe00tc02(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ioPe8090p.getPe8090p().setPe00tc02(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Pe00tc02 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPe00tc02(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().setPe00tc02(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Pe00tc02 with another Field
	 *	@param value
	 */
   public void setPe00tc02(Field source) {
      ioPe8090p.getPe8090p().setPe00tc02(source);
   }  
   
     /**
	 * 	Update Pe00tc02 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPe00tc02(Field source, int sourceIndex,int sourceLen) {
      ioPe8090p.getPe8090p().setPe00tc02(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Pe00tc02 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPe00tc02(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().setPe00tc02(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pe00tc01
	 *	@return pe00tc01
	 */
   public char[] getPe00tc01() throws CFException  {              
   		return ioPe8090p.getPe8090p().getPe00tc01();
   }

  
	/**
	*  set variable pe00tc01
	*  @param value
	**/
   public void setPe00tc01(char[] value) throws CFException {
      ioPe8090p.getPe8090p().setPe00tc01(value);
   } 

     /**
	 * 	Update Pe00tc01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPe00tc01(char[] source, int sourceIndex) throws CFException {
      ioPe8090p.getPe8090p().setPe00tc01(source, sourceIndex);
   	
   }
   
   public void setPe00tc01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ioPe8090p.getPe8090p().setPe00tc01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Pe00tc01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPe00tc01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().setPe00tc01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Pe00tc01 with another Field
	 *	@param value
	 */
   public void setPe00tc01(Field source) {
      ioPe8090p.getPe8090p().setPe00tc01(source);
   }  
   
     /**
	 * 	Update Pe00tc01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPe00tc01(Field source, int sourceIndex,int sourceLen) {
      ioPe8090p.getPe8090p().setPe00tc01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Pe00tc01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPe00tc01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().setPe00tc01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wPriTroPe8090m
	 *	@return wPriTroPe8090m
	 */
   public char[] getWPriTroPe8090m() throws CFException  {              
   		return section.getWPriTroPe8090m();
   }

  
	/**
	*  set variable wPriTroPe8090m
	*  @param value
	**/
   public void setWPriTroPe8090m(char[] value) throws CFException {
      section.setWPriTroPe8090m(value);
   } 

     /**
	 * 	Update WPriTroPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPriTroPe8090m(char[] source, int sourceIndex) throws CFException {
      section.setWPriTroPe8090m(source, sourceIndex);
   	
   }
   
   public void setWPriTroPe8090m(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      section.setWPriTroPe8090m(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WPriTroPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPriTroPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWPriTroPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WPriTroPe8090m with another Field
	 *	@param value
	 */
   public void setWPriTroPe8090m(Field source) {
      section.setWPriTroPe8090m(source);
   }  
   
     /**
	 * 	Update WPriTroPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPriTroPe8090m(Field source, int sourceIndex,int sourceLen) {
      section.setWPriTroPe8090m(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WPriTroPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPriTroPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      section.setWPriTroPe8090m(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pe00tc00
	 *	@return pe00tc00
	 */
   public char[] getPe00tc00() throws CFException  {              
   		return ioPe8090p.getPe8090p().getPe00tc00();
   }

  
	/**
	*  set variable pe00tc00
	*  @param value
	**/
   public void setPe00tc00(char[] value) throws CFException {
      ioPe8090p.getPe8090p().setPe00tc00(value);
   } 

     /**
	 * 	Update Pe00tc00 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPe00tc00(char[] source, int sourceIndex) throws CFException {
      ioPe8090p.getPe8090p().setPe00tc00(source, sourceIndex);
   	
   }
   
   public void setPe00tc00(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ioPe8090p.getPe8090p().setPe00tc00(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Pe00tc00 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPe00tc00(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().setPe00tc00(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Pe00tc00 with another Field
	 *	@param value
	 */
   public void setPe00tc00(Field source) {
      ioPe8090p.getPe8090p().setPe00tc00(source);
   }  
   
     /**
	 * 	Update Pe00tc00 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPe00tc00(Field source, int sourceIndex,int sourceLen) {
      ioPe8090p.getPe8090p().setPe00tc00(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Pe00tc00 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPe00tc00(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioPe8090p.getPe8090p().setPe00tc00(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Bm8090mCtx getBm8090mCtx() {
            return Bm8090mCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ioPe8090p.hashCode();
        str += section.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Final8000OutCtx clone() {
        Final8000OutCtx cloneObj = new Final8000OutCtx();
        cloneObj.ioPe8090p = new IoPe8090p();
        cloneObj.ioPe8090p.set(ioPe8090p.getClonedField());
        cloneObj.section = new Section();
        cloneObj.section.set(section.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Final8000OutCtx getFinal8000OutCtx() {
            return new Final8000OutCtx();
    }
}
