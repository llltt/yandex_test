package rxlll.yandextest.data.repositories.preferences;

import android.util.Pair;

import java.util.Set;

import io.reactivex.Completable;
import io.reactivex.Single;
import rxlll.yandextest.data.repositories.database.Lang;

/**
 * Created by Maksim Sukhotski on 4/14/2017.
 */

public interface PreferencesRepository {

    Completable putDirs(Set<String> langs);

    Single<Set<String>> getDirs();

    Completable putDir(Pair<Lang, Lang> dir);

    Single<Pair<Lang, Lang>> getDir();

    Completable putAutoDetectSetting(boolean isTurnedOn);

    Single<Boolean> getAutoDetectSetting();


}
