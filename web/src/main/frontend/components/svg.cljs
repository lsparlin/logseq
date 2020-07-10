(ns frontend.components.svg
  (:require [rum.core :as rum]))

(rum/defc arrow-down
  []
  [:svg
   {:aria-hidden "true",
    :height "16",
    :width "10",
    :version "1.1",
    :view-box "0 0 10 16"
    :fill "currentColor"
    :display "inline-block"}
   [:path
    {:d "M5 11L0 6l1.5-1.5L5 8.25 8.5 4.5 10 6l-5 5z",
     :fill-rule "evenodd"}]])

(rum/defc arrow-right
  []
  [:svg
   {:aria-hidden "true",
    :height "16",
    :width "10",
    :version "1.1",
    :view-box "0 0 10 16"
    :fill "currentColor"
    :display "inline-block"}
   [:path
    {:d "M7.5 8l-5 5L1 11.5 4.75 8 1 4.5 2.5 3l5 5z",
     :fill-rule "evenodd"}]])

(rum/defc big-arrow-right
  []
  [:svg
   {:fill "none", :view-box "0 0 24 24", :height "24", :width "24"}
   [:path
    {:stroke-linejoin "round",
     :stroke-linecap "round",
     :stroke-width "2",
     :stroke "currentColor",
     :d "M14 5L21 12M21 12L14 19M21 12L3 12"}]])

(rum/defc big-arrow-left
  []
  [:svg
   {:fill "none", :view-box "0 0 24 24", :height "24", :width "24"}
   [:path
    {:stroke-linejoin "round",
     :stroke-linecap "round",
     :stroke-width "2",
     :stroke "currentColor",
     :d "M10 19L3 12M3 12L10 5M3 12L21 12"}]])

(defn- hero-icon
  ([d]
   (hero-icon d {}))
  ([d options]
   [:svg (merge {:fill "currentColor", :view-box "0 0 24 24", :height "24", :width "24"}
                options)
    [:path
     {:stroke-linejoin "round"
      :stroke-linecap "round"
      :stroke-width "2"
      :stroke "currentColor"
      :d d}]]))

(def close (hero-icon "M6 18L18 6M6 6L18 18"))
(def plus (hero-icon "M12 4v16m8-8H4"))
(def folder (hero-icon "M3 7v10a2 2 0 002 2h14a2 2 0 002-2V9a2 2 0 00-2-2h-6l-2-2H5a2 2 0 00-2 2z"))
(defn vertical-dots
  [options]
  (hero-icon "M12 5v.01M12 12v.01M12 19v.01M12 6a1 1 0 110-2 1 1 0 010 2zm0 7a1 1 0 110-2 1 1 0 010 2zm0 7a1 1 0 110-2 1 1 0 010 2z" options))

(def save
  [:svg
   {:fill "currentColor", :view-box "0 0 448 512", :height "24", :width "24"}
   [:path
    {:stroke-linejoin "round"
     :stroke-linecap "round"
     :stroke-width "2"
     :stroke "currentColor"
     :d "M433.941 129.941l-83.882-83.882A48 48 0 0 0 316.118 32H48C21.49 32 0 53.49 0 80v352c0 26.51 21.49 48 48 48h352c26.51 0 48-21.49 48-48V163.882a48 48 0 0 0-14.059-33.941zM224 416c-35.346 0-64-28.654-64-64 0-35.346 28.654-64 64-64s64 28.654 64 64c0 35.346-28.654 64-64 64zm96-304.52V212c0 6.627-5.373 12-12 12H76c-6.627 0-12-5.373-12-12V108c0-6.627 5.373-12 12-12h228.52c3.183 0 6.235 1.264 8.485 3.515l3.48 3.48A11.996 11.996 0 0 1 320 111.48z"}]])

