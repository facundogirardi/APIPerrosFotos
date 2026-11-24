# APIPerrosFotos

Aplicación **Android** en **Kotlin** que busca fotos de perros por raza usando la API pública [Dog CEO](https://dog.ceo/dog-api/).

Escribís una raza en el buscador (por ejemplo `husky` o `beagle`) y la app muestra en una lista todas las fotos que devuelve la API para esa raza.

## Tecnologia

* Kotlin + View Binding
* [Retrofit 2](https://square.github.io/retrofit/) + Gson para consumir la API
* Kotlin Coroutines para las llamadas asíncronas
* [Picasso](https://square.github.io/picasso/) para cargar las imágenes
* RecyclerView para la lista
* [Detekt](https://detekt.dev/) para el análisis estático (configuración en `config/detekt/detekt.yml`)

## Estructura

| Archivo | Descripción |
|---------|-------------|
| `MainActivity.kt` | Buscador (`SearchView`) y llamada a la API |
| `APIService.kt` | Interfaz Retrofit: `GET https://dog.ceo/api/breed/{raza}/images` |
| `PerrosResponse.kt` | Modelo de la respuesta (`status`, `message`) |
| `PerrosAdapter.kt` / `PerrosView.kt` | Adapter y ViewHolder del RecyclerView |

## Cómo ejecutarlo

### Requisitos

* Android Studio (Flamingo o superior)
* JDK 17 (el que trae Android Studio)
* Android SDK 33

### Pasos

```bash
git clone https://github.com/facundogirardi/APIPerrosFotos.git
```

1. Abrir la carpeta en Android Studio y esperar la sincronización de Gradle
2. Ejecutar la configuración `app` en un emulador o dispositivo con Android 7.0 (API 24) o superior

Desde la terminal:

```bash
./gradlew assembleDebug   # genera el APK de debug
./gradlew detekt          # corre el análisis estático
```

## Versiones

| Componente | Versión |
|------------|---------|
| Gradle | 8.0 |
| Android Gradle Plugin | 8.0.2 |
| Kotlin | 1.8.20 |
| compileSdk / targetSdk | 33 |
| minSdk | 24 |

Para actualizar Gradle, el Android Gradle Plugin y las librerías conviene usar el **AGP Upgrade Assistant** de Android Studio (*Tools → AGP Upgrade Assistant*), que también ajusta `compileSdk` y `targetSdk`.
