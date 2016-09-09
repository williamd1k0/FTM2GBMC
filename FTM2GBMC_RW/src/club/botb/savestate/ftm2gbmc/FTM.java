/*
 * Copyright (C) 2016 Joseph El-Khouri
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package club.botb.savestate.ftm2gbmc;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Joseph El-Khouri
 */
public class FTM {

    private static final String VERSION = "# FamiTracker text export 0.4.2";
    
    // Song information
    private String title;
    private String author;
    private String copyright;
    
    // Song comments
    private ArrayList<String> comments;
    
    // Global settings
    private int machine;
    private int framerate;
    private int expansion;
    private int vibrato;
    private int split;
    
    // Namco N163 global settings
    private int n163channels;
    
    // Macros
    private HashMap<Integer, FTMMacro> volumeMacros;
    private HashMap<Integer, FTMMacro> pitchMacros;
    private HashMap<Integer, FTMMacro> dutyMacros;
    private HashMap<Integer, FTMMacro> arpeggioMacros;
    
    // DPCM samples
    private HashMap<Integer, FTMDPCMSample> dpcmSamples;
    
    // Instruments
    private HashMap<Integer, FTMN163Instrument> waveInstruments;
    private HashMap<Integer, FTM2A03Instrument> standardInstruments;
    
    // Tracks
    private ArrayList<FTMTrack> tracks;
    
}
