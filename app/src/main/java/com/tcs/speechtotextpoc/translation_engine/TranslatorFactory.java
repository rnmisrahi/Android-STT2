package com.tcs.speechtotextpoc.translation_engine;

import com.tcs.speechtotextpoc.translation_engine.translators.IConvertor;
import com.tcs.speechtotextpoc.translation_engine.translators.SpeechToTextConvertor;
import com.tcs.speechtotextpoc.translation_engine.utils.ConversionCallaback;

/**
 * Created by Hitesh on 12-07-2016.
 * <p/>
 * This Factory class return object of TTS or STT dependending on input enum TRANSLATOR_TYPE
 */
public class TranslatorFactory {

    private static TranslatorFactory ourInstance = new TranslatorFactory();

    private TranslatorFactory() {
    }

    public static TranslatorFactory getInstance() {
        return ourInstance;
    }

    /**
     * Factory method to return object of STT or TTS
     *
     * @param conversionCallaback
     * @return
     */
    public IConvertor getTranslator(ConversionCallaback conversionCallaback) {
                //Get speech to text translator
                return new SpeechToTextConvertor(conversionCallaback);
    }
}
