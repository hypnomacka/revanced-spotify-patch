package app.revanced.patches.spotify.layout.theme

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.patch.options.PatchOption.PatchExtensions.stringPatchOption
import org.w3c.dom.Element

@Patch(
    name = "Custom theme",
    description = "Applies a custom theme.",
    compatiblePackages = [CompatiblePackage("com.spotify.music")]
)
@Suppress("unused")
object CustomThemePatch : ResourcePatch() {

    override fun execute(context: ResourceContext) {
        context.xmlEditor["res/values/colors.xml"].use { editor ->
            val resourcesNode = editor.file.getElementsByTagName("resources").item(0) as Element

            for (i in 0 until resourcesNode.childNodes.length) {
                val node = resourcesNode.childNodes.item(i) as? Element ?: continue

                node.textContent = when (node.getAttribute("name")) {

                    "dark_base_background_elevated_base", "design_dark_default_color_background",
                    "design_dark_default_color_surface", "gray_7", "gray_background", "gray_layer",
                    "sthlm_blk" -> "@android:color/black"
                    
                    "abc_search_url_text_normal" -> "#ff3e99a5"
                    
                    "adanalyticslight_base_essential_brightaccent" -> "#ff35858c"
                    
                    "adanalyticslight_base_essential_positive", "advertisinglight_base_essential_positive", "anchorlight_base_essential_positive", "light_base_essential_brightaccent", "light_base_essential_positive", "megaphonelight_base_essential_positive", "quicksilverlight_base_essential_positive", "s4plight_base_essential_positive", "studiolight_base_essential_positive" -> "#ff31779e"
                    
                    "adanalyticslight_base_text_brightaccent" -> "#ff37877c"
                    
                    "adanalyticslight_base_text_positive", "advertisinglight_base_text_positive", "anchorlight_base_text_positive", "creatorlight_base_text_positive", "light_base_text_brightaccent", "light_base_text_positive", "megaphonelight_base_text_positive", "quicksilverlight_base_text_positive", "s4plight_base_text_positive", "studiolight_base_text_positive" -> "#ff2d6e91"
                    
                    "adanalyticslight_brightaccent_background_base", "adanalyticslight_inverteddark_essential_brightaccent", "adanalyticslight_inverteddark_text_brightaccent", "adanalyticslight_mutedaccent_essential_brightaccent", "adanalyticslight_mutedaccent_text_brightaccent", "premiummini_background_base" -> "#ff6ba0ce"
                    
                    "adanalyticslight_brightaccent_background_highlight", "premiummini_background_highlight" -> "#ff98c7e0"
                    
                    "adanalyticslight_brightaccent_background_press", "premiummini_background_press" -> "#ff44a8aa"
                    
                    "adanalyticslight_brightaccent_decorative_subdued", "premiummini_decorative_subdued" -> "#ff44d1ba"
                    
                    "adanalyticslight_invertedlight_essential_brightaccent" -> "#ff2e8274"
                    
                    "adanalyticslight_invertedlight_text_brightaccent" -> "#ff25685d"
                    
                    "adanalyticslight_positive_background_base", "advertisingdark_base_essential_positive", "advertisingdark_base_text_positive", "advertisingdark_positive_background_base", "advertisinglight_positive_background_base", "anchorlight_positive_background_base", "connect_device_green", "creatordark_base_essential_positive", "creatordark_base_text_positive", "creatordark_positive_background_base", "creatorlight_positive_background_base", "dark_base_essential_brightaccent", "dark_base_essential_positive", "dark_base_text_brightaccent", "dark_base_text_positive", "dark_brightaccent_background_base", "dark_inverteddark_essential_brightaccent", "dark_inverteddark_text_brightaccent", "dark_mutedaccent_essential_brightaccent", "dark_mutedaccent_text_brightaccent", "dark_positive_background_base", "green_157", "green_light", "light_brightaccent_background_base", "light_inverteddark_essential_brightaccent", "light_inverteddark_text_brightaccent", "light_mutedaccent_essential_brightaccent", "light_mutedaccent_text_brightaccent", "light_positive_background_base", "local_files_fill", "megaphonelight_positive_background_base", "overtimedark_base_essential_positive", "overtimedark_base_text_positive", "overtimedark_positive_background_base", "quicksilverlight_positive_background_base", "s4pdark_base_essential_positive", "s4pdark_base_text_positive", "s4pdark_positive_background_base", "s4plight_positive_background_base", "spotify_green_157", "spotifybrand_decorative_base", "spotifybrand_essential_base", "spotifybrand_text_base", "spotifybrandalternate_background_base", "studiolight_positive_background_base", "view_all_results_text", "yourspotify_icon_check_alt_fill" -> "#ff44a8e1"
                    
                    "adanalyticslight_positive_background_highlight", "advertisingdark_positive_background_highlight", "advertisinglight_positive_background_highlight", "anchorlight_positive_background_highlight", "creatordark_positive_background_highlight", "creatorlight_positive_background_highlight", "dark_brightaccent_background_highlight", "dark_positive_background_highlight", "light_brightaccent_background_highlight", "light_positive_background_highlight", "megaphonelight_positive_background_highlight", "overtimedark_positive_background_highlight", "quicksilverlight_positive_background_highlight", "s4pdark_positive_background_highlight", "s4plight_positive_background_highlight", "spotifybrandalternate_background_highlight", "studiolight_positive_background_highlight" -> "#ff4cace0"
                    
                    "adanalyticslight_positive_background_press", "advertisingdark_positive_background_press", "advertisinglight_positive_background_press", "anchorlight_positive_background_press", "creatordark_positive_background_press", "creatorlight_positive_background_press", "dark_brightaccent_background_press", "dark_positive_background_press", "light_brightaccent_background_press", "light_positive_background_press", "megaphonelight_positive_background_press", "overtimedark_positive_background_press", "quicksilverlight_positive_background_press", "s4pdark_positive_background_press", "s4plight_positive_background_press", "spotifybrandalternate_background_press", "studiolight_positive_background_press" -> "#ff3889b5"
                    
                    "adanalyticslight_positive_decorative_subdued", "advertisingdark_positive_decorative_subdued", "advertisinglight_positive_decorative_subdued", "anchorlight_positive_decorative_subdued", "creatordark_positive_decorative_subdued", "creatorlight_positive_decorative_subdued", "dark_brightaccent_decorative_subdued", "dark_positive_decorative_subdued", "light_brightaccent_decorative_subdued", "light_positive_decorative_subdued", "megaphonelight_positive_decorative_subdued", "overtimedark_positive_decorative_subdued", "quicksilverlight_positive_decorative_subdued", "s4pdark_positive_decorative_subdued", "s4plight_positive_decorative_subdued", "spotifybrandalternate_decorative_subdued", "studiolight_positive_decorative_subdued" -> "#ff41a0d3"
                    
                    "call_notification_answer_color" -> "#ff296887"
                    
                    "carColorGreen" -> "#ff6a8da0"
                    
                    "citric_background_base" -> "#ff286347"
                    
                    "citric_decorative_subdued" -> "#ff46997d"
                    
                    "dark_invertedlight_essential_brightaccent", "light_invertedlight_essential_brightaccent" -> "#ff3583ad"
                    
                    "dark_invertedlight_text_brightaccent", "light_invertedlight_text_brightaccent" -> "#ff2e7296"
                    
                    "default_endless_dj_button_icon", "electric_seafoam", "electric_seafoam_167", "encore_face_background_electric_seafoam", "fluorescent_green_blue_167", "overtimedark_base_essential_brightaccent", "overtimedark_base_text_brightaccent", "overtimedark_brightaccent_background_base", "overtimedark_inverteddark_essential_brightaccent", "overtimedark_inverteddark_text_brightaccent", "overtimedark_mutedaccent_essential_brightaccent", "overtimedark_mutedaccent_text_brightaccent" -> "#ff44cde1"
                    
                    "episodeshortcutcardhome_progress_bar_highlight", "green", "home_green_highlight" -> "#ff41a2d3"
                    
                    "fluorescent_green_176", "neon_green", "neon_green_176" -> "#ff4bd1dd"
                    
                    "green_100" -> "#ff4bd1dd"
                    
                    "green_135" -> "#ff3d96c6"
                    
                    "green_180" -> "#ff96c6e0"
                    
                    "green_25" -> "#ff1a4156"
                    
                    "green_55" -> "#ff375768"
                    
                    "green_75" -> "#ff456372"
                    
                    "green_desat_100" -> "#ff3c8fbc"
                    
                    "green_desat_135" -> "#ff3c92c1"
                    
                    "green_desat_155" -> "#ff59b1e0"
                    
                    "green_desat_185", "lime_green", "powder_green", "powder_green_185", "spotifybrand_2_alternate_essential_base", "spotifybrand_2_background_base" -> "#ff9dc8e0"
                    
                    "green_desat_25" -> "#ff13303f"
                    
                    "green_desat_55" -> "#ff3583ad"
                    
                    "green_desat_75" -> "#ff3a8fbc"
                    
                    "green_focus" -> "#ff3d96c6"
                    
                    "library_chip_wrapped_border_color_2" -> "#ff44d5ff"
                    
                    "neongreen_background_base" -> "#ff3088b5"
                    
                    "neongreen_decorative_subdued" -> "#ff318ab7"
                    
                    "overtimedark_brightaccent_background_highlight" -> "#ff60bfff"
                    
                    "overtimedark_brightaccent_background_press" -> "#ff3ba5db"
                    
                    "overtimedark_brightaccent_decorative_subdued" -> "#ff44bee1"
                    
                    "overtimedark_invertedlight_essential_brightaccent" -> "#ff388bb7"
                    
                    "overtimedark_invertedlight_text_brightaccent" -> "#ff3583ad"
                    
                    "spotifybrand_2_background_highlight" -> "#ff9dc8e0"
                    
                    "spotifybrand_2_background_press" -> "#ff3db1e2"
                    
                    "spotifybrand_2_decorative_subdued" -> "#ff87d1ff"

                    else -> continue
                }
            }
        }
    }
}