(rum/defc note
  []
  [:svg.h-8.w-8.svg-shadow.note
   {:view-box "0 0 512 512"
    :fill "currentColor"}
   [:path
    {:d
     "M256 8C119.043 8 8 119.083 8 256c0 136.997 111.043 248 248 248s248-111.003 248-248C504 119.083 392.957 8 256 8zm0 110c23.196 0 42 18.804 42 42s-18.804 42-42 42-42-18.804-42-42 18.804-42 42-42zm56 254c0 6.627-5.373 12-12 12h-88c-6.627 0-12-5.373-12-12v-24c0-6.627 5.373-12 12-12h12v-64h-12c-6.627 0-12-5.373-12-12v-24c0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12v100h12c6.627 0 12 5.373 12 12v24z"}]])

(rum/defc tip
  []
  [:svg.h-8.w-8.tip-shadow.tip
   {:view-box "0 0 352 512"
    :fill "currentColor"}
   [:path
    {:d
     "M96.06 454.35c.01 6.29 1.87 12.45 5.36 17.69l17.09 25.69a31.99 31.99 0 0 0 26.64 14.28h61.71a31.99 31.99 0 0 0 26.64-14.28l17.09-25.69a31.989 31.989 0 0 0 5.36-17.69l.04-38.35H96.01l.05 38.35zM0 176c0 44.37 16.45 84.85 43.56 115.78 16.52 18.85 42.36 58.23 52.21 91.45.04.26.07.52.11.78h160.24c.04-.26.07-.51.11-.78 9.85-33.22 35.69-72.6 52.21-91.45C335.55 260.85 352 220.37 352 176 352 78.61 272.91-.3 175.45 0 73.44.31 0 82.97 0 176zm176-80c-44.11 0-80 35.89-80 80 0 8.84-7.16 16-16 16s-16-7.16-16-16c0-61.76 50.24-112 112-112 8.84 0 16 7.16 16 16s-7.16 16-16 16z"}]])

(rum/defc important
  []
  [:svg.h-8.w-8.svg-shadow.important
   {:view-box "0 0 512 512"
    :fill "currentColor"
    :color "#bf0000"}
   [:path
    {:d
     "M504 256c0 136.997-111.043 248-248 248S8 392.997 8 256C8 119.083 119.043 8 256 8s248 111.083 248 248zm-248 50c-25.405 0-46 20.595-46 46s20.595 46 46 46 46-20.595 46-46-20.595-46-46-46zm-43.673-165.346l7.418 136c.347 6.364 5.609 11.346 11.982 11.346h48.546c6.373 0 11.635-4.982 11.982-11.346l7.418-136c.375-6.874-5.098-12.654-11.982-12.654h-63.383c-6.884 0-12.356 5.78-11.981 12.654z"}]])

(rum/defc caution
  []
  [:svg.h-8.w-8.svg-shadow.caution
   {:view-box "0 0 384 512"
    :fill "currentColor"
    :color "#bf3400"}
   [:path
    {:d
     "M216 23.86c0-23.8-30.65-32.77-44.15-13.04C48 191.85 224 200 224 288c0 35.63-29.11 64.46-64.85 63.99-35.17-.45-63.15-29.77-63.15-64.94v-85.51c0-21.7-26.47-32.23-41.43-16.5C27.8 213.16 0 261.33 0 320c0 105.87 86.13 192 192 192s192-86.13 192-192c0-170.29-168-193-168-296.14z"}]])

(rum/defc warning
  []
  [:svg.h-8.w-8.svg-shadow.warning
   {:view-box "0 0 576 512"
    :fill "currentColor"
    :color "#bf6900"}
   [:path
    {:d
     "M569.517 440.013C587.975 472.007 564.806 512 527.94 512H48.054c-36.937 0-59.999-40.055-41.577-71.987L246.423 23.985c18.467-32.009 64.72-31.951 83.154 0l239.94 416.028zM288 354c-25.405 0-46 20.595-46 46s20.595 46 46 46 46-20.595 46-46-20.595-46-46-46zm-43.673-165.346l7.418 136c.347 6.364 5.609 11.346 11.982 11.346h48.546c6.373 0 11.635-4.982 11.982-11.346l7.418-136c.375-6.874-5.098-12.654-11.982-12.654h-63.383c-6.884 0-12.356 5.78-11.981 12.654z"}]])

