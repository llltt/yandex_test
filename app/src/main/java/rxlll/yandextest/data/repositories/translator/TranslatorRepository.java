package rxlll.yandextest.data.repositories.translator;

import io.reactivex.Single;
import retrofit2.Response;
import rxlll.yandextest.data.network.models.translator.Detect;
import rxlll.yandextest.data.network.models.translator.Langs;
import rxlll.yandextest.data.network.models.translator.Translate;

/** Created by Maksim Sukhotski on 4/14/2017. */

public interface TranslatorRepository {

    Single<Response<Translate>> translate(String text,
                                          String lang);

    Single<Response<Translate>> translate(String text,
                                          String lang,
                                          String options);

    Single<Response<Detect>> detect(String text);

    Single<Response<Detect>> detect(String text,
                                    String hint);

    Single<Response<Langs>> getLangs(String ui);

//    Completable putLangs(Langs langs);
}