(rum/defc caret-down
  []
  [:svg.h-4.w-4
   {:aria-hidden "true",
    :height "12",
    :width "10",
    :version "1.1",
    :view-box "0 0 192 512"
    :fill "currentColor"
    :display "inline-block"
    :style {
            :margin-left -3
            :margin-top -1}}
   [:path
    {:d "M31.3 192h257.3c17.8 0 26.7 21.5 14.1 34.1L174.1 354.8c-7.8 7.8-20.5 7.8-28.3 0L17.2 226.1C4.6 213.5 13.5 192 31.3 192z",
     :fill-rule "evenodd"}]])

(rum/defc caret-right
  []
  [:svg.h-4.w-4
   {:aria-hidden "true",
    :height "12",
    :width "10",
    :version "1.1",
    :view-box "0 0 192 512"
    :fill "currentColor"
    :display "inline-block"
    :style {:margin-top -1}}
   [:path
    {:d "M0 384.662V127.338c0-17.818 21.543-26.741 34.142-14.142l128.662 128.662c7.81 7.81 7.81 20.474 0 28.284L34.142 398.804C21.543 411.404 0 402.48 0 384.662z",
     :fill-rule "evenodd"}]])

(rum/defc star-outline
  [class]
  [:svg
   {:fill "none", :view-box "0 0 24 24", :height "24", :width "24"
    :class class}
   [:path
    {:stroke-width 2
     :stroke "currentColor",
     :d
     "M11.0489 2.92707C11.3483 2.00576 12.6517 2.00576 12.9511 2.92707L14.4697 7.60083C14.6035 8.01285 14.9875 8.29181 15.4207 8.29181H20.335C21.3037 8.29181 21.7065 9.53143 20.9228 10.1008L16.947 12.9894C16.5965 13.244 16.4499 13.6954 16.5838 14.1074L18.1024 18.7812C18.4017 19.7025 17.3472 20.4686 16.5635 19.8992L12.5878 17.0107C12.2373 16.756 11.7627 16.756 11.4122 17.0107L7.43647 19.8992C6.65276 20.4686 5.59828 19.7025 5.89763 18.7812L7.41623 14.1074C7.5501 13.6954 7.40344 13.244 7.05296 12.9894L3.07722 10.1008C2.2935 9.53143 2.69628 8.29181 3.665 8.29181H8.57929C9.01251 8.29181 9.39647 8.01285 9.53034 7.60083L11.0489 2.92707Z"}]])

(rum/defc star-solid
  [class]
  [:svg
   {:fill "none", :view-box "0 0 20 20", :height "20", :width "20"
    :class class}
   [:path
    {:fill "currentColor",
     :d
     "M9.04893 2.92707C9.34828 2.00576 10.6517 2.00576 10.951 2.92707L12.0206 6.21886C12.1545 6.63089 12.5384 6.90985 12.9717 6.90985H16.4329C17.4016 6.90985 17.8044 8.14946 17.0207 8.71886L14.2205 10.7533C13.87 11.0079 13.7233 11.4593 13.8572 11.8713L14.9268 15.1631C15.2261 16.0844 14.1717 16.8506 13.3879 16.2812L10.5878 14.2467C10.2373 13.9921 9.76269 13.9921 9.4122 14.2467L6.61203 16.2812C5.82832 16.8506 4.77384 16.0844 5.07319 15.1631L6.14276 11.8713C6.27663 11.4593 6.12997 11.0079 5.77949 10.7533L2.97932 8.71886C2.1956 8.14946 2.59838 6.90985 3.5671 6.90985H7.0283C7.46153 6.90985 7.84548 6.63089 7.97936 6.21886L9.04893 2.92707Z"
     :stroke-width "1"}]]
  )

(rum/defc menu
  [class]
  [:svg
   {:fill "none", :view-box "0 0 20 20", :height "20", :width "20"
    :class class}
   [:path
    {:fill "currentColor",
     :d
     "M3 5C3 4.44772 3.44772 4 4 4H16C16.5523 4 17 4.44772 17 5C17 5.55228 16.5523 6 16 6H4C3.44772 6 3 5.55228 3 5Z",
     :clip-rule "evenodd",
     :fill-rule "evenodd"}]
   [:path
    {:fill "currentColor"
     :d
     "M3 10C3 9.44772 3.44772 9 4 9H16C16.5523 9 17 9.44772 17 10C17 10.5523 16.5523 11 16 11H4C3.44772 11 3 10.5523 3 10Z",
     :clip-rule "evenodd",
     :fill-rule "evenodd"}]
   [:path
    {:fill "currentColor",
     :d
     "M3 15C3 14.4477 3.44772 14 4 14H16C16.5523 14 17 14.4477 17 15C17 15.5523 16.5523 16 16 16H4C3.44772 16 3 15.5523 3 15Z",
     :clip-rule "evenodd",
     :fill-rule "evenodd"}]])

(defn excalidraw-logo
  []
  [:svg
   {:preserve-aspect-ratio "xMidYMid meet",
    :view-box "0 0 109.000000 269.000000",
    :height 24,
    :width 24,
    :version "1.0"
    :style {:display "inline"}}
   [:g
    {:stroke "none",
     :fill "currentColor",
     :transform
     "translate(0.000000,269.000000) scale(0.100000,-0.100000)"}
    [:path
     {:d
      "M393 2643 c-74 -59 -188 -159 -278 -245 l-71 -67 13 -88 c7 -48 20 -142 28 -208 9 -66 18 -128 21 -137 4 -12 0 -18 -11 -18 -19 0 -20 5 32 -160 19 -63 37 -121 39 -127 2 -7 10 -10 19 -7 9 4 14 12 11 19 -3 8 2 16 10 19 11 4 10 12 -7 41 -27 45 -96 429 -100 553 -3 88 -3 89 34 139 36 49 119 123 247 217 36 27 72 57 82 67 15 18 22 13 148 -121 73 -77 154 -156 180 -176 l48 -36 -37 -78 c-20 -42 -101 -204 -181 -358 -167 -324 -133 -293 -327 -296 l-126 -1 -42 -48 c-44 -51 -50 -70 -29 -102 8 -11 14 -29 14 -40 0 -18 7 -21 47 -23 25 -1 48 -4 51 -7 3 -3 7 -65 10 -138 l4 -132 -67 -144 c-111 -240 -155 -350 -155 -386 0 -19 4 -35 8 -35 10 0 10 1 417 850 189 394 368 765 398 826 30 61 57 117 59 125 2 9 -67 78 -177 175 -99 88 -186 168 -194 177 -23 28 -57 19 -118 -30z m34 -1150 c-46 -89 -48 -90 -174 -96 -111 -6 -113 -5 -113 16 0 12 -4 28 -9 36 -6 9 -2 25 12 47 l22 34 100 0 c55 1 118 5 140 9 22 4 41 6 43 5 2 -1 -8 -24 -21 -51z m-84 -160 c-8 -21 -29 -65 -46 -98 -28 -56 -31 -58 -38 -35 -4 14 -7 55 -8 92 -1 73 -3 72 81 77 l27 1 -16 -37z"}]
    [:path
     {:d
      "M423 2405 c-18 -13 -23 -26 -23 -59 0 -39 3 -45 30 -56 27 -11 34 -10 65 11 41 28 42 35 12 80 -26 39 -52 46 -84 24z m57 -36 c16 -28 6 -49 -24 -49 -27 0 -39 27 -24 54 12 22 35 20 48 -5z"}]
    [:path
     {:d
      "M1050 2180 c0 -5 -6 -10 -13 -10 -6 0 -23 -28 -36 -62 -40 -104 -440 -895 -441 -870 0 13 -6 22 -16 22 -14 0 -16 -8 -10 -47 6 -45 2 -55 -140 -331 -80 -157 -166 -321 -191 -365 -26 -46 -46 -96 -48 -117 -3 -36 1 -41 88 -116 50 -44 114 -99 142 -124 126 -115 185 -161 201 -158 24 4 395 393 396 415 0 10 -18 162 -40 338 -38 300 -74 651 -70 685 3 21 -12 127 -23 173 -9 36 -5 51 67 215 42 97 97 216 121 264 23 48 43 90 43 93 0 3 -7 5 -15 5 -8 0 -15 -4 -15 -10z m-230 -747 c11 -70 33 -238 49 -373 31 -248 67 -523 77 -593 6 -35 2 -42 -63 -114 -113 -127 -233 -252 -274 -284 l-38 -30 -195 182 c-180 166 -195 183 -184 203 6 11 57 104 113 206 56 102 130 238 164 302 35 65 67 121 73 124 7 4 9 -97 7 -312 -4 -321 -3 -322 29 -315 4 0 7 162 7 359 l0 358 105 210 c58 116 106 209 108 208 2 -1 12 -60 22 -131z"}]]]
  )

(rum/defc logo
  []
  [:svg
   {:fill "none", :view-box "0 0 24 24", :height "24", :width "24"}
   [:path
    {:fill "currentColor",
     :d
     "M2.15592 19.2498C1.36836 19.0534 0.949256 17.9725 1.21983 16.8356C1.49041 15.6987 2.3482 14.9362 3.13576 15.1326C3.92332 15.329 4.34242 16.4099 4.07185 17.5468C3.80127 18.6838 2.94348 19.4462 2.15592 19.2498Z"}]
   [:path
    {:fill "currentColor",
     :d
     "M11.4134 21.9396C11.3864 22.7539 10.2246 23.3745 8.81844 23.3256C7.41231 23.2768 6.2943 22.577 6.32131 21.7627C6.34831 20.9484 7.51009 20.3278 8.91622 20.3767C10.3223 20.4256 11.4404 21.1253 11.4134 21.9396Z"}]
   [:path
    {:fill "currentColor",
     :d
     "M3.60601 11.5688C4.1496 11.9697 4.09019 13.0052 3.4733 13.8817C2.85641 14.7581 1.91565 15.1436 1.37205 14.7427C0.828456 14.3417 0.88787 13.3062 1.50476 12.4298C2.12165 11.5533 3.06241 11.1678 3.60601 11.5688Z"}]
   [:path
    {:fill "currentColor",
     :d
     "M5.80617 22.2547C5.49718 23.4297 3.95914 24.1864 2.37085 23.9448C0.782563 23.7033 -0.254521 22.555 0.054461 21.3801C0.363443 20.2051 1.90148 19.4484 3.48977 19.69C5.07806 19.9315 6.11515 21.0798 5.80617 22.2547Z"}]
   [:path
    {:fill "currentColor",
     :d
     "M2.22629 11.1687C0.946374 11.0033 -0.0174028 9.64953 0.0736304 8.14495C0.164664 6.64037 1.27603 5.55475 2.55595 5.72016C3.83586 5.88556 4.79963 7.23935 4.7086 8.74393C4.61757 10.2485 3.5062 11.3341 2.22629 11.1687Z"}]
   [:path
    {:fill "currentColor",
     :d
     "M17.6471 22.265C17.3381 23.4399 15.8001 24.1966 14.2118 23.9551C12.6235 23.7136 11.5864 22.5653 11.8954 21.3903C12.2044 20.2154 13.7424 19.4587 15.3307 19.7002C16.919 19.9417 17.9561 21.09 17.6471 22.265Z"}]
   [:path
    {:fill "currentColor",
     :d
     "M8.45435 13.5463C7.66679 13.3499 7.24769 12.269 7.51827 11.1321C7.78884 9.99515 8.64663 9.23269 9.43419 9.4291C10.2218 9.62551 10.6409 10.7064 10.3703 11.8433C10.0997 12.9803 9.24192 13.7427 8.45435 13.5463Z"}]
   [:path
    {:fill "currentColor",
     :d
     "M17.7118 16.2361C17.6848 17.0504 16.523 17.671 15.1169 17.6221C13.7107 17.5732 12.5927 16.8735 12.6197 16.0592C12.6467 15.2449 13.8085 14.6243 15.2147 14.6732C16.6208 14.722 17.7388 15.4218 17.7118 16.2361Z"}]
   [:path
    {:fill "currentColor",
     :d
     "M9.90444 5.86526C10.448 6.2662 10.3886 7.30173 9.77174 8.17818C9.15485 9.05463 8.21409 9.44011 7.67049 9.03917C7.12689 8.63823 7.1863 7.6027 7.80319 6.72625C8.42008 5.8498 9.36084 5.46432 9.90444 5.86526Z"}]
   [:path
    {:fill "currentColor",
     :d
     "M12.1046 16.5512C11.7956 17.7262 10.2576 18.4829 8.66929 18.2413C7.081 17.9998 6.04391 16.8515 6.3529 15.6766C6.66188 14.5016 8.19992 13.7449 9.78821 13.9865C11.3765 14.228 12.4136 15.3763 12.1046 16.5512Z"}]
   [:path
    {:fill "currentColor",
     :d
     "M8.52472 5.46522C7.24481 5.29981 6.28103 3.94603 6.37206 2.44145C6.4631 0.936865 7.57447 -0.148753 8.85438 0.0166502C10.1343 0.182053 11.0981 1.53584 11.007 3.04042C10.916 4.545 9.80463 5.63062 8.52472 5.46522Z"}]
   [:path
    {:fill "currentColor",
     :d
     "M23.9455 16.5615C23.6366 17.7364 22.0985 18.4931 20.5102 18.2516C18.9219 18.01 17.8849 16.8618 18.1938 15.6868C18.5028 14.5119 20.0409 13.7552 21.6291 13.9967C23.2174 14.2382 24.2545 15.3865 23.9455 16.5615Z"}]]
  )

(def discord
  [:svg
   {:view-box "0 0 448 512",
    :preserve-aspect-ratio "xMidYMid meet",
    :style
    {"msTransform" "rotate(360deg)"
     "WebkitTransform" "rotate(360deg)"
     "transform" "rotate(360deg)"}
    :height "1em",
    :width "0.88em",
    :focusable "false",
    :aria-hidden "true"
    :fill "currentColor"}
   [:path
    {:d
     "M297.216 243.2c0 15.616-11.52 28.416-26.112 28.416c-14.336 0-26.112-12.8-26.112-28.416s11.52-28.416 26.112-28.416c14.592 0 26.112 12.8 26.112 28.416zm-119.552-28.416c-14.592 0-26.112 12.8-26.112 28.416s11.776 28.416 26.112 28.416c14.592 0 26.112-12.8 26.112-28.416c.256-15.616-11.52-28.416-26.112-28.416zM448 52.736V512c-64.494-56.994-43.868-38.128-118.784-107.776l13.568 47.36H52.48C23.552 451.584 0 428.032 0 398.848V52.736C0 23.552 23.552 0 52.48 0h343.04C424.448 0 448 23.552 448 52.736zm-72.96 242.688c0-82.432-36.864-149.248-36.864-149.248c-36.864-27.648-71.936-26.88-71.936-26.88l-3.584 4.096c43.52 13.312 63.744 32.512 63.744 32.512c-60.811-33.329-132.244-33.335-191.232-7.424c-9.472 4.352-15.104 7.424-15.104 7.424s21.248-20.224 67.328-33.536l-2.56-3.072s-35.072-.768-71.936 26.88c0 0-36.864 66.816-36.864 149.248c0 0 21.504 37.12 78.08 38.912c0 0 9.472-11.52 17.152-21.248c-32.512-9.728-44.8-30.208-44.8-30.208c3.766 2.636 9.976 6.053 10.496 6.4c43.21 24.198 104.588 32.126 159.744 8.96c8.96-3.328 18.944-8.192 29.44-15.104c0 0-12.8 20.992-46.336 30.464c7.68 9.728 16.896 20.736 16.896 20.736c56.576-1.792 78.336-38.912 78.336-38.912z"}]]
  )

(def slideshow
  [:svg.h-6.w-6
   {:view-box "0 0 24 24"
    :fill "currentColor"
    :display "inline-block"}
   [:path
    {:d "M10 8v8l5-4-5-4zm9-5H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14z"}]])
